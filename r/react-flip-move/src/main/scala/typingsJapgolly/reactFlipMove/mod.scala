package typingsJapgolly.reactFlipMove

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactFlipMove.anon.PartialCSSStyleDeclaratio
import typingsJapgolly.reactFlipMove.mod.FlipMove.FlipMoveProps
import typingsJapgolly.std.ClientRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-flip-move", JSImport.Default)
  @js.native
  open class default () extends Component[FlipMoveProps, Any, Any]
  
  object FlipMove {
    
    trait Animation
      extends StObject
         with _AnimationProp {
      
      var from: PartialCSSStyleDeclaratio
      
      var to: PartialCSSStyleDeclaratio
    }
    object Animation {
      
      inline def apply(from: PartialCSSStyleDeclaratio, to: PartialCSSStyleDeclaratio): Animation = {
        val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
        __obj.asInstanceOf[Animation]
      }
      
      extension [Self <: Animation](x: Self) {
        
        inline def setFrom(value: PartialCSSStyleDeclaratio): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
        
        inline def setTo(value: PartialCSSStyleDeclaratio): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.reactFlipMove.reactFlipMoveStrings.elevator
      - typingsJapgolly.reactFlipMove.reactFlipMoveStrings.fade
      - typingsJapgolly.reactFlipMove.reactFlipMoveStrings.accordionVertical
      - typingsJapgolly.reactFlipMove.reactFlipMoveStrings.accordionHorizontal
      - typingsJapgolly.reactFlipMove.reactFlipMoveStrings.none
    */
    trait AnimationPreset
      extends StObject
         with _AnimationProp
    object AnimationPreset {
      
      inline def accordionHorizontal: typingsJapgolly.reactFlipMove.reactFlipMoveStrings.accordionHorizontal = "accordionHorizontal".asInstanceOf[typingsJapgolly.reactFlipMove.reactFlipMoveStrings.accordionHorizontal]
      
      inline def accordionVertical: typingsJapgolly.reactFlipMove.reactFlipMoveStrings.accordionVertical = "accordionVertical".asInstanceOf[typingsJapgolly.reactFlipMove.reactFlipMoveStrings.accordionVertical]
      
      inline def elevator: typingsJapgolly.reactFlipMove.reactFlipMoveStrings.elevator = "elevator".asInstanceOf[typingsJapgolly.reactFlipMove.reactFlipMoveStrings.elevator]
      
      inline def fade: typingsJapgolly.reactFlipMove.reactFlipMoveStrings.fade = "fade".asInstanceOf[typingsJapgolly.reactFlipMove.reactFlipMoveStrings.fade]
      
      inline def none: typingsJapgolly.reactFlipMove.reactFlipMoveStrings.none = "none".asInstanceOf[typingsJapgolly.reactFlipMove.reactFlipMoveStrings.none]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.reactFlipMove.mod.FlipMove.AnimationPreset
      - typingsJapgolly.reactFlipMove.mod.FlipMove.Animation
      - scala.Boolean
    */
    type AnimationProp = _AnimationProp | Boolean
    
    trait FlipMoveProps extends StObject {
      
      /**
        * Control the appear animation that runs when the component mounts. Works identically to enterAnimation below, but
        * only fires on the initial children.
        */
      var appearAnimation: js.UndefOr[AnimationProp] = js.undefined
      
      var className: js.UndefOr[String] = js.undefined
      
      /**
        * The length, in milliseconds, to wait before the animation begins.
        *
        * @default 0
        */
      var delay: js.UndefOr[Double | String] = js.undefined
      
      /**
        * Sometimes, you may wish to temporarily disable the animations and have the normal behaviour resumed. Setting this
        * flag to true skips all animations.
        *
        * @default false
        */
      var disableAllAnimations: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The length, in milliseconds, that the transition ought to take.
        *
        * @default 350
        */
      var duration: js.UndefOr[Double | String] = js.undefined
      
      /**
        * Any valid CSS3 timing function (eg. "linear", "ease-in", "cubic-bezier(1, 0, 0, 1)").
        *
        * @default "ease-in-out"
        */
      var easing: js.UndefOr[String] = js.undefined
      
      /**
        * Control the onEnter animation that runs when new items are added to the DOM.
        *
        * Accepts several types:
        *
        * **String:** You can enter one of the following presets to select that as your enter animation:
        *
        *   - `elevator` (default)
        *   - `fade`
        *   - `accordionVertical`
        *   - `accordionHorizontal`
        *   - `none`
        *
        * **Boolean:** You can enter `false` to disable the enter animation, or `true` to select the default enter animation (elevator).
        *
        * **Object:** For fully granular control, you can pass in an object that contains the styles you'd like to animate.
        *
        * It requires two keys: `from` and `to`. Each key holds an object of CSS properties. You can supply any valid
        * camelCase CSS properties, and flip-move will transition between the two, over the course of the specified
        * `duration`.
        *
        * Example:
        *
        *     const customEnterAnimation = {
        *       from: { transform: 'scale(0.5, 1)' },
        *       to:   { transform: 'scale(1, 1)' }
        *     };
        *
        *     <FlipMove enterAnimation={customEnterAnimation}>
        *          {renderChildren()}
        *     </FlipMove>
        *
        * @default "elevator"
        */
      var enterAnimation: js.UndefOr[AnimationProp] = js.undefined
      
      /**
        * This function is called with a DOM node as the only argument. It should return an object as specified by the
        * getBoundingClientRect() spec.
        *
        * For normal usage of FlipMove you won't need this. An example of usage is when FlipMove is used in a container
        * that is scaled using CSS. You can correct the values from getBoundingClientRect by using this prop.
        */
      var getPosition: js.UndefOr[js.Function1[/* node */ HTMLElement, ClientRect]] = js.undefined
      
      /**
        * Control the onLeave animation that runs when new items are removed from the DOM.
        *
        * This property functions identically to `enterAnimation`.
        *
        * @default "elevator"
        */
      var leaveAnimation: js.UndefOr[AnimationProp] = js.undefined
      
      /**
        * Do not collapse container height until after leaving animations complete.
        *
        * When false, children are immediately removed from the DOM flow as they animate away. Setting this value to true
        * will maintain the height of the container until after their leaving animation completes.
        *
        * @default false
        */
      var maintainContainerHeight: js.UndefOr[Boolean] = js.undefined
      
      /**
        * A callback to be invoked **once per child element** at the end of the animation.
        *
        * In general, it is advisable to ignore the `domNode` argument and work with the `childElement`. The `domNode` is
        * just an escape hatch for doing complex things not otherwise possible.
        *
        * @param childElement  A reference to the React Element being animated.
        * @param domNode       A reference to the unadulterated DOM node being animated.
        */
      var onFinish: js.UndefOr[js.Function2[/* childElement */ Element, /* domNode */ HTMLElement, Unit]] = js.undefined
      
      /**
        * A callback to be invoked **once per group** at the end of the animation.
        *
        * The callback arguments are similar to the ones provided for onFinish, except we provide an array of the elements
        * and nodes. The order of both arguments is guaranteed; this means you can use a zipping function like lodash's
        * .zip to get pairs of element/node, if needed.
        *
        * In general, it is advisable to ignore the `domNodes` argument and work with the `childElements` The `domNodes`
        * are just an escape hatch for doing complex things not otherwise possible.
        *
        * @param childElements An array of the references to the React Element(s) being animated.
        * @param domNodes      An array of the references to the unadulterated DOM node(s) being animated.
        */
      var onFinishAll: js.UndefOr[
            js.Function2[/* childElements */ js.Array[Element], /* domNodes */ js.Array[HTMLElement], Unit]
          ] = js.undefined
      
      /**
        * A callback to be invoked **once per child element** at the start of the animation.
        *
        * In general, it is advisable to ignore the domNode argument and work with the childElement. The domNode is just
        * an escape hatch for doing complex things not otherwise possible.
        *
        * @param childElement  A reference to the React Element being animated.
        * @param domNode       A reference to the unadulterated DOM node being animated.
        */
      var onStart: js.UndefOr[js.Function2[/* childElement */ Element, /* domNode */ HTMLElement, Unit]] = js.undefined
      
      /**
        * A callback to be invoked **once per group** at the start of the animation.
        *
        * The callback arguments are similar to the ones provided for onStart, except we provide an array of the elements
        * and nodes. The order of both arguments is guaranteed; this means you can use a zipping function like lodash's
        * .zip to get pairs of element/node, if needed.
        *
        * In general, it is advisable to ignore the `domNodes` argument and work with the `childElements` The `domNodes`
        *
        * are just an escape hatch for doing complex things not otherwise possible.
        *
        * @param childElements An array of the references to the React Element(s) being animated.
        * @param domNodes      An array of the references to the unadulterated DOM node(s) being animated.
        */
      var onStartAll: js.UndefOr[
            js.Function2[/* childElements */ js.Array[Element], /* domNodes */ js.Array[HTMLElement], Unit]
          ] = js.undefined
      
      /**
        * The length, in milliseconds, to be added to the delay of each subsequent element.
        *
        * For example, if you are animating 4 elements with a `delay` of 0 and a `staggerDelayBy` of 20:
        *
        * - The first element will start transitioning immediately.
        * - The second element will start transitioning after 20ms.
        * - The third element will start transitioning after 40ms.
        * - The fourth element will start transitioning after 60ms.
        *
        * Similarly to staggerDurationBy, This effect is great for "humanizing" transitions and making them feel less
        * robotic.
        *
        * **Protip**: You can make elements animate one-at-a-time by using an identical duration and staggerDelayBy.
        *
        * @default 0
        */
      var staggerDelayBy: js.UndefOr[Double | String] = js.undefined
      
      /**
        * The length, in milliseconds, to be added to the duration of each subsequent element.
        *
        * For example, if you are animating 4 elements with a `duration` of 200 and a `staggerDurationBy` of 20:
        *
        * - The first element will take 200ms to transition.
        * - The second element will take 220ms to transition.
        * - The third element will take 240ms to transition.
        * - The fourth element will take 260ms to transition.
        *
        * This effect is great for "humanizing" transitions and making them feel less robotic.
        *
        * @default 0
        */
      var staggerDurationBy: js.UndefOr[Double | String] = js.undefined
      
      var style: js.UndefOr[Styles] = js.undefined
      
      /**
        * Flip Move wraps your children in a container element. By default, this element is a div, but you may wish to
        * provide a custom HTML element (for example, if your children are list items, you may wish to set this to ul).
        *
        * Any valid HTML element type is accepted, but peculiar things may happen if you use an unconventional element.
        *
        * @default "div"
        */
      var typeName: js.UndefOr[String | Null] = js.undefined
      
      /**
        * @default "top"
        */
      var verticalAlignment: js.UndefOr[String] = js.undefined
    }
    object FlipMoveProps {
      
      inline def apply(): FlipMoveProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[FlipMoveProps]
      }
      
      extension [Self <: FlipMoveProps](x: Self) {
        
        inline def setAppearAnimation(value: AnimationProp): Self = StObject.set(x, "appearAnimation", value.asInstanceOf[js.Any])
        
        inline def setAppearAnimationUndefined: Self = StObject.set(x, "appearAnimation", js.undefined)
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setDelay(value: Double | String): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
        
        inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
        
        inline def setDisableAllAnimations(value: Boolean): Self = StObject.set(x, "disableAllAnimations", value.asInstanceOf[js.Any])
        
        inline def setDisableAllAnimationsUndefined: Self = StObject.set(x, "disableAllAnimations", js.undefined)
        
        inline def setDuration(value: Double | String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
        
        inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
        
        inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
        
        inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
        
        inline def setEnterAnimation(value: AnimationProp): Self = StObject.set(x, "enterAnimation", value.asInstanceOf[js.Any])
        
        inline def setEnterAnimationUndefined: Self = StObject.set(x, "enterAnimation", js.undefined)
        
        inline def setGetPosition(value: /* node */ HTMLElement => ClientRect): Self = StObject.set(x, "getPosition", js.Any.fromFunction1(value))
        
        inline def setGetPositionUndefined: Self = StObject.set(x, "getPosition", js.undefined)
        
        inline def setLeaveAnimation(value: AnimationProp): Self = StObject.set(x, "leaveAnimation", value.asInstanceOf[js.Any])
        
        inline def setLeaveAnimationUndefined: Self = StObject.set(x, "leaveAnimation", js.undefined)
        
        inline def setMaintainContainerHeight(value: Boolean): Self = StObject.set(x, "maintainContainerHeight", value.asInstanceOf[js.Any])
        
        inline def setMaintainContainerHeightUndefined: Self = StObject.set(x, "maintainContainerHeight", js.undefined)
        
        inline def setOnFinish(value: (/* childElement */ Element, /* domNode */ HTMLElement) => Callback): Self = StObject.set(x, "onFinish", js.Any.fromFunction2((t0: /* childElement */ Element, t1: /* domNode */ HTMLElement) => (value(t0, t1)).runNow()))
        
        inline def setOnFinishAll(value: (/* childElements */ js.Array[Element], /* domNodes */ js.Array[HTMLElement]) => Callback): Self = StObject.set(x, "onFinishAll", js.Any.fromFunction2((t0: /* childElements */ js.Array[Element], t1: /* domNodes */ js.Array[HTMLElement]) => (value(t0, t1)).runNow()))
        
        inline def setOnFinishAllUndefined: Self = StObject.set(x, "onFinishAll", js.undefined)
        
        inline def setOnFinishUndefined: Self = StObject.set(x, "onFinish", js.undefined)
        
        inline def setOnStart(value: (/* childElement */ Element, /* domNode */ HTMLElement) => Callback): Self = StObject.set(x, "onStart", js.Any.fromFunction2((t0: /* childElement */ Element, t1: /* domNode */ HTMLElement) => (value(t0, t1)).runNow()))
        
        inline def setOnStartAll(value: (/* childElements */ js.Array[Element], /* domNodes */ js.Array[HTMLElement]) => Callback): Self = StObject.set(x, "onStartAll", js.Any.fromFunction2((t0: /* childElements */ js.Array[Element], t1: /* domNodes */ js.Array[HTMLElement]) => (value(t0, t1)).runNow()))
        
        inline def setOnStartAllUndefined: Self = StObject.set(x, "onStartAll", js.undefined)
        
        inline def setOnStartUndefined: Self = StObject.set(x, "onStart", js.undefined)
        
        inline def setStaggerDelayBy(value: Double | String): Self = StObject.set(x, "staggerDelayBy", value.asInstanceOf[js.Any])
        
        inline def setStaggerDelayByUndefined: Self = StObject.set(x, "staggerDelayBy", js.undefined)
        
        inline def setStaggerDurationBy(value: Double | String): Self = StObject.set(x, "staggerDurationBy", value.asInstanceOf[js.Any])
        
        inline def setStaggerDurationByUndefined: Self = StObject.set(x, "staggerDurationBy", js.undefined)
        
        inline def setStyle(value: Styles): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
        
        inline def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
        
        inline def setTypeNameNull: Self = StObject.set(x, "typeName", null)
        
        inline def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
        
        inline def setVerticalAlignment(value: String): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
        
        inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
      }
    }
    
    type Styles = StringDictionary[String | Double]
    
    trait _AnimationProp extends StObject
  }
  type FlipMove = japgolly.scalajs.react.facade.React.Component[FlipMoveProps & js.Object, js.Object]
}
