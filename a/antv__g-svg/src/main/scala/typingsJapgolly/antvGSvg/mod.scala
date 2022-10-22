package typingsJapgolly.antvGSvg

import org.scalajs.dom.Document
import org.scalajs.dom.SVGElement
import typingsJapgolly.antvGLite.distCameraInterfacesMod.ICamera
import typingsJapgolly.antvGLite.distCssInterfacesMod.StyleValueRegistry
import typingsJapgolly.antvGLite.distDisplayObjectsImageMod.ParsedImageStyleProps
import typingsJapgolly.antvGLite.distDisplayObjectsLineMod.ParsedLineStyleProps
import typingsJapgolly.antvGLite.distDisplayObjectsPathMod.ParsedPathStyleProps
import typingsJapgolly.antvGLite.distDisplayObjectsPolylineMod.ParsedPolylineStyleProps
import typingsJapgolly.antvGLite.distDisplayObjectsRectMod.ParsedRectStyleProps
import typingsJapgolly.antvGLite.distDisplayObjectsTextMod.ParsedTextStyleProps
import typingsJapgolly.antvGLite.distServicesContextServiceMod.ContextService
import typingsJapgolly.antvGLite.distServicesRenderingContextMod.RenderingContext
import typingsJapgolly.antvGLite.distTypesMod.CanvasConfig
import typingsJapgolly.antvGLite.distTypesMod.RendererConfig
import typingsJapgolly.antvGLite.distTypesMod.Shape
import typingsJapgolly.antvGLite.mod.AbstractRenderer
import typingsJapgolly.antvGLite.mod.Syringe.DefinedToken
import typingsJapgolly.antvGPluginSvgRenderer.anon.PartialSVGRendererPluginO
import typingsJapgolly.antvGPluginSvgRenderer.distShapesDefsMod.DefElementManager
import typingsJapgolly.antvGSvg.anon.PartialSVGRendererConfig
import typingsJapgolly.manaSyringe.mod.SyringeModule
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object DomInteraction {
    
    @JSImport("@antv/g-svg", "DomInteraction.Plugin")
    @js.native
    open class Plugin ()
      extends typingsJapgolly.antvGPluginDomInteraction.mod.Plugin
  }
  
  @JSImport("@antv/g-svg", "Renderer")
  @js.native
  open class Renderer () extends AbstractRenderer {
    def this(config: PartialSVGRendererConfig) = this()
  }
  
  object SVGPicker {
    
    @JSImport("@antv/g-svg", "SVGPicker.Plugin")
    @js.native
    open class Plugin ()
      extends typingsJapgolly.antvGPluginSvgPicker.mod.Plugin
  }
  
  object SVGRenderer {
    
    @JSImport("@antv/g-svg", "SVGRenderer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-svg", "SVGRenderer.DEFAULT_VALUE_MAP")
    @js.native
    val DEFAULT_VALUE_MAP: Record[String, String] = js.native
    
    @JSImport("@antv/g-svg", "SVGRenderer.DefaultElementLifeCycleContribution")
    @js.native
    open class DefaultElementLifeCycleContribution protected ()
      extends typingsJapgolly.antvGPluginSvgRenderer.mod.DefaultElementLifeCycleContribution {
      def this(canvasConfig: CanvasConfig) = this()
    }
    
    @JSImport("@antv/g-svg", "SVGRenderer.ElementLifeCycleContribution")
    @js.native
    val ElementLifeCycleContribution: DefinedToken = js.native
    
    @JSImport("@antv/g-svg", "SVGRenderer.ElementSVG")
    @js.native
    open class ElementSVG ()
      extends typingsJapgolly.antvGPluginSvgRenderer.mod.ElementSVG
    /* static members */
    object ElementSVG {
      
      @JSImport("@antv/g-svg", "SVGRenderer.ElementSVG")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@antv/g-svg", "SVGRenderer.ElementSVG.tag")
      @js.native
      def tag: String = js.native
      inline def tag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tag")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("@antv/g-svg", "SVGRenderer.G_SVG_PREFIX")
    @js.native
    val G_SVG_PREFIX: /* "g_svg" */ String = js.native
    
    @JSImport("@antv/g-svg", "SVGRenderer.Plugin")
    @js.native
    open class Plugin ()
      extends typingsJapgolly.antvGPluginSvgRenderer.mod.Plugin {
      def this(options: PartialSVGRendererPluginO) = this()
    }
    
    @JSImport("@antv/g-svg", "SVGRenderer.SHAPE2TAGS")
    @js.native
    val SHAPE2TAGS: Record[Shape | String, String] = js.native
    
    @JSImport("@antv/g-svg", "SVGRenderer.SHAPE_UPDATE_DEPS")
    @js.native
    val SHAPE_UPDATE_DEPS: Record[Shape | String, js.Array[String]] = js.native
    
    @JSImport("@antv/g-svg", "SVGRenderer.SVGRendererPlugin")
    @js.native
    open class SVGRendererPlugin protected ()
      extends typingsJapgolly.antvGPluginSvgRenderer.mod.SVGRendererPlugin {
      def this(
        canvasConfig: CanvasConfig,
        camera: ICamera,
        contextService: ContextService[SVGElement],
        renderingContext: RenderingContext,
        styleValueRegistry: StyleValueRegistry,
        createElementContribution: typingsJapgolly.antvGPluginSvgRenderer.distTokensMod.ElementLifeCycleContribution,
        defElementManager: DefElementManager,
        pluginOptions: typingsJapgolly.antvGPluginSvgRenderer.distTokensMod.SVGRendererPluginOptions
      ) = this()
    }
    /* static members */
    object SVGRendererPlugin {
      
      @JSImport("@antv/g-svg", "SVGRenderer.SVGRendererPlugin")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@antv/g-svg", "SVGRenderer.SVGRendererPlugin.tag")
      @js.native
      def tag: String = js.native
      inline def tag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tag")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("@antv/g-svg", "SVGRenderer.SVGRendererPluginOptions")
    @js.native
    val SVGRendererPluginOptions: DefinedToken = js.native
    
    @JSImport("@antv/g-svg", "SVGRenderer.SVG_ATTR_MAP")
    @js.native
    val SVG_ATTR_MAP: Record[String, String] = js.native
    
    @JSImport("@antv/g-svg", "SVGRenderer.containerModule")
    @js.native
    val containerModule: SyringeModule = js.native
    
    inline def createSVGElement(`type`: String): SVGElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createSVGElement")(`type`.asInstanceOf[js.Any]).asInstanceOf[SVGElement]
    inline def createSVGElement(`type`: String, doc: Document): SVGElement = (^.asInstanceOf[js.Dynamic].applyDynamic("createSVGElement")(`type`.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[SVGElement]
    
    inline def updateImageElementAttribute($el: SVGElement, parsedStyle: ParsedImageStyleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateImageElementAttribute")($el.asInstanceOf[js.Any], parsedStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def updateLineElementAttribute($el: SVGElement, parsedStyle: ParsedLineStyleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateLineElementAttribute")($el.asInstanceOf[js.Any], parsedStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def updatePathElementAttribute($el: SVGElement, parsedStyle: ParsedPathStyleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updatePathElementAttribute")($el.asInstanceOf[js.Any], parsedStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def updatePolylineElementAttribute($el: SVGElement, parsedStyle: ParsedPolylineStyleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updatePolylineElementAttribute")($el.asInstanceOf[js.Any], parsedStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def updateRectElementAttribute($el: SVGElement, parsedStyle: ParsedRectStyleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateRectElementAttribute")($el.asInstanceOf[js.Any], parsedStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def updateTextElementAttribute($el: SVGElement, parsedStyle: ParsedTextStyleProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateTextElementAttribute")($el.asInstanceOf[js.Any], parsedStyle.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  trait SVGRendererConfig
    extends StObject
       with RendererConfig {
    
    /**
      * Whether to output id on SVGElement with `setAttribute` like: <circle id="g-circle-123">.
      */
    var outputSVGElementId: Boolean
  }
  object SVGRendererConfig {
    
    inline def apply(
      enableAutoRendering: Boolean,
      enableCulling: Boolean,
      enableDirtyCheck: Boolean,
      enableDirtyRectangleRendering: Boolean,
      enableDirtyRectangleRenderingDebug: Boolean,
      outputSVGElementId: Boolean
    ): SVGRendererConfig = {
      val __obj = js.Dynamic.literal(enableAutoRendering = enableAutoRendering.asInstanceOf[js.Any], enableCulling = enableCulling.asInstanceOf[js.Any], enableDirtyCheck = enableDirtyCheck.asInstanceOf[js.Any], enableDirtyRectangleRendering = enableDirtyRectangleRendering.asInstanceOf[js.Any], enableDirtyRectangleRenderingDebug = enableDirtyRectangleRenderingDebug.asInstanceOf[js.Any], outputSVGElementId = outputSVGElementId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SVGRendererConfig]
    }
    
    extension [Self <: SVGRendererConfig](x: Self) {
      
      inline def setOutputSVGElementId(value: Boolean): Self = StObject.set(x, "outputSVGElementId", value.asInstanceOf[js.Any])
    }
  }
}
