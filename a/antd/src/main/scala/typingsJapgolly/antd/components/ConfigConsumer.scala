package typingsJapgolly.antd.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.antd.libConfigProviderContextMod.ConfigConsumerProps
import typingsJapgolly.react.mod.ConsumerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ConfigConsumer {
  
  inline def apply(children: ConfigConsumerProps => japgolly.scalajs.react.facade.React.Node): Default[js.Object] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[ConsumerProps[ConfigConsumerProps]]))
  }
  
  @JSImport("antd/lib/config-provider", "ConfigConsumer")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ConsumerProps[ConfigConsumerProps]): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
