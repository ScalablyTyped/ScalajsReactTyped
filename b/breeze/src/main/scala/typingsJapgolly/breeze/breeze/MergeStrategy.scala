package typingsJapgolly.breeze.breeze

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.breeze.breeze.core.IEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeStrategy extends IEnum {
  var Disallowed: MergeStrategySymbol
  var OverwriteChanges: MergeStrategySymbol
  var PreserveChanges: MergeStrategySymbol
  var SkipMerge: MergeStrategySymbol
}

@JSGlobal("breeze.MergeStrategy")
@js.native
object MergeStrategy extends TopLevel[MergeStrategy]

