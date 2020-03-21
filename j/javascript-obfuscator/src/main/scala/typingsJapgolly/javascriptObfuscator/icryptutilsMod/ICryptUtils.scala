package typingsJapgolly.javascriptObfuscator.icryptutilsMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICryptUtils extends js.Object {
  /**
    * @param string
    */
  def btoa(string: String): String
  /**
    * @param str
    * @param length
    * @returns {[string, string]}
    */
  def hideString(str: String, length: Double): js.Tuple2[String, String]
  /**
    * @param key
    * @param string
    * @returns {string}
    */
  /* tslint:disable */
  def rc4(string: String, key: String): String
}

object ICryptUtils {
  @scala.inline
  def apply(
    btoa: String => CallbackTo[String],
    hideString: (String, Double) => CallbackTo[js.Tuple2[String, String]],
    rc4: (String, String) => CallbackTo[String]
  ): ICryptUtils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("btoa")(js.Any.fromFunction1((t0: java.lang.String) => btoa(t0).runNow()))
    __obj.updateDynamic("hideString")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => hideString(t0, t1).runNow()))
    __obj.updateDynamic("rc4")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => rc4(t0, t1).runNow()))
    __obj.asInstanceOf[ICryptUtils]
  }
}

