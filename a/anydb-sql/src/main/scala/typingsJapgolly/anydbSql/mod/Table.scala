package typingsJapgolly.anydbSql.mod

import typingsJapgolly.anydbSql.anon.Emit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Table[T]
  extends StObject
     with TableNode
     with Queryable[T] {
  
  var _name: String = js.native
  
  def alter(): AlterQuery[T] = js.native
  
  def as(name: String): Table[T] = js.native
  
  var columns: js.Array[Column[Any]] = js.native
  
  def create(): CreateQuery = js.native
  
  def drop(): DropQuery = js.native
  
  var eventEmitter: Emit = js.native
  
  def from[U](statement: String): Query[U] = js.native
  def from[U](table: TableNode): Query[U] = js.native
  
  def indexes(): IndexQuery = js.native
  
  def insert(row: T): ModifyingQuery = js.native
  def insert(rows: js.Array[T]): ModifyingQuery = js.native
  
  def select(): Query[T] = js.native
  
  var sql: SQL = js.native
  
  def star(): Column[Any] = js.native
  
  def subQuery[U](): SubQuery[U] = js.native
  
  def update(o: Any): ModifyingQuery = js.native
}
