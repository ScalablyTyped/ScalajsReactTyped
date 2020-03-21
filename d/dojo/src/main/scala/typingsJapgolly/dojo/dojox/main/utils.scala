package typingsJapgolly.dojo.dojox.main

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/main.utils.html
  *
  *
  */
trait utils extends js.Object {
  /**
    * Coerces one object to the type of another.
    *
    * @param target object, which typeof result is used to coerce "source" object.
    * @param source object, which will be forced to change type.
    */
  def coerceType(target: js.Object, source: js.Object): js.Any
  /**
    * Merge two objects structurally, mixin properties will override object's properties.
    *
    * @param object original object.
    * @param mixin additional object, which properties will override object's properties.
    */
  def merge(`object`: js.Object, mixin: js.Object): js.Any
  /**
    * Updates an existing object in place with properties from an "source" object.
    *
    * @param target the "target" object to be updated
    * @param source the "source" object, whose properties will be used to source the existed object.
    * @param conv               Optionalforce conversion to the original type
    */
  def updateWithObject(target: js.Object, source: js.Object, conv: Boolean): js.Object
  /**
    * Updates an existing object in place with properties from an "source" object.
    *
    * @param target the "target" object to be updated
    * @param source the "source" object, whose properties will be used to source the existed object.
    * @param pattern object, whose properties will be used to pull values from the "source"
    * @param conv               Optionalforce conversion to the original type
    */
  def updateWithPattern(target: js.Object, source: js.Object, pattern: js.Object, conv: Boolean): js.Object
}

object utils {
  @scala.inline
  def apply(
    coerceType: (js.Object, js.Object) => CallbackTo[js.Any],
    merge: (js.Object, js.Object) => CallbackTo[js.Any],
    updateWithObject: (js.Object, js.Object, Boolean) => CallbackTo[js.Object],
    updateWithPattern: (js.Object, js.Object, js.Object, Boolean) => CallbackTo[js.Object]
  ): utils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("coerceType")(js.Any.fromFunction2((t0: js.Object, t1: js.Object) => coerceType(t0, t1).runNow()))
    __obj.updateDynamic("merge")(js.Any.fromFunction2((t0: js.Object, t1: js.Object) => merge(t0, t1).runNow()))
    __obj.updateDynamic("updateWithObject")(js.Any.fromFunction3((t0: js.Object, t1: js.Object, t2: scala.Boolean) => updateWithObject(t0, t1, t2).runNow()))
    __obj.updateDynamic("updateWithPattern")(js.Any.fromFunction4((t0: js.Object, t1: js.Object, t2: js.Object, t3: scala.Boolean) => updateWithPattern(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[utils]
  }
}

