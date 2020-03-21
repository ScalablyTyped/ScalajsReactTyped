package typingsJapgolly.storybookUi

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.storybookUi.sidebarSearchMod.PureSidebarSearchProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/ui/dist/components/sidebar/SidebarSearch.stories", JSImport.Namespace)
@js.native
object sidebarSearchStoriesMod extends js.Object {
  def filledIn(): Element = js.native
  def focussed(): Element = js.native
  def simple(): Element = js.native
  @js.native
  object default extends js.Object {
    var decorators: js.Array[js.Function1[/* storyFn */ _, Element]] = js.native
    var title: String = js.native
    def component(hasClassNameOnChangeProps: PureSidebarSearchProps): Element = js.native
  }
  
}

