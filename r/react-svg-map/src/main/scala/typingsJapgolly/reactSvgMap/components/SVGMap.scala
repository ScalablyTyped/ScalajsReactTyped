package typingsJapgolly.reactSvgMap.components

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactSvgMap.mod.Map
import typingsJapgolly.reactSvgMap.mod.SVGMapProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SVGMap {
  
  inline def apply(map: Map): Builder = {
    val __props = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SVGMapProps]))
  }
  
  @JSImport("react-svg-map", "SVGMap")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def childrenAfter(value: VdomElement): this.type = set("childrenAfter", value.rawElement.asInstanceOf[js.Any])
    
    inline def childrenBefore(value: VdomElement): this.type = set("childrenBefore", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def isLocationSelected(value: /* repeated */ Any => Any): this.type = set("isLocationSelected", js.Any.fromFunction1(value))
    
    inline def locationClassName(value: String | (js.Function1[/* repeated */ Any, Any])): this.type = set("locationClassName", value.asInstanceOf[js.Any])
    
    inline def locationClassNameFunction1(value: /* repeated */ Any => Any): this.type = set("locationClassName", js.Any.fromFunction1(value))
    
    inline def locationRole(value: String): this.type = set("locationRole", value.asInstanceOf[js.Any])
    
    inline def locationTabIndex(value: String | (js.Function1[/* repeated */ Any, Any])): this.type = set("locationTabIndex", value.asInstanceOf[js.Any])
    
    inline def locationTabIndexFunction1(value: /* repeated */ Any => Any): this.type = set("locationTabIndex", js.Any.fromFunction1(value))
    
    inline def onLocationBlur(value: /* repeated */ Any => Any): this.type = set("onLocationBlur", js.Any.fromFunction1(value))
    
    inline def onLocationClick(value: /* repeated */ Any => Any): this.type = set("onLocationClick", js.Any.fromFunction1(value))
    
    inline def onLocationFocus(value: /* repeated */ Any => Any): this.type = set("onLocationFocus", js.Any.fromFunction1(value))
    
    inline def onLocationKeyDown(value: /* repeated */ Any => Any): this.type = set("onLocationKeyDown", js.Any.fromFunction1(value))
    
    inline def onLocationMouseMove(value: /* repeated */ Any => Any): this.type = set("onLocationMouseMove", js.Any.fromFunction1(value))
    
    inline def onLocationMouseOut(value: /* repeated */ Any => Any): this.type = set("onLocationMouseOut", js.Any.fromFunction1(value))
    
    inline def onLocationMouseOver(value: /* repeated */ Any => Any): this.type = set("onLocationMouseOver", js.Any.fromFunction1(value))
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SVGMapProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
