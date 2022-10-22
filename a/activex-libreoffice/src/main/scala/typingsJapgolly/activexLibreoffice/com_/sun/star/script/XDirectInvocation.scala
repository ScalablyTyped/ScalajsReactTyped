package typingsJapgolly.activexLibreoffice.com_.sun.star.script

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides access to an object's methods and properties. */
trait XDirectInvocation
  extends StObject
     with XInterface {
  
  /**
    * provides access to methods and properties exposed by an object.
    * @param aName the method to invoke
    * @param aParams all parameters, out parameters are not supported
    */
  def directInvoke(aName: String, aParams: SeqEquiv[Any]): Any
  
  /** returns `TRUE` if the method or property with the specified name exists, else `FALSE` . */
  def hasMember(aName: String): Boolean
}
object XDirectInvocation {
  
  inline def apply(
    acquire: Callback,
    directInvoke: (String, SeqEquiv[Any]) => Any,
    hasMember: String => Boolean,
    queryInterface: `type` => Any,
    release: Callback
  ): XDirectInvocation = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, directInvoke = js.Any.fromFunction2(directInvoke), hasMember = js.Any.fromFunction1(hasMember), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDirectInvocation]
  }
  
  extension [Self <: XDirectInvocation](x: Self) {
    
    inline def setDirectInvoke(value: (String, SeqEquiv[Any]) => Any): Self = StObject.set(x, "directInvoke", js.Any.fromFunction2(value))
    
    inline def setHasMember(value: String => Boolean): Self = StObject.set(x, "hasMember", js.Any.fromFunction1(value))
  }
}
