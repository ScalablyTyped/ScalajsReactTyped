package typingsJapgolly.reactFlex.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactFlex.mod.FlexProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Flex {
  
  @JSImport("react-flex", "Flex")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactFlex.mod.Flex] {
    
    inline def alignContent(value: String): this.type = set("alignContent", value.asInstanceOf[js.Any])
    
    inline def alignItems(value: String): this.type = set("alignItems", value.asInstanceOf[js.Any])
    
    inline def column(value: Boolean): this.type = set("column", value.asInstanceOf[js.Any])
    
    inline def display(value: String): this.type = set("display", value.asInstanceOf[js.Any])
    
    inline def flex(value: Double | String | Boolean): this.type = set("flex", value.asInstanceOf[js.Any])
    
    inline def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
    
    inline def justifyContent(value: String): this.type = set("justifyContent", value.asInstanceOf[js.Any])
    
    inline def reverse(value: Boolean): this.type = set("reverse", value.asInstanceOf[js.Any])
    
    inline def row(value: Boolean): this.type = set("row", value.asInstanceOf[js.Any])
    
    inline def style(value: Any): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def wrap(value: Boolean): this.type = set("wrap", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Flex.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FlexProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
