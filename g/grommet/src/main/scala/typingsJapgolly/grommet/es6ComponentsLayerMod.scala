package typingsJapgolly.grommet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.grommet.es6UtilsMod.AnimateType
import typingsJapgolly.grommet.es6UtilsMod.BackgroundType
import typingsJapgolly.grommet.es6UtilsMod.KeyboardType
import typingsJapgolly.grommet.es6UtilsMod.MarginType
import typingsJapgolly.grommet.grommetStrings.fadeIn
import typingsJapgolly.grommet.grommetStrings.horizontal
import typingsJapgolly.grommet.grommetStrings.none
import typingsJapgolly.grommet.grommetStrings.slide
import typingsJapgolly.grommet.grommetStrings.vertical
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ComponentsLayerMod {
  
  @JSImport("grommet/es6/components/Layer", "Layer")
  @js.native
  val Layer: FC[LayerExtendedProps] = js.native
  
  trait LayerExtendedProps
    extends StObject
       with LayerProps
       with ClassAttributes[HTMLDivElement]
       with HTMLAttributes[HTMLDivElement]
  object LayerExtendedProps {
    
    inline def apply(): LayerExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayerExtendedProps]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.grommet.grommetStrings.bottom
    - typingsJapgolly.grommet.grommetStrings.`bottom-left`
    - typingsJapgolly.grommet.grommetStrings.`bottom-right`
    - typingsJapgolly.grommet.grommetStrings.center
    - typingsJapgolly.grommet.grommetStrings.hidden
    - typingsJapgolly.grommet.grommetStrings.left
    - typingsJapgolly.grommet.grommetStrings.right
    - typingsJapgolly.grommet.grommetStrings.top
    - typingsJapgolly.grommet.grommetStrings.`top-left`
    - typingsJapgolly.grommet.grommetStrings.`top-right`
  */
  trait LayerPositionType extends StObject
  object LayerPositionType {
    
    inline def bottom: typingsJapgolly.grommet.grommetStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.grommet.grommetStrings.bottom]
    
    inline def `bottom-left`: typingsJapgolly.grommet.grommetStrings.`bottom-left` = "bottom-left".asInstanceOf[typingsJapgolly.grommet.grommetStrings.`bottom-left`]
    
    inline def `bottom-right`: typingsJapgolly.grommet.grommetStrings.`bottom-right` = "bottom-right".asInstanceOf[typingsJapgolly.grommet.grommetStrings.`bottom-right`]
    
    inline def center: typingsJapgolly.grommet.grommetStrings.center = "center".asInstanceOf[typingsJapgolly.grommet.grommetStrings.center]
    
    inline def hidden: typingsJapgolly.grommet.grommetStrings.hidden = "hidden".asInstanceOf[typingsJapgolly.grommet.grommetStrings.hidden]
    
    inline def left: typingsJapgolly.grommet.grommetStrings.left = "left".asInstanceOf[typingsJapgolly.grommet.grommetStrings.left]
    
    inline def right: typingsJapgolly.grommet.grommetStrings.right = "right".asInstanceOf[typingsJapgolly.grommet.grommetStrings.right]
    
    inline def top: typingsJapgolly.grommet.grommetStrings.top = "top".asInstanceOf[typingsJapgolly.grommet.grommetStrings.top]
    
    inline def `top-left`: typingsJapgolly.grommet.grommetStrings.`top-left` = "top-left".asInstanceOf[typingsJapgolly.grommet.grommetStrings.`top-left`]
    
    inline def `top-right`: typingsJapgolly.grommet.grommetStrings.`top-right` = "top-right".asInstanceOf[typingsJapgolly.grommet.grommetStrings.`top-right`]
  }
  
  trait LayerProps extends StObject {
    
    var animate: js.UndefOr[AnimateType] = js.undefined
    
    var animation: js.UndefOr[none | slide | fadeIn | Boolean] = js.undefined
    
    var background: js.UndefOr[BackgroundType] = js.undefined
    
    var full: js.UndefOr[Boolean | vertical | horizontal] = js.undefined
    
    var margin: js.UndefOr[MarginType] = js.undefined
    
    var modal: js.UndefOr[Boolean] = js.undefined
    
    var onClickOutside: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLDivElement], Unit]] = js.undefined
    
    var onEsc: js.UndefOr[KeyboardType] = js.undefined
    
    var plain: js.UndefOr[Boolean] = js.undefined
    
    var position: js.UndefOr[LayerPositionType] = js.undefined
    
    var responsive: js.UndefOr[Boolean] = js.undefined
    
    var target: js.UndefOr[js.Object] = js.undefined
  }
  object LayerProps {
    
    inline def apply(): LayerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayerProps]
    }
    
    extension [Self <: LayerProps](x: Self) {
      
      inline def setAnimate(value: AnimateType): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setAnimation(value: none | slide | fadeIn | Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setBackground(value: BackgroundType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setFull(value: Boolean | vertical | horizontal): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      inline def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
      
      inline def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      inline def setOnClickOutside(value: /* event */ ReactMouseEventFrom[HTMLDivElement] => Callback): Self = StObject.set(x, "onClickOutside", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLDivElement]) => value(t0).runNow()))
      
      inline def setOnClickOutsideUndefined: Self = StObject.set(x, "onClickOutside", js.undefined)
      
      inline def setOnEsc(value: /* event */ ReactKeyboardEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onEsc", js.Any.fromFunction1((t0: /* event */ ReactKeyboardEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnEscUndefined: Self = StObject.set(x, "onEsc", js.undefined)
      
      inline def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      
      inline def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
      
      inline def setPosition(value: LayerPositionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      inline def setTarget(value: js.Object): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  type divProps = DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]
}
