package typingsJapgolly.reactI18next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Namespace = java.lang.String | js.Array[java.lang.String]
  type Omit[T, K] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
  type UseTranslationResponse = (js.Tuple3[
    typingsJapgolly.i18next.mod.TFunction, 
    typingsJapgolly.i18next.mod.i18n, 
    scala.Boolean
  ]) with typingsJapgolly.reactI18next.AnonI18n
}
