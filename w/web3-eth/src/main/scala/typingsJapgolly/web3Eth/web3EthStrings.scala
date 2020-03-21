package typingsJapgolly.web3Eth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object web3EthStrings {
  @js.native
  sealed trait logs extends js.Object
  
  @js.native
  sealed trait newBlockHeaders extends js.Object
  
  @js.native
  sealed trait pendingTransactions extends js.Object
  
  @js.native
  sealed trait syncing extends js.Object
  
  @scala.inline
  def logs: logs = "logs".asInstanceOf[logs]
  @scala.inline
  def newBlockHeaders: newBlockHeaders = "newBlockHeaders".asInstanceOf[newBlockHeaders]
  @scala.inline
  def pendingTransactions: pendingTransactions = "pendingTransactions".asInstanceOf[pendingTransactions]
  @scala.inline
  def syncing: syncing = "syncing".asInstanceOf[syncing]
}

