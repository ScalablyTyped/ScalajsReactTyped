package typingsJapgolly.inversify.libInterfacesInterfacesMod.interfaces

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BindingInSyntax[T] extends StObject {
  
  def inRequestScope(): BindingWhenOnSyntax[T]
  
  def inSingletonScope(): BindingWhenOnSyntax[T]
  
  def inTransientScope(): BindingWhenOnSyntax[T]
}
object BindingInSyntax {
  
  inline def apply[T](
    inRequestScope: CallbackTo[BindingWhenOnSyntax[T]],
    inSingletonScope: CallbackTo[BindingWhenOnSyntax[T]],
    inTransientScope: CallbackTo[BindingWhenOnSyntax[T]]
  ): BindingInSyntax[T] = {
    val __obj = js.Dynamic.literal(inRequestScope = inRequestScope.toJsFn, inSingletonScope = inSingletonScope.toJsFn, inTransientScope = inTransientScope.toJsFn)
    __obj.asInstanceOf[BindingInSyntax[T]]
  }
  
  extension [Self <: BindingInSyntax[?], T](x: Self & BindingInSyntax[T]) {
    
    inline def setInRequestScope(value: CallbackTo[BindingWhenOnSyntax[T]]): Self = StObject.set(x, "inRequestScope", value.toJsFn)
    
    inline def setInSingletonScope(value: CallbackTo[BindingWhenOnSyntax[T]]): Self = StObject.set(x, "inSingletonScope", value.toJsFn)
    
    inline def setInTransientScope(value: CallbackTo[BindingWhenOnSyntax[T]]): Self = StObject.set(x, "inTransientScope", value.toJsFn)
  }
}
