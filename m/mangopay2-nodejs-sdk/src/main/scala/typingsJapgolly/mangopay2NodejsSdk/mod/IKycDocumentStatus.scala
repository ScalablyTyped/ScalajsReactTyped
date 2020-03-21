package typingsJapgolly.mangopay2NodejsSdk.mod

import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CREATED
import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.REFUSED
import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATED
import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.VALIDATION_ASKED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKycDocumentStatus extends js.Object {
  var Created: CREATED
  var Refused: REFUSED
  var Validated: VALIDATED
  var ValidationAsked: VALIDATION_ASKED
}

object IKycDocumentStatus {
  @scala.inline
  def apply(Created: CREATED, Refused: REFUSED, Validated: VALIDATED, ValidationAsked: VALIDATION_ASKED): IKycDocumentStatus = {
    val __obj = js.Dynamic.literal(Created = Created.asInstanceOf[js.Any], Refused = Refused.asInstanceOf[js.Any], Validated = Validated.asInstanceOf[js.Any], ValidationAsked = ValidationAsked.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IKycDocumentStatus]
  }
}

