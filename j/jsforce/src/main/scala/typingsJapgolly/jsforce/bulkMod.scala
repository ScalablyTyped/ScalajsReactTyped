package typingsJapgolly.jsforce

import typingsJapgolly.jsforce.batchMod.Batch
import typingsJapgolly.jsforce.batchMod.BatchResultInfo
import typingsJapgolly.jsforce.connectionMod.Connection
import typingsJapgolly.jsforce.jobMod.Job
import typingsJapgolly.jsforce.jsforceStrings.Parallel
import typingsJapgolly.jsforce.jsforceStrings.Serial
import typingsJapgolly.jsforce.recordMod.Record
import typingsJapgolly.jsforce.recordResultMod.RecordResult
import typingsJapgolly.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bulkMod {
  
  @JSImport("jsforce/bulk", "Bulk")
  @js.native
  open class Bulk protected () extends StObject {
    def this(connection: Connection) = this()
    
    def createJob(`type`: String, operation: String): Job = js.native
    def createJob(`type`: String, operation: String, options: BulkOptions): Job = js.native
    
    def job(id: String): Job = js.native
    
    def load(`type`: String, operation: BulkLoadOperation): Batch = js.native
    def load(`type`: String, operation: BulkLoadOperation, options: Unit, input: String): Batch = js.native
    def load(
      `type`: String,
      operation: BulkLoadOperation,
      options: Unit,
      input: String,
      callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
    ): Batch = js.native
    def load(`type`: String, operation: BulkLoadOperation, options: Unit, input: js.Array[Record[Any]]): Batch = js.native
    def load(
      `type`: String,
      operation: BulkLoadOperation,
      options: Unit,
      input: js.Array[Record[Any]],
      callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
    ): Batch = js.native
    def load(
      `type`: String,
      operation: BulkLoadOperation,
      options: Unit,
      input: Unit,
      callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
    ): Batch = js.native
    def load(`type`: String, operation: BulkLoadOperation, options: Unit, input: Stream): Batch = js.native
    def load(
      `type`: String,
      operation: BulkLoadOperation,
      options: Unit,
      input: Stream,
      callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
    ): Batch = js.native
    def load(`type`: String, operation: BulkLoadOperation, options: BulkOptions): Batch = js.native
    def load(`type`: String, operation: BulkLoadOperation, options: BulkOptions, input: String): Batch = js.native
    def load(
      `type`: String,
      operation: BulkLoadOperation,
      options: BulkOptions,
      input: String,
      callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
    ): Batch = js.native
    def load(`type`: String, operation: BulkLoadOperation, options: BulkOptions, input: js.Array[Record[Any]]): Batch = js.native
    def load(
      `type`: String,
      operation: BulkLoadOperation,
      options: BulkOptions,
      input: js.Array[Record[Any]],
      callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
    ): Batch = js.native
    def load(
      `type`: String,
      operation: BulkLoadOperation,
      options: BulkOptions,
      input: Unit,
      callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
    ): Batch = js.native
    def load(`type`: String, operation: BulkLoadOperation, options: BulkOptions, input: Stream): Batch = js.native
    def load(
      `type`: String,
      operation: BulkLoadOperation,
      options: BulkOptions,
      input: Stream,
      callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
    ): Batch = js.native
    
    var pollInterval: Double = js.native
    
    var pollTimeout: Double = js.native
    
    def query(soql: String): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jsforce.jsforceStrings.insert
    - typingsJapgolly.jsforce.jsforceStrings.update
    - typingsJapgolly.jsforce.jsforceStrings.upsert
    - typingsJapgolly.jsforce.jsforceStrings.delete
    - typingsJapgolly.jsforce.jsforceStrings.hardDelete
  */
  trait BulkLoadOperation extends StObject
  object BulkLoadOperation {
    
    inline def delete: typingsJapgolly.jsforce.jsforceStrings.delete = "delete".asInstanceOf[typingsJapgolly.jsforce.jsforceStrings.delete]
    
    inline def hardDelete: typingsJapgolly.jsforce.jsforceStrings.hardDelete = "hardDelete".asInstanceOf[typingsJapgolly.jsforce.jsforceStrings.hardDelete]
    
    inline def insert: typingsJapgolly.jsforce.jsforceStrings.insert = "insert".asInstanceOf[typingsJapgolly.jsforce.jsforceStrings.insert]
    
    inline def update: typingsJapgolly.jsforce.jsforceStrings.update = "update".asInstanceOf[typingsJapgolly.jsforce.jsforceStrings.update]
    
    inline def upsert: typingsJapgolly.jsforce.jsforceStrings.upsert = "upsert".asInstanceOf[typingsJapgolly.jsforce.jsforceStrings.upsert]
  }
  
  trait BulkOptions extends StObject {
    
    var concurrencyMode: js.UndefOr[Serial | Parallel] = js.undefined
    
    var extIdField: String
  }
  object BulkOptions {
    
    inline def apply(extIdField: String): BulkOptions = {
      val __obj = js.Dynamic.literal(extIdField = extIdField.asInstanceOf[js.Any])
      __obj.asInstanceOf[BulkOptions]
    }
    
    extension [Self <: BulkOptions](x: Self) {
      
      inline def setConcurrencyMode(value: Serial | Parallel): Self = StObject.set(x, "concurrencyMode", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyModeUndefined: Self = StObject.set(x, "concurrencyMode", js.undefined)
      
      inline def setExtIdField(value: String): Self = StObject.set(x, "extIdField", value.asInstanceOf[js.Any])
    }
  }
}
