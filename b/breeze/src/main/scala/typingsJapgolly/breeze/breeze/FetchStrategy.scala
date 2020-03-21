package typingsJapgolly.breeze.breeze

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.breeze.breeze.core.IEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchStrategy extends IEnum {
  var FromLocalCache: FetchStrategySymbol
  var FromServer: FetchStrategySymbol
}

@JSGlobal("breeze.FetchStrategy")
@js.native
object FetchStrategy extends TopLevel[FetchStrategy]

