package typingsJapgolly.activeWin.mod

import typingsJapgolly.activeWin.AnonHeight
import typingsJapgolly.activeWin.activeWinStrings.linux
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinuxResult
  extends BaseResult
     with Result {
  var platform: linux
}

object LinuxResult {
  @scala.inline
  def apply(
    bounds: AnonHeight,
    id: Double,
    memoryUsage: Double,
    owner: BaseOwner,
    platform: linux,
    title: String
  ): LinuxResult = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LinuxResult]
  }
}

