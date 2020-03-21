package typingsJapgolly.mangopay2NodejsSdk.mod

import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BUSINESS
import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified
import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ORGANIZATION
import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SOLETRADER
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILegalPersonType extends js.Object {
  var Business: BUSINESS
  var NotSpecified: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.NotSpecified
  var Organization: ORGANIZATION
  var Soletrader: SOLETRADER
}

object ILegalPersonType {
  @scala.inline
  def apply(Business: BUSINESS, NotSpecified: NotSpecified, Organization: ORGANIZATION, Soletrader: SOLETRADER): ILegalPersonType = {
    val __obj = js.Dynamic.literal(Business = Business.asInstanceOf[js.Any], NotSpecified = NotSpecified.asInstanceOf[js.Any], Organization = Organization.asInstanceOf[js.Any], Soletrader = Soletrader.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ILegalPersonType]
  }
}

