package typingsJapgolly.momentRound.mod

import typingsJapgolly.momentRound.momentRoundStrings.ceil
import typingsJapgolly.momentRound.momentRoundStrings.floor
import typingsJapgolly.momentRound.momentRoundStrings.round
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("moment", JSImport.Namespace)
@js.native
object momentAugmentingMod extends js.Object {
  @js.native
  trait Moment extends js.Object {
    def ceil(precision: Double, key: String): Moment = js.native
    def floor(precision: Double, key: String): Moment = js.native
    def round(precision: Double, key: String): Moment = js.native
    @JSName("round")
    def round_ceil(precision: Double, key: String, direction: ceil): Moment = js.native
    @JSName("round")
    def round_floor(precision: Double, key: String, direction: floor): Moment = js.native
    @JSName("round")
    def round_round(precision: Double, key: String, direction: round): Moment = js.native
  }
  
}

