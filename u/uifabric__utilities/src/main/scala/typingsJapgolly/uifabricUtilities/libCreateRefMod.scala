package typingsJapgolly.uifabricUtilities

import japgolly.scalajs.react.facade.React.RefHandle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCreateRefMod {
  
  type IRefObject[T] = RefHandle[T] | RefObject[T] | (js.Function1[/* ref */ T | Null, Unit])
  
  @js.native
  trait RefObject[T] extends StObject {
    
    def apply(): Unit = js.native
    def apply(component: T): Unit = js.native
    
    var current: T | Null = js.native
  }
}
