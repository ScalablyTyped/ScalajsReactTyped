package typingsJapgolly.activexLibreoffice.com_.sun.star.script

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface to create adapter objects giving a type to be supported and a an invocation interface incoming calls are delegated to.
  *
  * This interface is deprecated. Use {@link XInvocationAdapterFactory2} .
  * @deprecated Deprecated
  */
trait XInvocationAdapterFactory
  extends StObject
     with XInterface {
  
  /**
    * Creates an adapter interface of given type for calling the given {@link XInvocation} interface.
    * @param Invocation invocation interface being called on incoming adapter calls
    * @param aType supported type of adapter
    * @returns adapter interface; this interface can be queried for XInterface and given type
    */
  def createAdapter(Invocation: XInvocation, aType: `type`): XInterface
}
object XInvocationAdapterFactory {
  
  inline def apply(
    acquire: Callback,
    createAdapter: (XInvocation, `type`) => XInterface,
    queryInterface: `type` => Any,
    release: Callback
  ): XInvocationAdapterFactory = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createAdapter = js.Any.fromFunction2(createAdapter), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XInvocationAdapterFactory]
  }
  
  extension [Self <: XInvocationAdapterFactory](x: Self) {
    
    inline def setCreateAdapter(value: (XInvocation, `type`) => XInterface): Self = StObject.set(x, "createAdapter", js.Any.fromFunction2(value))
  }
}
