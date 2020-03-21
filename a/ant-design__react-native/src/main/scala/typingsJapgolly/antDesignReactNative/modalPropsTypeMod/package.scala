package typingsJapgolly.antDesignReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object modalPropsTypeMod {
  type Callback = js.Function2[
    /* valueOrLogin */ java.lang.String, 
    /* password */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type CallbackOnBackHandler = js.Function0[scala.Boolean]
  type CallbackOrActions[T] = typingsJapgolly.antDesignReactNative.modalPropsTypeMod.Callback | js.Array[typingsJapgolly.antDesignReactNative.modalPropsTypeMod.Action[T]]
}
