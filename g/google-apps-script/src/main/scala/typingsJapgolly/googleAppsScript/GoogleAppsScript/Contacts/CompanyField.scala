package typingsJapgolly.googleAppsScript.GoogleAppsScript.Contacts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Company field in a Contact.
  */
trait CompanyField extends StObject {
  
  def deleteCompanyField(): Unit
  
  def getCompanyName(): String
  
  def getJobTitle(): String
  
  def isPrimary(): Boolean
  
  def setAsPrimary(): CompanyField
  
  def setCompanyName(company: String): CompanyField
  
  def setJobTitle(title: String): CompanyField
}
object CompanyField {
  
  inline def apply(
    deleteCompanyField: Callback,
    getCompanyName: CallbackTo[String],
    getJobTitle: CallbackTo[String],
    isPrimary: CallbackTo[Boolean],
    setAsPrimary: CallbackTo[CompanyField],
    setCompanyName: String => CompanyField,
    setJobTitle: String => CompanyField
  ): CompanyField = {
    val __obj = js.Dynamic.literal(deleteCompanyField = deleteCompanyField.toJsFn, getCompanyName = getCompanyName.toJsFn, getJobTitle = getJobTitle.toJsFn, isPrimary = isPrimary.toJsFn, setAsPrimary = setAsPrimary.toJsFn, setCompanyName = js.Any.fromFunction1(setCompanyName), setJobTitle = js.Any.fromFunction1(setJobTitle))
    __obj.asInstanceOf[CompanyField]
  }
  
  extension [Self <: CompanyField](x: Self) {
    
    inline def setDeleteCompanyField(value: Callback): Self = StObject.set(x, "deleteCompanyField", value.toJsFn)
    
    inline def setGetCompanyName(value: CallbackTo[String]): Self = StObject.set(x, "getCompanyName", value.toJsFn)
    
    inline def setGetJobTitle(value: CallbackTo[String]): Self = StObject.set(x, "getJobTitle", value.toJsFn)
    
    inline def setIsPrimary(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPrimary", value.toJsFn)
    
    inline def setSetAsPrimary(value: CallbackTo[CompanyField]): Self = StObject.set(x, "setAsPrimary", value.toJsFn)
    
    inline def setSetCompanyName(value: String => CompanyField): Self = StObject.set(x, "setCompanyName", js.Any.fromFunction1(value))
    
    inline def setSetJobTitle(value: String => CompanyField): Self = StObject.set(x, "setJobTitle", js.Any.fromFunction1(value))
  }
}
