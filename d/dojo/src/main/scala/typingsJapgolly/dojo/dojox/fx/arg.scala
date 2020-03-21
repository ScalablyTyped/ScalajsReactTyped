package typingsJapgolly.dojo.dojox.fx

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.dojo.AnonCssClass
import typingsJapgolly.dojo.AnonX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/fx/_arg.html
  *
  *
  */
trait arg extends js.Object {
  /**
    * The odd way to document object parameters.
    *
    * @param args
    */
  def ShadowResizeArgs(args: js.Object): AnonX
  /**
    * The node and CSS class to use for style manipulations.
    *
    * @param args
    */
  def StyleArgs(args: js.Object): AnonCssClass
}

object arg {
  @scala.inline
  def apply(ShadowResizeArgs: js.Object => CallbackTo[AnonX], StyleArgs: js.Object => CallbackTo[AnonCssClass]): arg = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ShadowResizeArgs")(js.Any.fromFunction1((t0: js.Object) => ShadowResizeArgs(t0).runNow()))
    __obj.updateDynamic("StyleArgs")(js.Any.fromFunction1((t0: js.Object) => StyleArgs(t0).runNow()))
    __obj.asInstanceOf[arg]
  }
}

