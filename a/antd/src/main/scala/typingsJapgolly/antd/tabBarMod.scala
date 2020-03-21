package typingsJapgolly.antd

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.antd.contextMod.ConfigConsumerProps
import typingsJapgolly.antd.tabsMod.TabsProps
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/tabs/TabBar", JSImport.Namespace)
@js.native
object tabBarMod extends js.Object {
  @js.native
  trait TabBar
    extends Component[TabsProps, js.Object, js.Any] {
    def renderTabBar(hasDirection: ConfigConsumerProps): Element = js.native
  }
  
  @js.native
  class default () extends TabBar
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: AnonAnimated = js.native
  }
  
}

