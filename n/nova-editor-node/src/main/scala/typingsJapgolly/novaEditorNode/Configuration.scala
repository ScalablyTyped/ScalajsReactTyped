package typingsJapgolly.novaEditorNode

import typingsJapgolly.novaEditorNode.novaEditorNodeStrings.array
import typingsJapgolly.novaEditorNode.novaEditorNodeStrings.boolean
import typingsJapgolly.novaEditorNode.novaEditorNodeStrings.number
import typingsJapgolly.novaEditorNode.novaEditorNodeStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Configuration extends StObject {
  
  def get(key: String): ConfigurationValue | Null = js.native
  @JSName("get")
  def get_array(key: String, coerce: array): js.Array[String] | Null = js.native
  @JSName("get")
  def get_boolean(key: String, coerce: boolean): Boolean | Null = js.native
  @JSName("get")
  def get_number(key: String, coerce: number): Double | Null = js.native
  @JSName("get")
  def get_string(key: String, coerce: string): String | Null = js.native
  
  def observe[T](key: String, callback: js.Function2[/* newValue */ T, /* oldValue */ T, Unit]): Disposable = js.native
  
  def onDidChange[T](key: String, callback: js.Function2[/* newValue */ T, /* oldValue */ T, Unit]): Disposable = js.native
  
  def remove(key: String): Unit = js.native
  
  def set(key: String): Unit = js.native
  def set(key: String, value: ConfigurationValue): Unit = js.native
}
