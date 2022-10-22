package typingsJapgolly.antvGPluginSvgRenderer

import org.scalajs.dom.Document
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.SVGDefsElement
import org.scalajs.dom.SVGElement
import typingsJapgolly.antvGLite.distCssParserColorMod.Pattern
import typingsJapgolly.antvGLite.mod.CSSGradientValue
import typingsJapgolly.antvGLite.mod.CSSRGB
import typingsJapgolly.antvGLite.mod.DisplayObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distShapesDefsPatternMod {
  
  @JSImport("@antv/g-plugin-svg-renderer/dist/shapes/defs/Pattern", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@antv/g-plugin-svg-renderer/dist/shapes/defs/Pattern", "PATTERN_PREFIX")
  @js.native
  val PATTERN_PREFIX: /* "g-pattern-" */ String = js.native
  
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
}
