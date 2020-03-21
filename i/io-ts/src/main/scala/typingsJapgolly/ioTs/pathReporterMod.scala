package typingsJapgolly.ioTs

import typingsJapgolly.ioTs.mod.ValidationError
import typingsJapgolly.ioTs.reporterMod.Reporter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/lib/PathReporter", JSImport.Namespace)
@js.native
object pathReporterMod extends js.Object {
  val PathReporter: Reporter[js.Array[String]] = js.native
  def failure(es: js.Array[ValidationError]): js.Array[String] = js.native
  def success(): js.Array[String] = js.native
}

