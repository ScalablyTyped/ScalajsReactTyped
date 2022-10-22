package typingsJapgolly.awsCrt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonPlatformMod {
  
  @JSImport("aws-crt/dist/common/platform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def crtVersion(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("crt_version")().asInstanceOf[Any]
  
  inline def isBrowser(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_browser")().asInstanceOf[Boolean]
  
  inline def isNodejs(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_nodejs")().asInstanceOf[Boolean]
  
  inline def packageInfo(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("package_info")().asInstanceOf[Any]
}
