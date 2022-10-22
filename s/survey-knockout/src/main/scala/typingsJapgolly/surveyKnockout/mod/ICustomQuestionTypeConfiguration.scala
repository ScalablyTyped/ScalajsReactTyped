package typingsJapgolly.surveyKnockout.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICustomQuestionTypeConfiguration extends StObject {
  
  /*
    * A function that allows you to create nested questions if you do not specify the `elementsJSON` property.
    */
  var createElements: js.UndefOr[Any] = js.undefined
  
  /*
    * A function that allows you to create a custom question if you do not specify the `questionJSON` property.
    */
  var createQuestion: js.UndefOr[Any] = js.undefined
  
  /*
    * JSON schemas of nested questions. Specify this property to create a [composite question type](https://surveyjs.io/Documentation/Survey-Creator?id=create-composite-question-types).
    */
  var elementsJSON: js.UndefOr[Any] = js.undefined
  
  /*
    * A function that allows you to override the default `getDisplayValue()` implementation.
    */
  var getDisplayValue: js.UndefOr[Any] = js.undefined
  
  /*
    * An icon for the custom question type.
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /*
    * A name used to identify a custom question type.
    */
  var name: String
  
  /*
    * A function that is called after the entire question is rendered.
    * 
    * Parameters:
    * 
    * - `question`: [Question](https://surveyjs.io/Documentation/Library?id=Question) - The custom question.
    * - `htmlElement`: any - An HTML element that represents the custom question.
    */
  def onAfterRender(question: Question, htmlElement: Any): Unit
  
  /*
    * A function that is called each time a question nested within a [composite question](https://surveyjs.io/Documentation/Survey-Creator?id=create-composite-question-types) is rendered.
    * 
    * Parameters:
    * 
    * - `question`: [Question](https://surveyjs.io/Documentation/Library?id=Question) - The composite question.
    * - `element`: [Question](https://surveyjs.io/Documentation/Library?id=Question) - A nested question.
    * - `htmlElement`: any - An HTML element that represents the nested question.
    */
  def onAfterRenderContentElement(question: Question, element: Question, htmlElement: Any): Unit
  
  /*
    * A function that is called when the custom question is created. Use it to access questions nested within a [composite question type](https://surveyjs.io/Documentation/Survey-Creator?id=create-composite-question-types).
    * 
    * Parameters:
    * 
    * - `question`: [Question](https://surveyjs.io/Documentation/Library?id=Question) - The custom question.
    */
  def onCreated(question: Question): Unit
  
  /*
    * A function that is called when the custom question type is initialized. Use it to add, remove, or modify the type's properties (see [Override Base Question Properties](https://surveyjs.io/Documentation/Survey-Creator?id=create-composite-question-types#override-base-question-properties)).
    */
  def onInit(): Unit
  
  /*
    * A function that is called when an [ItemValue](https://surveyjs.io/Documentation/Library?id=itemvalue) property is changed.
    * 
    * Parameters:
    * 
    * - `question`: [Question](https://surveyjs.io/Documentation/Library?id=Question) - The custom question.
    * - `options.obj`: [ItemValue](https://surveyjs.io/Documentation/Library?id=itemvalue) - An `ItemValue` object.
    * - `options.propertyName`: string - The name of the property to which an array of `ItemValue` objects is assigned (for example, `"choices"` or `"rows"`).
    * - `options.name`: string - The name of the changed property: `"text"` or `"value"`.
    * - `options.newValue`: any - A new value for the property.
    */
  def onItemValuePropertyChanged(question: Question, options: Any): Unit
  
  /*
    * A function that is called when JSON schemas are loaded.
    * 
    * Parameters:
    * 
    * - `question`: [Question](https://surveyjs.io/Documentation/Library?id=Question) - The custom question.
    */
  def onLoaded(question: Question): Unit
  
  /*
    * A function that is called when a custom question type property is changed. Use it to handle property changes.
    * 
    * Parameters:
    * 
    * - `question`: [Question](https://surveyjs.io/Documentation/Library?id=Question) - The custom question.
    * - `propertyName`: string - The name of the changed property.
    * - `newValue`: any - A new value for the property.
    */
  def onPropertyChanged(question: Question, propertyName: String, newValue: Any): Unit
  
  /*
    * A function that is called when the question value is changed.
    * 
    * Parameters:
    * 
    * - `question`: [Question](https://surveyjs.io/Documentation/Library?id=Question) - The custom question.
    * - `name`: string -  The question's [name](https://surveyjs.io/Documentation/Library?id=Question#name).
    * - `newValue`: any - A new value for the question.
    */
  def onValueChanged(question: Question, name: String, newValue: Any): Unit
  
  /*
    * A JSON schema for a built-in question type on which the custom question type is based.
    * 
    * Refer to the [Create Specialized Question Types](https://surveyjs.io/Documentation/Survey-Creator?id=create-specialized-question-types) help topic for more information.
    */
  var questionJSON: js.UndefOr[Any] = js.undefined
  
  /*
    * Specifies whether the custom question type is available in the Toolbox and the Add Question menu.
    * 
    * Default value: `true`
    * 
    * Set this property to `false` if your custom question type is used only to customize Property Grid content and is not meant for a survey.
    */
  var showInToolbox: js.UndefOr[Boolean] = js.undefined
  
  /*
    * A title used for this custom question type in the UI. When `title` is not specified, the `name` property value is used.
    */
  var title: js.UndefOr[String] = js.undefined
}
object ICustomQuestionTypeConfiguration {
  
  inline def apply(
    name: String,
    onAfterRender: (Question, Any) => Callback,
    onAfterRenderContentElement: (Question, Question, Any) => Callback,
    onCreated: Question => Callback,
    onInit: Callback,
    onItemValuePropertyChanged: (Question, Any) => Callback,
    onLoaded: Question => Callback,
    onPropertyChanged: (Question, String, Any) => Callback,
    onValueChanged: (Question, String, Any) => Callback
  ): ICustomQuestionTypeConfiguration = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onAfterRender = js.Any.fromFunction2((t0: Question, t1: Any) => (onAfterRender(t0, t1)).runNow()), onAfterRenderContentElement = js.Any.fromFunction3((t0: Question, t1: Question, t2: Any) => (onAfterRenderContentElement(t0, t1, t2)).runNow()), onCreated = js.Any.fromFunction1((t0: Question) => onCreated(t0).runNow()), onInit = onInit.toJsFn, onItemValuePropertyChanged = js.Any.fromFunction2((t0: Question, t1: Any) => (onItemValuePropertyChanged(t0, t1)).runNow()), onLoaded = js.Any.fromFunction1((t0: Question) => onLoaded(t0).runNow()), onPropertyChanged = js.Any.fromFunction3((t0: Question, t1: String, t2: Any) => (onPropertyChanged(t0, t1, t2)).runNow()), onValueChanged = js.Any.fromFunction3((t0: Question, t1: String, t2: Any) => (onValueChanged(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[ICustomQuestionTypeConfiguration]
  }
  
  extension [Self <: ICustomQuestionTypeConfiguration](x: Self) {
    
    inline def setCreateElements(value: Any): Self = StObject.set(x, "createElements", value.asInstanceOf[js.Any])
    
    inline def setCreateElementsUndefined: Self = StObject.set(x, "createElements", js.undefined)
    
    inline def setCreateQuestion(value: Any): Self = StObject.set(x, "createQuestion", value.asInstanceOf[js.Any])
    
    inline def setCreateQuestionUndefined: Self = StObject.set(x, "createQuestion", js.undefined)
    
    inline def setElementsJSON(value: Any): Self = StObject.set(x, "elementsJSON", value.asInstanceOf[js.Any])
    
    inline def setElementsJSONUndefined: Self = StObject.set(x, "elementsJSON", js.undefined)
    
    inline def setGetDisplayValue(value: Any): Self = StObject.set(x, "getDisplayValue", value.asInstanceOf[js.Any])
    
    inline def setGetDisplayValueUndefined: Self = StObject.set(x, "getDisplayValue", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnAfterRender(value: (Question, Any) => Callback): Self = StObject.set(x, "onAfterRender", js.Any.fromFunction2((t0: Question, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setOnAfterRenderContentElement(value: (Question, Question, Any) => Callback): Self = StObject.set(x, "onAfterRenderContentElement", js.Any.fromFunction3((t0: Question, t1: Question, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnCreated(value: Question => Callback): Self = StObject.set(x, "onCreated", js.Any.fromFunction1((t0: Question) => value(t0).runNow()))
    
    inline def setOnInit(value: Callback): Self = StObject.set(x, "onInit", value.toJsFn)
    
    inline def setOnItemValuePropertyChanged(value: (Question, Any) => Callback): Self = StObject.set(x, "onItemValuePropertyChanged", js.Any.fromFunction2((t0: Question, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setOnLoaded(value: Question => Callback): Self = StObject.set(x, "onLoaded", js.Any.fromFunction1((t0: Question) => value(t0).runNow()))
    
    inline def setOnPropertyChanged(value: (Question, String, Any) => Callback): Self = StObject.set(x, "onPropertyChanged", js.Any.fromFunction3((t0: Question, t1: String, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setOnValueChanged(value: (Question, String, Any) => Callback): Self = StObject.set(x, "onValueChanged", js.Any.fromFunction3((t0: Question, t1: String, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setQuestionJSON(value: Any): Self = StObject.set(x, "questionJSON", value.asInstanceOf[js.Any])
    
    inline def setQuestionJSONUndefined: Self = StObject.set(x, "questionJSON", js.undefined)
    
    inline def setShowInToolbox(value: Boolean): Self = StObject.set(x, "showInToolbox", value.asInstanceOf[js.Any])
    
    inline def setShowInToolboxUndefined: Self = StObject.set(x, "showInToolbox", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
