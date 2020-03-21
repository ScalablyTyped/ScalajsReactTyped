package typingsJapgolly.sockjsClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CLOSED = typingsJapgolly.sockjsClient.sockjsClientNumbers.`3`
  type CLOSING = typingsJapgolly.sockjsClient.sockjsClientNumbers.`2`
  type CONNECTING = typingsJapgolly.sockjsClient.sockjsClientNumbers.`0`
  type OPEN = typingsJapgolly.sockjsClient.sockjsClientNumbers.`1`
  type OpenEvent = typingsJapgolly.sockjsClient.mod.BaseEvent
  type SessionGenerator = js.Function0[java.lang.String]
  type State = typingsJapgolly.sockjsClient.mod.CONNECTING | typingsJapgolly.sockjsClient.mod.OPEN | typingsJapgolly.sockjsClient.mod.CLOSING | typingsJapgolly.sockjsClient.mod.CLOSED
}
