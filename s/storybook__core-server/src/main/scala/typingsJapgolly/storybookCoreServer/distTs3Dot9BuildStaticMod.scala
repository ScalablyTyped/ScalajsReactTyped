package typingsJapgolly.storybookCoreServer

import typingsJapgolly.storybookCoreCommon.distTs3Dot9TypesMod.BuilderOptions
import typingsJapgolly.storybookCoreCommon.distTs3Dot9TypesMod.CLIOptions
import typingsJapgolly.storybookCoreCommon.distTs3Dot9TypesMod.LoadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9BuildStaticMod {
  
  @JSImport("@storybook/core-server/dist/ts3.9/build-static", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildStatic(hasPackageJsonLoadOptions: LoadOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildStatic")(hasPackageJsonLoadOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def buildStaticStandalone(options: CLIOptions & LoadOptions & BuilderOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildStaticStandalone")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
