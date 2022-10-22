package typingsJapgolly.antDesignIcons.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.antDesignIcons.esComponentsContextMod.IconContextProps
import typingsJapgolly.react.mod.ProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IconProvider {
  
  inline def apply(value: IconContextProps): Default[js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[IconContextProps]]))
  }
  
  @JSImport("@ant-design/icons/es", "IconProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ProviderProps[IconContextProps]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
