package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFSoftwarePlatformType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMFilesVersion extends js.Object {
  var Build: Double
  val Display: String
  var Major: Double
  var Minor: Double
  var Patch: Double
  var SoftwarePlatform: MFSoftwarePlatformType
  def Clone(): IMFilesVersion
  def CompareTo(RightSide: IMFilesVersion): Double
}

object IMFilesVersion {
  @scala.inline
  def apply(
    Build: Double,
    Clone: CallbackTo[IMFilesVersion],
    CompareTo: IMFilesVersion => CallbackTo[Double],
    Display: String,
    Major: Double,
    Minor: Double,
    Patch: Double,
    SoftwarePlatform: MFSoftwarePlatformType
  ): IMFilesVersion = {
    val __obj = js.Dynamic.literal(Build = Build.asInstanceOf[js.Any], Display = Display.asInstanceOf[js.Any], Major = Major.asInstanceOf[js.Any], Minor = Minor.asInstanceOf[js.Any], Patch = Patch.asInstanceOf[js.Any], SoftwarePlatform = SoftwarePlatform.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("CompareTo")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IMFilesVersion) => CompareTo(t0).runNow()))
    __obj.asInstanceOf[IMFilesVersion]
  }
}

