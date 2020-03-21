package typingsJapgolly.awsSdk.textractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectDocumentTextRequest extends js.Object {
  /**
    * The input document as base64-encoded bytes or an Amazon S3 object. If you use the AWS CLI to call Amazon Textract operations, you can't pass image bytes. The document must be an image in JPEG or PNG format. If you're using an AWS SDK to call Amazon Textract, you might not need to base64-encode image bytes that are passed using the Bytes field. 
    */
  var Document: typingsJapgolly.awsSdk.textractMod.Document = js.native
}

object DetectDocumentTextRequest {
  @scala.inline
  def apply(Document: Document): DetectDocumentTextRequest = {
    val __obj = js.Dynamic.literal(Document = Document.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DetectDocumentTextRequest]
  }
}

