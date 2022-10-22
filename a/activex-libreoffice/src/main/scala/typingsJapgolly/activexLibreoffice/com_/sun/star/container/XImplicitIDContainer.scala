package typingsJapgolly.activexLibreoffice.com_.sun.star.container

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to insert and remove elements in/from a container using an implicit (unique) ID. */
trait XImplicitIDContainer
  extends StObject
     with XImplicitIDReplace {
  
  /**
    * adds a new object to the container and generates an implicit (unique) ID for this object.
    * @returns the implicit ID for the new object.
    */
  def addWithImplicitID(aElement: Any): String
  
  /** removes an object from the container which is specified by an implicit (unique) identifier. */
  def removeByImplicitID(ID: String): Unit
}
object XImplicitIDContainer {
  
  inline def apply(
    acquire: Callback,
    addWithImplicitID: Any => String,
    queryInterface: `type` => Any,
    release: Callback,
    removeByImplicitID: String => Callback,
    replaceByUniqueID: (String, Any) => Callback
  ): XImplicitIDContainer = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addWithImplicitID = js.Any.fromFunction1(addWithImplicitID), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeByImplicitID = js.Any.fromFunction1((t0: String) => removeByImplicitID(t0).runNow()), replaceByUniqueID = js.Any.fromFunction2((t0: String, t1: Any) => (replaceByUniqueID(t0, t1)).runNow()))
    __obj.asInstanceOf[XImplicitIDContainer]
  }
  
  extension [Self <: XImplicitIDContainer](x: Self) {
    
    inline def setAddWithImplicitID(value: Any => String): Self = StObject.set(x, "addWithImplicitID", js.Any.fromFunction1(value))
    
    inline def setRemoveByImplicitID(value: String => Callback): Self = StObject.set(x, "removeByImplicitID", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
