package typingsJapgolly.protractor

import typingsJapgolly.protractor.runnerMod.Runner
import typingsJapgolly.protractor.taskRunnerMod.RunResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/frameworks/debugprint", JSImport.Namespace)
@js.native
object debugprintMod extends js.Object {
  def run(runner: Runner, specs: js.Array[String]): js.Promise[RunResults] = js.native
}

