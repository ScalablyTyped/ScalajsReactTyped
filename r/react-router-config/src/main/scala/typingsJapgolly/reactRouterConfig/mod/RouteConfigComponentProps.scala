package typingsJapgolly.reactRouterConfig.mod

import typingsJapgolly.history.mod.History
import typingsJapgolly.history.mod.Location
import typingsJapgolly.history.mod.LocationState
import typingsJapgolly.reactRouter.mod.RouteComponentProps
import typingsJapgolly.reactRouter.mod.StaticContext
import typingsJapgolly.reactRouter.mod.`match`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteConfigComponentProps[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typingsJapgolly.reactRouterConfig.reactRouterConfigStrings.RouteConfigComponentProps with js.Any */] extends RouteComponentProps[Params, StaticContext, LocationState] {
  var route: js.UndefOr[RouteConfig] = js.undefined
}

object RouteConfigComponentProps {
  @scala.inline
  def apply[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsJapgolly.reactRouterConfig.reactRouterConfigStrings.RouteConfigComponentProps with js.Any */](
    history: History[LocationState],
    location: Location[LocationState],
    `match`: `match`[Params],
    route: RouteConfig = null,
    staticContext: StaticContext = null
  ): RouteConfigComponentProps[Params] = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (route != null) __obj.updateDynamic("route")(route.asInstanceOf[js.Any])
    if (staticContext != null) __obj.updateDynamic("staticContext")(staticContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteConfigComponentProps[Params]]
  }
}

