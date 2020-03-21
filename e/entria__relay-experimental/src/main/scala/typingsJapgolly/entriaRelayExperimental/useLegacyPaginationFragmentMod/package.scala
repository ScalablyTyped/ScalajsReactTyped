package typingsJapgolly.entriaRelayExperimental

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object useLegacyPaginationFragmentMod {
  type NonNullableFragmentReturn[TReturn] = typingsJapgolly.std.ReturnType[
    typingsJapgolly.entriaRelayExperimental.useLegacyPaginationFragmentMod.NonNullableReturn[TReturn]
  ]
  type NonNullableReturn[TFragmentData] = js.Function1[/* data */ js.UndefOr[TFragmentData], TFragmentData]
  type NullableFragmentReturn[TReturn] = typingsJapgolly.std.ReturnType[
    typingsJapgolly.entriaRelayExperimental.useLegacyPaginationFragmentMod.NullableReturn[TReturn]
  ]
  type NullableReturn[TFragmentData] = js.Function1[/* data */ js.UndefOr[TFragmentData | scala.Null], TFragmentData | scala.Null]
}
