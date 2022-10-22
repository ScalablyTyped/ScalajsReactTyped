package typingsJapgolly.activexLibreoffice.com_.sun.star.container

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows access to the collections of all content types within the object.
  *
  * This example prints the names of all tables:
  *
  * {{program example here, see documentation}}
  */
trait XContentEnumerationAccess
  extends StObject
     with XInterface {
  
  /** @returns all names of services of which instances exist in this object.  {@link XContentEnumerationAccess.createContentEnumeration()} creates an enumerati */
  val AvailableServiceNames: SafeArray[String]
  
  /** @returns a new enumeration object for the contents of the specified service type. */
  def createContentEnumeration(aServiceName: String): XEnumeration
  
  /** @returns all names of services of which instances exist in this object.  {@link XContentEnumerationAccess.createContentEnumeration()} creates an enumerati */
  def getAvailableServiceNames(): SafeArray[String]
}
object XContentEnumerationAccess {
  
  inline def apply(
    AvailableServiceNames: SafeArray[String],
    acquire: Callback,
    createContentEnumeration: String => XEnumeration,
    getAvailableServiceNames: CallbackTo[SafeArray[String]],
    queryInterface: `type` => Any,
    release: Callback
  ): XContentEnumerationAccess = {
    val __obj = js.Dynamic.literal(AvailableServiceNames = AvailableServiceNames.asInstanceOf[js.Any], acquire = acquire.toJsFn, createContentEnumeration = js.Any.fromFunction1(createContentEnumeration), getAvailableServiceNames = getAvailableServiceNames.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XContentEnumerationAccess]
  }
  
  extension [Self <: XContentEnumerationAccess](x: Self) {
    
    inline def setAvailableServiceNames(value: SafeArray[String]): Self = StObject.set(x, "AvailableServiceNames", value.asInstanceOf[js.Any])
    
    inline def setCreateContentEnumeration(value: String => XEnumeration): Self = StObject.set(x, "createContentEnumeration", js.Any.fromFunction1(value))
    
    inline def setGetAvailableServiceNames(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getAvailableServiceNames", value.toJsFn)
  }
}
