package typingsJapgolly.rollup

import typingsJapgolly.rollup.mod.RollupWatcherEvent
import typingsJapgolly.rollup.rollupStrings.START
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends RollupWatcherEvent {
  var code: START
}

object Anon0 {
  @scala.inline
  def apply(code: START): Anon0 = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon0]
  }
}

