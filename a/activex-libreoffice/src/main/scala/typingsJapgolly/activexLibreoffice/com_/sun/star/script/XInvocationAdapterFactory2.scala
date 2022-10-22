package typingsJapgolly.activexLibreoffice.com_.sun.star.script

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Interface to create adapter objects giving types to be supported and a an invocation interface incoming calls are delegated to. */
trait XInvocationAdapterFactory2
  extends StObject
     with XInterface {
  
  /**
    * Creates an adapter interface of given types for calling the given {@link XInvocation} interface.
    * @param Invocation invocation interface being called on incoming adapter calls
    * @param aTypes supported types of adapter
    * @returns adapter interface; this interface can be queried for XInterface and given types
    */
  def createAdapter(Invocation: XInvocation, aTypes: SeqEquiv[`type`]): XInterface
}
object XInvocationAdapterFactory2 {
  
  inline def apply(
    acquire: Callback,
    createAdapter: (XInvocation, SeqEquiv[`type`]) => XInterface,
    queryInterface: `type` => Any,
    release: Callback
  ): XInvocationAdapterFactory2 = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createAdapter = js.Any.fromFunction2(createAdapter), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XInvocationAdapterFactory2]
  }
  
  extension [Self <: XInvocationAdapterFactory2](x: Self) {
    
    inline def setCreateAdapter(value: (XInvocation, SeqEquiv[`type`]) => XInterface): Self = StObject.set(x, "createAdapter", js.Any.fromFunction2(value))
  }
}
