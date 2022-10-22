package typingsJapgolly.antDesignProUtils

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignProUtils.anon.ActionRender
import typingsJapgolly.antDesignProUtils.anon.ActionRenderConfiganyNewL
import typingsJapgolly.antDesignProUtils.anon.ChildrenColumnName
import typingsJapgolly.antDesignProUtils.anon.DataSource
import typingsJapgolly.antDesignProUtils.anon.Delete
import typingsJapgolly.antDesignProUtils.anon.FormRef
import typingsJapgolly.antDesignProUtils.anon.Row
import typingsJapgolly.antDesignProUtils.anon.`0`
import typingsJapgolly.antDesignProUtils.antDesignProUtilsStrings.Array
import typingsJapgolly.antDesignProUtils.antDesignProUtilsStrings.Map
import typingsJapgolly.antDesignProUtils.antDesignProUtilsStrings.bottom
import typingsJapgolly.antDesignProUtils.antDesignProUtilsStrings.cache
import typingsJapgolly.antDesignProUtils.antDesignProUtilsStrings.dataSource
import typingsJapgolly.antDesignProUtils.antDesignProUtilsStrings.delete
import typingsJapgolly.antDesignProUtils.antDesignProUtilsStrings.onFinish
import typingsJapgolly.antDesignProUtils.antDesignProUtilsStrings.top
import typingsJapgolly.antDesignProUtils.antDesignProUtilsStrings.update
import typingsJapgolly.antd.libFormFormMod.FormProps
import typingsJapgolly.antd.libFormHooksUseFormMod.FormInstance
import typingsJapgolly.rcFieldForm.esInterfaceMod.NamePath
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Omit
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUseEditableArrayMod {
  
  @JSImport("@ant-design/pro-utils/es/useEditableArray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/pro-utils/es/useEditableArray", "DeleteEditableAction")
  @js.native
  val DeleteEditableAction: FC[ActionRenderConfiganyNewL] = js.native
  
  inline def SaveEditableAction[T](
    hasRecordKeyOnSaveRowChildrenNewLineConfigEditorTypeTableName: (ActionRenderConfig[T, NewLineConfig[T]]) & Row
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SaveEditableAction")(hasRecordKeyOnSaveRowChildrenNewLineConfigEditorTypeTableName.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def defaultActionRender[T](row: T, config: ActionRenderConfig[T, NewLineConfig[T]]): js.Array[Element | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultActionRender")(row.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element | Null]]
  
  inline def editableRowByKey[RecordType](keyProps: ChildrenColumnName[RecordType], action: update | top | delete): js.Array[RecordType] = (^.asInstanceOf[js.Dynamic].applyDynamic("editableRowByKey")(keyProps.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[js.Array[RecordType]]
  
  inline def recordKeyToString(rowKey: RecordKey): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("recordKeyToString")(rowKey.asInstanceOf[js.Any]).asInstanceOf[Key]
  
  inline def useEditableArray[RecordType](props: RowEditableConfig[RecordType] & DataSource[RecordType]): ActionRender[RecordType] = ^.asInstanceOf[js.Dynamic].applyDynamic("useEditableArray")(props.asInstanceOf[js.Any]).asInstanceOf[ActionRender[RecordType]]
  
  trait ActionRenderConfig[T, LineConfig]
    extends StObject
       with ActionTypeText[T] {
    
    def cancelEditable(key: RecordKey): Unit
    
    var children: js.UndefOr[Node] = js.undefined
    
    var deletePopconfirmMessage: js.UndefOr[Node] = js.undefined
    
    var editableKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var newLineConfig: js.UndefOr[LineConfig] = js.undefined
    
    var onCancel: js.UndefOr[
        js.Function4[
          /* key */ RecordKey, 
          /* record */ T & `0`, 
          /* originRow */ T & `0`, 
          /* newLineConfig */ js.UndefOr[NewLineConfig[T]], 
          js.Promise[Any | Unit]
        ]
      ] = js.undefined
    
    var onDelete: js.UndefOr[js.Function2[/* key */ RecordKey, /* row */ T & `0`, js.Promise[Any | Unit]]] = js.undefined
    
    var onSave: js.UndefOr[
        js.Function4[
          /* key */ RecordKey, 
          /* record */ T & `0`, 
          /* originRow */ T & `0`, 
          /* newLineConfig */ js.UndefOr[NewLineConfig[T]], 
          js.Promise[Any | Unit]
        ]
      ] = js.undefined
    
    var recordKey: RecordKey
    
    def setEditableRowKeys(value: js.Array[Key]): Unit
    
    var tableName: js.UndefOr[NamePath] = js.undefined
  }
  object ActionRenderConfig {
    
    inline def apply[T, LineConfig](
      cancelEditable: RecordKey => Callback,
      recordKey: RecordKey,
      setEditableRowKeys: js.Array[Key] => Callback
    ): ActionRenderConfig[T, LineConfig] = {
      val __obj = js.Dynamic.literal(cancelEditable = js.Any.fromFunction1((t0: RecordKey) => cancelEditable(t0).runNow()), recordKey = recordKey.asInstanceOf[js.Any], setEditableRowKeys = js.Any.fromFunction1((t0: js.Array[Key]) => setEditableRowKeys(t0).runNow()))
      __obj.asInstanceOf[ActionRenderConfig[T, LineConfig]]
    }
    
    extension [Self <: ActionRenderConfig[?, ?], T, LineConfig](x: Self & (ActionRenderConfig[T, LineConfig])) {
      
      inline def setCancelEditable(value: RecordKey => Callback): Self = StObject.set(x, "cancelEditable", js.Any.fromFunction1((t0: RecordKey) => value(t0).runNow()))
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDeletePopconfirmMessage(value: VdomNode): Self = StObject.set(x, "deletePopconfirmMessage", value.rawNode.asInstanceOf[js.Any])
      
      inline def setDeletePopconfirmMessageNull: Self = StObject.set(x, "deletePopconfirmMessage", null)
      
      inline def setDeletePopconfirmMessageUndefined: Self = StObject.set(x, "deletePopconfirmMessage", js.undefined)
      
      inline def setDeletePopconfirmMessageVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "deletePopconfirmMessage", js.Array(value*))
      
      inline def setDeletePopconfirmMessageVdomElement(value: VdomElement): Self = StObject.set(x, "deletePopconfirmMessage", value.rawElement.asInstanceOf[js.Any])
      
      inline def setEditableKeys(value: js.Array[Key]): Self = StObject.set(x, "editableKeys", value.asInstanceOf[js.Any])
      
      inline def setEditableKeysUndefined: Self = StObject.set(x, "editableKeys", js.undefined)
      
      inline def setEditableKeysVarargs(value: Key*): Self = StObject.set(x, "editableKeys", js.Array(value*))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setNewLineConfig(value: LineConfig): Self = StObject.set(x, "newLineConfig", value.asInstanceOf[js.Any])
      
      inline def setNewLineConfigUndefined: Self = StObject.set(x, "newLineConfig", js.undefined)
      
      inline def setOnCancel(
        value: (/* key */ RecordKey, /* record */ T & `0`, /* originRow */ T & `0`, /* newLineConfig */ js.UndefOr[NewLineConfig[T]]) => js.Promise[Any | Unit]
      ): Self = StObject.set(x, "onCancel", js.Any.fromFunction4(value))
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnDelete(value: (/* key */ RecordKey, /* row */ T & `0`) => js.Promise[Any | Unit]): Self = StObject.set(x, "onDelete", js.Any.fromFunction2(value))
      
      inline def setOnDeleteUndefined: Self = StObject.set(x, "onDelete", js.undefined)
      
      inline def setOnSave(
        value: (/* key */ RecordKey, /* record */ T & `0`, /* originRow */ T & `0`, /* newLineConfig */ js.UndefOr[NewLineConfig[T]]) => js.Promise[Any | Unit]
      ): Self = StObject.set(x, "onSave", js.Any.fromFunction4(value))
      
      inline def setOnSaveUndefined: Self = StObject.set(x, "onSave", js.undefined)
      
      inline def setRecordKey(value: RecordKey): Self = StObject.set(x, "recordKey", value.asInstanceOf[js.Any])
      
      inline def setRecordKeyVarargs(value: Key*): Self = StObject.set(x, "recordKey", js.Array(value*))
      
      inline def setSetEditableRowKeys(value: js.Array[Key] => Callback): Self = StObject.set(x, "setEditableRowKeys", js.Any.fromFunction1((t0: js.Array[Key]) => value(t0).runNow()))
      
      inline def setTableName(value: NamePath): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
      
      inline def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
      
      inline def setTableNameVarargs(value: (String | Double)*): Self = StObject.set(x, "tableName", js.Array(value*))
    }
  }
  
  type ActionRenderFunction[T] = js.Function3[
    /* row */ T, 
    /* config */ ActionRenderConfig[T, NewLineConfig[T]], 
    /* defaultDoms */ Delete, 
    js.Array[Node]
  ]
  
  trait ActionTypeText[T] extends StObject {
    
    var addEditRecord: js.UndefOr[js.Function2[/* row */ T, /* options */ js.UndefOr[AddLineOptions], Boolean]] = js.undefined
    
    var cancelText: js.UndefOr[Node] = js.undefined
    
    var deleteText: js.UndefOr[Node] = js.undefined
    
    var editorType: js.UndefOr[Array | Map] = js.undefined
    
    var saveText: js.UndefOr[Node] = js.undefined
  }
  object ActionTypeText {
    
    inline def apply[T](): ActionTypeText[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionTypeText[T]]
    }
    
    extension [Self <: ActionTypeText[?], T](x: Self & ActionTypeText[T]) {
      
      inline def setAddEditRecord(value: (/* row */ T, /* options */ js.UndefOr[AddLineOptions]) => Boolean): Self = StObject.set(x, "addEditRecord", js.Any.fromFunction2(value))
      
      inline def setAddEditRecordUndefined: Self = StObject.set(x, "addEditRecord", js.undefined)
      
      inline def setCancelText(value: VdomNode): Self = StObject.set(x, "cancelText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCancelTextNull: Self = StObject.set(x, "cancelText", null)
      
      inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
      
      inline def setCancelTextVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "cancelText", js.Array(value*))
      
      inline def setCancelTextVdomElement(value: VdomElement): Self = StObject.set(x, "cancelText", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDeleteText(value: VdomNode): Self = StObject.set(x, "deleteText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setDeleteTextNull: Self = StObject.set(x, "deleteText", null)
      
      inline def setDeleteTextUndefined: Self = StObject.set(x, "deleteText", js.undefined)
      
      inline def setDeleteTextVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "deleteText", js.Array(value*))
      
      inline def setDeleteTextVdomElement(value: VdomElement): Self = StObject.set(x, "deleteText", value.rawElement.asInstanceOf[js.Any])
      
      inline def setEditorType(value: Array | Map): Self = StObject.set(x, "editorType", value.asInstanceOf[js.Any])
      
      inline def setEditorTypeUndefined: Self = StObject.set(x, "editorType", js.undefined)
      
      inline def setSaveText(value: VdomNode): Self = StObject.set(x, "saveText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSaveTextNull: Self = StObject.set(x, "saveText", null)
      
      inline def setSaveTextUndefined: Self = StObject.set(x, "saveText", js.undefined)
      
      inline def setSaveTextVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "saveText", js.Array(value*))
      
      inline def setSaveTextVdomElement(value: VdomElement): Self = StObject.set(x, "saveText", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait AddLineOptions extends StObject {
    
    var newRecordType: js.UndefOr[dataSource | cache] = js.undefined
    
    /** 要增加到哪个节点下，一般用于多重嵌套表格 */
    var parentKey: js.UndefOr[RecordKey] = js.undefined
    
    var position: js.UndefOr[top | bottom] = js.undefined
    
    var recordKey: js.UndefOr[RecordKey] = js.undefined
  }
  object AddLineOptions {
    
    inline def apply(): AddLineOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddLineOptions]
    }
    
    extension [Self <: AddLineOptions](x: Self) {
      
      inline def setNewRecordType(value: dataSource | cache): Self = StObject.set(x, "newRecordType", value.asInstanceOf[js.Any])
      
      inline def setNewRecordTypeUndefined: Self = StObject.set(x, "newRecordType", js.undefined)
      
      inline def setParentKey(value: RecordKey): Self = StObject.set(x, "parentKey", value.asInstanceOf[js.Any])
      
      inline def setParentKeyUndefined: Self = StObject.set(x, "parentKey", js.undefined)
      
      inline def setParentKeyVarargs(value: Key*): Self = StObject.set(x, "parentKey", js.Array(value*))
      
      inline def setPosition(value: top | bottom): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRecordKey(value: RecordKey): Self = StObject.set(x, "recordKey", value.asInstanceOf[js.Any])
      
      inline def setRecordKeyUndefined: Self = StObject.set(x, "recordKey", js.undefined)
      
      inline def setRecordKeyVarargs(value: Key*): Self = StObject.set(x, "recordKey", js.Array(value*))
    }
  }
  
  trait NewLineConfig[T] extends StObject {
    
    var defaultValue: js.UndefOr[T] = js.undefined
    
    var options: AddLineOptions
  }
  object NewLineConfig {
    
    inline def apply[T](options: AddLineOptions): NewLineConfig[T] = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewLineConfig[T]]
    }
    
    extension [Self <: NewLineConfig[?], T](x: Self & NewLineConfig[T]) {
      
      inline def setDefaultValue(value: T): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setOptions(value: AddLineOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  type RecordKey = Key | js.Array[Key]
  
  trait RowEditableConfig[DataType] extends StObject {
    
    /** @name 自定义编辑的操作 */
    var actionRender: js.UndefOr[ActionRenderFunction[DataType]] = js.undefined
    
    /** 取消编辑一行的文字 */
    var cancelText: js.UndefOr[Node] = js.undefined
    
    /** 删除行时的确认消息 */
    var deletePopconfirmMessage: js.UndefOr[Node] = js.undefined
    
    /** 删除一行的文字 */
    var deleteText: js.UndefOr[Node] = js.undefined
    
    /** @name 正在编辑的列 */
    var editableKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    /** @name 控制可编辑表格的 form */
    var form: js.UndefOr[FormInstance[Any]] = js.undefined
    
    /** @name 控制可编辑表格的 From的设置 */
    var formProps: js.UndefOr[Omit[FormProps[DataType] & FormRef[DataType], onFinish]] = js.undefined
    
    /** 行保存的时候 */
    var onCancel: js.UndefOr[
        js.Function4[
          /* key */ RecordKey, 
          /* record */ DataType & `0`, 
          /* originRow */ DataType & `0`, 
          /* newLineConfig */ js.UndefOr[NewLineConfig[DataType]], 
          js.Promise[Any | Unit]
        ]
      ] = js.undefined
    
    /** 正在编辑的列修改的时候 */
    var onChange: js.UndefOr[
        js.Function2[
          /* editableKeys */ js.Array[Key], 
          /* editableRows */ js.Array[DataType] | DataType, 
          Unit
        ]
      ] = js.undefined
    
    /** 行删除的时候 */
    var onDelete: js.UndefOr[
        js.Function2[/* key */ RecordKey, /* row */ DataType & `0`, js.Promise[Any | Unit]]
      ] = js.undefined
    
    /** 行保存的时候 */
    var onSave: js.UndefOr[
        js.Function4[
          /* key */ RecordKey, 
          /* record */ DataType & `0`, 
          /* originRow */ DataType & `0`, 
          /* newLineConfig */ js.UndefOr[NewLineConfig[DataType]], 
          js.Promise[Any | Unit]
        ]
      ] = js.undefined
    
    /** 正在编辑的列修改的时候 */
    var onValuesChange: js.UndefOr[js.Function2[/* record */ DataType, /* dataSource */ js.Array[DataType], Unit]] = js.undefined
    
    /** 同时只能新增一行的提示 */
    var onlyAddOneLineAlertMessage: js.UndefOr[Node] = js.undefined
    
    /** 只能编辑一行的的提示 */
    var onlyOneLineEditorAlertMessage: js.UndefOr[Node] = js.undefined
    
    /** 保存一行的文字 */
    var saveText: js.UndefOr[Node] = js.undefined
    
    /** Table 上设置的name，用于拼接name来获取数据 */
    var tableName: js.UndefOr[NamePath] = js.undefined
    
    /**
      * @type single | multiple
      * @name 编辑的类型，支持单选和多选
      */
    var `type`: js.UndefOr[RowEditableType] = js.undefined
  }
  object RowEditableConfig {
    
    inline def apply[DataType](): RowEditableConfig[DataType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowEditableConfig[DataType]]
    }
    
    extension [Self <: RowEditableConfig[?], DataType](x: Self & RowEditableConfig[DataType]) {
      
      inline def setActionRender(
        value: (DataType, /* config */ ActionRenderConfig[DataType, NewLineConfig[DataType]], /* defaultDoms */ Delete) => js.Array[Node]
      ): Self = StObject.set(x, "actionRender", js.Any.fromFunction3(value))
      
      inline def setActionRenderUndefined: Self = StObject.set(x, "actionRender", js.undefined)
      
      inline def setCancelText(value: VdomNode): Self = StObject.set(x, "cancelText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setCancelTextNull: Self = StObject.set(x, "cancelText", null)
      
      inline def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
      
      inline def setCancelTextVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "cancelText", js.Array(value*))
      
      inline def setCancelTextVdomElement(value: VdomElement): Self = StObject.set(x, "cancelText", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDeletePopconfirmMessage(value: VdomNode): Self = StObject.set(x, "deletePopconfirmMessage", value.rawNode.asInstanceOf[js.Any])
      
      inline def setDeletePopconfirmMessageNull: Self = StObject.set(x, "deletePopconfirmMessage", null)
      
      inline def setDeletePopconfirmMessageUndefined: Self = StObject.set(x, "deletePopconfirmMessage", js.undefined)
      
      inline def setDeletePopconfirmMessageVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "deletePopconfirmMessage", js.Array(value*))
      
      inline def setDeletePopconfirmMessageVdomElement(value: VdomElement): Self = StObject.set(x, "deletePopconfirmMessage", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDeleteText(value: VdomNode): Self = StObject.set(x, "deleteText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setDeleteTextNull: Self = StObject.set(x, "deleteText", null)
      
      inline def setDeleteTextUndefined: Self = StObject.set(x, "deleteText", js.undefined)
      
      inline def setDeleteTextVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "deleteText", js.Array(value*))
      
      inline def setDeleteTextVdomElement(value: VdomElement): Self = StObject.set(x, "deleteText", value.rawElement.asInstanceOf[js.Any])
      
      inline def setEditableKeys(value: js.Array[Key]): Self = StObject.set(x, "editableKeys", value.asInstanceOf[js.Any])
      
      inline def setEditableKeysUndefined: Self = StObject.set(x, "editableKeys", js.undefined)
      
      inline def setEditableKeysVarargs(value: Key*): Self = StObject.set(x, "editableKeys", js.Array(value*))
      
      inline def setForm(value: FormInstance[Any]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormProps(value: Omit[FormProps[DataType] & FormRef[DataType], onFinish]): Self = StObject.set(x, "formProps", value.asInstanceOf[js.Any])
      
      inline def setFormPropsUndefined: Self = StObject.set(x, "formProps", js.undefined)
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setOnCancel(
        value: (/* key */ RecordKey, /* record */ DataType & `0`, /* originRow */ DataType & `0`, /* newLineConfig */ js.UndefOr[NewLineConfig[DataType]]) => js.Promise[Any | Unit]
      ): Self = StObject.set(x, "onCancel", js.Any.fromFunction4(value))
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnChange(
        value: (/* editableKeys */ js.Array[Key], /* editableRows */ js.Array[DataType] | DataType) => Callback
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* editableKeys */ js.Array[Key], t1: /* editableRows */ js.Array[DataType] | DataType) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnDelete(value: (/* key */ RecordKey, /* row */ DataType & `0`) => js.Promise[Any | Unit]): Self = StObject.set(x, "onDelete", js.Any.fromFunction2(value))
      
      inline def setOnDeleteUndefined: Self = StObject.set(x, "onDelete", js.undefined)
      
      inline def setOnSave(
        value: (/* key */ RecordKey, /* record */ DataType & `0`, /* originRow */ DataType & `0`, /* newLineConfig */ js.UndefOr[NewLineConfig[DataType]]) => js.Promise[Any | Unit]
      ): Self = StObject.set(x, "onSave", js.Any.fromFunction4(value))
      
      inline def setOnSaveUndefined: Self = StObject.set(x, "onSave", js.undefined)
      
      inline def setOnValuesChange(value: (/* record */ DataType, /* dataSource */ js.Array[DataType]) => Callback): Self = StObject.set(x, "onValuesChange", js.Any.fromFunction2((t0: /* record */ DataType, t1: /* dataSource */ js.Array[DataType]) => (value(t0, t1)).runNow()))
      
      inline def setOnValuesChangeUndefined: Self = StObject.set(x, "onValuesChange", js.undefined)
      
      inline def setOnlyAddOneLineAlertMessage(value: VdomNode): Self = StObject.set(x, "onlyAddOneLineAlertMessage", value.rawNode.asInstanceOf[js.Any])
      
      inline def setOnlyAddOneLineAlertMessageNull: Self = StObject.set(x, "onlyAddOneLineAlertMessage", null)
      
      inline def setOnlyAddOneLineAlertMessageUndefined: Self = StObject.set(x, "onlyAddOneLineAlertMessage", js.undefined)
      
      inline def setOnlyAddOneLineAlertMessageVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "onlyAddOneLineAlertMessage", js.Array(value*))
      
      inline def setOnlyAddOneLineAlertMessageVdomElement(value: VdomElement): Self = StObject.set(x, "onlyAddOneLineAlertMessage", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnlyOneLineEditorAlertMessage(value: VdomNode): Self = StObject.set(x, "onlyOneLineEditorAlertMessage", value.rawNode.asInstanceOf[js.Any])
      
      inline def setOnlyOneLineEditorAlertMessageNull: Self = StObject.set(x, "onlyOneLineEditorAlertMessage", null)
      
      inline def setOnlyOneLineEditorAlertMessageUndefined: Self = StObject.set(x, "onlyOneLineEditorAlertMessage", js.undefined)
      
      inline def setOnlyOneLineEditorAlertMessageVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "onlyOneLineEditorAlertMessage", js.Array(value*))
      
      inline def setOnlyOneLineEditorAlertMessageVdomElement(value: VdomElement): Self = StObject.set(x, "onlyOneLineEditorAlertMessage", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSaveText(value: VdomNode): Self = StObject.set(x, "saveText", value.rawNode.asInstanceOf[js.Any])
      
      inline def setSaveTextNull: Self = StObject.set(x, "saveText", null)
      
      inline def setSaveTextUndefined: Self = StObject.set(x, "saveText", js.undefined)
      
      inline def setSaveTextVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "saveText", js.Array(value*))
      
      inline def setSaveTextVdomElement(value: VdomElement): Self = StObject.set(x, "saveText", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTableName(value: NamePath): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
      
      inline def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
      
      inline def setTableNameVarargs(value: (String | Double)*): Self = StObject.set(x, "tableName", js.Array(value*))
      
      inline def setType(value: RowEditableType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antDesignProUtils.antDesignProUtilsStrings.single
    - typingsJapgolly.antDesignProUtils.antDesignProUtilsStrings.multiple
  */
  trait RowEditableType extends StObject
  object RowEditableType {
    
    inline def multiple: typingsJapgolly.antDesignProUtils.antDesignProUtilsStrings.multiple = "multiple".asInstanceOf[typingsJapgolly.antDesignProUtils.antDesignProUtilsStrings.multiple]
    
    inline def single: typingsJapgolly.antDesignProUtils.antDesignProUtilsStrings.single = "single".asInstanceOf[typingsJapgolly.antDesignProUtils.antDesignProUtilsStrings.single]
  }
  
  @js.native
  trait UseEditableType extends StObject {
    
    def apply[RecordType](props: RowEditableConfig[RecordType] & DataSource[RecordType]): ActionRender[RecordType] = js.native
  }
  
  type UseEditableUtilType = ReturnType[UseEditableType]
}
