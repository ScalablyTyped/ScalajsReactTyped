package typingsJapgolly.toughCookie.mod.CookieJar

import typingsJapgolly.std.Error
import typingsJapgolly.toughCookie.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tough-cookie", "CookieJar")
@js.native
object ^ extends js.Object {
  def deserialize(serialized: String, cb: js.Function2[/* err */ Error | Null, /* object */ this.type, Unit]): Unit = js.native
  def deserialize(
    serialized: String,
    store: Store,
    cb: js.Function2[/* err */ js.Error | Null, /* object */ this.type, Unit]
  ): Unit = js.native
  def deserialize(serialized: Serialized, cb: js.Function2[/* err */ Error | Null, /* object */ this.type, Unit]): Unit = js.native
  def deserialize(
    serialized: Serialized,
    store: Store,
    cb: js.Function2[/* err */ js.Error | Null, /* object */ this.type, Unit]
  ): Unit = js.native
  def deserializeSync(serialized: String): typingsJapgolly.toughCookie.mod.CookieJar = js.native
  def deserializeSync(serialized: String, store: Store): typingsJapgolly.toughCookie.mod.CookieJar = js.native
  def deserializeSync(serialized: Serialized): typingsJapgolly.toughCookie.mod.CookieJar = js.native
  def deserializeSync(serialized: Serialized, store: Store): typingsJapgolly.toughCookie.mod.CookieJar = js.native
  def fromJSON(string: String): typingsJapgolly.toughCookie.mod.CookieJar = js.native
}

