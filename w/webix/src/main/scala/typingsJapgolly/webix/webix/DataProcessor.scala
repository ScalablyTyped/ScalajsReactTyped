package typingsJapgolly.webix.webix

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataProcessor extends StObject {
  
  def attachEvent(`type`: String, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: String, functor: WebixCallback, id: String): String | Double = js.native
  
  def attachProgress(start: WebixCallback, end: WebixCallback, error: WebixCallback): Unit = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  def clearValidation(): Unit = js.native
  
  var config: StringDictionary[Any] = js.native
  
  def define(property: String, value: Any): Unit = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  def escape(value: String): String = js.native
  
  def getItemState(itemId: String): Any = js.native
  def getItemState(itemId: Double): Any = js.native
  
  def getState(): String | Boolean = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def ignore(code: WebixCallback, master: Any): Unit = js.native
  
  def mapEvent(map: Any): Unit = js.native
  
  var name: String = js.native
  
  def off(): Unit = js.native
  
  def on(): Unit = js.native
  
  def processResult(data: Any): Unit = js.native
  
  def reset(): Unit = js.native
  
  def save(id: String): js.Promise[Any] = js.native
  def save(id: String, operation: String): js.Promise[Any] = js.native
  def save(id: String, operation: String, obj: Any): js.Promise[Any] = js.native
  def save(id: String, operation: Unit, obj: Any): js.Promise[Any] = js.native
  def save(id: Double): js.Promise[Any] = js.native
  def save(id: Double, operation: String): js.Promise[Any] = js.native
  def save(id: Double, operation: String, obj: Any): js.Promise[Any] = js.native
  def save(id: Double, operation: Unit, obj: Any): js.Promise[Any] = js.native
  
  def send(): js.Promise[Any] = js.native
  
  def setItemState(itemId: String, state: Boolean): Unit = js.native
  def setItemState(itemId: Double, state: Boolean): Unit = js.native
  
  def unblockEvent(): Unit = js.native
  
  def validate(): Boolean = js.native
  def validate(mode: Any): Boolean = js.native
}
