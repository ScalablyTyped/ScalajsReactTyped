package typingsJapgolly.ngtoaster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type IToastCallback = js.Function1[/* toast */ typingsJapgolly.ngtoaster.mod.IToast, scala.Unit]
  type IToastEventListener = js.Function3[
    /* event */ typingsJapgolly.std.Event_, 
    /* toasterId */ scala.Double, 
    /* toastId */ java.lang.String | scala.Double, 
    scala.Unit
  ]
}
