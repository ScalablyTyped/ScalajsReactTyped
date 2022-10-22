package typingsJapgolly.popperjsCore.libTypesMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.popperjsCore.anon.Arrow
import typingsJapgolly.popperjsCore.anon.Dictkey
import typingsJapgolly.popperjsCore.anon.PartialCSSStyleDeclaratio
import typingsJapgolly.popperjsCore.anon.Popper
import typingsJapgolly.popperjsCore.libEnumsMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait State extends StObject {
  
  var attributes: StringDictionary[StringDictionary[String | Boolean]]
  
  var elements: Arrow
  
  var modifiersData: Dictkey
  
  var options: OptionsGeneric[Any]
  
  var orderedModifiers: js.Array[Modifier[Any, Any]]
  
  var placement: Placement
  
  var rects: StateRects
  
  var reset: Boolean
  
  var scrollParents: Popper
  
  var strategy: PositioningStrategy
  
  var styles: StringDictionary[PartialCSSStyleDeclaratio]
}
object State {
  
  inline def apply(
    attributes: StringDictionary[StringDictionary[String | Boolean]],
    elements: Arrow,
    modifiersData: Dictkey,
    options: OptionsGeneric[Any],
    orderedModifiers: js.Array[Modifier[Any, Any]],
    placement: Placement,
    rects: StateRects,
    reset: Boolean,
    scrollParents: Popper,
    strategy: PositioningStrategy,
    styles: StringDictionary[PartialCSSStyleDeclaratio]
  ): State = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any], modifiersData = modifiersData.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], orderedModifiers = orderedModifiers.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], rects = rects.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], scrollParents = scrollParents.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  extension [Self <: State](x: Self) {
    
    inline def setAttributes(value: StringDictionary[StringDictionary[String | Boolean]]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setElements(value: Arrow): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setModifiersData(value: Dictkey): Self = StObject.set(x, "modifiersData", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: OptionsGeneric[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOrderedModifiers(value: js.Array[Modifier[Any, Any]]): Self = StObject.set(x, "orderedModifiers", value.asInstanceOf[js.Any])
    
    inline def setOrderedModifiersVarargs(value: (Modifier[Any, Any])*): Self = StObject.set(x, "orderedModifiers", js.Array(value*))
    
    inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setRects(value: StateRects): Self = StObject.set(x, "rects", value.asInstanceOf[js.Any])
    
    inline def setReset(value: Boolean): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    inline def setScrollParents(value: Popper): Self = StObject.set(x, "scrollParents", value.asInstanceOf[js.Any])
    
    inline def setStrategy(value: PositioningStrategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    inline def setStyles(value: StringDictionary[PartialCSSStyleDeclaratio]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
  }
}
