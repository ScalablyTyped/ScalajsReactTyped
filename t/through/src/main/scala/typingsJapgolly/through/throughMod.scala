package typingsJapgolly.through

import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.through.throughMod.ThroughStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("through", JSImport.Namespace)
@js.native
object throughMod extends js.Object {
  @js.native
  trait ThroughStream extends Transform {
    var autoDestroy: Boolean = js.native
  }
  
  def apply(): ThroughStream = js.native
  def apply(write: js.Function1[/* data */ js.Any, Unit]): ThroughStream = js.native
  def apply(write: js.Function1[/* data */ js.Any, Unit], end: js.Function0[Unit]): ThroughStream = js.native
  def apply(write: js.Function1[/* data */ js.Any, Unit], end: js.Function0[Unit], opts: Anon_AutoDestroy): ThroughStream = js.native
}

