package typingsJapgolly.reactNativeJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailOptions extends js.Object {
  /**
    * Numerical threshold at which an email address is considered invalid
    */
  var errorLevel: js.UndefOr[Double | Boolean] = js.undefined
  /**
    * Number of atoms required for the domain. Be careful since some domains, such as io, directly allow email.
    */
  var minDomainAtoms: js.UndefOr[Double] = js.undefined
  /**
    * Specifies a list of acceptable TLDs.
    */
  var tldWhitelist: js.UndefOr[js.Array[String] | js.Object] = js.undefined
}

object EmailOptions {
  @scala.inline
  def apply(
    errorLevel: Double | Boolean = null,
    minDomainAtoms: Int | Double = null,
    tldWhitelist: js.Array[String] | js.Object = null
  ): EmailOptions = {
    val __obj = js.Dynamic.literal()
    if (errorLevel != null) __obj.updateDynamic("errorLevel")(errorLevel.asInstanceOf[js.Any])
    if (minDomainAtoms != null) __obj.updateDynamic("minDomainAtoms")(minDomainAtoms.asInstanceOf[js.Any])
    if (tldWhitelist != null) __obj.updateDynamic("tldWhitelist")(tldWhitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailOptions]
  }
}

