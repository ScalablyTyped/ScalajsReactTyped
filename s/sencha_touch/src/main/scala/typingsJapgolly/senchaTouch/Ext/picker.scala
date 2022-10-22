package typingsJapgolly.senchaTouch.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object picker {
  
  trait IDate
    extends StObject
       with typingsJapgolly.senchaTouch.Ext.picker.IPicker {
    
    /** [Config Option] (String) */
    var dayText: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Returns the value of dayText
      * @returns String
      */
    var getDayText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the value of monthText
      * @returns String
      */
    var getMonthText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the value of slotOrder
      * @returns Array
      */
    var getSlotOrder: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Returns the value of yearFrom
      * @returns Number
      */
    var getYearFrom: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of yearText
      * @returns String
      */
    var getYearText: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the value of yearTo
      * @returns Number
      */
    var getYearTo: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Config Option] (String) */
    var monthText: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Sets the value of dayText
      * @param dayText String The new value.
      */
    var setDayText: js.UndefOr[js.Function1[/* dayText */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of monthText
      * @param monthText String The new value.
      */
    var setMonthText: js.UndefOr[js.Function1[/* monthText */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of slotOrder
      * @param slotOrder Array The new value.
      */
    var setSlotOrder: js.UndefOr[js.Function1[/* slotOrder */ js.UndefOr[Array], Unit]] = js.undefined
    
    /** [Method] Sets the values of the pickers slots
      * @param value Object
      * @param animated Object
      * @returns Ext.Picker this This picker.
      */
    @JSName("setValue")
    var setValue_IDate: js.UndefOr[
        js.Function2[
          /* value */ js.UndefOr[Any], 
          /* animated */ js.UndefOr[Any], 
          typingsJapgolly.senchaTouch.Ext.IPicker
        ]
      ] = js.undefined
    
    /** [Method] Sets the value of yearFrom
      * @param yearFrom Number The new value.
      */
    var setYearFrom: js.UndefOr[js.Function1[/* yearFrom */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of yearText
      * @param yearText String The new value.
      */
    var setYearText: js.UndefOr[js.Function1[/* yearText */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of yearTo
      * @param yearTo Number The new value.
      */
    var setYearTo: js.UndefOr[js.Function1[/* yearTo */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Config Option] (Array) */
    var slotOrder: js.UndefOr[Array] = js.undefined
    
    /** [Method] Updates the dayText configuration
      * @param newDayText Object
      * @param oldDayText Object
      */
    var updateDayText: js.UndefOr[
        js.Function2[/* newDayText */ js.UndefOr[Any], /* oldDayText */ js.UndefOr[Any], Unit]
      ] = js.undefined
    
    /** [Method] Updates the monthText configuration
      * @param newMonthText Object
      * @param oldMonthText Object
      */
    var updateMonthText: js.UndefOr[
        js.Function2[/* newMonthText */ js.UndefOr[Any], /* oldMonthText */ js.UndefOr[Any], Unit]
      ] = js.undefined
    
    /** [Method] Updates the yearFrom configuration */
    var updateYearFrom: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Method] Updates the yearText configuration
      * @param yearText Object
      */
    var updateYearText: js.UndefOr[js.Function1[/* yearText */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Updates the yearTo configuration */
    var updateYearTo: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** [Config Option] (Number) */
    var yearFrom: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (String) */
    var yearText: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (Number) */
    var yearTo: js.UndefOr[Double] = js.undefined
  }
  object IDate {
    
    inline def apply(): typingsJapgolly.senchaTouch.Ext.picker.IDate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.senchaTouch.Ext.picker.IDate]
    }
    
    extension [Self <: typingsJapgolly.senchaTouch.Ext.picker.IDate](x: Self) {
      
      inline def setDayText(value: java.lang.String): Self = StObject.set(x, "dayText", value.asInstanceOf[js.Any])
      
      inline def setDayTextUndefined: Self = StObject.set(x, "dayText", js.undefined)
      
      inline def setGetDayText(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getDayText", value.toJsFn)
      
      inline def setGetDayTextUndefined: Self = StObject.set(x, "getDayText", js.undefined)
      
      inline def setGetMonthText(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getMonthText", value.toJsFn)
      
      inline def setGetMonthTextUndefined: Self = StObject.set(x, "getMonthText", js.undefined)
      
      inline def setGetSlotOrder(value: CallbackTo[Array]): Self = StObject.set(x, "getSlotOrder", value.toJsFn)
      
      inline def setGetSlotOrderUndefined: Self = StObject.set(x, "getSlotOrder", js.undefined)
      
      inline def setGetYearFrom(value: CallbackTo[Double]): Self = StObject.set(x, "getYearFrom", value.toJsFn)
      
      inline def setGetYearFromUndefined: Self = StObject.set(x, "getYearFrom", js.undefined)
      
      inline def setGetYearText(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getYearText", value.toJsFn)
      
      inline def setGetYearTextUndefined: Self = StObject.set(x, "getYearText", js.undefined)
      
      inline def setGetYearTo(value: CallbackTo[Double]): Self = StObject.set(x, "getYearTo", value.toJsFn)
      
      inline def setGetYearToUndefined: Self = StObject.set(x, "getYearTo", js.undefined)
      
      inline def setMonthText(value: java.lang.String): Self = StObject.set(x, "monthText", value.asInstanceOf[js.Any])
      
      inline def setMonthTextUndefined: Self = StObject.set(x, "monthText", js.undefined)
      
      inline def setSetDayText(value: /* dayText */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setDayText", js.Any.fromFunction1((t0: /* dayText */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
      
      inline def setSetDayTextUndefined: Self = StObject.set(x, "setDayText", js.undefined)
      
      inline def setSetMonthText(value: /* monthText */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setMonthText", js.Any.fromFunction1((t0: /* monthText */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
      
      inline def setSetMonthTextUndefined: Self = StObject.set(x, "setMonthText", js.undefined)
      
      inline def setSetSlotOrder(value: /* slotOrder */ js.UndefOr[Array] => Callback): Self = StObject.set(x, "setSlotOrder", js.Any.fromFunction1((t0: /* slotOrder */ js.UndefOr[Array]) => value(t0).runNow()))
      
      inline def setSetSlotOrderUndefined: Self = StObject.set(x, "setSlotOrder", js.undefined)
      
      inline def setSetValue(
        value: (/* value */ js.UndefOr[Any], /* animated */ js.UndefOr[Any]) => typingsJapgolly.senchaTouch.Ext.IPicker
      ): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
      
      inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
      
      inline def setSetYearFrom(value: /* yearFrom */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setYearFrom", js.Any.fromFunction1((t0: /* yearFrom */ js.UndefOr[Double]) => value(t0).runNow()))
      
      inline def setSetYearFromUndefined: Self = StObject.set(x, "setYearFrom", js.undefined)
      
      inline def setSetYearText(value: /* yearText */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setYearText", js.Any.fromFunction1((t0: /* yearText */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
      
      inline def setSetYearTextUndefined: Self = StObject.set(x, "setYearText", js.undefined)
      
      inline def setSetYearTo(value: /* yearTo */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setYearTo", js.Any.fromFunction1((t0: /* yearTo */ js.UndefOr[Double]) => value(t0).runNow()))
      
      inline def setSetYearToUndefined: Self = StObject.set(x, "setYearTo", js.undefined)
      
      inline def setSlotOrder(value: Array): Self = StObject.set(x, "slotOrder", value.asInstanceOf[js.Any])
      
      inline def setSlotOrderUndefined: Self = StObject.set(x, "slotOrder", js.undefined)
      
      inline def setUpdateDayText(value: (/* newDayText */ js.UndefOr[Any], /* oldDayText */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "updateDayText", js.Any.fromFunction2((t0: /* newDayText */ js.UndefOr[Any], t1: /* oldDayText */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
      
      inline def setUpdateDayTextUndefined: Self = StObject.set(x, "updateDayText", js.undefined)
      
      inline def setUpdateMonthText(value: (/* newMonthText */ js.UndefOr[Any], /* oldMonthText */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "updateMonthText", js.Any.fromFunction2((t0: /* newMonthText */ js.UndefOr[Any], t1: /* oldMonthText */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
      
      inline def setUpdateMonthTextUndefined: Self = StObject.set(x, "updateMonthText", js.undefined)
      
      inline def setUpdateYearFrom(value: Callback): Self = StObject.set(x, "updateYearFrom", value.toJsFn)
      
      inline def setUpdateYearFromUndefined: Self = StObject.set(x, "updateYearFrom", js.undefined)
      
      inline def setUpdateYearText(value: /* yearText */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "updateYearText", js.Any.fromFunction1((t0: /* yearText */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setUpdateYearTextUndefined: Self = StObject.set(x, "updateYearText", js.undefined)
      
      inline def setUpdateYearTo(value: Callback): Self = StObject.set(x, "updateYearTo", value.toJsFn)
      
      inline def setUpdateYearToUndefined: Self = StObject.set(x, "updateYearTo", js.undefined)
      
      inline def setYearFrom(value: Double): Self = StObject.set(x, "yearFrom", value.asInstanceOf[js.Any])
      
      inline def setYearFromUndefined: Self = StObject.set(x, "yearFrom", js.undefined)
      
      inline def setYearText(value: java.lang.String): Self = StObject.set(x, "yearText", value.asInstanceOf[js.Any])
      
      inline def setYearTextUndefined: Self = StObject.set(x, "yearText", js.undefined)
      
      inline def setYearTo(value: Double): Self = StObject.set(x, "yearTo", value.asInstanceOf[js.Any])
      
      inline def setYearToUndefined: Self = StObject.set(x, "yearTo", js.undefined)
    }
  }
  
  trait IPicker
    extends StObject
       with ISheet {
    
    /** [Config Option] (String) */
    var activeCls: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Updates the cancelButton configuration
      * @param config Object
      * @returns Object
      */
    var applyCancelButton: js.UndefOr[js.Function1[/* config */ js.UndefOr[Any], Any]] = js.undefined
    
    /** [Method] Updates the doneButton configuration
      * @param config Object
      * @returns Object
      */
    var applyDoneButton: js.UndefOr[js.Function1[/* config */ js.UndefOr[Any], Any]] = js.undefined
    
    /** [Config Option] (String/Mixed) */
    var cancelButton: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (String/Mixed) */
    var doneButton: js.UndefOr[Any] = js.undefined
    
    /** [Method] Returns the value of bottom
      * @returns Number
      */
    @JSName("getBottom")
    var getBottom_IPicker: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** [Method] Returns the value of cancelButton
      * @returns String/Mixed
      */
    var getCancelButton: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of activeItem
      * @returns Object/String/Number
      */
    var getCard: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of doneButton
      * @returns String/Mixed
      */
    var getDoneButton: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of layout
      * @returns Object
      */
    var getLayout: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of slots
      * @returns Array
      */
    var getSlots: js.UndefOr[js.Function0[Array]] = js.undefined
    
    /** [Method] Returns the value of toolbar
      * @returns Ext.TitleBar/Ext.Toolbar/Object
      */
    var getToolbar: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Method] Returns the value of toolbarPosition
      * @returns String
      */
    var getToolbarPosition: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the value of useTitles
      * @returns Boolean
      */
    var getUseTitles: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** [Method] Returns the values of each of the pickers slots
      * @param useDom Object
      * @returns Object The values of the pickers slots
      */
    var getValue: js.UndefOr[js.Function1[/* useDom */ js.UndefOr[Any], Any]] = js.undefined
    
    /** [Method] Returns the values of each of the pickers slots
      * @returns Object The values of the pickers slots.
      */
    var getValues: js.UndefOr[js.Function0[Any]] = js.undefined
    
    /** [Config Option] (Number) */
    @JSName("height")
    var height_IPicker: js.UndefOr[Double] = js.undefined
    
    /** [Method] Sets the value of bottom
      * @param bottom Number The new value.
      */
    @JSName("setBottom")
    var setBottom_IPicker: js.UndefOr[js.Function1[/* bottom */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of cancelButton
      * @param cancelButton String/Mixed The new value.
      */
    var setCancelButton: js.UndefOr[js.Function1[/* cancelButton */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of activeItem
      * @param activeItem Object/String/Number The new value.
      */
    var setCard: js.UndefOr[js.Function1[/* activeItem */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of doneButton
      * @param doneButton String/Mixed The new value.
      */
    var setDoneButton: js.UndefOr[js.Function1[/* doneButton */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of height
      * @param height Number The new value.
      */
    @JSName("setHeight")
    var setHeight_IPicker: js.UndefOr[js.Function1[/* height */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of left
      * @param left Number The new value.
      */
    @JSName("setLeft")
    var setLeft_IPicker: js.UndefOr[js.Function1[/* left */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of right
      * @param right Number The new value.
      */
    @JSName("setRight")
    var setRight_IPicker: js.UndefOr[js.Function1[/* right */ js.UndefOr[Double], Unit]] = js.undefined
    
    /** [Method] Sets the value of slots
      * @param slots Array The new value.
      */
    var setSlots: js.UndefOr[js.Function1[/* slots */ js.UndefOr[Array], Unit]] = js.undefined
    
    /** [Method] Sets the value of toolbar
      * @param toolbar Ext.TitleBar/Ext.Toolbar/Object The new value.
      */
    var setToolbar: js.UndefOr[js.Function1[/* toolbar */ js.UndefOr[Any], Unit]] = js.undefined
    
    /** [Method] Sets the value of toolbarPosition
      * @param toolbarPosition String The new value.
      */
    var setToolbarPosition: js.UndefOr[js.Function1[/* toolbarPosition */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of useTitles
      * @param useTitles Boolean The new value.
      */
    var setUseTitles: js.UndefOr[js.Function1[/* useTitles */ js.UndefOr[Boolean], Unit]] = js.undefined
    
    /** [Method] Sets the values of the pickers slots
      * @param values Object The values in a {name:'value'} format.
      * @param animated Boolean true to animate setting the values.
      * @returns Ext.Picker this This picker.
      */
    var setValue: js.UndefOr[
        js.Function2[/* values */ js.UndefOr[Any], /* animated */ js.UndefOr[Boolean], this.type]
      ] = js.undefined
    
    /** [Config Option] (Array) */
    var slots: js.UndefOr[Array] = js.undefined
    
    /** [Config Option] (Ext.TitleBar/Ext.Toolbar/Object) */
    var toolbar: js.UndefOr[Any] = js.undefined
    
    /** [Config Option] (Boolean) */
    var useTitles: js.UndefOr[Boolean] = js.undefined
    
    /** [Config Option] (String/Number) */
    var value: js.UndefOr[Any] = js.undefined
  }
  object IPicker {
    
    inline def apply(): typingsJapgolly.senchaTouch.Ext.picker.IPicker = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.senchaTouch.Ext.picker.IPicker]
    }
    
    extension [Self <: typingsJapgolly.senchaTouch.Ext.picker.IPicker](x: Self) {
      
      inline def setActiveCls(value: java.lang.String): Self = StObject.set(x, "activeCls", value.asInstanceOf[js.Any])
      
      inline def setActiveClsUndefined: Self = StObject.set(x, "activeCls", js.undefined)
      
      inline def setApplyCancelButton(value: /* config */ js.UndefOr[Any] => Any): Self = StObject.set(x, "applyCancelButton", js.Any.fromFunction1(value))
      
      inline def setApplyCancelButtonUndefined: Self = StObject.set(x, "applyCancelButton", js.undefined)
      
      inline def setApplyDoneButton(value: /* config */ js.UndefOr[Any] => Any): Self = StObject.set(x, "applyDoneButton", js.Any.fromFunction1(value))
      
      inline def setApplyDoneButtonUndefined: Self = StObject.set(x, "applyDoneButton", js.undefined)
      
      inline def setCancelButton(value: Any): Self = StObject.set(x, "cancelButton", value.asInstanceOf[js.Any])
      
      inline def setCancelButtonUndefined: Self = StObject.set(x, "cancelButton", js.undefined)
      
      inline def setDoneButton(value: Any): Self = StObject.set(x, "doneButton", value.asInstanceOf[js.Any])
      
      inline def setDoneButtonUndefined: Self = StObject.set(x, "doneButton", js.undefined)
      
      inline def setGetBottom(value: CallbackTo[Double]): Self = StObject.set(x, "getBottom", value.toJsFn)
      
      inline def setGetBottomUndefined: Self = StObject.set(x, "getBottom", js.undefined)
      
      inline def setGetCancelButton(value: CallbackTo[Any]): Self = StObject.set(x, "getCancelButton", value.toJsFn)
      
      inline def setGetCancelButtonUndefined: Self = StObject.set(x, "getCancelButton", js.undefined)
      
      inline def setGetCard(value: CallbackTo[Any]): Self = StObject.set(x, "getCard", value.toJsFn)
      
      inline def setGetCardUndefined: Self = StObject.set(x, "getCard", js.undefined)
      
      inline def setGetDoneButton(value: CallbackTo[Any]): Self = StObject.set(x, "getDoneButton", value.toJsFn)
      
      inline def setGetDoneButtonUndefined: Self = StObject.set(x, "getDoneButton", js.undefined)
      
      inline def setGetLayout(value: CallbackTo[Any]): Self = StObject.set(x, "getLayout", value.toJsFn)
      
      inline def setGetLayoutUndefined: Self = StObject.set(x, "getLayout", js.undefined)
      
      inline def setGetSlots(value: CallbackTo[Array]): Self = StObject.set(x, "getSlots", value.toJsFn)
      
      inline def setGetSlotsUndefined: Self = StObject.set(x, "getSlots", js.undefined)
      
      inline def setGetToolbar(value: CallbackTo[Any]): Self = StObject.set(x, "getToolbar", value.toJsFn)
      
      inline def setGetToolbarPosition(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getToolbarPosition", value.toJsFn)
      
      inline def setGetToolbarPositionUndefined: Self = StObject.set(x, "getToolbarPosition", js.undefined)
      
      inline def setGetToolbarUndefined: Self = StObject.set(x, "getToolbar", js.undefined)
      
      inline def setGetUseTitles(value: CallbackTo[Boolean]): Self = StObject.set(x, "getUseTitles", value.toJsFn)
      
      inline def setGetUseTitlesUndefined: Self = StObject.set(x, "getUseTitles", js.undefined)
      
      inline def setGetValue(value: /* useDom */ js.UndefOr[Any] => Any): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
      
      inline def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
      
      inline def setGetValues(value: CallbackTo[Any]): Self = StObject.set(x, "getValues", value.toJsFn)
      
      inline def setGetValuesUndefined: Self = StObject.set(x, "getValues", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setSetBottom(value: /* bottom */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setBottom", js.Any.fromFunction1((t0: /* bottom */ js.UndefOr[Double]) => value(t0).runNow()))
      
      inline def setSetBottomUndefined: Self = StObject.set(x, "setBottom", js.undefined)
      
      inline def setSetCancelButton(value: /* cancelButton */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setCancelButton", js.Any.fromFunction1((t0: /* cancelButton */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setSetCancelButtonUndefined: Self = StObject.set(x, "setCancelButton", js.undefined)
      
      inline def setSetCard(value: /* activeItem */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setCard", js.Any.fromFunction1((t0: /* activeItem */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setSetCardUndefined: Self = StObject.set(x, "setCard", js.undefined)
      
      inline def setSetDoneButton(value: /* doneButton */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setDoneButton", js.Any.fromFunction1((t0: /* doneButton */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setSetDoneButtonUndefined: Self = StObject.set(x, "setDoneButton", js.undefined)
      
      inline def setSetHeight(value: /* height */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setHeight", js.Any.fromFunction1((t0: /* height */ js.UndefOr[Double]) => value(t0).runNow()))
      
      inline def setSetHeightUndefined: Self = StObject.set(x, "setHeight", js.undefined)
      
      inline def setSetLeft(value: /* left */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setLeft", js.Any.fromFunction1((t0: /* left */ js.UndefOr[Double]) => value(t0).runNow()))
      
      inline def setSetLeftUndefined: Self = StObject.set(x, "setLeft", js.undefined)
      
      inline def setSetRight(value: /* right */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setRight", js.Any.fromFunction1((t0: /* right */ js.UndefOr[Double]) => value(t0).runNow()))
      
      inline def setSetRightUndefined: Self = StObject.set(x, "setRight", js.undefined)
      
      inline def setSetSlots(value: /* slots */ js.UndefOr[Array] => Callback): Self = StObject.set(x, "setSlots", js.Any.fromFunction1((t0: /* slots */ js.UndefOr[Array]) => value(t0).runNow()))
      
      inline def setSetSlotsUndefined: Self = StObject.set(x, "setSlots", js.undefined)
      
      inline def setSetToolbar(value: /* toolbar */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setToolbar", js.Any.fromFunction1((t0: /* toolbar */ js.UndefOr[Any]) => value(t0).runNow()))
      
      inline def setSetToolbarPosition(value: /* toolbarPosition */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setToolbarPosition", js.Any.fromFunction1((t0: /* toolbarPosition */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
      
      inline def setSetToolbarPositionUndefined: Self = StObject.set(x, "setToolbarPosition", js.undefined)
      
      inline def setSetToolbarUndefined: Self = StObject.set(x, "setToolbar", js.undefined)
      
      inline def setSetUseTitles(value: /* useTitles */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setUseTitles", js.Any.fromFunction1((t0: /* useTitles */ js.UndefOr[Boolean]) => value(t0).runNow()))
      
      inline def setSetUseTitlesUndefined: Self = StObject.set(x, "setUseTitles", js.undefined)
      
      inline def setSetValue(
        value: (/* values */ js.UndefOr[Any], /* animated */ js.UndefOr[Boolean]) => typingsJapgolly.senchaTouch.Ext.picker.IPicker
      ): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
      
      inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
      
      inline def setSlots(value: Array): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
      
      inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
      
      inline def setToolbar(value: Any): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
      
      inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
      
      inline def setUseTitles(value: Boolean): Self = StObject.set(x, "useTitles", value.asInstanceOf[js.Any])
      
      inline def setUseTitlesUndefined: Self = StObject.set(x, "useTitles", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ISlot
    extends StObject
       with typingsJapgolly.senchaTouch.Ext.dataview.IDataView {
    
    /** [Config Option] (String) */
    var align: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Looks at the data configuration and turns it into store
      * @param data Object
      * @returns Object
      */
    var applyData: js.UndefOr[js.Function1[/* data */ js.UndefOr[Any], Any]] = js.undefined
    
    /** [Method] Sets the title for this dataview by creating element
      * @param title String
      * @returns String
      */
    var applyTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], java.lang.String]] = js.undefined
    
    /** [Config Option] (String) */
    var displayField: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Returns the value of align
      * @returns String
      */
    var getAlign: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the value of displayField
      * @returns String
      */
    var getDisplayField: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the value of name
      * @returns String
      */
    var getName: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the value of title
      * @returns String
      */
    var getTitle: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Method] Returns the value of valueField
      * @returns String
      */
    var getValueField: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
    
    /** [Config Option] (String) */
    @JSName("itemTpl")
    var itemTpl_ISlot: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Config Option] (String) */
    var name: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Sets the value of align
      * @param align String The new value.
      */
    var setAlign: js.UndefOr[js.Function1[/* align */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of displayField
      * @param displayField String The new value.
      */
    var setDisplayField: js.UndefOr[js.Function1[/* displayField */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of itemTpl
      * @param itemTpl String The new value.
      */
    @JSName("setItemTpl")
    var setItemTpl_ISlot: js.UndefOr[js.Function1[/* itemTpl */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of name
      * @param name String The new value.
      */
    var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of title
      * @param title String The new value.
      */
    var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Method] Sets the value of valueField
      * @param valueField String The new value.
      */
    var setValueField: js.UndefOr[js.Function1[/* valueField */ js.UndefOr[java.lang.String], Unit]] = js.undefined
    
    /** [Config Option] (String) */
    var title: js.UndefOr[java.lang.String] = js.undefined
    
    /** [Method] Updates the align configuration
      * @param newAlign Object
      * @param oldAlign Object
      */
    var updateAlign: js.UndefOr[
        js.Function2[/* newAlign */ js.UndefOr[Any], /* oldAlign */ js.UndefOr[Any], Unit]
      ] = js.undefined
    
    /** [Config Option] (Number) */
    var value: js.UndefOr[Double] = js.undefined
    
    /** [Config Option] (String) */
    var valueField: js.UndefOr[java.lang.String] = js.undefined
  }
  object ISlot {
    
    inline def apply(): ISlot = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISlot]
    }
    
    extension [Self <: ISlot](x: Self) {
      
      inline def setAlign(value: java.lang.String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setApplyData(value: /* data */ js.UndefOr[Any] => Any): Self = StObject.set(x, "applyData", js.Any.fromFunction1(value))
      
      inline def setApplyDataUndefined: Self = StObject.set(x, "applyData", js.undefined)
      
      inline def setApplyTitle(value: /* title */ js.UndefOr[java.lang.String] => java.lang.String): Self = StObject.set(x, "applyTitle", js.Any.fromFunction1(value))
      
      inline def setApplyTitleUndefined: Self = StObject.set(x, "applyTitle", js.undefined)
      
      inline def setDisplayField(value: java.lang.String): Self = StObject.set(x, "displayField", value.asInstanceOf[js.Any])
      
      inline def setDisplayFieldUndefined: Self = StObject.set(x, "displayField", js.undefined)
      
      inline def setGetAlign(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getAlign", value.toJsFn)
      
      inline def setGetAlignUndefined: Self = StObject.set(x, "getAlign", js.undefined)
      
      inline def setGetDisplayField(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getDisplayField", value.toJsFn)
      
      inline def setGetDisplayFieldUndefined: Self = StObject.set(x, "getDisplayField", js.undefined)
      
      inline def setGetName(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getName", value.toJsFn)
      
      inline def setGetNameUndefined: Self = StObject.set(x, "getName", js.undefined)
      
      inline def setGetTitle(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getTitle", value.toJsFn)
      
      inline def setGetTitleUndefined: Self = StObject.set(x, "getTitle", js.undefined)
      
      inline def setGetValueField(value: CallbackTo[java.lang.String]): Self = StObject.set(x, "getValueField", value.toJsFn)
      
      inline def setGetValueFieldUndefined: Self = StObject.set(x, "getValueField", js.undefined)
      
      inline def setItemTpl(value: java.lang.String): Self = StObject.set(x, "itemTpl", value.asInstanceOf[js.Any])
      
      inline def setItemTplUndefined: Self = StObject.set(x, "itemTpl", js.undefined)
      
      inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSetAlign(value: /* align */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setAlign", js.Any.fromFunction1((t0: /* align */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
      
      inline def setSetAlignUndefined: Self = StObject.set(x, "setAlign", js.undefined)
      
      inline def setSetDisplayField(value: /* displayField */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setDisplayField", js.Any.fromFunction1((t0: /* displayField */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
      
      inline def setSetDisplayFieldUndefined: Self = StObject.set(x, "setDisplayField", js.undefined)
      
      inline def setSetItemTpl(value: /* itemTpl */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setItemTpl", js.Any.fromFunction1((t0: /* itemTpl */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
      
      inline def setSetItemTplUndefined: Self = StObject.set(x, "setItemTpl", js.undefined)
      
      inline def setSetName(value: /* name */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setName", js.Any.fromFunction1((t0: /* name */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
      
      inline def setSetNameUndefined: Self = StObject.set(x, "setName", js.undefined)
      
      inline def setSetTitle(value: /* title */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setTitle", js.Any.fromFunction1((t0: /* title */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
      
      inline def setSetTitleUndefined: Self = StObject.set(x, "setTitle", js.undefined)
      
      inline def setSetValueField(value: /* valueField */ js.UndefOr[java.lang.String] => Callback): Self = StObject.set(x, "setValueField", js.Any.fromFunction1((t0: /* valueField */ js.UndefOr[java.lang.String]) => value(t0).runNow()))
      
      inline def setSetValueFieldUndefined: Self = StObject.set(x, "setValueField", js.undefined)
      
      inline def setTitle(value: java.lang.String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setUpdateAlign(value: (/* newAlign */ js.UndefOr[Any], /* oldAlign */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "updateAlign", js.Any.fromFunction2((t0: /* newAlign */ js.UndefOr[Any], t1: /* oldAlign */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
      
      inline def setUpdateAlignUndefined: Self = StObject.set(x, "updateAlign", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueField(value: java.lang.String): Self = StObject.set(x, "valueField", value.asInstanceOf[js.Any])
      
      inline def setValueFieldUndefined: Self = StObject.set(x, "valueField", js.undefined)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
