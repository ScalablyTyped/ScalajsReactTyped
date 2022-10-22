package typingsJapgolly.wdioConfig

import typingsJapgolly.wdioConfig.anon.OmitTestrunnercapabilitie
import typingsJapgolly.wdioConfig.wdioConfigStrings.after
import typingsJapgolly.wdioConfig.wdioConfigStrings.afterCommand
import typingsJapgolly.wdioConfig.wdioConfigStrings.afterHook
import typingsJapgolly.wdioConfig.wdioConfigStrings.afterSession
import typingsJapgolly.wdioConfig.wdioConfigStrings.afterSuite
import typingsJapgolly.wdioConfig.wdioConfigStrings.afterTest
import typingsJapgolly.wdioConfig.wdioConfigStrings.before
import typingsJapgolly.wdioConfig.wdioConfigStrings.beforeCommand
import typingsJapgolly.wdioConfig.wdioConfigStrings.beforeHook
import typingsJapgolly.wdioConfig.wdioConfigStrings.beforeSession
import typingsJapgolly.wdioConfig.wdioConfigStrings.beforeSuite
import typingsJapgolly.wdioConfig.wdioConfigStrings.beforeTest
import typingsJapgolly.wdioConfig.wdioConfigStrings.onComplete
import typingsJapgolly.wdioConfig.wdioConfigStrings.onPrepare
import typingsJapgolly.wdioConfig.wdioConfigStrings.onReload
import typingsJapgolly.wdioConfig.wdioConfigStrings.onWorkerEnd
import typingsJapgolly.wdioConfig.wdioConfigStrings.onWorkerStart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildConstantsMod {
  
  @JSImport("@wdio/config/build/constants", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DEFAULT_CONFIGS(): OmitTestrunnercapabilitie = ^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_CONFIGS")().asInstanceOf[OmitTestrunnercapabilitie]
  
  @JSImport("@wdio/config/build/constants", "SUPPORTED_FILE_EXTENSIONS")
  @js.native
  val SUPPORTED_FILE_EXTENSIONS: js.Array[String] = js.native
  
  @JSImport("@wdio/config/build/constants", "SUPPORTED_HOOKS")
  @js.native
  val SUPPORTED_HOOKS: js.Array[
    /* keyof @wdio/types.@wdio/types/build/Services.Hooks */ afterHook | onWorkerEnd | afterSuite | onReload | beforeTest | onComplete | afterCommand | after | before | beforeCommand | afterTest | beforeSuite | onWorkerStart | beforeSession | beforeHook | onPrepare | afterSession
  ] = js.native
}
