package typingsJapgolly.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceRecord extends js.Object {
  /** Relative name of the object affected by this record. Only applicable for CNAME records. Example: 'www'. */
  var name: js.UndefOr[String] = js.undefined
  /** Data for this record. Values vary by record type, as defined in RFC 1035 (section 5) and RFC 1034 (section 3.6.1). */
  var rrdata: js.UndefOr[String] = js.undefined
  /** Resource record type. Example: AAAA. */
  var `type`: js.UndefOr[String] = js.undefined
}

object ResourceRecord {
  @scala.inline
  def apply(name: String = null, rrdata: String = null, `type`: String = null): ResourceRecord = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (rrdata != null) __obj.updateDynamic("rrdata")(rrdata.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceRecord]
  }
}

