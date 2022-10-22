package typingsJapgolly.materialUi.MaterialUI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Component
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.LegacyRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaperProps
  extends StObject
     with HTMLAttributes[js.Object] {
  
  var circle: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var ref: js.UndefOr[LegacyRef[Component[PaperProps & js.Object, js.Object]]] = js.undefined
  
  var rounded: js.UndefOr[Boolean] = js.undefined
  
  var transitionEnabled: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
  
  var zDepth: js.UndefOr[Double] = js.undefined
}
object PaperProps {
  
  inline def apply(): PaperProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaperProps]
  }
  
  extension [Self <: PaperProps](x: Self) {
    
    inline def setCircle(value: Boolean): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
    
    inline def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setRef(value: LegacyRef[Component[PaperProps & js.Object, js.Object]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: (Component[PaperProps & js.Object, js.Object]) | Null => Callback): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: (Component[PaperProps & js.Object, js.Object]) | Null) => value(t0).runNow()))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setRounded(value: Boolean): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
    
    inline def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
    
    inline def setTransitionEnabled(value: Boolean): Self = StObject.set(x, "transitionEnabled", value.asInstanceOf[js.Any])
    
    inline def setTransitionEnabledUndefined: Self = StObject.set(x, "transitionEnabled", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setZDepth(value: Double): Self = StObject.set(x, "zDepth", value.asInstanceOf[js.Any])
    
    inline def setZDepthUndefined: Self = StObject.set(x, "zDepth", js.undefined)
  }
}
