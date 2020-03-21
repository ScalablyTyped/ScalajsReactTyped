package typingsJapgolly.javascriptObfuscator.ianalyzerMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnalyzer[T] extends js.Object {
  /**
    * @param {Program} astTree
    * @returns {T[]}
    */
  def analyze(
    astTree: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ESTree.Program */ js.Any
  ): js.Array[T]
}

object IAnalyzer {
  @scala.inline
  def apply[T](
    analyze: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ESTree.Program */ js.Any => CallbackTo[js.Array[T]]
  ): IAnalyzer[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("analyze")(js.Any.fromFunction1((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ESTree.Program */ js.Any) => analyze(t0).runNow()))
    __obj.asInstanceOf[IAnalyzer[T]]
  }
}

