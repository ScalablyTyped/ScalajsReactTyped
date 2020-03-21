package typingsJapgolly.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectIntegrations extends js.Object {
  var capacitor: js.UndefOr[ProjectIntegration] = js.undefined
  var cordova: js.UndefOr[ProjectIntegration] = js.undefined
  var enterprise: js.UndefOr[EnterpriseProjectIntegration] = js.undefined
}

object ProjectIntegrations {
  @scala.inline
  def apply(
    capacitor: ProjectIntegration = null,
    cordova: ProjectIntegration = null,
    enterprise: EnterpriseProjectIntegration = null
  ): ProjectIntegrations = {
    val __obj = js.Dynamic.literal()
    if (capacitor != null) __obj.updateDynamic("capacitor")(capacitor.asInstanceOf[js.Any])
    if (cordova != null) __obj.updateDynamic("cordova")(cordova.asInstanceOf[js.Any])
    if (enterprise != null) __obj.updateDynamic("enterprise")(enterprise.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectIntegrations]
  }
}

