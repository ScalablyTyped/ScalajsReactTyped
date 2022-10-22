package typingsJapgolly.extjs.Ext.form

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITextArea
  extends StObject
     with typingsJapgolly.extjs.Ext.form.field.IText {
  
  /** [Config Option] (Number) */
  var cols: js.UndefOr[Double] = js.undefined
  
  /** [Config Option] (Boolean) */
  var enterIsSpecial: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] Returns the current data value of the field
    * @returns Object value The field value
    */
  @JSName("getValue")
  var getValue_ITextArea: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Config Option] (Boolean) */
  var preventScrollbars: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Number) */
  var rows: js.UndefOr[Double] = js.undefined
  
  /** [Method] Allows for any necessary modifications before the original value is set
    * @param value Object
    * @returns Object The modified initial value
    */
  @JSName("transformOriginalValue")
  var transformOriginalValue_ITextArea: js.UndefOr[js.Function1[/* value */ js.UndefOr[Any], Any]] = js.undefined
}
object ITextArea {
  
  inline def apply(): ITextArea = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITextArea]
  }
  
  extension [Self <: ITextArea](x: Self) {
    
    inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
    
    inline def setEnterIsSpecial(value: Boolean): Self = StObject.set(x, "enterIsSpecial", value.asInstanceOf[js.Any])
    
    inline def setEnterIsSpecialUndefined: Self = StObject.set(x, "enterIsSpecial", js.undefined)
    
    inline def setGetValue(value: CallbackTo[Any]): Self = StObject.set(x, "getValue", value.toJsFn)
    
    inline def setGetValueUndefined: Self = StObject.set(x, "getValue", js.undefined)
    
    inline def setPreventScrollbars(value: Boolean): Self = StObject.set(x, "preventScrollbars", value.asInstanceOf[js.Any])
    
    inline def setPreventScrollbarsUndefined: Self = StObject.set(x, "preventScrollbars", js.undefined)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setTransformOriginalValue(value: /* value */ js.UndefOr[Any] => Any): Self = StObject.set(x, "transformOriginalValue", js.Any.fromFunction1(value))
    
    inline def setTransformOriginalValueUndefined: Self = StObject.set(x, "transformOriginalValue", js.undefined)
  }
}
