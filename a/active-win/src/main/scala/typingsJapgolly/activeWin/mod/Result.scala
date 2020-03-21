package typingsJapgolly.activeWin.mod

import typingsJapgolly.activeWin.AnonHeight
import typingsJapgolly.activeWin.activeWinStrings.linux
import typingsJapgolly.activeWin.activeWinStrings.macos
import typingsJapgolly.activeWin.activeWinStrings.windows
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.activeWin.mod.MacOSResult
  - typingsJapgolly.activeWin.mod.LinuxResult
  - typingsJapgolly.activeWin.mod.WindowsResult
*/
trait Result extends js.Object

object Result {
  @scala.inline
  def MacOSResult(
    bounds: AnonHeight,
    id: Double,
    memoryUsage: Double,
    owner: MacOSOwner,
    platform: macos,
    title: String
  ): Result = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  def LinuxResult(
    bounds: AnonHeight,
    id: Double,
    memoryUsage: Double,
    owner: BaseOwner,
    platform: linux,
    title: String
  ): Result = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  def WindowsResult(
    bounds: AnonHeight,
    id: Double,
    memoryUsage: Double,
    owner: BaseOwner,
    platform: windows,
    title: String
  ): Result = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], memoryUsage = memoryUsage.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Result]
  }
}

