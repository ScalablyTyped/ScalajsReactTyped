package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.sax

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to modify the behavior of resolving external preferences.
  *
  * Usually, the parser has a default behavior of resolving external references (See documentation of the parser implementation). Use this interface to
  * modify or reimplement this behavior.
  */
trait XEntityResolver
  extends StObject
     with XInterface {
  
  /** @returns for the external entity.  If **aInputStream** is a valid reference to an input stream, the parser uses this {@link InputSourc */
  def resolveEntity(sPublicId: String, sSystemId: String): InputSource
}
object XEntityResolver {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    resolveEntity: (String, String) => InputSource
  ): XEntityResolver = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, resolveEntity = js.Any.fromFunction2(resolveEntity))
    __obj.asInstanceOf[XEntityResolver]
  }
  
  extension [Self <: XEntityResolver](x: Self) {
    
    inline def setResolveEntity(value: (String, String) => InputSource): Self = StObject.set(x, "resolveEntity", js.Any.fromFunction2(value))
  }
}
