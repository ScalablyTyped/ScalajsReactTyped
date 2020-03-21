package typingsJapgolly.rxjs.internalCompatibilityMod

import org.scalajs.dom.raw.XMLHttpRequest
import typingsJapgolly.rxjs.ajaxObservableMod.AjaxRequest
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "AjaxResponse")
@js.native
class AjaxResponse protected ()
  extends typingsJapgolly.rxjs.ajaxObservableMod.AjaxResponse {
  def this(originalEvent: Event_, xhr: XMLHttpRequest, request: AjaxRequest) = this()
}

