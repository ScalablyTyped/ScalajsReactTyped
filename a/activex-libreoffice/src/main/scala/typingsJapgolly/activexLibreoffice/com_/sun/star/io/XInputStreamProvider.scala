package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for providing an input stream.
  *
  * Every time {@link createInputStream()} is called a new input stream is returned, always pointing to the begin of the same data. All input streams
  * returned by {@link createInputStream()} are completely independent from each other.
  */
trait XInputStreamProvider
  extends StObject
     with XInterface {
  
  /**
    * Creates a new input stream, every time providing the same data.
    * @returns a new input stream
    */
  def createInputStream(): XInputStream
}
object XInputStreamProvider {
  
  inline def apply(
    acquire: Callback,
    createInputStream: CallbackTo[XInputStream],
    queryInterface: `type` => Any,
    release: Callback
  ): XInputStreamProvider = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createInputStream = createInputStream.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XInputStreamProvider]
  }
  
  extension [Self <: XInputStreamProvider](x: Self) {
    
    inline def setCreateInputStream(value: CallbackTo[XInputStream]): Self = StObject.set(x, "createInputStream", value.toJsFn)
  }
}
