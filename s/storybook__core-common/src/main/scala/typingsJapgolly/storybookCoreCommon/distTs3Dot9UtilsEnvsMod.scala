package typingsJapgolly.storybookCoreCommon

import typingsJapgolly.std.Record
import typingsJapgolly.storybookCoreCommon.anon.Production
import typingsJapgolly.storybookCoreCommon.anon.Raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9UtilsEnvsMod {
  
  @JSImport("@storybook/core-common/dist/ts3.9/utils/envs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadEnvs(): Raw = ^.asInstanceOf[js.Dynamic].applyDynamic("loadEnvs")().asInstanceOf[Raw]
  inline def loadEnvs(options: Production): Raw = ^.asInstanceOf[js.Dynamic].applyDynamic("loadEnvs")(options.asInstanceOf[js.Any]).asInstanceOf[Raw]
  
  inline def stringifyEnvs(raw: Record[String, String]): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyEnvs")(raw.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
  
  inline def stringifyProcessEnvs(raw: Record[String, String]): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyProcessEnvs")(raw.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
}
