package typingsJapgolly.divaJs

import org.scalajs.dom.experimental.Response
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import typingsJapgolly.divaJs.interfacesMod.Dimensions
import typingsJapgolly.divaJs.interfacesMod.Offset
import typingsJapgolly.divaJs.interfacesMod.Options
import typingsJapgolly.divaJs.interfacesMod.Region
import typingsJapgolly.divaJs.interfacesMod.Settings
import typingsJapgolly.divaJs.interfacesMod.ViewerState
import typingsJapgolly.divaJs.mod.Diva
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("diva.js/viewer-core", JSImport.Namespace)
@js.native
object viewerCoreMod extends js.Object {
  @js.native
  trait ViewerCore extends js.Object {
    var parentObject: HTMLElement = js.native
    var publicInstance: Diva = js.native
    var settings: Settings = js.native
    var viewerState: ViewerState = js.native
    def addPageOverlay(overlay: js.Object): Unit = js.native
    def bindMouseEvents(): Unit = js.native
    def bindTouchEvents(): Unit = js.native
    def clear(): Unit = js.native
    def clearViewer(): Unit = js.native
    def destroy(): Unit = js.native
    def disableDragScrollable(): Unit = js.native
    def disableScrollable(): Unit = js.native
    def elemAttrs(ident: String, base: js.Object): js.Object = js.native
    def enableDragScrollable(): Unit = js.native
    def enableScrollable(): Unit = js.native
    def escapeListener(e: KeyboardEvent): Unit = js.native
    def getCurrentLayout(): typingsJapgolly.divaJs.documentLayoutMod.default = js.native
    def getCurrentSourceProvider(): AnonGetAllZoomLevelsForPage = js.native
    def getInternalState(): ViewerState = js.native
    def getPadding(): AnonDocument = js.native
    def getPageData(pageIndex: Double, attribute: String): js.Any = js.native
    def getPageData(pageIndex: Double, attribute: js.Symbol): js.Any = js.native
    def getPageName(pageIndex: Double): String = js.native
    def getPagePositionAtViewportOffset(coords: Offset): AnonAnchorPage = js.native
    def getPageRegion(pageIndex: Double, options: js.Object): Region = js.native
    def getPageTools(): js.Object = js.native
    def getPublicInstance(): Diva = js.native
    def getSettings(): Settings = js.native
    def getViewport(): Region with Dimensions = js.native
    def getXOffset(pageIndex: Double): Double = js.native
    def getXOffset(pageIndex: Double, anchor: String): Double = js.native
    def getYOffset(pageIndex: Double): Double = js.native
    def getYOffset(pageIndex: Double, anchor: String): Double = js.native
    def handleEvents(): Unit = js.native
    def handleZoom(newZoomLevel: Double): Boolean = js.native
    def handleZoom(newZoomLevel: Double, focalPoint: js.Object): Boolean = js.native
    def hasChangedOption(options: js.Object, key: String): Boolean = js.native
    def hasChangedOption(options: js.Object, key: js.Symbol): Boolean = js.native
    def hideThrobber(): Unit = js.native
    def initPlugins(): Unit = js.native
    def initializeRenderer(): Unit = js.native
    def isValidOption(key: String, value: js.Any): Boolean = js.native
    def onResize(): Unit = js.native
    def prepareModeChange(options: Options): Unit = js.native
    def publish(event: String): Unit = js.native
    def reload(newOptions: Options): Unit = js.native
    def reloadViewer(newOptions: Options): Boolean = js.native
    def removePageOverlay(overlay: js.Object): Unit = js.native
    def scrollFunction(): Unit = js.native
    def setCurrentPages(activePage: Double, visiblePages: js.Array[Double]): Unit = js.native
    def setManifest(manifest: js.Object, loadOptions: Options): Unit = js.native
    def setPendingManifestRequest(pendingManifestRequest: js.Promise[Response]): Unit = js.native
    def showError(message: String): Unit = js.native
    def showThrobber(): Unit = js.native
    def updateOffsets(): Unit = js.native
    def updatePageOverlays(): Unit = js.native
    def updatePanelSize(): Unit = js.native
    def updateViewHandlerAndRendering(): Unit = js.native
    def zoom(zoomLevel: Double): Boolean = js.native
    def zoom(zoomLevel: Double, focalPoint: js.Object): Boolean = js.native
  }
  
  @js.native
  class default protected () extends ViewerCore {
    def this(element: HTMLElement, options: Options, publicInstance: Diva) = this()
  }
  
}

