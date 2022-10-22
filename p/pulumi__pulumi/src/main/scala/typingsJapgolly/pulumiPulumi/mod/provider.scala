package typingsJapgolly.pulumiPulumi.mod

import typingsJapgolly.pulumiPulumi.providerProviderMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object provider {
  
  @JSImport("@pulumi/pulumi", "provider")
  @js.native
  val ^ : js.Any = js.native
  
  inline def main(provider: Provider, args: js.Array[String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("main")(provider.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
