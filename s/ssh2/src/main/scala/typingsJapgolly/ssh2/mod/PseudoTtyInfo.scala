package typingsJapgolly.ssh2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PseudoTtyInfo extends js.Object {
  /** The number of columns for the pseudo-TTY. */
  var cols: Double
  /** The height of the pseudo-TTY in pixels. */
  var height: Double
  /** Contains the requested terminal modes of the pseudo-TTY. */
  var modes: TerminalModes
  /** The number of rows for the pseudo-TTY. */
  var rows: Double
  /** The width of the pseudo-TTY in pixels. */
  var width: Double
}

object PseudoTtyInfo {
  @scala.inline
  def apply(cols: Double, height: Double, modes: TerminalModes, rows: Double, width: Double): PseudoTtyInfo = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], modes = modes.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PseudoTtyInfo]
  }
}

