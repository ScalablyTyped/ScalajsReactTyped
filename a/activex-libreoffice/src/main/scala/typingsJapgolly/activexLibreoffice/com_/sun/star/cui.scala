package typingsJapgolly.activexLibreoffice.com_.sun.star

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XWindow
import typingsJapgolly.activexLibreoffice.com_.sun.star.ui.dialogs.XExecutableDialog
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cui {
  
  /** @since LibreOffice 4.1 */
  trait ColorPicker
    extends StObject
       with XExecutableDialog {
    
    def createWithParent(Parent: XWindow): Unit
  }
  object ColorPicker {
    
    inline def apply(
      acquire: Callback,
      createWithParent: XWindow => Callback,
      execute: CallbackTo[Double],
      queryInterface: `type` => Any,
      release: Callback,
      setTitle: String => Callback
    ): ColorPicker = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createWithParent = js.Any.fromFunction1((t0: XWindow) => createWithParent(t0).runNow()), execute = execute.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setTitle = js.Any.fromFunction1((t0: String) => setTitle(t0).runNow()))
      __obj.asInstanceOf[ColorPicker]
    }
    
    extension [Self <: ColorPicker](x: Self) {
      
      inline def setCreateWithParent(value: XWindow => Callback): Self = StObject.set(x, "createWithParent", js.Any.fromFunction1((t0: XWindow) => value(t0).runNow()))
    }
  }
}
