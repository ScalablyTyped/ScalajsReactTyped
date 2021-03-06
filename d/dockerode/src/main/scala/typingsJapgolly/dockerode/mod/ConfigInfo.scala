package typingsJapgolly.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigInfo extends js.Object {
  var CreatedAt: String
  var ID: String
  var Spec: js.UndefOr[ConfigSpec] = js.undefined
  var UpdatedAt: js.UndefOr[String] = js.undefined
  var Version: SecretVersion
}

object ConfigInfo {
  @scala.inline
  def apply(
    CreatedAt: String,
    ID: String,
    Version: SecretVersion,
    Spec: ConfigSpec = null,
    UpdatedAt: String = null
  ): ConfigInfo = {
    val __obj = js.Dynamic.literal(CreatedAt = CreatedAt.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    if (Spec != null) __obj.updateDynamic("Spec")(Spec.asInstanceOf[js.Any])
    if (UpdatedAt != null) __obj.updateDynamic("UpdatedAt")(UpdatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigInfo]
  }
}

