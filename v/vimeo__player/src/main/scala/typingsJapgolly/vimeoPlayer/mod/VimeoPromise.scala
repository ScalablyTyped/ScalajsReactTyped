package typingsJapgolly.vimeoPlayer.mod

import typingsJapgolly.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VimeoPromise[Result, Reason]
  extends StObject
     with Promise[Result] {
  
  def apply(): js.Promise[Result] = js.native
  def apply(successCallback: js.Function1[/* promiseValue */ Result, Unit]): js.Promise[Result] = js.native
  def apply(
    successCallback: js.Function1[/* promiseValue */ Result, Unit],
    rejectCallback: js.Function1[/* reasonValue */ Reason, Unit]
  ): js.Promise[Result] = js.native
  def apply(successCallback: Unit, rejectCallback: js.Function1[/* reasonValue */ Reason, Unit]): js.Promise[Result] = js.native
}
