package typingsJapgolly.firebaseFirestore

import typingsJapgolly.firebaseFirestore.remoteConnectivityMonitorMod.NetworkStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object firebaseFirestoreNumbers {
  @js.native
  sealed trait `-1` extends js.Object
  
  @js.native
  sealed trait `0`
    extends NetworkStatus
       with typingsJapgolly.firebaseFirestore.connectivityMonitorMod.NetworkStatus
  
  @js.native
  sealed trait `1`
    extends NetworkStatus
       with typingsJapgolly.firebaseFirestore.connectivityMonitorMod.NetworkStatus
  
  @js.native
  sealed trait `9` extends js.Object
  
  @scala.inline
  def `-1`: `-1` = -1.asInstanceOf[`-1`]
  @scala.inline
  def `0`: `0` = 0.asInstanceOf[`0`]
  @scala.inline
  def `1`: `1` = 1.asInstanceOf[`1`]
  @scala.inline
  def `9`: `9` = 9.asInstanceOf[`9`]
}

