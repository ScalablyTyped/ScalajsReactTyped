package typingsJapgolly.firebaseDatabase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcApiServerValueMod {
  
  @JSImport("@firebase/database/dist/src/api/ServerValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def increment(delta: Double): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(delta.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def serverTimestamp(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("serverTimestamp")().asInstanceOf[js.Object]
}
