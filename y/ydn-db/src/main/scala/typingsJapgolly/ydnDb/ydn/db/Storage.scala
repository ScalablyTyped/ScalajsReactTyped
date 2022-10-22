package typingsJapgolly.ydnDb.ydn.db

import typingsJapgolly.ydnDb.DatabaseSchemaJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Storage
  extends StObject
     with DbOperator {
  
  def addEventListener(`type`: js.Array[EventType], handler: js.Function1[/* event */ Any, Unit]): Any = js.native
  def addEventListener(`type`: js.Array[EventType], handler: js.Function1[/* event */ Any, Unit], capture: Boolean): Any = js.native
  def addEventListener(`type`: EventType, handler: js.Function1[/* event */ Any, Unit]): Any = js.native
  def addEventListener(`type`: EventType, handler: js.Function1[/* event */ Any, Unit], capture: Boolean): Any = js.native
  
  def branch(
    thread: Policy,
    isSerial: Boolean,
    scope: js.Array[String],
    mode: TransactionMode,
    maxRequest: Double
  ): DbOperator = js.native
  
  def close(): Any = js.native
  
  def getName(callback: Any): String = js.native
  
  def getSchema(callback: Any): DatabaseSchemaJson = js.native
  
  def getType(): String = js.native
  
  def onReady(): Any = js.native
  def onReady(Error: Any): Any = js.native
  
  def removeEventListener(`type`: js.Array[EventType], handler: js.Function1[/* event */ Any, Unit]): Any = js.native
  def removeEventListener(`type`: js.Array[EventType], handler: js.Function1[/* event */ Any, Unit], capture: Boolean): Any = js.native
  def removeEventListener(`type`: EventType, handler: js.Function1[/* event */ Any, Unit]): Any = js.native
  def removeEventListener(`type`: EventType, handler: js.Function1[/* event */ Any, Unit], capture: Boolean): Any = js.native
  
  def run(
    callback: js.Function1[/* iStorage */ this.type, Unit],
    store_names: js.Array[String],
    mode: TransactionMode
  ): Request = js.native
  
  def search(catalog_name: String, query: String): Request = js.native
  def search(catalog_name: String, query: String, limit: Double): Request = js.native
  def search(catalog_name: String, query: String, limit: Double, threshold: Double): Request = js.native
  def search(catalog_name: String, query: String, limit: Unit, threshold: Double): Request = js.native
  
  def setName(name: String): Any = js.native
  
  def transaction(
    callback: js.Function1[/* tx */ Any, Unit],
    store_names: js.Array[String],
    mode: TransactionMode,
    completed_handler: js.Function2[/* type */ String, /* e */ js.UndefOr[js.Error], Unit]
  ): Any = js.native
}
