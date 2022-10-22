package typingsJapgolly.useCallbackRef

import typingsJapgolly.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5TypesMod {
  
  type DefinedReactRef[T] = RefCallback[T] | RefObject[T]
  
  type ReactRef[T] = DefinedReactRef[T] | Null
  
  type RefCallback[T] = js.Function1[/* newValue */ T | Null, Unit]
  
  type RefObject[T] = MutableRefObject[T | Null]
}
