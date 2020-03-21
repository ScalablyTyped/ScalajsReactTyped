package typingsJapgolly.wtfnode

import typingsJapgolly.wtfnode.wtfnodeStrings.error
import typingsJapgolly.wtfnode.wtfnodeStrings.info
import typingsJapgolly.wtfnode.wtfnodeStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wtfnode", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def dump(): Unit = js.native
  def init(): Unit = js.native
  def resetLoggers(): Unit = js.native
  @JSName("setLogger")
  def setLogger_error(`type`: error, fn: js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]): Unit = js.native
  @JSName("setLogger")
  def setLogger_info(`type`: info, fn: js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]): Unit = js.native
  @JSName("setLogger")
  def setLogger_warn(`type`: warn, fn: js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]): Unit = js.native
}

