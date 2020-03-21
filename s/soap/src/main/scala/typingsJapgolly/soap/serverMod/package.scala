package typingsJapgolly.soap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object serverMod {
  type Response = typingsJapgolly.node.httpMod.ServerResponse
  type ServerType = typingsJapgolly.node.httpMod.Server | typingsJapgolly.soap.serverMod.IExpressApp
}
