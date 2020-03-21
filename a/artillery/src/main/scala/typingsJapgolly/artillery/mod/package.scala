package typingsJapgolly.artillery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EventEmitter = typingsJapgolly.node.eventsMod.EventEmitter
  type Next = js.Function1[/* err */ js.UndefOr[js.Error], scala.Unit]
  type RequestResponse = typingsJapgolly.request.mod.RequestResponse
  type ResponseRequest = typingsJapgolly.request.mod.ResponseRequest
}
