package typingsJapgolly.rxjs.rxMod

import org.scalajs.dom.raw.XMLHttpRequest
import typingsJapgolly.rxjs.ajaxObservableMod.AjaxRequest
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/Rx", "AjaxResponse")
@js.native
class AjaxResponse protected ()
  extends typingsJapgolly.rxjs.ajaxObservableMod.AjaxResponse {
  def this(originalEvent: Event_, xhr: XMLHttpRequest, request: AjaxRequest) = this()
}

