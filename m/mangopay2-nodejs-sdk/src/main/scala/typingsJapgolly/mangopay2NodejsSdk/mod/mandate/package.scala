package typingsJapgolly.mangopay2NodejsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mandate {
  type MandateExecutionType = typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WEB
  /**
    * - "CREATED" - the mandate has been created
    * - "SUBMITTED" - the mandate has been submitted to the banks and you can now do payments with this mandate
    * - "ACTIVE" - the mandate is active and has been accepted by the banks and/or successfully used in a payment
    * - "FAILED" - the mandate has failed for a variety of reasons and is no longer available for payments
    */
  type MandateStatus = typingsJapgolly.mangopay2NodejsSdk.typesMod.ValueOf[typingsJapgolly.mangopay2NodejsSdk.mod.IMandateStatus]
  type MandateType = typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DIRECT_DEBIT
}
