package typingsJapgolly.argon2Browser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Argon2BrowserHashOptions extends js.Object {
  var distPath: js.UndefOr[String] = js.undefined
  var hashLen: js.UndefOr[Double] = js.undefined
  var mem: js.UndefOr[Double] = js.undefined
  var parallelism: js.UndefOr[Double] = js.undefined
  var pass: String | scala.scalajs.js.typedarray.Uint8Array
  var salt: String | scala.scalajs.js.typedarray.Uint8Array
  var time: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[ArgonType] = js.undefined
}

object Argon2BrowserHashOptions {
  @scala.inline
  def apply(
    pass: String | scala.scalajs.js.typedarray.Uint8Array,
    salt: String | scala.scalajs.js.typedarray.Uint8Array,
    distPath: String = null,
    hashLen: Int | Double = null,
    mem: Int | Double = null,
    parallelism: Int | Double = null,
    time: Int | Double = null,
    `type`: ArgonType = null
  ): Argon2BrowserHashOptions = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
    if (distPath != null) __obj.updateDynamic("distPath")(distPath.asInstanceOf[js.Any])
    if (hashLen != null) __obj.updateDynamic("hashLen")(hashLen.asInstanceOf[js.Any])
    if (mem != null) __obj.updateDynamic("mem")(mem.asInstanceOf[js.Any])
    if (parallelism != null) __obj.updateDynamic("parallelism")(parallelism.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Argon2BrowserHashOptions]
  }
}

