package typingsJapgolly.reactMdTable.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.ProviderProps
import typingsJapgolly.reactMdTable.anon.RequiredTableConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TableConfigProvider {
  
  inline def apply(value: RequiredTableConfig): Default[js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[RequiredTableConfig]]))
  }
  
  @JSImport("@react-md/table/types/config", "TableConfigProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ProviderProps[RequiredTableConfig]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
