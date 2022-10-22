package typingsJapgolly.antvGPluginCanvasRenderer

import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.antvGLite.distCameraInterfacesMod.ICamera
import typingsJapgolly.antvGLite.distComponentsRbushnodeMod.RBushNodeAABB
import typingsJapgolly.antvGLite.distServicesContextServiceMod.ContextService
import typingsJapgolly.antvGLite.distServicesRenderingContextMod.RenderingContext
import typingsJapgolly.antvGLite.distServicesRenderingServiceMod.RenderingPlugin
import typingsJapgolly.antvGLite.distServicesRenderingServiceMod.RenderingService
import typingsJapgolly.antvGLite.distTypesMod.CanvasConfig
import typingsJapgolly.antvGLite.distTypesMod.Shape
import typingsJapgolly.antvGLite.mod.DisplayObjectPool
import typingsJapgolly.antvGLite.mod.RBush
import typingsJapgolly.antvGPluginCanvasPathGenerator.distInterfacesMod.PathGenerator
import typingsJapgolly.antvGPluginCanvasRenderer.distShapesStylesInterfacesMod.StyleRenderer
import typingsJapgolly.antvGPluginCanvasRenderer.distTokensMod.CanvasRendererPluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCanvasRendererPluginMod {
  
  @JSImport("@antv/g-plugin-canvas-renderer/dist/CanvasRendererPlugin", "CanvasRendererPlugin")
  @js.native
  open class CanvasRendererPlugin protected ()
    extends StObject
       with RenderingPlugin {
    def this(
      canvasConfig: CanvasConfig,
      camera: ICamera,
      contextService: ContextService[CanvasRenderingContext2D],
      renderingContext: RenderingContext,
      pathGeneratorFactory: js.Function1[/* tagName */ Shape | String, PathGenerator[Any]],
      styleRendererFactory: js.Function1[/* tagName */ Shape | String, StyleRenderer],
      displayObjectPool: DisplayObjectPool,
      canvasRendererPluginOptions: CanvasRendererPluginOptions,
      /**
      * RBush used in dirty rectangle rendering
      */
    rBush: RBush[RBushNodeAABB]
    ) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(renderer: RenderingService): Unit = js.native
    @JSName("apply")
    def apply(renderingService: typingsJapgolly.antvGLite.mod.RenderingService): Unit = js.native
    
    /**
      * TODO: batch the same global attributes
      */
    /* private */ var applyAttributesToContext: Any = js.native
    
    /* private */ var applyWorldTransform: Any = js.native
    
    /* private */ var camera: Any = js.native
    
    /* private */ var canvasConfig: Any = js.native
    
    /* private */ var canvasRendererPluginOptions: Any = js.native
    
    /* private */ var clearFullScreen: Any = js.native
    
    /* private */ var clearRect: Any = js.native
    
    /* private */ var contextService: Any = js.native
    
    /* private */ var convertAABB2Rect: Any = js.native
    
    /* private */ var displayObjectPool: Any = js.native
    
    /* private */ var dprMatrix: Any = js.native
    
    /**
      * TODO: merge dirty rectangles with some strategies.
      * For now, we just simply merge all the rectangles into one.
      * @see https://idom.me/articles/841.html
      */
    /* private */ var mergeDirtyAABBs: Any = js.native
    
    /* private */ var pathGeneratorFactory: Any = js.native
    
    /* private */ var pathGeneratorFactoryCache: Any = js.native
    
    /**
      * RBush used in dirty rectangle rendering
      */
    /* private */ var rBush: Any = js.native
    
    /* private */ var removedRBushNodeAABBs: Any = js.native
    
    /* private */ var renderDisplayObject: Any = js.native
    
    /* private */ var renderQueue: Any = js.native
    
    /* private */ var renderingContext: Any = js.native
    
    /**
      * This stack is only used by clipPath for now.
      */
    /* private */ var restoreStack: Any = js.native
    
    /* private */ var safeMergeAABB: Any = js.native
    
    /* private */ var saveDirtyAABB: Any = js.native
    
    /* private */ var searchDirtyObjects: Any = js.native
    
    /* private */ var styleRendererFactory: Any = js.native
    
    /* private */ var styleRendererFactoryCache: Any = js.native
    
    /* private */ var tmpMat4: Any = js.native
    
    /* private */ var vec3a: Any = js.native
    
    /* private */ var vec3b: Any = js.native
    
    /* private */ var vec3c: Any = js.native
    
    /* private */ var vec3d: Any = js.native
    
    /**
      * view projection matrix
      */
    /* private */ var vpMatrix: Any = js.native
  }
  /* static members */
  object CanvasRendererPlugin {
    
    @JSImport("@antv/g-plugin-canvas-renderer/dist/CanvasRendererPlugin", "CanvasRendererPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-plugin-canvas-renderer/dist/CanvasRendererPlugin", "CanvasRendererPlugin.tag")
    @js.native
    def tag: String = js.native
    inline def tag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tag")(x.asInstanceOf[js.Any])
  }
}
