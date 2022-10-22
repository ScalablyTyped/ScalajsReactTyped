package typingsJapgolly.nodeMysqlWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-mysql-wrapper", "ObservableCollection")
@js.native
open class ObservableCollection[T] protected () extends StObject {
  def this(table: Table[T]) = this()
  def this(table: Table[T], fetchAllFromDatabase: Boolean) = this()
  def this(table: Table[T], fetchAllFromDatabase: Boolean, callbackWhenReady: js.Function) = this()
  def this(table: Table[T], fetchAllFromDatabase: Unit, callbackWhenReady: js.Function) = this()
  
  /* private */ var _items: js.Array[T & ObservableObject] = js.native
  
  def delete(criteriaOrID: String): typingsJapgolly.bluebird.mod.^[DeleteAnswer] = js.native
  def delete(criteriaOrID: String, callback: js.Function1[/* _result */ DeleteAnswer, Any]): typingsJapgolly.bluebird.mod.^[DeleteAnswer] = js.native
  /**
    * same thing as .remove();
    */
  def delete(criteriaOrID: Any): typingsJapgolly.bluebird.mod.^[DeleteAnswer] = js.native
  def delete(criteriaOrID: Any, callback: js.Function1[/* _result */ DeleteAnswer, Any]): typingsJapgolly.bluebird.mod.^[DeleteAnswer] = js.native
  def delete(criteriaOrID: Double): typingsJapgolly.bluebird.mod.^[DeleteAnswer] = js.native
  def delete(criteriaOrID: Double, callback: js.Function1[/* _result */ DeleteAnswer, Any]): typingsJapgolly.bluebird.mod.^[DeleteAnswer] = js.native
  
  def find(): typingsJapgolly.bluebird.mod.^[js.Array[T]] = js.native
  def find(criteriaRawJsObject: Any): typingsJapgolly.bluebird.mod.^[js.Array[T]] = js.native
  def find(criteriaRawJsObject: Any, callback: js.Function1[/* _results */ js.Array[T], Any]): typingsJapgolly.bluebird.mod.^[js.Array[T]] = js.native
  def find(criteriaRawJsObject: Unit, callback: js.Function1[/* _results */ js.Array[T], Any]): typingsJapgolly.bluebird.mod.^[js.Array[T]] = js.native
  
  def findAll(): typingsJapgolly.bluebird.mod.^[js.Array[T]] = js.native
  def findAll(tableRules: Unit, callback: js.Function1[/* _results */ js.Array[T], Any]): typingsJapgolly.bluebird.mod.^[js.Array[T]] = js.native
  def findAll(tableRules: RawRules): typingsJapgolly.bluebird.mod.^[js.Array[T]] = js.native
  def findAll(tableRules: RawRules, callback: js.Function1[/* _results */ js.Array[T], Any]): typingsJapgolly.bluebird.mod.^[js.Array[T]] = js.native
  
  def findById(id: String): typingsJapgolly.bluebird.mod.^[T] = js.native
  def findById(id: String, callback: js.Function1[/* result */ T, Any]): typingsJapgolly.bluebird.mod.^[T] = js.native
  def findById(id: Double): typingsJapgolly.bluebird.mod.^[T] = js.native
  def findById(id: Double, callback: js.Function1[/* result */ T, Any]): typingsJapgolly.bluebird.mod.^[T] = js.native
  
  def findOne(criteriaRawJsObject: Any): typingsJapgolly.bluebird.mod.^[T] = js.native
  def findOne(criteriaRawJsObject: Any, callback: js.Function1[/* _result */ T, Any]): typingsJapgolly.bluebird.mod.^[T] = js.native
  
  /**
    * .insert() and .update() do the same thing:  .save();
    */
  def insert(criteriaRawJsObject: Any): typingsJapgolly.bluebird.mod.^[T | Any] = js.native
  def insert(criteriaRawJsObject: Any, callback: js.Function1[/* _result */ Any, Any]): typingsJapgolly.bluebird.mod.^[T | Any] = js.native
  
  var items: js.Array[T & ObservableObject] = js.native
  
  //auti i klasi 9a xrisimopoieite ws Collection me kapoies paralages mesa sto index.ts.
  var local: BaseCollection[T] = js.native
  
  def onCollectionChanged(callback: js.Function1[/* eventArgs */ CollectionChangedEventArgs[T], Unit]): Unit = js.native
  
  def remove(criteriaOrID: String): typingsJapgolly.bluebird.mod.^[DeleteAnswer] = js.native
  def remove(criteriaOrID: String, callback: js.Function1[/* _result */ DeleteAnswer, Any]): typingsJapgolly.bluebird.mod.^[DeleteAnswer] = js.native
  def remove(criteriaOrID: Any): typingsJapgolly.bluebird.mod.^[DeleteAnswer] = js.native
  def remove(criteriaOrID: Any, callback: js.Function1[/* _result */ DeleteAnswer, Any]): typingsJapgolly.bluebird.mod.^[DeleteAnswer] = js.native
  def remove(criteriaOrID: Double): typingsJapgolly.bluebird.mod.^[DeleteAnswer] = js.native
  def remove(criteriaOrID: Double, callback: js.Function1[/* _result */ DeleteAnswer, Any]): typingsJapgolly.bluebird.mod.^[DeleteAnswer] = js.native
  
  def save(criteriaRawJsObject: Any): typingsJapgolly.bluebird.mod.^[T | Any] = js.native
  def save(criteriaRawJsObject: Any, callback: js.Function1[/* _result */ Any, Any]): typingsJapgolly.bluebird.mod.^[T | Any] = js.native
  
  def startListeningToDatabase(): Unit = js.native
  
  def update(criteriaRawJsObject: Any): typingsJapgolly.bluebird.mod.^[T | Any] = js.native
  def update(criteriaRawJsObject: Any, callback: js.Function1[/* _result */ Any, Any]): typingsJapgolly.bluebird.mod.^[T | Any] = js.native
}
