package typingsJapgolly.antd.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.antd.libListMod.ListConsumerProps
import typingsJapgolly.react.mod.ConsumerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListConsumer {
  
  inline def apply(children: ListConsumerProps => japgolly.scalajs.react.facade.React.Node): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ConsumerProps[ListConsumerProps]]))
  }
  
  @JSImport("antd/lib/list", "ListConsumer")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ConsumerProps[ListConsumerProps]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
