package typingsJapgolly.reactCurrencyFormatter.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactCurrencyFormatter.mod.CurrencyFormatterProps
import typingsJapgolly.reactCurrencyFormatter.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactCurrencyFormatter {
  
  inline def apply(quantity: Double): Builder = {
    val __props = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CurrencyFormatterProps]))
  }
  
  object ReactCurrencyFormatter {
    
    inline def apply(quantity: Double): typingsJapgolly.reactCurrencyFormatter.components.ReactCurrencyFormatter.ReactCurrencyFormatter.Builder = {
      val __props = js.Dynamic.literal(quantity = quantity.asInstanceOf[js.Any])
      new typingsJapgolly.reactCurrencyFormatter.components.ReactCurrencyFormatter.ReactCurrencyFormatter.Builder(js.Array(this.component, __props.asInstanceOf[CurrencyFormatterProps]))
    }
    
    @JSImport("react-currency-formatter", JSImport.Namespace)
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[^] {
      
      inline def currency(value: String): this.type = set("currency", value.asInstanceOf[js.Any])
      
      inline def decimal(value: String): this.type = set("decimal", value.asInstanceOf[js.Any])
      
      inline def group(value: String): this.type = set("group", value.asInstanceOf[js.Any])
      
      inline def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
      
      inline def pattern(value: String): this.type = set("pattern", value.asInstanceOf[js.Any])
      
      inline def symbol(value: String): this.type = set("symbol", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: CurrencyFormatterProps): typingsJapgolly.reactCurrencyFormatter.components.ReactCurrencyFormatter.ReactCurrencyFormatter.Builder = new typingsJapgolly.reactCurrencyFormatter.components.ReactCurrencyFormatter.ReactCurrencyFormatter.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("react-currency-formatter", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def currency(value: String): this.type = set("currency", value.asInstanceOf[js.Any])
    
    inline def decimal(value: String): this.type = set("decimal", value.asInstanceOf[js.Any])
    
    inline def group(value: String): this.type = set("group", value.asInstanceOf[js.Any])
    
    inline def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def pattern(value: String): this.type = set("pattern", value.asInstanceOf[js.Any])
    
    inline def symbol(value: String): this.type = set("symbol", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CurrencyFormatterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
