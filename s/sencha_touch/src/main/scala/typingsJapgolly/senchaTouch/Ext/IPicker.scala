package typingsJapgolly.senchaTouch.Ext

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  inline def apply(): IPicker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPicker]
  }
  
  extension [Self <: IPicker](x: Self) {
    
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
    
    inline def setSetValue(value: (/* values */ js.UndefOr[Any], /* animated */ js.UndefOr[Boolean]) => IPicker): Self = StObject.set(x, "setValue", js.Any.fromFunction2(value))
    
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
