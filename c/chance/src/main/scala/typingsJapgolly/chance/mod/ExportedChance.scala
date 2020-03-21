package typingsJapgolly.chance.mod

import typingsJapgolly.chance.Chance.ChanceStatic
import typingsJapgolly.chance.Chance.Seed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportedChance extends ChanceStatic {
  @JSName("Chance")
  var Chance_Original: ExportedChance = js.native
  def Chance(): typingsJapgolly.chance.Chance.Chance = js.native
  def Chance(generator: js.Function0[_]): typingsJapgolly.chance.Chance.Chance = js.native
  def Chance(seed: Seed): typingsJapgolly.chance.Chance.Chance = js.native
}

