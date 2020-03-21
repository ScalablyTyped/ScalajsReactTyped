package typingsJapgolly.jsforce.bulkMod

import typingsJapgolly.jsforce.batchMod.Batch
import typingsJapgolly.jsforce.batchMod.BatchResultInfo
import typingsJapgolly.jsforce.connectionMod.Connection
import typingsJapgolly.jsforce.jobMod.Job
import typingsJapgolly.jsforce.recordMod.Record
import typingsJapgolly.jsforce.recordResultMod.RecordResult
import typingsJapgolly.node.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/bulk", "Bulk")
@js.native
class Bulk protected () extends js.Object {
  def this(connection: Connection) = this()
  var pollInterval: Double = js.native
  var pollTimeout: Double = js.native
  def createJob(`type`: String, operation: String): Job = js.native
  def createJob(`type`: String, operation: String, options: BulkOptions): Job = js.native
  def job(id: String): Job = js.native
  def load(`type`: String, operation: BulkLoadOperation): Batch = js.native
  def load(`type`: String, operation: BulkLoadOperation, options: BulkOptions): Batch = js.native
  def load(`type`: String, operation: BulkLoadOperation, options: BulkOptions, input: String): Batch = js.native
  def load(
    `type`: String,
    operation: BulkLoadOperation,
    options: BulkOptions,
    input: String,
    callback: js.Function2[/* err */ js.Error, /* result */ js.Array[BatchResultInfo | RecordResult], Unit]
  ): Batch = js.native
  def load(`type`: String, operation: BulkLoadOperation, options: BulkOptions, input: js.Array[Record[_]]): Batch = js.native
  def load(
    `type`: String,
    operation: BulkLoadOperation,
    options: BulkOptions,
    input: js.Array[Record[_]],
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
  def query(soql: String): js.Any = js.native
}

