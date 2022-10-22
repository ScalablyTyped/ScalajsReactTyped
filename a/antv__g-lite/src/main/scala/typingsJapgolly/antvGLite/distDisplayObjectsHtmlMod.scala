package typingsJapgolly.antvGLite

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvGLite.distCssMod.CSSUnitValue
import typingsJapgolly.antvGLite.distCssParserTransformMod.ParsedTransform
import typingsJapgolly.antvGLite.distDisplayObjectsDisplayObjectMod.DisplayObject
import typingsJapgolly.antvGLite.distDomInterfacesMod.DisplayObjectConfig
import typingsJapgolly.antvGLite.distTypesMod.BaseStyleProps
import typingsJapgolly.antvGLite.distTypesMod.ParsedBaseStyleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDisplayObjectsHtmlMod {
  
  @JSImport("@antv/g-lite/dist/display-objects/HTML", "HTML")
  @js.native
  open class HTML () extends DisplayObject[HTMLStyleProps, ParsedHTMLStyleProps] {
    def this(hasStyleRest: DisplayObjectConfig[HTMLStyleProps]) = this()
    
    /**
      * return wrapper HTMLElement
      * * <div> in g-webgl/canvas
      * * <foreignObject> in g-svg
      */
    def getDomElement(): HTMLElement = js.native
  }
  
  trait HTMLStyleProps
    extends StObject
       with BaseStyleProps {
    
    var height: js.UndefOr[Double | String] = js.undefined
    
    var innerHTML: String | HTMLElement
    
    var width: js.UndefOr[Double | String] = js.undefined
    
    var x: js.UndefOr[Double | String] = js.undefined
    
    var y: js.UndefOr[Double | String] = js.undefined
  }
  object HTMLStyleProps {
    
    inline def apply(innerHTML: String | HTMLElement): HTMLStyleProps = {
      val __obj = js.Dynamic.literal(innerHTML = innerHTML.asInstanceOf[js.Any])
      __obj.asInstanceOf[HTMLStyleProps]
    }
    
    extension [Self <: HTMLStyleProps](x: Self) {
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setInnerHTML(value: String | HTMLElement): Self = StObject.set(x, "innerHTML", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait ParsedHTMLStyleProps
    extends StObject
       with ParsedBaseStyleProps {
    
    @JSName("$el")
    var $el: HTMLElement
    
    var height: CSSUnitValue
    
    var innerHTML: String | HTMLElement
    
    var width: CSSUnitValue
    
    var x: CSSUnitValue
    
    var y: CSSUnitValue
  }
  object ParsedHTMLStyleProps {
    
    inline def apply(
      $el: HTMLElement,
      height: CSSUnitValue,
      innerHTML: String | HTMLElement,
      transform: js.Array[ParsedTransform],
      width: CSSUnitValue,
      x: CSSUnitValue,
      y: CSSUnitValue
    ): ParsedHTMLStyleProps = {
      val __obj = js.Dynamic.literal($el = $el.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], innerHTML = innerHTML.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedHTMLStyleProps]
    }
    
    extension [Self <: ParsedHTMLStyleProps](x: Self) {
      
      inline def set$el(value: HTMLElement): Self = StObject.set(x, "$el", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: CSSUnitValue): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setInnerHTML(value: String | HTMLElement): Self = StObject.set(x, "innerHTML", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: CSSUnitValue): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: CSSUnitValue): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: CSSUnitValue): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
