package typingsJapgolly.typesettable

import typingsJapgolly.typesettable.abstractMeasurerMod.IDimensions
import typingsJapgolly.typesettable.measurerMod.Measurer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/measurers/characterMeasurer", JSImport.Namespace)
@js.native
object characterMeasurerMod extends js.Object {
  @js.native
  class CharacterMeasurer () extends Measurer {
    def _measureCharacter(c: String): IDimensions = js.native
  }
  
}

