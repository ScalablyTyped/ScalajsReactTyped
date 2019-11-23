package typingsJapgolly.atStorybookAddons.distTypesMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.atStorybookAddons.distMod.Addon
import typingsJapgolly.atStorybookAddons.distMod.MatchOptions
import typingsJapgolly.atStorybookAddons.distMod.RenderOptions
import typingsJapgolly.atStorybookAddons.distMod.RouteOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientApiAddon[StoryFnReturnType] extends Addon {
  @JSName("apply")
  def apply(a: StoryApi[StoryFnReturnType], b: js.Array[_]): js.Any
}

object ClientApiAddon {
  @scala.inline
  def apply[StoryFnReturnType](
    apply: (StoryApi[StoryFnReturnType], js.Array[js.Any]) => CallbackTo[js.Any],
    render: RenderOptions => CallbackTo[Element],
    title: String,
    id: String = null,
    `match`: /* matchOptions */ MatchOptions => CallbackTo[Boolean] = null,
    paramKey: String = null,
    route: /* routeOptions */ RouteOptions => CallbackTo[String] = null,
    `type`: Types = null
  ): ClientApiAddon[StoryFnReturnType] = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("apply")(js.Any.fromFunction2((t0: typingsJapgolly.atStorybookAddons.distTypesMod.StoryApi[StoryFnReturnType], t1: js.Array[js.Any]) => apply(t0, t1).runNow()))
    __obj.updateDynamic("render")(js.Any.fromFunction1((t0: typingsJapgolly.atStorybookAddons.distMod.RenderOptions) => render(t0).runNow()))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(js.Any.fromFunction1((t0: /* matchOptions */ typingsJapgolly.atStorybookAddons.distMod.MatchOptions) => `match`(t0).runNow()))
    if (paramKey != null) __obj.updateDynamic("paramKey")(paramKey.asInstanceOf[js.Any])
    if (route != null) __obj.updateDynamic("route")(js.Any.fromFunction1((t0: /* routeOptions */ typingsJapgolly.atStorybookAddons.distMod.RouteOptions) => route(t0).runNow()))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientApiAddon[StoryFnReturnType]]
  }
}

