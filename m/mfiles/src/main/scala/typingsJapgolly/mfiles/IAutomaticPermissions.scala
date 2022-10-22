package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAutomaticPermissions extends StObject {
  
  var CanDeactivate: Boolean
  
  def Clone(): IAutomaticPermissions
  
  val IsBasedOnObjectACL: Boolean
  
  val IsDefault: Boolean
  
  val NamedACL: INamedACL
  
  def SetBasedOnObjectACL(): Unit
  
  def SetNamedACL(NamedACL: INamedACL): Unit
}
object IAutomaticPermissions {
  
  inline def apply(
    CanDeactivate: Boolean,
    Clone: CallbackTo[IAutomaticPermissions],
    IsBasedOnObjectACL: Boolean,
    IsDefault: Boolean,
    NamedACL: INamedACL,
    SetBasedOnObjectACL: Callback,
    SetNamedACL: INamedACL => Callback
  ): IAutomaticPermissions = {
    val __obj = js.Dynamic.literal(CanDeactivate = CanDeactivate.asInstanceOf[js.Any], Clone = Clone.toJsFn, IsBasedOnObjectACL = IsBasedOnObjectACL.asInstanceOf[js.Any], IsDefault = IsDefault.asInstanceOf[js.Any], NamedACL = NamedACL.asInstanceOf[js.Any], SetBasedOnObjectACL = SetBasedOnObjectACL.toJsFn, SetNamedACL = js.Any.fromFunction1((t0: INamedACL) => SetNamedACL(t0).runNow()))
    __obj.asInstanceOf[IAutomaticPermissions]
  }
  
  extension [Self <: IAutomaticPermissions](x: Self) {
    
    inline def setCanDeactivate(value: Boolean): Self = StObject.set(x, "CanDeactivate", value.asInstanceOf[js.Any])
    
    inline def setClone(value: CallbackTo[IAutomaticPermissions]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setIsBasedOnObjectACL(value: Boolean): Self = StObject.set(x, "IsBasedOnObjectACL", value.asInstanceOf[js.Any])
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "IsDefault", value.asInstanceOf[js.Any])
    
    inline def setNamedACL(value: INamedACL): Self = StObject.set(x, "NamedACL", value.asInstanceOf[js.Any])
    
    inline def setSetBasedOnObjectACL(value: Callback): Self = StObject.set(x, "SetBasedOnObjectACL", value.toJsFn)
    
    inline def setSetNamedACL(value: INamedACL => Callback): Self = StObject.set(x, "SetNamedACL", js.Any.fromFunction1((t0: INamedACL) => value(t0).runNow()))
  }
}
