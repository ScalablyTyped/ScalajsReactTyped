package typingsJapgolly.gapiClientFirebaserules.gapi.client.firebaserules

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetReleaseExecutableResponse extends js.Object {
  /** Executable view of the `Ruleset` referenced by the `Release`. */
  var executable: js.UndefOr[String] = js.undefined
  /** The Rules runtime version of the executable. */
  var executableVersion: js.UndefOr[String] = js.undefined
  /** `Language` used to generate the executable bytes. */
  var language: js.UndefOr[String] = js.undefined
  /** `Ruleset` name associated with the `Release` executable. */
  var rulesetName: js.UndefOr[String] = js.undefined
  /** Timestamp for the most recent `Release.update_time`. */
  var updateTime: js.UndefOr[String] = js.undefined
}

object GetReleaseExecutableResponse {
  @scala.inline
  def apply(
    executable: String = null,
    executableVersion: String = null,
    language: String = null,
    rulesetName: String = null,
    updateTime: String = null
  ): GetReleaseExecutableResponse = {
    val __obj = js.Dynamic.literal()
    if (executable != null) __obj.updateDynamic("executable")(executable.asInstanceOf[js.Any])
    if (executableVersion != null) __obj.updateDynamic("executableVersion")(executableVersion.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (rulesetName != null) __obj.updateDynamic("rulesetName")(rulesetName.asInstanceOf[js.Any])
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReleaseExecutableResponse]
  }
}

