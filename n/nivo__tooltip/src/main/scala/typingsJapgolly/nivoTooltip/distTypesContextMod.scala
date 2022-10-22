package typingsJapgolly.nivoTooltip

import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.nivoTooltip.distTypesTypesMod.TooltipAnchor
import typingsJapgolly.nivoTooltip.nivoTooltipBooleans.`false`
import typingsJapgolly.nivoTooltip.nivoTooltipBooleans.`true`
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesContextMod {
  
  @JSImport("@nivo/tooltip/dist/types/context", "TooltipActionsContext")
  @js.native
  val TooltipActionsContext: Context[TooltipActionsContextData] = js.native
  
  @JSImport("@nivo/tooltip/dist/types/context", "TooltipStateContext")
  @js.native
  val TooltipStateContext: Context[TooltipStateContextData] = js.native
  
  @JSImport("@nivo/tooltip/dist/types/context", "hiddenTooltipState")
  @js.native
  val hiddenTooltipState: TooltipStateContextDataHidden = js.native
  
  @js.native
  trait TooltipActionsContextData extends StObject {
    
    def hideTooltip(): Unit = js.native
    
    def showTooltipAt(content: Element, position: js.Tuple2[Double, Double]): Unit = js.native
    def showTooltipAt(content: Element, position: js.Tuple2[Double, Double], anchor: TooltipAnchor): Unit = js.native
    
    def showTooltipFromEvent(content: Element, event: ReactMouseEventFrom[org.scalajs.dom.Element]): Unit = js.native
    def showTooltipFromEvent(content: Element, event: ReactMouseEventFrom[org.scalajs.dom.Element], anchor: TooltipAnchor): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nivoTooltip.distTypesContextMod.TooltipStateContextDataVisible
    - typingsJapgolly.nivoTooltip.distTypesContextMod.TooltipStateContextDataHidden
  */
  trait TooltipStateContextData extends StObject
  object TooltipStateContextData {
    
    inline def TooltipStateContextDataHidden(anchor: Null, content: Null, position: js.Tuple2[Null, Null]): typingsJapgolly.nivoTooltip.distTypesContextMod.TooltipStateContextDataHidden = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], isVisible = false, position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.nivoTooltip.distTypesContextMod.TooltipStateContextDataHidden]
    }
    
    inline def TooltipStateContextDataVisible(anchor: TooltipAnchor, content: VdomElement, position: js.Tuple2[Double, Double]): typingsJapgolly.nivoTooltip.distTypesContextMod.TooltipStateContextDataVisible = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], content = content.rawElement.asInstanceOf[js.Any], isVisible = true, position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.nivoTooltip.distTypesContextMod.TooltipStateContextDataVisible]
    }
  }
  
  trait TooltipStateContextDataHidden
    extends StObject
       with TooltipStateContextData {
    
    var anchor: Null
    
    var content: Null
    
    var isVisible: `false`
    
    var position: js.Tuple2[Null, Null]
  }
  object TooltipStateContextDataHidden {
    
    inline def apply(anchor: Null, content: Null, position: js.Tuple2[Null, Null]): TooltipStateContextDataHidden = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], isVisible = false, position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipStateContextDataHidden]
    }
    
    extension [Self <: TooltipStateContextDataHidden](x: Self) {
      
      inline def setAnchor(value: Null): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setContent(value: Null): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setIsVisible(value: `false`): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: js.Tuple2[Null, Null]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  trait TooltipStateContextDataVisible
    extends StObject
       with TooltipStateContextData {
    
    var anchor: TooltipAnchor
    
    var content: Element
    
    var isVisible: `true`
    
    var position: js.Tuple2[Double, Double]
  }
  object TooltipStateContextDataVisible {
    
    inline def apply(anchor: TooltipAnchor, content: VdomElement, position: js.Tuple2[Double, Double]): TooltipStateContextDataVisible = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], content = content.rawElement.asInstanceOf[js.Any], isVisible = true, position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipStateContextDataVisible]
    }
    
    extension [Self <: TooltipStateContextDataVisible](x: Self) {
      
      inline def setAnchor(value: TooltipAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setContent(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setIsVisible(value: `true`): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
}
