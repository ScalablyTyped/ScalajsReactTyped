package typingsJapgolly.victoryBrushLine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.DOMAttributes
import typingsJapgolly.react.mod.DetailedReactHTMLElement
import typingsJapgolly.victoryBrushLine.anon.AllowDrag
import typingsJapgolly.victoryBrushLine.anon.AllowDraw
import typingsJapgolly.victoryBrushLine.anon.EventHandlers
import typingsJapgolly.victoryBrushLine.anon.Height
import typingsJapgolly.victoryBrushLine.anon.Key
import typingsJapgolly.victoryBrushLine.anon.Max
import typingsJapgolly.victoryBrushLine.anon.Pickanyscaleactivex1x2y1y
import typingsJapgolly.victoryBrushLine.anon.Style
import typingsJapgolly.victoryBrushLine.victoryBrushLineStrings.`ew-resize`
import typingsJapgolly.victoryBrushLine.victoryBrushLineStrings.`ns-resize`
import typingsJapgolly.victoryBrushLine.victoryBrushLineStrings.crosshair
import typingsJapgolly.victoryBrushLine.victoryBrushLineStrings.move
import typingsJapgolly.victoryBrushLine.victoryBrushLineStrings.x
import typingsJapgolly.victoryBrushLine.victoryBrushLineStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esVictoryBrushLineMod {
  
  @JSImport("victory-brush-line/es/victory-brush-line", "VictoryBrushLine")
  @js.native
  open class VictoryBrushLine protected ()
    extends Component[VictoryBrushLineProps, js.Object, Any] {
    def this(props: VictoryBrushLineProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: VictoryBrushLineProps, context: Any) = this()
    
    def getCursor(props: Any): `ew-resize` | `ns-resize` | move | crosshair = js.native
    
    def getHandleDimensions(props: Any): Max = js.native
    
    def getRectDimensions(props: Any, brushWidth: Any): Height = js.native
    def getRectDimensions(props: Any, brushWidth: Any, domain: Any): Height = js.native
    
    def renderBrush(props: Any): (DetailedReactHTMLElement[Style, HTMLElement]) | Null = js.native
    
    def renderBrushArea(props: Any): DetailedReactHTMLElement[Style, HTMLElement] = js.native
    
    def renderHandles(props: Any): (js.Array[DetailedReactHTMLElement[Key, HTMLElement]]) | Null = js.native
    
    def renderLine(props: Any): DetailedReactHTMLElement[Pickanyscaleactivex1x2y1y, HTMLElement] = js.native
  }
  /* static members */
  object VictoryBrushLine {
    
    @JSImport("victory-brush-line/es/victory-brush-line", "VictoryBrushLine")
    @js.native
    val ^ : js.Any = js.native
    
    inline def defaultEvents(props: Any): js.UndefOr[js.Array[EventHandlers]] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultEvents")(props.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[EventHandlers]]]
    
    @JSImport("victory-brush-line/es/victory-brush-line", "VictoryBrushLine.defaultProps")
    @js.native
    def defaultProps: AllowDraw = js.native
    inline def defaultProps_=(x: AllowDraw): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-brush-line/es/victory-brush-line", "VictoryBrushLine.propTypes")
    @js.native
    def propTypes: AllowDrag = js.native
    inline def propTypes_=(x: AllowDrag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait VictoryBrushLineProps extends StObject {
    
    var allowDrag: js.UndefOr[Boolean] = js.undefined
    
    var allowDraw: js.UndefOr[Boolean] = js.undefined
    
    var allowResize: js.UndefOr[Boolean] = js.undefined
    
    var brushAreaComponent: js.UndefOr[Element] = js.undefined
    
    var brushAreaStyle: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ] = js.undefined
    
    var brushAreaWidth: js.UndefOr[Double] = js.undefined
    
    var brushComponent: js.UndefOr[Element] = js.undefined
    
    var brushDomain: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainTuple */ Any
      ] = js.undefined
    
    var brushStyle: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ] = js.undefined
    
    var brushWidth: js.UndefOr[Double] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dimension: js.UndefOr[x | y] = js.undefined
    
    var disable: js.UndefOr[Boolean] = js.undefined
    
    var events: js.UndefOr[DOMAttributes[Any]] = js.undefined
    
    var groupComponent: js.UndefOr[Element] = js.undefined
    
    var handleComponent: js.UndefOr[Element] = js.undefined
    
    var handleStyle: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ] = js.undefined
    
    var handleWidth: js.UndefOr[Double] = js.undefined
    
    var id: js.UndefOr[String | Double] = js.undefined
    
    var lineComponent: js.UndefOr[Element] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onBrushDomainChange: js.UndefOr[
        js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainTuple */ /* domain */ Any, 
          /* props */ js.UndefOr[this.type], 
          Unit
        ]
      ] = js.undefined
    
    var style: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object VictoryBrushLineProps {
    
    inline def apply(): VictoryBrushLineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryBrushLineProps]
    }
    
    extension [Self <: VictoryBrushLineProps](x: Self) {
      
      inline def setAllowDrag(value: Boolean): Self = StObject.set(x, "allowDrag", value.asInstanceOf[js.Any])
      
      inline def setAllowDragUndefined: Self = StObject.set(x, "allowDrag", js.undefined)
      
      inline def setAllowDraw(value: Boolean): Self = StObject.set(x, "allowDraw", value.asInstanceOf[js.Any])
      
      inline def setAllowDrawUndefined: Self = StObject.set(x, "allowDraw", js.undefined)
      
      inline def setAllowResize(value: Boolean): Self = StObject.set(x, "allowResize", value.asInstanceOf[js.Any])
      
      inline def setAllowResizeUndefined: Self = StObject.set(x, "allowResize", js.undefined)
      
      inline def setBrushAreaComponent(value: VdomElement): Self = StObject.set(x, "brushAreaComponent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setBrushAreaComponentUndefined: Self = StObject.set(x, "brushAreaComponent", js.undefined)
      
      inline def setBrushAreaStyle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ): Self = StObject.set(x, "brushAreaStyle", value.asInstanceOf[js.Any])
      
      inline def setBrushAreaStyleUndefined: Self = StObject.set(x, "brushAreaStyle", js.undefined)
      
      inline def setBrushAreaWidth(value: Double): Self = StObject.set(x, "brushAreaWidth", value.asInstanceOf[js.Any])
      
      inline def setBrushAreaWidthUndefined: Self = StObject.set(x, "brushAreaWidth", js.undefined)
      
      inline def setBrushComponent(value: VdomElement): Self = StObject.set(x, "brushComponent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setBrushComponentUndefined: Self = StObject.set(x, "brushComponent", js.undefined)
      
      inline def setBrushDomain(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainTuple */ Any
      ): Self = StObject.set(x, "brushDomain", value.asInstanceOf[js.Any])
      
      inline def setBrushDomainUndefined: Self = StObject.set(x, "brushDomain", js.undefined)
      
      inline def setBrushStyle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ): Self = StObject.set(x, "brushStyle", value.asInstanceOf[js.Any])
      
      inline def setBrushStyleUndefined: Self = StObject.set(x, "brushStyle", js.undefined)
      
      inline def setBrushWidth(value: Double): Self = StObject.set(x, "brushWidth", value.asInstanceOf[js.Any])
      
      inline def setBrushWidthUndefined: Self = StObject.set(x, "brushWidth", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDimension(value: typingsJapgolly.victoryBrushLine.victoryBrushLineStrings.x | y): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
      
      inline def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
      
      inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      inline def setEvents(value: DOMAttributes[Any]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setGroupComponent(value: VdomElement): Self = StObject.set(x, "groupComponent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setGroupComponentUndefined: Self = StObject.set(x, "groupComponent", js.undefined)
      
      inline def setHandleComponent(value: VdomElement): Self = StObject.set(x, "handleComponent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setHandleComponentUndefined: Self = StObject.set(x, "handleComponent", js.undefined)
      
      inline def setHandleStyle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ): Self = StObject.set(x, "handleStyle", value.asInstanceOf[js.Any])
      
      inline def setHandleStyleUndefined: Self = StObject.set(x, "handleStyle", js.undefined)
      
      inline def setHandleWidth(value: Double): Self = StObject.set(x, "handleWidth", value.asInstanceOf[js.Any])
      
      inline def setHandleWidthUndefined: Self = StObject.set(x, "handleWidth", js.undefined)
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLineComponent(value: VdomElement): Self = StObject.set(x, "lineComponent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLineComponentUndefined: Self = StObject.set(x, "lineComponent", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnBrushDomainChange(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainTuple */ /* domain */ Any, /* props */ js.UndefOr[VictoryBrushLineProps]) => Callback
      ): Self = StObject.set(x, "onBrushDomainChange", js.Any.fromFunction2((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainTuple */ /* domain */ Any, t1: /* props */ js.UndefOr[VictoryBrushLineProps]) => (value(t0, t1)).runNow()))
      
      inline def setOnBrushDomainChangeUndefined: Self = StObject.set(x, "onBrushDomainChange", js.undefined)
      
      inline def setStyle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
      ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.victoryBrushLine.victoryBrushLineStrings.data
    - typingsJapgolly.victoryBrushLine.victoryBrushLineStrings.labels
    - typingsJapgolly.victoryBrushLine.victoryBrushLineStrings.parent
  */
  trait VictoryBrushLineTargetType extends StObject
  object VictoryBrushLineTargetType {
    
    inline def data: typingsJapgolly.victoryBrushLine.victoryBrushLineStrings.data = "data".asInstanceOf[typingsJapgolly.victoryBrushLine.victoryBrushLineStrings.data]
    
    inline def labels: typingsJapgolly.victoryBrushLine.victoryBrushLineStrings.labels = "labels".asInstanceOf[typingsJapgolly.victoryBrushLine.victoryBrushLineStrings.labels]
    
    inline def parent: typingsJapgolly.victoryBrushLine.victoryBrushLineStrings.parent = "parent".asInstanceOf[typingsJapgolly.victoryBrushLine.victoryBrushLineStrings.parent]
  }
}
