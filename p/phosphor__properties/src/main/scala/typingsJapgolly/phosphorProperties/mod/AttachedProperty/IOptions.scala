package typingsJapgolly.phosphorProperties.mod.AttachedProperty

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options object used to initialize an attached property.
  */
trait IOptions[T, U] extends js.Object {
  /**
    * A function called when the property value has changed.
    *
    * #### Notes
    * This will be invoked when the property value is changed and the
    * comparator indicates that the old value is not equal to the new
    * value.
    *
    * This will **not** be called for the initial default value.
    */
  var changed: js.UndefOr[js.Function3[/* owner */ T, /* oldValue */ U, /* newValue */ U, Unit]] = js.undefined
  /**
    * A function used to coerce a supplied value into the final value.
    *
    * #### Notes
    * This will be called whenever the property value is changed, or
    * when the property is explicitly coerced. The return value will
    * be used as the final value of the property.
    *
    * This will **not** be called for the initial default value.
    */
  var coerce: js.UndefOr[js.Function2[/* owner */ T, /* value */ U, U]] = js.undefined
  /**
    * A function used to compare two values for equality.
    *
    * #### Notes
    * This is called to determine if the property value has changed.
    * It should return `true` if the given values are equivalent, or
    * `false` if they are different.
    *
    * If this is not provided, it defaults to the `===` operator.
    */
  var compare: js.UndefOr[js.Function2[/* oldValue */ U, /* newValue */ U, Boolean]] = js.undefined
  /**
    * The human readable name for the property.
    *
    * #### Notes
    * By convention, this should be the same as the name used to define
    * the public accessor for the property value.
    *
    * This **does not** have an effect on the property lookup behavior.
    * Multiple properties may share the same name without conflict.
    */
  var name: String
  /**
    * A factory function used to create the default property value.
    *
    * #### Notes
    * This will be called whenever the property value is required,
    * but has not yet been set for a given owner.
    */
  def create(owner: T): U
}

object IOptions {
  @scala.inline
  def apply[T, U](
    create: T => CallbackTo[U],
    name: String,
    changed: (/* owner */ T, /* oldValue */ U, /* newValue */ U) => Callback = null,
    coerce: (/* owner */ T, /* value */ U) => CallbackTo[U] = null,
    compare: (/* oldValue */ U, /* newValue */ U) => CallbackTo[Boolean] = null
  ): IOptions[T, U] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: T) => create(t0).runNow()))
    if (changed != null) __obj.updateDynamic("changed")(js.Any.fromFunction3((t0: /* owner */ T, t1: /* oldValue */ U, t2: /* newValue */ U) => changed(t0, t1, t2).runNow()))
    if (coerce != null) __obj.updateDynamic("coerce")(js.Any.fromFunction2((t0: /* owner */ T, t1: /* value */ U) => coerce(t0, t1).runNow()))
    if (compare != null) __obj.updateDynamic("compare")(js.Any.fromFunction2((t0: /* oldValue */ U, t1: /* newValue */ U) => compare(t0, t1).runNow()))
    __obj.asInstanceOf[IOptions[T, U]]
  }
}

