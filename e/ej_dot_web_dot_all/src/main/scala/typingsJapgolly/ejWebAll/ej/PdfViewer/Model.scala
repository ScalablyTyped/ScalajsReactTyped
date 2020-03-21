package typingsJapgolly.ejWebAll.ej.PdfViewer

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggers after the printing is completed.
    */
  var afterPrint: js.UndefOr[js.Function1[/* e */ AfterPrintEventArgs, Unit]] = js.undefined
  /** Triggers when the AJAX request is failed.
    */
  var ajaxRequestFailure: js.UndefOr[js.Function1[/* e */ AjaxRequestFailureEventArgs, Unit]] = js.undefined
  /** Triggers when the ajax request is Success.
    */
  var ajaxRequestSuccess: js.UndefOr[js.Function1[/* e */ AjaxRequestSuccessEventArgs, Unit]] = js.undefined
  /** Enables or disables the buffering of the PDF pages in the client side.
    */
  var allowClientBuffering: js.UndefOr[Boolean] = js.undefined
  /** Triggers when an annotation is added over the page of the PDF document.
    */
  var annotationAdd: js.UndefOr[js.Function1[/* e */ AnnotationAddEventArgs, Unit]] = js.undefined
  /** Enables/disables the annotation context menu.
    */
  var annotationContextMenu: js.UndefOr[AnnotationContextMenu] = js.undefined
  /** Triggers when the property of the annotation is changed in the page of the PDF document.
    */
  var annotationPropertiesChange: js.UndefOr[js.Function1[/* e */ AnnotationPropertiesChangeEventArgs, Unit]] = js.undefined
  /** Triggers when an annotation is removed from the page of the PDF document.
    */
  var annotationRemove: js.UndefOr[js.Function1[/* e */ AnnotationRemoveEventArgs, Unit]] = js.undefined
  /** Specifies the type of the annotations.
    */
  var annotationType: js.UndefOr[AnnotationType | String] = js.undefined
  /** Triggers before the printing starts.
    */
  var beforePrint: js.UndefOr[js.Function1[/* e */ BeforePrintEventArgs, Unit]] = js.undefined
  /** Triggers when the client buffering process ends.
    */
  var bufferEnd: js.UndefOr[js.Function1[/* e */ BufferEndEventArgs, Unit]] = js.undefined
  /** Triggers when the client buffering process starts.
    */
  var bufferStart: js.UndefOr[js.Function1[/* e */ BufferStartEventArgs, Unit]] = js.undefined
  /** Gets or sets the buffering mode of the PDF viewer control when allowClientBuffering is set to true.
    */
  var bufferingMode: js.UndefOr[BufferingMode | String] = js.undefined
  /** Gets the number of the page being displayed in the PDF viewer.
    */
  var currentPageNumber: js.UndefOr[Double] = js.undefined
  /** Triggers when PDF viewer control is destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
  /** Triggers when the PDF document gets loaded and is ready to view in the Control.
    */
  var documentLoad: js.UndefOr[js.Function1[/* e */ DocumentLoadEventArgs, Unit]] = js.undefined
  /** Sets the PDF document path for initial loading.
    */
  var documentPath: js.UndefOr[String] = js.undefined
  /** Triggers when the PDF document gets unloaded from the PDF viewer.
    */
  var documentUnload: js.UndefOr[js.Function1[/* e */ DocumentUnloadEventArgs, Unit]] = js.undefined
  /** Triggers when the download is completed or aborted.
    */
  var downloadEnd: js.UndefOr[js.Function1[/* e */ DownloadEndEventArgs, Unit]] = js.undefined
  /** Triggers when the download is started.
    */
  var downloadStart: js.UndefOr[js.Function1[/* e */ DownloadStartEventArgs, Unit]] = js.undefined
  /** Enables or disables the highlight annotation.
    */
  var enableHighlightAnnotation: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the hyperlinks in PDF document.
    */
  var enableHyperlink: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the adding of handwritten signature over the PDF document.
    */
  var enableSignature: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the strikethrough annotation.
    */
  var enableStrikethroughAnnotation: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the text markup annotations.
    */
  var enableTextMarkupAnnotations: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the text selection in PDF document.
    */
  var enableTextSelection: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the underline annotation.
    */
  var enableUnderlineAnnotation: js.UndefOr[Boolean] = js.undefined
  /** Gets the name of the PDF document which loaded in the ejPdfViewer control for downloading.
    */
  var fileName: js.UndefOr[String] = js.undefined
  /** Gets/sets the settings of the highlight annotation.
    */
  var highlightSettings: js.UndefOr[HighlightSettings] = js.undefined
  /** Triggers when hyperlink in the PDF Document is clicked
    */
  var hyperlinkClick: js.UndefOr[js.Function1[/* e */ HyperlinkClickEventArgs, Unit]] = js.undefined
  /** Specifies the open state of the hyperlink in the PDF document.
    */
  var hyperlinkOpenState: js.UndefOr[LinkTarget | String] = js.undefined
  /** Specifies the viewer interaction mode.
    */
  var interactionMode: js.UndefOr[InteractionMode | String] = js.undefined
  /** Checks whether the PDF document is edited.
    */
  var isDocumentEdited: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the responsiveness of the PDF viewer control during the window resize.
    */
  var isResponsive: js.UndefOr[Boolean] = js.undefined
  /** Specifies the locale information of the PDF viewer.
    */
  var locale: js.UndefOr[String] = js.undefined
  /** Triggers when there is change in current page number.
    */
  var pageChange: js.UndefOr[js.Function1[/* e */ PageChangeEventArgs, Unit]] = js.undefined
  /** Triggers when the mouse click is performed over the page of the PDF document.
    */
  var pageClick: js.UndefOr[js.Function1[/* e */ PageClickEventArgs, Unit]] = js.undefined
  /** Gets the total number of pages in PDF document.
    */
  var pageCount: js.UndefOr[Double] = js.undefined
  /** Specifies the location of the supporting PDF service
    */
  var pdfService: js.UndefOr[PdfService | String] = js.undefined
  /** Specifies the name of the action method in the server.
    */
  var serverActionSettings: js.UndefOr[ServerActionSettings] = js.undefined
  /** Sets the PDF Web API service URL
    */
  var serviceUrl: js.UndefOr[String] = js.undefined
  /** Triggers when a handwritten signature is added over the page of the PDF document.
    */
  var signatureAdd: js.UndefOr[js.Function1[/* e */ SignatureAddEventArgs, Unit]] = js.undefined
  /** Triggers when a handwritten signature is removed from the page of the PDF document.
    */
  var signatureDelete: js.UndefOr[js.Function1[/* e */ SignatureDeleteEventArgs, Unit]] = js.undefined
  /** Triggers when a handwritten signature properties is changed in the PDF document.
    */
  var signaturePropertiesChange: js.UndefOr[js.Function1[/* e */ SignaturePropertiesChangeEventArgs, Unit]] = js.undefined
  /** Triggers when a handwritten signature is resized in the PDF document.
    */
  var signatureResize: js.UndefOr[js.Function1[/* e */ SignatureResizeEventArgs, Unit]] = js.undefined
  /** Gets/sets the settings of the handwritten signature.
    */
  var signatureSettings: js.UndefOr[SignatureSettings] = js.undefined
  /** Gets/sets the settings of the strikethrough annotation.
    */
  var strikethroughSettings: js.UndefOr[StrikethroughSettings] = js.undefined
  /** Enables/ disables the text selection context menu.
    */
  var textSelectionContextMenu: js.UndefOr[TextSelectionContextMenu] = js.undefined
  /** Specifies the toolbar settings.
    */
  var toolbarSettings: js.UndefOr[ToolbarSettings] = js.undefined
  /** Gets/sets the settings of the underline annotation.
    */
  var underlineSettings: js.UndefOr[UnderlineSettings] = js.undefined
  /** Triggers when there is change in the magnification value.
    */
  var zoomChange: js.UndefOr[js.Function1[/* e */ ZoomChangeEventArgs, Unit]] = js.undefined
  /** Gets the current zoom percentage of the PDF document in viewer.
    */
  var zoomPercentage: js.UndefOr[Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    afterPrint: /* e */ AfterPrintEventArgs => Callback = null,
    ajaxRequestFailure: /* e */ AjaxRequestFailureEventArgs => Callback = null,
    ajaxRequestSuccess: /* e */ AjaxRequestSuccessEventArgs => Callback = null,
    allowClientBuffering: js.UndefOr[Boolean] = js.undefined,
    annotationAdd: /* e */ AnnotationAddEventArgs => Callback = null,
    annotationContextMenu: AnnotationContextMenu = null,
    annotationPropertiesChange: /* e */ AnnotationPropertiesChangeEventArgs => Callback = null,
    annotationRemove: /* e */ AnnotationRemoveEventArgs => Callback = null,
    annotationType: AnnotationType | String = null,
    beforePrint: /* e */ BeforePrintEventArgs => Callback = null,
    bufferEnd: /* e */ BufferEndEventArgs => Callback = null,
    bufferStart: /* e */ BufferStartEventArgs => Callback = null,
    bufferingMode: BufferingMode | String = null,
    currentPageNumber: Int | Double = null,
    destroy: /* e */ DestroyEventArgs => Callback = null,
    documentLoad: /* e */ DocumentLoadEventArgs => Callback = null,
    documentPath: String = null,
    documentUnload: /* e */ DocumentUnloadEventArgs => Callback = null,
    downloadEnd: /* e */ DownloadEndEventArgs => Callback = null,
    downloadStart: /* e */ DownloadStartEventArgs => Callback = null,
    enableHighlightAnnotation: js.UndefOr[Boolean] = js.undefined,
    enableHyperlink: js.UndefOr[Boolean] = js.undefined,
    enableSignature: js.UndefOr[Boolean] = js.undefined,
    enableStrikethroughAnnotation: js.UndefOr[Boolean] = js.undefined,
    enableTextMarkupAnnotations: js.UndefOr[Boolean] = js.undefined,
    enableTextSelection: js.UndefOr[Boolean] = js.undefined,
    enableUnderlineAnnotation: js.UndefOr[Boolean] = js.undefined,
    fileName: String = null,
    highlightSettings: HighlightSettings = null,
    hyperlinkClick: /* e */ HyperlinkClickEventArgs => Callback = null,
    hyperlinkOpenState: LinkTarget | String = null,
    interactionMode: InteractionMode | String = null,
    isDocumentEdited: js.UndefOr[Boolean] = js.undefined,
    isResponsive: js.UndefOr[Boolean] = js.undefined,
    locale: String = null,
    pageChange: /* e */ PageChangeEventArgs => Callback = null,
    pageClick: /* e */ PageClickEventArgs => Callback = null,
    pageCount: Int | Double = null,
    pdfService: PdfService | String = null,
    serverActionSettings: ServerActionSettings = null,
    serviceUrl: String = null,
    signatureAdd: /* e */ SignatureAddEventArgs => Callback = null,
    signatureDelete: /* e */ SignatureDeleteEventArgs => Callback = null,
    signaturePropertiesChange: /* e */ SignaturePropertiesChangeEventArgs => Callback = null,
    signatureResize: /* e */ SignatureResizeEventArgs => Callback = null,
    signatureSettings: SignatureSettings = null,
    strikethroughSettings: StrikethroughSettings = null,
    textSelectionContextMenu: TextSelectionContextMenu = null,
    toolbarSettings: ToolbarSettings = null,
    underlineSettings: UnderlineSettings = null,
    zoomChange: /* e */ ZoomChangeEventArgs => Callback = null,
    zoomPercentage: Int | Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (afterPrint != null) __obj.updateDynamic("afterPrint")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PdfViewer.AfterPrintEventArgs) => afterPrint(t0).runNow()))
    if (ajaxRequestFailure != null) __obj.updateDynamic("ajaxRequestFailure")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PdfViewer.AjaxRequestFailureEventArgs) => ajaxRequestFailure(t0).runNow()))
    if (ajaxRequestSuccess != null) __obj.updateDynamic("ajaxRequestSuccess")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PdfViewer.AjaxRequestSuccessEventArgs) => ajaxRequestSuccess(t0).runNow()))
    if (!js.isUndefined(allowClientBuffering)) __obj.updateDynamic("allowClientBuffering")(allowClientBuffering.asInstanceOf[js.Any])
    if (annotationAdd != null) __obj.updateDynamic("annotationAdd")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PdfViewer.AnnotationAddEventArgs) => annotationAdd(t0).runNow()))
    if (annotationContextMenu != null) __obj.updateDynamic("annotationContextMenu")(annotationContextMenu.asInstanceOf[js.Any])
    if (annotationPropertiesChange != null) __obj.updateDynamic("annotationPropertiesChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PdfViewer.AnnotationPropertiesChangeEventArgs) => annotationPropertiesChange(t0).runNow()))
    if (annotationRemove != null) __obj.updateDynamic("annotationRemove")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PdfViewer.AnnotationRemoveEventArgs) => annotationRemove(t0).runNow()))
    if (annotationType != null) __obj.updateDynamic("annotationType")(annotationType.asInstanceOf[js.Any])
    if (beforePrint != null) __obj.updateDynamic("beforePrint")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PdfViewer.BeforePrintEventArgs) => beforePrint(t0).runNow()))
    if (bufferEnd != null) __obj.updateDynamic("bufferEnd")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PdfViewer.BufferEndEventArgs) => bufferEnd(t0).runNow()))
    if (bufferStart != null) __obj.updateDynamic("bufferStart")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PdfViewer.BufferStartEventArgs) => bufferStart(t0).runNow()))
    if (bufferingMode != null) __obj.updateDynamic("bufferingMode")(bufferingMode.asInstanceOf[js.Any])
    if (currentPageNumber != null) __obj.updateDynamic("currentPageNumber")(currentPageNumber.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PdfViewer.DestroyEventArgs) => destroy(t0).runNow()))
    if (documentLoad != null) __obj.updateDynamic("documentLoad")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PdfViewer.DocumentLoadEventArgs) => documentLoad(t0).runNow()))
    if (documentPath != null) __obj.updateDynamic("documentPath")(documentPath.asInstanceOf[js.Any])
    if (documentUnload != null) __obj.updateDynamic("documentUnload")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PdfViewer.DocumentUnloadEventArgs) => documentUnload(t0).runNow()))
    if (downloadEnd != null) __obj.updateDynamic("downloadEnd")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PdfViewer.DownloadEndEventArgs) => downloadEnd(t0).runNow()))
    if (downloadStart != null) __obj.updateDynamic("downloadStart")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PdfViewer.DownloadStartEventArgs) => downloadStart(t0).runNow()))
    if (!js.isUndefined(enableHighlightAnnotation)) __obj.updateDynamic("enableHighlightAnnotation")(enableHighlightAnnotation.asInstanceOf[js.Any])
    if (!js.isUndefined(enableHyperlink)) __obj.updateDynamic("enableHyperlink")(enableHyperlink.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSignature)) __obj.updateDynamic("enableSignature")(enableSignature.asInstanceOf[js.Any])
    if (!js.isUndefined(enableStrikethroughAnnotation)) __obj.updateDynamic("enableStrikethroughAnnotation")(enableStrikethroughAnnotation.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTextMarkupAnnotations)) __obj.updateDynamic("enableTextMarkupAnnotations")(enableTextMarkupAnnotations.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTextSelection)) __obj.updateDynamic("enableTextSelection")(enableTextSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(enableUnderlineAnnotation)) __obj.updateDynamic("enableUnderlineAnnotation")(enableUnderlineAnnotation.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (highlightSettings != null) __obj.updateDynamic("highlightSettings")(highlightSettings.asInstanceOf[js.Any])
    if (hyperlinkClick != null) __obj.updateDynamic("hyperlinkClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PdfViewer.HyperlinkClickEventArgs) => hyperlinkClick(t0).runNow()))
    if (hyperlinkOpenState != null) __obj.updateDynamic("hyperlinkOpenState")(hyperlinkOpenState.asInstanceOf[js.Any])
    if (interactionMode != null) __obj.updateDynamic("interactionMode")(interactionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(isDocumentEdited)) __obj.updateDynamic("isDocumentEdited")(isDocumentEdited.asInstanceOf[js.Any])
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (pageChange != null) __obj.updateDynamic("pageChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PdfViewer.PageChangeEventArgs) => pageChange(t0).runNow()))
    if (pageClick != null) __obj.updateDynamic("pageClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PdfViewer.PageClickEventArgs) => pageClick(t0).runNow()))
    if (pageCount != null) __obj.updateDynamic("pageCount")(pageCount.asInstanceOf[js.Any])
    if (pdfService != null) __obj.updateDynamic("pdfService")(pdfService.asInstanceOf[js.Any])
    if (serverActionSettings != null) __obj.updateDynamic("serverActionSettings")(serverActionSettings.asInstanceOf[js.Any])
    if (serviceUrl != null) __obj.updateDynamic("serviceUrl")(serviceUrl.asInstanceOf[js.Any])
    if (signatureAdd != null) __obj.updateDynamic("signatureAdd")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PdfViewer.SignatureAddEventArgs) => signatureAdd(t0).runNow()))
    if (signatureDelete != null) __obj.updateDynamic("signatureDelete")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PdfViewer.SignatureDeleteEventArgs) => signatureDelete(t0).runNow()))
    if (signaturePropertiesChange != null) __obj.updateDynamic("signaturePropertiesChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PdfViewer.SignaturePropertiesChangeEventArgs) => signaturePropertiesChange(t0).runNow()))
    if (signatureResize != null) __obj.updateDynamic("signatureResize")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PdfViewer.SignatureResizeEventArgs) => signatureResize(t0).runNow()))
    if (signatureSettings != null) __obj.updateDynamic("signatureSettings")(signatureSettings.asInstanceOf[js.Any])
    if (strikethroughSettings != null) __obj.updateDynamic("strikethroughSettings")(strikethroughSettings.asInstanceOf[js.Any])
    if (textSelectionContextMenu != null) __obj.updateDynamic("textSelectionContextMenu")(textSelectionContextMenu.asInstanceOf[js.Any])
    if (toolbarSettings != null) __obj.updateDynamic("toolbarSettings")(toolbarSettings.asInstanceOf[js.Any])
    if (underlineSettings != null) __obj.updateDynamic("underlineSettings")(underlineSettings.asInstanceOf[js.Any])
    if (zoomChange != null) __obj.updateDynamic("zoomChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.PdfViewer.ZoomChangeEventArgs) => zoomChange(t0).runNow()))
    if (zoomPercentage != null) __obj.updateDynamic("zoomPercentage")(zoomPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

