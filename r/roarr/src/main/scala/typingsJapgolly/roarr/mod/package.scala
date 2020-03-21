package typingsJapgolly.roarr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type MessageEventHandlerType = js.Function1[/* message */ typingsJapgolly.roarr.mod.MessageType, scala.Unit]
  type SprintfArgumentType = java.lang.String | scala.Double | scala.Boolean | scala.Null
  type TranslateMessageFunctionType = js.Function1[
    /* message */ typingsJapgolly.roarr.mod.MessageType, 
    typingsJapgolly.roarr.mod.MessageType
  ]
}
