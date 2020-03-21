package typingsJapgolly.hexoBunyan.mod

import typingsJapgolly.bunyan.mod.Logger
import typingsJapgolly.bunyan.mod.LoggerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-bunyan", "createLogger")
@js.native
object createLogger extends js.Object {
  def apply(options: LoggerOptions): Logger = js.native
}

