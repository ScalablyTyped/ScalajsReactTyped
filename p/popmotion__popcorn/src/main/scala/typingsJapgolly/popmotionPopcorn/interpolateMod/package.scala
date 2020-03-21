package typingsJapgolly.popmotionPopcorn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interpolateMod {
  type Mix[T] = js.Function1[/* v */ scala.Double, T]
  type MixEasing = typingsJapgolly.popmotionEasing.mod.Easing | js.Array[typingsJapgolly.popmotionEasing.mod.Easing]
  type MixerFactory[T] = js.Function2[/* from */ T, /* to */ T, typingsJapgolly.popmotionPopcorn.interpolateMod.Mix[T]]
}
