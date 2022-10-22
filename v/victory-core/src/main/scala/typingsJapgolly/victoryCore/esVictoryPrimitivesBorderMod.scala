package typingsJapgolly.victoryCore

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.victoryCore.anon.ClassName
import typingsJapgolly.victoryCore.anon.RectComponent
import typingsJapgolly.victoryCore.esVictoryUtilCommonPropsMod.VictoryCommonPrimitiveProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esVictoryPrimitivesBorderMod {
  
  object Border {
    
    inline def apply(props: BorderProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("victory-core/es/victory-primitives/border", "Border")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("victory-core/es/victory-primitives/border", "Border.defaultProps")
    @js.native
    def defaultProps: RectComponent = js.native
    inline def defaultProps_=(x: RectComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/es/victory-primitives/border", "Border.propTypes")
    @js.native
    def propTypes: ClassName = js.native
    inline def propTypes_=(x: ClassName): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait BorderProps
    extends StObject
       with VictoryCommonPrimitiveProps {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var rectComponent: js.UndefOr[Element] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object BorderProps {
    
    inline def apply(): BorderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BorderProps]
    }
    
    extension [Self <: BorderProps](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setRectComponent(value: VdomElement): Self = StObject.set(x, "rectComponent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRectComponentUndefined: Self = StObject.set(x, "rectComponent", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
