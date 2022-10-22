package typingsJapgolly.antDesignProUtils.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.antd.libFormHooksUseFormMod.FormInstance
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormRef[DataType] extends StObject {
  
  var formRef: js.UndefOr[Ref[js.UndefOr[FormInstance[Any]]]] = js.undefined
  
  var onInit: js.UndefOr[js.Function2[/* values */ DataType, /* form */ FormInstance[Any], Unit]] = js.undefined
}
object FormRef {
  
  inline def apply[DataType](): FormRef[DataType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormRef[DataType]]
  }
  
  extension [Self <: FormRef[?], DataType](x: Self & FormRef[DataType]) {
    
    inline def setFormRef(value: Ref[js.UndefOr[FormInstance[Any]]]): Self = StObject.set(x, "formRef", value.asInstanceOf[js.Any])
    
    inline def setFormRefFunction1(value: js.UndefOr[FormInstance[Any]] | Null => Callback): Self = StObject.set(x, "formRef", js.Any.fromFunction1((t0: js.UndefOr[FormInstance[Any]] | Null) => value(t0).runNow()))
    
    inline def setFormRefNull: Self = StObject.set(x, "formRef", null)
    
    inline def setFormRefUndefined: Self = StObject.set(x, "formRef", js.undefined)
    
    inline def setOnInit(value: (/* values */ DataType, /* form */ FormInstance[Any]) => Callback): Self = StObject.set(x, "onInit", js.Any.fromFunction2((t0: /* values */ DataType, t1: /* form */ FormInstance[Any]) => (value(t0, t1)).runNow()))
    
    inline def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
  }
}
