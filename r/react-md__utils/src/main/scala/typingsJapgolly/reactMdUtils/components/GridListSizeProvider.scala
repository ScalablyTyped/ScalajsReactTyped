package typingsJapgolly.reactMdUtils.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.ProviderProps
import typingsJapgolly.reactMdUtils.typesLayoutUseGridListMod.GridListSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GridListSizeProvider {
  
  inline def apply(value: GridListSize): Default[js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[GridListSize]]))
  }
  
  @JSImport("@react-md/utils", "GridListSizeProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ProviderProps[GridListSize]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
