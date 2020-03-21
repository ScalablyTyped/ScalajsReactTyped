package typingsJapgolly.seamlessImmutable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ImmutableArray {
  /** These methods are banned by seamless-immutable. */
  type MutatingArrayMethods = typingsJapgolly.std.Extract[
    js.Array[java.lang.String], 
    typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.push | typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.pop | typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.sort | typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.splice | typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.shift | typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.unshift | typingsJapgolly.seamlessImmutable.seamlessImmutableStrings.reverse | scala.Double
  ]
  /** The remaining properties on Array<T>, after we remove the mutating functions and the wrapped non-mutating functions. */
  type Remaining[T] = typingsJapgolly.seamlessImmutable.mod.Omit[
    js.Array[T], 
    typingsJapgolly.seamlessImmutable.mod.ImmutableArray.MutatingArrayMethods | typingsJapgolly.seamlessImmutable.mod.ImmutableArray.AdditionalMutatingArrayMethods | java.lang.String
  ]
}
