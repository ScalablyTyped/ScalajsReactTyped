package typingsJapgolly.victoryCore

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.DOMAttributes
import typingsJapgolly.react.mod.DetailedReactHTMLElement
import typingsJapgolly.victoryCore.anon.Arialabel
import typingsJapgolly.victoryCore.anon.ClipPathComponent
import typingsJapgolly.victoryCore.anon.HeightWidth
import typingsJapgolly.victoryCore.esVictoryLabelVictoryLabelMod.OriginType
import typingsJapgolly.victoryCore.esVictoryThemeTypesMod.BlockProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esVictoryClipContainerVictoryClipContainerMod {
  
  @JSImport("victory-core/es/victory-clip-container/victory-clip-container", "VictoryClipContainer")
  @js.native
  open class VictoryClipContainer protected ()
    extends Component[VictoryClipContainerProps, js.Object, Any] {
    def this(props: VictoryClipContainerProps) = this()
    
    def calculateAttributes(props: Any): HeightWidth = js.native
    
    /* private */ var clipId: Any = js.native
    
    def getClipValue(props: Any, axis: Any): Any = js.native
    
    def getTranslateValue(props: Any, axis: Any): Any = js.native
    
    def renderClipComponent(props: Any, clipId: Any): DetailedReactHTMLElement[Any, HTMLElement] = js.native
    
    def renderClippedGroup(props: Any, clipId: Any): DetailedReactHTMLElement[Any, HTMLElement] = js.native
    
    def renderGroup(props: Any): DetailedReactHTMLElement[Any, HTMLElement] = js.native
  }
  /* static members */
  object VictoryClipContainer {
    
    @JSImport("victory-core/es/victory-clip-container/victory-clip-container", "VictoryClipContainer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("victory-core/es/victory-clip-container/victory-clip-container", "VictoryClipContainer.defaultProps")
    @js.native
    def defaultProps: ClipPathComponent = js.native
    inline def defaultProps_=(x: ClipPathComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/es/victory-clip-container/victory-clip-container", "VictoryClipContainer.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/es/victory-clip-container/victory-clip-container", "VictoryClipContainer.propTypes")
    @js.native
    def propTypes: Arialabel = js.native
    inline def propTypes_=(x: Arialabel): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("victory-core/es/victory-clip-container/victory-clip-container", "VictoryClipContainer.role")
    @js.native
    def role: String = js.native
    inline def role_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
  }
  
  trait VictoryClipContainerProps extends StObject {
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[Element | js.Array[Element]] = js.undefined
    
    var circleComponent: js.UndefOr[Element] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var clipHeight: js.UndefOr[Double] = js.undefined
    
    var clipId: js.UndefOr[Double | String] = js.undefined
    
    var clipPadding: js.UndefOr[BlockProps] = js.undefined
    
    var clipPathComponent: js.UndefOr[Element] = js.undefined
    
    var clipWidth: js.UndefOr[Double] = js.undefined
    
    var events: js.UndefOr[DOMAttributes[Any]] = js.undefined
    
    var groupComponent: js.UndefOr[Element] = js.undefined
    
    var origin: js.UndefOr[OriginType] = js.undefined
    
    var polar: js.UndefOr[Boolean] = js.undefined
    
    var radius: js.UndefOr[Double] = js.undefined
    
    var rectComponent: js.UndefOr[Element] = js.undefined
    
    var translateX: js.UndefOr[Double] = js.undefined
    
    var translateY: js.UndefOr[Double] = js.undefined
  }
  object VictoryClipContainerProps {
    
    inline def apply(): VictoryClipContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VictoryClipContainerProps]
    }
    
    extension [Self <: VictoryClipContainerProps](x: Self) {
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def setChildren(value: Element | js.Array[Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCircleComponent(value: VdomElement): Self = StObject.set(x, "circleComponent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCircleComponentUndefined: Self = StObject.set(x, "circleComponent", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClipHeight(value: Double): Self = StObject.set(x, "clipHeight", value.asInstanceOf[js.Any])
      
      inline def setClipHeightUndefined: Self = StObject.set(x, "clipHeight", js.undefined)
      
      inline def setClipId(value: Double | String): Self = StObject.set(x, "clipId", value.asInstanceOf[js.Any])
      
      inline def setClipIdUndefined: Self = StObject.set(x, "clipId", js.undefined)
      
      inline def setClipPadding(value: BlockProps): Self = StObject.set(x, "clipPadding", value.asInstanceOf[js.Any])
      
      inline def setClipPaddingUndefined: Self = StObject.set(x, "clipPadding", js.undefined)
      
      inline def setClipPathComponent(value: VdomElement): Self = StObject.set(x, "clipPathComponent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClipPathComponentUndefined: Self = StObject.set(x, "clipPathComponent", js.undefined)
      
      inline def setClipWidth(value: Double): Self = StObject.set(x, "clipWidth", value.asInstanceOf[js.Any])
      
      inline def setClipWidthUndefined: Self = StObject.set(x, "clipWidth", js.undefined)
      
      inline def setEvents(value: DOMAttributes[Any]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setGroupComponent(value: VdomElement): Self = StObject.set(x, "groupComponent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setGroupComponentUndefined: Self = StObject.set(x, "groupComponent", js.undefined)
      
      inline def setOrigin(value: OriginType): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setPolar(value: Boolean): Self = StObject.set(x, "polar", value.asInstanceOf[js.Any])
      
      inline def setPolarUndefined: Self = StObject.set(x, "polar", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setRectComponent(value: VdomElement): Self = StObject.set(x, "rectComponent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRectComponentUndefined: Self = StObject.set(x, "rectComponent", js.undefined)
      
      inline def setTranslateX(value: Double): Self = StObject.set(x, "translateX", value.asInstanceOf[js.Any])
      
      inline def setTranslateXUndefined: Self = StObject.set(x, "translateX", js.undefined)
      
      inline def setTranslateY(value: Double): Self = StObject.set(x, "translateY", value.asInstanceOf[js.Any])
      
      inline def setTranslateYUndefined: Self = StObject.set(x, "translateY", js.undefined)
    }
  }
}
