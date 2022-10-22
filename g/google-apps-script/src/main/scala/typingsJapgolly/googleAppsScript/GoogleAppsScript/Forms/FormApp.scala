package typingsJapgolly.googleAppsScript.GoogleAppsScript.Forms

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Ui
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows a script to open an existing Form or create a new one.
  *
  *     // Open a form by ID.
  *     var existingForm = FormApp.openById('1234567890abcdefghijklmnopqrstuvwxyz');
  *
  *     // Create and open a form.
  *     var newForm = FormApp.create('Form Name');
  */
trait FormApp extends StObject {
  
  var Alignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Alignment */ Any
  
  var DestinationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DestinationType */ Any
  
  var FeedbackType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FeedbackType */ Any
  
  var ItemType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ItemType */ Any
  
  var PageNavigationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageNavigationType */ Any
  
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
  
  inline def apply(
    Alignment: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Alignment */ Any,
    DestinationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DestinationType */ Any,
    FeedbackType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FeedbackType */ Any,
    ItemType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ItemType */ Any,
    PageNavigationType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageNavigationType */ Any,
    create: String => Form,
    createCheckboxGridValidation: CallbackTo[CheckboxGridValidationBuilder],
    createCheckboxValidation: CallbackTo[CheckboxValidationBuilder],
    createFeedback: CallbackTo[QuizFeedbackBuilder],
    createGridValidation: CallbackTo[GridValidationBuilder],
    createParagraphTextValidation: CallbackTo[ParagraphTextValidationBuilder],
    createTextValidation: CallbackTo[TextValidationBuilder],
    getActiveForm: CallbackTo[Form],
    getUi: CallbackTo[Ui],
    openById: String => Form,
    openByUrl: String => Form
  ): FormApp = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], DestinationType = DestinationType.asInstanceOf[js.Any], FeedbackType = FeedbackType.asInstanceOf[js.Any], ItemType = ItemType.asInstanceOf[js.Any], PageNavigationType = PageNavigationType.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), createCheckboxGridValidation = createCheckboxGridValidation.toJsFn, createCheckboxValidation = createCheckboxValidation.toJsFn, createFeedback = createFeedback.toJsFn, createGridValidation = createGridValidation.toJsFn, createParagraphTextValidation = createParagraphTextValidation.toJsFn, createTextValidation = createTextValidation.toJsFn, getActiveForm = getActiveForm.toJsFn, getUi = getUi.toJsFn, openById = js.Any.fromFunction1(openById), openByUrl = js.Any.fromFunction1(openByUrl))
    __obj.asInstanceOf[FormApp]
  }
  
  extension [Self <: FormApp](x: Self) {
    
    inline def setAlignment(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Alignment */ Any): Self = StObject.set(x, "Alignment", value.asInstanceOf[js.Any])
    
    inline def setCreate(value: String => Form): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    inline def setCreateCheckboxGridValidation(value: CallbackTo[CheckboxGridValidationBuilder]): Self = StObject.set(x, "createCheckboxGridValidation", value.toJsFn)
    
    inline def setCreateCheckboxValidation(value: CallbackTo[CheckboxValidationBuilder]): Self = StObject.set(x, "createCheckboxValidation", value.toJsFn)
    
    inline def setCreateFeedback(value: CallbackTo[QuizFeedbackBuilder]): Self = StObject.set(x, "createFeedback", value.toJsFn)
    
    inline def setCreateGridValidation(value: CallbackTo[GridValidationBuilder]): Self = StObject.set(x, "createGridValidation", value.toJsFn)
    
    inline def setCreateParagraphTextValidation(value: CallbackTo[ParagraphTextValidationBuilder]): Self = StObject.set(x, "createParagraphTextValidation", value.toJsFn)
    
    inline def setCreateTextValidation(value: CallbackTo[TextValidationBuilder]): Self = StObject.set(x, "createTextValidation", value.toJsFn)
    
    inline def setDestinationType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DestinationType */ Any
    ): Self = StObject.set(x, "DestinationType", value.asInstanceOf[js.Any])
    
    inline def setFeedbackType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FeedbackType */ Any): Self = StObject.set(x, "FeedbackType", value.asInstanceOf[js.Any])
    
    inline def setGetActiveForm(value: CallbackTo[Form]): Self = StObject.set(x, "getActiveForm", value.toJsFn)
    
    inline def setGetUi(value: CallbackTo[Ui]): Self = StObject.set(x, "getUi", value.toJsFn)
    
    inline def setItemType(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ItemType */ Any): Self = StObject.set(x, "ItemType", value.asInstanceOf[js.Any])
    
    inline def setOpenById(value: String => Form): Self = StObject.set(x, "openById", js.Any.fromFunction1(value))
    
    inline def setOpenByUrl(value: String => Form): Self = StObject.set(x, "openByUrl", js.Any.fromFunction1(value))
    
    inline def setPageNavigationType(
      value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageNavigationType */ Any
    ): Self = StObject.set(x, "PageNavigationType", value.asInstanceOf[js.Any])
  }
}
