package typingsJapgolly.knockback.Knockback

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.backbone.mod.Model
import typingsJapgolly.backbone.mod.ModelSetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Store
  extends StObject
     with Destroyable {
  
  def clear(): Any
  
  def findOrCreate(obj: Model[Any, ModelSetOptions, Any], options: StoreOptions): Any
  
  def register(
    obj: Model[Any, ModelSetOptions, Any],
    observable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any,
    options: StoreOptions
  ): Any
}
object Store {
  
  inline def apply(
    clear: CallbackTo[Any],
    destroy: CallbackTo[Any],
    findOrCreate: (Model[Any, ModelSetOptions, Any], StoreOptions) => Any,
    register: (Model[Any, ModelSetOptions, Any], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any, StoreOptions) => Any
  ): Store = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn, destroy = destroy.toJsFn, findOrCreate = js.Any.fromFunction2(findOrCreate), register = js.Any.fromFunction3(register))
    __obj.asInstanceOf[Store]
  }
  
  extension [Self <: Store](x: Self) {
    
    inline def setClear(value: CallbackTo[Any]): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setFindOrCreate(value: (Model[Any, ModelSetOptions, Any], StoreOptions) => Any): Self = StObject.set(x, "findOrCreate", js.Any.fromFunction2(value))
    
    inline def setRegister(
      value: (Model[Any, ModelSetOptions, Any], /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<any> */ Any, StoreOptions) => Any
    ): Self = StObject.set(x, "register", js.Any.fromFunction3(value))
  }
}
