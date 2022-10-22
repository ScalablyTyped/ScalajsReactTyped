package typingsJapgolly.tsToolbelt

import typingsJapgolly.tsToolbelt.outAnyPromiseMod.Promise
import typingsJapgolly.tsToolbelt.outFunctionFunctionMod.Function
import typingsJapgolly.tsToolbelt.outFunctionParametersMod.Parameters
import typingsJapgolly.tsToolbelt.outFunctionReturnMod.Return
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outFunctionPromisifyMod {
  
  type Promisify[F /* <: Function[Any, Any] */] = js.Function1[/* args */ Parameters[F], Promise[Return[F]]]
}
