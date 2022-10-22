package typingsJapgolly.atom.srcOtherTypesMod

import typingsJapgolly.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancellablePromise[T]
  extends StObject
     with Promise[T] {
  
  def cancel(): Unit = js.native
}
