package typingsJapgolly.rcSelect

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.rcSelect.anon.Selected
import typingsJapgolly.rcSelect.anon.`0`
import typingsJapgolly.rcSelect.libBaseSelectMod.RawValueType
import typingsJapgolly.rcSelect.libBaseSelectMod.RenderNode
import typingsJapgolly.rcSelect.libInterfaceMod.FlattenOptionData
import typingsJapgolly.rcSelect.libSelectMod.BaseOptionType
import typingsJapgolly.rcSelect.libSelectMod.FieldNames
import typingsJapgolly.rcSelect.libSelectMod.OnActiveValue
import typingsJapgolly.rcSelect.libSelectMod.OnInternalSelect
import typingsJapgolly.react.mod.Context
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSelectContextMod extends Shortcut {
  
  @JSImport("rc-select/lib/SelectContext", JSImport.Default)
  @js.native
  val default: Context[SelectContextProps] = js.native
  
  trait SelectContextProps extends StObject {
    
    var childrenAsData: js.UndefOr[Boolean] = js.undefined
    
    var defaultActiveFirstOption: js.UndefOr[Boolean] = js.undefined
    
    var fieldNames: js.UndefOr[FieldNames] = js.undefined
    
    var flattenOptions: js.Array[FlattenOptionData[BaseOptionType]]
    
    var listHeight: js.UndefOr[Double] = js.undefined
    
    var listItemHeight: js.UndefOr[Double] = js.undefined
    
    var menuItemSelectedIcon: js.UndefOr[RenderNode] = js.undefined
    
    var onActiveValue: OnActiveValue
    
    var onSelect: OnInternalSelect
    
    var options: js.Array[BaseOptionType]
    
    var rawValues: Set[RawValueType]
    
    var virtual: js.UndefOr[Boolean] = js.undefined
  }
  object SelectContextProps {
    
    inline def apply(
      flattenOptions: js.Array[FlattenOptionData[BaseOptionType]],
      onActiveValue: (/* active */ typingsJapgolly.rcSelect.libSelectMod.RawValueType, /* index */ Double, /* info */ js.UndefOr[`0`]) => Callback,
      onSelect: (/* value */ typingsJapgolly.rcSelect.libSelectMod.RawValueType, /* info */ Selected) => Callback,
      options: js.Array[BaseOptionType],
      rawValues: Set[RawValueType]
    ): SelectContextProps = {
      val __obj = js.Dynamic.literal(flattenOptions = flattenOptions.asInstanceOf[js.Any], onActiveValue = js.Any.fromFunction3((t0: /* active */ typingsJapgolly.rcSelect.libSelectMod.RawValueType, t1: /* index */ Double, t2: /* info */ js.UndefOr[`0`]) => (onActiveValue(t0, t1, t2)).runNow()), onSelect = js.Any.fromFunction2((t0: /* value */ typingsJapgolly.rcSelect.libSelectMod.RawValueType, t1: /* info */ Selected) => (onSelect(t0, t1)).runNow()), options = options.asInstanceOf[js.Any], rawValues = rawValues.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectContextProps]
    }
    
    extension [Self <: SelectContextProps](x: Self) {
      
      inline def setChildrenAsData(value: Boolean): Self = StObject.set(x, "childrenAsData", value.asInstanceOf[js.Any])
      
      inline def setChildrenAsDataUndefined: Self = StObject.set(x, "childrenAsData", js.undefined)
      
      inline def setDefaultActiveFirstOption(value: Boolean): Self = StObject.set(x, "defaultActiveFirstOption", value.asInstanceOf[js.Any])
      
      inline def setDefaultActiveFirstOptionUndefined: Self = StObject.set(x, "defaultActiveFirstOption", js.undefined)
      
      inline def setFieldNames(value: FieldNames): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
      
      inline def setFieldNamesUndefined: Self = StObject.set(x, "fieldNames", js.undefined)
      
      inline def setFlattenOptions(value: js.Array[FlattenOptionData[BaseOptionType]]): Self = StObject.set(x, "flattenOptions", value.asInstanceOf[js.Any])
      
      inline def setFlattenOptionsVarargs(value: FlattenOptionData[BaseOptionType]*): Self = StObject.set(x, "flattenOptions", js.Array(value*))
      
      inline def setListHeight(value: Double): Self = StObject.set(x, "listHeight", value.asInstanceOf[js.Any])
      
      inline def setListHeightUndefined: Self = StObject.set(x, "listHeight", js.undefined)
      
      inline def setListItemHeight(value: Double): Self = StObject.set(x, "listItemHeight", value.asInstanceOf[js.Any])
      
      inline def setListItemHeightUndefined: Self = StObject.set(x, "listItemHeight", js.undefined)
      
      inline def setMenuItemSelectedIcon(value: RenderNode): Self = StObject.set(x, "menuItemSelectedIcon", value.asInstanceOf[js.Any])
      
      inline def setMenuItemSelectedIconFunction1(value: /* props */ Any => Node): Self = StObject.set(x, "menuItemSelectedIcon", js.Any.fromFunction1(value))
      
      inline def setMenuItemSelectedIconNull: Self = StObject.set(x, "menuItemSelectedIcon", null)
      
      inline def setMenuItemSelectedIconUndefined: Self = StObject.set(x, "menuItemSelectedIcon", js.undefined)
      
      inline def setMenuItemSelectedIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "menuItemSelectedIcon", js.Array(value*))
      
      inline def setMenuItemSelectedIconVdomElement(value: VdomElement): Self = StObject.set(x, "menuItemSelectedIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnActiveValue(
        value: (/* active */ typingsJapgolly.rcSelect.libSelectMod.RawValueType, /* index */ Double, /* info */ js.UndefOr[`0`]) => Callback
      ): Self = StObject.set(x, "onActiveValue", js.Any.fromFunction3((t0: /* active */ typingsJapgolly.rcSelect.libSelectMod.RawValueType, t1: /* index */ Double, t2: /* info */ js.UndefOr[`0`]) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnSelect(
        value: (/* value */ typingsJapgolly.rcSelect.libSelectMod.RawValueType, /* info */ Selected) => Callback
      ): Self = StObject.set(x, "onSelect", js.Any.fromFunction2((t0: /* value */ typingsJapgolly.rcSelect.libSelectMod.RawValueType, t1: /* info */ Selected) => (value(t0, t1)).runNow()))
      
      inline def setOptions(value: js.Array[BaseOptionType]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: BaseOptionType*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setRawValues(value: Set[RawValueType]): Self = StObject.set(x, "rawValues", value.asInstanceOf[js.Any])
      
      inline def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
      
      inline def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
    }
  }
  
  type _To = Context[SelectContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `libSelectContextMod.foo` */
  override def _to: Context[SelectContextProps] = default
}
