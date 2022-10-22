package typingsJapgolly.antDesignProUtils.anon

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.antDesignProUtils.antDesignProUtilsBooleans.`true`
import typingsJapgolly.antDesignProUtils.esUseEditableArrayMod.AddLineOptions
import typingsJapgolly.antDesignProUtils.esUseEditableArrayMod.NewLineConfig
import typingsJapgolly.antDesignProUtils.esUseEditableArrayMod.RecordKey
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionRender[RecordType] extends StObject {
  
  def actionRender(row: RecordType & Index): js.Array[Element | Null | Node] = js.native
  
  def addEditRecord(row: RecordType): Boolean = js.native
  def addEditRecord(row: RecordType, options: AddLineOptions): Boolean = js.native
  
  def cancelEditable(recordKey: RecordKey): js.Promise[js.UndefOr[`true`]] = js.native
  def cancelEditable(recordKey: RecordKey, needReTry: Boolean): js.Promise[js.UndefOr[`true`]] = js.native
  
  var editableKeys: js.Array[Key] = js.native
  
  def isEditable(row: RecordType & Index): IsEditable = js.native
  
  var newLineRecord: js.UndefOr[NewLineConfig[RecordType]] = js.native
  
  def onValuesChange(value: RecordType, values: RecordType): Unit = js.native
  
  var preEditableKeys: js.UndefOr[js.Array[Key]] = js.native
  
  def setEditableRowKeys(updater: js.Array[Key]): Unit = js.native
  def setEditableRowKeys(updater: js.Array[Key], ignoreDestroy: Boolean): Unit = js.native
  def setEditableRowKeys(updater: js.Function1[/* origin */ js.Array[Key], js.Array[Key]]): Unit = js.native
  def setEditableRowKeys(updater: js.Function1[/* origin */ js.Array[Key], js.Array[Key]], ignoreDestroy: Boolean): Unit = js.native
  
  def startEditable(recordKey: Key): Boolean = js.native
}
