package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** this interface converts embedded object URLs from one URL space to another. */
trait XEmbeddedObjectResolver
  extends StObject
     with XInterface {
  
  /** converts the given URL from the source URL namespace to the destination URL space of this instance. */
  def resolveEmbeddedObjectURL(aURL: String): String
}
object XEmbeddedObjectResolver {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    resolveEmbeddedObjectURL: String => String
  ): XEmbeddedObjectResolver = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, resolveEmbeddedObjectURL = js.Any.fromFunction1(resolveEmbeddedObjectURL))
    __obj.asInstanceOf[XEmbeddedObjectResolver]
  }
  
  extension [Self <: XEmbeddedObjectResolver](x: Self) {
    
    inline def setResolveEmbeddedObjectURL(value: String => String): Self = StObject.set(x, "resolveEmbeddedObjectURL", js.Any.fromFunction1(value))
  }
}
