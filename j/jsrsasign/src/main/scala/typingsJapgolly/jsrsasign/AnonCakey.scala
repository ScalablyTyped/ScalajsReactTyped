package typingsJapgolly.jsrsasign

import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.NameParam
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.x509.Extension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCakey extends js.Object {
  var cakey: js.Tuple2[String, String]
  var ext: js.UndefOr[js.Array[Extension]] = js.undefined
  var issue: StringParam
  var notafter: StringParam
  var sbjpubkey: String
  var serial: IntegerParam
  var sigalg: NameParam
  var sighex: String
  var subject: StringParam
}

object AnonCakey {
  @scala.inline
  def apply(
    cakey: js.Tuple2[String, String],
    issue: StringParam,
    notafter: StringParam,
    sbjpubkey: String,
    serial: IntegerParam,
    sigalg: NameParam,
    sighex: String,
    subject: StringParam,
    ext: js.Array[Extension] = null
  ): AnonCakey = {
    val __obj = js.Dynamic.literal(cakey = cakey.asInstanceOf[js.Any], issue = issue.asInstanceOf[js.Any], notafter = notafter.asInstanceOf[js.Any], sbjpubkey = sbjpubkey.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], sigalg = sigalg.asInstanceOf[js.Any], sighex = sighex.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCakey]
  }
}

