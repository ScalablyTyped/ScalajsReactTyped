package typingsJapgolly.koaLogger

import typingsJapgolly.koa.mod.DefaultContext
import typingsJapgolly.koa.mod.DefaultState
import typingsJapgolly.koa.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-logger", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait TransporterOpts extends js.Object {
    @JSName("transporter")
    var transporter_Original: Transporter = js.native
    def transporter(str: String, args: js.Object): Unit = js.native
  }
  
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(opts: Transporter): Middleware[DefaultState, DefaultContext] = js.native
  def apply(opts: TransporterOpts): Middleware[DefaultState, DefaultContext] = js.native
  type Transporter = js.Function2[/* str */ String, /* args */ js.Object, Unit]
}

