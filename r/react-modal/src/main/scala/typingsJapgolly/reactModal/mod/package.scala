package typingsJapgolly.reactModal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /** Describes unction that will be run after the modal has opened */
  type OnAfterOpenCallback = js.Function1[
    /* obj */ js.UndefOr[typingsJapgolly.reactModal.mod.OnAfterOpenCallbackOptions], 
    scala.Unit
  ]
}
