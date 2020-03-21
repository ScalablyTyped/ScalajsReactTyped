package typingsJapgolly.storybookUi

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.storybookUi.sidebarMod.SidebarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/ui/dist/components/sidebar/Sidebar.stories", JSImport.Namespace)
@js.native
object sidebarStoriesMod extends js.Object {
  def loading(): Element = js.native
  def simple(): Element = js.native
  @js.native
  object default extends js.Object {
    var component: FunctionComponent[SidebarProps] = js.native
    var excludeStories: js.RegExp = js.native
    var title: String = js.native
  }
  
  @js.native
  object loadingData extends js.Object {
    var menu: js.Array[AnonId] = js.native
  }
  
  @js.native
  object simpleData extends js.Object {
    var menu: js.Array[AnonId] = js.native
    var stories: js.Any = js.native
    var storyId: String = js.native
  }
  
}

