package typingsJapgolly.forgeViewer.Autodesk.Viewing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.forgeViewer.Autodesk.Viewing.MeasureCommon.SnapResult
import typingsJapgolly.forgeViewer.Autodesk.Viewing.UI.ModelStructurePanel
import typingsJapgolly.forgeViewer.Autodesk.Viewing.UI.PropertyPanel
import typingsJapgolly.forgeViewer.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Extensions {
  
  object Multipage {
    
    @js.native
    trait MultipageExtension
      extends StObject
         with Extension {
      
      def focusFirstPage(): String = js.native
      
      def focusLastPage(): String = js.native
      
      def focusNextPage(): String = js.native
      
      def focusOnPage(pageToFocus: Any): String = js.native
      def focusOnPage(pageToFocus: Any, immediate: Boolean): String = js.native
      
      def focusPrevPage(): String = js.native
      
      var focusedPage: Any = js.native
      
      def getAllPages(): js.Array[Any] = js.native
      
      def getCurrentPageIndex(): Double = js.native
      
      def getFocusedPage(): Any = js.native
      
      def getNearestPages(): js.Array[Any] = js.native
      
      def isPageInView(page: Any): Boolean = js.native
      
      def isPageLoaded(page: Any): Boolean = js.native
      
      def loadFocusedPage(): js.Promise[Unit] = js.native
      
      var mode: String = js.native
      
      var modes: js.Array[String] = js.native
      
      var multipageTool: ToolInterface = js.native
      
      var name: String = js.native
    }
  }
  
  object PDF {
    
    type PDFExtension = Extension
    
    trait PDFLoader extends StObject {
      
      def createPDFDocument(pdf: Any): Document
      
      def getDocument(): Any
    }
    object PDFLoader {
      
      inline def apply(createPDFDocument: Any => Document, getDocument: CallbackTo[Any]): PDFLoader = {
        val __obj = js.Dynamic.literal(createPDFDocument = js.Any.fromFunction1(createPDFDocument), getDocument = getDocument.toJsFn)
        __obj.asInstanceOf[PDFLoader]
      }
      
      extension [Self <: PDFLoader](x: Self) {
        
        inline def setCreatePDFDocument(value: Any => Document): Self = StObject.set(x, "createPDFDocument", js.Any.fromFunction1(value))
        
        inline def setGetDocument(value: CallbackTo[Any]): Self = StObject.set(x, "getDocument", value.toJsFn)
      }
    }
  }
  
  object Snapping {
    
    trait Snapper extends StObject {
      
      def activate(): Unit
      
      def clearSnapped(): Unit
      
      def copyResults(destiny: Any): Unit
      
      def deactivate(): Unit
      
      def getArc(): Boolean
      
      def getEdge(): Any
      
      def getGeometry(): Any
      
      def getGeometryType(): Double
      
      def getIntersectPoint(): Any
      
      def getName(): String
      
      def getNames(): js.Array[String]
      
      def getPriority(): Double
      
      def getSnapResult(): SnapResult
      
      def getSnapToArc(): Boolean
      
      def getSnapToPixel(): Boolean
      
      def getVertex(): Any
      
      var indicator: SnapperIndicator
      
      def isActive(): Boolean
      
      def isSnapped(): Boolean
      
      def onMouseDown(mousePosition: X): Boolean
      
      def onMouseMove(mousePosition: X): Boolean
      
      def setArc(isArc: Boolean): Boolean
      
      def setSnapToArc(enable: Boolean): Unit
      
      def setSnapToPixel(enable: Boolean): Unit
      
      def setViewportId(vpId: Double): Unit
    }
    object Snapper {
      
      inline def apply(
        activate: Callback,
        clearSnapped: Callback,
        copyResults: Any => Callback,
        deactivate: Callback,
        getArc: CallbackTo[Boolean],
        getEdge: CallbackTo[Any],
        getGeometry: CallbackTo[Any],
        getGeometryType: CallbackTo[Double],
        getIntersectPoint: CallbackTo[Any],
        getName: CallbackTo[String],
        getNames: CallbackTo[js.Array[String]],
        getPriority: CallbackTo[Double],
        getSnapResult: CallbackTo[SnapResult],
        getSnapToArc: CallbackTo[Boolean],
        getSnapToPixel: CallbackTo[Boolean],
        getVertex: CallbackTo[Any],
        indicator: SnapperIndicator,
        isActive: CallbackTo[Boolean],
        isSnapped: CallbackTo[Boolean],
        onMouseDown: X => Boolean,
        onMouseMove: X => Boolean,
        setArc: Boolean => Boolean,
        setSnapToArc: Boolean => Callback,
        setSnapToPixel: Boolean => Callback,
        setViewportId: Double => Callback
      ): Snapper = {
        val __obj = js.Dynamic.literal(activate = activate.toJsFn, clearSnapped = clearSnapped.toJsFn, copyResults = js.Any.fromFunction1((t0: Any) => copyResults(t0).runNow()), deactivate = deactivate.toJsFn, getArc = getArc.toJsFn, getEdge = getEdge.toJsFn, getGeometry = getGeometry.toJsFn, getGeometryType = getGeometryType.toJsFn, getIntersectPoint = getIntersectPoint.toJsFn, getName = getName.toJsFn, getNames = getNames.toJsFn, getPriority = getPriority.toJsFn, getSnapResult = getSnapResult.toJsFn, getSnapToArc = getSnapToArc.toJsFn, getSnapToPixel = getSnapToPixel.toJsFn, getVertex = getVertex.toJsFn, indicator = indicator.asInstanceOf[js.Any], isActive = isActive.toJsFn, isSnapped = isSnapped.toJsFn, onMouseDown = js.Any.fromFunction1(onMouseDown), onMouseMove = js.Any.fromFunction1(onMouseMove), setArc = js.Any.fromFunction1(setArc), setSnapToArc = js.Any.fromFunction1((t0: Boolean) => setSnapToArc(t0).runNow()), setSnapToPixel = js.Any.fromFunction1((t0: Boolean) => setSnapToPixel(t0).runNow()), setViewportId = js.Any.fromFunction1((t0: Double) => setViewportId(t0).runNow()))
        __obj.asInstanceOf[Snapper]
      }
      
      extension [Self <: Snapper](x: Self) {
        
        inline def setActivate(value: Callback): Self = StObject.set(x, "activate", value.toJsFn)
        
        inline def setClearSnapped(value: Callback): Self = StObject.set(x, "clearSnapped", value.toJsFn)
        
        inline def setCopyResults(value: Any => Callback): Self = StObject.set(x, "copyResults", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
        
        inline def setDeactivate(value: Callback): Self = StObject.set(x, "deactivate", value.toJsFn)
        
        inline def setGetArc(value: CallbackTo[Boolean]): Self = StObject.set(x, "getArc", value.toJsFn)
        
        inline def setGetEdge(value: CallbackTo[Any]): Self = StObject.set(x, "getEdge", value.toJsFn)
        
        inline def setGetGeometry(value: CallbackTo[Any]): Self = StObject.set(x, "getGeometry", value.toJsFn)
        
        inline def setGetGeometryType(value: CallbackTo[Double]): Self = StObject.set(x, "getGeometryType", value.toJsFn)
        
        inline def setGetIntersectPoint(value: CallbackTo[Any]): Self = StObject.set(x, "getIntersectPoint", value.toJsFn)
        
        inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
        
        inline def setGetNames(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getNames", value.toJsFn)
        
        inline def setGetPriority(value: CallbackTo[Double]): Self = StObject.set(x, "getPriority", value.toJsFn)
        
        inline def setGetSnapResult(value: CallbackTo[SnapResult]): Self = StObject.set(x, "getSnapResult", value.toJsFn)
        
        inline def setGetSnapToArc(value: CallbackTo[Boolean]): Self = StObject.set(x, "getSnapToArc", value.toJsFn)
        
        inline def setGetSnapToPixel(value: CallbackTo[Boolean]): Self = StObject.set(x, "getSnapToPixel", value.toJsFn)
        
        inline def setGetVertex(value: CallbackTo[Any]): Self = StObject.set(x, "getVertex", value.toJsFn)
        
        inline def setIndicator(value: SnapperIndicator): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
        
        inline def setIsActive(value: CallbackTo[Boolean]): Self = StObject.set(x, "isActive", value.toJsFn)
        
        inline def setIsSnapped(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSnapped", value.toJsFn)
        
        inline def setOnMouseDown(value: X => Boolean): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
        
        inline def setOnMouseMove(value: X => Boolean): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
        
        inline def setSetArc(value: Boolean => Boolean): Self = StObject.set(x, "setArc", js.Any.fromFunction1(value))
        
        inline def setSetSnapToArc(value: Boolean => Callback): Self = StObject.set(x, "setSnapToArc", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
        
        inline def setSetSnapToPixel(value: Boolean => Callback): Self = StObject.set(x, "setSnapToPixel", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
        
        inline def setSetViewportId(value: Double => Callback): Self = StObject.set(x, "setViewportId", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      }
    }
    
    trait SnapperIndicator extends StObject {
      
      def clearOverlays(): Unit
      
      def onCameraChange(): Unit
      
      def render(): Unit
    }
    object SnapperIndicator {
      
      inline def apply(clearOverlays: Callback, onCameraChange: Callback, render: Callback): SnapperIndicator = {
        val __obj = js.Dynamic.literal(clearOverlays = clearOverlays.toJsFn, onCameraChange = onCameraChange.toJsFn, render = render.toJsFn)
        __obj.asInstanceOf[SnapperIndicator]
      }
      
      extension [Self <: SnapperIndicator](x: Self) {
        
        inline def setClearOverlays(value: Callback): Self = StObject.set(x, "clearOverlays", value.toJsFn)
        
        inline def setOnCameraChange(value: Callback): Self = StObject.set(x, "onCameraChange", value.toJsFn)
        
        inline def setRender(value: Callback): Self = StObject.set(x, "render", value.toJsFn)
      }
    }
  }
  
  @js.native
  trait ViewerModelStructurePanel
    extends StObject
       with ModelStructurePanel {
    
    def createUI(): Unit = js.native
    
    def onViewerHide(event: Any): Unit = js.native
    
    def onViewerIsolate(event: Any): Unit = js.native
    
    def onViewerSelect(event: Any): Unit = js.native
    
    def onViewerShow(event: Any): Unit = js.native
    
    def removeTreeUI(model: Model): Unit = js.native
    
    def scrollToSelection(aggregatedSelection: js.Array[Any]): Unit = js.native
    
    def setHidden(nodes: js.Array[Any], model: Model, hidden: Boolean): Unit = js.native
    
    def setIsolation(isolation: js.Array[Any]): Unit = js.native
    
    def sync(): Unit = js.native
  }
  
  @js.native
  trait ViewerPropertyPanel
    extends StObject
       with PropertyPanel {
    
    var currentNodeIds: js.Array[js.Object] = js.native
  }
}
