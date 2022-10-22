package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Allows to set a default size. This size will be used in case no further information si available. */
trait XDefaultSizeTransmitter
  extends StObject
     with XInterface {
  
  /**
    * set a default size
    * @param aSize100ThMm specifies a size in hundredth mm.
    */
  def setDefaultSize(aSize100ThMm: Size): Unit
}
object XDefaultSizeTransmitter {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setDefaultSize: Size => Callback
  ): XDefaultSizeTransmitter = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setDefaultSize = js.Any.fromFunction1((t0: Size) => setDefaultSize(t0).runNow()))
    __obj.asInstanceOf[XDefaultSizeTransmitter]
  }
  
  extension [Self <: XDefaultSizeTransmitter](x: Self) {
    
    inline def setSetDefaultSize(value: Size => Callback): Self = StObject.set(x, "setDefaultSize", js.Any.fromFunction1((t0: Size) => value(t0).runNow()))
  }
}
