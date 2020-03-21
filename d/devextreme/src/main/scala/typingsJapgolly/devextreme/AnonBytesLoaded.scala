package typingsJapgolly.devextreme

import org.scalajs.dom.raw.File
import org.scalajs.dom.raw.XMLHttpRequest
import typingsJapgolly.devextreme.mod.DevExpress.core.dxElement
import typingsJapgolly.devextreme.mod.DevExpress.event
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxFileUploader
import typingsJapgolly.devextreme.mod._Global_.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBytesLoaded extends js.Object {
  var bytesLoaded: js.UndefOr[Double] = js.undefined
  var bytesTotal: js.UndefOr[Double] = js.undefined
  var component: js.UndefOr[dxFileUploader] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var event: js.UndefOr[typingsJapgolly.devextreme.mod.DevExpress.event] = js.undefined
  var file: js.UndefOr[File] = js.undefined
  var jQueryEvent: js.UndefOr[JQueryEventObject] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var request: js.UndefOr[XMLHttpRequest] = js.undefined
  var segmentSize: js.UndefOr[Double] = js.undefined
}

object AnonBytesLoaded {
  @scala.inline
  def apply(
    bytesLoaded: Int | Double = null,
    bytesTotal: Int | Double = null,
    component: dxFileUploader = null,
    element: dxElement = null,
    event: event = null,
    file: File = null,
    jQueryEvent: JQueryEventObject = null,
    model: js.Any = null,
    request: XMLHttpRequest = null,
    segmentSize: Int | Double = null
  ): AnonBytesLoaded = {
    val __obj = js.Dynamic.literal()
    if (bytesLoaded != null) __obj.updateDynamic("bytesLoaded")(bytesLoaded.asInstanceOf[js.Any])
    if (bytesTotal != null) __obj.updateDynamic("bytesTotal")(bytesTotal.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (jQueryEvent != null) __obj.updateDynamic("jQueryEvent")(jQueryEvent.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (segmentSize != null) __obj.updateDynamic("segmentSize")(segmentSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBytesLoaded]
  }
}

