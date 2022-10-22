package typingsJapgolly.mangopay2NodejsSdk.mod.models

import typingsJapgolly.mangopay2NodejsSdk.typingsModelsWalletMod.wallet.CreateWallet
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsWalletMod.wallet.UpdateWallet
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsWalletMod.wallet.WalletData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.Wallet")
@js.native
open class Wallet protected () extends EntityBase[WalletData] {
  def this(data: CreateWallet) = this()
  def this(data: UpdateWallet) = this()
}
