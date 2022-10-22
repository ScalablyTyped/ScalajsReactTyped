package typingsJapgolly.randomJs

import typingsJapgolly.randomJs.distTypesMod.Engine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDistributionInt32Mod {
  
  @JSImport("random-js/dist/distribution/int32", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def int32(engine: Engine): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("int32")(engine.asInstanceOf[js.Any]).asInstanceOf[Double]
}
