package typingsJapgolly.antvG2

import typingsJapgolly.antvG2.libChartViewMod.View
import typingsJapgolly.antvG2.libInterfaceMod.LooseObject
import typingsJapgolly.antvG2.libInterfaceMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionActionComponentTooltipGeometryMod {
  
  /**
    * Tooltip 展示隐藏的 Action
    * @ignore
    */
  @JSImport("@antv/g2/lib/interaction/action/component/tooltip/geometry", JSImport.Default)
  @js.native
  open class default () extends TooltipAction
  
  /**
    * Tooltip 展示隐藏的 Action
    * @ignore
    */
  @js.native
  trait TooltipAction
    extends typingsJapgolly.antvG2.libInteractionActionBaseMod.default[LooseObject] {
    
    /**
      * 隐藏 Tooltip。
      * @returns
      */
    def hide(): Unit = js.native
    
    /* protected */ def hideTooltip(view: Any): Unit = js.native
    
    /* private */ var location: Any = js.native
    
    /**
      * 显示 Tooltip
      * @returns
      */
    def show(): Unit = js.native
    
    /* protected */ def showTooltip(view: View, point: Point): Unit = js.native
    
    /* private */ var timeStamp: Any = js.native
  }
}
