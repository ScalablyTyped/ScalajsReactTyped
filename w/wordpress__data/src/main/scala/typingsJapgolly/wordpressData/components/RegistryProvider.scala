package typingsJapgolly.wordpressData.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.ProviderProps
import typingsJapgolly.wordpressData.mod.DataRegistry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RegistryProvider {
  
  inline def apply(value: DataRegistry): Default[js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[DataRegistry]]))
  }
  
  @JSImport("@wordpress/data", "RegistryProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ProviderProps[DataRegistry]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
