package typingsJapgolly.table

import typingsJapgolly.table.distSrcTypesApiMod.TableUserConfig
import typingsJapgolly.table.tableStrings.configDotjson
import typingsJapgolly.table.tableStrings.streamConfigDotjson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcValidateConfigMod {
  
  @JSImport("table/dist/src/validateConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateConfig(schemaId: configDotjson | streamConfigDotjson, config: TableUserConfig): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateConfig")(schemaId.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
