package typingsJapgolly.lovefield.mod

import typingsJapgolly.lovefield.mod.query.Delete
import typingsJapgolly.lovefield.mod.query.Insert
import typingsJapgolly.lovefield.mod.query.Select
import typingsJapgolly.lovefield.mod.query.Update
import typingsJapgolly.lovefield.mod.schema.Column
import typingsJapgolly.lovefield.mod.schema.Table
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Database extends StObject {
  
  def close(): Unit = js.native
  
  def createTransaction(): Transaction = js.native
  def createTransaction(`type`: TransactionType): Transaction = js.native
  
  def delete(): Delete = js.native
  
  def `export`(): js.Promise[js.Object] = js.native
  
  def getSchema(): typingsJapgolly.lovefield.mod.schema.Database = js.native
  
  def `import`(data: js.Object): js.Promise[Unit] = js.native
  
  def insert(): Insert = js.native
  
  def insertOrReplace(): Insert = js.native
  
  def observe(query: Select, callback: js.Function): Unit = js.native
  
  def select(columns: Column*): Select = js.native
  
  def unobserve(query: Select, callback: js.Function): Unit = js.native
  
  def update(table: Table): Update = js.native
}
