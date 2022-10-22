package typingsJapgolly.materialUiCore.anon

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.materialUiCore.expansionPanelSummaryExpansionPanelSummaryMod.ExpansionPanelSummaryClassKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultComponentD[P, D /* <: ElementType */] extends StObject {
  
  var classKey: ExpansionPanelSummaryClassKey
  
  var defaultComponent: D
  
  var props: P & ExpandIcon
}
object DefaultComponentD {
  
  inline def apply[P, D /* <: ElementType */](classKey: ExpansionPanelSummaryClassKey, defaultComponent: D, props: P & ExpandIcon): DefaultComponentD[P, D] = {
    val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultComponentD[P, D]]
  }
  
  extension [Self <: DefaultComponentD[?, ?], P, D /* <: ElementType */](x: Self & (DefaultComponentD[P, D])) {
    
    inline def setClassKey(value: ExpansionPanelSummaryClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
    
    inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
    
    inline def setProps(value: P & ExpandIcon): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
