package typingsJapgolly.rxjs.internalRxMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.XMLHttpRequest
import typingsJapgolly.rxjs.internalObservableDomAjaxObservableMod.AjaxRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/Rx", "AjaxResponse")
@js.native
class AjaxResponse protected ()
  extends typingsJapgolly.rxjs.internalObservableDomAjaxObservableMod.AjaxResponse {
  def this(originalEvent: Event, xhr: XMLHttpRequest, request: AjaxRequest) = this()
}

