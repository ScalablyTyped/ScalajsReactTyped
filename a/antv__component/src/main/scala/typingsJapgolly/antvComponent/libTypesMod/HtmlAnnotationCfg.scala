package typingsJapgolly.antvComponent.libTypesMod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antvComponent.antvComponentStrings.bottom
import typingsJapgolly.antvComponent.antvComponentStrings.left
import typingsJapgolly.antvComponent.antvComponentStrings.middle
import typingsJapgolly.antvComponent.antvComponentStrings.right
import typingsJapgolly.antvComponent.antvComponentStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HtmlAnnotationCfg
  extends StObject
     with HtmlComponentCfg {
  
  /** X 方向对齐，默认 left */
  var alignX: js.UndefOr[left | middle | right] = js.undefined
  
  /** Y 方向对齐，默认 top */
  var alignY: js.UndefOr[top | middle | bottom] = js.undefined
  
  /** 自定义 html */
  var html: String | Double | HTMLElement | (js.Function1[/* container */ HTMLElement, Unit | String | Double | HTMLElement])
  
  /** zIndex 设置 */
  var zIndex: js.UndefOr[Double] = js.undefined
}
object HtmlAnnotationCfg {
  
  inline def apply(
    html: String | Double | HTMLElement | (js.Function1[/* container */ HTMLElement, Unit | String | Double | HTMLElement])
  ): HtmlAnnotationCfg = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlAnnotationCfg]
  }
  
  extension [Self <: HtmlAnnotationCfg](x: Self) {
    
    inline def setAlignX(value: left | middle | right): Self = StObject.set(x, "alignX", value.asInstanceOf[js.Any])
    
    inline def setAlignXUndefined: Self = StObject.set(x, "alignX", js.undefined)
    
    inline def setAlignY(value: top | middle | bottom): Self = StObject.set(x, "alignY", value.asInstanceOf[js.Any])
    
    inline def setAlignYUndefined: Self = StObject.set(x, "alignY", js.undefined)
    
    inline def setHtml(
      value: String | Double | HTMLElement | (js.Function1[/* container */ HTMLElement, Unit | String | Double | HTMLElement])
    ): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlFunction1(value: /* container */ HTMLElement => Unit | String | Double | HTMLElement): Self = StObject.set(x, "html", js.Any.fromFunction1(value))
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
