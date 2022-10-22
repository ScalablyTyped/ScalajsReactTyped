package typingsJapgolly.valdrMessage

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object valdr {
  
  object message {
    
    trait ValdrMessage extends StObject {
      
      /**
        * Adds messages for AngularJS build-in validators (eg "required" and "number") or for specific fields (eg "Person.lastName.required").
        * @param messages the list of key/value pairs.
        */
      def addMessages(messages: StringDictionary[String]): Unit
      
      /**
        * A boolean that allows to show messages for the AngularJS built-in validators like 'required' or 'number'.
        */
      var angularMessagesEnabled: Boolean
      
      /**
        * Gets the validator message.
        * @param typeName the name of the type.
        * @param fieldName the name of the field.
        * @param validatorName the name of the validator.
        * @returns {string} the message.
        */
      def getMessage(typeName: String, fieldName: String, validatorName: String): String
      
      /**
        * Sets the default message template.
        * @param template the default message template (eg "<div class="valdr-message">{{ violation.message }}</div>").
        */
      def setTemplate(template: String): Unit
      
      /*
        * Default message template URL.
        */
      var templateUrl: String
      
      /**
        * A boolean that shows if Angular-translate is available.
        */
      var translateAvailable: Boolean
    }
    object ValdrMessage {
      
      inline def apply(
        addMessages: StringDictionary[String] => Callback,
        angularMessagesEnabled: Boolean,
        getMessage: (String, String, String) => String,
        setTemplate: String => Callback,
        templateUrl: String,
        translateAvailable: Boolean
      ): ValdrMessage = {
        val __obj = js.Dynamic.literal(addMessages = js.Any.fromFunction1((t0: StringDictionary[String]) => addMessages(t0).runNow()), angularMessagesEnabled = angularMessagesEnabled.asInstanceOf[js.Any], getMessage = js.Any.fromFunction3(getMessage), setTemplate = js.Any.fromFunction1((t0: String) => setTemplate(t0).runNow()), templateUrl = templateUrl.asInstanceOf[js.Any], translateAvailable = translateAvailable.asInstanceOf[js.Any])
        __obj.asInstanceOf[ValdrMessage]
      }
      
      extension [Self <: ValdrMessage](x: Self) {
        
        inline def setAddMessages(value: StringDictionary[String] => Callback): Self = StObject.set(x, "addMessages", js.Any.fromFunction1((t0: StringDictionary[String]) => value(t0).runNow()))
        
        inline def setAngularMessagesEnabled(value: Boolean): Self = StObject.set(x, "angularMessagesEnabled", value.asInstanceOf[js.Any])
        
        inline def setGetMessage(value: (String, String, String) => String): Self = StObject.set(x, "getMessage", js.Any.fromFunction3(value))
        
        inline def setSetTemplate(value: String => Callback): Self = StObject.set(x, "setTemplate", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
        
        inline def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
        
        inline def setTranslateAvailable(value: Boolean): Self = StObject.set(x, "translateAvailable", value.asInstanceOf[js.Any])
      }
    }
    
    trait ValdrMessageProvider extends StObject {
      
      /**
        * Adds messages for AngularJS build-in validators (eg "required" and "number") or for specific fields (eg "Person.lastName.required").
        * @param messages the list of key/value pairs.
        */
      def addMessages(messages: StringDictionary[String]): Unit
      
      /**
        * Gets the validator message.
        * @param typeName the name of the type.
        * @param fieldName the name of the field.
        * @param validatorName the name of the validator.
        * @returns {string} the message.
        */
      def getMessage(typeName: String, fieldName: String, validatorName: String): String
      
      /**
        * Sets the default message template.
        * @param template the default message template (eg "<div class="valdr-message">{{ violation.message }}</div>").
        */
      def setTemplate(template: String): Unit
      
      /**
        * Sets the URL for the default message template (eg "/partials/valdrMessageTemplate.html").
        * @param url the URL of the default message template.
        */
      def setTemplateUrl(url: String): Unit
    }
    object ValdrMessageProvider {
      
      inline def apply(
        addMessages: StringDictionary[String] => Callback,
        getMessage: (String, String, String) => String,
        setTemplate: String => Callback,
        setTemplateUrl: String => Callback
      ): ValdrMessageProvider = {
        val __obj = js.Dynamic.literal(addMessages = js.Any.fromFunction1((t0: StringDictionary[String]) => addMessages(t0).runNow()), getMessage = js.Any.fromFunction3(getMessage), setTemplate = js.Any.fromFunction1((t0: String) => setTemplate(t0).runNow()), setTemplateUrl = js.Any.fromFunction1((t0: String) => setTemplateUrl(t0).runNow()))
        __obj.asInstanceOf[ValdrMessageProvider]
      }
      
      extension [Self <: ValdrMessageProvider](x: Self) {
        
        inline def setAddMessages(value: StringDictionary[String] => Callback): Self = StObject.set(x, "addMessages", js.Any.fromFunction1((t0: StringDictionary[String]) => value(t0).runNow()))
        
        inline def setGetMessage(value: (String, String, String) => String): Self = StObject.set(x, "getMessage", js.Any.fromFunction3(value))
        
        inline def setSetTemplate(value: String => Callback): Self = StObject.set(x, "setTemplate", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
        
        inline def setSetTemplateUrl(value: String => Callback): Self = StObject.set(x, "setTemplateUrl", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      }
    }
  }
}
