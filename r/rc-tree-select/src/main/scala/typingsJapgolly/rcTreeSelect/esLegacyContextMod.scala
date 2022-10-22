package typingsJapgolly.rcTreeSelect

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.rcTree.esInterfaceMod.DataEntity
import typingsJapgolly.rcTree.esInterfaceMod.DataNode
import typingsJapgolly.rcTree.esInterfaceMod.IconType
import typingsJapgolly.rcTree.esTreeNodeMod.TreeNodeProps
import typingsJapgolly.rcTreeSelect.esInterfaceMod.Key
import typingsJapgolly.rcTreeSelect.esInterfaceMod.LegacyDataNode
import typingsJapgolly.rcTreeSelect.esInterfaceMod.RawValueType
import typingsJapgolly.react.mod.Context
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esLegacyContextMod extends Shortcut {
  
  @JSImport("rc-tree-select/es/LegacyContext", JSImport.Default)
  @js.native
  val default: Context[LegacyContextProps] = js.native
  
  trait LegacyContextProps extends StObject {
    
    var checkable: Boolean | Node
    
    var checkedKeys: js.Array[Key]
    
    var halfCheckedKeys: js.Array[Key]
    
    var keyEntities: Record[RawValueType, DataEntity[Any]]
    
    def loadData(treeNode: LegacyDataNode): js.Promise[Any]
    
    def onTreeExpand(keys: js.Array[Key]): Unit
    
    def onTreeLoad(loadedKeys: js.Array[Key]): Unit
    
    var showTreeIcon: Boolean
    
    var switcherIcon: IconType
    
    var treeDefaultExpandAll: Boolean
    
    var treeDefaultExpandedKeys: js.Array[Key]
    
    var treeExpandedKeys: js.Array[Key]
    
    var treeIcon: IconType
    
    var treeLine: Boolean
    
    var treeLoadedKeys: js.Array[Key]
    
    var treeMotion: Any
    
    var treeNodeFilterProp: String
  }
  object LegacyContextProps {
    
    inline def apply(
      checkedKeys: js.Array[Key],
      halfCheckedKeys: js.Array[Key],
      keyEntities: Record[RawValueType, DataEntity[Any]],
      loadData: LegacyDataNode => js.Promise[Any],
      onTreeExpand: js.Array[Key] => Callback,
      onTreeLoad: js.Array[Key] => Callback,
      showTreeIcon: Boolean,
      treeDefaultExpandAll: Boolean,
      treeDefaultExpandedKeys: js.Array[Key],
      treeExpandedKeys: js.Array[Key],
      treeLine: Boolean,
      treeLoadedKeys: js.Array[Key],
      treeMotion: Any,
      treeNodeFilterProp: String
    ): LegacyContextProps = {
      val __obj = js.Dynamic.literal(checkedKeys = checkedKeys.asInstanceOf[js.Any], halfCheckedKeys = halfCheckedKeys.asInstanceOf[js.Any], keyEntities = keyEntities.asInstanceOf[js.Any], loadData = js.Any.fromFunction1(loadData), onTreeExpand = js.Any.fromFunction1((t0: js.Array[Key]) => onTreeExpand(t0).runNow()), onTreeLoad = js.Any.fromFunction1((t0: js.Array[Key]) => onTreeLoad(t0).runNow()), showTreeIcon = showTreeIcon.asInstanceOf[js.Any], treeDefaultExpandAll = treeDefaultExpandAll.asInstanceOf[js.Any], treeDefaultExpandedKeys = treeDefaultExpandedKeys.asInstanceOf[js.Any], treeExpandedKeys = treeExpandedKeys.asInstanceOf[js.Any], treeLine = treeLine.asInstanceOf[js.Any], treeLoadedKeys = treeLoadedKeys.asInstanceOf[js.Any], treeMotion = treeMotion.asInstanceOf[js.Any], treeNodeFilterProp = treeNodeFilterProp.asInstanceOf[js.Any], checkable = null, switcherIcon = null, treeIcon = null)
      __obj.asInstanceOf[LegacyContextProps]
    }
    
    extension [Self <: LegacyContextProps](x: Self) {
      
      inline def setCheckable(value: Boolean | Node): Self = StObject.set(x, "checkable", value.asInstanceOf[js.Any])
      
      inline def setCheckableNull: Self = StObject.set(x, "checkable", null)
      
      inline def setCheckableVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "checkable", js.Array(value*))
      
      inline def setCheckableVdomElement(value: VdomElement): Self = StObject.set(x, "checkable", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "checkedKeys", value.asInstanceOf[js.Any])
      
      inline def setCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "checkedKeys", js.Array(value*))
      
      inline def setHalfCheckedKeys(value: js.Array[Key]): Self = StObject.set(x, "halfCheckedKeys", value.asInstanceOf[js.Any])
      
      inline def setHalfCheckedKeysVarargs(value: Key*): Self = StObject.set(x, "halfCheckedKeys", js.Array(value*))
      
      inline def setKeyEntities(value: Record[RawValueType, DataEntity[Any]]): Self = StObject.set(x, "keyEntities", value.asInstanceOf[js.Any])
      
      inline def setLoadData(value: LegacyDataNode => js.Promise[Any]): Self = StObject.set(x, "loadData", js.Any.fromFunction1(value))
      
      inline def setOnTreeExpand(value: js.Array[Key] => Callback): Self = StObject.set(x, "onTreeExpand", js.Any.fromFunction1((t0: js.Array[Key]) => value(t0).runNow()))
      
      inline def setOnTreeLoad(value: js.Array[Key] => Callback): Self = StObject.set(x, "onTreeLoad", js.Any.fromFunction1((t0: js.Array[Key]) => value(t0).runNow()))
      
      inline def setShowTreeIcon(value: Boolean): Self = StObject.set(x, "showTreeIcon", value.asInstanceOf[js.Any])
      
      inline def setSwitcherIcon(value: IconType): Self = StObject.set(x, "switcherIcon", value.asInstanceOf[js.Any])
      
      inline def setSwitcherIconFunction1(value: /* props */ TreeNodeProps[DataNode] => Node): Self = StObject.set(x, "switcherIcon", js.Any.fromFunction1(value))
      
      inline def setSwitcherIconNull: Self = StObject.set(x, "switcherIcon", null)
      
      inline def setSwitcherIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "switcherIcon", js.Array(value*))
      
      inline def setSwitcherIconVdomElement(value: VdomElement): Self = StObject.set(x, "switcherIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTreeDefaultExpandAll(value: Boolean): Self = StObject.set(x, "treeDefaultExpandAll", value.asInstanceOf[js.Any])
      
      inline def setTreeDefaultExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "treeDefaultExpandedKeys", value.asInstanceOf[js.Any])
      
      inline def setTreeDefaultExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "treeDefaultExpandedKeys", js.Array(value*))
      
      inline def setTreeExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "treeExpandedKeys", value.asInstanceOf[js.Any])
      
      inline def setTreeExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "treeExpandedKeys", js.Array(value*))
      
      inline def setTreeIcon(value: IconType): Self = StObject.set(x, "treeIcon", value.asInstanceOf[js.Any])
      
      inline def setTreeIconFunction1(value: /* props */ TreeNodeProps[DataNode] => Node): Self = StObject.set(x, "treeIcon", js.Any.fromFunction1(value))
      
      inline def setTreeIconNull: Self = StObject.set(x, "treeIcon", null)
      
      inline def setTreeIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "treeIcon", js.Array(value*))
      
      inline def setTreeIconVdomElement(value: VdomElement): Self = StObject.set(x, "treeIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTreeLine(value: Boolean): Self = StObject.set(x, "treeLine", value.asInstanceOf[js.Any])
      
      inline def setTreeLoadedKeys(value: js.Array[Key]): Self = StObject.set(x, "treeLoadedKeys", value.asInstanceOf[js.Any])
      
      inline def setTreeLoadedKeysVarargs(value: Key*): Self = StObject.set(x, "treeLoadedKeys", js.Array(value*))
      
      inline def setTreeMotion(value: Any): Self = StObject.set(x, "treeMotion", value.asInstanceOf[js.Any])
      
      inline def setTreeNodeFilterProp(value: String): Self = StObject.set(x, "treeNodeFilterProp", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Context[LegacyContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `esLegacyContextMod.foo` */
  override def _to: Context[LegacyContextProps] = default
}
