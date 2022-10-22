package typingsJapgolly.next

import typingsJapgolly.next.distServerConfigSharedMod.NextConfigComplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerConfigMod {
  
  @JSImport("next/dist/server/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(phase: String, dir: String): js.Promise[NextConfigComplete] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(phase.asInstanceOf[js.Any], dir.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NextConfigComplete]]
  inline def default(phase: String, dir: String, customConfig: js.Object): js.Promise[NextConfigComplete] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(phase.asInstanceOf[js.Any], dir.asInstanceOf[js.Any], customConfig.asInstanceOf[js.Any])).asInstanceOf[js.Promise[NextConfigComplete]]
  
  inline def normalizeConfig(phase: String, config: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeConfig")(phase.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def setHttpAgentOptions_httpAgentOptions(
    options: /* import warning: importer.ImportType#apply Failed type conversion: next.next/dist/server/config-shared.NextConfigComplete['httpAgentOptions'] */ js.Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setHttpAgentOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
