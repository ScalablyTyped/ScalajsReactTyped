package typingsJapgolly.ionicReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Callback extends StObject {
  
  var callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationLifecycle */ Any
  
  var opts: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationCallbackOptions */ Any
  ] = js.undefined
}
object Callback {
  
  inline def apply(
    callback: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationLifecycle */ Any
  ): Callback = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callback]
  }
  
  extension [Self <: Callback](x: Self) {
    
    inline def setCallback(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationLifecycle */ Any
    ): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setOpts(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationCallbackOptions */ Any
    ): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    
    inline def setOptsUndefined: Self = StObject.set(x, "opts", js.undefined)
  }
}
