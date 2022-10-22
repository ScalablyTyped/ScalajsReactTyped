package typingsJapgolly.reduxBootstrap

import typingsJapgolly.reduxBootstrap.dtsInterfacesInterfacesMod.interfaces.BoostrapOptions
import typingsJapgolly.reduxBootstrap.dtsInterfacesInterfacesMod.interfaces.BootstrapResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-bootstrap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bootstrap(options: BoostrapOptions): BootstrapResult = ^.asInstanceOf[js.Dynamic].applyDynamic("bootstrap")(options.asInstanceOf[js.Any]).asInstanceOf[BootstrapResult]
}
