package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.bottom
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.bottomEnd
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.bottomStart
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.center
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.enterEasing
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.exitEasing
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.left
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.right
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.standardEasing
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.top
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.topEnd
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.topStart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTransitionTransitionDottypesMod {
  
  trait Collapse extends StObject {
    
    var delay: js.UndefOr[Delay] = js.undefined
    
    var direction: Direction
    
    var duration: Duration
    
    var easing: js.UndefOr[exitEasing | standardEasing] = js.undefined
  }
  object Collapse {
    
    inline def apply(direction: Direction, duration: Duration): Collapse = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
      __obj.asInstanceOf[Collapse]
    }
    
    extension [Self <: Collapse](x: Self) {
      
      inline def setDelay(value: Delay): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEasing(value: exitEasing | standardEasing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.short
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.long
  */
  trait Delay extends StObject
  object Delay {
    
    inline def long: typingsJapgolly.wixStyleReact.wixStyleReactStrings.long = "long".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.long]
    
    inline def medium: typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def short: typingsJapgolly.wixStyleReact.wixStyleReactStrings.short = "short".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.short]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.topToBottom
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.bottomToTop
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.leftToRight
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.rightToLeft
  */
  trait Direction extends StObject
  object Direction {
    
    inline def bottomToTop: typingsJapgolly.wixStyleReact.wixStyleReactStrings.bottomToTop = "bottomToTop".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.bottomToTop]
    
    inline def leftToRight: typingsJapgolly.wixStyleReact.wixStyleReactStrings.leftToRight = "leftToRight".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.leftToRight]
    
    inline def rightToLeft: typingsJapgolly.wixStyleReact.wixStyleReactStrings.rightToLeft = "rightToLeft".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.rightToLeft]
    
    inline def topToBottom: typingsJapgolly.wixStyleReact.wixStyleReactStrings.topToBottom = "topToBottom".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.topToBottom]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.fast01
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.fast02
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium01
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium02
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.slow01
    - typingsJapgolly.wixStyleReact.wixStyleReactStrings.slow02
  */
  trait Duration extends StObject
  object Duration {
    
    inline def fast01: typingsJapgolly.wixStyleReact.wixStyleReactStrings.fast01 = "fast01".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.fast01]
    
    inline def fast02: typingsJapgolly.wixStyleReact.wixStyleReactStrings.fast02 = "fast02".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.fast02]
    
    inline def medium01: typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium01 = "medium01".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium01]
    
    inline def medium02: typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium02 = "medium02".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.medium02]
    
    inline def slow01: typingsJapgolly.wixStyleReact.wixStyleReactStrings.slow01 = "slow01".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.slow01]
    
    inline def slow02: typingsJapgolly.wixStyleReact.wixStyleReactStrings.slow02 = "slow02".asInstanceOf[typingsJapgolly.wixStyleReact.wixStyleReactStrings.slow02]
  }
  
  trait EnterAnimation extends StObject {
    
    var expand: js.UndefOr[Expand | Boolean] = js.undefined
    
    var fadeIn: js.UndefOr[FadeIn | Boolean] = js.undefined
    
    var moveIn: js.UndefOr[MoveIn | Boolean] = js.undefined
    
    var scaleUp: js.UndefOr[ScaleUp | Boolean] = js.undefined
  }
  object EnterAnimation {
    
    inline def apply(): EnterAnimation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnterAnimation]
    }
    
    extension [Self <: EnterAnimation](x: Self) {
      
      inline def setExpand(value: Expand | Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      inline def setFadeIn(value: FadeIn | Boolean): Self = StObject.set(x, "fadeIn", value.asInstanceOf[js.Any])
      
      inline def setFadeInUndefined: Self = StObject.set(x, "fadeIn", js.undefined)
      
      inline def setMoveIn(value: MoveIn | Boolean): Self = StObject.set(x, "moveIn", value.asInstanceOf[js.Any])
      
      inline def setMoveInUndefined: Self = StObject.set(x, "moveIn", js.undefined)
      
      inline def setScaleUp(value: ScaleUp | Boolean): Self = StObject.set(x, "scaleUp", value.asInstanceOf[js.Any])
      
      inline def setScaleUpUndefined: Self = StObject.set(x, "scaleUp", js.undefined)
    }
  }
  
  trait ExitAnimation extends StObject {
    
    var collapse: js.UndefOr[Collapse | Boolean] = js.undefined
    
    var fadeOut: js.UndefOr[FadeOut | Boolean] = js.undefined
    
    var moveOut: js.UndefOr[MoveOut | Boolean] = js.undefined
    
    var scaleDown: js.UndefOr[ScaleDown | Boolean] = js.undefined
  }
  object ExitAnimation {
    
    inline def apply(): ExitAnimation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExitAnimation]
    }
    
    extension [Self <: ExitAnimation](x: Self) {
      
      inline def setCollapse(value: Collapse | Boolean): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
      
      inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
      
      inline def setFadeOut(value: FadeOut | Boolean): Self = StObject.set(x, "fadeOut", value.asInstanceOf[js.Any])
      
      inline def setFadeOutUndefined: Self = StObject.set(x, "fadeOut", js.undefined)
      
      inline def setMoveOut(value: MoveOut | Boolean): Self = StObject.set(x, "moveOut", value.asInstanceOf[js.Any])
      
      inline def setMoveOutUndefined: Self = StObject.set(x, "moveOut", js.undefined)
      
      inline def setScaleDown(value: ScaleDown | Boolean): Self = StObject.set(x, "scaleDown", value.asInstanceOf[js.Any])
      
      inline def setScaleDownUndefined: Self = StObject.set(x, "scaleDown", js.undefined)
    }
  }
  
  trait Expand extends StObject {
    
    var delay: js.UndefOr[Delay] = js.undefined
    
    var direction: Direction
    
    var duration: Duration
    
    var easing: js.UndefOr[enterEasing | standardEasing] = js.undefined
  }
  object Expand {
    
    inline def apply(direction: Direction, duration: Duration): Expand = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
      __obj.asInstanceOf[Expand]
    }
    
    extension [Self <: Expand](x: Self) {
      
      inline def setDelay(value: Delay): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEasing(value: enterEasing | standardEasing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    }
  }
  
  trait FadeIn extends StObject {
    
    var delay: js.UndefOr[Delay] = js.undefined
    
    var duration: Duration
    
    var easing: js.UndefOr[enterEasing | standardEasing] = js.undefined
  }
  object FadeIn {
    
    inline def apply(duration: Duration): FadeIn = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
      __obj.asInstanceOf[FadeIn]
    }
    
    extension [Self <: FadeIn](x: Self) {
      
      inline def setDelay(value: Delay): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDuration(value: Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEasing(value: enterEasing | standardEasing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    }
  }
  
  trait FadeOut extends StObject {
    
    var delay: js.UndefOr[Delay] = js.undefined
    
    var duration: Duration
    
    var easing: js.UndefOr[exitEasing | standardEasing] = js.undefined
  }
  object FadeOut {
    
    inline def apply(duration: Duration): FadeOut = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
      __obj.asInstanceOf[FadeOut]
    }
    
    extension [Self <: FadeOut](x: Self) {
      
      inline def setDelay(value: Delay): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDuration(value: Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEasing(value: exitEasing | standardEasing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    }
  }
  
  trait MoveIn extends StObject {
    
    var delay: js.UndefOr[Delay] = js.undefined
    
    var direction: Direction
    
    var distance: String
    
    var duration: Duration
    
    var easing: js.UndefOr[enterEasing | standardEasing] = js.undefined
  }
  object MoveIn {
    
    inline def apply(direction: Direction, distance: String, duration: Duration): MoveIn = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
      __obj.asInstanceOf[MoveIn]
    }
    
    extension [Self <: MoveIn](x: Self) {
      
      inline def setDelay(value: Delay): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDistance(value: String): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEasing(value: enterEasing | standardEasing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    }
  }
  
  trait MoveOut extends StObject {
    
    var delay: js.UndefOr[Delay] = js.undefined
    
    var direction: Direction
    
    var distance: String
    
    var duration: Duration
    
    var easing: js.UndefOr[exitEasing | standardEasing] = js.undefined
  }
  object MoveOut {
    
    inline def apply(direction: Direction, distance: String, duration: Duration): MoveOut = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
      __obj.asInstanceOf[MoveOut]
    }
    
    extension [Self <: MoveOut](x: Self) {
      
      inline def setDelay(value: Delay): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDistance(value: String): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEasing(value: exitEasing | standardEasing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
    }
  }
  
  trait ScaleDown extends StObject {
    
    var delay: js.UndefOr[Delay] = js.undefined
    
    var direction: center | top | topEnd | right | bottomEnd | bottom | bottomStart | left | topStart
    
    var duration: Duration
    
    var easing: js.UndefOr[exitEasing | standardEasing] = js.undefined
    
    var scale: String
  }
  object ScaleDown {
    
    inline def apply(
      direction: center | top | topEnd | right | bottomEnd | bottom | bottomStart | left | topStart,
      duration: Duration,
      scale: String
    ): ScaleDown = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScaleDown]
    }
    
    extension [Self <: ScaleDown](x: Self) {
      
      inline def setDelay(value: Delay): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDirection(value: center | top | topEnd | right | bottomEnd | bottom | bottomStart | left | topStart): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEasing(value: exitEasing | standardEasing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setScale(value: String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScaleUp extends StObject {
    
    var delay: js.UndefOr[Delay] = js.undefined
    
    var direction: center | top | topEnd | right | bottomEnd | bottom | bottomStart | left | topStart
    
    var duration: Duration
    
    var easing: js.UndefOr[enterEasing | standardEasing] = js.undefined
    
    var scale: String
  }
  object ScaleUp {
    
    inline def apply(
      direction: center | top | topEnd | right | bottomEnd | bottom | bottomStart | left | topStart,
      duration: Duration,
      scale: String
    ): ScaleUp = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScaleUp]
    }
    
    extension [Self <: ScaleUp](x: Self) {
      
      inline def setDelay(value: Delay): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDirection(value: center | top | topEnd | right | bottomEnd | bottom | bottomStart | left | topStart): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEasing(value: enterEasing | standardEasing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setScale(value: String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransitionProps extends StObject {
    
    /** Shows enter animation on component mount. */
    var animateOnLoad: js.UndefOr[Boolean] = js.undefined
    
    /** Allows to render any component as a child item. */
    var children: js.UndefOr[Node] = js.undefined
    
    /** Applies a data-hook HTML attribute to be used in the tests. */
    var dataHook: js.UndefOr[String] = js.undefined
    
    /**
      Sets a type of animation that happens on enter animation.
      * - fadeIn -
      ```javascript
      {
      delay?: 'short' | 'medium' | 'long';
      duration:
      | 'fast01'
      | 'fast02'
      | 'medium01'
      | 'medium02'
      | 'slow01'
      | 'slow02';
      easing?: 'enterEasing' | 'standardEasing';
      }
      ```
      * - moveIn -
      ```javascript
      {
      delay?: 'short' | 'medium' | 'long';
      direction:
      | 'topToBottom'
      | 'bottomToTop'
      | 'leftToRight'
      | 'rightToLeft';
      distance: string;
      duration:
      | 'fast01'
      | 'fast02'
      | 'medium01'
      | 'medium02'
      | 'slow01'
      | 'slow02';
      easing?: 'enterEasing' | 'standardEasing';
      }
      ```
      * - expand -
      ```javascript
      {
      delay?: 'short' | 'medium' | 'long';
      direction:
      | 'topToBottom'
      | 'bottomToTop'
      | 'leftToRight'
      | 'rightToLeft';
      duration:
      | 'fast01'
      | 'fast02'
      | 'medium01'
      | 'medium02'
      | 'slow01'
      | 'slow02';
      easing?: 'enterEasing' | 'standardEasing';
      }
      ```
      * - scaleUp -
      ```javascript
      {
      delay?: 'short' | 'medium' | 'long';
      direction:
      | 'center'
      | 'top'
      | 'topEnd'
      | 'right'
      | 'bottomEnd'
      | 'bottom'
      | 'bottomStart'
      | 'left'
      | 'topStart';
      duration:
      | 'fast01'
      | 'fast02'
      | 'medium01'
      | 'medium02'
      | 'slow01'
      | 'slow02';
      easing?: 'enterEasing' | 'standardEasing';
      scale: string;
      }
      ```
      */
    var enterAnimation: js.UndefOr[EnterAnimation] = js.undefined
    
    /**
      Sets a type of animation that happens on exit animation.
      * - fadeOut -
      ```javascript
      {
      delay?: 'short' | 'medium' | 'long';
      duration:
      | 'fast01'
      | 'fast02'
      | 'medium01'
      | 'medium02'
      | 'slow01'
      | 'slow02';
      easing?: 'exitEasing' | 'standardEasing';
      }
      ```
      * - moveOut -
      ```javascript
      {
      delay?: 'short' | 'medium' | 'long';
      direction:
      | 'topToBottom'
      | 'bottomToTop'
      | 'leftToRight'
      | 'rightToLeft';
      distance: string;
      duration:
      | 'fast01'
      | 'fast02'
      | 'medium01'
      | 'medium02'
      | 'slow01'
      | 'slow02';
      easing?: 'exitEasing' | 'standardEasing'
      }
      ```
      * - collapse -
      ```javascript
      {
      delay?: 'short' | 'medium' | 'long';
      direction:
      | 'topToBottom'
      | 'bottomToTop'
      | 'leftToRight'
      | 'rightToLeft';
      duration:
      | 'fast01'
      | 'fast02'
      | 'medium01'
      | 'medium02'
      | 'slow01'
      | 'slow02';
      easing?: 'exitEasing' | 'standardEasing';
      }
      ```
      * - scaleDown -
      ```javascript
      {
      delay?: 'short' | 'medium' | 'long';
      direction:
      | 'center'
      | 'top'
      | 'topEnd'
      | 'right'
      | 'bottomEnd'
      | 'bottom'
      | 'bottomStart'
      | 'left'
      | 'topStart';
      duration:
      | 'fast01'
      | 'fast02'
      | 'medium01'
      | 'medium02'
      | 'slow01'
      | 'slow02';
      easing?: 'exitEasing' | 'standardEasing';
      scale: string;
      }
      ```
      */
    var exitAnimation: js.UndefOr[ExitAnimation] = js.undefined
    
    /** Lazy-mounts the component. If false, will be mounted immediately. It true, will be mounted with first enter. */
    var mountOnEnter: js.UndefOr[Boolean] = js.undefined
    
    /** Defines a callback function which is called immediately after the animation ends. */
    var onEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Defines a callback function which is called immediately after the animation starts. */
    var onStart: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Shows animation when set to true. */
    var show: js.UndefOr[Boolean] = js.undefined
    
    /** Unmounts the component after it finishes exiting. If false, will stay mounted after exit. */
    var unmountOnExit: js.UndefOr[Boolean] = js.undefined
  }
  object TransitionProps {
    
    inline def apply(): TransitionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransitionProps]
    }
    
    extension [Self <: TransitionProps](x: Self) {
      
      inline def setAnimateOnLoad(value: Boolean): Self = StObject.set(x, "animateOnLoad", value.asInstanceOf[js.Any])
      
      inline def setAnimateOnLoadUndefined: Self = StObject.set(x, "animateOnLoad", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setEnterAnimation(value: EnterAnimation): Self = StObject.set(x, "enterAnimation", value.asInstanceOf[js.Any])
      
      inline def setEnterAnimationUndefined: Self = StObject.set(x, "enterAnimation", js.undefined)
      
      inline def setExitAnimation(value: ExitAnimation): Self = StObject.set(x, "exitAnimation", value.asInstanceOf[js.Any])
      
      inline def setExitAnimationUndefined: Self = StObject.set(x, "exitAnimation", js.undefined)
      
      inline def setMountOnEnter(value: Boolean): Self = StObject.set(x, "mountOnEnter", value.asInstanceOf[js.Any])
      
      inline def setMountOnEnterUndefined: Self = StObject.set(x, "mountOnEnter", js.undefined)
      
      inline def setOnEnd(value: Callback): Self = StObject.set(x, "onEnd", value.toJsFn)
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      inline def setOnStart(value: Callback): Self = StObject.set(x, "onStart", value.toJsFn)
      
      inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setUnmountOnExit(value: Boolean): Self = StObject.set(x, "unmountOnExit", value.asInstanceOf[js.Any])
      
      inline def setUnmountOnExitUndefined: Self = StObject.set(x, "unmountOnExit", js.undefined)
    }
  }
}
