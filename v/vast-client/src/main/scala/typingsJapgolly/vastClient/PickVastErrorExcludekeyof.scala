package typingsJapgolly.vastClient

import typingsJapgolly.vastClient.mod.VastAdExtension
import typingsJapgolly.vastClient.mod.VastSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<vast-client.vast-client.VastError, std.Exclude<keyof vast-client.vast-client.VastError, 'ERRORCODE'>> */
trait PickVastErrorExcludekeyof extends js.Object {
  var ERRORMESSAGE: js.UndefOr[String] = js.undefined
  var extensions: js.UndefOr[js.Array[VastAdExtension]] = js.undefined
  var system: js.UndefOr[VastSystem | String] = js.undefined
}

object PickVastErrorExcludekeyof {
  @scala.inline
  def apply(
    ERRORMESSAGE: String = null,
    extensions: js.Array[VastAdExtension] = null,
    system: VastSystem | String = null
  ): PickVastErrorExcludekeyof = {
    val __obj = js.Dynamic.literal()
    if (ERRORMESSAGE != null) __obj.updateDynamic("ERRORMESSAGE")(ERRORMESSAGE.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (system != null) __obj.updateDynamic("system")(system.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickVastErrorExcludekeyof]
  }
}

