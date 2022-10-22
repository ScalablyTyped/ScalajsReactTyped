package typingsJapgolly.reactabularTable.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactabularTable.anon.PartialCSSStyleDeclaratio
import typingsJapgolly.reactabularTable.mod.Column
import typingsJapgolly.reactabularTable.mod.ProviderProps
import typingsJapgolly.reactabularTable.mod.Renderers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  inline def apply(columns: js.Array[Column]): Builder = {
    val __props = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ProviderProps]))
  }
  
  @JSImport("reactabular-table", "Provider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactabularTable.mod.Provider] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def renderers(value: Renderers): this.type = set("renderers", value.asInstanceOf[js.Any])
    
    inline def style(value: PartialCSSStyleDeclaratio): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
