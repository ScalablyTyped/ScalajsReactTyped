package typingsJapgolly.storybookReactRouter.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactRouter.distLibComponentsMod.MemoryRouterProps
import typingsJapgolly.storybookAddons.distTs3Dot9TypesMod.StoryApi
import typingsJapgolly.storybookReactRouter.anon.Links
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StoryRouter {
  
  inline def apply(links: js.Object, routerProps: MemoryRouterProps, story: StoryApi[Any]): Default[js.Object] = {
    val __props = js.Dynamic.literal(links = links.asInstanceOf[js.Any], routerProps = routerProps.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[Links]))
  }
  
  @JSImport("storybook-react-router", "StoryRouter")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Links): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
