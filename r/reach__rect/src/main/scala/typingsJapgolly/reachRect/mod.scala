package typingsJapgolly.reachRect

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.DOMRect
import org.scalajs.dom.Element
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@reach/rect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Welcome to @reach/rect!
    *
    * Measures DOM elements (aka. bounding client rect).
    *
    * @see getBoundingClientRect https://developer.mozilla.org/en-US/docs/Web/API/Element/getBoundingClientRect
    * @see Docs                  https://reach.tech/rect
    * @see Source                https://github.com/reach/reach-ui/tree/main/packages/rect
    */
  /**
    * Rect
    *
    * @param props
    */
  @JSImport("@reach/rect", "Rect")
  @js.native
  val Rect: FC[RectProps] = js.native
  
  inline def useRect[T /* <: Element */](nodeRef: RefHandle[js.UndefOr[Null | T]]): Null | DOMRect = ^.asInstanceOf[js.Dynamic].applyDynamic("useRect")(nodeRef.asInstanceOf[js.Any]).asInstanceOf[Null | DOMRect]
  inline def useRect[T /* <: Element */](nodeRef: RefHandle[js.UndefOr[T | Null]], observe: js.UndefOr[Boolean]): Null | DOMRect = (^.asInstanceOf[js.Dynamic].applyDynamic("useRect")(nodeRef.asInstanceOf[js.Any], observe.asInstanceOf[js.Any])).asInstanceOf[Null | DOMRect]
  inline def useRect[T /* <: Element */](
    nodeRef: RefHandle[js.UndefOr[T | Null]],
    observe: js.UndefOr[Boolean],
    onChange: js.UndefOr[js.Function1[/* rect */ PRect, Unit]]
  ): Null | DOMRect = (^.asInstanceOf[js.Dynamic].applyDynamic("useRect")(nodeRef.asInstanceOf[js.Any], observe.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[Null | DOMRect]
  inline def useRect[T /* <: Element */](
    nodeRef: RefHandle[js.UndefOr[T | Null]],
    observe: Unit,
    onChange: js.UndefOr[js.Function1[/* rect */ PRect, Unit]]
  ): Null | DOMRect = (^.asInstanceOf[js.Dynamic].applyDynamic("useRect")(nodeRef.asInstanceOf[js.Any], observe.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[Null | DOMRect]
  inline def useRect[T /* <: Element */](nodeRef: RefHandle[js.UndefOr[T | Null]], options: UseRectOptions): Null | DOMRect = (^.asInstanceOf[js.Dynamic].applyDynamic("useRect")(nodeRef.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Null | DOMRect]
  
  /* Inlined std.Partial<std.DOMRect> & { readonly bottom :number,  readonly height :number,  readonly left :number,  readonly right :number,  readonly top :number,  readonly width :number} */
  trait PRect extends StObject {
    
    var bottom: js.UndefOr[Double] & Double
    
    var height: js.UndefOr[Double] & Double
    
    var left: js.UndefOr[Double] & Double
    
    var right: js.UndefOr[Double] & Double
    
    var toJSON: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var top: js.UndefOr[Double] & Double
    
    var width: js.UndefOr[Double] & Double
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object PRect {
    
    inline def apply(
      bottom: js.UndefOr[Double] & Double,
      height: js.UndefOr[Double] & Double,
      left: js.UndefOr[Double] & Double,
      right: js.UndefOr[Double] & Double,
      top: js.UndefOr[Double] & Double,
      width: js.UndefOr[Double] & Double
    ): PRect = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PRect]
    }
    
    extension [Self <: PRect](x: Self) {
      
      inline def setBottom(value: js.UndefOr[Double] & Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: js.UndefOr[Double] & Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: js.UndefOr[Double] & Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: js.UndefOr[Double] & Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: CallbackTo[Any]): Self = StObject.set(x, "toJSON", value.toJsFn)
      
      inline def setToJSONUndefined: Self = StObject.set(x, "toJSON", js.undefined)
      
      inline def setTop(value: js.UndefOr[Double] & Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: js.UndefOr[Double] & Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  /**
    * @see Docs https://reach.tech/rect#rect-props
    */
  trait RectProps
    extends StObject
       with UseRectOptions {
    
    /**
      * A function that calls back to you with a `ref` to place on an element and
      * the `rect` measurements of the dom node.
      *
      * **Note**: On the first render `rect` will be `undefined` because we can't
      * measure a node that has not yet been rendered. Make sure your code accounts
      * for this.
      *
      * @see Docs https://reach.tech/rect#rect-onchange
      */
    def children(args: typingsJapgolly.reachRect.anon.Rect): typingsJapgolly.react.mod.global.JSX.Element
  }
  object RectProps {
    
    inline def apply(children: typingsJapgolly.reachRect.anon.Rect => typingsJapgolly.react.mod.global.JSX.Element): RectProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[RectProps]
    }
    
    extension [Self <: RectProps](x: Self) {
      
      inline def setChildren(value: typingsJapgolly.reachRect.anon.Rect => typingsJapgolly.react.mod.global.JSX.Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * @see Docs https://reach.tech/rect#userect
    */
  trait UseRectOptions extends StObject {
    
    /**
      * Tells `Rect` to observe the position of the node or not. While observing,
      * the `children` render prop may call back very quickly (especially while
      * scrolling) so it can be important for performance to avoid observing when
      * you don't need to.
      *
      * This is typically used for elements that pop over other elements (like a
      * dropdown menu), so you don't need to observe all the time, only when the
      * popup is active.
      *
      * Pass `true` to observe, `false` to ignore.
      *
      * @see Docs https://reach.tech/rect#userect-observe
      */
    var observe: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Calls back whenever the `rect` of the element changes.
      *
      * @see Docs https://reach.tech/rect#userect-onchange
      */
    var onChange: js.UndefOr[js.Function1[/* rect */ PRect, Unit]] = js.undefined
  }
  object UseRectOptions {
    
    inline def apply(): UseRectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseRectOptions]
    }
    
    extension [Self <: UseRectOptions](x: Self) {
      
      inline def setObserve(value: Boolean): Self = StObject.set(x, "observe", value.asInstanceOf[js.Any])
      
      inline def setObserveUndefined: Self = StObject.set(x, "observe", js.undefined)
      
      inline def setOnChange(value: /* rect */ PRect => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* rect */ PRect) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
}
