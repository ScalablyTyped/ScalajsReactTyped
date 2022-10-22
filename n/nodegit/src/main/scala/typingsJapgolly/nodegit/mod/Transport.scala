package typingsJapgolly.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Transport")
@js.native
open class Transport ()
  extends typingsJapgolly.nodegit.transportMod.Transport
/* static members */
object Transport {
  
  @JSImport("nodegit", "Transport")
  @js.native
  val ^ : js.Any = js.native
  
  inline def sshWithPaths(owner: typingsJapgolly.nodegit.remoteMod.Remote, payload: String): js.Promise[typingsJapgolly.nodegit.transportMod.Transport] = (^.asInstanceOf[js.Dynamic].applyDynamic("sshWithPaths")(owner.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.transportMod.Transport]]
  inline def sshWithPaths(owner: typingsJapgolly.nodegit.remoteMod.Remote, payload: js.Array[String]): js.Promise[typingsJapgolly.nodegit.transportMod.Transport] = (^.asInstanceOf[js.Dynamic].applyDynamic("sshWithPaths")(owner.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.transportMod.Transport]]
  inline def sshWithPaths(
    owner: typingsJapgolly.nodegit.remoteMod.Remote,
    payload: typingsJapgolly.nodegit.strArrayMod.Strarray
  ): js.Promise[typingsJapgolly.nodegit.transportMod.Transport] = (^.asInstanceOf[js.Dynamic].applyDynamic("sshWithPaths")(owner.asInstanceOf[js.Any], payload.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.transportMod.Transport]]
  
  inline def unregister(prefix: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("unregister")(prefix.asInstanceOf[js.Any]).asInstanceOf[Double]
}
