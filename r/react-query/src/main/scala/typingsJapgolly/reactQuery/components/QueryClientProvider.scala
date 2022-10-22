package typingsJapgolly.reactQuery.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactQuery.typesCoreMod.QueryClient
import typingsJapgolly.reactQuery.typesReactQueryClientProviderMod.QueryClientProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object QueryClientProvider {
  
  inline def apply(client: QueryClient): Builder = {
    val __props = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[QueryClientProviderProps]))
  }
  
  @JSImport("react-query", "QueryClientProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def contextSharing(value: Boolean): this.type = set("contextSharing", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: QueryClientProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
