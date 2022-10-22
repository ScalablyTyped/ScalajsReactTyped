package typingsJapgolly.activexLibreoffice.com_.sun.star.graphic

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interfaces exposes just one method to render a {@link XGraphic} container */
trait XGraphicRenderer
  extends StObject
     with XInterface {
  
  /**
    * Renders the {@link XGraphic} container
    * @param Graphic The graphic container to be rendered
    * @see XGraphic
    */
  def render(Graphic: XGraphic): Unit
}
object XGraphicRenderer {
  
  inline def apply(acquire: Callback, queryInterface: `type` => Any, release: Callback, render: XGraphic => Callback): XGraphicRenderer = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, render = js.Any.fromFunction1((t0: XGraphic) => render(t0).runNow()))
    __obj.asInstanceOf[XGraphicRenderer]
  }
  
  extension [Self <: XGraphicRenderer](x: Self) {
    
    inline def setRender(value: XGraphic => Callback): Self = StObject.set(x, "render", js.Any.fromFunction1((t0: XGraphic) => value(t0).runNow()))
  }
}
