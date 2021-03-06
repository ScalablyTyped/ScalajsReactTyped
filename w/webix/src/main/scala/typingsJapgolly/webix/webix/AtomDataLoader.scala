package typingsJapgolly.webix.webix

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AtomDataLoader extends js.Object {
  def load(url: String): js.Promise[_] = js.native
  def load(url: String, `type`: String): js.Promise[_] = js.native
  def load(url: String, `type`: String, callback: WebixCallback): js.Promise[_] = js.native
  def parse(data: js.Any, `type`: String): Unit = js.native
}

@JSGlobal("webix.AtomDataLoader")
@js.native
object AtomDataLoader extends TopLevel[AtomDataLoader]

