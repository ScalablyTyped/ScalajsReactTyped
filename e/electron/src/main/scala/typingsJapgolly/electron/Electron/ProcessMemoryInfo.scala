package typingsJapgolly.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessMemoryInfo extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/process-memory-info
  /**
    * The amount of memory not shared by other processes, such as JS heap or HTML
    * content in Kilobytes.
    */
  var `private`: Double
  /**
    * and The amount of memory currently pinned to actual physical RAM in Kilobytes.
    */
  var residentSet: Double
  /**
    * The amount of memory shared between processes, typically memory consumed by the
    * Electron code itself in Kilobytes.
    */
  var shared: Double
}

object ProcessMemoryInfo {
  @scala.inline
  def apply(`private`: Double, residentSet: Double, shared: Double): ProcessMemoryInfo = {
    val __obj = js.Dynamic.literal(residentSet = residentSet.asInstanceOf[js.Any], shared = shared.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessMemoryInfo]
  }
}

