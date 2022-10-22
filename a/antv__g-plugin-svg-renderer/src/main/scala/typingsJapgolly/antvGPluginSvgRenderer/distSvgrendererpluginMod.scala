package typingsJapgolly.antvGPluginSvgRenderer

import org.scalajs.dom.SVGElement
import typingsJapgolly.antvGLite.distCameraInterfacesMod.ICamera
import typingsJapgolly.antvGLite.distCssCssomCssgradientvalueMod.LinearGradient
import typingsJapgolly.antvGLite.distCssCssomCssgradientvalueMod.RadialGradient
import typingsJapgolly.antvGLite.distCssInterfacesMod.StyleValueRegistry
import typingsJapgolly.antvGLite.distServicesContextServiceMod.ContextService
import typingsJapgolly.antvGLite.distServicesRenderingContextMod.RenderingContext
import typingsJapgolly.antvGLite.distServicesRenderingServiceMod.RenderingPlugin
import typingsJapgolly.antvGLite.distServicesRenderingServiceMod.RenderingService
import typingsJapgolly.antvGLite.distTypesMod.CanvasConfig
import typingsJapgolly.antvGPluginSvgRenderer.distShapesDefsMod.DefElementManager
import typingsJapgolly.antvGPluginSvgRenderer.distTokensMod.ElementLifeCycleContribution
import typingsJapgolly.antvGPluginSvgRenderer.distTokensMod.SVGRendererPluginOptions
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSvgrendererpluginMod {
  
  @JSImport("@antv/g-plugin-svg-renderer/dist/SVGRendererPlugin", "DEFAULT_VALUE_MAP")
  @js.native
  val DEFAULT_VALUE_MAP: Record[String, String] = js.native
  
  @JSImport("@antv/g-plugin-svg-renderer/dist/SVGRendererPlugin", "G_SVG_PREFIX")
  @js.native
  val G_SVG_PREFIX: /* "g_svg" */ String = js.native
  
  @JSImport("@antv/g-plugin-svg-renderer/dist/SVGRendererPlugin", "SVGRendererPlugin")
  @js.native
  open class SVGRendererPlugin protected ()
    extends StObject
       with RenderingPlugin {
    def this(
      canvasConfig: CanvasConfig,
      camera: ICamera,
      contextService: ContextService[SVGElement],
      renderingContext: RenderingContext,
      styleValueRegistry: StyleValueRegistry,
      createElementContribution: ElementLifeCycleContribution,
      defElementManager: DefElementManager,
      pluginOptions: SVGRendererPluginOptions
    ) = this()
    
    /**
      * <camera>
      */
    /* private */ @JSName("$camera")
    var $camera: Any = js.native
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(renderer: RenderingService): Unit = js.native
    @JSName("apply")
    def apply(renderingService: typingsJapgolly.antvGLite.mod.RenderingService): Unit = js.native
    
    /* private */ var applyAttributes: Any = js.native
    
    /* private */ var applyTransform: Any = js.native
    
    /* private */ var camera: Any = js.native
    
    /* private */ var canvasConfig: Any = js.native
    
    /* private */ var contextService: Any = js.native
    
    /* private */ var createElementContribution: Any = js.native
    
    /* private */ var createOrUpdateClipPath: Any = js.native
    
    /* private */ var createOrUpdateHitArea: Any = js.native
    
    /* private */ var createOrUpdateInnerHTML: Any = js.native
    
    /* private */ var createSVGDom: Any = js.native
    
    /* private */ var defElementManager: Any = js.native
    
    /**
      * reorder after mounted
      */
    /* private */ var pendingReorderQueue: Any = js.native
    
    /* private */ var pluginOptions: Any = js.native
    
    /* private */ var removeSVGDom: Any = js.native
    
    /**
      * render at the end of frame
      */
    /* private */ var renderQueue: Any = js.native
    
    /* private */ var renderingContext: Any = js.native
    
    /* private */ var reorderChildren: Any = js.native
    
    /* private */ var styleValueRegistry: Any = js.native
    
    /**
      * the origin is bounding box's top left corner
      */
    /* private */ var updateAnchorWithTransform: Any = js.native
    
    /* private */ var updateAttribute: Any = js.native
  }
  /* static members */
  object SVGRendererPlugin {
    
    @JSImport("@antv/g-plugin-svg-renderer/dist/SVGRendererPlugin", "SVGRendererPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-plugin-svg-renderer/dist/SVGRendererPlugin", "SVGRendererPlugin.tag")
    @js.native
    def tag: String = js.native
    inline def tag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tag")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@antv/g-plugin-svg-renderer/dist/SVGRendererPlugin", "SVG_ATTR_MAP")
  @js.native
  val SVG_ATTR_MAP: Record[String, String] = js.native
  
  type GradientParams = LinearGradient | RadialGradient
}
