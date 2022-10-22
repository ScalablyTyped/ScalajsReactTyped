package typingsJapgolly.divaJs

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.Response
import typingsJapgolly.divaJs.anon.AnchorPage
import typingsJapgolly.divaJs.anon.Document
import typingsJapgolly.divaJs.anon.GetAllZoomLevelsForPage
import typingsJapgolly.divaJs.interfacesMod.Dimensions
import typingsJapgolly.divaJs.interfacesMod.Offset
import typingsJapgolly.divaJs.interfacesMod.Options
import typingsJapgolly.divaJs.interfacesMod.Region
import typingsJapgolly.divaJs.interfacesMod.Settings
import typingsJapgolly.divaJs.interfacesMod.ViewerState
import typingsJapgolly.divaJs.mod.Diva
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewerCoreMod {
  
  @JSImport("diva.js/viewer-core", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ViewerCore {
    def this(element: HTMLElement, options: Options, publicInstance: Diva) = this()
  }
  
  @js.native
  trait ViewerCore extends StObject {
    
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
    
    def getCurrentSourceProvider(): GetAllZoomLevelsForPage = js.native
    
    def getInternalState(): ViewerState = js.native
    
    def getPadding(): Document = js.native
    
    def getPageData(pageIndex: Double, attribute: String): Any = js.native
    def getPageData(pageIndex: Double, attribute: js.Symbol): Any = js.native
    
    def getPageName(pageIndex: Double): String = js.native
    
    def getPagePositionAtViewportOffset(coords: Offset): AnchorPage = js.native
    
    def getPageRegion(pageIndex: Double, options: js.Object): Region = js.native
    
    def getPageTools(): js.Object = js.native
    
    def getPublicInstance(): Diva = js.native
    
    def getSettings(): Settings = js.native
    
    def getViewport(): Region & Dimensions = js.native
    
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
    
    def isValidOption(key: String, value: Any): Boolean = js.native
    
    def onResize(): Unit = js.native
    
    var parentObject: HTMLElement = js.native
    
    def prepareModeChange(options: Options): Unit = js.native
    
    var publicInstance: Diva = js.native
    
    def publish(event: String): Unit = js.native
    
    def reload(newOptions: Options): Unit = js.native
    
    def reloadViewer(newOptions: Options): Boolean = js.native
    
    def removePageOverlay(overlay: js.Object): Unit = js.native
    
    def scrollFunction(): Unit = js.native
    
    def setCurrentPages(activePage: Double, visiblePages: js.Array[Double]): Unit = js.native
    
    def setManifest(manifest: js.Object, loadOptions: Options): Unit = js.native
    
    def setPendingManifestRequest(pendingManifestRequest: js.Promise[Response]): Unit = js.native
    
    var settings: Settings = js.native
    
    def showError(message: String): Unit = js.native
    
    def showThrobber(): Unit = js.native
    
    def updateOffsets(): Unit = js.native
    
    def updatePageOverlays(): Unit = js.native
    
    def updatePanelSize(): Unit = js.native
    
    def updateViewHandlerAndRendering(): Unit = js.native
    
    var viewerState: ViewerState = js.native
    
    def zoom(zoomLevel: Double): Boolean = js.native
    def zoom(zoomLevel: Double, focalPoint: js.Object): Boolean = js.native
  }
}
