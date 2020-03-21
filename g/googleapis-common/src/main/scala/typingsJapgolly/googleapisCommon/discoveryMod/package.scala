package typingsJapgolly.googleapisCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object discoveryMod {
  type EndpointCreator = js.Function2[
    /* options */ typingsJapgolly.googleapisCommon.apiMod.GlobalOptions, 
    /* google */ js.Object, 
    typingsJapgolly.googleapisCommon.endpointMod.Endpoint
  ]
}
