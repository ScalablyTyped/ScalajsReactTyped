package typingsJapgolly.dojo.dojox.encoding.compression

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/encoding/compression/lzw.html
  *
  *
  */
trait lzw extends js.Object {
  /**
    *
    * @param n
    */
  def Decoder(n: js.Any): Unit
  /**
    *
    * @param n
    */
  def Encoder(n: js.Any): Unit
}

object lzw {
  @scala.inline
  def apply(Decoder: js.Any => Callback, Encoder: js.Any => Callback): lzw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Decoder")(js.Any.fromFunction1((t0: js.Any) => Decoder(t0).runNow()))
    __obj.updateDynamic("Encoder")(js.Any.fromFunction1((t0: js.Any) => Encoder(t0).runNow()))
    __obj.asInstanceOf[lzw]
  }
}

