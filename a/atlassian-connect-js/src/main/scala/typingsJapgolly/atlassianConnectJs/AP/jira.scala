package typingsJapgolly.atlassianConnectJs.AP

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import typingsJapgolly.atlassianConnectJs.anon.Left
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A JavaScript module which provides functions to interact with Jira.
  */
object jira {
  
  trait DatePickerOptions extends StObject {
    
    /**
      * Date (and time) that should be pre-selected when displaying the picker in the format understandable by Date.parse method in JavaScript.
      *
      * ISO 8601 is preferred. Timezone should be set to Z for UTC time or in the format of +/-hh:mm. Not setting it will cause JavaScript to use local timezone set in the browser.
      * Defaults to current date/time.
      */
    var date: String
    
    /**
      * HTML element below which date picker will be positioned. If provided, it takes precedence over `options.position`.
      */
    var element: HTMLElement
    
    /**
      * Callback that will be invoked when the date (and time) is selected by the user.
      */
    def onSelect(isoDate: String, date: js.Date): Unit
    
    /**
      * Position of the element relative to the iframe. options.element takes precedence over it when provided.
      */
    var position: Left
    
    /**
      * Flag determining whether the component should also have a time picker. Defaults to `false`.
      */
    var showTime: Boolean
  }
  object DatePickerOptions {
    
    inline def apply(
      date: String,
      element: HTMLElement,
      onSelect: (String, js.Date) => Callback,
      position: Left,
      showTime: Boolean
    ): DatePickerOptions = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], onSelect = js.Any.fromFunction2((t0: String, t1: js.Date) => (onSelect(t0, t1)).runNow()), position = position.asInstanceOf[js.Any], showTime = showTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatePickerOptions]
    }
    
    extension [Self <: DatePickerOptions](x: Self) {
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setOnSelect(value: (String, js.Date) => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction2((t0: String, t1: js.Date) => (value(t0, t1)).runNow()))
      
      inline def setPosition(value: Left): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setShowTime(value: Boolean): Self = StObject.set(x, "showTime", value.asInstanceOf[js.Any])
    }
  }
  
  trait WorkflowConfiguration extends StObject {
    
    /**
      * Attach a callback function to run when a workflow is saved
      * @param listener called on save.
      */
    def onSave(listener: js.Function1[/* listener */ js.Object, Unit]): Unit
    
    /**
      * Validate a workflow configuration before saving
      * @param listener called on validation. Return false to indicate that validation has not passed and the workflow cannot be saved.
      */
    def onSaveValidation(listener: js.Function1[/* listener */ js.Object, Unit]): Unit
    
    /**
      * Save a workflow configuration if valid.
      */
    def trigger(): WorkflowConfigurationTriggerResponse
  }
  object WorkflowConfiguration {
    
    inline def apply(
      onSave: js.Function1[/* listener */ js.Object, Unit] => Callback,
      onSaveValidation: js.Function1[/* listener */ js.Object, Unit] => Callback,
      trigger: CallbackTo[WorkflowConfigurationTriggerResponse]
    ): WorkflowConfiguration = {
      val __obj = js.Dynamic.literal(onSave = js.Any.fromFunction1((t0: js.Function1[/* listener */ js.Object, Unit]) => onSave(t0).runNow()), onSaveValidation = js.Any.fromFunction1((t0: js.Function1[/* listener */ js.Object, Unit]) => onSaveValidation(t0).runNow()), trigger = trigger.toJsFn)
      __obj.asInstanceOf[WorkflowConfiguration]
    }
    
    extension [Self <: WorkflowConfiguration](x: Self) {
      
      inline def setOnSave(value: js.Function1[/* listener */ js.Object, Unit] => Callback): Self = StObject.set(x, "onSave", js.Any.fromFunction1((t0: js.Function1[/* listener */ js.Object, Unit]) => value(t0).runNow()))
      
      inline def setOnSaveValidation(value: js.Function1[/* listener */ js.Object, Unit] => Callback): Self = StObject.set(x, "onSaveValidation", js.Any.fromFunction1((t0: js.Function1[/* listener */ js.Object, Unit]) => value(t0).runNow()))
      
      inline def setTrigger(value: CallbackTo[WorkflowConfigurationTriggerResponse]): Self = StObject.set(x, "trigger", value.toJsFn)
    }
  }
  
  trait WorkflowConfigurationTriggerResponse extends StObject {
    
    /**
      * The result of the validation listener [WorkflowConfiguration.onSaveValidation]{@link WorkflowConfiguration.onSaveValidation}.
      */
    var valid: Any
    
    /**
      * The result of the [WorkflowConfiguration.onSave]{@link WorkflowConfiguration.onSave}.
      */
    var value: Any
  }
  object WorkflowConfigurationTriggerResponse {
    
    inline def apply(valid: Any, value: Any): WorkflowConfigurationTriggerResponse = {
      val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkflowConfigurationTriggerResponse]
    }
    
    extension [Self <: WorkflowConfigurationTriggerResponse](x: Self) {
      
      inline def setValid(value: Any): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
