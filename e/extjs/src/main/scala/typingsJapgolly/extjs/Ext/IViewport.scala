package typingsJapgolly.extjs.Ext

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IViewport
  extends StObject
     with typingsJapgolly.extjs.Ext.container.IContainer {
  
  /** [Property] (Boolean) */
  var isViewport: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Template method called when this Component s DOM structure is created  */
  @JSName("onRender")
  var onRender_IViewport: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object IViewport {
  
  inline def apply(): IViewport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IViewport]
  }
  
  extension [Self <: IViewport](x: Self) {
    
    inline def setIsViewport(value: Boolean): Self = StObject.set(x, "isViewport", value.asInstanceOf[js.Any])
    
    inline def setIsViewportUndefined: Self = StObject.set(x, "isViewport", js.undefined)
    
    inline def setOnRender(value: Callback): Self = StObject.set(x, "onRender", value.toJsFn)
    
    inline def setOnRenderUndefined: Self = StObject.set(x, "onRender", js.undefined)
  }
}
