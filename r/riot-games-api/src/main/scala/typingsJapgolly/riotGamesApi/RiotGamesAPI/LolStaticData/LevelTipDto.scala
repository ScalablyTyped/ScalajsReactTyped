package typingsJapgolly.riotGamesApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LevelTipDto extends js.Object {
  var effect: js.Array[String]
  var label: js.Array[String]
}

object LevelTipDto {
  @scala.inline
  def apply(effect: js.Array[String], label: js.Array[String]): LevelTipDto = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LevelTipDto]
  }
}

