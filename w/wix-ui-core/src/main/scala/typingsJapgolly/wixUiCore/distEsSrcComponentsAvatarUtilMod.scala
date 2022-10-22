package typingsJapgolly.wixUiCore

import typingsJapgolly.wixUiCore.wixUiCoreInts.`1`
import typingsJapgolly.wixUiCore.wixUiCoreInts.`2`
import typingsJapgolly.wixUiCore.wixUiCoreInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsAvatarUtilMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/avatar/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def nameToInitials(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("nameToInitials")().asInstanceOf[String]
  inline def nameToInitials(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("nameToInitials")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def nameToInitials(name: String, limit: `1` | `2` | `3`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("nameToInitials")(name.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def nameToInitials(name: Unit, limit: `1` | `2` | `3`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("nameToInitials")(name.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[String]
}
