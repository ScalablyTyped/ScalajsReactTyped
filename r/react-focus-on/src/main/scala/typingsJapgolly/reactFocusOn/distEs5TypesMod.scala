package typingsJapgolly.reactFocusOn

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.TouchEvent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5TypesMod {
  
  trait CommonProps extends StObject {
    
    /**
      * [scroll-lock] allows scroll based zoom
      * @default false
      * @see https://github.com/theKashey/react-remove-scroll#usage
      */
    var allowPinchZoom: js.UndefOr[Boolean] = js.undefined
    
    /**
      * [scroll-lock] full page inert (event suppression)
      * @default false
      * @see {@link https://github.com/theKashey/react-remove-scroll#usage}
      */
    var inert: js.UndefOr[Boolean] = js.undefined
    
    /**
      * [scroll-lock] control isolation
      * @see {@link https://github.com/theKashey/react-remove-scroll#usage}
      */
    var noIsolation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * callback on lock activation
      * @param node the main node
      */
    var onActivation: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
    
    /**
      * action to perform on click outside
      */
    var onClickOutside: js.UndefOr[js.Function1[/* event */ MouseEvent | TouchEvent, Unit]] = js.undefined
    
    /**
      * callback on lock deactivation
      */
    var onDeactivation: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * action to perform on Esc key press
      */
    var onEscapeKey: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    /**
      * a list of elements which should be considered as a part of the lock
      */
    var shards: js.UndefOr[js.Array[RefHandle[Any] | HTMLElement]] = js.undefined
  }
  object CommonProps {
    
    inline def apply(): CommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonProps]
    }
    
    extension [Self <: CommonProps](x: Self) {
      
      inline def setAllowPinchZoom(value: Boolean): Self = StObject.set(x, "allowPinchZoom", value.asInstanceOf[js.Any])
      
      inline def setAllowPinchZoomUndefined: Self = StObject.set(x, "allowPinchZoom", js.undefined)
      
      inline def setInert(value: Boolean): Self = StObject.set(x, "inert", value.asInstanceOf[js.Any])
      
      inline def setInertUndefined: Self = StObject.set(x, "inert", js.undefined)
      
      inline def setNoIsolation(value: Boolean): Self = StObject.set(x, "noIsolation", value.asInstanceOf[js.Any])
      
      inline def setNoIsolationUndefined: Self = StObject.set(x, "noIsolation", js.undefined)
      
      inline def setOnActivation(value: /* node */ HTMLElement => Callback): Self = StObject.set(x, "onActivation", js.Any.fromFunction1((t0: /* node */ HTMLElement) => value(t0).runNow()))
      
      inline def setOnActivationUndefined: Self = StObject.set(x, "onActivation", js.undefined)
      
      inline def setOnClickOutside(value: /* event */ MouseEvent | TouchEvent => Callback): Self = StObject.set(x, "onClickOutside", js.Any.fromFunction1((t0: /* event */ MouseEvent | TouchEvent) => value(t0).runNow()))
      
      inline def setOnClickOutsideUndefined: Self = StObject.set(x, "onClickOutside", js.undefined)
      
      inline def setOnDeactivation(value: Callback): Self = StObject.set(x, "onDeactivation", value.toJsFn)
      
      inline def setOnDeactivationUndefined: Self = StObject.set(x, "onDeactivation", js.undefined)
      
      inline def setOnEscapeKey(value: /* event */ Event => Callback): Self = StObject.set(x, "onEscapeKey", js.Any.fromFunction1((t0: /* event */ Event) => value(t0).runNow()))
      
      inline def setOnEscapeKeyUndefined: Self = StObject.set(x, "onEscapeKey", js.undefined)
      
      inline def setShards(value: js.Array[RefHandle[Any] | HTMLElement]): Self = StObject.set(x, "shards", value.asInstanceOf[js.Any])
      
      inline def setShardsUndefined: Self = StObject.set(x, "shards", js.undefined)
      
      inline def setShardsVarargs(value: (RefHandle[Any] | HTMLElement)*): Self = StObject.set(x, "shards", js.Array(value*))
    }
  }
  
  trait EffectProps
    extends StObject
       with CommonProps {
    
    def setLockProps(settings: LockProps): Unit
  }
  object EffectProps {
    
    inline def apply(setLockProps: LockProps => Callback): EffectProps = {
      val __obj = js.Dynamic.literal(setLockProps = js.Any.fromFunction1((t0: LockProps) => setLockProps(t0).runNow()))
      __obj.asInstanceOf[EffectProps]
    }
    
    extension [Self <: EffectProps](x: Self) {
      
      inline def setSetLockProps(value: LockProps => Callback): Self = StObject.set(x, "setLockProps", js.Any.fromFunction1((t0: LockProps) => value(t0).runNow()))
    }
  }
  
  trait LockProps extends StObject {
    
    var onActivation: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.undefined
    
    var onDeactivation: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onMouseDown: js.UndefOr[js.Function1[/* e */ ReactMouseEventFrom[Element], Unit]] = js.undefined
    
    var onTouchStart: js.UndefOr[js.Function1[/* e */ ReactTouchEventFrom[Element], Unit]] = js.undefined
  }
  object LockProps {
    
    inline def apply(): LockProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LockProps]
    }
    
    extension [Self <: LockProps](x: Self) {
      
      inline def setOnActivation(value: /* node */ HTMLElement => Callback): Self = StObject.set(x, "onActivation", js.Any.fromFunction1((t0: /* node */ HTMLElement) => value(t0).runNow()))
      
      inline def setOnActivationUndefined: Self = StObject.set(x, "onActivation", js.undefined)
      
      inline def setOnDeactivation(value: Callback): Self = StObject.set(x, "onDeactivation", value.toJsFn)
      
      inline def setOnDeactivationUndefined: Self = StObject.set(x, "onDeactivation", js.undefined)
      
      inline def setOnMouseDown(value: /* e */ ReactMouseEventFrom[Element] => Callback): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: /* e */ ReactMouseEventFrom[Element]) => value(t0).runNow()))
      
      inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      inline def setOnTouchStart(value: /* e */ ReactTouchEventFrom[Element] => Callback): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1((t0: /* e */ ReactTouchEventFrom[Element]) => value(t0).runNow()))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
    }
  }
  
  trait ReactFocusOnProps
    extends StObject
       with CommonProps {
    
    /**
      * allows replacement of the host node
      * @default div
      */
    var as: js.UndefOr[String | ElementType] = js.undefined
    
    /**
      * [focus-lock] control autofocus
      * @default true
      */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var children: Node
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * The main switch
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Controls focus lock behavior
      */
    var focusLock: js.UndefOr[Boolean] = js.undefined
    
    /**
      * [focus-lock] control returnFocus
      * @default true
      */
    var returnFocus: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ReactFocusLock * / any>['returnFocus'] */ js.Any
      ] = js.undefined
    
    /**
      * Controls scroll lock behavior
      */
    var scrollLock: js.UndefOr[Boolean] = js.undefined
    
    /**
      * [focus-lock] allows "ignoring" focus on some elements
      * @see {@link https://github.com/theKashey/react-focus-lock#api}
      */
    var shouldIgnore: js.UndefOr[js.Function1[/* candidate */ HTMLElement, Boolean]] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object ReactFocusOnProps {
    
    inline def apply(): ReactFocusOnProps = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[ReactFocusOnProps]
    }
    
    extension [Self <: ReactFocusOnProps](x: Self) {
      
      inline def setAs(value: String | ElementType): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFocusLock(value: Boolean): Self = StObject.set(x, "focusLock", value.asInstanceOf[js.Any])
      
      inline def setFocusLockUndefined: Self = StObject.set(x, "focusLock", js.undefined)
      
      inline def setReturnFocus(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps</ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ReactFocusLock * / any>['returnFocus'] */ js.Any
      ): Self = StObject.set(x, "returnFocus", value.asInstanceOf[js.Any])
      
      inline def setReturnFocusUndefined: Self = StObject.set(x, "returnFocus", js.undefined)
      
      inline def setScrollLock(value: Boolean): Self = StObject.set(x, "scrollLock", value.asInstanceOf[js.Any])
      
      inline def setScrollLockUndefined: Self = StObject.set(x, "scrollLock", js.undefined)
      
      inline def setShouldIgnore(value: /* candidate */ HTMLElement => Boolean): Self = StObject.set(x, "shouldIgnore", js.Any.fromFunction1(value))
      
      inline def setShouldIgnoreUndefined: Self = StObject.set(x, "shouldIgnore", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait ReactFocusOnSideProps
    extends StObject
       with ReactFocusOnProps {
    
    var sideCar: FC[Any]
  }
  object ReactFocusOnSideProps {
    
    inline def apply(sideCar: FC[Any]): ReactFocusOnSideProps = {
      val __obj = js.Dynamic.literal(sideCar = sideCar.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[ReactFocusOnSideProps]
    }
    
    extension [Self <: ReactFocusOnSideProps](x: Self) {
      
      inline def setSideCar(value: FC[Any]): Self = StObject.set(x, "sideCar", value.asInstanceOf[js.Any])
    }
  }
}
