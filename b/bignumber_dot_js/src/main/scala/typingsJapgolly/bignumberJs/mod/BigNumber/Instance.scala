package typingsJapgolly.bignumberJs.mod.BigNumber

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance
  extends /* key */ StringDictionary[js.Any] {
  /** The coefficient of the value of this BigNumber, an array of base 1e14 integer numbers, or null. */
  val c: js.Array[Double] | Null
  /** The exponent of the value of this BigNumber, an integer number, -1000000000 to 1000000000, or null. */
  val e: Double | Null
  /** The sign of the value of this BigNumber, -1, 1, or null. */
  val s: Double | Null
}

object Instance {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    c: js.Array[Double] = null,
    e: Int | Double = null,
    s: Int | Double = null
  ): Instance = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (c != null) __obj.updateDynamic("c")(c.asInstanceOf[js.Any])
    if (e != null) __obj.updateDynamic("e")(e.asInstanceOf[js.Any])
    if (s != null) __obj.updateDynamic("s")(s.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
}

