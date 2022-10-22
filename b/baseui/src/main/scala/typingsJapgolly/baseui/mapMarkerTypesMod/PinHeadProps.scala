package typingsJapgolly.baseui.mapMarkerTypesMod

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.baseui.anon.SizeNumber
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PinHeadProps
  extends StObject
     with BadgeEnhancer
     with LabelEnhancer {
  
  var anchorType: js.UndefOr[FloatingMarkerAnchorType] = js.undefined
  
  var background: String
  
  var color: String
  
  var endEnhancer: js.UndefOr[ComponentType[SizeNumber]] = js.undefined
  
  var label: js.UndefOr[Node] = js.undefined
  
  var needle: js.UndefOr[NeedleSize] = js.undefined
  
  var overrides: js.UndefOr[FloatingMarkerOverrides | FixedMarkerOverrides] = js.undefined
  
  var size: js.UndefOr[PinHeadSize] = js.undefined
  
  var startEnhancer: js.UndefOr[ComponentType[SizeNumber]] = js.undefined
  
  var `type`: js.UndefOr[PinHead] = js.undefined
}
object PinHeadProps {
  
  inline def apply(background: String, color: String): PinHeadProps = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinHeadProps]
  }
  
  extension [Self <: PinHeadProps](x: Self) {
    
    inline def setAnchorType(value: FloatingMarkerAnchorType): Self = StObject.set(x, "anchorType", value.asInstanceOf[js.Any])
    
    inline def setAnchorTypeUndefined: Self = StObject.set(x, "anchorType", js.undefined)
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setEndEnhancer(value: ComponentType[SizeNumber]): Self = StObject.set(x, "endEnhancer", value.asInstanceOf[js.Any])
    
    inline def setEndEnhancerUndefined: Self = StObject.set(x, "endEnhancer", js.undefined)
    
    inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
    
    inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
    
    inline def setNeedle(value: NeedleSize): Self = StObject.set(x, "needle", value.asInstanceOf[js.Any])
    
    inline def setNeedleUndefined: Self = StObject.set(x, "needle", js.undefined)
    
    inline def setOverrides(value: FloatingMarkerOverrides | FixedMarkerOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setSize(value: PinHeadSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStartEnhancer(value: ComponentType[SizeNumber]): Self = StObject.set(x, "startEnhancer", value.asInstanceOf[js.Any])
    
    inline def setStartEnhancerUndefined: Self = StObject.set(x, "startEnhancer", js.undefined)
    
    inline def setType(value: PinHead): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
