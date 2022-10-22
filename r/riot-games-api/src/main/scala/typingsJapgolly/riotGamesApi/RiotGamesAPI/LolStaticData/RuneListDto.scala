package typingsJapgolly.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuneListDto extends StObject {
  
  var basic: BasicDataDto
  
  var data: js.Array[StringDictionary[RuneDto]]
  
  var `type`: String
  
  var version: String
}
object RuneListDto {
  
  inline def apply(basic: BasicDataDto, data: js.Array[StringDictionary[RuneDto]], `type`: String, version: String): RuneListDto = {
    val __obj = js.Dynamic.literal(basic = basic.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuneListDto]
  }
  
  extension [Self <: RuneListDto](x: Self) {
    
    inline def setBasic(value: BasicDataDto): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[StringDictionary[RuneDto]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: StringDictionary[RuneDto]*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
