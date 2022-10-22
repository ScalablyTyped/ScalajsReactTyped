package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Rectangle
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Size
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XWindowPeer
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** creates a hatch window implementation. */
trait XHatchWindowFactory
  extends StObject
     with XInterface {
  
  /**
    * creates a new hatch window instance.
    * @param xParent the parent window the hatch window should be created in
    * @param aBounds position and size of the hatch window
    * @param aSize border and handler squares size
    * @returns a new hatch window
    * @throws com::sun::star::lang::IllegalArgumentException one of arguments is illegal
    */
  def createHatchWindowInstance(xParent: XWindowPeer, aBounds: Rectangle, aSize: Size): XHatchWindow
}
object XHatchWindowFactory {
  
  inline def apply(
    acquire: Callback,
    createHatchWindowInstance: (XWindowPeer, Rectangle, Size) => XHatchWindow,
    queryInterface: `type` => Any,
    release: Callback
  ): XHatchWindowFactory = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createHatchWindowInstance = js.Any.fromFunction3(createHatchWindowInstance), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XHatchWindowFactory]
  }
  
  extension [Self <: XHatchWindowFactory](x: Self) {
    
    inline def setCreateHatchWindowInstance(value: (XWindowPeer, Rectangle, Size) => XHatchWindow): Self = StObject.set(x, "createHatchWindowInstance", js.Any.fromFunction3(value))
  }
}
