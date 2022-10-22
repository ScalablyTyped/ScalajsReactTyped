package typingsJapgolly.activexLibreoffice.com_.sun.star.lang

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to locate a specific connection point for a specified UIK and manages a sequence of connections points.
  *
  * An implementation of this interface **must** support the {@link com.sun.star.uno.XWeak} interface. Look at the language binding for a superclass or
  * something else.
  * @see XConnectionPoint
  * @see com.sun.star.uno.XWeak
  */
trait XConnectionPointContainer
  extends StObject
     with XInterface {
  
  /** @returns a sequence of all outgoing types; specifies which are supported by this connectable object. */
  val ConnectionPointTypes: SafeArray[`type`]
  
  /**
    * creates a connection between this object and a client's sink, where the sink implements the outgoing interface specified with ID.
    *
    * The interface is advised under the connection point you get with `queryConnectionPoint( id )` .
    *
    * Use this method instead of the advise method at the connection point, only if you know that the broadcaster supports the outgoing interface, or if it
    * does not matter that the outgoing interface is not supported.
    * @see XConnectionPoint.advise
    */
  def advise(aType: `type`, xListener: XInterface): Unit
  
  /** @returns a sequence of all outgoing types; specifies which are supported by this connectable object. */
  def getConnectionPointTypes(): SafeArray[`type`]
  
  /**
    * @param aType specifies the connection point's type.
    * @returns an {@link XConnectionPoint} interface of a connection point for a specified type if that type describes a supported outgoing interface. It is NUL
    */
  def queryConnectionPoint(aType: `type`): XConnectionPoint
  
  /**
    * terminates a notification previously set up with advise at the container or at the suitable connection point.
    * @see XConnectionPoint.unadvise
    */
  def unadvise(aType: `type`, xListener: XInterface): Unit
}
object XConnectionPointContainer {
  
  inline def apply(
    ConnectionPointTypes: SafeArray[`type`],
    acquire: Callback,
    advise: (`type`, XInterface) => Callback,
    getConnectionPointTypes: CallbackTo[SafeArray[`type`]],
    queryConnectionPoint: `type` => XConnectionPoint,
    queryInterface: `type` => Any,
    release: Callback,
    unadvise: (`type`, XInterface) => Callback
  ): XConnectionPointContainer = {
    val __obj = js.Dynamic.literal(ConnectionPointTypes = ConnectionPointTypes.asInstanceOf[js.Any], acquire = acquire.toJsFn, advise = js.Any.fromFunction2((t0: `type`, t1: XInterface) => (advise(t0, t1)).runNow()), getConnectionPointTypes = getConnectionPointTypes.toJsFn, queryConnectionPoint = js.Any.fromFunction1(queryConnectionPoint), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, unadvise = js.Any.fromFunction2((t0: `type`, t1: XInterface) => (unadvise(t0, t1)).runNow()))
    __obj.asInstanceOf[XConnectionPointContainer]
  }
  
  extension [Self <: XConnectionPointContainer](x: Self) {
    
    inline def setAdvise(value: (`type`, XInterface) => Callback): Self = StObject.set(x, "advise", js.Any.fromFunction2((t0: `type`, t1: XInterface) => (value(t0, t1)).runNow()))
    
    inline def setConnectionPointTypes(value: SafeArray[`type`]): Self = StObject.set(x, "ConnectionPointTypes", value.asInstanceOf[js.Any])
    
    inline def setGetConnectionPointTypes(value: CallbackTo[SafeArray[`type`]]): Self = StObject.set(x, "getConnectionPointTypes", value.toJsFn)
    
    inline def setQueryConnectionPoint(value: `type` => XConnectionPoint): Self = StObject.set(x, "queryConnectionPoint", js.Any.fromFunction1(value))
    
    inline def setUnadvise(value: (`type`, XInterface) => Callback): Self = StObject.set(x, "unadvise", js.Any.fromFunction2((t0: `type`, t1: XInterface) => (value(t0, t1)).runNow()))
  }
}
