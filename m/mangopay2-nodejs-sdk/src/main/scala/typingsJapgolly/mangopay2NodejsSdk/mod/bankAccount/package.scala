package typingsJapgolly.mangopay2NodejsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bankAccount {
  type CAData = typingsJapgolly.mangopay2NodejsSdk.mod.bankAccount.BaseData with typingsJapgolly.mangopay2NodejsSdk.mod.bankAccount.CADetails
  type Data = typingsJapgolly.mangopay2NodejsSdk.mod.bankAccount.OtherData | typingsJapgolly.mangopay2NodejsSdk.mod.bankAccount.CAData | typingsJapgolly.mangopay2NodejsSdk.mod.bankAccount.GBData | typingsJapgolly.mangopay2NodejsSdk.mod.bankAccount.IBANData | typingsJapgolly.mangopay2NodejsSdk.mod.bankAccount.USData
  type GBData = typingsJapgolly.mangopay2NodejsSdk.mod.bankAccount.BaseData with typingsJapgolly.mangopay2NodejsSdk.mod.bankAccount.GBDetails
  type IBANData = typingsJapgolly.mangopay2NodejsSdk.mod.bankAccount.BaseData with typingsJapgolly.mangopay2NodejsSdk.mod.bankAccount.IBANDetails
  type OtherData = typingsJapgolly.mangopay2NodejsSdk.mod.bankAccount.BaseData with typingsJapgolly.mangopay2NodejsSdk.mod.bankAccount.OtherDetails
  type USData = typingsJapgolly.mangopay2NodejsSdk.mod.bankAccount.BaseData with typingsJapgolly.mangopay2NodejsSdk.mod.bankAccount.USDetails
}
