package typingsJapgolly.atlaskitLayer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@atlaskit/layer", JSImport.Default)
  @js.native
  open class default ()
    extends Component[Props, js.Object, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.viewport
    - typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.window
    - typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.scrollParent
  */
  trait BoundariesElementType extends StObject
  object BoundariesElementType {
    
    inline def scrollParent: typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.scrollParent = "scrollParent".asInstanceOf[typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.scrollParent]
    
    inline def viewport: typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.viewport = "viewport".asInstanceOf[typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.viewport]
    
    inline def window: typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.window = "window".asInstanceOf[typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.window]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.absolute
    - typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.fixed
  */
  trait CSSPositionType extends StObject
  object CSSPositionType {
    
    inline def absolute: typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.absolute = "absolute".asInstanceOf[typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.absolute]
    
    inline def fixed: typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.fixed = "fixed".asInstanceOf[typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.fixed]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.top
    - typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.right
    - typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.bottom
    - typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.left
  */
  trait FlipPositionType extends StObject
  object FlipPositionType {
    
    inline def bottom: typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.bottom]
    
    inline def left: typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.left = "left".asInstanceOf[typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.left]
    
    inline def right: typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.right = "right".asInstanceOf[typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.right]
    
    inline def top: typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.top = "top".asInstanceOf[typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.top]
  }
  
  type Layer = japgolly.scalajs.react.facade.React.Component[Props & js.Object, js.Object]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.`top left`
    - typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.`top center`
    - typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.`top right`
    - typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.`right top`
    - typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.`right middle`
    - typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.`right bottom`
    - typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.`bottom left`
    - typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.`bottom center`
    - typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.`bottom right`
    - typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.`left top`
    - typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.`left middle`
    - typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.`left bottom`
  */
  trait PositionType extends StObject
  object PositionType {
    
    inline def `bottom center`: typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.`bottom center` = ("bottom center").asInstanceOf[typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.`bottom center`]
    
    inline def `bottom left`: typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.`bottom left` = ("bottom left").asInstanceOf[typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.`bottom left`]
    
    inline def `bottom right`: typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.`bottom right` = ("bottom right").asInstanceOf[typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.`bottom right`]
    
    inline def `left bottom`: typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.`left bottom` = ("left bottom").asInstanceOf[typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.`left bottom`]
    
    inline def `left middle`: typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.`left middle` = ("left middle").asInstanceOf[typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.`left middle`]
    
    inline def `left top`: typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.`left top` = ("left top").asInstanceOf[typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.`left top`]
    
    inline def `right bottom`: typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.`right bottom` = ("right bottom").asInstanceOf[typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.`right bottom`]
    
    inline def `right middle`: typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.`right middle` = ("right middle").asInstanceOf[typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.`right middle`]
    
    inline def `right top`: typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.`right top` = ("right top").asInstanceOf[typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.`right top`]
    
    inline def `top center`: typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.`top center` = ("top center").asInstanceOf[typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.`top center`]
    
    inline def `top left`: typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.`top left` = ("top left").asInstanceOf[typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.`top left`]
    
    inline def `top right`: typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.`top right` = ("top right").asInstanceOf[typingsJapgolly.atlaskitLayer.atlaskitLayerStrings.`top right`]
  }
  
  trait Props extends StObject {
    
    /**
      * Sets whether the content auto flip when it reaches the border set it as true for default flip
      * or set the custom flip positions
      */
    var autoFlip: js.UndefOr[Boolean | FlipPositionType | js.Array[FlipPositionType]] = js.undefined
    
    /**
      * Element to act as a boundary for the Layer. The Layer will not sit outside this element if it
      * can help it. If, through it's normal positoning, it would end up outside the boundary the
      * layer will flip positions if the autoPosition prop is set.
      */
    var boundariesElement: js.UndefOr[BoundariesElementType] = js.undefined
    
    /** Target to which layer is attached */
    var children: js.UndefOr[Node] = js.undefined
    
    /** HTML content to display in the layer. Will be aligned to the target according to the position prop. */
    var content: js.UndefOr[Node] = js.undefined
    
    /** Lock scrolling behind the layer */
    var lockScroll: js.UndefOr[Boolean] = js.undefined
    
    /**
      * String representing the offsets from the target element in the format "[x-offset][y-offset]",
      * measured in pixels.
      */
    var offset: js.UndefOr[String] = js.undefined
    
    /**
      * Callback that is used to know when the flipped state of Layer changes. This occurs when placing a
      * Layered element in the requested position would cause Layer to be rendered outside of the
      * boundariesElement (usually viewport).
      */
    var onFlippedChange: js.UndefOr[
        js.Function3[
          /* flipped */ Boolean, 
          /* actualPosition */ CSSPositionType, 
          /* originalPosition */ CSSPositionType, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Position of a layer relative to its target. The position attribute takes two positional arguments in
      * the format position="edge edge-position", where edge specifies what edge to align the layer to, and
      * edge-position specifies where on that edge the layer should appear.
      */
    var position: js.UndefOr[PositionType] = js.undefined
    
    /** z-index for the layer component */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object Props {
    
    inline def apply(): Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setAutoFlip(value: Boolean | FlipPositionType | js.Array[FlipPositionType]): Self = StObject.set(x, "autoFlip", value.asInstanceOf[js.Any])
      
      inline def setAutoFlipUndefined: Self = StObject.set(x, "autoFlip", js.undefined)
      
      inline def setAutoFlipVarargs(value: FlipPositionType*): Self = StObject.set(x, "autoFlip", js.Array(value*))
      
      inline def setBoundariesElement(value: BoundariesElementType): Self = StObject.set(x, "boundariesElement", value.asInstanceOf[js.Any])
      
      inline def setBoundariesElementUndefined: Self = StObject.set(x, "boundariesElement", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setContent(value: VdomNode): Self = StObject.set(x, "content", value.rawNode.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setContentVdomElement(value: VdomElement): Self = StObject.set(x, "content", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLockScroll(value: Boolean): Self = StObject.set(x, "lockScroll", value.asInstanceOf[js.Any])
      
      inline def setLockScrollUndefined: Self = StObject.set(x, "lockScroll", js.undefined)
      
      inline def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOnFlippedChange(
        value: (/* flipped */ Boolean, /* actualPosition */ CSSPositionType, /* originalPosition */ CSSPositionType) => Callback
      ): Self = StObject.set(x, "onFlippedChange", js.Any.fromFunction3((t0: /* flipped */ Boolean, t1: /* actualPosition */ CSSPositionType, t2: /* originalPosition */ CSSPositionType) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnFlippedChangeUndefined: Self = StObject.set(x, "onFlippedChange", js.undefined)
      
      inline def setPosition(value: PositionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
