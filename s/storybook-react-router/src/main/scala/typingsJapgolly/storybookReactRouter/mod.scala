package typingsJapgolly.storybookReactRouter

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactRouter.distLibComponentsMod.MemoryRouterProps
import typingsJapgolly.storybookAddons.distTs3Dot9TypesMod.DecoratorFunction
import typingsJapgolly.storybookReact.distTs3Dot9ClientPreviewTypesMod.StoryFnReactReturnType
import typingsJapgolly.storybookReactRouter.anon.Links
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("storybook-react-router", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): DecoratorFunction[StoryFnReactReturnType] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[DecoratorFunction[StoryFnReactReturnType]]
  inline def default(links: js.Object): DecoratorFunction[StoryFnReactReturnType] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(links.asInstanceOf[js.Any]).asInstanceOf[DecoratorFunction[StoryFnReactReturnType]]
  inline def default(links: js.Object, routerProps: MemoryRouterProps): DecoratorFunction[StoryFnReactReturnType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(links.asInstanceOf[js.Any], routerProps.asInstanceOf[js.Any])).asInstanceOf[DecoratorFunction[StoryFnReactReturnType]]
  inline def default(links: Unit, routerProps: MemoryRouterProps): DecoratorFunction[StoryFnReactReturnType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(links.asInstanceOf[js.Any], routerProps.asInstanceOf[js.Any])).asInstanceOf[DecoratorFunction[StoryFnReactReturnType]]
  
  @JSImport("storybook-react-router", "StoryRouter")
  @js.native
  val StoryRouter: ComponentType[Links] = js.native
}
