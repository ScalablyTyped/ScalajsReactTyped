package typingsJapgolly.mustache.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a rendering context by wrapping a view object and maintaining a reference to the parent context.
  */
trait MustacheContext extends js.Object {
  var parentContext: js.UndefOr[MustacheContext] = js.undefined
  var view: js.Any
  /**
    * Returns the value of the given name in this context, traversing up the context hierarchy if the value is absent in this context's view.
    *
    * @param name
    * The name to look up.
    */
  def lookup(name: String): js.Any
  /**
    * Creates a new context using the given view with this context as the parent.
    *
    * @param view
    * The view to create the new context with.
    */
  def push(view: js.Any): MustacheContext
}

object MustacheContext {
  @scala.inline
  def apply(
    lookup: String => CallbackTo[js.Any],
    push: js.Any => CallbackTo[MustacheContext],
    view: js.Any,
    parentContext: MustacheContext = null
  ): MustacheContext = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
    __obj.updateDynamic("lookup")(js.Any.fromFunction1((t0: java.lang.String) => lookup(t0).runNow()))
    __obj.updateDynamic("push")(js.Any.fromFunction1((t0: js.Any) => push(t0).runNow()))
    if (parentContext != null) __obj.updateDynamic("parentContext")(parentContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[MustacheContext]
  }
}

