package typingsJapgolly.gaxios

import typingsJapgolly.gaxios.anon.Config
import typingsJapgolly.gaxios.anon.ShouldRetry
import typingsJapgolly.gaxios.buildSrcCommonMod.GaxiosError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcRetryMod {
  
  @JSImport("gaxios/build/src/retry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRetryConfig(err: GaxiosError[Any]): js.Promise[Config | ShouldRetry] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRetryConfig")(err.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Config | ShouldRetry]]
}
