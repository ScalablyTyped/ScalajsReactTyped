package typingsJapgolly.reactToastNotifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AddToast = js.Function3[
    /* content */ japgolly.scalajs.react.raw.React.Node, 
    /* options */ js.UndefOr[typingsJapgolly.reactToastNotifications.mod.Options], 
    /* callback */ js.UndefOr[js.Function1[/* id */ java.lang.String, scala.Unit]], 
    scala.Unit
  ]
  type RemoveAllToasts = js.Function0[scala.Unit]
  type RemoveToast = js.Function2[
    /* id */ java.lang.String, 
    /* callback */ js.UndefOr[js.Function0[scala.Unit]], 
    scala.Unit
  ]
  type UpdateToast = js.Function3[
    /* id */ java.lang.String, 
    /* options */ js.UndefOr[typingsJapgolly.reactToastNotifications.mod.Options], 
    /* callback */ js.UndefOr[js.Function1[/* id */ java.lang.String, scala.Unit]], 
    scala.Unit
  ]
}
