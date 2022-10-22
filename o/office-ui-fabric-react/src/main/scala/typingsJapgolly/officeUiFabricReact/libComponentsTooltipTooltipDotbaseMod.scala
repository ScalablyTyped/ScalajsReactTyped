package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.anon.PartialITooltipProps
import typingsJapgolly.officeUiFabricReact.libComponentsTooltipTooltipDottypesMod.ITooltipProps
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsTooltipTooltipDotbaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Tooltip/Tooltip.base", "TooltipBase")
  @js.native
  open class TooltipBase protected () extends Component[ITooltipProps, Any, Any] {
    def this(props: ITooltipProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ITooltipProps, context: Any) = this()
    
    /* private */ var _classNames: Any = js.native
    
    /* private */ var _onRenderContent: Any = js.native
  }
  /* static members */
  object TooltipBase {
    
    @JSImport("office-ui-fabric-react/lib/components/Tooltip/Tooltip.base", "TooltipBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Tooltip/Tooltip.base", "TooltipBase.defaultProps")
    @js.native
    def defaultProps: PartialITooltipProps = js.native
    inline def defaultProps_=(x: PartialITooltipProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
