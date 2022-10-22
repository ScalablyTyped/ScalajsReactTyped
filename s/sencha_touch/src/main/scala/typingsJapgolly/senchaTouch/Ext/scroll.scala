package typingsJapgolly.senchaTouch.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scroll {
  
  type IIndicator = IBase
  
  trait IScroller
    extends StObject
       with IEvented {
    
    /** [Config Option] (Number) */
    var acceleration: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (String) */
    var direction: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Boolean) */
    var directionLock: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Boolean) */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (Number) */
    var friction: js.UndefOr[Double] = js.undefined
    
    /** [Method] Returns the value of direction
      * @returns String
      */
    var getDirection: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the value of directionLock
      * @returns Boolean
      */
    var getDirectionLock: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of disabled
      * @returns Boolean
      */
    var getDisabled: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the value of initialOffset
      * @returns Object/Number
      */
    var getInitialOffset: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of momentumEasing
      * @returns Object
      */
    var getMomentumEasing: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of slotSnapEasing
      * @returns Object
      */
    var getSlotSnapEasing: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of slotSnapSize
      * @returns Number/Object
      */
    var getSlotSnapSize: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of translatable
      * @returns Object
      */
    var getTranslatable: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Config Option] (Object/Number) */
    var initialOffset: js.UndefOr[Any] = js.undefined
    
    /** [Method] Returns true if a specified axis is enabled
      * @param axis String The axis to check (x or y).
      * @returns Boolean true if the axis is enabled.
      */
    var isAxisEnabled: js.UndefOr[js.Function1[/* axis */ js.UndefOr[java.lang.String], Boolean]] = js.undefined
    
    /** [Config Option] (Object) */
    var momentumEasing: js.UndefOr[Any] = js.undefined
    
    /** [Method] Change the scroll offset by the given amount
      * @param x Number The offset to scroll by on the x axis.
      * @param y Number The offset to scroll by on the y axis.
      * @param animation Boolean/Object Whether or not to animate the scrolling to the new position.
      * @returns Ext.scroll.Scroller this
      */
    var scrollBy: js.UndefOr[
        js.Function3[
          /* x */ js.UndefOr[Double], 
          /* y */ js.UndefOr[Double], 
          /* animation */ js.UndefOr[Any], 
          this.type
        ]
      ] = js.undefined
    
    /** [Method] Scrolls to the given location
      * @param x Number The scroll position on the x axis.
      * @param y Number The scroll position on the y axis.
      * @param animation Boolean/Object Whether or not to animate the scrolling to the new position.
      * @returns Ext.scroll.Scroller this
      */
    var scrollTo: js.UndefOr[
        js.Function3[
          /* x */ js.UndefOr[Double], 
          /* y */ js.UndefOr[Double], 
          /* animation */ js.UndefOr[Any], 
          this.type
        ]
      ] = js.undefined
    
    /** [Method] Scrolls to the end of the scrollable view
      * @param animation Object
      * @returns Ext.scroll.Scroller this
      */
    var scrollToEnd: js.UndefOr[js.Function1[/* animation */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Sets the value of direction
      * @param direction String The new value.
      */
    var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of directionLock
      * @param directionLock Boolean The new value.
      */
    var setDirectionLock: js.UndefOr[js.Function1[/* directionLock */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of disabled
      * @param disabled Boolean The new value.
      */
    var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the value of initialOffset
      * @param initialOffset Object/Number The new value.
      */
    var setInitialOffset: js.UndefOr[js.Function1[/* initialOffset */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of momentumEasing
      * @param momentumEasing Object The new value.
      */
    var setMomentumEasing: js.UndefOr[js.Function1[/* momentumEasing */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the offset of this scroller
      * @param offset Object The offset to move to.
      * @returns Ext.scroll.Scroller this
      */
    var setOffset: js.UndefOr[js.Function1[/* offset */ js.UndefOr[Any], this.type]] = js.undefined
    
    /** [Method] Sets the value of slotSnapEasing
      * @param slotSnapEasing Object The new value.
      */
    var setSlotSnapEasing: js.UndefOr[js.Function1[/* slotSnapEasing */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of slotSnapSize
      * @param slotSnapSize Number/Object The new value.
      */
    var setSlotSnapSize: js.UndefOr[js.Function1[/* slotSnapSize */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of translatable
      * @param translatable Object The new value.
      */
    var setTranslatable: js.UndefOr[js.Function1[/* translatable */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Config Option] (Number/Object) */
    var slotSnapSize: js.UndefOr[Any] = js.undefined
    
    /** [Method] Updates the boundary information for this scroller
      * @returns Ext.scroll.Scroller this
      */
    var updateBoundary: js.UndefOr[js.Function0[this.type]] = js.undefined
  }
  object IScroller {
    
    inline def apply(): IScroller = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IScroller]
    }
    
    extension [Self <: IScroller](x: Self) {
      
      inline def setAcceleration(value: Double): Self = StObject.set(x, "acceleration", value.asInstanceOf[js.Any])
      
      inline def setAccelerationUndefined: Self = StObject.set(x, "acceleration", js.undefined)
      
      inline def setDirection(value: java.lang.String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionLock(value: Boolean): Self = StObject.set(x, "directionLock", value.asInstanceOf[js.Any])
      
      inline def setDirectionLockUndefined: Self = StObject.set(x, "directionLock", js.undefined)
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFriction(value: Double): Self = StObject.set(x, "friction", value.asInstanceOf[js.Any])
      
      inline def setFrictionUndefined: Self = StObject.set(x, "friction", js.undefined)
      
      inline def setGetDirection(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getDirection", value.toJsFn)
      
      inline def setGetDirectionLock(value: CallbackTo[Boolean]): Self = StObject.set(x, "getDirectionLock", value.toJsFn)
      
      inline def setGetDirectionLockUndefined: Self = StObject.set(x, "getDirectionLock", js.undefined)
      
      inline def setGetDirectionUndefined: Self = StObject.set(x, "getDirection", js.undefined)
      
      inline def setGetDisabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "getDisabled", value.toJsFn)
      
      inline def setGetDisabledUndefined: Self = StObject.set(x, "getDisabled", js.undefined)
      
      inline def setGetInitialOffset(value: CallbackTo[Any]): Self = StObject.set(x, "getInitialOffset", value.toJsFn)
      
      inline def setGetInitialOffsetUndefined: Self = StObject.set(x, "getInitialOffset", js.undefined)
      
      inline def setGetMomentumEasing(value: CallbackTo[Any]): Self = StObject.set(x, "getMomentumEasing", value.toJsFn)
      
      inline def setGetMomentumEasingUndefined: Self = StObject.set(x, "getMomentumEasing", js.undefined)
      
      inline def setGetSlotSnapEasing(value: CallbackTo[Any]): Self = StObject.set(x, "getSlotSnapEasing", value.toJsFn)
      
      inline def setGetSlotSnapEasingUndefined: Self = StObject.set(x, "getSlotSnapEasing", js.undefined)
      
      inline def setGetSlotSnapSize(value: CallbackTo[Any]): Self = StObject.set(x, "getSlotSnapSize", value.toJsFn)
      
      inline def setGetSlotSnapSizeUndefined: Self = StObject.set(x, "getSlotSnapSize", js.undefined)
      
      inline def setGetTranslatable(value: CallbackTo[Any]): Self = StObject.set(x, "getTranslatable", value.toJsFn)
      
      inline def setGetTranslatableUndefined: Self = StObject.set(x, "getTranslatable", js.undefined)
      
      inline def setInitialOffset(value: Any): Self = StObject.set(x, "initialOffset", value.asInstanceOf[js.Any])
      
      inline def setInitialOffsetUndefined: Self = StObject.set(x, "initialOffset", js.undefined)
      
      inline def setIsAxisEnabled(value: /* axis */ js.UndefOr[java.lang.String] => Boolean): Self = StObject.set(x, "isAxisEnabled", js.Any.fromFunction1(value))
      
      inline def setIsAxisEnabledUndefined: Self = StObject.set(x, "isAxisEnabled", js.undefined)
      
      inline def setMomentumEasing(value: Any): Self = StObject.set(x, "momentumEasing", value.asInstanceOf[js.Any])
      
      inline def setMomentumEasingUndefined: Self = StObject.set(x, "momentumEasing", js.undefined)
      
      inline def setScrollBy(
        value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* animation */ js.UndefOr[Any]) => IScroller
      ): Self = StObject.set(x, "scrollBy", js.Any.fromFunction3(value))
      
      inline def setScrollByUndefined: Self = StObject.set(x, "scrollBy", js.undefined)
      
      inline def setScrollTo(
        value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], /* animation */ js.UndefOr[Any]) => IScroller
      ): Self = StObject.set(x, "scrollTo", js.Any.fromFunction3(value))
      
      inline def setScrollToEnd(value: /* animation */ js.UndefOr[Any] => IScroller): Self = StObject.set(x, "scrollToEnd", js.Any.fromFunction1(value))
      
      inline def setScrollToEndUndefined: Self = StObject.set(x, "scrollToEnd", js.undefined)
      
      inline def setScrollToUndefined: Self = StObject.set(x, "scrollTo", js.undefined)
      
      inline def setSetDirection(value: /* direction */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setDirection", js.Any.fromFunction1((t0: /* direction */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
      
      inline def setSetDirectionLock(value: /* directionLock */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setDirectionLock", js.Any.fromFunction1((t0: /* directionLock */ js.UndefOr[Boolean]) => value(t0).runNow()))
      
      inline def setSetDirectionLockUndefined: Self = StObject.set(x, "setDirectionLock", js.undefined)
      
      inline def setSetDirectionUndefined: Self = StObject.set(x, "setDirection", js.undefined)
      
      inline def setSetDisabled(value: /* disabled */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setDisabled", js.Any.fromFunction1((t0: /* disabled */ js.UndefOr[Boolean]) => value(t0).runNow()))
      
      inline def setSetDisabledUndefined: Self = StObject.set(x, "setDisabled", js.undefined)
      
      inline def setSetInitialOffset(value: /* initialOffset */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setInitialOffset", js.Any.fromFunction1((t0: /* initialOffset */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setSetInitialOffsetUndefined: Self = StObject.set(x, "setInitialOffset", js.undefined)
      
      inline def setSetMomentumEasing(value: /* momentumEasing */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setMomentumEasing", js.Any.fromFunction1((t0: /* momentumEasing */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setSetMomentumEasingUndefined: Self = StObject.set(x, "setMomentumEasing", js.undefined)
      
      inline def setSetOffset(value: /* offset */ js.UndefOr[Any] => IScroller): Self = StObject.set(x, "setOffset", js.Any.fromFunction1(value))
      
      inline def setSetOffsetUndefined: Self = StObject.set(x, "setOffset", js.undefined)
      
      inline def setSetSlotSnapEasing(value: /* slotSnapEasing */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setSlotSnapEasing", js.Any.fromFunction1((t0: /* slotSnapEasing */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setSetSlotSnapEasingUndefined: Self = StObject.set(x, "setSlotSnapEasing", js.undefined)
      
      inline def setSetSlotSnapSize(value: /* slotSnapSize */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setSlotSnapSize", js.Any.fromFunction1((t0: /* slotSnapSize */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setSetSlotSnapSizeUndefined: Self = StObject.set(x, "setSlotSnapSize", js.undefined)
      
      inline def setSetTranslatable(value: /* translatable */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setTranslatable", js.Any.fromFunction1((t0: /* translatable */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setSetTranslatableUndefined: Self = StObject.set(x, "setTranslatable", js.undefined)
      
      inline def setSlotSnapSize(value: Any): Self = StObject.set(x, "slotSnapSize", value.asInstanceOf[js.Any])
      
      inline def setSlotSnapSizeUndefined: Self = StObject.set(x, "slotSnapSize", js.undefined)
      
      inline def setUpdateBoundary(value: CallbackTo[IScroller]): Self = StObject.set(x, "updateBoundary", value.toJsFn)
      
      inline def setUpdateBoundaryUndefined: Self = StObject.set(x, "updateBoundary", js.undefined)
    }
  }
  
  trait IView
    extends StObject
       with IEvented {
    
    /** [Method] Returns the value of cls
      * @returns String
      */
    var getCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the value of element
      * @returns Object
      */
    var getElement: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of indicators
      * @returns Object
      */
    var getIndicators: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of indicatorsHidingDelay
      * @returns Number
      */
    var getIndicatorsHidingDelay: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of indicatorsUi
      * @returns String
      */
    var getIndicatorsUi: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the scroller instance in this view
      * @returns Ext.scroll.View The scroller
      */
    var getScroller: js.UndefOr[js.Function0[this.type]] = js.undefined
    
    /** [Config Option] (String) */
    var indicatorsUi: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Sets the value of cls
      * @param cls String The new value.
      */
    var setCls: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of element
      * @param element Object The new value.
      */
    var setElement: js.UndefOr[js.Function1[/* element */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of indicators
      * @param indicators Object The new value.
      */
    var setIndicators: js.UndefOr[js.Function1[/* indicators */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of indicatorsHidingDelay
      * @param indicatorsHidingDelay Number The new value.
      */
    var setIndicatorsHidingDelay: js.UndefOr[js.Function1[/* indicatorsHidingDelay */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of indicatorsUi
      * @param indicatorsUi String The new value.
      */
    var setIndicatorsUi: js.UndefOr[js.Function1[/* indicatorsUi */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of scroller
      * @param scroller Object The new value.
      */
    var setScroller: js.UndefOr[js.Function1[/* scroller */ js.UndefOr[Any], Unit]] = js.undefined
  }
  object IView {
    
    inline def apply(): IView = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IView]
    }
    
    extension [Self <: IView](x: Self) {
      
      inline def setGetCls(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getCls", value.toJsFn)
      
      inline def setGetClsUndefined: Self = StObject.set(x, "getCls", js.undefined)
      
      inline def setGetElement(value: CallbackTo[Any]): Self = StObject.set(x, "getElement", value.toJsFn)
      
      inline def setGetElementUndefined: Self = StObject.set(x, "getElement", js.undefined)
      
      inline def setGetIndicators(value: CallbackTo[Any]): Self = StObject.set(x, "getIndicators", value.toJsFn)
      
      inline def setGetIndicatorsHidingDelay(value: CallbackTo[Double]): Self = StObject.set(x, "getIndicatorsHidingDelay", value.toJsFn)
      
      inline def setGetIndicatorsHidingDelayUndefined: Self = StObject.set(x, "getIndicatorsHidingDelay", js.undefined)
      
      inline def setGetIndicatorsUi(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getIndicatorsUi", value.toJsFn)
      
      inline def setGetIndicatorsUiUndefined: Self = StObject.set(x, "getIndicatorsUi", js.undefined)
      
      inline def setGetIndicatorsUndefined: Self = StObject.set(x, "getIndicators", js.undefined)
      
      inline def setGetScroller(value: CallbackTo[IView]): Self = StObject.set(x, "getScroller", value.toJsFn)
      
      inline def setGetScrollerUndefined: Self = StObject.set(x, "getScroller", js.undefined)
      
      inline def setIndicatorsUi(value: java.lang.String): Self = StObject.set(x, "indicatorsUi", value.asInstanceOf[js.Any])
      
      inline def setIndicatorsUiUndefined: Self = StObject.set(x, "indicatorsUi", js.undefined)
      
      inline def setSetCls(value: /* cls */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setCls", js.Any.fromFunction1((t0: /* cls */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
      
      inline def setSetClsUndefined: Self = StObject.set(x, "setCls", js.undefined)
      
      inline def setSetElement(value: /* element */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setElement", js.Any.fromFunction1((t0: /* element */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setSetElementUndefined: Self = StObject.set(x, "setElement", js.undefined)
      
      inline def setSetIndicators(value: /* indicators */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setIndicators", js.Any.fromFunction1((t0: /* indicators */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setSetIndicatorsHidingDelay(value: /* indicatorsHidingDelay */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setIndicatorsHidingDelay", js.Any.fromFunction1((t0: /* indicatorsHidingDelay */ js.UndefOr[Double]) => value(t0).runNow()))
      
      inline def setSetIndicatorsHidingDelayUndefined: Self = StObject.set(x, "setIndicatorsHidingDelay", js.undefined)
      
      inline def setSetIndicatorsUi(value: /* indicatorsUi */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setIndicatorsUi", js.Any.fromFunction1((t0: /* indicatorsUi */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
      
      inline def setSetIndicatorsUiUndefined: Self = StObject.set(x, "setIndicatorsUi", js.undefined)
      
      inline def setSetIndicatorsUndefined: Self = StObject.set(x, "setIndicators", js.undefined)
      
      inline def setSetScroller(value: /* scroller */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setScroller", js.Any.fromFunction1((t0: /* scroller */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setSetScrollerUndefined: Self = StObject.set(x, "setScroller", js.undefined)
    }
  }
  
  object indicator {
    
    trait IAbstract
      extends StObject
         with IComponent {
      
      /** [Config Option] (Boolean) */
      var autoHide: js.UndefOr[Boolean] = js.undefined
      
      /** [Method] Returns the value of active
        * @returns Boolean
        */
      var getActive: js.UndefOr[js.Function0[Boolean]] = js.undefined
      
      /** [Method] Returns the value of autoHide
        * @returns Boolean
        */
      var getAutoHide: js.UndefOr[js.Function0[Boolean]] = js.undefined
      
      /** [Method] Returns the value of axis
        * @returns String
        */
      var getAxis: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
      
      /** [Method] Returns the value of barCls
        * @returns String
        */
      var getBarCls: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
      
      /** [Method] Returns the value of length
        * @returns Object
        */
      var getLength: js.UndefOr[js.Function0[Any]] = js.undefined
      
      /** [Method] Returns the value of minLength
        * @returns Number
        */
      var getMinLength: js.UndefOr[js.Function0[Double]] = js.undefined
      
      /** [Method] Returns the value of ratio
        * @returns Number
        */
      var getRatio: js.UndefOr[js.Function0[Double]] = js.undefined
      
      /** [Method] Returns the value of value
        * @returns Object
        */
      var getValue: js.UndefOr[js.Function0[Any]] = js.undefined
      
      /** [Method] Sets the value of active
        * @param active Boolean The new value.
        */
      var setActive: js.UndefOr[js.Function1[/* active */ js.UndefOr[Boolean], Unit]] = js.undefined
      
      /** [Method] Sets the value of autoHide
        * @param autoHide Boolean The new value.
        */
      var setAutoHide: js.UndefOr[js.Function1[/* autoHide */ js.UndefOr[Boolean], Unit]] = js.undefined
      
      /** [Method] Sets the value of axis
        * @param axis String The new value.
        */
      var setAxis: js.UndefOr[js.Function1[/* axis */ js.UndefOr[java.lang.String], Unit]] = js.undefined
      
      /** [Method] Sets the value of barCls
        * @param barCls String The new value.
        */
      var setBarCls: js.UndefOr[js.Function1[/* barCls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
      
      /** [Method] Sets the value of length
        * @param length Object The new value.
        */
      var setLength: js.UndefOr[js.Function1[/* length */ js.UndefOr[Any], Unit]] = js.undefined
      
      /** [Method] Sets the value of minLength
        * @param minLength Number The new value.
        */
      var setMinLength: js.UndefOr[js.Function1[/* minLength */ js.UndefOr[Double], Unit]] = js.undefined
      
      /** [Method] Sets the value of ratio
        * @param ratio Number The new value.
        */
      var setRatio: js.UndefOr[js.Function1[/* ratio */ js.UndefOr[Double], Unit]] = js.undefined
      
      /** [Method] Sets the value of value
        * @param value Object The new value.
        */
      var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], Unit]] = js.undefined
    }
    object IAbstract {
      
      inline def apply(): IAbstract = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IAbstract]
      }
      
      extension [Self <: IAbstract](x: Self) {
        
        inline def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
        
        inline def setAutoHideUndefined: Self = StObject.set(x, "autoHide", js.undefined)
        
        inline def setGetActive(value: CallbackTo[Boolean]): Self = StObject.set(x, "getActive", value.toJsFn)
        
        inline def setGetActiveUndefined: Self = StObject.set(x, "getActive", js.undefined)
        
        inline def setGetAutoHide(value: CallbackTo[Boolean]): Self = StObject.set(x, "getAutoHide", value.toJsFn)
        
        inline def setGetAutoHideUndefined: Self = StObject.set(x, "getAutoHide", js.undefined)
        
        inline def setGetAxis(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getAxis", value.toJsFn)
        
        inline def setGetAxisUndefined: Self = StObject.set(x, "getAxis", js.undefined)
        
        inline def setGetBarCls(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getBarCls", value.toJsFn)
        
        inline def setGetBarClsUndefined: Self = StObject.set(x, "getBarCls", js.undefined)
        
        inline def setGetLength(value: CallbackTo[Any]): Self = StObject.set(x, "getLength", value.toJsFn)
        
        inline def setGetLengthUndefined: Self = StObject.set(x, "getLength", js.undefined)
        
        inline def setGetMinLength(value: CallbackTo[Double]): Self = StObject.set(x, "getMinLength", value.toJsFn)
        
        inline def setGetMinLengthUndefined: Self = StObject.set(x, "getMinLength", js.undefined)
        
        inline def setGetRatio(value: CallbackTo[Double]): Self = StObject.set(x, "getRatio", value.toJsFn)
        
        inline def setGetRatioUndefined: Self = StObject.set(x, "getRatio", js.undefined)
        
        inline def setGetValue(value: CallbackTo[Any]): Self = StObject.set(x, "getValue", value.toJsFn)
        
        inline def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
        
        inline def setSetActive(value: /* active */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setActive", js.Any.fromFunction1((t0: /* active */ js.UndefOr[Boolean]) => value(t0).runNow()))
        
        inline def setSetActiveUndefined: Self = StObject.set(x, "setActive", js.undefined)
        
        inline def setSetAutoHide(value: /* autoHide */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setAutoHide", js.Any.fromFunction1((t0: /* autoHide */ js.UndefOr[Boolean]) => value(t0).runNow()))
        
        inline def setSetAutoHideUndefined: Self = StObject.set(x, "setAutoHide", js.undefined)
        
        inline def setSetAxis(value: /* axis */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setAxis", js.Any.fromFunction1((t0: /* axis */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
        
        inline def setSetAxisUndefined: Self = StObject.set(x, "setAxis", js.undefined)
        
        inline def setSetBarCls(value: /* barCls */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setBarCls", js.Any.fromFunction1((t0: /* barCls */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
        
        inline def setSetBarClsUndefined: Self = StObject.set(x, "setBarCls", js.undefined)
        
        inline def setSetLength(value: /* length */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setLength", js.Any.fromFunction1((t0: /* length */ js.UndefOr[Any]) => value(t0).runNow()))
        
        inline def setSetLengthUndefined: Self = StObject.set(x, "setLength", js.undefined)
        
        inline def setSetMinLength(value: /* minLength */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setMinLength", js.Any.fromFunction1((t0: /* minLength */ js.UndefOr[Double]) => value(t0).runNow()))
        
        inline def setSetMinLengthUndefined: Self = StObject.set(x, "setMinLength", js.undefined)
        
        inline def setSetRatio(value: /* ratio */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setRatio", js.Any.fromFunction1((t0: /* ratio */ js.UndefOr[Double]) => value(t0).runNow()))
        
        inline def setSetRatioUndefined: Self = StObject.set(x, "setRatio", js.undefined)
        
        inline def setSetValue(value: /* value */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction1((t0: /* value */ js.UndefOr[Any]) => value(t0).runNow()))
        
        inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
      }
    }
    
    trait ICssTransform
      extends StObject
         with IAbstract {
      
      /** [Method] Returns the value of cls
        * @returns String
        */
      @JSName("getCls")
      var getCls_ICssTransform: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
      
      /** [Method] Sets the value of cls
        * @param cls String The new value.
        */
      @JSName("setCls")
      var setCls_ICssTransform: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    }
    object ICssTransform {
      
      inline def apply(): ICssTransform = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ICssTransform]
      }
      
      extension [Self <: ICssTransform](x: Self) {
        
        inline def setGetCls(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getCls", value.toJsFn)
        
        inline def setGetClsUndefined: Self = StObject.set(x, "getCls", js.undefined)
        
        inline def setSetCls(value: /* cls */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setCls", js.Any.fromFunction1((t0: /* cls */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
        
        inline def setSetClsUndefined: Self = StObject.set(x, "setCls", js.undefined)
      }
    }
    
    trait IRounded
      extends StObject
         with IAbstract {
      
      /** [Method] Returns the value of cls
        * @returns String
        */
      @JSName("getCls")
      var getCls_IRounded: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
      
      /** [Method] Sets the value of cls
        * @param cls String The new value.
        */
      @JSName("setCls")
      var setCls_IRounded: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    }
    object IRounded {
      
      inline def apply(): IRounded = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IRounded]
      }
      
      extension [Self <: IRounded](x: Self) {
        
        inline def setGetCls(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getCls", value.toJsFn)
        
        inline def setGetClsUndefined: Self = StObject.set(x, "getCls", js.undefined)
        
        inline def setSetCls(value: /* cls */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setCls", js.Any.fromFunction1((t0: /* cls */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
        
        inline def setSetClsUndefined: Self = StObject.set(x, "setCls", js.undefined)
      }
    }
    
    trait IScrollPosition
      extends StObject
         with IAbstract {
      
      /** [Method] Returns the value of cls
        * @returns String
        */
      @JSName("getCls")
      var getCls_IScrollPosition: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
      
      /** [Method] Sets the value of cls
        * @param cls String The new value.
        */
      @JSName("setCls")
      var setCls_IScrollPosition: js.UndefOr[js.Function1[/* cls */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    }
    object IScrollPosition {
      
      inline def apply(): IScrollPosition = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IScrollPosition]
      }
      
      extension [Self <: IScrollPosition](x: Self) {
        
        inline def setGetCls(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getCls", value.toJsFn)
        
        inline def setGetClsUndefined: Self = StObject.set(x, "getCls", js.undefined)
        
        inline def setSetCls(value: /* cls */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setCls", js.Any.fromFunction1((t0: /* cls */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
        
        inline def setSetClsUndefined: Self = StObject.set(x, "setCls", js.undefined)
      }
    }
  }
}
