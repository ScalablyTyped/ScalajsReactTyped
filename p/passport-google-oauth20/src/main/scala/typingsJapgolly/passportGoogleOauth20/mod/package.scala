package typingsJapgolly.passportGoogleOauth20

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type VerifyCallback = js.Function3[
    /* err */ js.UndefOr[java.lang.String | js.Error], 
    /* user */ js.UndefOr[js.Any], 
    /* info */ js.UndefOr[js.Any], 
    scala.Unit
  ]
}
