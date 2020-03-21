package typingsJapgolly.typesettable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object abstractMeasurerMod {
  type IRuler = js.Function1[
    /* text */ java.lang.String, 
    typingsJapgolly.typesettable.abstractMeasurerMod.IDimensions
  ]
  type IRulerFactory = js.Function0[typingsJapgolly.typesettable.abstractMeasurerMod.IRuler]
}
