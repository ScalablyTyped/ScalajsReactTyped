package typingsJapgolly.antvGPluginSvgRenderer

import org.scalajs.dom.Document
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.SVGDefsElement
import org.scalajs.dom.SVGElement
import typingsJapgolly.antvGLite.distCssParserColorMod.Pattern
import typingsJapgolly.antvGLite.distCssParserFilterMod.ParsedFilterStyleProperty
import typingsJapgolly.antvGLite.distServicesContextServiceMod.ContextService
import typingsJapgolly.antvGLite.distTypesMod.CanvasConfig
import typingsJapgolly.antvGLite.mod.CSSGradientValue
import typingsJapgolly.antvGLite.mod.CSSRGB
import typingsJapgolly.antvGLite.mod.DisplayObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distShapesDefsMod {
  
  @JSImport("@antv/g-plugin-svg-renderer/dist/shapes/defs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@antv/g-plugin-svg-renderer/dist/shapes/defs", "DefElementManager")
  @js.native
  open class DefElementManager protected ()
    extends typingsJapgolly.antvGPluginSvgRenderer.distShapesDefsDefElementManagerMod.DefElementManager {
    def this(canvasConfig: CanvasConfig, contextService: ContextService[SVGElement]) = this()
  }
  
  @JSImport("@antv/g-plugin-svg-renderer/dist/shapes/defs", "FILTER_PREFIX")
  @js.native
  val FILTER_PREFIX: /* "g-filter-" */ String = js.native
  
  @JSImport("@antv/g-plugin-svg-renderer/dist/shapes/defs", "PATTERN_PREFIX")
  @js.native
  val PATTERN_PREFIX: /* "g-pattern-" */ String = js.native
  
  inline def createOrUpdateFilter(document: Document, $def: SVGDefsElement, `object`: DisplayObject[Any, Any], $el: SVGElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createOrUpdateFilter")(document.asInstanceOf[js.Any], $def.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], $el.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def createOrUpdateFilter(
    document: Document,
    $def: SVGDefsElement,
    `object`: DisplayObject[Any, Any],
    $el: SVGElement,
    filters: js.Array[ParsedFilterStyleProperty]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createOrUpdateFilter")(document.asInstanceOf[js.Any], $def.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], $el.asInstanceOf[js.Any], filters.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createOrUpdateGradientAndPattern(
    document: Document,
    $def: SVGDefsElement,
    `object`: DisplayObject[Any, Any],
    $el: SVGElement,
    parsedColor: js.Array[CSSGradientValue],
    name: String,
    createImage: js.Function1[/* url */ String, HTMLImageElement]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createOrUpdateGradientAndPattern")(document.asInstanceOf[js.Any], $def.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], $el.asInstanceOf[js.Any], parsedColor.asInstanceOf[js.Any], name.asInstanceOf[js.Any], createImage.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def createOrUpdateGradientAndPattern(
    document: Document,
    $def: SVGDefsElement,
    `object`: DisplayObject[Any, Any],
    $el: SVGElement,
    parsedColor: Pattern,
    name: String,
    createImage: js.Function1[/* url */ String, HTMLImageElement]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createOrUpdateGradientAndPattern")(document.asInstanceOf[js.Any], $def.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], $el.asInstanceOf[js.Any], parsedColor.asInstanceOf[js.Any], name.asInstanceOf[js.Any], createImage.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def createOrUpdateGradientAndPattern(
    document: Document,
    $def: SVGDefsElement,
    `object`: DisplayObject[Any, Any],
    $el: SVGElement,
    parsedColor: CSSRGB,
    name: String,
    createImage: js.Function1[/* url */ String, HTMLImageElement]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createOrUpdateGradientAndPattern")(document.asInstanceOf[js.Any], $def.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], $el.asInstanceOf[js.Any], parsedColor.asInstanceOf[js.Any], name.asInstanceOf[js.Any], createImage.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def createOrUpdateShadow(
    document: Document,
    $def: SVGDefsElement,
    `object`: DisplayObject[Any, Any],
    $el: SVGElement,
    name: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createOrUpdateShadow")(document.asInstanceOf[js.Any], $def.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], $el.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
