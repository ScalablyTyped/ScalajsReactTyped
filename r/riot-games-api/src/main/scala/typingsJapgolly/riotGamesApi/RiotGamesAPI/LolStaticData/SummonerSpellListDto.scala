package typingsJapgolly.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SummonerSpellListDto extends js.Object {
  var data: js.Array[StringDictionary[SummonerSpellDto]]
  var `type`: String
  var version: String
}

object SummonerSpellListDto {
  @scala.inline
  def apply(data: js.Array[StringDictionary[SummonerSpellDto]], `type`: String, version: String): SummonerSpellListDto = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummonerSpellListDto]
  }
}

