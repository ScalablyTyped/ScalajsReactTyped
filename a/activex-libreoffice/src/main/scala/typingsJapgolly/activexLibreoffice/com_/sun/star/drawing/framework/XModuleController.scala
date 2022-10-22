package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.framework

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The module controller is responsible for loading a module (ad-don, plugin, whatever the name) when it is first used.
  *
  * For this there is a list in the office configuration which associates resource URLs with service names which in turn are associated with modules (or
  * dlls). The path to the office configuration list is MultiPaneGUI/Framework/ResourceFactories in the Impress.xcu file.
  */
trait XModuleController extends StObject {
  
  /** When the specified resource is requested for the first time then create a new instance of the associated factory service. */
  def requestResource(sResourceTypeURL: String): Unit
}
object XModuleController {
  
  inline def apply(requestResource: String => Callback): XModuleController = {
    val __obj = js.Dynamic.literal(requestResource = js.Any.fromFunction1((t0: String) => requestResource(t0).runNow()))
    __obj.asInstanceOf[XModuleController]
  }
  
  extension [Self <: XModuleController](x: Self) {
    
    inline def setRequestResource(value: String => Callback): Self = StObject.set(x, "requestResource", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
