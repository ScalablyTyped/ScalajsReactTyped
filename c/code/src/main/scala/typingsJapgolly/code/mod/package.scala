package typingsJapgolly.code

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Assertion[T] = typingsJapgolly.code.mod.Grammar[T] with typingsJapgolly.code.mod.Flags[T]
  type AssertionChain[T] = typingsJapgolly.code.mod.Assertion[T] with typingsJapgolly.code.mod.Expectation[T]
  type Expectation[T] = typingsJapgolly.code.mod.Types[T] with typingsJapgolly.code.mod.Values[T]
}
