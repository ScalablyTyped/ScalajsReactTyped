package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.framework

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The {@link BasicToolBarFactory} is a resource factory that provides (some of) the tool bars used by the Draw and Impress applications.
  *
  * The factory recognizes the following URLs: `private:resource/toolbar/ViewTabBar` for the tab bar that allows the switching between views. This short
  * list marks the implementation of this service clearly as being in transition.
  *
  * This factory is typically created indirectly by registering it in the configuration and have the {@link XModuleController} create it on demand.
  */
trait BasicToolBarFactory
  extends StObject
     with XResourceFactory {
  
  /** Give the controller to new instances so that they have access to the drawing framework controllers. */
  def create(xController: XController): Unit
}
object BasicToolBarFactory {
  
  inline def apply(
    create: XController => Callback,
    createResource: XResourceId => XResource,
    releaseResource: XResource => Callback
  ): BasicToolBarFactory = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1((t0: XController) => create(t0).runNow()), createResource = js.Any.fromFunction1(createResource), releaseResource = js.Any.fromFunction1((t0: XResource) => releaseResource(t0).runNow()))
    __obj.asInstanceOf[BasicToolBarFactory]
  }
  
  extension [Self <: BasicToolBarFactory](x: Self) {
    
    inline def setCreate(value: XController => Callback): Self = StObject.set(x, "create", js.Any.fromFunction1((t0: XController) => value(t0).runNow()))
  }
}
