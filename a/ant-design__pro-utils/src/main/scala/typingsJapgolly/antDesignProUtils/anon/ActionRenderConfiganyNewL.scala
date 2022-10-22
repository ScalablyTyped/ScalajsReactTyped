package typingsJapgolly.antDesignProUtils.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignProUtils.antDesignProUtilsStrings.Array
import typingsJapgolly.antDesignProUtils.antDesignProUtilsStrings.Map
import typingsJapgolly.antDesignProUtils.esUseEditableArrayMod.AddLineOptions
import typingsJapgolly.antDesignProUtils.esUseEditableArrayMod.NewLineConfig
import typingsJapgolly.antDesignProUtils.esUseEditableArrayMod.RecordKey
import typingsJapgolly.rcFieldForm.esInterfaceMod.NamePath
import typingsJapgolly.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @ant-design/pro-utils.@ant-design/pro-utils/es/useEditableArray.ActionRenderConfig<any, @ant-design/pro-utils.@ant-design/pro-utils/es/useEditableArray.NewLineConfig<any>> & {  row :any} */
trait ActionRenderConfiganyNewL extends StObject {
  
  var addEditRecord: js.UndefOr[js.Function2[/* row */ Any, /* options */ js.UndefOr[AddLineOptions], Boolean]] = js.undefined
  
  def cancelEditable(key: RecordKey): Unit
  
  var cancelText: js.UndefOr[Node] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var deletePopconfirmMessage: js.UndefOr[Node] = js.undefined
  
  var deleteText: js.UndefOr[Node] = js.undefined
  
  var editableKeys: js.UndefOr[js.Array[Key]] = js.undefined
  
  var editorType: js.UndefOr[Array | Map] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var newLineConfig: js.UndefOr[NewLineConfig[Any]] = js.undefined
  
  var onCancel: js.UndefOr[
    js.Function4[
      /* key */ RecordKey, 
      /* record */ Any & `0`, 
      /* originRow */ Any & `0`, 
      /* newLineConfig */ js.UndefOr[NewLineConfig[Any]], 
      js.Promise[Any | Unit]
    ]
  ] = js.undefined
  
  var onDelete: js.UndefOr[js.Function2[/* key */ RecordKey, /* row */ Any & `0`, js.Promise[Any | Unit]]] = js.undefined
  
  var onSave: js.UndefOr[
    js.Function4[
      /* key */ RecordKey, 
      /* record */ Any & `0`, 
      /* originRow */ Any & `0`, 
      /* newLineConfig */ js.UndefOr[NewLineConfig[Any]], 
      js.Promise[Any | Unit]
    ]
  ] = js.undefined
  
  var recordKey: RecordKey
  
  var row: Any
  
  var saveText: js.UndefOr[Node] = js.undefined
  
  def setEditableRowKeys(value: js.Array[Key]): Unit
  
  var tableName: js.UndefOr[NamePath] = js.undefined
}
object ActionRenderConfiganyNewL {
  
  inline def apply(
    cancelEditable: RecordKey => Callback,
    recordKey: RecordKey,
    row: Any,
    setEditableRowKeys: js.Array[Key] => Callback
  ): ActionRenderConfiganyNewL = {
    val __obj = js.Dynamic.literal(cancelEditable = js.Any.fromFunction1((t0: RecordKey) => cancelEditable(t0).runNow()), recordKey = recordKey.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], setEditableRowKeys = js.Any.fromFunction1((t0: js.Array[Key]) => setEditableRowKeys(t0).runNow()))
    __obj.asInstanceOf[ActionRenderConfiganyNewL]
  }
  
  extension [Self <: ActionRenderConfiganyNewL](x: Self) {
    
    inline def setAddEditRecord(value: (/* row */ Any, /* options */ js.UndefOr[AddLineOptions]) => Boolean): Self = StObject.set(x, "addEditRecord", js.Any.fromFunction2(value))
    
    inline def setAddEditRecordUndefined: Self = StObject.set(x, "addEditRecord", js.undefined)
    
    inline def setCancelEditable(value: RecordKey => Callback): Self = StObject.set(x, "cancelEditable", js.Any.fromFunction1((t0: RecordKey) => value(t0).runNow()))
    
    inline def setCancelText(value: VdomNode): Self = StObject.set(x, "cancelText", value.rawNode.asInstanceOf[js.Any])
    
    inline def setCancelTextNull: Self = StObject.set(x, "cancelText", null)
    
    inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
    
    inline def setCancelTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "cancelText", js.Array(value*))
    
    inline def setCancelTextVdomElement(value: VdomElement): Self = StObject.set(x, "cancelText", value.rawElement.asInstanceOf[js.Any])
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setDeletePopconfirmMessage(value: VdomNode): Self = StObject.set(x, "deletePopconfirmMessage", value.rawNode.asInstanceOf[js.Any])
    
    inline def setDeletePopconfirmMessageNull: Self = StObject.set(x, "deletePopconfirmMessage", null)
    
    inline def setDeletePopconfirmMessageUndefined: Self = StObject.set(x, "deletePopconfirmMessage", js.undefined)
    
    inline def setDeletePopconfirmMessageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "deletePopconfirmMessage", js.Array(value*))
    
    inline def setDeletePopconfirmMessageVdomElement(value: VdomElement): Self = StObject.set(x, "deletePopconfirmMessage", value.rawElement.asInstanceOf[js.Any])
    
    inline def setDeleteText(value: VdomNode): Self = StObject.set(x, "deleteText", value.rawNode.asInstanceOf[js.Any])
    
    inline def setDeleteTextNull: Self = StObject.set(x, "deleteText", null)
    
    inline def setDeleteTextUndefined: Self = StObject.set(x, "deleteText", js.undefined)
    
    inline def setDeleteTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "deleteText", js.Array(value*))
    
    inline def setDeleteTextVdomElement(value: VdomElement): Self = StObject.set(x, "deleteText", value.rawElement.asInstanceOf[js.Any])
    
    inline def setEditableKeys(value: js.Array[Key]): Self = StObject.set(x, "editableKeys", value.asInstanceOf[js.Any])
    
    inline def setEditableKeysUndefined: Self = StObject.set(x, "editableKeys", js.undefined)
    
    inline def setEditableKeysVarargs(value: Key*): Self = StObject.set(x, "editableKeys", js.Array(value*))
    
    inline def setEditorType(value: Array | Map): Self = StObject.set(x, "editorType", value.asInstanceOf[js.Any])
    
    inline def setEditorTypeUndefined: Self = StObject.set(x, "editorType", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setNewLineConfig(value: NewLineConfig[Any]): Self = StObject.set(x, "newLineConfig", value.asInstanceOf[js.Any])
    
    inline def setNewLineConfigUndefined: Self = StObject.set(x, "newLineConfig", js.undefined)
    
    inline def setOnCancel(
      value: (/* key */ RecordKey, /* record */ Any & `0`, /* originRow */ Any & `0`, /* newLineConfig */ js.UndefOr[NewLineConfig[Any]]) => js.Promise[Any | Unit]
    ): Self = StObject.set(x, "onCancel", js.Any.fromFunction4(value))
    
    inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
    
    inline def setOnDelete(value: (/* key */ RecordKey, /* row */ Any & `0`) => js.Promise[Any | Unit]): Self = StObject.set(x, "onDelete", js.Any.fromFunction2(value))
    
    inline def setOnDeleteUndefined: Self = StObject.set(x, "onDelete", js.undefined)
    
    inline def setOnSave(
      value: (/* key */ RecordKey, /* record */ Any & `0`, /* originRow */ Any & `0`, /* newLineConfig */ js.UndefOr[NewLineConfig[Any]]) => js.Promise[Any | Unit]
    ): Self = StObject.set(x, "onSave", js.Any.fromFunction4(value))
    
    inline def setOnSaveUndefined: Self = StObject.set(x, "onSave", js.undefined)
    
    inline def setRecordKey(value: RecordKey): Self = StObject.set(x, "recordKey", value.asInstanceOf[js.Any])
    
    inline def setRecordKeyVarargs(value: Key*): Self = StObject.set(x, "recordKey", js.Array(value*))
    
    inline def setRow(value: Any): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setSaveText(value: VdomNode): Self = StObject.set(x, "saveText", value.rawNode.asInstanceOf[js.Any])
    
    inline def setSaveTextNull: Self = StObject.set(x, "saveText", null)
    
    inline def setSaveTextUndefined: Self = StObject.set(x, "saveText", js.undefined)
    
    inline def setSaveTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "saveText", js.Array(value*))
    
    inline def setSaveTextVdomElement(value: VdomElement): Self = StObject.set(x, "saveText", value.rawElement.asInstanceOf[js.Any])
    
    inline def setSetEditableRowKeys(value: js.Array[Key] => Callback): Self = StObject.set(x, "setEditableRowKeys", js.Any.fromFunction1((t0: js.Array[Key]) => value(t0).runNow()))
    
    inline def setTableName(value: NamePath): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
    
    inline def setTableNameVarargs(value: (String | Double)*): Self = StObject.set(x, "tableName", js.Array(value*))
  }
}
