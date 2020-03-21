package typingsJapgolly.nodeMailjet.mod.SMS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportResponseData extends js.Object {
  val CreationTS: js.UndefOr[Double] = js.undefined
  val ExpirationTS: js.UndefOr[Double] = js.undefined
  val FromTs: js.UndefOr[Double] = js.undefined
  val ID: Double
  val Status: ResponseStatus
  val ToTs: js.UndefOr[Double] = js.undefined
  val URL: js.UndefOr[String] = js.undefined
}

object ExportResponseData {
  @scala.inline
  def apply(
    ID: Double,
    Status: ResponseStatus,
    CreationTS: Int | Double = null,
    ExpirationTS: Int | Double = null,
    FromTs: Int | Double = null,
    ToTs: Int | Double = null,
    URL: String = null
  ): ExportResponseData = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    if (CreationTS != null) __obj.updateDynamic("CreationTS")(CreationTS.asInstanceOf[js.Any])
    if (ExpirationTS != null) __obj.updateDynamic("ExpirationTS")(ExpirationTS.asInstanceOf[js.Any])
    if (FromTs != null) __obj.updateDynamic("FromTs")(FromTs.asInstanceOf[js.Any])
    if (ToTs != null) __obj.updateDynamic("ToTs")(ToTs.asInstanceOf[js.Any])
    if (URL != null) __obj.updateDynamic("URL")(URL.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportResponseData]
  }
}

