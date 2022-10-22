package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.crypto

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.wrapper.XXMLElementWrapper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of the XML security template
  *
  * This interface represents a security template, which is the super interface of the {@link XXMLSignatureTemplate} interface and the {@link
  * XXMLEncryptionTemplate} interface.
  */
trait XXMLSecurityTemplate
  extends StObject
     with XInterface {
  
  /** Get the template status */
  var Status: SecurityOperationStatus
  
  /** Get the XML signature element that represents the signature template */
  var Template: XXMLElementWrapper
  
  /** Get the template status */
  def getStatus(): SecurityOperationStatus
  
  /** Get the XML signature element that represents the signature template */
  def getTemplate(): XXMLElementWrapper
  
  /** Set the template status */
  def setStatus(status: SecurityOperationStatus): Unit
  
  /** Load the target XML element, i.e. the element to be signed */
  def setTarget(aXmlElement: XXMLElementWrapper): Unit
  
  /** Load a XML signature template from XML signature element */
  def setTemplate(aXmlElement: XXMLElementWrapper): Unit
}
object XXMLSecurityTemplate {
  
  inline def apply(
    Status: SecurityOperationStatus,
    Template: XXMLElementWrapper,
    acquire: Callback,
    getStatus: CallbackTo[SecurityOperationStatus],
    getTemplate: CallbackTo[XXMLElementWrapper],
    queryInterface: `type` => Any,
    release: Callback,
    setStatus: SecurityOperationStatus => Callback,
    setTarget: XXMLElementWrapper => Callback,
    setTemplate: XXMLElementWrapper => Callback
  ): XXMLSecurityTemplate = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any], Template = Template.asInstanceOf[js.Any], acquire = acquire.toJsFn, getStatus = getStatus.toJsFn, getTemplate = getTemplate.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setStatus = js.Any.fromFunction1((t0: SecurityOperationStatus) => setStatus(t0).runNow()), setTarget = js.Any.fromFunction1((t0: XXMLElementWrapper) => setTarget(t0).runNow()), setTemplate = js.Any.fromFunction1((t0: XXMLElementWrapper) => setTemplate(t0).runNow()))
    __obj.asInstanceOf[XXMLSecurityTemplate]
  }
  
  extension [Self <: XXMLSecurityTemplate](x: Self) {
    
    inline def setGetStatus(value: CallbackTo[SecurityOperationStatus]): Self = StObject.set(x, "getStatus", value.toJsFn)
    
    inline def setGetTemplate(value: CallbackTo[XXMLElementWrapper]): Self = StObject.set(x, "getTemplate", value.toJsFn)
    
    inline def setSetStatus(value: SecurityOperationStatus => Callback): Self = StObject.set(x, "setStatus", js.Any.fromFunction1((t0: SecurityOperationStatus) => value(t0).runNow()))
    
    inline def setSetTarget(value: XXMLElementWrapper => Callback): Self = StObject.set(x, "setTarget", js.Any.fromFunction1((t0: XXMLElementWrapper) => value(t0).runNow()))
    
    inline def setSetTemplate(value: XXMLElementWrapper => Callback): Self = StObject.set(x, "setTemplate", js.Any.fromFunction1((t0: XXMLElementWrapper) => value(t0).runNow()))
    
    inline def setStatus(value: SecurityOperationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setTemplate(value: XXMLElementWrapper): Self = StObject.set(x, "Template", value.asInstanceOf[js.Any])
  }
}
