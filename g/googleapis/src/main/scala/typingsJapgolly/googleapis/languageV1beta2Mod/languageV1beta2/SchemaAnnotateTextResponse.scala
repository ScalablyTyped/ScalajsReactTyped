package typingsJapgolly.googleapis.languageV1beta2Mod.languageV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The text annotations response message.
  */
@js.native
trait SchemaAnnotateTextResponse extends js.Object {
  /**
    * Categories identified in the input document.
    */
  var categories: js.UndefOr[js.Array[SchemaClassificationCategory]] = js.native
  /**
    * The overall sentiment for the document. Populated if the user enables
    * AnnotateTextRequest.Features.extract_document_sentiment.
    */
  var documentSentiment: js.UndefOr[SchemaSentiment] = js.native
  /**
    * Entities, along with their semantic information, in the input document.
    * Populated if the user enables
    * AnnotateTextRequest.Features.extract_entities.
    */
  var entities: js.UndefOr[js.Array[SchemaEntity]] = js.native
  /**
    * The language of the text, which will be the same as the language
    * specified in the request or, if not specified, the automatically-detected
    * language. See Document.language field for more details.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * Sentences in the input document. Populated if the user enables
    * AnnotateTextRequest.Features.extract_syntax.
    */
  var sentences: js.UndefOr[js.Array[SchemaSentence]] = js.native
  /**
    * Tokens, along with their syntactic information, in the input document.
    * Populated if the user enables
    * AnnotateTextRequest.Features.extract_syntax.
    */
  var tokens: js.UndefOr[js.Array[SchemaToken]] = js.native
}

object SchemaAnnotateTextResponse {
  @scala.inline
  def apply(
    categories: js.Array[SchemaClassificationCategory] = null,
    documentSentiment: SchemaSentiment = null,
    entities: js.Array[SchemaEntity] = null,
    language: String = null,
    sentences: js.Array[SchemaSentence] = null,
    tokens: js.Array[SchemaToken] = null
  ): SchemaAnnotateTextResponse = {
    val __obj = js.Dynamic.literal()
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (documentSentiment != null) __obj.updateDynamic("documentSentiment")(documentSentiment.asInstanceOf[js.Any])
    if (entities != null) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (sentences != null) __obj.updateDynamic("sentences")(sentences.asInstanceOf[js.Any])
    if (tokens != null) __obj.updateDynamic("tokens")(tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAnnotateTextResponse]
  }
}

