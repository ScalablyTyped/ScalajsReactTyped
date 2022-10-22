package typingsJapgolly.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Signature")
@js.native
open class Signature ()
  extends typingsJapgolly.nodegit.signatureMod.Signature
/* static members */
object Signature {
  
  @JSImport("nodegit", "Signature")
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(repo: typingsJapgolly.nodegit.repositoryMod.Repository): js.Promise[typingsJapgolly.nodegit.signatureMod.Signature] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.nodegit.signatureMod.Signature]]
  
  inline def create(name: String, email: String, time: Double, offset: Double): typingsJapgolly.nodegit.signatureMod.Signature = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], email.asInstanceOf[js.Any], time.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodegit.signatureMod.Signature]
  
  inline def fromBuffer(buf: String): js.Promise[typingsJapgolly.nodegit.signatureMod.Signature] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buf.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.nodegit.signatureMod.Signature]]
  
  inline def now(name: String, email: String): typingsJapgolly.nodegit.signatureMod.Signature = (^.asInstanceOf[js.Dynamic].applyDynamic("now")(name.asInstanceOf[js.Any], email.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodegit.signatureMod.Signature]
}
