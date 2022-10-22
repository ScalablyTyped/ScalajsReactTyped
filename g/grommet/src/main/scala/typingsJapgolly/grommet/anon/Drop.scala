package typingsJapgolly.grommet.anon

import typingsJapgolly.grommet.es6ComponentsDropMod.DropType
import typingsJapgolly.grommet.es6ThemesBaseMod.ButtonType
import typingsJapgolly.grommet.es6ThemesBaseMod.ExtendProps
import typingsJapgolly.grommet.es6ThemesBaseMod.ExtendType
import typingsJapgolly.grommet.es6ThemesBaseMod.ExtendValue
import typingsJapgolly.grommet.es6UtilsMod.BackgroundType
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Drop extends StObject {
  
  var background: js.UndefOr[BackgroundType] = js.undefined
  
  var drop: js.UndefOr[DropType] = js.undefined
  
  var extend: js.UndefOr[ExtendType[Record[String, Any]]] = js.undefined
  
  var group: js.UndefOr[Separator] = js.undefined
  
  var icons: js.UndefOr[Up] = js.undefined
  
  var item: js.UndefOr[ButtonType] = js.undefined
}
object Drop {
  
  inline def apply(): Drop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Drop]
  }
  
  extension [Self <: Drop](x: Self) {
    
    inline def setBackground(value: BackgroundType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setDrop(value: DropType): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
    
    inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    inline def setExtend(value: ExtendType[Record[String, Any]]): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    inline def setExtendFunction1(value: /* props */ ExtendProps[Record[String, Any]] => ExtendValue[Record[String, Any]]): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    inline def setGroup(value: Separator): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setIcons(value: Up): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setItem(value: ButtonType): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
