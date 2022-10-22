package typingsJapgolly.victoryAxis.anon

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisComponent extends StObject {
  
  var axisComponent: Element
  
  var axisLabelComponent: Element
  
  var containerComponent: Element
  
  var fixLabelOverlap: Boolean
  
  var gridComponent: Element
  
  var groupComponent: Element
  
  var standalone: Boolean
  
  var theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryThemeDefinition */ Any
  
  var tickComponent: Element
  
  var tickLabelComponent: Element
}
object AxisComponent {
  
  inline def apply(
    axisComponent: VdomElement,
    axisLabelComponent: VdomElement,
    containerComponent: VdomElement,
    fixLabelOverlap: Boolean,
    gridComponent: VdomElement,
    groupComponent: VdomElement,
    standalone: Boolean,
    theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryThemeDefinition */ Any,
    tickComponent: VdomElement,
    tickLabelComponent: VdomElement
  ): AxisComponent = {
    val __obj = js.Dynamic.literal(axisComponent = axisComponent.rawElement.asInstanceOf[js.Any], axisLabelComponent = axisLabelComponent.rawElement.asInstanceOf[js.Any], containerComponent = containerComponent.rawElement.asInstanceOf[js.Any], fixLabelOverlap = fixLabelOverlap.asInstanceOf[js.Any], gridComponent = gridComponent.rawElement.asInstanceOf[js.Any], groupComponent = groupComponent.rawElement.asInstanceOf[js.Any], standalone = standalone.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tickComponent = tickComponent.rawElement.asInstanceOf[js.Any], tickLabelComponent = tickLabelComponent.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisComponent]
  }
  
  extension [Self <: AxisComponent](x: Self) {
    
    inline def setAxisComponent(value: VdomElement): Self = StObject.set(x, "axisComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setAxisLabelComponent(value: VdomElement): Self = StObject.set(x, "axisLabelComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setContainerComponent(value: VdomElement): Self = StObject.set(x, "containerComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setFixLabelOverlap(value: Boolean): Self = StObject.set(x, "fixLabelOverlap", value.asInstanceOf[js.Any])
    
    inline def setGridComponent(value: VdomElement): Self = StObject.set(x, "gridComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setGroupComponent(value: VdomElement): Self = StObject.set(x, "groupComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
    
    inline def setTheme(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryThemeDefinition */ Any
    ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setTickComponent(value: VdomElement): Self = StObject.set(x, "tickComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setTickLabelComponent(value: VdomElement): Self = StObject.set(x, "tickLabelComponent", value.rawElement.asInstanceOf[js.Any])
  }
}
