package typingsJapgolly.mendixmodelsdk.mod

import typingsJapgolly.mendixmodelsdk.transactionManagerMod.TransactionManager
import typingsJapgolly.mendixmodelsdk.transactionManagerMod.TransactionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "Transaction")
@js.native
class Transaction protected ()
  extends typingsJapgolly.mendixmodelsdk.transactionManagerMod.Transaction {
  def this(transactionType: TransactionType, transactionManager: TransactionManager) = this()
}

