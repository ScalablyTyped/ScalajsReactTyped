package typingsJapgolly.gun.mod.Gun

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gun.AnonBucket
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * options['module name'] allows you to pass options to a 3rd party module.
  * Their project README will likely list the exposed options
  * https://github.com/amark/gun/wiki/Modules
  */
/* Inlined std.Partial<{  file  :string,   web  :any,   s3  :{  key  :any,   secret  :any,   bucket  :any},   peers  :std.Record<string, {}>,   radisk  :boolean,   localStorage  :boolean, uuid (): string, [key: string] : any}> */
trait ConstructorOptions extends js.Object {
  var file: js.UndefOr[String] = js.undefined
  var localStorage: js.UndefOr[Boolean] = js.undefined
  var peers: js.UndefOr[Record[String, js.Object]] = js.undefined
  var radisk: js.UndefOr[Boolean] = js.undefined
  var s3: js.UndefOr[AnonBucket] = js.undefined
  var uuid: js.UndefOr[js.Function0[String]] = js.undefined
  var web: js.UndefOr[js.Any] = js.undefined
}

object ConstructorOptions {
  @scala.inline
  def apply(
    file: String = null,
    localStorage: js.UndefOr[Boolean] = js.undefined,
    peers: Record[String, js.Object] = null,
    radisk: js.UndefOr[Boolean] = js.undefined,
    s3: AnonBucket = null,
    uuid: js.UndefOr[CallbackTo[String]] = js.undefined,
    web: js.Any = null
  ): ConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (!js.isUndefined(localStorage)) __obj.updateDynamic("localStorage")(localStorage.asInstanceOf[js.Any])
    if (peers != null) __obj.updateDynamic("peers")(peers.asInstanceOf[js.Any])
    if (!js.isUndefined(radisk)) __obj.updateDynamic("radisk")(radisk.asInstanceOf[js.Any])
    if (s3 != null) __obj.updateDynamic("s3")(s3.asInstanceOf[js.Any])
    uuid.foreach(p => __obj.updateDynamic("uuid")(p.toJsFn))
    if (web != null) __obj.updateDynamic("web")(web.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorOptions]
  }
}

