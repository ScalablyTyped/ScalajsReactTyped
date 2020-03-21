package typingsJapgolly.marked

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.marked.mod.MarkedOptions
import typingsJapgolly.marked.mod.Parser_
import typingsJapgolly.marked.mod.TokensList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofParser
  extends Instantiable0[Parser_]
     with Instantiable1[/* options */ MarkedOptions, Parser_] {
  def parse(src: TokensList): String = js.native
  def parse(src: TokensList, options: MarkedOptions): String = js.native
}

