package typingsJapgolly.dojo.dojox.encoding.digests

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/encoding/digests/_sha-64.html
  *
  *
  */
trait sha64 extends js.Object {
  /**
    *
    */
  var outputTypes: js.Object
  /**
    *
    * @param msg
    * @param length
    * @param hash
    * @param depth
    */
  def digest(msg: js.Any, length: js.Any, hash: js.Any, depth: js.Any): js.Array[_]
  /**
    *
    * @param s
    */
  def stringToUtf8(s: js.Any): js.Any
  /**
    *
    * @param wa
    */
  def toBase64(wa: js.Any): js.Any
  /**
    *
    * @param wa
    */
  def toHex(wa: js.Any): js.Any
  /**
    *
    * @param s
    */
  def toWord(s: js.Any): js.Any
}

object sha64 {
  @scala.inline
  def apply(
    digest: (js.Any, js.Any, js.Any, js.Any) => CallbackTo[js.Array[js.Any]],
    outputTypes: js.Object,
    stringToUtf8: js.Any => CallbackTo[js.Any],
    toBase64: js.Any => CallbackTo[js.Any],
    toHex: js.Any => CallbackTo[js.Any],
    toWord: js.Any => CallbackTo[js.Any]
  ): sha64 = {
    val __obj = js.Dynamic.literal(outputTypes = outputTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("digest")(js.Any.fromFunction4((t0: js.Any, t1: js.Any, t2: js.Any, t3: js.Any) => digest(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("stringToUtf8")(js.Any.fromFunction1((t0: js.Any) => stringToUtf8(t0).runNow()))
    __obj.updateDynamic("toBase64")(js.Any.fromFunction1((t0: js.Any) => toBase64(t0).runNow()))
    __obj.updateDynamic("toHex")(js.Any.fromFunction1((t0: js.Any) => toHex(t0).runNow()))
    __obj.updateDynamic("toWord")(js.Any.fromFunction1((t0: js.Any) => toWord(t0).runNow()))
    __obj.asInstanceOf[sha64]
  }
}

