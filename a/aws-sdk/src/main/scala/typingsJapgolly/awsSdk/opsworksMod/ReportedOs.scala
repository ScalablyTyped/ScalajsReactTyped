package typingsJapgolly.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportedOs extends js.Object {
  /**
    * The operating system family.
    */
  var Family: js.UndefOr[String] = js.native
  /**
    * The operating system name.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The operating system version.
    */
  var Version: js.UndefOr[String] = js.native
}

object ReportedOs {
  @scala.inline
  def apply(Family: String = null, Name: String = null, Version: String = null): ReportedOs = {
    val __obj = js.Dynamic.literal()
    if (Family != null) __obj.updateDynamic("Family")(Family.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportedOs]
  }
}

