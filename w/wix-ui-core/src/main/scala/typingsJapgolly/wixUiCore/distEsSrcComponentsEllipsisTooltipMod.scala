package typingsJapgolly.wixUiCore

import typingsJapgolly.wixUiCore.anon.ShowTooltip
import typingsJapgolly.wixUiCore.distEsSrcComponentsEllipsisTooltipEllipsisTooltipMod.EllipsisTooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsEllipsisTooltipMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/ellipsis-tooltip", "EllipsisTooltip")
  @js.native
  open class EllipsisTooltip protected ()
    extends typingsJapgolly.wixUiCore.distEsSrcComponentsEllipsisTooltipEllipsisTooltipMod.EllipsisTooltip {
    def this(props: EllipsisTooltipProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: EllipsisTooltipProps, context: Any) = this()
  }
  /* static members */
  object EllipsisTooltip {
    
    @JSImport("wix-ui-core/dist/es/src/components/ellipsis-tooltip", "EllipsisTooltip")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/es/src/components/ellipsis-tooltip", "EllipsisTooltip.defaultProps")
    @js.native
    def defaultProps: ShowTooltip = js.native
    inline def defaultProps_=(x: ShowTooltip): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
