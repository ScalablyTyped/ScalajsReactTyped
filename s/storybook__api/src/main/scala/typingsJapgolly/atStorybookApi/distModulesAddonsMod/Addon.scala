package typingsJapgolly.atStorybookApi.distModulesAddonsMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Addon extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var `match`: js.UndefOr[js.Function1[/* matchOptions */ MatchOptions, Boolean]] = js.undefined
  var paramKey: js.UndefOr[String] = js.undefined
  var route: js.UndefOr[js.Function1[/* routeOptions */ RouteOptions, String]] = js.undefined
  var title: String
  var `type`: js.UndefOr[Types] = js.undefined
  def render(renderOptions: RenderOptions): Element
}

object Addon {
  @scala.inline
  def apply(
    render: RenderOptions => CallbackTo[Element],
    title: String,
    id: String = null,
    `match`: /* matchOptions */ MatchOptions => CallbackTo[Boolean] = null,
    paramKey: String = null,
    route: /* routeOptions */ RouteOptions => CallbackTo[String] = null,
    `type`: Types = null
  ): Addon = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("render")(js.Any.fromFunction1((t0: typingsJapgolly.atStorybookApi.distModulesAddonsMod.RenderOptions) => render(t0).runNow()))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(js.Any.fromFunction1((t0: /* matchOptions */ typingsJapgolly.atStorybookApi.distModulesAddonsMod.MatchOptions) => `match`(t0).runNow()))
    if (paramKey != null) __obj.updateDynamic("paramKey")(paramKey.asInstanceOf[js.Any])
    if (route != null) __obj.updateDynamic("route")(js.Any.fromFunction1((t0: /* routeOptions */ typingsJapgolly.atStorybookApi.distModulesAddonsMod.RouteOptions) => route(t0).runNow()))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Addon]
  }
}

