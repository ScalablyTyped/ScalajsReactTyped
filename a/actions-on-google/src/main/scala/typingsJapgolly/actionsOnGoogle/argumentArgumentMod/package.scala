package typingsJapgolly.actionsOnGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object argumentArgumentMod {
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - `js.undefined`
    - typingsJapgolly.actionsOnGoogle.v2Mod.GoogleRpcStatus
    - scala.Boolean
    - java.lang.String
    - typingsJapgolly.actionsOnGoogle.v2Mod.GoogleActionsV2Location
    - typingsJapgolly.actionsOnGoogle.commonMod.ApiClientObjectMap[js.Any]
    - typingsJapgolly.actionsOnGoogle.v2Mod.GoogleActionsV2DateTime
  */
  type Argument = js.UndefOr[
    typingsJapgolly.actionsOnGoogle.argumentArgumentMod._Argument | typingsJapgolly.actionsOnGoogle.commonMod.ApiClientObjectMap[js.Any] | scala.Double | scala.Boolean | java.lang.String
  ]
  type ArgumentsIndexable = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.actionsOnGoogle.argumentArgumentMod.Argument]
  type ArgumentsRaw = /** @public */
  org.scalablytyped.runtime.StringDictionary[typingsJapgolly.actionsOnGoogle.v2Mod.GoogleActionsV2Argument]
  type ArgumentsStatus = /** @public */
  org.scalablytyped.runtime.StringDictionary[js.UndefOr[typingsJapgolly.actionsOnGoogle.v2Mod.GoogleRpcStatus]]
}
