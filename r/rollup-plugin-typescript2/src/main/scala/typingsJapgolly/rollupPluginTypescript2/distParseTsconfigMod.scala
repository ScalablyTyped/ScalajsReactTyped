package typingsJapgolly.rollupPluginTypescript2

import typingsJapgolly.rollupPluginTypescript2.anon.FileName
import typingsJapgolly.rollupPluginTypescript2.distContextMod.RollupContext
import typingsJapgolly.rollupPluginTypescript2.distIoptionsMod.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distParseTsconfigMod {
  
  @JSImport("rollup-plugin-typescript2/dist/parse-tsconfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseTsConfig(context: RollupContext, pluginOptions: IOptions): FileName = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTsConfig")(context.asInstanceOf[js.Any], pluginOptions.asInstanceOf[js.Any])).asInstanceOf[FileName]
}
