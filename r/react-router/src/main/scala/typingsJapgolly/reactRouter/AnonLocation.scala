package typingsJapgolly.reactRouter

import typingsJapgolly.history.mod.Location
import typingsJapgolly.history.mod.LocationState
import typingsJapgolly.reactRouter.mod.`match`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLocation[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typingsJapgolly.reactRouter.reactRouterStrings.AnonLocation with js.Any */] extends js.Object {
  var location: Location[LocationState]
  var `match`: typingsJapgolly.reactRouter.mod.`match`[Params]
}

object AnonLocation {
  @scala.inline
  def apply[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typingsJapgolly.reactRouter.reactRouterStrings.AnonLocation with js.Any */](location: Location[LocationState], `match`: `match`[Params]): AnonLocation[Params] = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLocation[Params]]
  }
}

