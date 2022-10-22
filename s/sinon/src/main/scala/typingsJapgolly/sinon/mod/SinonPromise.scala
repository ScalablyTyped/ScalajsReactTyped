package typingsJapgolly.sinon.mod

import typingsJapgolly.sinon.sinonStrings.pending
import typingsJapgolly.sinon.sinonStrings.rejected
import typingsJapgolly.sinon.sinonStrings.resolved
import typingsJapgolly.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SinonPromise[T]
  extends StObject
     with Promise[T] {
  
  def reject(reason: Any): js.Promise[Unit] = js.native
  
  var rejectedValue: js.UndefOr[Any] = js.native
  
  def resolve(`val`: Any): js.Promise[T] = js.native
  
  var resolvedValue: js.UndefOr[T] = js.native
  
  var status: pending | resolved | rejected = js.native
}
