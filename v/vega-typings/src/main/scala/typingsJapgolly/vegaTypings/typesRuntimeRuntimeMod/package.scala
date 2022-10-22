package typingsJapgolly.vegaTypings.typesRuntimeRuntimeMod

import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import typingsJapgolly.vegaTypings.anon.Signal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Binding = Signal & typingsJapgolly.vegaTypings.typesSpecBindMod.Binding

type ID = String | Double

type ObjectOrAny[T /* <: js.Object */] = T | js.Array[Any] | ((Record[String, Any]) & (Partial[Record[KeysOfUnion[T], scala.Nothing]])) | Primitive

type ObjectOrListObjectOrAny[T /* <: js.Object */] = T | js.Array[ObjectOrAny[T]] | ((Record[String, Any]) & (Partial[Record[KeysOfUnion[T], scala.Nothing]])) | Primitive

type OrArray[T] = T | js.Array[T]

type Parameter = ObjectOrListObjectOrAny[BuiltinParameter]

type Primitive = js.UndefOr[Double | String | js.BigInt | Boolean | js.Symbol | Null]
