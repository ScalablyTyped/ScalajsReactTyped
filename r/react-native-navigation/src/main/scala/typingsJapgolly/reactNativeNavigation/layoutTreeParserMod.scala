package typingsJapgolly.reactNativeNavigation

import typingsJapgolly.reactNativeNavigation.layoutMod.Layout
import typingsJapgolly.reactNativeNavigation.layoutTreeCrawlerMod.LayoutNode
import typingsJapgolly.reactNativeNavigation.uniqueIdProviderMod.UniqueIdProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation/lib/dist/commands/LayoutTreeParser", JSImport.Namespace)
@js.native
object layoutTreeParserMod extends js.Object {
  @js.native
  class LayoutTreeParser protected () extends js.Object {
    def this(uniqueIdProvider: UniqueIdProvider) = this()
    var bottomTabs: js.Any = js.native
    var component: js.Any = js.native
    var externalComponent: js.Any = js.native
    var sideMenu: js.Any = js.native
    var sideMenuChildren: js.Any = js.native
    var splitView: js.Any = js.native
    var stack: js.Any = js.native
    var topTabs: js.Any = js.native
    var uniqueIdProvider: js.Any = js.native
    def parse(api: Layout[js.Object]): LayoutNode = js.native
  }
  
}

