package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XMenuBar
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides function to update a menu bar for inplace editing.
  * @deprecated Deprecated
  * @since OOo 2.0
  */
trait XMenuBarAcceptor
  extends StObject
     with XInterface {
  
  /**
    * update menu bar according to the current frame mode. This is used in inplace editing mode where we have to merge our own menu into the container
    * applications menu.
    * @param xMenuBar the menu bar that should be merged with current one.
    */
  def updateMenuBar(xMenuBar: js.Array[XMenuBar]): Unit
}
object XMenuBarAcceptor {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    updateMenuBar: js.Array[XMenuBar] => Callback
  ): XMenuBarAcceptor = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, updateMenuBar = js.Any.fromFunction1((t0: js.Array[XMenuBar]) => updateMenuBar(t0).runNow()))
    __obj.asInstanceOf[XMenuBarAcceptor]
  }
  
  extension [Self <: XMenuBarAcceptor](x: Self) {
    
    inline def setUpdateMenuBar(value: js.Array[XMenuBar] => Callback): Self = StObject.set(x, "updateMenuBar", js.Any.fromFunction1((t0: js.Array[XMenuBar]) => value(t0).runNow()))
  }
}
