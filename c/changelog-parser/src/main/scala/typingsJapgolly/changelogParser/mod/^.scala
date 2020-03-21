package typingsJapgolly.changelogParser.mod

import typingsJapgolly.changelogParser.PartialOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("changelog-parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(options: String): js.Promise[js.Object] = js.native
  def apply(options: String, callback: js.Function2[/* error */ String | Null, /* result */ js.Object, Unit]): js.Promise[js.Object] = js.native
  /**
    * Change log parser for node.
    */
  def apply(options: PartialOptions): js.Promise[js.Object] = js.native
  def apply(
    options: PartialOptions,
    callback: js.Function2[/* error */ String | Null, /* result */ js.Object, Unit]
  ): js.Promise[js.Object] = js.native
}

