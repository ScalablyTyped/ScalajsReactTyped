package typingsJapgolly.activexLibreoffice.com_.sun.star.deployment

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumeration
import typingsJapgolly.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.dom.XElement
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Objects implementing this interface provide access to the xml root of one or more update information files for a given set of URLs.
  * @since OOo 2.2
  */
trait XUpdateInformationProvider extends StObject {
  
  /** interrupts a getUpdateInformation call and let's it return immediately. */
  def cancel(): Unit
  
  /**
    * get update information for a specific extension or all available information from a repository.
    * @param repositories a repository and its mirrors.
    * @param extensionId the unique identifier of an extension. If it is not empty and the update document is an atom feed, only items whose "term" attribute
    */
  def getUpdateInformation(repositories: SeqEquiv[String], extensionId: String): SafeArray[XElement]
  
  /**
    * get update information for a specific extension or all available information from a repository.
    * @param repositories a repository and its mirrors.
    * @param extensionId the unique identifier of an extension. If it is not empty and the update document is an atom feed, only items whose "term" attribute
    * @returns an enumeration of {@link UpdateInformationEntry} .
    */
  def getUpdateInformationEnumeration(repositories: SeqEquiv[String], extensionId: String): XEnumeration
  
  /**
    * Sets an interaction handler to be used for further operations.
    *
    * A default interaction handler is available as service {@link com.sun.star.task.InteractionHandler} . The documentation of this service also contains
    * further information about the interaction handler concept.
    * @param handler The interaction handler to be set
    * @see com.sun.star.task.InteractionHandler
    */
  def setInteractionHandler(handler: XInteractionHandler): Unit
}
object XUpdateInformationProvider {
  
  inline def apply(
    cancel: Callback,
    getUpdateInformation: (SeqEquiv[String], String) => SafeArray[XElement],
    getUpdateInformationEnumeration: (SeqEquiv[String], String) => XEnumeration,
    setInteractionHandler: XInteractionHandler => Callback
  ): XUpdateInformationProvider = {
    val __obj = js.Dynamic.literal(cancel = cancel.toJsFn, getUpdateInformation = js.Any.fromFunction2(getUpdateInformation), getUpdateInformationEnumeration = js.Any.fromFunction2(getUpdateInformationEnumeration), setInteractionHandler = js.Any.fromFunction1((t0: XInteractionHandler) => setInteractionHandler(t0).runNow()))
    __obj.asInstanceOf[XUpdateInformationProvider]
  }
  
  extension [Self <: XUpdateInformationProvider](x: Self) {
    
    inline def setCancel(value: Callback): Self = StObject.set(x, "cancel", value.toJsFn)
    
    inline def setGetUpdateInformation(value: (SeqEquiv[String], String) => SafeArray[XElement]): Self = StObject.set(x, "getUpdateInformation", js.Any.fromFunction2(value))
    
    inline def setGetUpdateInformationEnumeration(value: (SeqEquiv[String], String) => XEnumeration): Self = StObject.set(x, "getUpdateInformationEnumeration", js.Any.fromFunction2(value))
    
    inline def setSetInteractionHandler(value: XInteractionHandler => Callback): Self = StObject.set(x, "setInteractionHandler", js.Any.fromFunction1((t0: XInteractionHandler) => value(t0).runNow()))
  }
}
