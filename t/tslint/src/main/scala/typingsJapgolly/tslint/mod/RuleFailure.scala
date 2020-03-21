package typingsJapgolly.tslint.mod

import typingsJapgolly.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "RuleFailure")
@js.native
class RuleFailure protected ()
  extends typingsJapgolly.tslint.ruleMod.RuleFailure {
  def this(sourceFile: SourceFile, start: Double, end: Double, failure: String, ruleName: String) = this()
  def this(
    sourceFile: SourceFile,
    start: Double,
    end: Double,
    failure: String,
    ruleName: String,
    fix: js.Array[typingsJapgolly.tslint.ruleMod.Replacement]
  ) = this()
  def this(
    sourceFile: SourceFile,
    start: Double,
    end: Double,
    failure: String,
    ruleName: String,
    fix: typingsJapgolly.tslint.ruleMod.Replacement
  ) = this()
}

/* static members */
@JSImport("tslint", "RuleFailure")
@js.native
object RuleFailure extends js.Object {
  def compare(a: typingsJapgolly.tslint.ruleMod.RuleFailure, b: typingsJapgolly.tslint.ruleMod.RuleFailure): Double = js.native
}

