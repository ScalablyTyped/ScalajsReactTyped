package typingsJapgolly.kolite

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirtyFlagResult extends StObject {
  
  def forceDirty(): Unit
  
  var isDirty: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ Any
  
  def reset(): Unit
}
object DirtyFlagResult {
  
  inline def apply(
    forceDirty: Callback,
    isDirty: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ Any,
    reset: Callback
  ): DirtyFlagResult = {
    val __obj = js.Dynamic.literal(forceDirty = forceDirty.toJsFn, isDirty = isDirty.asInstanceOf[js.Any], reset = reset.toJsFn)
    __obj.asInstanceOf[DirtyFlagResult]
  }
  
  extension [Self <: DirtyFlagResult](x: Self) {
    
    inline def setForceDirty(value: Callback): Self = StObject.set(x, "forceDirty", value.toJsFn)
    
    inline def setIsDirty(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ Any
    ): Self = StObject.set(x, "isDirty", value.asInstanceOf[js.Any])
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
  }
}
