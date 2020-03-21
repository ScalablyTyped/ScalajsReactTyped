package typingsJapgolly.dojo.dojox.encoding.crypto

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/encoding/crypto/_base.html
  *
  *
  */
trait base_ extends js.Object {
  /**
    *
    */
  var Blowfish: js.Object
  /**
    *
    */
  var SimpleAES: js.Object
  /**
    * Enumeration for various cipher modes.
    *
    */
  var cipherModes: js.Object
  /**
    * Enumeration for input and output encodings.
    *
    */
  var outputTypes: js.Object
  /**
    *
    */
  def RSAKey(): Unit
}

object base_ {
  @scala.inline
  def apply(
    Blowfish: js.Object,
    RSAKey: Callback,
    SimpleAES: js.Object,
    cipherModes: js.Object,
    outputTypes: js.Object
  ): base_ = {
    val __obj = js.Dynamic.literal(Blowfish = Blowfish.asInstanceOf[js.Any], SimpleAES = SimpleAES.asInstanceOf[js.Any], cipherModes = cipherModes.asInstanceOf[js.Any], outputTypes = outputTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("RSAKey")(RSAKey.toJsFn)
    __obj.asInstanceOf[base_]
  }
}

