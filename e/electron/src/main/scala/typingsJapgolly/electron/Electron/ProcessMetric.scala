package typingsJapgolly.electron.Electron

import typingsJapgolly.electron.electronStrings.Browser
import typingsJapgolly.electron.electronStrings.GPU
import typingsJapgolly.electron.electronStrings.Tab
import typingsJapgolly.electron.electronStrings.Unknown
import typingsJapgolly.electron.electronStrings.Utility
import typingsJapgolly.electron.electronStrings.Zygote
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessMetric extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/process-metric
  /**
    * CPU usage of the process.
    */
  var cpu: CPUUsage
  /**
    * Process id of the process.
    */
  var pid: Double
  /**
    * Process type. One of the following values:
    */
  var `type`: Browser | Tab | Utility | Zygote | GPU | Unknown
}

object ProcessMetric {
  @scala.inline
  def apply(cpu: CPUUsage, pid: Double, `type`: Browser | Tab | Utility | Zygote | GPU | Unknown): ProcessMetric = {
    val __obj = js.Dynamic.literal(cpu = cpu.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessMetric]
  }
}

