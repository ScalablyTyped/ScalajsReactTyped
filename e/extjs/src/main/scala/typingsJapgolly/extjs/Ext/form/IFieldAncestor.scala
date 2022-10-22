package typingsJapgolly.extjs.Ext.form

import japgolly.scalajs.react.Callback
import typingsJapgolly.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFieldAncestor
  extends StObject
     with IBase {
  
  /** [Config Option] (Object) */
  var fieldDefaults: js.UndefOr[Any] = js.undefined
  
  /** [Method] Initializes the FieldAncestor s state this must be called from the initComponent method of any components importing */
  var initFieldAncestor: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** [Method] Fired when the error message of any field within the container changes
    * @param field Ext.form.Labelable The sub-field whose active error changed
    * @param error String The new active error message
    */
  var onFieldErrorChange: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[ILabelable], /* error */ js.UndefOr[String], Unit]
  ] = js.undefined
  
  /** [Method] Fired when the validity of any field within the container changes
    * @param field Ext.form.field.Field The sub-field whose validity changed
    * @param valid Boolean The new validity state
    */
  var onFieldValidityChange: js.UndefOr[
    js.Function2[
      /* field */ js.UndefOr[typingsJapgolly.extjs.Ext.form.field.IField], 
      /* valid */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.undefined
}
object IFieldAncestor {
  
  inline def apply(): IFieldAncestor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldAncestor]
  }
  
  extension [Self <: IFieldAncestor](x: Self) {
    
    inline def setFieldDefaults(value: Any): Self = StObject.set(x, "fieldDefaults", value.asInstanceOf[js.Any])
    
    inline def setFieldDefaultsUndefined: Self = StObject.set(x, "fieldDefaults", js.undefined)
    
    inline def setInitFieldAncestor(value: Callback): Self = StObject.set(x, "initFieldAncestor", value.toJsFn)
    
    inline def setInitFieldAncestorUndefined: Self = StObject.set(x, "initFieldAncestor", js.undefined)
    
    inline def setOnFieldErrorChange(value: (/* field */ js.UndefOr[ILabelable], /* error */ js.UndefOr[String]) => Callback): Self = StObject.set(x, "onFieldErrorChange", js.Any.fromFunction2((t0: /* field */ js.UndefOr[ILabelable], t1: /* error */ js.UndefOr[String]) => (value(t0, t1)).runNow()))
    
    inline def setOnFieldErrorChangeUndefined: Self = StObject.set(x, "onFieldErrorChange", js.undefined)
    
    inline def setOnFieldValidityChange(
      value: (/* field */ js.UndefOr[typingsJapgolly.extjs.Ext.form.field.IField], /* valid */ js.UndefOr[Boolean]) => Callback
    ): Self = StObject.set(x, "onFieldValidityChange", js.Any.fromFunction2((t0: /* field */ js.UndefOr[typingsJapgolly.extjs.Ext.form.field.IField], t1: /* valid */ js.UndefOr[Boolean]) => (value(t0, t1)).runNow()))
    
    inline def setOnFieldValidityChangeUndefined: Self = StObject.set(x, "onFieldValidityChange", js.undefined)
  }
}
