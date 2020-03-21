package typingsJapgolly.tern.mod

import typingsJapgolly.tern.Primnamebool
import typingsJapgolly.tern.Primnamenumber
import typingsJapgolly.tern.Primnamestring
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tern", "Context")
@js.native
class ContextCls protected ()
  extends typingsJapgolly.tern.inferMod.Context {
  def this(defs: js.Array[_], parent: typingsJapgolly.tern.ternMod.Server) = this()
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
  override var topScope: typingsJapgolly.tern.inferMod.Scope = js.native
}

