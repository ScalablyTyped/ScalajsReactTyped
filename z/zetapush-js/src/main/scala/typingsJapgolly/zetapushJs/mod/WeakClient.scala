package typingsJapgolly.zetapushJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zetapush-js", "WeakClient")
@js.native
class WeakClient protected () extends Client {
  def this(options: WeakClientOptions) = this()
  def getToken(): Token = js.native
}

