package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.Uik
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @deprecated Deprecated */
trait XComponentRegistry
  extends StObject
     with XInterface {
  
  /** @deprecated Deprecated */
  def createObject(URL: String, Uik: Uik): XInterface
}
object XComponentRegistry {
  
  inline def apply(
    acquire: Callback,
    createObject: (String, Uik) => XInterface,
    queryInterface: `type` => Any,
    release: Callback
  ): XComponentRegistry = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createObject = js.Any.fromFunction2(createObject), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XComponentRegistry]
  }
  
  extension [Self <: XComponentRegistry](x: Self) {
    
    inline def setCreateObject(value: (String, Uik) => XInterface): Self = StObject.set(x, "createObject", js.Any.fromFunction2(value))
  }
}
