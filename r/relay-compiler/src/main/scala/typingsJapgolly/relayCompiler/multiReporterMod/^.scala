package typingsJapgolly.relayCompiler.multiReporterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-compiler/lib/reporters/MultiReporter", JSImport.Namespace)
@js.native
class ^ () extends MultiReporter {
  /* CompleteClass */
  override def reportError(caughtLocation: String, error: js.Error): Unit = js.native
  /* CompleteClass */
  override def reportMessage(message: String): Unit = js.native
  /* CompleteClass */
  override def reportTime(name: String, ms: Double): Unit = js.native
}

