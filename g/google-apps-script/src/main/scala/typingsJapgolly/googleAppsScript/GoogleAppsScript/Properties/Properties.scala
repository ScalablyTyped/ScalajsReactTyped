package typingsJapgolly.googleAppsScript.GoogleAppsScript.Properties

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The properties object acts as the interface to access user, document, or script properties. The
  * specific property type depends on which of the three methods of PropertiesService the
  * script called: PropertiesService.getDocumentProperties(), PropertiesService.getUserProperties(), or PropertiesService.getScriptProperties().
  * Properties cannot be shared between scripts. For more information about property types, see the
  * guide to the Properties service.
  */
@js.native
trait Properties extends js.Object {
  def deleteAllProperties(): typingsJapgolly.googleAppsScript.GoogleAppsScript.Properties.Properties = js.native
  def deleteProperty(key: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Properties.Properties = js.native
  def getKeys(): js.Array[String] = js.native
  def getProperties(): StringDictionary[String] = js.native
  def getProperty(key: String): String | Null = js.native
  def setProperties(properties: StringDictionary[String]): typingsJapgolly.googleAppsScript.GoogleAppsScript.Properties.Properties = js.native
  def setProperties(properties: StringDictionary[String], deleteAllOthers: Boolean): typingsJapgolly.googleAppsScript.GoogleAppsScript.Properties.Properties = js.native
  def setProperty(key: String, value: String): typingsJapgolly.googleAppsScript.GoogleAppsScript.Properties.Properties = js.native
}

