package typingsJapgolly.aphrodite.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Utilities for using Aphrodite server-side.
  */
trait StyleSheetServerStatic extends js.Object {
  def renderStatic(renderFunc: js.Function0[String]): StaticRendererResult
}

object StyleSheetServerStatic {
  @scala.inline
  def apply(renderStatic: js.Function0[String] => CallbackTo[StaticRendererResult]): StyleSheetServerStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("renderStatic")(js.Any.fromFunction1((t0: js.Function0[java.lang.String]) => renderStatic(t0).runNow()))
    __obj.asInstanceOf[StyleSheetServerStatic]
  }
}

