package typingsJapgolly.expoDevcert

import typingsJapgolly.expoDevcert.anon.CaCertPath
import typingsJapgolly.expoDevcert.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCertificateAuthorityMod {
  
  @JSImport("@expo/devcert/dist/certificate-authority", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[Unit]]
  inline def default(options: Options): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def ensureCACertReadable(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureCACertReadable")().asInstanceOf[js.Promise[Unit]]
  inline def ensureCACertReadable(options: Options): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureCACertReadable")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def uninstall(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("uninstall")().asInstanceOf[Unit]
  
  inline def withCertificateAuthorityCredentials(cb: js.Function1[/* hasCaKeyPathCaCertPath */ CaCertPath, js.Promise[Unit] | Unit]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("withCertificateAuthorityCredentials")(cb.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
