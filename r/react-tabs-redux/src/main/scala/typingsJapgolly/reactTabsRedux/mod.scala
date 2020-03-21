package typingsJapgolly.reactTabsRedux

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactTabsRedux.tabContentMod.TabContentProps
import typingsJapgolly.reactTabsRedux.tabLinkMod.TabLinkProps
import typingsJapgolly.reactTabsRedux.tabsMod.TabsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-tabs-redux", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class TabContent ()
    extends Component[TabContentProps, js.Object, js.Any]
  
  @js.native
  class TabLink ()
    extends Component[TabLinkProps, js.Object, js.Any]
  
  @js.native
  class Tabs ()
    extends Component[TabsProps, js.Object, js.Any]
  
}

