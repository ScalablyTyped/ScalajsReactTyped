package typingsJapgolly.dojo.dojox.html.styles

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/html/styles.entities.html
  *
  *
  */
trait entities extends js.Object {
  /**
    *
    */
  var html: js.Array[_]
  /**
    *
    */
  var latin: js.Array[_]
  /**
    * Function to obtain an entity encoding for a specified character
    *
    * @param str The string to process for possible entity encoding to decode.
    * @param m An optional list of character to entity name mappings (array ofarrays).  If not provided, it uses the HTML and Latin entities as theset to map and decode.
    */
  def decode(str: js.Any, m: js.Any): Unit
  /**
    * Function to obtain an entity encoding for a specified character
    *
    * @param str The string to process for possible entity encoding.
    * @param m An optional list of character to entity name mappings (array ofarrays).  If not provided, it uses the and Latin entities as theset to map and escape.
    */
  def encode(str: js.Any, m: js.Any): Unit
}

object entities {
  @scala.inline
  def apply(
    decode: (js.Any, js.Any) => Callback,
    encode: (js.Any, js.Any) => Callback,
    html: js.Array[_],
    latin: js.Array[_]
  ): entities = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], latin = latin.asInstanceOf[js.Any])
    __obj.updateDynamic("decode")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => decode(t0, t1).runNow()))
    __obj.updateDynamic("encode")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => encode(t0, t1).runNow()))
    __obj.asInstanceOf[entities]
  }
}

