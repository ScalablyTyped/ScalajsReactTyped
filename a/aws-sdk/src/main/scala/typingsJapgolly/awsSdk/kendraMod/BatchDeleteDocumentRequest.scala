package typingsJapgolly.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteDocumentRequest extends js.Object {
  /**
    * One or more identifiers for documents to delete from the index.
    */
  var DocumentIdList: typingsJapgolly.awsSdk.kendraMod.DocumentIdList = js.native
  /**
    * The identifier of the index that contains the documents to delete.
    */
  var IndexId: typingsJapgolly.awsSdk.kendraMod.IndexId = js.native
}

object BatchDeleteDocumentRequest {
  @scala.inline
  def apply(DocumentIdList: DocumentIdList, IndexId: IndexId): BatchDeleteDocumentRequest = {
    val __obj = js.Dynamic.literal(DocumentIdList = DocumentIdList.asInstanceOf[js.Any], IndexId = IndexId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchDeleteDocumentRequest]
  }
}

