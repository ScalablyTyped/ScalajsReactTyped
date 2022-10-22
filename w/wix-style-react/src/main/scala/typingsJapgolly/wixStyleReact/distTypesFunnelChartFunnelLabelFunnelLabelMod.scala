package typingsJapgolly.wixStyleReact

import typingsJapgolly.propTypes.mod.Requireable
import typingsJapgolly.propTypes.mod.Validator
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wixStyleReact.anon.DisplayValueLabel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFunnelChartFunnelLabelFunnelLabelMod {
  
  object FunnelLabel {
    
    inline def apply(hasValueLabelDisplayValue: DisplayValueLabel): Element = ^.asInstanceOf[js.Dynamic].apply(hasValueLabelDisplayValue.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/FunnelChart/FunnelLabel/FunnelLabel", "FunnelLabel")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/FunnelChart/FunnelLabel/FunnelLabel", "FunnelLabel.propTypes.displayValue")
      @js.native
      val displayValue: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/FunnelChart/FunnelLabel/FunnelLabel", "FunnelLabel.propTypes.label")
      @js.native
      val label: Validator[String] = js.native
      
      @JSImport("wix-style-react/dist/types/FunnelChart/FunnelLabel/FunnelLabel", "FunnelLabel.propTypes.value")
      @js.native
      val value: Requireable[Double] = js.native
    }
  }
}
