package typingsJapgolly.reactNepalMap.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNepalMap.mod.ProvinceMapPropsTypes
import typingsJapgolly.reactNepalMap.mod.itemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ProvinceMap {
  
  @JSImport("react-nepal-map", "ProvinceMap")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def containerClassName(value: String): this.type = set("containerClassName", value.asInstanceOf[js.Any])
    
    inline def hoverColor(value: String): this.type = set("hoverColor", value.asInstanceOf[js.Any])
    
    inline def onMapClick(value: /* item */ itemProps => Callback): this.type = set("onMapClick", js.Any.fromFunction1((t0: /* item */ itemProps) => value(t0).runNow()))
    
    inline def provinceColor(value: js.Array[String]): this.type = set("provinceColor", value.asInstanceOf[js.Any])
    
    inline def provinceColorVarargs(value: String*): this.type = set("provinceColor", js.Array(value*))
    
    inline def randomSectorColor(value: Boolean): this.type = set("randomSectorColor", value.asInstanceOf[js.Any])
    
    inline def sectorClassName(value: String): this.type = set("sectorClassName", value.asInstanceOf[js.Any])
    
    inline def stroke(value: String): this.type = set("stroke", value.asInstanceOf[js.Any])
    
    inline def strokeWidth(value: Double): this.type = set("strokeWidth", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ProvinceMap.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ProvinceMapPropsTypes): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
