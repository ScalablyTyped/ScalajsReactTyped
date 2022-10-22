package typingsJapgolly.antDesignProUtils.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignProUtils.anon.ActionRenderConfiganyNewL
import typingsJapgolly.antDesignProUtils.anon.`0`
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

object DeleteEditableAction {
  
  inline def apply(
    cancelEditable: RecordKey => Callback,
    recordKey: RecordKey,
    row: Any,
    setEditableRowKeys: js.Array[Key] => Callback
  ): Builder = {
    val __props = js.Dynamic.literal(cancelEditable = js.Any.fromFunction1((t0: RecordKey) => cancelEditable(t0).runNow()), recordKey = recordKey.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], setEditableRowKeys = js.Any.fromFunction1((t0: js.Array[Key]) => setEditableRowKeys(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[ActionRenderConfiganyNewL]))
  }
  
  @JSImport("@ant-design/pro-utils/es/useEditableArray", "DeleteEditableAction")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def addEditRecord(value: (/* row */ Any, /* options */ js.UndefOr[AddLineOptions]) => Boolean): this.type = set("addEditRecord", js.Any.fromFunction2(value))
    
    inline def cancelText(value: VdomNode): this.type = set("cancelText", value.rawNode.asInstanceOf[js.Any])
    
    inline def cancelTextNull: this.type = set("cancelText", null)
    
    inline def cancelTextVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("cancelText", js.Array(value*))
    
    inline def cancelTextVdomElement(value: VdomElement): this.type = set("cancelText", value.rawElement.asInstanceOf[js.Any])
    
    inline def deletePopconfirmMessage(value: VdomNode): this.type = set("deletePopconfirmMessage", value.rawNode.asInstanceOf[js.Any])
    
    inline def deletePopconfirmMessageNull: this.type = set("deletePopconfirmMessage", null)
    
    inline def deletePopconfirmMessageVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("deletePopconfirmMessage", js.Array(value*))
    
    inline def deletePopconfirmMessageVdomElement(value: VdomElement): this.type = set("deletePopconfirmMessage", value.rawElement.asInstanceOf[js.Any])
    
    inline def deleteText(value: VdomNode): this.type = set("deleteText", value.rawNode.asInstanceOf[js.Any])
    
    inline def deleteTextNull: this.type = set("deleteText", null)
    
    inline def deleteTextVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("deleteText", js.Array(value*))
    
    inline def deleteTextVdomElement(value: VdomElement): this.type = set("deleteText", value.rawElement.asInstanceOf[js.Any])
    
    inline def editableKeys(value: js.Array[Key]): this.type = set("editableKeys", value.asInstanceOf[js.Any])
    
    inline def editableKeysVarargs(value: Key*): this.type = set("editableKeys", js.Array(value*))
    
    inline def editorType(value: Array | Map): this.type = set("editorType", value.asInstanceOf[js.Any])
    
    inline def index(value: Double): this.type = set("index", value.asInstanceOf[js.Any])
    
    inline def newLineConfig(value: NewLineConfig[Any]): this.type = set("newLineConfig", value.asInstanceOf[js.Any])
    
    inline def onCancel(
      value: (/* key */ RecordKey, /* record */ Any & `0`, /* originRow */ Any & `0`, /* newLineConfig */ js.UndefOr[NewLineConfig[Any]]) => js.Promise[Any | Unit]
    ): this.type = set("onCancel", js.Any.fromFunction4(value))
    
    inline def onDelete(value: (/* key */ RecordKey, /* row */ Any & `0`) => js.Promise[Any | Unit]): this.type = set("onDelete", js.Any.fromFunction2(value))
    
    inline def onSave(
      value: (/* key */ RecordKey, /* record */ Any & `0`, /* originRow */ Any & `0`, /* newLineConfig */ js.UndefOr[NewLineConfig[Any]]) => js.Promise[Any | Unit]
    ): this.type = set("onSave", js.Any.fromFunction4(value))
    
    inline def saveText(value: VdomNode): this.type = set("saveText", value.rawNode.asInstanceOf[js.Any])
    
    inline def saveTextNull: this.type = set("saveText", null)
    
    inline def saveTextVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("saveText", js.Array(value*))
    
    inline def saveTextVdomElement(value: VdomElement): this.type = set("saveText", value.rawElement.asInstanceOf[js.Any])
    
    inline def tableName(value: NamePath): this.type = set("tableName", value.asInstanceOf[js.Any])
    
    inline def tableNameVarargs(value: (String | Double)*): this.type = set("tableName", js.Array(value*))
  }
  
  def withProps(p: ActionRenderConfiganyNewL): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
