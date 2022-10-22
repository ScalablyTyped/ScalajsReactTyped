package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The document can provide access to CMIS properties and versions through this interface. */
trait XCmisDocument
  extends StObject
     with XInterface {
  
  val AllVersions: SafeArray[CmisVersion]
  
  /** Contains the properties values named after their CMIS ID. */
  var CmisProperties: SafeArray[CmisProperty]
  
  def canCancelCheckOut(): Boolean
  
  def canCheckIn(): Boolean
  
  def canCheckOut(): Boolean
  
  /** Cancel checked out document, this will discard all changes since check-out. */
  def cancelCheckOut(): Unit
  
  /** Creates a new version of the document from the private working copy. */
  def checkIn(isMajor: Boolean, comment: String): Unit
  
  /** Check out the document into a private working copy on the server, and update the loaded document to reflect this change. */
  def checkOut(): Unit
  
  def getAllVersions(): SafeArray[CmisVersion]
  
  /** Tells whether a document can support versioning or not. */
  def isVersionable(): Boolean
  
  def updateCmisProperties(cmisProperties: SeqEquiv[CmisProperty]): Unit
}
object XCmisDocument {
  
  inline def apply(
    AllVersions: SafeArray[CmisVersion],
    CmisProperties: SafeArray[CmisProperty],
    acquire: Callback,
    canCancelCheckOut: CallbackTo[Boolean],
    canCheckIn: CallbackTo[Boolean],
    canCheckOut: CallbackTo[Boolean],
    cancelCheckOut: Callback,
    checkIn: (Boolean, String) => Callback,
    checkOut: Callback,
    getAllVersions: CallbackTo[SafeArray[CmisVersion]],
    isVersionable: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    updateCmisProperties: SeqEquiv[CmisProperty] => Callback
  ): XCmisDocument = {
    val __obj = js.Dynamic.literal(AllVersions = AllVersions.asInstanceOf[js.Any], CmisProperties = CmisProperties.asInstanceOf[js.Any], acquire = acquire.toJsFn, canCancelCheckOut = canCancelCheckOut.toJsFn, canCheckIn = canCheckIn.toJsFn, canCheckOut = canCheckOut.toJsFn, cancelCheckOut = cancelCheckOut.toJsFn, checkIn = js.Any.fromFunction2((t0: Boolean, t1: String) => (checkIn(t0, t1)).runNow()), checkOut = checkOut.toJsFn, getAllVersions = getAllVersions.toJsFn, isVersionable = isVersionable.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, updateCmisProperties = js.Any.fromFunction1((t0: SeqEquiv[CmisProperty]) => updateCmisProperties(t0).runNow()))
    __obj.asInstanceOf[XCmisDocument]
  }
  
  extension [Self <: XCmisDocument](x: Self) {
    
    inline def setAllVersions(value: SafeArray[CmisVersion]): Self = StObject.set(x, "AllVersions", value.asInstanceOf[js.Any])
    
    inline def setCanCancelCheckOut(value: CallbackTo[Boolean]): Self = StObject.set(x, "canCancelCheckOut", value.toJsFn)
    
    inline def setCanCheckIn(value: CallbackTo[Boolean]): Self = StObject.set(x, "canCheckIn", value.toJsFn)
    
    inline def setCanCheckOut(value: CallbackTo[Boolean]): Self = StObject.set(x, "canCheckOut", value.toJsFn)
    
    inline def setCancelCheckOut(value: Callback): Self = StObject.set(x, "cancelCheckOut", value.toJsFn)
    
    inline def setCheckIn(value: (Boolean, String) => Callback): Self = StObject.set(x, "checkIn", js.Any.fromFunction2((t0: Boolean, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setCheckOut(value: Callback): Self = StObject.set(x, "checkOut", value.toJsFn)
    
    inline def setCmisProperties(value: SafeArray[CmisProperty]): Self = StObject.set(x, "CmisProperties", value.asInstanceOf[js.Any])
    
    inline def setGetAllVersions(value: CallbackTo[SafeArray[CmisVersion]]): Self = StObject.set(x, "getAllVersions", value.toJsFn)
    
    inline def setIsVersionable(value: CallbackTo[Boolean]): Self = StObject.set(x, "isVersionable", value.toJsFn)
    
    inline def setUpdateCmisProperties(value: SeqEquiv[CmisProperty] => Callback): Self = StObject.set(x, "updateCmisProperties", js.Any.fromFunction1((t0: SeqEquiv[CmisProperty]) => value(t0).runNow()))
  }
}
