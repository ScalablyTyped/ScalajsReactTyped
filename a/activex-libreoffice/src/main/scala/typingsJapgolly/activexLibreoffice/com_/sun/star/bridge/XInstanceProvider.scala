package typingsJapgolly.activexLibreoffice.com_.sun.star.bridge

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to export UNO objects to other processes.
  * @see XBridge
  */
trait XInstanceProvider
  extends StObject
     with XInterface {
  
  /**
    * gets called, when an initial object is requested from a remote process. You may either create a new instance or return an existing object.
    * @param sInstanceName The name of the requested object.
    * @returns the object associated with the name. The return value may be null in case there is no object to offer for this string. In this case, {@link XBrid
    * @throws NoSuchElementException You may throw this exception to indicate, that there is no object for this name. Due to a specification bug, this exceptio
    */
  def getInstance(sInstanceName: String): XInterface
}
object XInstanceProvider {
  
  inline def apply(
    acquire: Callback,
    getInstance: String => XInterface,
    queryInterface: `type` => Any,
    release: Callback
  ): XInstanceProvider = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getInstance = js.Any.fromFunction1(getInstance), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XInstanceProvider]
  }
  
  extension [Self <: XInstanceProvider](x: Self) {
    
    inline def setGetInstance(value: String => XInterface): Self = StObject.set(x, "getInstance", js.Any.fromFunction1(value))
  }
}
