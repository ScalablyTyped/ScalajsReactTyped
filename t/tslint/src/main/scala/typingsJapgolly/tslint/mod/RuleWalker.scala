package typingsJapgolly.tslint.mod

import typingsJapgolly.tslint.ruleMod.IOptions
import typingsJapgolly.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "RuleWalker")
@js.native
class RuleWalker protected ()
  extends typingsJapgolly.tslint.walkerMod.RuleWalker {
  def this(sourceFile: SourceFile, options: IOptions) = this()
}

