package typingsJapgolly.tern.inferMod

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.tern.Primnamebool
import typingsJapgolly.tern.Primnamenumber
import typingsJapgolly.tern.Primnamestring
import typingsJapgolly.tern.ternMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  /** The primitive boolean type. */
  var bool: Primnamebool
  /** The primitive number type. */
  var num: Primnamenumber
  var parent: js.UndefOr[Server] = js.undefined
  /** The primitive string type. */
  var str: Primnamestring
  var topScope: Scope
}

@JSImport("tern/lib/infer", "Context")
@js.native
object Context extends TopLevel[ContextConstructor]

