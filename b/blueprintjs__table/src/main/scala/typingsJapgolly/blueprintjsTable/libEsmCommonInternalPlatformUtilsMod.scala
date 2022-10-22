package typingsJapgolly.blueprintjsTable

import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCommonInternalPlatformUtilsMod {
  
  @JSImport("@blueprintjs/table/lib/esm/common/internal/platformUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isMac(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMac")().asInstanceOf[Boolean]
  inline def isMac(platformOverride: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMac")(platformOverride.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isModKeyPressed(event: KeyboardEvent): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModKeyPressed")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isModKeyPressed(event: KeyboardEvent, platformOverride: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isModKeyPressed")(event.asInstanceOf[js.Any], platformOverride.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
