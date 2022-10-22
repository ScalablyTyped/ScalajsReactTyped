package typingsJapgolly.antvGLite

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.antvGLite.anon.Rendered
import typingsJapgolly.antvGLite.distAbstractRendererMod.IRenderer
import typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject
import typingsJapgolly.antvGLite.distDisplayObjectsMod.Group
import typingsJapgolly.antvGLite.distDomInterfacesMod.DisplayObjectConfig
import typingsJapgolly.antvGLite.distDomInterfacesMod.ICanvas
import typingsJapgolly.antvGLite.distDomInterfacesMod.IChildNode
import typingsJapgolly.antvGLite.distDomMod.Document
import typingsJapgolly.antvGLite.distDomMod.EventTarget
import typingsJapgolly.antvGLite.distServicesRenderingContextMod.RenderingContext
import typingsJapgolly.antvGLite.distShapesPointMod.PointLike
import typingsJapgolly.antvGLite.distTypesMod.BaseStyleProps
import typingsJapgolly.antvGLite.distTypesMod.CanvasConfig
import typingsJapgolly.antvGLite.distTypesMod.Cursor
import typingsJapgolly.antvGLite.distTypesMod.ParsedBaseStyleProps
import typingsJapgolly.manaSyringe.libCoreMod.Syringe.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCanvasMod {
  
  @JSImport("@antv/g-lite/dist/Canvas", "Canvas")
  @js.native
  open class Canvas protected ()
    extends EventTarget
       with ICanvas {
    def this(config: CanvasConfig) = this()
    
    /**
      * @see https://developer.mozilla.org/en-US/docs/Web/API/Element
      */
    var Element: Instantiable1[
        /* config */ DisplayObjectConfig[/* import warning: RewrittenClass.unapply cls was tparam StyleProps */ Any], 
        DisplayObject[BaseStyleProps, ParsedBaseStyleProps]
      ] = js.native
    
    /* private */ var afterRenderEvent: Any = js.native
    
    def appendChild[T /* <: IChildNode */](child: T): T = js.native
    def appendChild[T /* <: IChildNode */](child: T, index: Double): T = js.native
    
    /* private */ var beforeRenderEvent: Any = js.native
    
    /**
      * compatible with G 3.0
      * @deprecated
      * @alias resize
      */
    def changeSize(width: Double, height: Double): Unit = js.native
    
    /**
      * child container of current canvas, use hierarchy container
      */
    var container: Container = js.native
    
    def destroy(destroyScenegraph: Boolean, skipTriggerEvent: Boolean): Unit = js.native
    def destroy(destroyScenegraph: Unit, skipTriggerEvent: Boolean): Unit = js.native
    
    /**
      * window.document
      */
    @JSName("document")
    var document_Canvas: Document = js.native
    
    /**
      * cache here since inversify's resolving is very slow
      */
    /* private */ var eventService: Any = js.native
    
    /**
      * rAF in auto rendering
      */
    /* private */ var frameId: Any = js.native
    
    /**
      * @deprecated
      * @alias viewport2Client
      */
    def getClientByPoint(x: Double, y: Double): PointLike = js.native
    
    def getContainer(): Container = js.native
    
    /**
      * @deprecated
      * @alias client2Viewport
      */
    def getPointByClient(clientX: Double, clientY: Double): PointLike = js.native
    
    def getRenderingContext(): RenderingContext = js.native
    
    /**
      * get the root displayObject in scenegraph
      * @alias this.document.documentElement
      */
    def getRoot(): Group = js.native
    
    def getStats(): Rendered = js.native
    
    /* private */ var initDefaultCamera: Any = js.native
    
    /* private */ var initRenderer: Any = js.native
    
    /* private */ var initRenderingContext: Any = js.native
    
    /* private */ var inited: Any = js.native
    
    def insertBefore[T /* <: IChildNode */, N /* <: IChildNode */](newChild: T): T = js.native
    def insertBefore[T /* <: IChildNode */, N /* <: IChildNode */](newChild: T, refChild: N): T = js.native
    
    /* private */ var loadCommonContainerModule: Any = js.native
    
    /* private */ var loadRendererContainerModule: Any = js.native
    
    /* private */ var mountChildren: Any = js.native
    
    /**
      * reuse custom event preventing from re-create them in every frame
      */
    /* private */ var mountEvent: Any = js.native
    
    def ready: js.Promise[Any] = js.native
    
    /* private */ var readyPromise: Any = js.native
    
    def removeChild[T /* <: IChildNode */](child: T): T = js.native
    
    def removeChildren(): Unit = js.native
    
    /* private */ var renderingService: Any = js.native
    
    /* private */ var resolveReadyPromise: Any = js.native
    
    /* private */ var run: Any = js.native
    
    def setCursor(cursor: Cursor): Unit = js.native
    
    def setRenderer(renderer: IRenderer): js.Promise[Unit] = js.native
    
    /* private */ var unmountChildren: Any = js.native
    
    /* private */ var unmountEvent: Any = js.native
  }
  
  @js.native
  sealed trait CanvasEvent extends StObject
  @JSImport("@antv/g-lite/dist/Canvas", "CanvasEvent")
  @js.native
  object CanvasEvent extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CanvasEvent & String] = js.native
    
    @js.native
    sealed trait AFTER_DESTROY
      extends StObject
         with CanvasEvent
    /* "afterdestroy" */ val AFTER_DESTROY: typingsJapgolly.antvGLite.distCanvasMod.CanvasEvent.AFTER_DESTROY & String = js.native
    
    @js.native
    sealed trait AFTER_RENDER
      extends StObject
         with CanvasEvent
    /* "afterrender" */ val AFTER_RENDER: typingsJapgolly.antvGLite.distCanvasMod.CanvasEvent.AFTER_RENDER & String = js.native
    
    @js.native
    sealed trait BEFORE_DESTROY
      extends StObject
         with CanvasEvent
    /* "beforedestroy" */ val BEFORE_DESTROY: typingsJapgolly.antvGLite.distCanvasMod.CanvasEvent.BEFORE_DESTROY & String = js.native
    
    @js.native
    sealed trait BEFORE_RENDER
      extends StObject
         with CanvasEvent
    /* "beforerender" */ val BEFORE_RENDER: typingsJapgolly.antvGLite.distCanvasMod.CanvasEvent.BEFORE_RENDER & String = js.native
    
    @js.native
    sealed trait DIRTY_RECTANGLE
      extends StObject
         with CanvasEvent
    /* "dirtyrectangle" */ val DIRTY_RECTANGLE: typingsJapgolly.antvGLite.distCanvasMod.CanvasEvent.DIRTY_RECTANGLE & String = js.native
    
    @js.native
    sealed trait READY
      extends StObject
         with CanvasEvent
    /* "ready" */ val READY: typingsJapgolly.antvGLite.distCanvasMod.CanvasEvent.READY & String = js.native
    
    @js.native
    sealed trait RESIZE
      extends StObject
         with CanvasEvent
    /* "resize" */ val RESIZE: typingsJapgolly.antvGLite.distCanvasMod.CanvasEvent.RESIZE & String = js.native
  }
}
