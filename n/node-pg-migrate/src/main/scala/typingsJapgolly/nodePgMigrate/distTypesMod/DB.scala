package typingsJapgolly.nodePgMigrate.distTypesMod

import typingsJapgolly.pg.mod.QueryArrayConfig
import typingsJapgolly.pg.mod.QueryArrayResult
import typingsJapgolly.pg.mod.QueryConfig
import typingsJapgolly.pg.mod.QueryResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DB extends StObject {
  
  def query(queryConfig: QueryArrayConfig[js.Array[Any]]): js.Promise[QueryArrayResult[js.Array[Any]]] = js.native
  def query(queryConfig: QueryArrayConfig[js.Array[Any]], values: js.Array[Any]): js.Promise[QueryArrayResult[js.Array[Any]]] = js.native
  def query(queryConfig: QueryConfig[js.Array[Any]]): js.Promise[QueryResult[Any]] = js.native
  def query(queryTextOrConfig: String): js.Promise[QueryResult[Any]] = js.native
  def query(queryTextOrConfig: String, values: js.Array[Any]): js.Promise[QueryResult[Any]] = js.native
  def query(queryTextOrConfig: QueryConfig[js.Array[Any]], values: js.Array[Any]): js.Promise[QueryResult[Any]] = js.native
  
  def select(queryConfig: QueryArrayConfig[js.Array[Any]]): js.Promise[js.Array[Any]] = js.native
  def select(queryConfig: QueryArrayConfig[js.Array[Any]], values: js.Array[Any]): js.Promise[js.Array[Any]] = js.native
  def select(queryConfig: QueryConfig[js.Array[Any]]): js.Promise[js.Array[Any]] = js.native
  def select(queryTextOrConfig: String): js.Promise[js.Array[Any]] = js.native
  def select(queryTextOrConfig: String, values: js.Array[Any]): js.Promise[js.Array[Any]] = js.native
  def select(queryTextOrConfig: QueryConfig[js.Array[Any]], values: js.Array[Any]): js.Promise[js.Array[Any]] = js.native
}
