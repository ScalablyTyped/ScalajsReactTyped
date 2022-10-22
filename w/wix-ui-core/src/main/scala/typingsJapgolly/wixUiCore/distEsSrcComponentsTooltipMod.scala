package typingsJapgolly.wixUiCore

import typingsJapgolly.wixUiCore.anon.PartialTooltipPropsAppendTo
import typingsJapgolly.wixUiCore.distEsSrcComponentsTooltipTooltipMod.TooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsTooltipMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/tooltip", "Tooltip")
  @js.native
  open class Tooltip protected ()
    extends typingsJapgolly.wixUiCore.distEsSrcComponentsTooltipTooltipMod.Tooltip {
    def this(props: TooltipProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TooltipProps, context: Any) = this()
  }
  /* static members */
  object Tooltip {
    
    @JSImport("wix-ui-core/dist/es/src/components/tooltip", "Tooltip")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/es/src/components/tooltip", "Tooltip.defaultProps")
    @js.native
    def defaultProps: PartialTooltipPropsAppendTo = js.native
    inline def defaultProps_=(x: PartialTooltipPropsAppendTo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/es/src/components/tooltip", "Tooltip.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
