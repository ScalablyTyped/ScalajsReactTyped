package typingsJapgolly.kamailioKemi.mod.global.KSR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authDb {
  
  @JSGlobal("KSR.auth_db")
  @js.native
  val ^ : js.Any = js.native
  
  inline def authCheck(srealm: String, stable: String, iflags: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("auth_check")(srealm.asInstanceOf[js.Any], stable.asInstanceOf[js.Any], iflags.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isSubscriber(suri: String, stable: String, iflags: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("is_subscriber")(suri.asInstanceOf[js.Any], stable.asInstanceOf[js.Any], iflags.asInstanceOf[js.Any])).asInstanceOf[Double]
}
