package typingsJapgolly.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFViewerDplProcessing extends js.Object {
  var download: js.UndefOr[PDFViewerDplProcessingDownload] = js.undefined
  var loadOnDemand: js.UndefOr[Boolean] = js.undefined
  var read: js.UndefOr[PDFViewerDplProcessingRead] = js.undefined
  var upload: js.UndefOr[PDFViewerDplProcessingUpload] = js.undefined
}

object PDFViewerDplProcessing {
  @scala.inline
  def apply(
    download: PDFViewerDplProcessingDownload = null,
    loadOnDemand: js.UndefOr[Boolean] = js.undefined,
    read: PDFViewerDplProcessingRead = null,
    upload: PDFViewerDplProcessingUpload = null
  ): PDFViewerDplProcessing = {
    val __obj = js.Dynamic.literal()
    if (download != null) __obj.updateDynamic("download")(download.asInstanceOf[js.Any])
    if (!js.isUndefined(loadOnDemand)) __obj.updateDynamic("loadOnDemand")(loadOnDemand.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    if (upload != null) __obj.updateDynamic("upload")(upload.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFViewerDplProcessing]
  }
}

