package typingsJapgolly.victoryCore

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.victoryCore.anon.AriaLabel_
import typingsJapgolly.victoryCore.anon.CircleComponent
import typingsJapgolly.victoryCore.esVictoryUtilCommonPropsMod.VictoryCommonPrimitiveProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esVictoryPrimitivesBackgroundMod {
  
  object Background {
    
    inline def apply(props: BackgroundProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("victory-core/es/victory-primitives/background", "Background")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("victory-core/es/victory-primitives/background", "Background.defaultProps")
    @js.native
    def defaultProps: CircleComponent = js.native
    inline def defaultProps_=(x: CircleComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/es/victory-primitives/background", "Background.propTypes")
    @js.native
    def propTypes: AriaLabel_ = js.native
    inline def propTypes_=(x: AriaLabel_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait BackgroundProps
    extends StObject
       with VictoryCommonPrimitiveProps {
    
    var circleComponent: js.UndefOr[Element] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var rectComponent: js.UndefOr[Element] = js.undefined
    
    var rx: js.UndefOr[Double] = js.undefined
    
    var ry: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object BackgroundProps {
    
    inline def apply(): BackgroundProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackgroundProps]
    }
    
    extension [Self <: BackgroundProps](x: Self) {
      
      inline def setCircleComponent(value: VdomElement): Self = StObject.set(x, "circleComponent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCircleComponentUndefined: Self = StObject.set(x, "circleComponent", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setRectComponent(value: VdomElement): Self = StObject.set(x, "rectComponent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRectComponentUndefined: Self = StObject.set(x, "rectComponent", js.undefined)
      
      inline def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      inline def setRxUndefined: Self = StObject.set(x, "rx", js.undefined)
      
      inline def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
      
      inline def setRyUndefined: Self = StObject.set(x, "ry", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
