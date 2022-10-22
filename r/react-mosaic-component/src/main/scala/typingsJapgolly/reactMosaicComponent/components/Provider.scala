package typingsJapgolly.reactMosaicComponent.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.ProviderProps
import typingsJapgolly.reactMosaicComponent.libContextTypesMod.MosaicContext
import typingsJapgolly.reactMosaicComponent.libTypesMod.MosaicKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  inline def apply(value: MosaicContext[MosaicKey]): Default[js.Object] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ProviderProps[MosaicContext[MosaicKey]]]))
  }
  
  @JSImport("react-mosaic-component/lib/contextTypes", "MosaicContext.Provider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ProviderProps[MosaicContext[MosaicKey]]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
