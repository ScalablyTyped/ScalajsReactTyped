package typingsJapgolly.voca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CountPredicate = js.Function3[
    /* character */ java.lang.String, 
    /* index */ scala.Double, 
    /* str */ java.lang.String, 
    scala.Boolean
  ]
  type ReplacementFunction = js.Function2[
    /* match */ js.UndefOr[java.lang.String], 
    /* repeated */ java.lang.String, 
    java.lang.String
  ]
}
