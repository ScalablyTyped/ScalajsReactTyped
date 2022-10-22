package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** this interface converts graphic object URLs from one URL space to another. */
trait XGraphicObjectResolver
  extends StObject
     with XInterface {
  
  /** converts the given URL from the source URL namespace to the destination URL space of this instance. */
  def resolveGraphicObjectURL(aURL: String): String
}
object XGraphicObjectResolver {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    resolveGraphicObjectURL: String => String
  ): XGraphicObjectResolver = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, resolveGraphicObjectURL = js.Any.fromFunction1(resolveGraphicObjectURL))
    __obj.asInstanceOf[XGraphicObjectResolver]
  }
  
  extension [Self <: XGraphicObjectResolver](x: Self) {
    
    inline def setResolveGraphicObjectURL(value: String => String): Self = StObject.set(x, "resolveGraphicObjectURL", js.Any.fromFunction1(value))
  }
}
