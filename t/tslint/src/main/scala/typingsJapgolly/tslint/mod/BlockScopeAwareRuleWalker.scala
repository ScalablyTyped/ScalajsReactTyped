package typingsJapgolly.tslint.mod

import typingsJapgolly.tslint.ruleMod.IOptions
import typingsJapgolly.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "BlockScopeAwareRuleWalker")
@js.native
abstract class BlockScopeAwareRuleWalker[T, U] protected ()
  extends typingsJapgolly.tslint.walkerMod.BlockScopeAwareRuleWalker[T, U] {
  def this(sourceFile: SourceFile, options: IOptions) = this()
}

