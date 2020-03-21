package typingsJapgolly.angularCore.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostListener extends js.Object {
  /**
    * A set of arguments to pass to the handler method when the event occurs.
    */
  var args: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The DOM event to listen for.
    */
  var eventName: js.UndefOr[String] = js.undefined
}

@JSImport("@angular/core", "HostListener")
@js.native
object HostListener extends TopLevel[HostListenerDecorator]

