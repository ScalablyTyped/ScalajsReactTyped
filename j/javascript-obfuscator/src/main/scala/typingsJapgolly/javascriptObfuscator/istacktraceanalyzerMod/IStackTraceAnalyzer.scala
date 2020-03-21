package typingsJapgolly.javascriptObfuscator.istacktraceanalyzerMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.javascriptObfuscator.ianalyzerMod.IAnalyzer
import typingsJapgolly.javascriptObfuscator.istacktracedataMod.IStackTraceData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStackTraceAnalyzer extends IAnalyzer[IStackTraceData]

object IStackTraceAnalyzer {
  @scala.inline
  def apply(
    analyze: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ESTree.Program */ js.Any => CallbackTo[js.Array[IStackTraceData]]
  ): IStackTraceAnalyzer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("analyze")(js.Any.fromFunction1((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ESTree.Program */ js.Any) => analyze(t0).runNow()))
    __obj.asInstanceOf[IStackTraceAnalyzer]
  }
}

