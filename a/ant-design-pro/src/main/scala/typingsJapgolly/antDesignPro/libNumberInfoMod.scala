package typingsJapgolly.antDesignPro

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.antDesignPro.antDesignProStrings.down
import typingsJapgolly.antDesignPro.antDesignProStrings.up
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNumberInfoMod {
  
  @JSImport("ant-design-pro/lib/NumberInfo", JSImport.Default)
  @js.native
  open class default () extends Component[NumberInfoProps, Any, Any]
  
  type NumberInfo = japgolly.scalajs.react.facade.React.Component[NumberInfoProps & js.Object, js.Object]
  
  trait NumberInfoProps extends StObject {
    
    var gap: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[up | down] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var subTitle: js.UndefOr[Node | String] = js.undefined
    
    var subTotal: js.UndefOr[Double] = js.undefined
    
    var suffix: js.UndefOr[String] = js.undefined
    
    var theme: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[Node | String] = js.undefined
    
    var total: js.UndefOr[Node | String] = js.undefined
  }
  object NumberInfoProps {
    
    inline def apply(): NumberInfoProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberInfoProps]
    }
    
    extension [Self <: NumberInfoProps](x: Self) {
      
      inline def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      inline def setStatus(value: up | down): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSubTitle(value: Node | String): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
      
      inline def setSubTitleNull: Self = StObject.set(x, "subTitle", null)
      
      inline def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
      
      inline def setSubTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "subTitle", js.Array(value*))
      
      inline def setSubTitleVdomElement(value: VdomElement): Self = StObject.set(x, "subTitle", value.rawElement.asInstanceOf[js.Any])
      
      inline def setSubTotal(value: Double): Self = StObject.set(x, "subTotal", value.asInstanceOf[js.Any])
      
      inline def setSubTotalUndefined: Self = StObject.set(x, "subTotal", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTitle(value: Node | String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTotal(value: Node | String): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalNull: Self = StObject.set(x, "total", null)
      
      inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
      
      inline def setTotalVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "total", js.Array(value*))
      
      inline def setTotalVdomElement(value: VdomElement): Self = StObject.set(x, "total", value.rawElement.asInstanceOf[js.Any])
    }
  }
}
