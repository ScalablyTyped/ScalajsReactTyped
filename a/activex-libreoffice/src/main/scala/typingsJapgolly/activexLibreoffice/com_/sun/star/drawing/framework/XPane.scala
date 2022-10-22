package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.framework

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XWindow
import typingsJapgolly.activexLibreoffice.com_.sun.star.rendering.XCanvas
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A pane is an abstraction of a window and is one of the resources managed by the drawing framework.
  *
  * Apart from the area that displays a view a pane may contain other parts like title, menu, closer button.
  *
  * The URL prefix of panes is `private:resource/floater`
  */
trait XPane
  extends StObject
     with XResource {
  
  /**
    * Return the com::sun::star::awt::XCanvas of the pane. The {@link com.sun.star.rendering.XCanvas} object is expected to be associated with the {@link
    * com.sun.star.awt.XWindow} object returned by {@link getWindow()} .
    * @returns When the {@link com.sun.star.rendering.XCanvas} interface is not supported then an empty reference is returned.
    */
  val Canvas: XCanvas
  
  /** Return the {@link com.sun.star.awt.XWindow} of the pane that is used to display a view. */
  val Window: XWindow
  
  /**
    * Return the com::sun::star::awt::XCanvas of the pane. The {@link com.sun.star.rendering.XCanvas} object is expected to be associated with the {@link
    * com.sun.star.awt.XWindow} object returned by {@link getWindow()} .
    * @returns When the {@link com.sun.star.rendering.XCanvas} interface is not supported then an empty reference is returned.
    */
  def getCanvas(): XCanvas
  
  /** Return the {@link com.sun.star.awt.XWindow} of the pane that is used to display a view. */
  def getWindow(): XWindow
}
object XPane {
  
  inline def apply(
    Canvas: XCanvas,
    ResourceId: XResourceId,
    Window: XWindow,
    getCanvas: CallbackTo[XCanvas],
    getResourceId: CallbackTo[XResourceId],
    getWindow: CallbackTo[XWindow],
    isAnchorOnly: CallbackTo[Boolean]
  ): XPane = {
    val __obj = js.Dynamic.literal(Canvas = Canvas.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any], Window = Window.asInstanceOf[js.Any], getCanvas = getCanvas.toJsFn, getResourceId = getResourceId.toJsFn, getWindow = getWindow.toJsFn, isAnchorOnly = isAnchorOnly.toJsFn)
    __obj.asInstanceOf[XPane]
  }
  
  extension [Self <: XPane](x: Self) {
    
    inline def setCanvas(value: XCanvas): Self = StObject.set(x, "Canvas", value.asInstanceOf[js.Any])
    
    inline def setGetCanvas(value: CallbackTo[XCanvas]): Self = StObject.set(x, "getCanvas", value.toJsFn)
    
    inline def setGetWindow(value: CallbackTo[XWindow]): Self = StObject.set(x, "getWindow", value.toJsFn)
    
    inline def setWindow(value: XWindow): Self = StObject.set(x, "Window", value.asInstanceOf[js.Any])
  }
}
