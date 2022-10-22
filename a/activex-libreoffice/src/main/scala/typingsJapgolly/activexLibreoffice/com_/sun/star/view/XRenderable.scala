package typingsJapgolly.activexLibreoffice.com_.sun.star.view

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents something that can be rendered.
  * @since OOo 1.1.2
  */
trait XRenderable
  extends StObject
     with XInterface {
  
  /**
    * @returns a descriptor of the specific renderer.  returns the specific renderer properties based on the given selection.  If the selection contains a valid
    * @see RenderDescriptor
    * @see RenderOptions
    */
  def getRenderer(nRenderer: Double, aSelection: Any, xOptions: SeqEquiv[PropertyValue]): SafeArray[PropertyValue]
  
  /**
    * @returns the count of renderers (based on paper count of a document, for example).  If a selection is given, the count has to be calculated based on this
    * @see RenderOptions
    */
  def getRendererCount(aSelection: Any, xOptions: SeqEquiv[PropertyValue]): Double
  
  /**
    * renders the object.
    *
    * renders the object with the specific renderer based on the given selection.
    *
    * If the selection contains a valid XModel interface, it is assumed that the whole document should be rendered. If the selection is empty, nothing
    * should be rendered.
    * @see RenderOptions
    */
  def render(nRenderer: Double, aSelection: Any, xOptions: SeqEquiv[PropertyValue]): Unit
}
object XRenderable {
  
  inline def apply(
    acquire: Callback,
    getRenderer: (Double, Any, SeqEquiv[PropertyValue]) => SafeArray[PropertyValue],
    getRendererCount: (Any, SeqEquiv[PropertyValue]) => Double,
    queryInterface: `type` => Any,
    release: Callback,
    render: (Double, Any, SeqEquiv[PropertyValue]) => Callback
  ): XRenderable = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getRenderer = js.Any.fromFunction3(getRenderer), getRendererCount = js.Any.fromFunction2(getRendererCount), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, render = js.Any.fromFunction3((t0: Double, t1: Any, t2: SeqEquiv[PropertyValue]) => (render(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[XRenderable]
  }
  
  extension [Self <: XRenderable](x: Self) {
    
    inline def setGetRenderer(value: (Double, Any, SeqEquiv[PropertyValue]) => SafeArray[PropertyValue]): Self = StObject.set(x, "getRenderer", js.Any.fromFunction3(value))
    
    inline def setGetRendererCount(value: (Any, SeqEquiv[PropertyValue]) => Double): Self = StObject.set(x, "getRendererCount", js.Any.fromFunction2(value))
    
    inline def setRender(value: (Double, Any, SeqEquiv[PropertyValue]) => Callback): Self = StObject.set(x, "render", js.Any.fromFunction3((t0: Double, t1: Any, t2: SeqEquiv[PropertyValue]) => (value(t0, t1, t2)).runNow()))
  }
}
