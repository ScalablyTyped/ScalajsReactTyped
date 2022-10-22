package typingsJapgolly.rcTreeSelect

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.rcTree.esTreeMod.ExpandAction
import typingsJapgolly.rcTreeSelect.anon.Selected
import typingsJapgolly.rcTreeSelect.esTreeSelectMod.DefaultOptionType
import typingsJapgolly.rcTreeSelect.esTreeSelectMod.InternalFieldName
import typingsJapgolly.rcTreeSelect.esTreeSelectMod.OnInternalSelect
import typingsJapgolly.rcTreeSelect.esTreeSelectMod.RawValueType
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTreeSelectContextMod extends Shortcut {
  
  @JSImport("rc-tree-select/es/TreeSelectContext", JSImport.Default)
  @js.native
  val default: Context[TreeSelectContextProps] = js.native
  
  trait TreeSelectContextProps extends StObject {
    
    var dropdownMatchSelectWidth: js.UndefOr[Boolean | Double] = js.undefined
    
    var fieldNames: InternalFieldName
    
    var listHeight: Double
    
    var listItemHeight: Double
    
    var onSelect: OnInternalSelect
    
    var treeData: js.Array[DefaultOptionType]
    
    var treeExpandAction: js.UndefOr[ExpandAction] = js.undefined
    
    var virtual: js.UndefOr[Boolean] = js.undefined
  }
  object TreeSelectContextProps {
    
    inline def apply(
      fieldNames: InternalFieldName,
      listHeight: Double,
      listItemHeight: Double,
      onSelect: (/* value */ RawValueType, /* info */ Selected) => Callback,
      treeData: js.Array[DefaultOptionType]
    ): TreeSelectContextProps = {
      val __obj = js.Dynamic.literal(fieldNames = fieldNames.asInstanceOf[js.Any], listHeight = listHeight.asInstanceOf[js.Any], listItemHeight = listItemHeight.asInstanceOf[js.Any], onSelect = js.Any.fromFunction2((t0: /* value */ RawValueType, t1: /* info */ Selected) => (onSelect(t0, t1)).runNow()), treeData = treeData.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeSelectContextProps]
    }
    
    extension [Self <: TreeSelectContextProps](x: Self) {
      
      inline def setDropdownMatchSelectWidth(value: Boolean | Double): Self = StObject.set(x, "dropdownMatchSelectWidth", value.asInstanceOf[js.Any])
      
      inline def setDropdownMatchSelectWidthUndefined: Self = StObject.set(x, "dropdownMatchSelectWidth", js.undefined)
      
      inline def setFieldNames(value: InternalFieldName): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
      
      inline def setListHeight(value: Double): Self = StObject.set(x, "listHeight", value.asInstanceOf[js.Any])
      
      inline def setListItemHeight(value: Double): Self = StObject.set(x, "listItemHeight", value.asInstanceOf[js.Any])
      
      inline def setOnSelect(value: (/* value */ RawValueType, /* info */ Selected) => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction2((t0: /* value */ RawValueType, t1: /* info */ Selected) => (value(t0, t1)).runNow()))
      
      inline def setTreeData(value: js.Array[DefaultOptionType]): Self = StObject.set(x, "treeData", value.asInstanceOf[js.Any])
      
      inline def setTreeDataVarargs(value: DefaultOptionType*): Self = StObject.set(x, "treeData", js.Array(value*))
      
      inline def setTreeExpandAction(value: ExpandAction): Self = StObject.set(x, "treeExpandAction", value.asInstanceOf[js.Any])
      
      inline def setTreeExpandActionUndefined: Self = StObject.set(x, "treeExpandAction", js.undefined)
      
      inline def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
      
      inline def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
    }
  }
  
  type _To = Context[TreeSelectContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `esTreeSelectContextMod.foo` */
  override def _to: Context[TreeSelectContextProps] = default
}
