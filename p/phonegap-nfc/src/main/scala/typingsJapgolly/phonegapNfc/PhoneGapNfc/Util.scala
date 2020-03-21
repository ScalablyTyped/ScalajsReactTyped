package typingsJapgolly.phonegapNfc.PhoneGapNfc

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Util extends js.Object {
  /**
    * Convert bytes to hexadecimal string
    * @param bytes
    */
  def bytesToHexString(bytes: js.Array[Double]): String
  /**
    * Convert bytes to string
    * @param bytes
    */
  def bytesToString(bytes: js.Array[Double]): String
  /**
    * Convert string to bytes
    * @param string
    */
  def stringToBytes(string: String): js.Array[Double]
}

object Util {
  @scala.inline
  def apply(
    bytesToHexString: js.Array[Double] => CallbackTo[String],
    bytesToString: js.Array[Double] => CallbackTo[String],
    stringToBytes: String => CallbackTo[js.Array[Double]]
  ): Util = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bytesToHexString")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => bytesToHexString(t0).runNow()))
    __obj.updateDynamic("bytesToString")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => bytesToString(t0).runNow()))
    __obj.updateDynamic("stringToBytes")(js.Any.fromFunction1((t0: java.lang.String) => stringToBytes(t0).runNow()))
    __obj.asInstanceOf[Util]
  }
}

