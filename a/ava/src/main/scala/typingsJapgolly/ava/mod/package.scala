package typingsJapgolly.ava

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AssertionError = js.Error
  type CbImplementation[Context] = js.Function1[
    /* t */ typingsJapgolly.ava.mod.CbExecutionContext[Context], 
    typingsJapgolly.ava.mod.ImplementationResult
  ]
  type CbMacro[Args /* <: js.Array[_] */, Context] = (typingsJapgolly.ava.mod.UntitledCbMacro[Args, Context]) with typingsJapgolly.ava.AnonTitle[Args]
  type Constructor = org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, js.Any]
  type EitherCbMacro[Args /* <: js.Array[_] */, Context] = (typingsJapgolly.ava.mod.CbMacro[Args, Context]) | (typingsJapgolly.ava.mod.UntitledCbMacro[Args, Context])
  type EitherMacro[Args /* <: js.Array[_] */, Context] = (typingsJapgolly.ava.mod.Macro[Args, Context]) | (typingsJapgolly.ava.mod.UntitledMacro[Args, Context])
  type Implementation[Context] = js.Function1[
    /* t */ typingsJapgolly.ava.mod.ExecutionContext[Context], 
    typingsJapgolly.ava.mod.ImplementationResult
  ]
  type ImplementationResult = js.Thenable[scala.Unit] | typingsJapgolly.ava.mod.ObservableLike | scala.Unit
  type Macro[Args /* <: js.Array[_] */, Context] = (typingsJapgolly.ava.mod.UntitledMacro[Args, Context]) with typingsJapgolly.ava.AnonTitle[Args]
  type OneOrMoreCbMacros[Args /* <: js.Array[_] */, Context] = (typingsJapgolly.ava.mod.EitherCbMacro[Args, Context]) | (Array[typingsJapgolly.ava.mod.EitherCbMacro[Args, Context]])
  type OneOrMoreMacros[Args /* <: js.Array[_] */, Context] = (typingsJapgolly.ava.mod.EitherMacro[Args, Context]) | (Array[typingsJapgolly.ava.mod.EitherMacro[Args, Context]])
  type TimeoutFn = js.Function1[/* ms */ scala.Double, scala.Unit]
  type TodoDeclaration = js.Function1[/* title */ java.lang.String, scala.Unit]
  type UntitledCbMacro[Args /* <: js.Array[_] */, Context] = js.Function2[
    /* t */ typingsJapgolly.ava.mod.CbExecutionContext[Context], 
    /* args */ Args, 
    typingsJapgolly.ava.mod.ImplementationResult
  ]
  type UntitledMacro[Args /* <: js.Array[_] */, Context] = js.Function2[
    /* t */ typingsJapgolly.ava.mod.ExecutionContext[Context], 
    /* args */ Args, 
    typingsJapgolly.ava.mod.ImplementationResult
  ]
}
