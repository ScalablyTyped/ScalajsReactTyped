package typingsJapgolly.store

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoreJsAPI extends StObject {
  
  def addPlugin(plugin: js.Function): Unit = js.native
  
  def clearAll(): Unit = js.native
  
  def createStore(): StoreJsAPI = js.native
  def createStore(plugins: js.Array[js.Function]): StoreJsAPI = js.native
  def createStore(plugins: js.Array[js.Function], namespace: String): StoreJsAPI = js.native
  def createStore(plugins: Unit, namespace: String): StoreJsAPI = js.native
  
  def each(callback: js.Function2[/* val */ Any, /* namespacedKey */ String, Unit]): Unit = js.native
  
  val enabled: Boolean = js.native
  
  def get(key: String): Any = js.native
  def get(key: String, optionalDefaultValue: Any): Any = js.native
  
  def hasNamespace(namespace: String): Boolean = js.native
  
  def namespace(namespace: String): StoreJsAPI = js.native
  
  def remove(key: String): Unit = js.native
  
  def set(key: String, value: Any): Any = js.native
  
  val version: String = js.native
}
