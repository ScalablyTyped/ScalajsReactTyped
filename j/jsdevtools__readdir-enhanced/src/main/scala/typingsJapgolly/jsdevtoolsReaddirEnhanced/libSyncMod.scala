package typingsJapgolly.jsdevtoolsReaddirEnhanced

import typingsJapgolly.jsdevtoolsReaddirEnhanced.anon.Optionsstatsfalseundefine
import typingsJapgolly.jsdevtoolsReaddirEnhanced.anon.Optionsstatstrue
import typingsJapgolly.jsdevtoolsReaddirEnhanced.libTypesPublicMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSyncMod {
  
  @JSImport("@jsdevtools/readdir-enhanced/lib/sync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readdirSync(dir: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def readdirSync(dir: String, options: Optionsstatsfalseundefine): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def readdirSync(dir: String, options: Optionsstatstrue): js.Array[Stats] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Stats]]
}
