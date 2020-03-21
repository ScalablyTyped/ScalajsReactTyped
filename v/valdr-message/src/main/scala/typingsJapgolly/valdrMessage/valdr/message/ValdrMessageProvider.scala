package typingsJapgolly.valdrMessage.valdr.message

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValdrMessageProvider extends js.Object {
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
  @scala.inline
  def apply(
    addMessages: StringDictionary[String] => Callback,
    getMessage: (String, String, String) => CallbackTo[String],
    setTemplate: String => Callback,
    setTemplateUrl: String => Callback
  ): ValdrMessageProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addMessages")(js.Any.fromFunction1((t0: org.scalablytyped.runtime.StringDictionary[java.lang.String]) => addMessages(t0).runNow()))
    __obj.updateDynamic("getMessage")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => getMessage(t0, t1, t2).runNow()))
    __obj.updateDynamic("setTemplate")(js.Any.fromFunction1((t0: java.lang.String) => setTemplate(t0).runNow()))
    __obj.updateDynamic("setTemplateUrl")(js.Any.fromFunction1((t0: java.lang.String) => setTemplateUrl(t0).runNow()))
    __obj.asInstanceOf[ValdrMessageProvider]
  }
}

