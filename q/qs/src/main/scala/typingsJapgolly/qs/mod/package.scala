package typingsJapgolly.qs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type defaultDecoder = js.Function3[
    /* str */ java.lang.String, 
    /* decoder */ js.UndefOr[js.Any], 
    /* charset */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  type defaultEncoder = js.Function3[
    /* str */ js.Any, 
    /* defaultEncoder */ js.UndefOr[js.Any], 
    /* charset */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
}
