package typingsJapgolly.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSVMappingParameters extends js.Object {
  /**
    * Column delimiter. For example, in a CSV format, a comma (",") is the typical column delimiter.
    */
  var RecordColumnDelimiter: typingsJapgolly.awsSdk.kinesisanalyticsMod.RecordColumnDelimiter = js.native
  /**
    * Row delimiter. For example, in a CSV format, '\n' is the typical row delimiter.
    */
  var RecordRowDelimiter: typingsJapgolly.awsSdk.kinesisanalyticsMod.RecordRowDelimiter = js.native
}

object CSVMappingParameters {
  @scala.inline
  def apply(RecordColumnDelimiter: RecordColumnDelimiter, RecordRowDelimiter: RecordRowDelimiter): CSVMappingParameters = {
    val __obj = js.Dynamic.literal(RecordColumnDelimiter = RecordColumnDelimiter.asInstanceOf[js.Any], RecordRowDelimiter = RecordRowDelimiter.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CSVMappingParameters]
  }
}

