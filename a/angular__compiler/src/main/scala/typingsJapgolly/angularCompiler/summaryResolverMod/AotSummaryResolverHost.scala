package typingsJapgolly.angularCompiler.summaryResolverMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AotSummaryResolverHost extends js.Object {
  /**
    * Converts a fileName that was processed by `toSummaryFileName` back into a real fileName
    * given the fileName of the library that is referrig to it.
    */
  def fromSummaryFileName(fileName: String, referringLibFileName: String): String
  /**
    * Returns whether a file is a source file or not.
    */
  def isSourceFile(sourceFilePath: String): Boolean
  /**
    * Loads an NgModule/Directive/Pipe summary file
    */
  def loadSummary(filePath: String): String | Null
  /**
    * Converts a file name into a representation that should be stored in a summary file.
    * This has to include changing the suffix as well.
    * E.g.
    * `some_file.ts` -> `some_file.d.ts`
    *
    * @param referringSrcFileName the soure file that refers to fileName
    */
  def toSummaryFileName(fileName: String, referringSrcFileName: String): String
}

object AotSummaryResolverHost {
  @scala.inline
  def apply(
    fromSummaryFileName: (String, String) => CallbackTo[String],
    isSourceFile: String => CallbackTo[Boolean],
    loadSummary: String => CallbackTo[String | Null],
    toSummaryFileName: (String, String) => CallbackTo[String]
  ): AotSummaryResolverHost = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromSummaryFileName")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => fromSummaryFileName(t0, t1).runNow()))
    __obj.updateDynamic("isSourceFile")(js.Any.fromFunction1((t0: java.lang.String) => isSourceFile(t0).runNow()))
    __obj.updateDynamic("loadSummary")(js.Any.fromFunction1((t0: java.lang.String) => loadSummary(t0).runNow()))
    __obj.updateDynamic("toSummaryFileName")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => toSummaryFileName(t0, t1).runNow()))
    __obj.asInstanceOf[AotSummaryResolverHost]
  }
}

