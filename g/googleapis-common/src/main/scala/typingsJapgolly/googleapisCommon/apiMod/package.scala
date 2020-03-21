package typingsJapgolly.googleapisCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object apiMod {
  type APIEndpoint = typingsJapgolly.googleapisCommon.endpointMod.Endpoint with js.Any
  type BodyResponseCallback[T] = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* res */ js.UndefOr[typingsJapgolly.gaxios.commonMod.GaxiosResponse[T] | scala.Null], 
    scala.Unit
  ]
}
