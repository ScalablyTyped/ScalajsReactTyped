package typingsJapgolly.tslint.walkerWalkerMod

import typingsJapgolly.tslint.ruleMod.RuleFailure
import typingsJapgolly.tslint.walkContextMod.WalkContext
import typingsJapgolly.typescript.mod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/language/walker/walker", "AbstractWalker")
@js.native
abstract class AbstractWalker[T] ()
  extends WalkContext[T]
     with IWalker {
  /* CompleteClass */
  override def getFailures(): js.Array[RuleFailure] = js.native
  /* CompleteClass */
  override def getSourceFile(): SourceFile = js.native
  /* CompleteClass */
  override def walk(sourceFile: SourceFile): Unit = js.native
}

