package typingsJapgolly.handsontable

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import org.scalajs.dom.MouseEvent
import typingsJapgolly.handsontable.coreMod.default
import typingsJapgolly.handsontable.pluginsBaseMod.BasePlugin
import typingsJapgolly.handsontable.pluginsContextMenuContextMenuMod.MenuConfig
import typingsJapgolly.handsontable.pluginsContextMenuContextMenuMod.PredefinedMenuItemKey
import typingsJapgolly.handsontable.pluginsContextMenuContextMenuMod.Selection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsDropdownMenuDropdownMenuMod {
  
  @JSImport("handsontable/plugins/dropdownMenu/dropdownMenu", "DropdownMenu")
  @js.native
  open class DropdownMenu protected () extends BasePlugin {
    def this(hotInstance: default) = this()
    
    def close(): Unit = js.native
    
    def executeCommand(
      commandName: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type any is not an array type */ params: Any
    ): Unit = js.native
    
    def isEnabled(): Boolean = js.native
    
    def open(event: Event): Unit = js.native
  }
  /* static members */
  object DropdownMenu {
    
    @JSImport("handsontable/plugins/dropdownMenu/dropdownMenu", "DropdownMenu")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("handsontable/plugins/dropdownMenu/dropdownMenu", "DropdownMenu.SEPARATOR")
    @js.native
    def SEPARATOR: SeparatorObject = js.native
    inline def SEPARATOR_=(x: SeparatorObject): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SEPARATOR")(x.asInstanceOf[js.Any])
  }
  
  trait DetailedSettings extends StObject {
    
    var callback: js.UndefOr[
        js.Function3[
          /* key */ String, 
          /* selection */ js.Array[Selection], 
          /* clickEvent */ MouseEvent, 
          Unit
        ]
      ] = js.undefined
    
    var items: js.Array[PredefinedMenuItemKey] | MenuConfig
  }
  object DetailedSettings {
    
    inline def apply(items: js.Array[PredefinedMenuItemKey] | MenuConfig): DetailedSettings = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetailedSettings]
    }
    
    extension [Self <: DetailedSettings](x: Self) {
      
      inline def setCallback(
        value: (/* key */ String, /* selection */ js.Array[Selection], /* clickEvent */ MouseEvent) => Callback
      ): Self = StObject.set(x, "callback", js.Any.fromFunction3((t0: /* key */ String, t1: /* selection */ js.Array[Selection], t2: /* clickEvent */ MouseEvent) => (value(t0, t1, t2)).runNow()))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setItems(value: js.Array[PredefinedMenuItemKey] | MenuConfig): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: PredefinedMenuItemKey*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
  
  trait SeparatorObject extends StObject {
    
    var name: String
  }
  object SeparatorObject {
    
    inline def apply(name: String): SeparatorObject = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SeparatorObject]
    }
    
    extension [Self <: SeparatorObject](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type Settings = Boolean | js.Array[PredefinedMenuItemKey] | DetailedSettings
}
