package typingsJapgolly.senchaTouch.Ext.field

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.IComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInput
  extends StObject
     with IComponent {
  
  /** [Config Option] (Boolean) */
  var autoCapitalize: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var autoComplete: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var autoCorrect: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Attempts to forcefully blur input focus for the field
    * @returns Ext.field.Input this
    */
  var blur: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var checked: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (String) */
  @JSName("cls")
  var cls_IInput: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var fastFocus: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Attempts to set the field as the active input focus
    * @returns Ext.field.Input this
    */
  var focus: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  /** [Config Option] (String) */
  var focusCls: js.UndefOr[String] = js.undefined
  
  /** [Method] Returns the value of autoCapitalize
    * @returns Boolean
    */
  var getAutoCapitalize: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of autoComplete
    * @returns Boolean
    */
  var getAutoComplete: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of autoCorrect
    * @returns Boolean
    */
  var getAutoCorrect: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the checked value of this field
    * @returns Mixed value The field value
    */
  var getChecked: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of cls
    * @returns String
    */
  @JSName("getCls")
  var getCls_IInput: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of fastFocus
    * @returns Boolean
    */
  var getFastFocus: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of focusCls
    * @returns String
    */
  var getFocusCls: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of maxLength
    * @returns Number
    */
  var getMaxLength: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of maxRows
    * @returns Number
    */
  var getMaxRows: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of maxValue
    * @returns Number
    */
  var getMaxValue: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of minValue
    * @returns Number
    */
  var getMinValue: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of name
    * @returns String
    */
  var getName: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of pattern
    * @returns String
    */
  var getPattern: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of placeHolder
    * @returns String
    */
  var getPlaceHolder: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of readOnly
    * @returns Boolean
    */
  var getReadOnly: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Method] Returns the value of startValue
    * @returns Mixed
    */
  var getStartValue: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of stepValue
    * @returns Number
    */
  var getStepValue: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of tabIndex
    * @returns Number
    */
  var getTabIndex: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the value of type
    * @returns String
    */
  var getType: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the field data value
    * @returns Mixed value The field value.
    */
  var getValue: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns true if the value of this Field has been changed from its original value
    * @returns Boolean
    */
  var isDirty: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  /** [Property] (Boolean) */
  var isFocused: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Number) */
  var maxLength: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var maxRows: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var maxValue: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var minValue: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (String) */
  var name: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var pattern: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var placeHolder: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Resets the current field value to the original value  */
  var reset: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Attempts to forcefully select all the contents of the input field
    * @returns Ext.field.Input this
    */
  var select: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  /** [Method] Sets the value of autoCapitalize
    * @param autoCapitalize Boolean The new value.
    */
  var setAutoCapitalize: js.UndefOr[js.Function1[/* autoCapitalize */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of autoComplete
    * @param autoComplete Boolean The new value.
    */
  var setAutoComplete: js.UndefOr[js.Function1[/* autoComplete */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of autoCorrect
    * @param autoCorrect Boolean The new value.
    */
  var setAutoCorrect: js.UndefOr[js.Function1[/* autoCorrect */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of cls
    * @param cls String The new value.
    */
  @JSName("setCls")
  var setCls_IInput: js.UndefOr[js.Function1[/* cls */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of fastFocus
    * @param fastFocus Boolean The new value.
    */
  var setFastFocus: js.UndefOr[js.Function1[/* fastFocus */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of focusCls
    * @param focusCls String The new value.
    */
  var setFocusCls: js.UndefOr[js.Function1[/* focusCls */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of maxLength
    * @param maxLength Number The new value.
    */
  var setMaxLength: js.UndefOr[js.Function1[/* maxLength */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of maxRows
    * @param maxRows Number The new value.
    */
  var setMaxRows: js.UndefOr[js.Function1[/* maxRows */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of maxValue
    * @param maxValue Number The new value.
    */
  var setMaxValue: js.UndefOr[js.Function1[/* maxValue */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of minValue
    * @param minValue Number The new value.
    */
  var setMinValue: js.UndefOr[js.Function1[/* minValue */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of name
    * @param name String The new value.
    */
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of pattern
    * @param pattern String The new value.
    */
  var setPattern: js.UndefOr[js.Function1[/* pattern */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of placeHolder
    * @param placeHolder String The new value.
    */
  var setPlaceHolder: js.UndefOr[js.Function1[/* placeHolder */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of readOnly
    * @param readOnly Boolean The new value.
    */
  var setReadOnly: js.UndefOr[js.Function1[/* readOnly */ js.UndefOr[Boolean], Unit]] = js.undefined
  
  /** [Method] Sets the value of startValue
    * @param startValue Mixed The new value.
    */
  var setStartValue: js.UndefOr[js.Function1[/* startValue */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of stepValue
    * @param stepValue Number The new value.
    */
  var setStepValue: js.UndefOr[js.Function1[/* stepValue */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of tabIndex
    * @param tabIndex Number The new value.
    */
  var setTabIndex: js.UndefOr[js.Function1[/* tabIndex */ js.UndefOr[Double], Unit]] = js.undefined
  
  /** [Method] Sets the value of type
    * @param type String The new value.
    */
  var setType: js.UndefOr[js.Function1[/* type */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Config Option] (Mixed) */
  var startValue: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (Number) */
  var stepValue: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Number) */
  var tabIndex: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (String) */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** [Method] Updates the cls configuration
    * @param newCls Object
    * @param oldCls Object
    */
  var updateCls: js.UndefOr[js.Function2[/* newCls */ js.UndefOr[Any], /* oldCls */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Updates the useMask configuration
    * @param newUseMask Object
    */
  var updateUseMask: js.UndefOr[js.Function1[/* newUseMask */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Config Option] (Mixed) */
  var value: js.UndefOr[Any] = js.undefined
}
object IInput {
  
  inline def apply(): IInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInput]
  }
  
  extension [Self <: IInput](x: Self) {
    
    inline def setAutoCapitalize(value: Boolean): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
    
    inline def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
    
    inline def setAutoComplete(value: Boolean): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    inline def setAutoCorrect(value: Boolean): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
    
    inline def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
    
    inline def setBlur(value: CallbackTo[IInput]): Self = StObject.set(x, "blur", value.toJsFn)
    
    inline def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setCls(value: String): Self = StObject.set(x, "cls", value.asInstanceOf[js.Any])
    
    inline def setClsUndefined: Self = StObject.set(x, "cls", js.undefined)
    
    inline def setFastFocus(value: Boolean): Self = StObject.set(x, "fastFocus", value.asInstanceOf[js.Any])
    
    inline def setFastFocusUndefined: Self = StObject.set(x, "fastFocus", js.undefined)
    
    inline def setFocus(value: CallbackTo[IInput]): Self = StObject.set(x, "focus", value.toJsFn)
    
    inline def setFocusCls(value: String): Self = StObject.set(x, "focusCls", value.asInstanceOf[js.Any])
    
    inline def setFocusClsUndefined: Self = StObject.set(x, "focusCls", js.undefined)
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setGetAutoCapitalize(value: CallbackTo[Boolean]): Self = StObject.set(x, "getAutoCapitalize", value.toJsFn)
    
    inline def setGetAutoCapitalizeUndefined: Self = StObject.set(x, "getAutoCapitalize", js.undefined)
    
    inline def setGetAutoComplete(value: CallbackTo[Boolean]): Self = StObject.set(x, "getAutoComplete", value.toJsFn)
    
    inline def setGetAutoCompleteUndefined: Self = StObject.set(x, "getAutoComplete", js.undefined)
    
    inline def setGetAutoCorrect(value: CallbackTo[Boolean]): Self = StObject.set(x, "getAutoCorrect", value.toJsFn)
    
    inline def setGetAutoCorrectUndefined: Self = StObject.set(x, "getAutoCorrect", js.undefined)
    
    inline def setGetChecked(value: CallbackTo[Any]): Self = StObject.set(x, "getChecked", value.toJsFn)
    
    inline def setGetCheckedUndefined: Self = StObject.set(x, "getChecked", js.undefined)
    
    inline def setGetCls(value: CallbackTo[String]): Self = StObject.set(x, "getCls", value.toJsFn)
    
    inline def setGetClsUndefined: Self = StObject.set(x, "getCls", js.undefined)
    
    inline def setGetFastFocus(value: CallbackTo[Boolean]): Self = StObject.set(x, "getFastFocus", value.toJsFn)
    
    inline def setGetFastFocusUndefined: Self = StObject.set(x, "getFastFocus", js.undefined)
    
    inline def setGetFocusCls(value: CallbackTo[String]): Self = StObject.set(x, "getFocusCls", value.toJsFn)
    
    inline def setGetFocusClsUndefined: Self = StObject.set(x, "getFocusCls", js.undefined)
    
    inline def setGetMaxLength(value: CallbackTo[Double]): Self = StObject.set(x, "getMaxLength", value.toJsFn)
    
    inline def setGetMaxLengthUndefined: Self = StObject.set(x, "getMaxLength", js.undefined)
    
    inline def setGetMaxRows(value: CallbackTo[Double]): Self = StObject.set(x, "getMaxRows", value.toJsFn)
    
    inline def setGetMaxRowsUndefined: Self = StObject.set(x, "getMaxRows", js.undefined)
    
    inline def setGetMaxValue(value: CallbackTo[Double]): Self = StObject.set(x, "getMaxValue", value.toJsFn)
    
    inline def setGetMaxValueUndefined: Self = StObject.set(x, "getMaxValue", js.undefined)
    
    inline def setGetMinValue(value: CallbackTo[Double]): Self = StObject.set(x, "getMinValue", value.toJsFn)
    
    inline def setGetMinValueUndefined: Self = StObject.set(x, "getMinValue", js.undefined)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetNameUndefined: Self = StObject.set(x, "getName", js.undefined)
    
    inline def setGetPattern(value: CallbackTo[String]): Self = StObject.set(x, "getPattern", value.toJsFn)
    
    inline def setGetPatternUndefined: Self = StObject.set(x, "getPattern", js.undefined)
    
    inline def setGetPlaceHolder(value: CallbackTo[String]): Self = StObject.set(x, "getPlaceHolder", value.toJsFn)
    
    inline def setGetPlaceHolderUndefined: Self = StObject.set(x, "getPlaceHolder", js.undefined)
    
    inline def setGetReadOnly(value: CallbackTo[Boolean]): Self = StObject.set(x, "getReadOnly", value.toJsFn)
    
    inline def setGetReadOnlyUndefined: Self = StObject.set(x, "getReadOnly", js.undefined)
    
    inline def setGetStartValue(value: CallbackTo[Any]): Self = StObject.set(x, "getStartValue", value.toJsFn)
    
    inline def setGetStartValueUndefined: Self = StObject.set(x, "getStartValue", js.undefined)
    
    inline def setGetStepValue(value: CallbackTo[Double]): Self = StObject.set(x, "getStepValue", value.toJsFn)
    
    inline def setGetStepValueUndefined: Self = StObject.set(x, "getStepValue", js.undefined)
    
    inline def setGetTabIndex(value: CallbackTo[Double]): Self = StObject.set(x, "getTabIndex", value.toJsFn)
    
    inline def setGetTabIndexUndefined: Self = StObject.set(x, "getTabIndex", js.undefined)
    
    inline def setGetType(value: CallbackTo[String]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setGetTypeUndefined: Self = StObject.set(x, "getType", js.undefined)
    
    inline def setGetValue(value: CallbackTo[Any]): Self = StObject.set(x, "getValue", value.toJsFn)
    
    inline def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
    
    inline def setIsDirty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDirty", value.toJsFn)
    
    inline def setIsDirtyUndefined: Self = StObject.set(x, "isDirty", js.undefined)
    
    inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    
    inline def setIsFocusedUndefined: Self = StObject.set(x, "isFocused", js.undefined)
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMaxRows(value: Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
    
    inline def setMaxRowsUndefined: Self = StObject.set(x, "maxRows", js.undefined)
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setPlaceHolder(value: String): Self = StObject.set(x, "placeHolder", value.asInstanceOf[js.Any])
    
    inline def setPlaceHolderUndefined: Self = StObject.set(x, "placeHolder", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    inline def setSelect(value: CallbackTo[IInput]): Self = StObject.set(x, "select", value.toJsFn)
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setSetAutoCapitalize(value: /* autoCapitalize */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setAutoCapitalize", js.Any.fromFunction1((t0: /* autoCapitalize */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetAutoCapitalizeUndefined: Self = StObject.set(x, "setAutoCapitalize", js.undefined)
    
    inline def setSetAutoComplete(value: /* autoComplete */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setAutoComplete", js.Any.fromFunction1((t0: /* autoComplete */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetAutoCompleteUndefined: Self = StObject.set(x, "setAutoComplete", js.undefined)
    
    inline def setSetAutoCorrect(value: /* autoCorrect */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setAutoCorrect", js.Any.fromFunction1((t0: /* autoCorrect */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetAutoCorrectUndefined: Self = StObject.set(x, "setAutoCorrect", js.undefined)
    
    inline def setSetCls(value: /* cls */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setCls", js.Any.fromFunction1((t0: /* cls */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetClsUndefined: Self = StObject.set(x, "setCls", js.undefined)
    
    inline def setSetFastFocus(value: /* fastFocus */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setFastFocus", js.Any.fromFunction1((t0: /* fastFocus */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetFastFocusUndefined: Self = StObject.set(x, "setFastFocus", js.undefined)
    
    inline def setSetFocusCls(value: /* focusCls */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setFocusCls", js.Any.fromFunction1((t0: /* focusCls */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetFocusClsUndefined: Self = StObject.set(x, "setFocusCls", js.undefined)
    
    inline def setSetMaxLength(value: /* maxLength */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setMaxLength", js.Any.fromFunction1((t0: /* maxLength */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetMaxLengthUndefined: Self = StObject.set(x, "setMaxLength", js.undefined)
    
    inline def setSetMaxRows(value: /* maxRows */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setMaxRows", js.Any.fromFunction1((t0: /* maxRows */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetMaxRowsUndefined: Self = StObject.set(x, "setMaxRows", js.undefined)
    
    inline def setSetMaxValue(value: /* maxValue */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setMaxValue", js.Any.fromFunction1((t0: /* maxValue */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetMaxValueUndefined: Self = StObject.set(x, "setMaxValue", js.undefined)
    
    inline def setSetMinValue(value: /* minValue */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setMinValue", js.Any.fromFunction1((t0: /* minValue */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetMinValueUndefined: Self = StObject.set(x, "setMinValue", js.undefined)
    
    inline def setSetName(value: /* name */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setName", js.Any.fromFunction1((t0: /* name */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetNameUndefined: Self = StObject.set(x, "setName", js.undefined)
    
    inline def setSetPattern(value: /* pattern */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setPattern", js.Any.fromFunction1((t0: /* pattern */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetPatternUndefined: Self = StObject.set(x, "setPattern", js.undefined)
    
    inline def setSetPlaceHolder(value: /* placeHolder */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setPlaceHolder", js.Any.fromFunction1((t0: /* placeHolder */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetPlaceHolderUndefined: Self = StObject.set(x, "setPlaceHolder", js.undefined)
    
    inline def setSetReadOnly(value: /* readOnly */ js.UndefOr[Boolean] => Callback): Self = StObject.set(x, "setReadOnly", js.Any.fromFunction1((t0: /* readOnly */ js.UndefOr[Boolean]) => value(t0).runNow()))
    
    inline def setSetReadOnlyUndefined: Self = StObject.set(x, "setReadOnly", js.undefined)
    
    inline def setSetStartValue(value: /* startValue */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setStartValue", js.Any.fromFunction1((t0: /* startValue */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetStartValueUndefined: Self = StObject.set(x, "setStartValue", js.undefined)
    
    inline def setSetStepValue(value: /* stepValue */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setStepValue", js.Any.fromFunction1((t0: /* stepValue */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetStepValueUndefined: Self = StObject.set(x, "setStepValue", js.undefined)
    
    inline def setSetTabIndex(value: /* tabIndex */ js.UndefOr[Double] => Callback): Self = StObject.set(x, "setTabIndex", js.Any.fromFunction1((t0: /* tabIndex */ js.UndefOr[Double]) => value(t0).runNow()))
    
    inline def setSetTabIndexUndefined: Self = StObject.set(x, "setTabIndex", js.undefined)
    
    inline def setSetType(value: /* type */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setType", js.Any.fromFunction1((t0: /* type */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetTypeUndefined: Self = StObject.set(x, "setType", js.undefined)
    
    inline def setStartValue(value: Any): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
    
    inline def setStartValueUndefined: Self = StObject.set(x, "startValue", js.undefined)
    
    inline def setStepValue(value: Double): Self = StObject.set(x, "stepValue", value.asInstanceOf[js.Any])
    
    inline def setStepValueUndefined: Self = StObject.set(x, "stepValue", js.undefined)
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdateCls(value: (/* newCls */ js.UndefOr[Any], /* oldCls */ js.UndefOr[Any]) => Callback): Self = StObject.set(x, "updateCls", js.Any.fromFunction2((t0: /* newCls */ js.UndefOr[Any], t1: /* oldCls */ js.UndefOr[Any]) => (value(t0, t1)).runNow()))
    
    inline def setUpdateClsUndefined: Self = StObject.set(x, "updateCls", js.undefined)
    
    inline def setUpdateUseMask(value: /* newUseMask */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "updateUseMask", js.Any.fromFunction1((t0: /* newUseMask */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setUpdateUseMaskUndefined: Self = StObject.set(x, "updateUseMask", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
