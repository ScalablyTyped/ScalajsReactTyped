package typingsJapgolly.victoryAxis.anon

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.victoryAxis.victoryAxisStrings.blue
import typingsJapgolly.victoryAxis.victoryAxisStrings.bottom
import typingsJapgolly.victoryAxis.victoryAxisStrings.cool
import typingsJapgolly.victoryAxis.victoryAxisStrings.grayscale
import typingsJapgolly.victoryAxis.victoryAxisStrings.green
import typingsJapgolly.victoryAxis.victoryAxisStrings.heatmap
import typingsJapgolly.victoryAxis.victoryAxisStrings.left
import typingsJapgolly.victoryAxis.victoryAxisStrings.linear
import typingsJapgolly.victoryAxis.victoryAxisStrings.log
import typingsJapgolly.victoryAxis.victoryAxisStrings.qualitative
import typingsJapgolly.victoryAxis.victoryAxisStrings.red
import typingsJapgolly.victoryAxis.victoryAxisStrings.right
import typingsJapgolly.victoryAxis.victoryAxisStrings.sqrt
import typingsJapgolly.victoryAxis.victoryAxisStrings.time
import typingsJapgolly.victoryAxis.victoryAxisStrings.top
import typingsJapgolly.victoryAxis.victoryAxisStrings.warm
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisLabelComponent extends StObject {
  
  var animate: Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.AnimatePropTypeInterface */ Any)
  
  var axisComponent: Element
  
  var axisLabelComponent: Element
  
  var axisValue: String | Double | js.Object | js.Date
  
  var colorScale: js.Array[String] | grayscale | qualitative | heatmap | warm | cool | red | green | blue
  
  var containerComponent: Element
  
  var crossAxis: Boolean
  
  var dependentAxis: Boolean
  
  var disableInlineStyles: Boolean
  
  var domain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.Tuple<number> */ Any) | `3`
  
  var domainPadding: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.Tuple<number> */ Any) | `3`
  
  var events: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryAxisTTargetType, string | number> */ Any
  ]
  
  var externalEventMutations: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventCallbackInterface<string | Array<string>, imported_victory-core.StringOrNumberOrList> */ Any
  ]
  
  var fixLabelOverlap: Boolean
  
  var gridComponent: Element
  
  var groupComponent: Element
  
  var height: Double
  
  var horizontal: Boolean
  
  var invertAxis: Boolean
  
  var label: String | (js.Function1[/* data */ Any, String | Double | Null])
  
  var labelComponent: Element
  
  var maxDomain: Double | `0`
  
  var minDomain: Double | `0`
  
  var name: String
  
  var offsetX: Double
  
  var offsetY: Double
  
  var orientation: left | bottom | right | top
  
  var origin: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.OriginType */ Any
  
  var padding: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.BlockProps */ Any)
  
  var polar: Boolean
  
  var range: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.RangeTuple */ Any) | `3`
  
  var scale: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.D3Scale<any> */ Any) | linear | time | log | sqrt | `1`
  
  var sharedEvents: Events
  
  var singleQuadrantDomainPadding: Boolean | `2`
  
  var standalone: Boolean
  
  var style: Grid
  
  var theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryThemeDefinition */ Any
  
  var tickComponent: Element
  
  var tickCount: Double
  
  var tickFormat: js.Array[Any] | (js.Function3[/* tick */ Any, /* index */ Double, /* ticks */ js.Array[Any], String | Double])
  
  var tickLabelComponent: Element
  
  var tickValues: js.Array[Any]
  
  var width: Double
}
object AxisLabelComponent {
  
  inline def apply(
    animate: Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.AnimatePropTypeInterface */ Any),
    axisComponent: VdomElement,
    axisLabelComponent: VdomElement,
    axisValue: String | Double | js.Object | js.Date,
    colorScale: js.Array[String] | grayscale | qualitative | heatmap | warm | cool | red | green | blue,
    containerComponent: VdomElement,
    crossAxis: Boolean,
    dependentAxis: Boolean,
    disableInlineStyles: Boolean,
    domain: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.Tuple<number> */ Any) | `3`,
    domainPadding: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.Tuple<number> */ Any) | `3`,
    events: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryAxisTTargetType, string | number> */ Any
    ],
    externalEventMutations: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventCallbackInterface<string | Array<string>, imported_victory-core.StringOrNumberOrList> */ Any
    ],
    fixLabelOverlap: Boolean,
    gridComponent: VdomElement,
    groupComponent: VdomElement,
    height: Double,
    horizontal: Boolean,
    invertAxis: Boolean,
    label: String | (js.Function1[/* data */ Any, String | Double | Null]),
    labelComponent: VdomElement,
    maxDomain: Double | `0`,
    minDomain: Double | `0`,
    name: String,
    offsetX: Double,
    offsetY: Double,
    orientation: left | bottom | right | top,
    origin: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.OriginType */ Any,
    padding: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.BlockProps */ Any),
    polar: Boolean,
    range: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.RangeTuple */ Any) | `3`,
    scale: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.D3Scale<any> */ Any) | linear | time | log | sqrt | `1`,
    sharedEvents: Events,
    singleQuadrantDomainPadding: Boolean | `2`,
    standalone: Boolean,
    style: Grid,
    theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryThemeDefinition */ Any,
    tickComponent: VdomElement,
    tickCount: Double,
    tickFormat: js.Array[Any] | (js.Function3[/* tick */ Any, /* index */ Double, /* ticks */ js.Array[Any], String | Double]),
    tickLabelComponent: VdomElement,
    tickValues: js.Array[Any],
    width: Double
  ): AxisLabelComponent = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], axisComponent = axisComponent.rawElement.asInstanceOf[js.Any], axisLabelComponent = axisLabelComponent.rawElement.asInstanceOf[js.Any], axisValue = axisValue.asInstanceOf[js.Any], colorScale = colorScale.asInstanceOf[js.Any], containerComponent = containerComponent.rawElement.asInstanceOf[js.Any], crossAxis = crossAxis.asInstanceOf[js.Any], dependentAxis = dependentAxis.asInstanceOf[js.Any], disableInlineStyles = disableInlineStyles.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], domainPadding = domainPadding.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], externalEventMutations = externalEventMutations.asInstanceOf[js.Any], fixLabelOverlap = fixLabelOverlap.asInstanceOf[js.Any], gridComponent = gridComponent.rawElement.asInstanceOf[js.Any], groupComponent = groupComponent.rawElement.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], invertAxis = invertAxis.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelComponent = labelComponent.rawElement.asInstanceOf[js.Any], maxDomain = maxDomain.asInstanceOf[js.Any], minDomain = minDomain.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], polar = polar.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], sharedEvents = sharedEvents.asInstanceOf[js.Any], singleQuadrantDomainPadding = singleQuadrantDomainPadding.asInstanceOf[js.Any], standalone = standalone.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tickComponent = tickComponent.rawElement.asInstanceOf[js.Any], tickCount = tickCount.asInstanceOf[js.Any], tickFormat = tickFormat.asInstanceOf[js.Any], tickLabelComponent = tickLabelComponent.rawElement.asInstanceOf[js.Any], tickValues = tickValues.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisLabelComponent]
  }
  
  extension [Self <: AxisLabelComponent](x: Self) {
    
    inline def setAnimate(
      value: Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.AnimatePropTypeInterface */ Any)
    ): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAxisComponent(value: VdomElement): Self = StObject.set(x, "axisComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setAxisLabelComponent(value: VdomElement): Self = StObject.set(x, "axisLabelComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setAxisValue(value: String | Double | js.Object | js.Date): Self = StObject.set(x, "axisValue", value.asInstanceOf[js.Any])
    
    inline def setColorScale(value: js.Array[String] | grayscale | qualitative | heatmap | warm | cool | red | green | blue): Self = StObject.set(x, "colorScale", value.asInstanceOf[js.Any])
    
    inline def setColorScaleVarargs(value: String*): Self = StObject.set(x, "colorScale", js.Array(value*))
    
    inline def setContainerComponent(value: VdomElement): Self = StObject.set(x, "containerComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setCrossAxis(value: Boolean): Self = StObject.set(x, "crossAxis", value.asInstanceOf[js.Any])
    
    inline def setDependentAxis(value: Boolean): Self = StObject.set(x, "dependentAxis", value.asInstanceOf[js.Any])
    
    inline def setDisableInlineStyles(value: Boolean): Self = StObject.set(x, "disableInlineStyles", value.asInstanceOf[js.Any])
    
    inline def setDomain(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.Tuple<number> */ Any) | `3`
    ): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainPadding(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.Tuple<number> */ Any) | `3`
    ): Self = StObject.set(x, "domainPadding", value.asInstanceOf[js.Any])
    
    inline def setEvents(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryAxisTTargetType, string | number> */ Any
        ]
    ): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryAxisTTargetType, string | number> */ Any)*
    ): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setExternalEventMutations(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventCallbackInterface<string | Array<string>, imported_victory-core.StringOrNumberOrList> */ Any
        ]
    ): Self = StObject.set(x, "externalEventMutations", value.asInstanceOf[js.Any])
    
    inline def setExternalEventMutationsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.EventCallbackInterface<string | Array<string>, imported_victory-core.StringOrNumberOrList> */ Any)*
    ): Self = StObject.set(x, "externalEventMutations", js.Array(value*))
    
    inline def setFixLabelOverlap(value: Boolean): Self = StObject.set(x, "fixLabelOverlap", value.asInstanceOf[js.Any])
    
    inline def setGridComponent(value: VdomElement): Self = StObject.set(x, "gridComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setGroupComponent(value: VdomElement): Self = StObject.set(x, "groupComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setInvertAxis(value: Boolean): Self = StObject.set(x, "invertAxis", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String | (js.Function1[/* data */ Any, String | Double | Null])): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelComponent(value: VdomElement): Self = StObject.set(x, "labelComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setLabelFunction1(value: /* data */ Any => String | Double | Null): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
    
    inline def setMaxDomain(value: Double | `0`): Self = StObject.set(x, "maxDomain", value.asInstanceOf[js.Any])
    
    inline def setMinDomain(value: Double | `0`): Self = StObject.set(x, "minDomain", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: left | bottom | right | top): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrigin(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.OriginType */ Any
    ): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setPadding(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.BlockProps */ Any)
    ): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPolar(value: Boolean): Self = StObject.set(x, "polar", value.asInstanceOf[js.Any])
    
    inline def setRange(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.RangeTuple */ Any) | `3`
    ): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setScale(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.D3Scale<any> */ Any) | linear | time | log | sqrt | `1`
    ): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setSharedEvents(value: Events): Self = StObject.set(x, "sharedEvents", value.asInstanceOf[js.Any])
    
    inline def setSingleQuadrantDomainPadding(value: Boolean | `2`): Self = StObject.set(x, "singleQuadrantDomainPadding", value.asInstanceOf[js.Any])
    
    inline def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Grid): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setTheme(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_victory-core.VictoryThemeDefinition */ Any
    ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setTickComponent(value: VdomElement): Self = StObject.set(x, "tickComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setTickCount(value: Double): Self = StObject.set(x, "tickCount", value.asInstanceOf[js.Any])
    
    inline def setTickFormat(
      value: js.Array[Any] | (js.Function3[/* tick */ Any, /* index */ Double, /* ticks */ js.Array[Any], String | Double])
    ): Self = StObject.set(x, "tickFormat", value.asInstanceOf[js.Any])
    
    inline def setTickFormatFunction3(value: (/* tick */ Any, /* index */ Double, /* ticks */ js.Array[Any]) => String | Double): Self = StObject.set(x, "tickFormat", js.Any.fromFunction3(value))
    
    inline def setTickFormatVarargs(value: Any*): Self = StObject.set(x, "tickFormat", js.Array(value*))
    
    inline def setTickLabelComponent(value: VdomElement): Self = StObject.set(x, "tickLabelComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def setTickValues(value: js.Array[Any]): Self = StObject.set(x, "tickValues", value.asInstanceOf[js.Any])
    
    inline def setTickValuesVarargs(value: Any*): Self = StObject.set(x, "tickValues", js.Array(value*))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
