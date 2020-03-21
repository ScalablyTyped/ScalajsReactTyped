package typingsJapgolly.wegameApi.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object types {
  type SocketErrorCallback = js.Function1[/* res */ typingsJapgolly.wegameApi.AnonErrMsg, scala.Unit]
  type SocketMessageCallback = js.Function1[/* res */ typingsJapgolly.wegameApi.Anon0, scala.Unit]
  type SocketOpenCallback = js.Function1[/* res */ typingsJapgolly.wegameApi.Anon1, scala.Unit]
}
