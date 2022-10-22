package typingsJapgolly.reactMosaicComponent.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.ConsumerProps
import typingsJapgolly.reactMosaicComponent.libContextTypesMod.MosaicContext
import typingsJapgolly.reactMosaicComponent.libTypesMod.MosaicKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Consumer {
  
  inline def apply(children: MosaicContext[MosaicKey] => Node): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ConsumerProps[MosaicContext[MosaicKey]]]))
  }
  
  @JSImport("react-mosaic-component/lib/contextTypes", "MosaicContext.Consumer")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ConsumerProps[MosaicContext[MosaicKey]]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
