package typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Ui
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows a script to open an existing Form or create a new one.
  *
  *     // Open a form by ID.
  *     var existingForm = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *
  *     // Create and open a form.
  *     var newForm = FormApp.create('Form Name');
  */
trait FormApp extends js.Object {
  var Alignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Alignment */ js.Any
  var DestinationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DestinationType */ js.Any
  var FeedbackType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FeedbackType */ js.Any
  var ItemType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ItemType */ js.Any
  var PageNavigationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageNavigationType */ js.Any
  def create(title: String): Form
  def createCheckboxGridValidation(): CheckboxGridValidationBuilder
  def createCheckboxValidation(): CheckboxValidationBuilder
  def createFeedback(): QuizFeedbackBuilder
  def createGridValidation(): GridValidationBuilder
  def createParagraphTextValidation(): ParagraphTextValidationBuilder
  def createTextValidation(): TextValidationBuilder
  def getActiveForm(): Form
  def getUi(): Ui
  def openById(id: String): Form
  def openByUrl(url: String): Form
}

object FormApp {
  @scala.inline
  def apply(
    Alignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Alignment */ js.Any,
    DestinationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DestinationType */ js.Any,
    FeedbackType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FeedbackType */ js.Any,
    ItemType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ItemType */ js.Any,
    PageNavigationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageNavigationType */ js.Any,
    create: String => CallbackTo[Form],
    createCheckboxGridValidation: CallbackTo[CheckboxGridValidationBuilder],
    createCheckboxValidation: CallbackTo[CheckboxValidationBuilder],
    createFeedback: CallbackTo[QuizFeedbackBuilder],
    createGridValidation: CallbackTo[GridValidationBuilder],
    createParagraphTextValidation: CallbackTo[ParagraphTextValidationBuilder],
    createTextValidation: CallbackTo[TextValidationBuilder],
    getActiveForm: CallbackTo[Form],
    getUi: CallbackTo[Ui],
    openById: String => CallbackTo[Form],
    openByUrl: String => CallbackTo[Form]
  ): FormApp = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], DestinationType = DestinationType.asInstanceOf[js.Any], FeedbackType = FeedbackType.asInstanceOf[js.Any], ItemType = ItemType.asInstanceOf[js.Any], PageNavigationType = PageNavigationType.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: java.lang.String) => create(t0).runNow()))
    __obj.updateDynamic("createCheckboxGridValidation")(createCheckboxGridValidation.toJsFn)
    __obj.updateDynamic("createCheckboxValidation")(createCheckboxValidation.toJsFn)
    __obj.updateDynamic("createFeedback")(createFeedback.toJsFn)
    __obj.updateDynamic("createGridValidation")(createGridValidation.toJsFn)
    __obj.updateDynamic("createParagraphTextValidation")(createParagraphTextValidation.toJsFn)
    __obj.updateDynamic("createTextValidation")(createTextValidation.toJsFn)
    __obj.updateDynamic("getActiveForm")(getActiveForm.toJsFn)
    __obj.updateDynamic("getUi")(getUi.toJsFn)
    __obj.updateDynamic("openById")(js.Any.fromFunction1((t0: java.lang.String) => openById(t0).runNow()))
    __obj.updateDynamic("openByUrl")(js.Any.fromFunction1((t0: java.lang.String) => openByUrl(t0).runNow()))
    __obj.asInstanceOf[FormApp]
  }
}

