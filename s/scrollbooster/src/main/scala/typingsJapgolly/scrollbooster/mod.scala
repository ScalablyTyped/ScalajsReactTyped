package typingsJapgolly.scrollbooster

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import typingsJapgolly.scrollbooster.anon.Bottom
import typingsJapgolly.scrollbooster.anon.PartialScrollBoosterOptio
import typingsJapgolly.scrollbooster.anon.RequiredPosition
import typingsJapgolly.scrollbooster.anon.X
import typingsJapgolly.scrollbooster.scrollboosterStrings.all
import typingsJapgolly.scrollbooster.scrollboosterStrings.horizontal
import typingsJapgolly.scrollbooster.scrollboosterStrings.mouse
import typingsJapgolly.scrollbooster.scrollboosterStrings.native
import typingsJapgolly.scrollbooster.scrollboosterStrings.touch
import typingsJapgolly.scrollbooster.scrollboosterStrings.transform
import typingsJapgolly.scrollbooster.scrollboosterStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("scrollbooster", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ScrollBooster {
    def this(options: ScrollBoosterOptions) = this()
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def getState(): ScrollingState = js.native
    
    /* CompleteClass */
    override def scrollTo(position: Position): Unit = js.native
    
    /* CompleteClass */
    override def setPosition(position: Position): Unit = js.native
    
    /* CompleteClass */
    override def updateMetrics(): Unit = js.native
    
    /* CompleteClass */
    override def updateOptions(options: PartialScrollBoosterOptio): Unit = js.native
  }
  
  trait Position extends StObject {
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object Position {
    
    inline def apply(): Position = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Position]
    }
    
    extension [Self <: Position](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait ScrollBooster extends StObject {
    
    def destroy(): Unit
    
    def getState(): ScrollingState
    
    def scrollTo(position: Position): Unit
    
    def setPosition(position: Position): Unit
    
    def updateMetrics(): Unit
    
    def updateOptions(options: PartialScrollBoosterOptio): Unit
  }
  object ScrollBooster {
    
    inline def apply(
      destroy: Callback,
      getState: CallbackTo[ScrollingState],
      scrollTo: Position => Callback,
      setPosition: Position => Callback,
      updateMetrics: Callback,
      updateOptions: PartialScrollBoosterOptio => Callback
    ): ScrollBooster = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, getState = getState.toJsFn, scrollTo = js.Any.fromFunction1((t0: Position) => scrollTo(t0).runNow()), setPosition = js.Any.fromFunction1((t0: Position) => setPosition(t0).runNow()), updateMetrics = updateMetrics.toJsFn, updateOptions = js.Any.fromFunction1((t0: PartialScrollBoosterOptio) => updateOptions(t0).runNow()))
      __obj.asInstanceOf[ScrollBooster]
    }
    
    extension [Self <: ScrollBooster](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGetState(value: CallbackTo[ScrollingState]): Self = StObject.set(x, "getState", value.toJsFn)
      
      inline def setScrollTo(value: Position => Callback): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1((t0: Position) => value(t0).runNow()))
      
      inline def setSetPosition(value: Position => Callback): Self = StObject.set(x, "setPosition", js.Any.fromFunction1((t0: Position) => value(t0).runNow()))
      
      inline def setUpdateMetrics(value: Callback): Self = StObject.set(x, "updateMetrics", value.toJsFn)
      
      inline def setUpdateOptions(value: PartialScrollBoosterOptio => Callback): Self = StObject.set(x, "updateOptions", js.Any.fromFunction1((t0: PartialScrollBoosterOptio) => value(t0).runNow()))
    }
  }
  
  trait ScrollBoosterOptions extends StObject {
    
    var bounce: js.UndefOr[Boolean] = js.undefined
    
    var bounceForce: js.UndefOr[Double] = js.undefined
    
    var content: js.UndefOr[HTMLElement | Null] = js.undefined
    
    var direction: js.UndefOr[horizontal | vertical | all] = js.undefined
    
    var emulateScroll: js.UndefOr[Boolean] = js.undefined
    
    var friction: js.UndefOr[Double] = js.undefined
    
    var inputsFocus: js.UndefOr[Boolean] = js.undefined
    
    var onClick: js.UndefOr[js.Function2[/* state */ ScrollingState, /* event */ Event, Unit]] = js.undefined
    
    var onUpdate: js.UndefOr[js.Function1[/* state */ ScrollingState, Unit]] = js.undefined
    
    var pointerMode: js.UndefOr[touch | mouse | all] = js.undefined
    
    var scrollMode: js.UndefOr[transform | native] = js.undefined
    
    var shouldScroll: js.UndefOr[js.Function2[/* state */ ScrollingState, /* event */ Event, Boolean]] = js.undefined
    
    var textSelection: js.UndefOr[Boolean] = js.undefined
    
    var viewport: HTMLElement | Null
  }
  object ScrollBoosterOptions {
    
    inline def apply(): ScrollBoosterOptions = {
      val __obj = js.Dynamic.literal(viewport = null)
      __obj.asInstanceOf[ScrollBoosterOptions]
    }
    
    extension [Self <: ScrollBoosterOptions](x: Self) {
      
      inline def setBounce(value: Boolean): Self = StObject.set(x, "bounce", value.asInstanceOf[js.Any])
      
      inline def setBounceForce(value: Double): Self = StObject.set(x, "bounceForce", value.asInstanceOf[js.Any])
      
      inline def setBounceForceUndefined: Self = StObject.set(x, "bounceForce", js.undefined)
      
      inline def setBounceUndefined: Self = StObject.set(x, "bounce", js.undefined)
      
      inline def setContent(value: HTMLElement): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDirection(value: horizontal | vertical | all): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setEmulateScroll(value: Boolean): Self = StObject.set(x, "emulateScroll", value.asInstanceOf[js.Any])
      
      inline def setEmulateScrollUndefined: Self = StObject.set(x, "emulateScroll", js.undefined)
      
      inline def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
      
      inline def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
      
      inline def setInputsFocus(value: Boolean): Self = StObject.set(x, "inputsFocus", value.asInstanceOf[js.Any])
      
      inline def setInputsFocusUndefined: Self = StObject.set(x, "inputsFocus", js.undefined)
      
      inline def setOnClick(value: (/* state */ ScrollingState, /* event */ Event) => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: /* state */ ScrollingState, t1: /* event */ Event) => (value(t0, t1)).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnUpdate(value: /* state */ ScrollingState => Callback): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1((t0: /* state */ ScrollingState) => value(t0).runNow()))
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      inline def setPointerMode(value: touch | mouse | all): Self = StObject.set(x, "pointerMode", value.asInstanceOf[js.Any])
      
      inline def setPointerModeUndefined: Self = StObject.set(x, "pointerMode", js.undefined)
      
      inline def setScrollMode(value: transform | native): Self = StObject.set(x, "scrollMode", value.asInstanceOf[js.Any])
      
      inline def setScrollModeUndefined: Self = StObject.set(x, "scrollMode", js.undefined)
      
      inline def setShouldScroll(value: (/* state */ ScrollingState, /* event */ Event) => Boolean): Self = StObject.set(x, "shouldScroll", js.Any.fromFunction2(value))
      
      inline def setShouldScrollUndefined: Self = StObject.set(x, "shouldScroll", js.undefined)
      
      inline def setTextSelection(value: Boolean): Self = StObject.set(x, "textSelection", value.asInstanceOf[js.Any])
      
      inline def setTextSelectionUndefined: Self = StObject.set(x, "textSelection", js.undefined)
      
      inline def setViewport(value: HTMLElement): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
      
      inline def setViewportNull: Self = StObject.set(x, "viewport", null)
    }
  }
  
  trait ScrollingState extends StObject {
    
    var borderCollision: Bottom
    
    var dragOffset: X
    
    var isDragging: Boolean
    
    var isMoving: Boolean
    
    var position: RequiredPosition
  }
  object ScrollingState {
    
    inline def apply(
      borderCollision: Bottom,
      dragOffset: X,
      isDragging: Boolean,
      isMoving: Boolean,
      position: RequiredPosition
    ): ScrollingState = {
      val __obj = js.Dynamic.literal(borderCollision = borderCollision.asInstanceOf[js.Any], dragOffset = dragOffset.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], isMoving = isMoving.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollingState]
    }
    
    extension [Self <: ScrollingState](x: Self) {
      
      inline def setBorderCollision(value: Bottom): Self = StObject.set(x, "borderCollision", value.asInstanceOf[js.Any])
      
      inline def setDragOffset(value: X): Self = StObject.set(x, "dragOffset", value.asInstanceOf[js.Any])
      
      inline def setIsDragging(value: Boolean): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
      
      inline def setIsMoving(value: Boolean): Self = StObject.set(x, "isMoving", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: RequiredPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
}
