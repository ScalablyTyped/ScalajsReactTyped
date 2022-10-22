package typingsJapgolly.granim

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLCanvasElement
import typingsJapgolly.granim.anon.X0
import typingsJapgolly.granim.granimStrings.`left-right`
import typingsJapgolly.granim.granimStrings.`top-bottom`
import typingsJapgolly.granim.granimStrings.bottom
import typingsJapgolly.granim.granimStrings.center
import typingsJapgolly.granim.granimStrings.custom
import typingsJapgolly.granim.granimStrings.diagonal
import typingsJapgolly.granim.granimStrings.left
import typingsJapgolly.granim.granimStrings.radial
import typingsJapgolly.granim.granimStrings.right
import typingsJapgolly.granim.granimStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("granim", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Granim {
    def this(options: Options) = this()
    
    /* CompleteClass */
    override def changeBlendingMode(blendingModeName: String): Unit = js.native
    
    /* CompleteClass */
    override def changeDirection(directionName: String): Unit = js.native
    
    /* CompleteClass */
    override def changeState(stateName: String): Unit = js.native
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def pause(): Unit = js.native
    
    /* CompleteClass */
    override def play(): Unit = js.native
  }
  
  trait Gradient extends StObject {
    
    var color: String
    
    var pos: Double
  }
  object Gradient {
    
    inline def apply(color: String, pos: Double): Gradient = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
      __obj.asInstanceOf[Gradient]
    }
    
    extension [Self <: Gradient](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    }
  }
  
  trait Granim extends StObject {
    
    def changeBlendingMode(blendingModeName: String): Unit
    
    def changeDirection(directionName: String): Unit
    
    def changeState(stateName: String): Unit
    
    def clear(): Unit
    
    def destroy(): Unit
    
    def pause(): Unit
    
    def play(): Unit
  }
  object Granim {
    
    inline def apply(
      changeBlendingMode: String => Callback,
      changeDirection: String => Callback,
      changeState: String => Callback,
      clear: Callback,
      destroy: Callback,
      pause: Callback,
      play: Callback
    ): Granim = {
      val __obj = js.Dynamic.literal(changeBlendingMode = js.Any.fromFunction1((t0: String) => changeBlendingMode(t0).runNow()), changeDirection = js.Any.fromFunction1((t0: String) => changeDirection(t0).runNow()), changeState = js.Any.fromFunction1((t0: String) => changeState(t0).runNow()), clear = clear.toJsFn, destroy = destroy.toJsFn, pause = pause.toJsFn, play = play.toJsFn)
      __obj.asInstanceOf[Granim]
    }
    
    extension [Self <: Granim](x: Self) {
      
      inline def setChangeBlendingMode(value: String => Callback): Self = StObject.set(x, "changeBlendingMode", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setChangeDirection(value: String => Callback): Self = StObject.set(x, "changeDirection", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setChangeState(value: String => Callback): Self = StObject.set(x, "changeState", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
      
      inline def setPlay(value: Callback): Self = StObject.set(x, "play", value.toJsFn)
    }
  }
  
  trait Image extends StObject {
    
    var blendingMode: js.UndefOr[String] = js.undefined
    
    var position: js.UndefOr[js.Tuple2[left | center | right, top | center | bottom]] = js.undefined
    
    var source: String
    
    var stretchMode: js.UndefOr[js.Tuple2[StretchMode, StretchMode]] = js.undefined
  }
  object Image {
    
    inline def apply(source: String): Image = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Image]
    }
    
    extension [Self <: Image](x: Self) {
      
      inline def setBlendingMode(value: String): Self = StObject.set(x, "blendingMode", value.asInstanceOf[js.Any])
      
      inline def setBlendingModeUndefined: Self = StObject.set(x, "blendingMode", js.undefined)
      
      inline def setPosition(value: js.Tuple2[left | center | right, top | center | bottom]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setStretchMode(value: js.Tuple2[StretchMode, StretchMode]): Self = StObject.set(x, "stretchMode", value.asInstanceOf[js.Any])
      
      inline def setStretchModeUndefined: Self = StObject.set(x, "stretchMode", js.undefined)
    }
  }
  
  trait OnGradientChangeObject extends StObject {
    
    var activeState: String
    
    var colorsFrom: js.Tuple2[String, String]
    
    var colorsTo: js.Tuple2[String, String]
    
    var isLooping: Boolean
  }
  object OnGradientChangeObject {
    
    inline def apply(
      activeState: String,
      colorsFrom: js.Tuple2[String, String],
      colorsTo: js.Tuple2[String, String],
      isLooping: Boolean
    ): OnGradientChangeObject = {
      val __obj = js.Dynamic.literal(activeState = activeState.asInstanceOf[js.Any], colorsFrom = colorsFrom.asInstanceOf[js.Any], colorsTo = colorsTo.asInstanceOf[js.Any], isLooping = isLooping.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnGradientChangeObject]
    }
    
    extension [Self <: OnGradientChangeObject](x: Self) {
      
      inline def setActiveState(value: String): Self = StObject.set(x, "activeState", value.asInstanceOf[js.Any])
      
      inline def setColorsFrom(value: js.Tuple2[String, String]): Self = StObject.set(x, "colorsFrom", value.asInstanceOf[js.Any])
      
      inline def setColorsTo(value: js.Tuple2[String, String]): Self = StObject.set(x, "colorsTo", value.asInstanceOf[js.Any])
      
      inline def setIsLooping(value: Boolean): Self = StObject.set(x, "isLooping", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var customDirection: js.UndefOr[X0] = js.undefined
    
    var defaultStateName: js.UndefOr[String] = js.undefined
    
    var direction: js.UndefOr[diagonal | `left-right` | `top-bottom` | radial | custom] = js.undefined
    
    var elToSetClassOn: js.UndefOr[String] = js.undefined
    
    var element: String | HTMLCanvasElement
    
    var image: js.UndefOr[Image] = js.undefined
    
    var isPausedWhenNotInView: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onGradientChange: js.UndefOr[js.Function1[/* colorDetails */ OnGradientChangeObject, Unit]] = js.undefined
    
    var onStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var scrollDebounceThreshold: js.UndefOr[Double] = js.undefined
    
    var stateTransitionSpeed: js.UndefOr[Double] = js.undefined
    
    var states: StringDictionary[State]
  }
  object Options {
    
    inline def apply(element: String | HTMLCanvasElement, states: StringDictionary[State]): Options = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCustomDirection(value: X0): Self = StObject.set(x, "customDirection", value.asInstanceOf[js.Any])
      
      inline def setCustomDirectionUndefined: Self = StObject.set(x, "customDirection", js.undefined)
      
      inline def setDefaultStateName(value: String): Self = StObject.set(x, "defaultStateName", value.asInstanceOf[js.Any])
      
      inline def setDefaultStateNameUndefined: Self = StObject.set(x, "defaultStateName", js.undefined)
      
      inline def setDirection(value: diagonal | `left-right` | `top-bottom` | radial | custom): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setElToSetClassOn(value: String): Self = StObject.set(x, "elToSetClassOn", value.asInstanceOf[js.Any])
      
      inline def setElToSetClassOnUndefined: Self = StObject.set(x, "elToSetClassOn", js.undefined)
      
      inline def setElement(value: String | HTMLCanvasElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setImage(value: Image): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setIsPausedWhenNotInView(value: Boolean): Self = StObject.set(x, "isPausedWhenNotInView", value.asInstanceOf[js.Any])
      
      inline def setIsPausedWhenNotInViewUndefined: Self = StObject.set(x, "isPausedWhenNotInView", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnEnd(value: Callback): Self = StObject.set(x, "onEnd", value.toJsFn)
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      inline def setOnGradientChange(value: /* colorDetails */ OnGradientChangeObject => Callback): Self = StObject.set(x, "onGradientChange", js.Any.fromFunction1((t0: /* colorDetails */ OnGradientChangeObject) => value(t0).runNow()))
      
      inline def setOnGradientChangeUndefined: Self = StObject.set(x, "onGradientChange", js.undefined)
      
      inline def setOnStart(value: Callback): Self = StObject.set(x, "onStart", value.toJsFn)
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      inline def setScrollDebounceThreshold(value: Double): Self = StObject.set(x, "scrollDebounceThreshold", value.asInstanceOf[js.Any])
      
      inline def setScrollDebounceThresholdUndefined: Self = StObject.set(x, "scrollDebounceThreshold", js.undefined)
      
      inline def setStateTransitionSpeed(value: Double): Self = StObject.set(x, "stateTransitionSpeed", value.asInstanceOf[js.Any])
      
      inline def setStateTransitionSpeedUndefined: Self = StObject.set(x, "stateTransitionSpeed", js.undefined)
      
      inline def setStates(value: StringDictionary[State]): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    }
  }
  
  trait State extends StObject {
    
    var gradients: js.Array[js.Array[Gradient | String]]
    
    var loop: js.UndefOr[Boolean] = js.undefined
    
    var transitionSpeed: js.UndefOr[Double] = js.undefined
  }
  object State {
    
    inline def apply(gradients: js.Array[js.Array[Gradient | String]]): State = {
      val __obj = js.Dynamic.literal(gradients = gradients.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setGradients(value: js.Array[js.Array[Gradient | String]]): Self = StObject.set(x, "gradients", value.asInstanceOf[js.Any])
      
      inline def setGradientsVarargs(value: (js.Array[Gradient | String])*): Self = StObject.set(x, "gradients", js.Array(value*))
      
      inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setTransitionSpeed(value: Double): Self = StObject.set(x, "transitionSpeed", value.asInstanceOf[js.Any])
      
      inline def setTransitionSpeedUndefined: Self = StObject.set(x, "transitionSpeed", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.granim.granimStrings.none
    - typingsJapgolly.granim.granimStrings.stretch
    - typingsJapgolly.granim.granimStrings.`stretch-if-smaller`
    - typingsJapgolly.granim.granimStrings.`stretch-if-bigger`
  */
  trait StretchMode extends StObject
  object StretchMode {
    
    inline def none: typingsJapgolly.granim.granimStrings.none = "none".asInstanceOf[typingsJapgolly.granim.granimStrings.none]
    
    inline def stretch: typingsJapgolly.granim.granimStrings.stretch = "stretch".asInstanceOf[typingsJapgolly.granim.granimStrings.stretch]
    
    inline def `stretch-if-bigger`: typingsJapgolly.granim.granimStrings.`stretch-if-bigger` = "stretch-if-bigger".asInstanceOf[typingsJapgolly.granim.granimStrings.`stretch-if-bigger`]
    
    inline def `stretch-if-smaller`: typingsJapgolly.granim.granimStrings.`stretch-if-smaller` = "stretch-if-smaller".asInstanceOf[typingsJapgolly.granim.granimStrings.`stretch-if-smaller`]
  }
}
