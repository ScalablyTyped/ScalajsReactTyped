package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XModel
import typingsJapgolly.activexLibreoffice.com_.sun.star.io.XInputStream
import typingsJapgolly.activexLibreoffice.com_.sun.star.script.XScriptListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies a provider for dialogs implementing the {@link com.sun.star.awt.XDialog} interface. */
trait DialogProvider
  extends StObject
     with XDialogProvider {
  
  def createWithModel(Model: XModel): Unit
  
  def createWithModelAndScripting(Model: XModel, InStream: XInputStream, DialogLib: XNameContainer, ScriptListener: XScriptListener): Unit
}
object DialogProvider {
  
  inline def apply(
    acquire: Callback,
    createDialog: String => XDialog,
    createWithModel: XModel => Callback,
    createWithModelAndScripting: (XModel, XInputStream, XNameContainer, XScriptListener) => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): DialogProvider = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, createDialog = js.Any.fromFunction1(createDialog), createWithModel = js.Any.fromFunction1((t0: XModel) => createWithModel(t0).runNow()), createWithModelAndScripting = js.Any.fromFunction4((t0: XModel, t1: XInputStream, t2: XNameContainer, t3: XScriptListener) => (createWithModelAndScripting(t0, t1, t2, t3)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[DialogProvider]
  }
  
  extension [Self <: DialogProvider](x: Self) {
    
    inline def setCreateWithModel(value: XModel => Callback): Self = StObject.set(x, "createWithModel", js.Any.fromFunction1((t0: XModel) => value(t0).runNow()))
    
    inline def setCreateWithModelAndScripting(value: (XModel, XInputStream, XNameContainer, XScriptListener) => Callback): Self = StObject.set(x, "createWithModelAndScripting", js.Any.fromFunction4((t0: XModel, t1: XInputStream, t2: XNameContainer, t3: XScriptListener) => (value(t0, t1, t2, t3)).runNow()))
  }
}
