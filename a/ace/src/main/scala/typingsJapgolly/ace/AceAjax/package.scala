package typingsJapgolly.ace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AceAjax {
  type CompletionCallback = js.Function2[
    /* error */ js.Error, 
    /* results */ js.Array[typingsJapgolly.ace.AceAjax.Completion], 
    scala.Unit
  ]
}
