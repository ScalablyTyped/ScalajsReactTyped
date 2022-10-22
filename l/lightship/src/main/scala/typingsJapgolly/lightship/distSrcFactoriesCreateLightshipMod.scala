package typingsJapgolly.lightship

import typingsJapgolly.lightship.distSrcTypesMod.ConfigurationInput
import typingsJapgolly.lightship.distSrcTypesMod.Lightship
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFactoriesCreateLightshipMod {
  
  @JSImport("lightship/dist/src/factories/createLightship", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[Lightship] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[Lightship]]
  inline def default(userConfiguration: ConfigurationInput): js.Promise[Lightship] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(userConfiguration.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Lightship]]
}
