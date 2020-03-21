package typingsJapgolly.tern.inferMod

import typingsJapgolly.tern.Primnamebool
import typingsJapgolly.tern.Primnamenumber
import typingsJapgolly.tern.Primnamestring
import typingsJapgolly.tern.ternMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern/lib/infer", "Context")
@js.native
class ContextCls protected () extends Context {
  def this(defs: js.Array[_], parent: Server) = this()
  /** The primitive boolean type. */
  /* CompleteClass */
  override var bool: Primnamebool = js.native
  /** The primitive number type. */
  /* CompleteClass */
  override var num: Primnamenumber = js.native
  /** The primitive string type. */
  /* CompleteClass */
  override var str: Primnamestring = js.native
  /* CompleteClass */
  override var topScope: Scope = js.native
}

