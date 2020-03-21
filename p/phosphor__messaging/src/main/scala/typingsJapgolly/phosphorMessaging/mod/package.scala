package typingsJapgolly.phosphorMessaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type MessageHook = typingsJapgolly.phosphorMessaging.mod.IMessageHook | (js.Function2[
    /* handler */ typingsJapgolly.phosphorMessaging.mod.IMessageHandler, 
    /* msg */ typingsJapgolly.phosphorMessaging.mod.Message, 
    scala.Boolean
  ])
}
