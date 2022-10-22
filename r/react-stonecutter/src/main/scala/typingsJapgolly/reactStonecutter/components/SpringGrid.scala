package typingsJapgolly.reactStonecutter.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactStonecutter.mod.AngleUnit
import typingsJapgolly.reactStonecutter.mod.Layout_
import typingsJapgolly.reactStonecutter.mod.LengthUnit
import typingsJapgolly.reactStonecutter.mod.SpringGridProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SpringGrid {
  
  inline def apply(columnWidth: Double, columns: Double): Builder = {
    val __props = js.Dynamic.literal(columnWidth = columnWidth.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SpringGridProps]))
  }
  
  @JSImport("react-stonecutter", "SpringGrid")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactStonecutter.mod.SpringGrid] {
    
    inline def angleUnit(value: AngleUnit): this.type = set("angleUnit", value.asInstanceOf[js.Any])
    
    inline def component(value: String): this.type = set("component", value.asInstanceOf[js.Any])
    
    inline def enter(value: (/* itemProps */ js.Array[Any], /* gridProps */ js.Array[Any], /* gridState */ Any) => Any): this.type = set("enter", js.Any.fromFunction3(value))
    
    inline def entered(value: (/* itemProps */ js.Array[Any], /* gridProps */ js.Array[Any], /* gridState */ Any) => Any): this.type = set("entered", js.Any.fromFunction3(value))
    
    inline def exit(value: (/* itemProps */ js.Array[Any], /* gridProps */ js.Array[Any], /* gridState */ Any) => Any): this.type = set("exit", js.Any.fromFunction3(value))
    
    inline def gutterHeight(value: Double): this.type = set("gutterHeight", value.asInstanceOf[js.Any])
    
    inline def gutterWidth(value: Double): this.type = set("gutterWidth", value.asInstanceOf[js.Any])
    
    inline def layout(value: (/* itemProps */ js.Array[Any], /* gridProps */ js.Array[Any]) => Layout_): this.type = set("layout", js.Any.fromFunction2(value))
    
    inline def lengthUnit(value: LengthUnit): this.type = set("lengthUnit", value.asInstanceOf[js.Any])
    
    inline def perspective(value: Double): this.type = set("perspective", value.asInstanceOf[js.Any])
    
    inline def springConfig(value: Any): this.type = set("springConfig", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SpringGridProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
