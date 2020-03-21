package typingsJapgolly.tslint.mod

import typingsJapgolly.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "WalkContext")
@js.native
class WalkContext[T] protected ()
  extends typingsJapgolly.tslint.walkerMod.WalkContext[T] {
  def this(sourceFile: SourceFile, ruleName: String, options: T) = this()
}

