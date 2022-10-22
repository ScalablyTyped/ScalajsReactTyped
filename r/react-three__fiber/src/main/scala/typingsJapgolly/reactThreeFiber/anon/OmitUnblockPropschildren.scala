package typingsJapgolly.reactThreeFiber.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Dispatch
import typingsJapgolly.react.mod.SetStateAction
import typingsJapgolly.reactThreeFiber.distDeclarationsSrcCoreUtilsMod.SetBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@react-three/fiber.@react-three/fiber/dist/declarations/src/core/utils.UnblockProps, 'children'> */
trait OmitUnblockPropschildren extends StObject {
  
  var set: Dispatch[SetStateAction[SetBlock]]
}
object OmitUnblockPropschildren {
  
  inline def apply(set: SetStateAction[SetBlock] => Callback): OmitUnblockPropschildren = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction1((t0: SetStateAction[SetBlock]) => set(t0).runNow()))
    __obj.asInstanceOf[OmitUnblockPropschildren]
  }
  
  extension [Self <: OmitUnblockPropschildren](x: Self) {
    
    inline def setSet(value: SetStateAction[SetBlock] => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: SetStateAction[SetBlock]) => value(t0).runNow()))
  }
}
