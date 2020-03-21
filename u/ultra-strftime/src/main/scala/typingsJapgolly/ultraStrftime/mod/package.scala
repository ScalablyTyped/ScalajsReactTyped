package typingsJapgolly.ultraStrftime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type StrftimeFunction = js.Function3[
    /* fmt */ java.lang.String, 
    /* d */ js.UndefOr[js.Date], 
    /* options */ js.UndefOr[typingsJapgolly.ultraStrftime.mod.Options], 
    java.lang.String
  ]
}
