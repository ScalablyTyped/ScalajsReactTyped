package typingsJapgolly.interactjsTypes.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.interactjsTypes.coreScopeMod.Scope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoStartbeforestart extends StObject {
  
  @JSName("autoStart:before-start")
  def `autoStartColonbefore-start`(hasInteractionEventTargetDxDy: PointerArgPropstypemovedx, scope: Scope): Unit
  @JSName("autoStart:before-start")
  var `autoStartColonbefore-start_Original`: js.Function2[
    /* hasInteractionEventTargetDxDy */ PointerArgPropstypemovedx, 
    /* scope */ Scope, 
    Unit
  ]
}
object AutoStartbeforestart {
  
  inline def apply(
    `autoStartColonbefore-start`: (/* hasInteractionEventTargetDxDy */ PointerArgPropstypemovedx, /* scope */ Scope) => Callback
  ): AutoStartbeforestart = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoStart:before-start")(js.Any.fromFunction2((t0: /* hasInteractionEventTargetDxDy */ PointerArgPropstypemovedx, t1: /* scope */ Scope) => (`autoStartColonbefore-start`(t0, t1)).runNow()))
    __obj.asInstanceOf[AutoStartbeforestart]
  }
  
  extension [Self <: AutoStartbeforestart](x: Self) {
    
    inline def `setAutoStartColonbefore-start`(
      value: (/* hasInteractionEventTargetDxDy */ PointerArgPropstypemovedx, /* scope */ Scope) => Callback
    ): Self = StObject.set(x, "autoStart:before-start", js.Any.fromFunction2((t0: /* hasInteractionEventTargetDxDy */ PointerArgPropstypemovedx, t1: /* scope */ Scope) => (value(t0, t1)).runNow()))
  }
}
