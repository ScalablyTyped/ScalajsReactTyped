package typingsJapgolly.log4js.mod

import typingsJapgolly.log4js.AnonFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Log4js extends js.Object {
  	// express.Handler;
  var levels: Levels_ = js.native
  def addLayout(
    name: String,
    config: js.Function1[/* a */ js.Any, js.Function1[/* logEvent */ LoggingEvent, String]]
  ): Unit = js.native
  def configure(config: Configuration): Log4js = js.native
  def configure(filename: String): Log4js = js.native
  def connectLogger(logger: Logger, options: AnonFormat): js.Any = js.native
  def getLogger(): Logger = js.native
  def getLogger(category: String): Logger = js.native
  def shutdown(cb: js.Function1[/* error */ js.Error, Unit]): Unit | Null = js.native
}

