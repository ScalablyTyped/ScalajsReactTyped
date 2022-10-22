package typingsJapgolly.antDesignProUtils.anon

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.antDesignProUtils.esUseEditableArrayMod.ActionTypeText
import typingsJapgolly.antDesignProUtils.esUseEditableArrayMod.RecordKey
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelEditable[RecordType] extends StObject {
  
  def actionRender(key: RecordKey): js.Array[Element | Null | Node] = js.native
  def actionRender(key: RecordKey, config: ActionTypeText[RecordType]): js.Array[Element | Null | Node] = js.native
  
  def cancelEditable(recordKey: RecordKey): Boolean = js.native
  
  var editableKeys: js.Array[Key] = js.native
  
  def isEditable(recordKey: RecordKey): Boolean = js.native
  
  def setEditableRowKeys(updater: js.Array[Key]): Unit = js.native
  def setEditableRowKeys(updater: js.Array[Key], ignoreDestroy: Boolean): Unit = js.native
  def setEditableRowKeys(updater: js.Function1[/* origin */ js.Array[Key], js.Array[Key]]): Unit = js.native
  def setEditableRowKeys(updater: js.Function1[/* origin */ js.Array[Key], js.Array[Key]], ignoreDestroy: Boolean): Unit = js.native
  
  def startEditable(recordKey: RecordKey): Boolean = js.native
}
