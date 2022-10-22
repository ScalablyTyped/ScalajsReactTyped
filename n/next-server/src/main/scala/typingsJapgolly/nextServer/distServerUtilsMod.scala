package typingsJapgolly.nextServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerUtilsMod {
  
  @JSImport("next-server/dist/server/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cleanAmpPath(pathname: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanAmpPath")(pathname.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isBlockedPage(pathname: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlockedPage")(pathname.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isInternalUrl(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInternalUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
