package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object keymaster {
  type KeyHandler = js.Function2[
    /* keyboardEvent */ org.scalajs.dom.raw.KeyboardEvent, 
    /* keymasterEvent */ typingsJapgolly.keymaster.KeymasterEvent, 
    scala.Unit
  ]
}
