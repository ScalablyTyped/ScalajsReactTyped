package typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-firebase", "RNFirebase.firestore.Timestamp")
@js.native
class Timestamp protected () extends js.Object {
  def this(seconds: Double, nanoseconds: Double) = this()
  val nanoseconds: Double = js.native
  val seconds: Double = js.native
  def isEqual(other: Timestamp): Boolean = js.native
  def toDate(): js.Date = js.native
  def toMillis(): Double = js.native
}

/* static members */
@JSImport("react-native-firebase", "RNFirebase.firestore.Timestamp")
@js.native
object Timestamp extends js.Object {
  def fromDate(date: js.Date): Timestamp = js.native
  def fromMillis(milliseconds: Double): Timestamp = js.native
  def now(): Timestamp = js.native
}

