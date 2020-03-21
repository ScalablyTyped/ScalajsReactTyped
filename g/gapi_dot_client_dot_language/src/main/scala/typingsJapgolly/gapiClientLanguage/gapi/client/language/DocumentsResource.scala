package typingsJapgolly.gapiClientLanguage.gapi.client.language

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientLanguage.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentsResource extends js.Object {
  /**
    * Finds named entities (currently proper names and common nouns) in the text
    * along with entity types, salience, mentions for each entity, and
    * other properties.
    */
  def analyzeEntities(request: AnonAccesstoken): Request_[AnalyzeEntitiesResponse]
  /**
    * Finds entities, similar to AnalyzeEntities in the text and analyzes
    * sentiment associated with each entity and its mentions.
    */
  def analyzeEntitySentiment(request: AnonAccesstoken): Request_[AnalyzeEntitySentimentResponse]
  /** Analyzes the sentiment of the provided text. */
  def analyzeSentiment(request: AnonAccesstoken): Request_[AnalyzeSentimentResponse]
  /**
    * Analyzes the syntax of the text and provides sentence boundaries and
    * tokenization along with part of speech tags, dependency trees, and other
    * properties.
    */
  def analyzeSyntax(request: AnonAccesstoken): Request_[AnalyzeSyntaxResponse]
  /**
    * A convenience method that provides all the features that analyzeSentiment,
    * analyzeEntities, and analyzeSyntax provide in one call.
    */
  def annotateText(request: AnonAccesstoken): Request_[AnnotateTextResponse]
}

object DocumentsResource {
  @scala.inline
  def apply(
    analyzeEntities: AnonAccesstoken => CallbackTo[Request_[AnalyzeEntitiesResponse]],
    analyzeEntitySentiment: AnonAccesstoken => CallbackTo[Request_[AnalyzeEntitySentimentResponse]],
    analyzeSentiment: AnonAccesstoken => CallbackTo[Request_[AnalyzeSentimentResponse]],
    analyzeSyntax: AnonAccesstoken => CallbackTo[Request_[AnalyzeSyntaxResponse]],
    annotateText: AnonAccesstoken => CallbackTo[Request_[AnnotateTextResponse]]
  ): DocumentsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("analyzeEntities")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientLanguage.AnonAccesstoken) => analyzeEntities(t0).runNow()))
    __obj.updateDynamic("analyzeEntitySentiment")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientLanguage.AnonAccesstoken) => analyzeEntitySentiment(t0).runNow()))
    __obj.updateDynamic("analyzeSentiment")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientLanguage.AnonAccesstoken) => analyzeSentiment(t0).runNow()))
    __obj.updateDynamic("analyzeSyntax")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientLanguage.AnonAccesstoken) => analyzeSyntax(t0).runNow()))
    __obj.updateDynamic("annotateText")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientLanguage.AnonAccesstoken) => annotateText(t0).runNow()))
    __obj.asInstanceOf[DocumentsResource]
  }
}

