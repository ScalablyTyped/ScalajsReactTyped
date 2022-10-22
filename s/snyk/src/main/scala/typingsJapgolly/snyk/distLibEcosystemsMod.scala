package typingsJapgolly.snyk

import typingsJapgolly.snyk.distCliCommandsTypesMod.TestCommandResult
import typingsJapgolly.snyk.distLibEcosystemsTypesMod.Ecosystem
import typingsJapgolly.snyk.distLibEcosystemsTypesMod.EcosystemMonitorError
import typingsJapgolly.snyk.distLibEcosystemsTypesMod.EcosystemMonitorResult
import typingsJapgolly.snyk.distLibEcosystemsTypesMod.EcosystemPlugin
import typingsJapgolly.snyk.distLibTypesMod.Contributor
import typingsJapgolly.snyk.distLibTypesMod.Options
import typingsJapgolly.snyk.distLibTypesMod.PolicyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibEcosystemsMod {
  
  @JSImport("snyk/dist/lib/ecosystems", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEcosystem(options: Options): Ecosystem | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getEcosystem")(options.asInstanceOf[js.Any]).asInstanceOf[Ecosystem | Null]
  
  inline def getEcosystemForTest(options: Options): Ecosystem | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getEcosystemForTest")(options.asInstanceOf[js.Any]).asInstanceOf[Ecosystem | Null]
  
  inline def getPlugin(ecosystem: Ecosystem): EcosystemPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("getPlugin")(ecosystem.asInstanceOf[js.Any]).asInstanceOf[EcosystemPlugin]
  
  inline def monitorEcosystem(ecosystem: Ecosystem, paths: js.Array[String], options: Options & PolicyOptions): js.Promise[js.Tuple2[js.Array[EcosystemMonitorResult], js.Array[EcosystemMonitorError]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorEcosystem")(ecosystem.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[js.Array[EcosystemMonitorResult], js.Array[EcosystemMonitorError]]]]
  inline def monitorEcosystem(
    ecosystem: Ecosystem,
    paths: js.Array[String],
    options: Options & PolicyOptions,
    contributors: js.Array[Contributor]
  ): js.Promise[js.Tuple2[js.Array[EcosystemMonitorResult], js.Array[EcosystemMonitorError]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorEcosystem")(ecosystem.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], options.asInstanceOf[js.Any], contributors.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[js.Array[EcosystemMonitorResult], js.Array[EcosystemMonitorError]]]]
  
  inline def testEcosystem(ecosystem: Ecosystem, paths: js.Array[String], options: Options & PolicyOptions): js.Promise[TestCommandResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("testEcosystem")(ecosystem.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TestCommandResult]]
}
