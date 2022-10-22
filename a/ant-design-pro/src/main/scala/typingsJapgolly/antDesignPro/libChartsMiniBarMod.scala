package typingsJapgolly.antDesignPro

import typingsJapgolly.antDesignPro.anon.Y
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libChartsMiniBarMod {
  
  @JSImport("ant-design-pro/lib/Charts/MiniBar", JSImport.Default)
  @js.native
  open class default () extends Component[IMiniBarProps, Any, Any]
  
  trait IMiniBarProps extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var data: js.Array[Y]
    
    var height: Double
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object IMiniBarProps {
    
    inline def apply(data: js.Array[Y], height: Double): IMiniBarProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMiniBarProps]
    }
    
    extension [Self <: IMiniBarProps](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setData(value: js.Array[Y]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Y*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type MiniBar = japgolly.scalajs.react.facade.React.Component[IMiniBarProps & js.Object, js.Object]
}
