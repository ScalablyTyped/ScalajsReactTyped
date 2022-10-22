package typingsJapgolly.reactSplitPane

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.TouchEvent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.reactSplitPane.anon.PartialSplitPaneState
import typingsJapgolly.reactSplitPane.reactSplitPaneStrings.first
import typingsJapgolly.reactSplitPane.reactSplitPaneStrings.horizontal
import typingsJapgolly.reactSplitPane.reactSplitPaneStrings.second
import typingsJapgolly.reactSplitPane.reactSplitPaneStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-split-pane", JSImport.Default)
  @js.native
  open class default () extends SplitPane
  object default {
    
    @JSImport("react-split-pane", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("react-split-pane", "default.defaultProps")
    @js.native
    def defaultProps: SplitPaneProps = js.native
    inline def defaultProps_=(x: SplitPaneProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def getSizeUpdate(props: SplitPaneProps, state: SplitPaneState): PartialSplitPaneState = (^.asInstanceOf[js.Dynamic].applyDynamic("getSizeUpdate")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[PartialSplitPaneState]
  }
  
  @JSImport("react-split-pane", "Pane")
  @js.native
  open class Pane protected ()
    extends PureComponent[PaneProps, js.Object, Any] {
    def this(props: PaneProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PaneProps, context: Any) = this()
  }
  
  trait PaneProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var eleRef: js.UndefOr[js.Function1[/* el */ HTMLDivElement, Unit]] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
    
    var split: js.UndefOr[Split] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object PaneProps {
    
    inline def apply(): PaneProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaneProps]
    }
    
    extension [Self <: PaneProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setEleRef(value: /* el */ HTMLDivElement => Callback): Self = StObject.set(x, "eleRef", js.Any.fromFunction1((t0: /* el */ HTMLDivElement) => value(t0).runNow()))
      
      inline def setEleRefUndefined: Self = StObject.set(x, "eleRef", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSplit(value: Split): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      inline def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type Size = String | Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactSplitPane.reactSplitPaneStrings.vertical
    - typingsJapgolly.reactSplitPane.reactSplitPaneStrings.horizontal
  */
  trait Split extends StObject
  object Split {
    
    inline def horizontal: typingsJapgolly.reactSplitPane.reactSplitPaneStrings.horizontal = "horizontal".asInstanceOf[typingsJapgolly.reactSplitPane.reactSplitPaneStrings.horizontal]
    
    inline def vertical: typingsJapgolly.reactSplitPane.reactSplitPaneStrings.vertical = "vertical".asInstanceOf[typingsJapgolly.reactSplitPane.reactSplitPaneStrings.vertical]
  }
  
  @js.native
  trait SplitPane extends Component[SplitPaneProps, SplitPaneState, Any] {
    
    def onMouseDown(event: MouseEvent): Unit = js.native
    
    def onMouseMove(event: MouseEvent): Unit = js.native
    
    def onMouseUp(): Unit = js.native
    
    def onTouchMove(event: TouchEvent): Unit = js.native
    
    def onTouchStart(event: TouchEvent): Unit = js.native
  }
  
  trait SplitPaneProps extends StObject {
    
    var allowResize: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var defaultSize: js.UndefOr[Size] = js.undefined
    
    var maxSize: js.UndefOr[Size] = js.undefined
    
    var minSize: js.UndefOr[Size] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* newSize */ Double, Unit]] = js.undefined
    
    var onDragFinished: js.UndefOr[js.Function1[/* newSize */ Double, Unit]] = js.undefined
    
    var onDragStarted: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onResizerClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
    
    var onResizerDoubleClick: js.UndefOr[js.Function1[/* event */ MouseEvent, Unit]] = js.undefined
    
    var pane1Style: js.UndefOr[CSSProperties] = js.undefined
    
    var pane2Style: js.UndefOr[CSSProperties] = js.undefined
    
    var paneStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var primary: js.UndefOr[first | second] = js.undefined
    
    var resizerClassName: js.UndefOr[String] = js.undefined
    
    var resizerStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
    
    var split: js.UndefOr[vertical | horizontal] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object SplitPaneProps {
    
    inline def apply(): SplitPaneProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SplitPaneProps]
    }
    
    extension [Self <: SplitPaneProps](x: Self) {
      
      inline def setAllowResize(value: Boolean): Self = StObject.set(x, "allowResize", value.asInstanceOf[js.Any])
      
      inline def setAllowResizeUndefined: Self = StObject.set(x, "allowResize", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultSize(value: Size): Self = StObject.set(x, "defaultSize", value.asInstanceOf[js.Any])
      
      inline def setDefaultSizeUndefined: Self = StObject.set(x, "defaultSize", js.undefined)
      
      inline def setMaxSize(value: Size): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      inline def setMinSize(value: Size): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
      
      inline def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
      
      inline def setOnChange(value: /* newSize */ Double => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* newSize */ Double) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnDragFinished(value: /* newSize */ Double => Callback): Self = StObject.set(x, "onDragFinished", js.Any.fromFunction1((t0: /* newSize */ Double) => value(t0).runNow()))
      
      inline def setOnDragFinishedUndefined: Self = StObject.set(x, "onDragFinished", js.undefined)
      
      inline def setOnDragStarted(value: Callback): Self = StObject.set(x, "onDragStarted", value.toJsFn)
      
      inline def setOnDragStartedUndefined: Self = StObject.set(x, "onDragStarted", js.undefined)
      
      inline def setOnResizerClick(value: /* event */ MouseEvent => Callback): Self = StObject.set(x, "onResizerClick", js.Any.fromFunction1((t0: /* event */ MouseEvent) => value(t0).runNow()))
      
      inline def setOnResizerClickUndefined: Self = StObject.set(x, "onResizerClick", js.undefined)
      
      inline def setOnResizerDoubleClick(value: /* event */ MouseEvent => Callback): Self = StObject.set(x, "onResizerDoubleClick", js.Any.fromFunction1((t0: /* event */ MouseEvent) => value(t0).runNow()))
      
      inline def setOnResizerDoubleClickUndefined: Self = StObject.set(x, "onResizerDoubleClick", js.undefined)
      
      inline def setPane1Style(value: CSSProperties): Self = StObject.set(x, "pane1Style", value.asInstanceOf[js.Any])
      
      inline def setPane1StyleUndefined: Self = StObject.set(x, "pane1Style", js.undefined)
      
      inline def setPane2Style(value: CSSProperties): Self = StObject.set(x, "pane2Style", value.asInstanceOf[js.Any])
      
      inline def setPane2StyleUndefined: Self = StObject.set(x, "pane2Style", js.undefined)
      
      inline def setPaneStyle(value: CSSProperties): Self = StObject.set(x, "paneStyle", value.asInstanceOf[js.Any])
      
      inline def setPaneStyleUndefined: Self = StObject.set(x, "paneStyle", js.undefined)
      
      inline def setPrimary(value: first | second): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
      
      inline def setResizerClassName(value: String): Self = StObject.set(x, "resizerClassName", value.asInstanceOf[js.Any])
      
      inline def setResizerClassNameUndefined: Self = StObject.set(x, "resizerClassName", js.undefined)
      
      inline def setResizerStyle(value: CSSProperties): Self = StObject.set(x, "resizerStyle", value.asInstanceOf[js.Any])
      
      inline def setResizerStyleUndefined: Self = StObject.set(x, "resizerStyle", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSplit(value: vertical | horizontal): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      inline def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait SplitPaneState extends StObject {
    
    var active: Boolean
    
    var resized: Boolean
  }
  object SplitPaneState {
    
    inline def apply(active: Boolean, resized: Boolean): SplitPaneState = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], resized = resized.asInstanceOf[js.Any])
      __obj.asInstanceOf[SplitPaneState]
    }
    
    extension [Self <: SplitPaneState](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setResized(value: Boolean): Self = StObject.set(x, "resized", value.asInstanceOf[js.Any])
    }
  }
}
