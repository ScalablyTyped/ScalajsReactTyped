package typingsJapgolly.mangopay2NodejsSdk.mod

import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA
import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB
import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN
import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified
import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBankAccountType extends js.Object {
  var CA: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA
  var GB: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB
  var IBAN: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN
  var NotSpecified: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified
  var OTHER: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
  var US: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US
}

object IBankAccountType {
  @scala.inline
  def apply(CA: CA, GB: GB, IBAN: IBAN, NotSpecified: NotSpecified, OTHER: OTHER, US: US): IBankAccountType = {
    val __obj = js.Dynamic.literal(CA = CA.asInstanceOf[js.Any], GB = GB.asInstanceOf[js.Any], IBAN = IBAN.asInstanceOf[js.Any], NotSpecified = NotSpecified.asInstanceOf[js.Any], OTHER = OTHER.asInstanceOf[js.Any], US = US.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBankAccountType]
  }
}

