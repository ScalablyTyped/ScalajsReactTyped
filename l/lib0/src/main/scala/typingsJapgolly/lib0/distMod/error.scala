package typingsJapgolly.lib0.distMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object error {
  
  @JSImport("lib0/dist", "error")
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(s: String): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(s.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  inline def methodUnimplemented(): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("methodUnimplemented")().asInstanceOf[scala.Nothing]
  
  inline def unexpectedCase(): scala.Nothing = ^.asInstanceOf[js.Dynamic].applyDynamic("unexpectedCase")().asInstanceOf[scala.Nothing]
}
