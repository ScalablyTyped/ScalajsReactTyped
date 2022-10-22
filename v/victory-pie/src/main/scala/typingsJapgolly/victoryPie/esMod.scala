package typingsJapgolly.victoryPie

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.victoryPie.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMod {
  
  @JSImport("victory-pie/es", "Slice")
  @js.native
  open class Slice protected () extends Component[SliceProps, Any, Any] {
    def this(props: SliceProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SliceProps, context: Any) = this()
  }
  
  @JSImport("victory-pie/es", "VictoryPie")
  @js.native
  open class VictoryPie protected () extends Component[VictoryPieProps, Any, Any] {
    def this(props: VictoryPieProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: VictoryPieProps, context: Any) = this()
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryCommonProps * / any */ trait SliceProps extends StObject {
    
    var ariaLabel: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrCallback */ Any
      ] = js.undefined
    
    var cornerRadius: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SliceNumberOrCallback<SliceProps, 'cornerRadius'> */ Any
      ] = js.undefined
    
    var datum: js.UndefOr[Any] = js.undefined
    
    var innerRadius: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
      ] = js.undefined
    
    var padAngle: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SliceNumberOrCallback<SliceProps, 'padAngle'> */ Any
      ] = js.undefined
    
    var pathComponent: js.UndefOr[Element] = js.undefined
    
    var pathFunction: js.UndefOr[js.Function1[/* props */ this.type, String]] = js.undefined
    
    var radius: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SliceNumberOrCallback<SliceProps, 'radius'> */ Any
      ] = js.undefined
    
    var slice: js.UndefOr[Data] = js.undefined
    
    var sliceEndAngle: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SliceNumberOrCallback<SliceProps, 'sliceEndAngle'> */ Any
      ] = js.undefined
    
    var sliceStartAngle: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SliceNumberOrCallback<SliceProps, 'sliceStartAngle'> */ Any
      ] = js.undefined
    
    var style: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleInterface */ Any
      ] = js.undefined
    
    var tabIndex: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
      ] = js.undefined
  }
  object SliceProps {
    
    inline def apply(): SliceProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliceProps]
    }
    
    extension [Self <: SliceProps](x: Self) {
      
      inline def setAriaLabel(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrCallback */ Any
      ): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setCornerRadius(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SliceNumberOrCallback<SliceProps, 'cornerRadius'> */ Any
      ): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
      
      inline def setDatum(value: Any): Self = StObject.set(x, "datum", value.asInstanceOf[js.Any])
      
      inline def setDatumUndefined: Self = StObject.set(x, "datum", js.undefined)
      
      inline def setInnerRadius(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
      ): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
      
      inline def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
      
      inline def setPadAngle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SliceNumberOrCallback<SliceProps, 'padAngle'> */ Any
      ): Self = StObject.set(x, "padAngle", value.asInstanceOf[js.Any])
      
      inline def setPadAngleUndefined: Self = StObject.set(x, "padAngle", js.undefined)
      
      inline def setPathComponent(value: VdomElement): Self = StObject.set(x, "pathComponent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPathComponentUndefined: Self = StObject.set(x, "pathComponent", js.undefined)
      
      inline def setPathFunction(value: SliceProps => String): Self = StObject.set(x, "pathFunction", js.Any.fromFunction1(value))
      
      inline def setPathFunctionUndefined: Self = StObject.set(x, "pathFunction", js.undefined)
      
      inline def setRadius(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SliceNumberOrCallback<SliceProps, 'radius'> */ Any
      ): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setSlice(value: Data): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
      
      inline def setSliceEndAngle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SliceNumberOrCallback<SliceProps, 'sliceEndAngle'> */ Any
      ): Self = StObject.set(x, "sliceEndAngle", value.asInstanceOf[js.Any])
      
      inline def setSliceEndAngleUndefined: Self = StObject.set(x, "sliceEndAngle", js.undefined)
      
      inline def setSliceStartAngle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SliceNumberOrCallback<SliceProps, 'sliceStartAngle'> */ Any
      ): Self = StObject.set(x, "sliceStartAngle", value.asInstanceOf[js.Any])
      
      inline def setSliceStartAngleUndefined: Self = StObject.set(x, "sliceStartAngle", js.undefined)
      
      inline def setSliceUndefined: Self = StObject.set(x, "slice", js.undefined)
      
      inline def setStyle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleInterface */ Any
      ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabIndex(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
      ): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryCommonProps * / any, 'polar'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryCommonProps * / any[P]}
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryLabelableProps * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryMultiLabelableProps * / any */ trait VictoryPieProps extends StObject {
    
    var categories: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CategoryPropType */ Any
      ] = js.undefined
    
    var colorScale: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColorScalePropType */ Any
      ] = js.undefined
    
    var cornerRadius: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SliceNumberOrCallback<SliceProps, 'cornerRadius'> */ Any
      ] = js.undefined
    
    var data: js.UndefOr[js.Array[Any]] = js.undefined
    
    var dataComponent: js.UndefOr[Element] = js.undefined
    
    var endAngle: js.UndefOr[Double] = js.undefined
    
    var eventKey: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any
      ] = js.undefined
    
    var events: js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictorySliceTTargetType, StringOrNumberOrCallback | Array<string> | Array<number>> */ Any
        ]
      ] = js.undefined
    
    var innerRadius: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
      ] = js.undefined
    
    var labelPlacement: js.UndefOr[
        VictorySliceLabelPlacementType | (js.Function1[/* props */ SliceProps, VictorySliceLabelPlacementType])
      ] = js.undefined
    
    var labelPosition: js.UndefOr[
        VictorySliceLabelPositionType | (js.Function1[/* props */ SliceProps, VictorySliceLabelPositionType])
      ] = js.undefined
    
    var labelRadius: js.UndefOr[Double | (js.Function1[/* props */ SliceProps, Double])] = js.undefined
    
    var origin: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OriginType */ Any
      ] = js.undefined
    
    var padAngle: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
      ] = js.undefined
    
    var radius: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
      ] = js.undefined
    
    var startAngle: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleInterface */ Any
      ] = js.undefined
    
    var x: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataGetterPropType */ Any
      ] = js.undefined
    
    var y: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataGetterPropType */ Any
      ] = js.undefined
  }
  object VictoryPieProps {
    
    inline def apply(): VictoryPieProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryPieProps]
    }
    
    extension [Self <: VictoryPieProps](x: Self) {
      
      inline def setCategories(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CategoryPropType */ Any
      ): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
      
      inline def setColorScale(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColorScalePropType */ Any
      ): Self = StObject.set(x, "colorScale", value.asInstanceOf[js.Any])
      
      inline def setColorScaleUndefined: Self = StObject.set(x, "colorScale", js.undefined)
      
      inline def setCornerRadius(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SliceNumberOrCallback<SliceProps, 'cornerRadius'> */ Any
      ): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
      
      inline def setData(value: js.Array[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataComponent(value: VdomElement): Self = StObject.set(x, "dataComponent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDataComponentUndefined: Self = StObject.set(x, "dataComponent", js.undefined)
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: Any*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      inline def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
      
      inline def setEventKey(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any
      ): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      inline def setEvents(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictorySliceTTargetType, StringOrNumberOrCallback | Array<string> | Array<number>> */ Any
            ]
      ): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setEventsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictorySliceTTargetType, StringOrNumberOrCallback | Array<string> | Array<number>> */ Any)*
      ): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setInnerRadius(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
      ): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
      
      inline def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
      
      inline def setLabelPlacement(
        value: VictorySliceLabelPlacementType | (js.Function1[/* props */ SliceProps, VictorySliceLabelPlacementType])
      ): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
      
      inline def setLabelPlacementFunction1(value: /* props */ SliceProps => VictorySliceLabelPlacementType): Self = StObject.set(x, "labelPlacement", js.Any.fromFunction1(value))
      
      inline def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
      
      inline def setLabelPosition(
        value: VictorySliceLabelPositionType | (js.Function1[/* props */ SliceProps, VictorySliceLabelPositionType])
      ): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      inline def setLabelPositionFunction1(value: /* props */ SliceProps => VictorySliceLabelPositionType): Self = StObject.set(x, "labelPosition", js.Any.fromFunction1(value))
      
      inline def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      inline def setLabelRadius(value: Double | (js.Function1[/* props */ SliceProps, Double])): Self = StObject.set(x, "labelRadius", value.asInstanceOf[js.Any])
      
      inline def setLabelRadiusFunction1(value: /* props */ SliceProps => Double): Self = StObject.set(x, "labelRadius", js.Any.fromFunction1(value))
      
      inline def setLabelRadiusUndefined: Self = StObject.set(x, "labelRadius", js.undefined)
      
      inline def setOrigin(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OriginType */ Any
      ): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setPadAngle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
      ): Self = StObject.set(x, "padAngle", value.asInstanceOf[js.Any])
      
      inline def setPadAngleUndefined: Self = StObject.set(x, "padAngle", js.undefined)
      
      inline def setRadius(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
      ): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
      
      inline def setStyle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleInterface */ Any
      ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setX(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataGetterPropType */ Any
      ): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataGetterPropType */ Any
      ): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.victoryPie.victoryPieStrings.vertical
    - typingsJapgolly.victoryPie.victoryPieStrings.parallel
    - typingsJapgolly.victoryPie.victoryPieStrings.perpendicular
  */
  trait VictorySliceLabelPlacementType extends StObject
  object VictorySliceLabelPlacementType {
    
    inline def parallel: typingsJapgolly.victoryPie.victoryPieStrings.parallel = "parallel".asInstanceOf[typingsJapgolly.victoryPie.victoryPieStrings.parallel]
    
    inline def perpendicular: typingsJapgolly.victoryPie.victoryPieStrings.perpendicular = "perpendicular".asInstanceOf[typingsJapgolly.victoryPie.victoryPieStrings.perpendicular]
    
    inline def vertical: typingsJapgolly.victoryPie.victoryPieStrings.vertical = "vertical".asInstanceOf[typingsJapgolly.victoryPie.victoryPieStrings.vertical]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.victoryPie.victoryPieStrings.startAngle
    - typingsJapgolly.victoryPie.victoryPieStrings.centroid
    - typingsJapgolly.victoryPie.victoryPieStrings.endAngle
  */
  trait VictorySliceLabelPositionType extends StObject
  object VictorySliceLabelPositionType {
    
    inline def centroid: typingsJapgolly.victoryPie.victoryPieStrings.centroid = "centroid".asInstanceOf[typingsJapgolly.victoryPie.victoryPieStrings.centroid]
    
    inline def endAngle: typingsJapgolly.victoryPie.victoryPieStrings.endAngle = "endAngle".asInstanceOf[typingsJapgolly.victoryPie.victoryPieStrings.endAngle]
    
    inline def startAngle: typingsJapgolly.victoryPie.victoryPieStrings.startAngle = "startAngle".asInstanceOf[typingsJapgolly.victoryPie.victoryPieStrings.startAngle]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.victoryPie.victoryPieStrings.data
    - typingsJapgolly.victoryPie.victoryPieStrings.labels
    - typingsJapgolly.victoryPie.victoryPieStrings.parent
  */
  trait VictorySliceTTargetType extends StObject
  object VictorySliceTTargetType {
    
    inline def data: typingsJapgolly.victoryPie.victoryPieStrings.data = "data".asInstanceOf[typingsJapgolly.victoryPie.victoryPieStrings.data]
    
    inline def labels: typingsJapgolly.victoryPie.victoryPieStrings.labels = "labels".asInstanceOf[typingsJapgolly.victoryPie.victoryPieStrings.labels]
    
    inline def parent: typingsJapgolly.victoryPie.victoryPieStrings.parent = "parent".asInstanceOf[typingsJapgolly.victoryPie.victoryPieStrings.parent]
  }
}
