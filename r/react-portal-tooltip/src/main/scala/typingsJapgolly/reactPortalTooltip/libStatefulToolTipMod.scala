package typingsJapgolly.reactPortalTooltip

import japgolly.scalajs.react.facade.React.RefHandle
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactPortalTooltip.libToolTipMod.TooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStatefulToolTipMod {
  
  @JSImport("react-portal-tooltip/lib/StatefulToolTip", JSImport.Default)
  @js.native
  open class default ()
    extends Component[StatefulToolTipProps, js.Object, Any]
  
  type StatefulToolTip = japgolly.scalajs.react.facade.React.Component[StatefulToolTipProps & js.Object, js.Object]
  
  trait StatefulToolTipProps
    extends StObject
       with TooltipProps {
    
    var className: js.UndefOr[String] = js.undefined
  }
  object StatefulToolTipProps {
    
    inline def apply(parent: String | Element | RefHandle[Any]): StatefulToolTipProps = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatefulToolTipProps]
    }
    
    extension [Self <: StatefulToolTipProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
}
