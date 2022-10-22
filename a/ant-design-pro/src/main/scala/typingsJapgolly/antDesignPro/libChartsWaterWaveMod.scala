package typingsJapgolly.antDesignPro

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libChartsWaterWaveMod {
  
  @JSImport("ant-design-pro/lib/Charts/WaterWave", JSImport.Default)
  @js.native
  open class default () extends Component[IWaterWaveProps, Any, Any]
  
  trait IWaterWaveProps extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var height: Double
    
    var percent: Double
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var title: Node
  }
  object IWaterWaveProps {
    
    inline def apply(height: Double, percent: Double): IWaterWaveProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], title = null)
      __obj.asInstanceOf[IWaterWaveProps]
    }
    
    extension [Self <: IWaterWaveProps](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  type WaterWave = japgolly.scalajs.react.facade.React.Component[IWaterWaveProps & js.Object, js.Object]
}
