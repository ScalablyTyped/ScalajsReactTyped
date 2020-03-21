package typingsJapgolly.stompit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientMod {
  type MessageCallback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* message */ typingsJapgolly.stompit.clientMod.Message, 
    scala.Unit
  ]
}
