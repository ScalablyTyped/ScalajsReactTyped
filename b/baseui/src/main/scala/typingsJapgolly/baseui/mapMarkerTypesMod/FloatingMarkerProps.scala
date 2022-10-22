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

trait FloatingMarkerProps extends StObject {
  
  var anchor: js.UndefOr[AnchorPositions] = js.undefined
  
  var anchorType: js.UndefOr[FloatingMarkerAnchorType] = js.undefined
  
  var endEnhancer: js.UndefOr[ComponentType[SizeNumber]] = js.undefined
  
  var label: js.UndefOr[Node] = js.undefined
  
  var overrides: js.UndefOr[FloatingMarkerOverrides] = js.undefined
  
  var size: js.UndefOr[FloatingMarkerSize] = js.undefined
  
  var startEnhancer: js.UndefOr[ComponentType[SizeNumber]] = js.undefined
}
object FloatingMarkerProps {
  
  inline def apply(): FloatingMarkerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloatingMarkerProps]
  }
  
  extension [Self <: FloatingMarkerProps](x: Self) {
    
    inline def setAnchor(value: AnchorPositions): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorType(value: FloatingMarkerAnchorType): Self = StObject.set(x, "anchorType", value.asInstanceOf[js.Any])
    
    inline def setAnchorTypeUndefined: Self = StObject.set(x, "anchorType", js.undefined)
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setEndEnhancer(value: ComponentType[SizeNumber]): Self = StObject.set(x, "endEnhancer", value.asInstanceOf[js.Any])
    
    inline def setEndEnhancerUndefined: Self = StObject.set(x, "endEnhancer", js.undefined)
    
    inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
    
    inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
    
    inline def setOverrides(value: FloatingMarkerOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setSize(value: FloatingMarkerSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStartEnhancer(value: ComponentType[SizeNumber]): Self = StObject.set(x, "startEnhancer", value.asInstanceOf[js.Any])
    
    inline def setStartEnhancerUndefined: Self = StObject.set(x, "startEnhancer", js.undefined)
  }
}
