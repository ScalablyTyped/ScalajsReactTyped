package typingsJapgolly.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCertissuer extends js.Object {
  var certissuer: js.UndefOr[String] = js.undefined
  var certsubject: js.UndefOr[String] = js.undefined
  var ldapstr: String
}

object AnonCertissuer {
  @scala.inline
  def apply(ldapstr: String, certissuer: String = null, certsubject: String = null): AnonCertissuer = {
    val __obj = js.Dynamic.literal(ldapstr = ldapstr.asInstanceOf[js.Any])
    if (certissuer != null) __obj.updateDynamic("certissuer")(certissuer.asInstanceOf[js.Any])
    if (certsubject != null) __obj.updateDynamic("certsubject")(certsubject.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCertissuer]
  }
}

