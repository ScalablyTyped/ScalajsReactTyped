package typingsJapgolly.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message
  extends StObject
     with AdWordsEntity
     with hasMobilePreferred
     with hasStartAndEndDate
     with hasSchedules
     with hasStats
     with isAdGroupChild {
  
  def getBusinessName(): String = js.native
  
  def getCountryCode(): String = js.native
  
  def getExtensionText(): String = js.native
  
  def getId(): Double = js.native
  
  def getMessageText(): String = js.native
  
  def getPhoneNumber(): String = js.native
  
  def setBusinessName(businessName: String): Unit = js.native
  
  def setCountryCode(countryCode: String): Unit = js.native
  
  def setExtensionText(extensionText: String): Unit = js.native
  
  def setMessageText(messageText: String): Unit = js.native
  
  def setPhoneNumber(phoneNumber: String): Unit = js.native
}
