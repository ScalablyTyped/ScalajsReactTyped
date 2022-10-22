package typingsJapgolly.activexLibreoffice.com_.sun.star.container

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to replace contents in a collection by an implicit (unique) ID: */
trait XImplicitIDReplace
  extends StObject
     with XInterface {
  
  /** replaces the content which is specified by its implicit (unique) ID with a new content. */
  def replaceByUniqueID(ID: String, aNewElement: Any): Unit
}
object XImplicitIDReplace {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    replaceByUniqueID: (String, Any) => Callback
  ): XImplicitIDReplace = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, replaceByUniqueID = js.Any.fromFunction2((t0: String, t1: Any) => (replaceByUniqueID(t0, t1)).runNow()))
    __obj.asInstanceOf[XImplicitIDReplace]
  }
  
  extension [Self <: XImplicitIDReplace](x: Self) {
    
    inline def setReplaceByUniqueID(value: (String, Any) => Callback): Self = StObject.set(x, "replaceByUniqueID", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
  }
}
