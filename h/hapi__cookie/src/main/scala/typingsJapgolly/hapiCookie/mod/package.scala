package typingsJapgolly.hapiCookie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type RedirectToFunction = js.Function1[/* request */ js.UndefOr[typingsJapgolly.hapiHapi.mod.Request], java.lang.String]
  type ValidateFunction = js.Function2[
    /* request */ js.UndefOr[typingsJapgolly.hapiHapi.mod.Request], 
    /* session */ js.UndefOr[js.Object], 
    js.Promise[typingsJapgolly.hapiCookie.mod.ValidateResponse]
  ]
}
