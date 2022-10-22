package typingsJapgolly.nodeMysqlWrapper

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.nodeMysqlWrapper.anon.Connection
import typingsJapgolly.nodeMysqlWrapper.anon.Fetch
import typingsJapgolly.nodeMysqlWrapper.anon.Fields
import typingsJapgolly.nodeMysqlWrapper.anon.InsertedId
import typingsJapgolly.nodeMysqlWrapper.anon.Multi
import typingsJapgolly.nodeMysqlWrapper.anon.Reactive
import typingsJapgolly.nodeMysqlWrapper.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Mongo {
  
  @js.native
  trait Collection[T] extends StObject {
    
    def _ensureIndex(indexName: String): Unit = js.native
    def _ensureIndex(indexName: String, options: StringDictionary[Any]): Unit = js.native
    
    def allow(options: Fetch[T]): Boolean = js.native
    
    def deny(options: Fetch[T]): Boolean = js.native
    
    def find(): Cursor[T] = js.native
    def find(selector: Any): Cursor[T] = js.native
    def find(selector: Any, options: Fields): Cursor[T] = js.native
    def find(selector: Unit, options: Fields): Cursor[T] = js.native
    
    def findOne(): T = js.native
    def findOne(selector: Any): T = js.native
    def findOne(selector: Any, options: Reactive): T = js.native
    def findOne(selector: Unit, options: Reactive): T = js.native
    
    def insert(doc: T): String = js.native
    def insert(doc: T, callback: js.Function): String = js.native
    
    def rawCollection(): Any = js.native
    
    def rawDatabase(): Any = js.native
    
    def remove(selector: Any): Unit = js.native
    def remove(selector: Any, callback: js.Function): Unit = js.native
    
    def update(selector: Any, modifier: Any): Double = js.native
    def update(selector: Any, modifier: Any, options: Unit, callback: js.Function): Double = js.native
    def update(selector: Any, modifier: Any, options: Multi): Double = js.native
    def update(selector: Any, modifier: Any, options: Multi, callback: js.Function): Double = js.native
    
    def upsert(selector: Any, modifier: Any): InsertedId = js.native
    def upsert(selector: Any, modifier: Any, options: Unit, callback: js.Function): InsertedId = js.native
    def upsert(selector: Any, modifier: Any, options: `0`): InsertedId = js.native
    def upsert(selector: Any, modifier: Any, options: `0`, callback: js.Function): InsertedId = js.native
  }
  
  @js.native
  trait CollectionStatic
    extends StObject
       with Instantiable1[/* name */ String, Collection[js.Object]]
       with Instantiable2[/* name */ String, /* options */ Connection, Collection[js.Object]]
  
  @js.native
  trait Cursor[T] extends StObject {
    
    def count(): Double = js.native
    
    def fetch(): js.Array[T] = js.native
    
    def forEach(callback: js.Function3[/* doc */ Any, /* index */ Double, /* cursor */ Cursor[Any], Unit]): Unit = js.native
    def forEach(
      callback: js.Function3[/* doc */ Any, /* index */ Double, /* cursor */ Cursor[Any], Unit],
      thisArg: Any
    ): Unit = js.native
    
    def map[U](callback: js.Function3[/* doc */ T, /* index */ Double, /* cursor */ Cursor[T], U]): js.Array[U] = js.native
    def map[U](callback: js.Function3[/* doc */ T, /* index */ Double, /* cursor */ Cursor[T], U], thisArg: Any): js.Array[U] = js.native
    
    def observe(callbacks: js.Object): Any = js.native
    
    def observeChanges(callbacks: js.Object): Any = js.native
  }
  
  @js.native
  trait CursorStatic
    extends StObject
       with Instantiable0[Cursor[js.Object]]
  
  trait ObjectID extends StObject
  
  @js.native
  trait ObjectIDStatic
    extends StObject
       with Instantiable1[/* hexString */ String, ObjectID]
}
