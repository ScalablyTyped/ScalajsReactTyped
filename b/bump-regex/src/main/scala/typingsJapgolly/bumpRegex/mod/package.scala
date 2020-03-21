package typingsJapgolly.bumpRegex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function2[
    /* err */ java.lang.String | js.Error | scala.Null, 
    /* opts */ js.UndefOr[typingsJapgolly.bumpRegex.mod.Result], 
    scala.Unit
  ]
}
