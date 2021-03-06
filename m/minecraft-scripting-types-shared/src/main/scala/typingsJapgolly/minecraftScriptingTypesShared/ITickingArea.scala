package typingsJapgolly.minecraftScriptingTypesShared

import typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.entity_ticking_area
import typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.level_ticking_area
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.minecraftScriptingTypesShared.IEntityTickingArea
  - typingsJapgolly.minecraftScriptingTypesShared.ILevelTickingArea
*/
trait ITickingArea extends _IMinecraftObject

object ITickingArea {
  @scala.inline
  def IEntityTickingArea(__type__ : entity_ticking_area, entity_ticking_area_id: Int64): ITickingArea = {
    val __obj = js.Dynamic.literal(__type__ = __type__.asInstanceOf[js.Any], entity_ticking_area_id = entity_ticking_area_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITickingArea]
  }
  @scala.inline
  def ILevelTickingArea(__type__ : level_ticking_area, level_ticking_area_id: String): ITickingArea = {
    val __obj = js.Dynamic.literal(__type__ = __type__.asInstanceOf[js.Any], level_ticking_area_id = level_ticking_area_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITickingArea]
  }
}

