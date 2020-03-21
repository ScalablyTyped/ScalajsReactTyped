package typingsJapgolly.storybookReactRouter

import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactRouter.mod.MemoryRouterProps
import typingsJapgolly.storybookAddons.typesMod.DecoratorFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storybook-react-router", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class StoryRouter protected ()
    extends Component[AnonLinks, ComponentState, js.Any] {
    def this(props: AnonLinks) = this()
    def this(props: AnonLinks, context: js.Any) = this()
  }
  
  def default(): DecoratorFunction[Element] = js.native
  def default(links: js.Object): DecoratorFunction[Element] = js.native
  def default(links: js.Object, routerProps: MemoryRouterProps): DecoratorFunction[Element] = js.native
  @js.native
  object StoryRouter extends TopLevel[ComponentType[AnonLinks]]
  
}

