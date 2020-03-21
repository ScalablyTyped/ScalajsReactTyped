package typingsJapgolly.gulpTypescript.mod

import typingsJapgolly.gulpTypescript.reporterMod.Reporter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gulp-typescript", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): CompileStream = js.native
  def apply(proj: typingsJapgolly.gulpTypescript.projectMod.Project): CompileStream = js.native
  def apply(proj: typingsJapgolly.gulpTypescript.projectMod.Project, theReporter: Reporter): CompileStream = js.native
  def apply(settings: Settings): CompileStream = js.native
  def apply(settings: Settings, theReporter: Reporter): CompileStream = js.native
}

