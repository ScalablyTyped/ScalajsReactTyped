package typingsJapgolly.hexoUtil.mod

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.hexoUtil.AnonDictindex
import typingsJapgolly.std.RegExp
import typingsJapgolly.std.RegExpMatchArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pattern[T] extends js.Object {
  def `match`(str: String): T
  def test(str: String): Boolean
}

@JSImport("hexo-util", "Pattern")
@js.native
object Pattern
  extends Instantiable1[
      (/* rule */ js.Function1[/* str */ String, js.Object]) | (/* rule */ Pattern[js.Object]) | (/* rule */ RegExp) | (/* rule */ String), 
      Pattern[js.UndefOr[AnonDictindex | Null | js.Object | RegExpMatchArray]]
    ]

