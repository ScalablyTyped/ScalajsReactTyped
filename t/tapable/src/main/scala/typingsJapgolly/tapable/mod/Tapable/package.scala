package typingsJapgolly.tapable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Tapable {
  type CallbackFunction = js.Function3[
    /* err */ js.UndefOr[js.Error], 
    /* result */ js.UndefOr[js.Any], 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  type Handler = js.Function1[/* repeated */ js.Any, scala.Unit]
}
