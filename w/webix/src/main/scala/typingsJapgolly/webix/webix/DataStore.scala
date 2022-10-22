package typingsJapgolly.webix.webix

import typingsJapgolly.webix.webix.ui.baseview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataStore extends StObject {
  
  def add(obj: Any): String | Double = js.native
  def add(obj: Any, index: Double): String | Double = js.native
  
  def addMark(id: String, name: String): Any = js.native
  def addMark(id: String, name: String, css: Boolean): Any = js.native
  def addMark(id: String, name: String, css: Boolean, value: Any): Any = js.native
  def addMark(id: String, name: String, css: Unit, value: Any): Any = js.native
  
  def attachEvent(`type`: String, functor: WebixCallback): String | Double = js.native
  def attachEvent(`type`: String, functor: WebixCallback, id: String): String | Double = js.native
  
  def blockEvent(): Unit = js.native
  
  def callEvent(name: String, params: js.Array[Any]): Boolean = js.native
  
  def changeId(old: String, newid: String): Unit = js.native
  def changeId(old: String, newid: Double): Unit = js.native
  def changeId(old: Double, newid: String): Unit = js.native
  def changeId(old: Double, newid: Double): Unit = js.native
  
  def clearAll(): Unit = js.native
  def clearAll(soft: Boolean): Unit = js.native
  
  def clearMark(name: String): Unit = js.native
  
  def count(): Double = js.native
  
  def destructor(): Unit = js.native
  
  def detachEvent(id: String): Unit = js.native
  
  var driver: Any = js.native
  
  def each(method: WebixCallback): Unit = js.native
  def each(method: WebixCallback, master: Any): Unit = js.native
  def each(method: WebixCallback, master: Any, all: Boolean): Unit = js.native
  def each(method: WebixCallback, master: Unit, all: Boolean): Unit = js.native
  
  def exists(id: String): Boolean = js.native
  def exists(id: Double): Boolean = js.native
  
  def filter(text: String): Unit = js.native
  def filter(text: String, value: String): Unit = js.native
  def filter(text: String, value: String, preserve: Boolean): Unit = js.native
  def filter(text: String, value: Unit, preserve: Boolean): Unit = js.native
  def filter(text: WebixCallback): Unit = js.native
  def filter(text: WebixCallback, value: String): Unit = js.native
  def filter(text: WebixCallback, value: String, preserve: Boolean): Unit = js.native
  def filter(text: WebixCallback, value: Unit, preserve: Boolean): Unit = js.native
  def filter(text: WebixTemplate): Unit = js.native
  def filter(text: WebixTemplate, value: String): Unit = js.native
  def filter(text: WebixTemplate, value: String, preserve: Boolean): Unit = js.native
  def filter(text: WebixTemplate, value: Unit, preserve: Boolean): Unit = js.native
  
  def find(criterion: WebixCallback): Any = js.native
  def find(criterion: WebixCallback, first: Boolean): Any = js.native
  
  def getFirstId(): Double | String = js.native
  
  def getIdByIndex(index: String): String | Double = js.native
  def getIdByIndex(index: Double): String | Double = js.native
  
  def getIndexById(id: String): Double = js.native
  def getIndexById(id: Double): Double = js.native
  
  def getIndexRange(from: String, to: String): js.Array[Any] = js.native
  def getIndexRange(from: String, to: Double): js.Array[Any] = js.native
  def getIndexRange(from: Double, to: String): js.Array[Any] = js.native
  def getIndexRange(from: Double, to: Double): js.Array[Any] = js.native
  
  def getItem(id: String): Any = js.native
  def getItem(id: Double): Any = js.native
  
  def getLastId(): Double | String = js.native
  
  def getMark(id: String, mark_name: String): Any = js.native
  def getMark(id: Double, mark_name: String): Any = js.native
  
  def getNextId(id: String, step: Double): String | Double = js.native
  def getNextId(id: Double, step: Double): String | Double = js.native
  
  def getPrevId(id: String, step: Double): String | Double = js.native
  def getPrevId(id: Double, step: Double): String | Double = js.native
  
  def getRange(from: String, to: String): js.Array[Any] = js.native
  def getRange(from: String, to: Double): js.Array[Any] = js.native
  def getRange(from: Double, to: String): js.Array[Any] = js.native
  def getRange(from: Double, to: Double): js.Array[Any] = js.native
  
  def hasEvent(name: String): Boolean = js.native
  
  def id(item: Any): Double | String = js.native
  
  def importData(source: baseview): Unit = js.native
  
  def mapEvent(map: Any): Unit = js.native
  
  def move(sid: String, tindex: Double): String = js.native
  def move(sid: String, tindex: Double, tobj: Any): String = js.native
  def move(sid: String, tindex: Double, tobj: Any, details: Any): String = js.native
  def move(sid: String, tindex: Double, tobj: Unit, details: Any): String = js.native
  
  var name: String = js.native
  
  var order: js.Array[Any] = js.native
  
  def provideApi(target: Any, eventable: Boolean): Unit = js.native
  
  var pull: Any = js.native
  
  def refresh(): Unit = js.native
  def refresh(id: String): Unit = js.native
  def refresh(id: Double): Unit = js.native
  
  def remove(id: String): Unit = js.native
  def remove(id: js.Array[Any]): Unit = js.native
  def remove(id: Double): Unit = js.native
  
  def removeMark(id: String, name: String, css: Boolean): Unit = js.native
  def removeMark(id: Double, name: String, css: Boolean): Unit = js.native
  
  def scheme(config: Any): Unit = js.native
  
  def serialize(): js.Array[Any] = js.native
  def serialize(all: Boolean): js.Array[Any] = js.native
  
  def setDriver(`type`: String): Unit = js.native
  
  def silent(code: WebixCallback): Unit = js.native
  
  def sort(by: String): Unit = js.native
  def sort(by: String, dir: String): Unit = js.native
  def sort(by: String, dir: String, as: String): Unit = js.native
  def sort(by: String, dir: Unit, as: String): Unit = js.native
  
  var sorting: Any = js.native
  
  def sync(source: Any, filter: WebixCallback, silent: Boolean): Unit = js.native
  
  def unblockEvent(): Unit = js.native
  
  def unsync(): Unit = js.native
  
  def updateItem(id: String, data: Any): Unit = js.native
  def updateItem(id: Double, data: Any): Unit = js.native
}
