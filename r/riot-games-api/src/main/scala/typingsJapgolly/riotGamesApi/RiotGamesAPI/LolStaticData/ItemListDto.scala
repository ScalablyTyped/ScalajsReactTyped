package typingsJapgolly.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemListDto extends StObject {
  
  var basic: BasicDataDto
  
  var data: js.Array[StringDictionary[ItemDto]]
  
  var groups: js.Array[GroupDto]
  
  var tree: js.Array[ItemTreeDto]
  
  var `type`: String
  
  var version: String
}
object ItemListDto {
  
  inline def apply(
    basic: BasicDataDto,
    data: js.Array[StringDictionary[ItemDto]],
    groups: js.Array[GroupDto],
    tree: js.Array[ItemTreeDto],
    `type`: String,
    version: String
  ): ItemListDto = {
    val __obj = js.Dynamic.literal(basic = basic.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemListDto]
  }
  
  extension [Self <: ItemListDto](x: Self) {
    
    inline def setBasic(value: BasicDataDto): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[StringDictionary[ItemDto]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: StringDictionary[ItemDto]*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setGroups(value: js.Array[GroupDto]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsVarargs(value: GroupDto*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setTree(value: js.Array[ItemTreeDto]): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    
    inline def setTreeVarargs(value: ItemTreeDto*): Self = StObject.set(x, "tree", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
