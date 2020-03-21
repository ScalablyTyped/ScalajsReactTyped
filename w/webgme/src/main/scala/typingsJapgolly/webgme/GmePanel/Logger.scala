package typingsJapgolly.webgme.GmePanel

import typingsJapgolly.webgme.GmeConfig.GmeConfig
import typingsJapgolly.webgme.GmeConfig.LogOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GmePanel.Logger")
@js.native
class Logger () extends js.Object {
  def createLogger(name: String, options: LogOptions): Logger = js.native
  def createWithGmeConfig(name: String, gmeConfig: GmeConfig): Logger = js.native
}

