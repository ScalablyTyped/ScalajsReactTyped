package typingsJapgolly.storybookReactRouter.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactRouter.mod.MemoryRouterProps
import typingsJapgolly.storybookAddons.typesMod.StoryApi
import typingsJapgolly.storybookReactRouter.AnonLinks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StoryRouter {
  def apply(
    links: js.Object,
    routerProps: MemoryRouterProps,
    story: StoryApi[_],
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AnonLinks, typingsJapgolly.storybookReactRouter.mod.StoryRouter, Unit, AnonLinks] = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], routerProps = routerProps.asInstanceOf[js.Any], story = story.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.storybookReactRouter.AnonLinks, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.storybookReactRouter.mod.StoryRouter](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookReactRouter.AnonLinks])(children: _*)
  }
  @JSImport("storybook-react-router", "StoryRouter")
  @js.native
  object componentImport extends js.Object
  
}

