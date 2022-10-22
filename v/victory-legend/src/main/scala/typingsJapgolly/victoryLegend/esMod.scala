package typingsJapgolly.victoryLegend

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.std.Omit
import typingsJapgolly.victoryLegend.anon.Labels
import typingsJapgolly.victoryLegend.anon.Left
import typingsJapgolly.victoryLegend.anon.Title
import typingsJapgolly.victoryLegend.victoryLegendStrings.left
import typingsJapgolly.victoryLegend.victoryLegendStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMod {
  
  @JSImport("victory-legend/es", "VictoryLegend")
  @js.native
  open class VictoryLegend protected () extends Component[VictoryLegendProps, Any, Any] {
    def this(props: VictoryLegendProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: VictoryLegendProps, context: Any) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.victoryLegend.victoryLegendStrings.horizontal
    - typingsJapgolly.victoryLegend.victoryLegendStrings.vertical
  */
  trait VictoryLegendOrientationType extends StObject
  object VictoryLegendOrientationType {
    
    inline def horizontal: typingsJapgolly.victoryLegend.victoryLegendStrings.horizontal = "horizontal".asInstanceOf[typingsJapgolly.victoryLegend.victoryLegendStrings.horizontal]
    
    inline def vertical: typingsJapgolly.victoryLegend.victoryLegendStrings.vertical = "vertical".asInstanceOf[typingsJapgolly.victoryLegend.victoryLegendStrings.vertical]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryCommonProps * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryDatableProps * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictorySingleLabelableProps * / any */ trait VictoryLegendProps extends StObject {
    
    var borderComponent: js.UndefOr[Element] = js.undefined
    
    var borderPadding: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PaddingProps */ Any
      ] = js.undefined
    
    var centerTitle: js.UndefOr[Boolean] = js.undefined
    
    var colorScale: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColorScalePropType */ Any
      ] = js.undefined
    
    var data: js.UndefOr[js.Array[Labels]] = js.undefined
    
    var dataComponent: js.UndefOr[Element] = js.undefined
    
    var eventKey: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | js.Array[String]
      ] = js.undefined
    
    var events: js.UndefOr[
        js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryLegendTTargetType, StringOrNumberOrCallback> */ Any
        ]
      ] = js.undefined
    
    var gutter: js.UndefOr[Double | Left] = js.undefined
    
    var itemsPerRow: js.UndefOr[Double] = js.undefined
    
    var orientation: js.UndefOr[VictoryLegendOrientationType] = js.undefined
    
    var rowGutter: js.UndefOr[
        Double | (Omit[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockProps */ Any, 
          left | right
        ])
      ] = js.undefined
    
    var style: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleInterface */ Any) & Title
      ] = js.undefined
    
    var symbolSpacer: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var titleComponent: js.UndefOr[Element] = js.undefined
    
    var titleOrientation: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any
      ] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object VictoryLegendProps {
    
    inline def apply(): VictoryLegendProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryLegendProps]
    }
    
    extension [Self <: VictoryLegendProps](x: Self) {
      
      inline def setBorderComponent(value: VdomElement): Self = StObject.set(x, "borderComponent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setBorderComponentUndefined: Self = StObject.set(x, "borderComponent", js.undefined)
      
      inline def setBorderPadding(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PaddingProps */ Any
      ): Self = StObject.set(x, "borderPadding", value.asInstanceOf[js.Any])
      
      inline def setBorderPaddingUndefined: Self = StObject.set(x, "borderPadding", js.undefined)
      
      inline def setCenterTitle(value: Boolean): Self = StObject.set(x, "centerTitle", value.asInstanceOf[js.Any])
      
      inline def setCenterTitleUndefined: Self = StObject.set(x, "centerTitle", js.undefined)
      
      inline def setColorScale(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColorScalePropType */ Any
      ): Self = StObject.set(x, "colorScale", value.asInstanceOf[js.Any])
      
      inline def setColorScaleUndefined: Self = StObject.set(x, "colorScale", js.undefined)
      
      inline def setData(value: js.Array[Labels]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataComponent(value: VdomElement): Self = StObject.set(x, "dataComponent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDataComponentUndefined: Self = StObject.set(x, "dataComponent", js.undefined)
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: Labels*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setEventKey(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | js.Array[String]
      ): Self = StObject.set(x, "eventKey", value.asInstanceOf[js.Any])
      
      inline def setEventKeyUndefined: Self = StObject.set(x, "eventKey", js.undefined)
      
      inline def setEventKeyVarargs(value: String*): Self = StObject.set(x, "eventKey", js.Array(value*))
      
      inline def setEvents(
        value: js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryLegendTTargetType, StringOrNumberOrCallback> */ Any
            ]
      ): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setEventsVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryLegendTTargetType, StringOrNumberOrCallback> */ Any)*
      ): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setGutter(value: Double | Left): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      inline def setItemsPerRow(value: Double): Self = StObject.set(x, "itemsPerRow", value.asInstanceOf[js.Any])
      
      inline def setItemsPerRowUndefined: Self = StObject.set(x, "itemsPerRow", js.undefined)
      
      inline def setOrientation(value: VictoryLegendOrientationType): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setRowGutter(
        value: Double | (Omit[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockProps */ Any, 
              left | right
            ])
      ): Self = StObject.set(x, "rowGutter", value.asInstanceOf[js.Any])
      
      inline def setRowGutterUndefined: Self = StObject.set(x, "rowGutter", js.undefined)
      
      inline def setStyle(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleInterface */ Any) & Title
      ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSymbolSpacer(value: Double): Self = StObject.set(x, "symbolSpacer", value.asInstanceOf[js.Any])
      
      inline def setSymbolSpacerUndefined: Self = StObject.set(x, "symbolSpacer", js.undefined)
      
      inline def setTitle(value: String | js.Array[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleComponent(value: VdomElement): Self = StObject.set(x, "titleComponent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTitleComponentUndefined: Self = StObject.set(x, "titleComponent", js.undefined)
      
      inline def setTitleOrientation(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any
      ): Self = StObject.set(x, "titleOrientation", value.asInstanceOf[js.Any])
      
      inline def setTitleOrientationUndefined: Self = StObject.set(x, "titleOrientation", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTitleVarargs(value: String*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.victoryLegend.victoryLegendStrings.data
    - typingsJapgolly.victoryLegend.victoryLegendStrings.labels
    - typingsJapgolly.victoryLegend.victoryLegendStrings.parent
  */
  trait VictoryLegendTTargetType extends StObject
  object VictoryLegendTTargetType {
    
    inline def data: typingsJapgolly.victoryLegend.victoryLegendStrings.data = "data".asInstanceOf[typingsJapgolly.victoryLegend.victoryLegendStrings.data]
    
    inline def labels: typingsJapgolly.victoryLegend.victoryLegendStrings.labels = "labels".asInstanceOf[typingsJapgolly.victoryLegend.victoryLegendStrings.labels]
    
    inline def parent: typingsJapgolly.victoryLegend.victoryLegendStrings.parent = "parent".asInstanceOf[typingsJapgolly.victoryLegend.victoryLegendStrings.parent]
  }
}
