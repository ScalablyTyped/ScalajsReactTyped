package typingsJapgolly.riotGamesApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoDto extends js.Object {
  var attack: Double
  var defense: Double
  var difficulty: Double
  var magic: Double
}

object InfoDto {
  @scala.inline
  def apply(attack: Double, defense: Double, difficulty: Double, magic: Double): InfoDto = {
    val __obj = js.Dynamic.literal(attack = attack.asInstanceOf[js.Any], defense = defense.asInstanceOf[js.Any], difficulty = difficulty.asInstanceOf[js.Any], magic = magic.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InfoDto]
  }
}

