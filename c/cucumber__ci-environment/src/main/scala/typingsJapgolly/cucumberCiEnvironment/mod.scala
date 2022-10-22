package typingsJapgolly.cucumberCiEnvironment

import typingsJapgolly.cucumberCiEnvironment.distCjsSrcTypesMod.CiEnvironment
import typingsJapgolly.cucumberCiEnvironment.distCjsSrcTypesMod.Env
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@cucumber/ci-environment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(env: Env): js.UndefOr[CiEnvironment] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(env.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CiEnvironment]]
}
