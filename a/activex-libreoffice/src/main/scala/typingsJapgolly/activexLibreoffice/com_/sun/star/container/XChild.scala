package typingsJapgolly.activexLibreoffice.com_.sun.star.container

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the parent of the object.
  *
  * This interface normally is only supported if the objects all have exactly one dedicated parent container.
  */
trait XChild
  extends StObject
     with XInterface {
  
  /** grants access to the object containing this content. */
  var Parent: XInterface
  
  /** grants access to the object containing this content. */
  def getParent(): XInterface
  
  /**
    * sets the parent to this object.
    * @throws com::sun::star::lang::NoSupportException if the name of this object cannot be changed.
    */
  def setParent(Parent: XInterface): Unit
}
object XChild {
  
  inline def apply(
    Parent: XInterface,
    acquire: Callback,
    getParent: CallbackTo[XInterface],
    queryInterface: `type` => Any,
    release: Callback,
    setParent: XInterface => Callback
  ): XChild = {
    val __obj = js.Dynamic.literal(Parent = Parent.asInstanceOf[js.Any], acquire = acquire.toJsFn, getParent = getParent.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setParent = js.Any.fromFunction1((t0: XInterface) => setParent(t0).runNow()))
    __obj.asInstanceOf[XChild]
  }
  
  extension [Self <: XChild](x: Self) {
    
    inline def setGetParent(value: CallbackTo[XInterface]): Self = StObject.set(x, "getParent", value.toJsFn)
    
    inline def setParent(value: XInterface): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSetParent(value: XInterface => Callback): Self = StObject.set(x, "setParent", js.Any.fromFunction1((t0: XInterface) => value(t0).runNow()))
  }
}
