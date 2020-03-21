package typingsJapgolly.jestJasmine2.jsApiReporterMod

import typingsJapgolly.jestJasmine2.AnonTimer
import typingsJapgolly.jestJasmine2.specMod.SpecResult
import typingsJapgolly.jestJasmine2.suiteMod.SuiteResult
import typingsJapgolly.jestJasmine2.typesMod.RunDetails
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-jasmine2/build/jasmine/JsApiReporter", JSImport.Default)
@js.native
class default protected () extends JsApiReporter {
  def this(options: AnonTimer) = this()
  /* CompleteClass */
  override var finished: Boolean = js.native
  /* CompleteClass */
  override var runDetails: RunDetails = js.native
  /* CompleteClass */
  override var started: Boolean = js.native
  /* CompleteClass */
  override def executionTime(): js.Any = js.native
  /* CompleteClass */
  override def jasmineDone(runDetails: RunDetails): Unit = js.native
  /* CompleteClass */
  override def jasmineStarted(runDetails: RunDetails): Unit = js.native
  /* CompleteClass */
  override def specDone(result: SpecResult): Unit = js.native
  /* CompleteClass */
  override def specResults(index: Double, length: Double): js.Array[SpecResult] = js.native
  /* CompleteClass */
  override def specStarted(spec: SpecResult): Unit = js.native
  /* CompleteClass */
  override def specs(): js.Array[SpecResult] = js.native
  /* CompleteClass */
  override def status(): js.Any = js.native
  /* CompleteClass */
  override def suiteDone(result: SuiteResult): Unit = js.native
  /* CompleteClass */
  override def suiteResults(index: Double, length: Double): js.Array[SuiteResult] = js.native
  /* CompleteClass */
  override def suiteStarted(result: SuiteResult): Unit = js.native
  /* CompleteClass */
  override def suites(): Record[String, SuiteResult] = js.native
}

