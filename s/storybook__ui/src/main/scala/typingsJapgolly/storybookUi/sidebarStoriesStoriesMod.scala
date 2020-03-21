package typingsJapgolly.storybookUi

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.storybookUi.sidebarSidebarStoriesMod.StoriesProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/ui/dist/components/sidebar/SidebarStories.stories", JSImport.Namespace)
@js.native
object sidebarStoriesStoriesMod extends js.Object {
  def empty(): Element = js.native
  def loading(): Element = js.native
  def noRoot(): Element = js.native
  def withRoot(): Element = js.native
  @js.native
  object default extends js.Object {
    var component: FunctionComponent[StoriesProps] = js.native
    var decorators: js.Array[js.Function1[/* s */ _, Element]] = js.native
    var excludeStories: js.RegExp = js.native
    var title: String = js.native
  }
  
  @js.native
  object noRootData extends js.Object {
    var stories: js.Any = js.native
    var storyId: String = js.native
  }
  
  @js.native
  object withRootData extends js.Object {
    var stories: js.Any = js.native
    var storyId: String = js.native
  }
  
}

