package typingsJapgolly.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Only allow data when
  */
trait QuestionnaireItemEnableWhen extends BackboneElement {
  /**
    * Contains extended information for property 'answerBoolean'.
    */
  var _answerBoolean: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'answerDate'.
    */
  var _answerDate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'answerDateTime'.
    */
  var _answerDateTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'answerDecimal'.
    */
  var _answerDecimal: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'answerInteger'.
    */
  var _answerInteger: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'answerString'.
    */
  var _answerString: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'answerTime'.
    */
  var _answerTime: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'answerUri'.
    */
  var _answerUri: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'hasAnswer'.
    */
  var _hasAnswer: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'question'.
    */
  var _question: js.UndefOr[Element] = js.undefined
  /**
    * Value question must have
    */
  var answerAttachment: js.UndefOr[Attachment] = js.undefined
  /**
    * Value question must have
    */
  var answerBoolean: js.UndefOr[Boolean] = js.undefined
  /**
    * Value question must have
    */
  var answerCoding: js.UndefOr[Coding] = js.undefined
  /**
    * Value question must have
    */
  var answerDate: js.UndefOr[date] = js.undefined
  /**
    * Value question must have
    */
  var answerDateTime: js.UndefOr[dateTime] = js.undefined
  /**
    * Value question must have
    */
  var answerDecimal: js.UndefOr[decimal] = js.undefined
  /**
    * Value question must have
    */
  var answerInteger: js.UndefOr[integer] = js.undefined
  /**
    * Value question must have
    */
  var answerQuantity: js.UndefOr[Quantity] = js.undefined
  /**
    * Value question must have
    */
  var answerReference: js.UndefOr[Reference] = js.undefined
  /**
    * Value question must have
    */
  var answerString: js.UndefOr[String] = js.undefined
  /**
    * Value question must have
    */
  var answerTime: js.UndefOr[time] = js.undefined
  /**
    * Value question must have
    */
  var answerUri: js.UndefOr[uri] = js.undefined
  /**
    * Enable when answered or not
    */
  var hasAnswer: js.UndefOr[Boolean] = js.undefined
  /**
    * Question that determines whether item is enabled
    */
  var question: String
}

object QuestionnaireItemEnableWhen {
  @scala.inline
  def apply(
    question: String,
    _answerBoolean: Element = null,
    _answerDate: Element = null,
    _answerDateTime: Element = null,
    _answerDecimal: Element = null,
    _answerInteger: Element = null,
    _answerString: Element = null,
    _answerTime: Element = null,
    _answerUri: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _hasAnswer: Element = null,
    _id: Element = null,
    _question: Element = null,
    answerAttachment: Attachment = null,
    answerBoolean: js.UndefOr[Boolean] = js.undefined,
    answerCoding: Coding = null,
    answerDate: date = null,
    answerDateTime: dateTime = null,
    answerDecimal: Int | Double = null,
    answerInteger: Int | Double = null,
    answerQuantity: Quantity = null,
    answerReference: Reference = null,
    answerString: String = null,
    answerTime: time = null,
    answerUri: uri = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    hasAnswer: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    modifierExtension: js.Array[Extension] = null
  ): QuestionnaireItemEnableWhen = {
    val __obj = js.Dynamic.literal(question = question.asInstanceOf[js.Any])
    if (_answerBoolean != null) __obj.updateDynamic("_answerBoolean")(_answerBoolean.asInstanceOf[js.Any])
    if (_answerDate != null) __obj.updateDynamic("_answerDate")(_answerDate.asInstanceOf[js.Any])
    if (_answerDateTime != null) __obj.updateDynamic("_answerDateTime")(_answerDateTime.asInstanceOf[js.Any])
    if (_answerDecimal != null) __obj.updateDynamic("_answerDecimal")(_answerDecimal.asInstanceOf[js.Any])
    if (_answerInteger != null) __obj.updateDynamic("_answerInteger")(_answerInteger.asInstanceOf[js.Any])
    if (_answerString != null) __obj.updateDynamic("_answerString")(_answerString.asInstanceOf[js.Any])
    if (_answerTime != null) __obj.updateDynamic("_answerTime")(_answerTime.asInstanceOf[js.Any])
    if (_answerUri != null) __obj.updateDynamic("_answerUri")(_answerUri.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_hasAnswer != null) __obj.updateDynamic("_hasAnswer")(_hasAnswer.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_question != null) __obj.updateDynamic("_question")(_question.asInstanceOf[js.Any])
    if (answerAttachment != null) __obj.updateDynamic("answerAttachment")(answerAttachment.asInstanceOf[js.Any])
    if (!js.isUndefined(answerBoolean)) __obj.updateDynamic("answerBoolean")(answerBoolean.asInstanceOf[js.Any])
    if (answerCoding != null) __obj.updateDynamic("answerCoding")(answerCoding.asInstanceOf[js.Any])
    if (answerDate != null) __obj.updateDynamic("answerDate")(answerDate.asInstanceOf[js.Any])
    if (answerDateTime != null) __obj.updateDynamic("answerDateTime")(answerDateTime.asInstanceOf[js.Any])
    if (answerDecimal != null) __obj.updateDynamic("answerDecimal")(answerDecimal.asInstanceOf[js.Any])
    if (answerInteger != null) __obj.updateDynamic("answerInteger")(answerInteger.asInstanceOf[js.Any])
    if (answerQuantity != null) __obj.updateDynamic("answerQuantity")(answerQuantity.asInstanceOf[js.Any])
    if (answerReference != null) __obj.updateDynamic("answerReference")(answerReference.asInstanceOf[js.Any])
    if (answerString != null) __obj.updateDynamic("answerString")(answerString.asInstanceOf[js.Any])
    if (answerTime != null) __obj.updateDynamic("answerTime")(answerTime.asInstanceOf[js.Any])
    if (answerUri != null) __obj.updateDynamic("answerUri")(answerUri.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (!js.isUndefined(hasAnswer)) __obj.updateDynamic("hasAnswer")(hasAnswer.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuestionnaireItemEnableWhen]
  }
}

