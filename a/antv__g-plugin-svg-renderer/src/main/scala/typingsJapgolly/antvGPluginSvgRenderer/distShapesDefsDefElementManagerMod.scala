package typingsJapgolly.antvGPluginSvgRenderer

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

object distShapesDefsDefElementManagerMod {
  
  @JSImport("@antv/g-plugin-svg-renderer/dist/shapes/defs/DefElementManager", "DefElementManager")
  @js.native
  open class DefElementManager protected () extends StObject {
    def this(canvasConfig: CanvasConfig, contextService: ContextService[SVGElement]) = this()
    
    /**
      * container for <gradient> <clipPath>...
      */
    /* private */ @JSName("$def")
    var $def: Any = js.native
    
    /* private */ var canvasConfig: Any = js.native
    
    def clear(entity: Double): Unit = js.native
    
    /* private */ var clearUnusedDefElement: Any = js.native
    
    /* private */ var contextService: Any = js.native
    
    def createOrUpdateFilter(`object`: DisplayObject[Any, Any], $el: SVGElement): Unit = js.native
    def createOrUpdateFilter(`object`: DisplayObject[Any, Any], $el: SVGElement, filters: js.Array[ParsedFilterStyleProperty]): Unit = js.native
    
    def createOrUpdateGradientAndPattern(
      `object`: DisplayObject[Any, Any],
      $el: SVGElement,
      parsedColor: js.Array[CSSGradientValue],
      name: String
    ): Unit = js.native
    def createOrUpdateGradientAndPattern(`object`: DisplayObject[Any, Any], $el: SVGElement, parsedColor: Pattern, name: String): Unit = js.native
    def createOrUpdateGradientAndPattern(`object`: DisplayObject[Any, Any], $el: SVGElement, parsedColor: CSSRGB, name: String): Unit = js.native
    
    def createOrUpdateShadow(`object`: DisplayObject[Any, Any], $el: SVGElement, name: String): Unit = js.native
    
    def getDefElement(): SVGDefsElement = js.native
    
    /* private */ var gradientCache: Any = js.native
    
    def init(): Unit = js.native
  }
}
