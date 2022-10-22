package typingsJapgolly.materialUiCore.anon

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.materialUiCore.accordionSummaryAccordionSummaryMod.AccordionSummaryClassKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Props[P, D /* <: ElementType */] extends StObject {
  
  var classKey: AccordionSummaryClassKey
  
  var defaultComponent: D
  
  var props: P & ExpandIcon
}
object Props {
  
  inline def apply[P, D /* <: ElementType */](classKey: AccordionSummaryClassKey, defaultComponent: D, props: P & ExpandIcon): Props[P, D] = {
    val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[P, D]]
  }
  
  extension [Self <: Props[?, ?], P, D /* <: ElementType */](x: Self & (Props[P, D])) {
    
    inline def setClassKey(value: AccordionSummaryClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
    
    inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: P & ExpandIcon): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
