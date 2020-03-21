package typingsJapgolly.googleAppsScript.GoogleAppsScript.Properties

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows scripts to store simple data in key-value pairs scoped to one script, one user of a
  * script, or one document in which an add-on is used. Properties cannot be shared between scripts.
  * For more information about when to use each type of property, see the guide to the Properties service.
  *
  *     // Sets three properties of different types.
  *     var documentProperties = PropertiesService.getDocumentProperties();
  *     var scriptProperties = PropertiesService.getScriptProperties();
  *     var userProperties = PropertiesService.getUserProperties();
  *
  *     documentProperties.setProperty('DAYS_TO_FETCH', '5');
  *     scriptProperties.setProperty('SERVER_URL', 'http://www.example.com/MyWeatherService/');
  *     userProperties.setProperty('DISPLAY_UNITS', 'metric');
  */
trait PropertiesService extends js.Object {
  def getDocumentProperties(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Properties.Properties
  def getScriptProperties(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Properties.Properties
  def getUserProperties(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Properties.Properties
}

object PropertiesService {
  @scala.inline
  def apply(
    getDocumentProperties: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Properties.Properties],
    getScriptProperties: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Properties.Properties],
    getUserProperties: CallbackTo[typingsJapgolly.googleAppsScript.GoogleAppsScript.Properties.Properties]
  ): PropertiesService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDocumentProperties")(getDocumentProperties.toJsFn)
    __obj.updateDynamic("getScriptProperties")(getScriptProperties.toJsFn)
    __obj.updateDynamic("getUserProperties")(getUserProperties.toJsFn)
    __obj.asInstanceOf[PropertiesService]
  }
}

