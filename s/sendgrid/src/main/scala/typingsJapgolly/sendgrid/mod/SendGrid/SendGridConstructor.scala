package typingsJapgolly.sendgrid.mod.SendGrid

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.sendgrid.mod.SendGrid.Helpers.Mail.Helper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendGridConstructor extends StObject {
  
  def apply(apiKey: String): typingsJapgolly.sendgrid.mod.SendGrid.SendGrid = js.native
  def apply(apiKey: String, host: String): typingsJapgolly.sendgrid.mod.SendGrid.SendGrid = js.native
  def apply(apiKey: String, host: String, globalHeaders: StringDictionary[String]): typingsJapgolly.sendgrid.mod.SendGrid.SendGrid = js.native
  def apply(apiKey: String, host: Unit, globalHeaders: StringDictionary[String]): typingsJapgolly.sendgrid.mod.SendGrid.SendGrid = js.native
  
  var mail: Helper = js.native
}
