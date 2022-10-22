package typingsJapgolly.activexLibreoffice.com_.sun.star.container

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to access contents through an implicit (unique) ID. */
trait XImplicitIDAccess
  extends StObject
     with XElementAccess {
  
  /** @returns a sequence with all existing implicit IDs. */
  val ImplicitIDs: SafeArray[String]
  
  /** @returns the element with the specified implicit ID. */
  def getByImplicitID(ID: String): Any
  
  /** @returns a sequence with all existing implicit IDs. */
  def getImplicitIDs(): SafeArray[String]
}
object XImplicitIDAccess {
  
  inline def apply(
    ElementType: `type`,
    ImplicitIDs: SafeArray[String],
    acquire: Callback,
    getByImplicitID: String => Any,
    getElementType: CallbackTo[`type`],
    getImplicitIDs: CallbackTo[SafeArray[String]],
    hasElements: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback
  ): XImplicitIDAccess = {
    val __obj = js.Dynamic.literal(ElementType = ElementType.asInstanceOf[js.Any], ImplicitIDs = ImplicitIDs.asInstanceOf[js.Any], acquire = acquire.toJsFn, getByImplicitID = js.Any.fromFunction1(getByImplicitID), getElementType = getElementType.toJsFn, getImplicitIDs = getImplicitIDs.toJsFn, hasElements = hasElements.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XImplicitIDAccess]
  }
  
  extension [Self <: XImplicitIDAccess](x: Self) {
    
    inline def setGetByImplicitID(value: String => Any): Self = StObject.set(x, "getByImplicitID", js.Any.fromFunction1(value))
    
    inline def setGetImplicitIDs(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getImplicitIDs", value.toJsFn)
    
    inline def setImplicitIDs(value: SafeArray[String]): Self = StObject.set(x, "ImplicitIDs", value.asInstanceOf[js.Any])
  }
}
