package typingsJapgolly.novncCore

import typingsJapgolly.novncCore.novncCoreStrings.debug
import typingsJapgolly.novncCore.novncCoreStrings.error
import typingsJapgolly.novncCore.novncCoreStrings.info
import typingsJapgolly.novncCore.novncCoreStrings.none
import typingsJapgolly.novncCore.novncCoreStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("novnc-core/lib/util/logging", JSImport.Namespace)
@js.native
object loggingMod extends js.Object {
  @JSName("get_logging")
  def getLogging(): debug | info | warn | error | none = js.native
  @JSName("init_logging")
  def initLogging(): Unit = js.native
  @JSName("init_logging")
  def initLogging_debug(level: debug): Unit = js.native
  @JSName("init_logging")
  def initLogging_error(level: error): Unit = js.native
  @JSName("init_logging")
  def initLogging_info(level: info): Unit = js.native
  @JSName("init_logging")
  def initLogging_none(level: none): Unit = js.native
  @JSName("init_logging")
  def initLogging_warn(level: warn): Unit = js.native
}

