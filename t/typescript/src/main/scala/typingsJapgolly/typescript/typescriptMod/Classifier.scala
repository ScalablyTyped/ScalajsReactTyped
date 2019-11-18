package typingsJapgolly.typescript.typescriptMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Classifier extends js.Object {
  /**
    * Gives lexical classifications of tokens on a line without any syntactic context.
    * For instance, a token consisting of the text 'string' can be either an identifier
    * named 'string' or the keyword 'string', however, because this classifier is not aware,
    * it relies on certain heuristics to give acceptable results. For classifications where
    * speed trumps accuracy, this function is preferable; however, for true accuracy, the
    * syntactic classifier is ideal. In fact, in certain editing scenarios, combining the
    * lexical, syntactic, and semantic classifiers may issue the best user experience.
    *
    * @param text                      The text of a line to classify.
    * @param lexState                  The state of the lexical classifier at the end of the previous line.
    * @param syntacticClassifierAbsent Whether the client is *not* using a syntactic classifier.
    *                                  If there is no syntactic classifier (syntacticClassifierAbsent=true),
    *                                  certain heuristics may be used in its place; however, if there is a
    *                                  syntactic classifier (syntacticClassifierAbsent=false), certain
    *                                  classifications which may be incorrectly categorized will be given
    *                                  back as Identifiers in order to allow the syntactic classifier to
    *                                  subsume the classification.
    * @deprecated Use getLexicalClassifications instead.
    */
  def getClassificationsForLine(text: String, lexState: EndOfLineState, syntacticClassifierAbsent: Boolean): ClassificationResult
  def getEncodedLexicalClassifications(text: String, endOfLineState: EndOfLineState, syntacticClassifierAbsent: Boolean): Classifications
}

object Classifier {
  @scala.inline
  def apply(
    getClassificationsForLine: (String, EndOfLineState, Boolean) => CallbackTo[ClassificationResult],
    getEncodedLexicalClassifications: (String, EndOfLineState, Boolean) => CallbackTo[Classifications]
  ): Classifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getClassificationsForLine")(js.Any.fromFunction3((t0: java.lang.String, t1: typingsJapgolly.typescript.typescriptMod.EndOfLineState, t2: scala.Boolean) => getClassificationsForLine(t0, t1, t2).runNow()))
    __obj.updateDynamic("getEncodedLexicalClassifications")(js.Any.fromFunction3((t0: java.lang.String, t1: typingsJapgolly.typescript.typescriptMod.EndOfLineState, t2: scala.Boolean) => getEncodedLexicalClassifications(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Classifier]
  }
}

