package typingsJapgolly.rcTable

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.rcTable.anon.FnCall
import typingsJapgolly.rcTable.libInterfaceMod.GetComponentProps
import typingsJapgolly.rcTable.libInterfaceMod.GetRowKey
import typingsJapgolly.rcTable.libInterfaceMod.Key
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.MemoExoticComponent
import typingsJapgolly.react.mod.TdHTMLAttributes
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBodyMod extends Shortcut {
  
  @JSImport("rc-table/lib/Body", JSImport.Default)
  @js.native
  val default: MemoExoticComponent[FnCall] = js.native
  
  trait BodyProps[RecordType] extends StObject {
    
    var childrenColumnName: String
    
    var data: js.Array[RecordType]
    
    var emptyNode: Node
    
    var expandedKeys: Set[Key]
    
    var getRowKey: GetRowKey[RecordType]
    
    var measureColumnWidth: Boolean
    
    var onRow: GetComponentProps[RecordType]
    
    def rowExpandable(record: RecordType): Boolean
  }
  object BodyProps {
    
    inline def apply[RecordType](
      childrenColumnName: String,
      data: js.Array[RecordType],
      expandedKeys: Set[Key],
      getRowKey: (RecordType, /* index */ js.UndefOr[Double]) => Key,
      measureColumnWidth: Boolean,
      onRow: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] | TdHTMLAttributes[Any],
      rowExpandable: RecordType => Boolean
    ): BodyProps[RecordType] = {
      val __obj = js.Dynamic.literal(childrenColumnName = childrenColumnName.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], getRowKey = js.Any.fromFunction2(getRowKey), measureColumnWidth = measureColumnWidth.asInstanceOf[js.Any], onRow = js.Any.fromFunction2(onRow), rowExpandable = js.Any.fromFunction1(rowExpandable), emptyNode = null)
      __obj.asInstanceOf[BodyProps[RecordType]]
    }
    
    extension [Self <: BodyProps[?], RecordType](x: Self & BodyProps[RecordType]) {
      
      inline def setChildrenColumnName(value: String): Self = StObject.set(x, "childrenColumnName", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Array[RecordType]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: RecordType*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setEmptyNode(value: VdomNode): Self = StObject.set(x, "emptyNode", value.rawNode.asInstanceOf[js.Any])
      
      inline def setEmptyNodeNull: Self = StObject.set(x, "emptyNode", null)
      
      inline def setEmptyNodeVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "emptyNode", js.Array(value*))
      
      inline def setEmptyNodeVdomElement(value: VdomElement): Self = StObject.set(x, "emptyNode", value.rawElement.asInstanceOf[js.Any])
      
      inline def setExpandedKeys(value: Set[Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      inline def setGetRowKey(value: (RecordType, /* index */ js.UndefOr[Double]) => Key): Self = StObject.set(x, "getRowKey", js.Any.fromFunction2(value))
      
      inline def setMeasureColumnWidth(value: Boolean): Self = StObject.set(x, "measureColumnWidth", value.asInstanceOf[js.Any])
      
      inline def setOnRow(value: (RecordType, /* index */ js.UndefOr[Double]) => HTMLAttributes[Any] | TdHTMLAttributes[Any]): Self = StObject.set(x, "onRow", js.Any.fromFunction2(value))
      
      inline def setRowExpandable(value: RecordType => Boolean): Self = StObject.set(x, "rowExpandable", js.Any.fromFunction1(value))
    }
  }
  
  type _To = MemoExoticComponent[FnCall]
  
  /* This means you don't have to write `default`, but can instead just say `libBodyMod.foo` */
  override def _to: MemoExoticComponent[FnCall] = default
}
