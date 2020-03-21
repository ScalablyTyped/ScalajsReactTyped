package typingsJapgolly.nodelibFsWalk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object settingsMod {
  type DeepFilterFunction = typingsJapgolly.nodelibFsWalk.settingsMod.FilterFunction[typingsJapgolly.nodelibFsWalk.typesMod.Entry]
  type EntryFilterFunction = typingsJapgolly.nodelibFsWalk.settingsMod.FilterFunction[typingsJapgolly.nodelibFsWalk.typesMod.Entry]
  type ErrorFilterFunction = typingsJapgolly.nodelibFsWalk.settingsMod.FilterFunction[typingsJapgolly.nodelibFsWalk.typesMod.Errno]
  type FilterFunction[T] = js.Function1[/* value */ T, scala.Boolean]
}
