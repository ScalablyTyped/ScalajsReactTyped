package typingsJapgolly.pizzip.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import typingsJapgolly.pizzip.AnonBase64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZipObject extends js.Object {
  /**
    * the comment for this file
    */
  var comment: String
  /**
    * the last modification date
    */
  var date: js.Date
  /**
    * true if this is a directory
    */
  var dir: Boolean
  /**
    * The DOS permissions of the file, if any.
    */
  var dosPermissions: Double
  /**
    * the absolute path of the file
    */
  var name: String
  /**
    * the options of the file.
    */
  var options: AnonBase64
  /**
    * The UNIX permissions of the file, if any. Also accepts a string representing the octal value : "644", "755", etc. On nodejs you can use the mode attribute of nodejs' fs.Stats.
    */
  var unixPermissions: Double | String
  /**
    * need a compatible browser. https://github.com/open-xml-templating/pizzip/blob/master/documentation/api_pizzip/support.md
    */
  def asArrayBuffer(): scala.scalajs.js.typedarray.ArrayBuffer
  /**
    * the content as binary string.
    */
  def asBinary(): String
  /**
    * need nodejs. https://github.com/open-xml-templating/pizzip/blob/master/documentation/api_pizzip/support.md
    */
  def asNodeBuffer(): Buffer
  /**
    * the content as an unicode string.
    */
  def asText(): String
  /**
    * need a compatible browser. https://github.com/open-xml-templating/pizzip/blob/master/documentation/api_pizzip/support.md
    */
  def asUint8Array(): scala.scalajs.js.typedarray.Uint8Array
}

object ZipObject {
  @scala.inline
  def apply(
    asArrayBuffer: CallbackTo[scala.scalajs.js.typedarray.ArrayBuffer],
    asBinary: CallbackTo[String],
    asNodeBuffer: CallbackTo[Buffer],
    asText: CallbackTo[String],
    asUint8Array: CallbackTo[scala.scalajs.js.typedarray.Uint8Array],
    comment: String,
    date: js.Date,
    dir: Boolean,
    dosPermissions: Double,
    name: String,
    options: AnonBase64,
    unixPermissions: Double | String
  ): ZipObject = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], dosPermissions = dosPermissions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], unixPermissions = unixPermissions.asInstanceOf[js.Any])
    __obj.updateDynamic("asArrayBuffer")(asArrayBuffer.toJsFn)
    __obj.updateDynamic("asBinary")(asBinary.toJsFn)
    __obj.updateDynamic("asNodeBuffer")(asNodeBuffer.toJsFn)
    __obj.updateDynamic("asText")(asText.toJsFn)
    __obj.updateDynamic("asUint8Array")(asUint8Array.toJsFn)
    __obj.asInstanceOf[ZipObject]
  }
}

