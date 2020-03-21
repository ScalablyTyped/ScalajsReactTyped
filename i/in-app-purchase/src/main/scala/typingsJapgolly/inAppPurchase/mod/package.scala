package typingsJapgolly.inAppPurchase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AmazonReceipt = js.Object | java.lang.String
  type AppleReceipt = java.lang.String
  type FacebookReceipt = java.lang.String
  type GoogleReceipt = typingsJapgolly.inAppPurchase.AnonData | java.lang.String
  type Receipt = typingsJapgolly.inAppPurchase.mod.UnityReceipt | typingsJapgolly.inAppPurchase.mod.AppleReceipt | typingsJapgolly.inAppPurchase.mod.GoogleReceipt | typingsJapgolly.inAppPurchase.mod.WindowsReceipt | typingsJapgolly.inAppPurchase.mod.AmazonReceipt | typingsJapgolly.inAppPurchase.mod.FacebookReceipt | typingsJapgolly.inAppPurchase.mod.RokuReceipt
  type RokuReceipt = java.lang.String
  type UnityReceipt = js.Object | java.lang.String
  type WindowsReceipt = java.lang.String
}
