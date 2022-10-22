package typingsJapgolly.nodeMysqlWrapper.mod

import typingsJapgolly.nodeMysqlWrapper.Mongo.Collection
import typingsJapgolly.nodeMysqlWrapper.Mongo.Cursor
import typingsJapgolly.nodeMysqlWrapper.anon.Fetch
import typingsJapgolly.nodeMysqlWrapper.anon.Fields
import typingsJapgolly.nodeMysqlWrapper.anon.Reactive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-mysql-wrapper", "MeteorCollection")
@js.native
open class MeteorCollection[T] protected () extends StObject {
  def this(table: Table[T]) = this()
  def this(table: Table[T], name: String) = this()
  
  //ONLY MONGO/METEOR COLLECTION METHODS START
  def allow(options: Fetch[T]): Boolean = js.native
  
  /* private */ var collection: Collection[T] = js.native
  
  def deny(options: Fetch[T]): Boolean = js.native
  
  def fill(criteriaRawJsObject: Any): Unit = js.native
  
  def fillAll(): Unit = js.native
  
  def fillOne(criteriaRawJsObject: Any): Unit = js.native
  
  def find(): Cursor[T] = js.native
  def find(selector: Any): Cursor[T] = js.native
  def find(selector: Any, options: Fields): Cursor[T] = js.native
  def find(selector: Unit, options: Fields): Cursor[T] = js.native
  
  def findOne(): T = js.native
  def findOne(selector: Any): T = js.native
  def findOne(selector: Any, options: Reactive): T = js.native
  def findOne(selector: Unit, options: Reactive): T = js.native
  
  var rawCollection: Collection[T] = js.native
  
  def startListeningToDatabase(): Unit = js.native
  
  /* protected */ var table: Table[T] = js.native
}
