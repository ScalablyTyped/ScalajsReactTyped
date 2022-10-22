package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.crypto

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.wrapper.XXMLElementWrapper
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of XML signature template
  *
  * This interface represents a signature template, which is the same as the desired XML signature element but some of the nodes may be empty. The empty
  * entities include digest value and signature value. Empty entities are not allowed in a signature template when performing validation.
  *
  * In some cases, the signer or verifier can determine and locate the contents to be signed from the template by dereference the URI.
  *
  * With the help of signature context, the signer or verifier specifies the key from the KeyInfo in the signature template.
  *
  * Owner: Andrew Fan
  */
trait XXMLSignatureTemplate
  extends StObject
     with XXMLSecurityTemplate {
  
  /** Get the dynamic URI binding */
  var Binding: XUriBinding
  
  /** Get the target XML element, i.e. the element to be signed */
  val Targets: SafeArray[XXMLElementWrapper]
  
  /** Get the dynamic URI binding */
  def getBinding(): XUriBinding
  
  /** Get the target XML element, i.e. the element to be signed */
  def getTargets(): SafeArray[XXMLElementWrapper]
  
  /** Set the dynamic URI binding */
  def setBinding(aUriBinding: XUriBinding): Unit
}
object XXMLSignatureTemplate {
  
  inline def apply(
    Binding: XUriBinding,
    Status: SecurityOperationStatus,
    Targets: SafeArray[XXMLElementWrapper],
    Template: XXMLElementWrapper,
    acquire: Callback,
    getBinding: CallbackTo[XUriBinding],
    getStatus: CallbackTo[SecurityOperationStatus],
    getTargets: CallbackTo[SafeArray[XXMLElementWrapper]],
    getTemplate: CallbackTo[XXMLElementWrapper],
    queryInterface: `type` => Any,
    release: Callback,
    setBinding: XUriBinding => Callback,
    setStatus: SecurityOperationStatus => Callback,
    setTarget: XXMLElementWrapper => Callback,
    setTemplate: XXMLElementWrapper => Callback
  ): XXMLSignatureTemplate = {
    val __obj = js.Dynamic.literal(Binding = Binding.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Targets = Targets.asInstanceOf[js.Any], Template = Template.asInstanceOf[js.Any], acquire = acquire.toJsFn, getBinding = getBinding.toJsFn, getStatus = getStatus.toJsFn, getTargets = getTargets.toJsFn, getTemplate = getTemplate.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setBinding = js.Any.fromFunction1((t0: XUriBinding) => setBinding(t0).runNow()), setStatus = js.Any.fromFunction1((t0: SecurityOperationStatus) => setStatus(t0).runNow()), setTarget = js.Any.fromFunction1((t0: XXMLElementWrapper) => setTarget(t0).runNow()), setTemplate = js.Any.fromFunction1((t0: XXMLElementWrapper) => setTemplate(t0).runNow()))
    __obj.asInstanceOf[XXMLSignatureTemplate]
  }
  
  extension [Self <: XXMLSignatureTemplate](x: Self) {
    
    inline def setBinding(value: XUriBinding): Self = StObject.set(x, "Binding", value.asInstanceOf[js.Any])
    
    inline def setGetBinding(value: CallbackTo[XUriBinding]): Self = StObject.set(x, "getBinding", value.toJsFn)
    
    inline def setGetTargets(value: CallbackTo[SafeArray[XXMLElementWrapper]]): Self = StObject.set(x, "getTargets", value.toJsFn)
    
    inline def setSetBinding(value: XUriBinding => Callback): Self = StObject.set(x, "setBinding", js.Any.fromFunction1((t0: XUriBinding) => value(t0).runNow()))
    
    inline def setTargets(value: SafeArray[XXMLElementWrapper]): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
  }
}
