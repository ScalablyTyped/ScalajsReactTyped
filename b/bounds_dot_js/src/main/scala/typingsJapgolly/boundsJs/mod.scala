package typingsJapgolly.boundsJs

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Asynchronous boundary detection. 1KB, no dependencies.
    */
  inline def apply(): Boundary = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Boundary]
  inline def apply(options: Options): Boundary = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Boundary]
  
  @JSImport("bounds.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bounds.js", "Boundary")
  @js.native
  open class Boundary () extends StObject {
    
    /**
      * The check method will return a `boolean`, indicating if the provided `element` is currently inside the boundary.
      * The check is based on history, which starts once you watch the element.
      * If the element is not currently being watched, check will return undefined.
      */
    def check(): Boolean = js.native
    def check(el: Element): Boolean = js.native
    
    /**
      * The `clear` method will effectively `unWatch` all elements for the boundary, destroy all history for the elements the boundary was watching,
      * and ensure that no events are emitted by the boundary going forward.
      */
    def clear(): Unit = js.native
    
    /**
      * The `unWatch` method will instruct your boundary to stop watching a certain element.
      * Callbacks for that element will no longer be executed.
      */
    def unWatch(): this.type = js.native
    def unWatch(el: Element): this.type = js.native
    
    /**
      * Calling watch will instruct your boundary to watch the desired element.
      * When the specified element enters your boundary, the `onEnter` callback will be executed.
      * When the specified element leaves your boundary, the `onLeave` callback will be executed.
      * Each callback is passed 1 argument, `ratio`, which represents the ratio of the element's bounding box that is inside the boundary.
      */
    def watch(): WatchOptions = js.native
    def watch(el: Element): WatchOptions = js.native
    def watch(el: Element, onEnter: Unit, onLeave: WatchCallback): WatchOptions = js.native
    def watch(el: Element, onEnter: WatchCallback): WatchOptions = js.native
    def watch(el: Element, onEnter: WatchCallback, onLeave: WatchCallback): WatchOptions = js.native
    def watch(el: Null, onEnter: Unit, onLeave: WatchCallback): WatchOptions = js.native
    def watch(el: Null, onEnter: WatchCallback): WatchOptions = js.native
    def watch(el: Null, onEnter: WatchCallback, onLeave: WatchCallback): WatchOptions = js.native
  }
  object Boundary {
    
    @JSImport("bounds.js", "Boundary")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The static `checkCompatibility` method will throw an error if `Bounds.js` is not supported in the user's browser.
      */
    /* static member */
    inline def checkCompatibility(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("checkCompatibility")().asInstanceOf[Unit]
  }
  
  trait Action extends StObject {
    
    val el: Element
    
    val inside: Boolean
    
    val outside: Boolean
    
    val ratio: Double
  }
  object Action {
    
    inline def apply(el: Element, inside: Boolean, outside: Boolean, ratio: Double): Action = {
      val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], inside = inside.asInstanceOf[js.Any], outside = outside.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    extension [Self <: Action](x: Self) {
      
      inline def setEl(value: Element): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      inline def setInside(value: Boolean): Self = StObject.set(x, "inside", value.asInstanceOf[js.Any])
      
      inline def setOutside(value: Boolean): Self = StObject.set(x, "outside", value.asInstanceOf[js.Any])
      
      inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<std.Record<'top' | 'right' | 'bottom' | 'left', number>> */
  trait Margins extends StObject {
    
    var bottom: js.UndefOr[Double] = js.undefined
    
    var left: js.UndefOr[Double] = js.undefined
    
    var right: js.UndefOr[Double] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
  }
  object Margins {
    
    inline def apply(): Margins = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Margins]
    }
    
    extension [Self <: Margins](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Accepts a mapping, where values are stated in pixels.
      * You can specify a `top`, `right`, `bottom`, or `left` margin to add to the root's bounding box.
      * This affects detection, NOT style on the root element.
      * @default { top: 0, right: 0, bottom: 0, left: 0 }
      */
    var margins: js.UndefOr[Margins] = js.undefined
    
    /**
      * The provided callback will be executed whenever any watched element enters or exits the boundary,
      * once all individual callbacks have executed.
      * This is a useful option if you'd like some action to take place no matter what element enters/exits your boundary.
      * @default () => {}
      */
    var onEmit: js.UndefOr[js.Function1[/* actions */ js.Array[Action], Unit]] = js.undefined
    
    /**
      * The root is the element for which we are creating the boundary.
      * Events will be emitted whenever a watched element enters/exits the root element.
      * @default window
      */
    var root: js.UndefOr[Element | Null] = js.undefined
    
    /**
      * Accepts a number between 0.0 and 1.0.
      * The ratio of intersecting area required before a callback is made.
      * A threshold of 0.0 means that if even a single pixel of a watched element enters the boundary, a callback is made.
      * A threshold of 1.0 means that every pixel of a watched element must be inside the boundary before a callback is made.
      * @default 0.0
      */
    var threshold: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setMargins(value: Margins): Self = StObject.set(x, "margins", value.asInstanceOf[js.Any])
      
      inline def setMarginsUndefined: Self = StObject.set(x, "margins", js.undefined)
      
      inline def setOnEmit(value: /* actions */ js.Array[Action] => Callback): Self = StObject.set(x, "onEmit", js.Any.fromFunction1((t0: /* actions */ js.Array[Action]) => value(t0).runNow()))
      
      inline def setOnEmitUndefined: Self = StObject.set(x, "onEmit", js.undefined)
      
      inline def setRoot(value: Element): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
  
  type WatchCallback = js.Function1[/* ratio */ Double, Unit]
  
  /**
    * These properties can be mutated
    */
  trait WatchOptions extends StObject {
    
    def onEnter(ratio: Double): Unit
    @JSName("onEnter")
    var onEnter_Original: WatchCallback
    
    def onLeave(ratio: Double): Unit
    @JSName("onLeave")
    var onLeave_Original: WatchCallback
  }
  object WatchOptions {
    
    inline def apply(onEnter: /* ratio */ Double => Callback, onLeave: /* ratio */ Double => Callback): WatchOptions = {
      val __obj = js.Dynamic.literal(onEnter = js.Any.fromFunction1((t0: /* ratio */ Double) => onEnter(t0).runNow()), onLeave = js.Any.fromFunction1((t0: /* ratio */ Double) => onLeave(t0).runNow()))
      __obj.asInstanceOf[WatchOptions]
    }
    
    extension [Self <: WatchOptions](x: Self) {
      
      inline def setOnEnter(value: /* ratio */ Double => Callback): Self = StObject.set(x, "onEnter", js.Any.fromFunction1((t0: /* ratio */ Double) => value(t0).runNow()))
      
      inline def setOnLeave(value: /* ratio */ Double => Callback): Self = StObject.set(x, "onLeave", js.Any.fromFunction1((t0: /* ratio */ Double) => value(t0).runNow()))
    }
  }
}
