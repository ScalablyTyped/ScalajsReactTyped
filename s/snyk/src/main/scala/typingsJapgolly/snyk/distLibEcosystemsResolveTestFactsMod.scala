package typingsJapgolly.snyk

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.snyk.distLibEcosystemsTypesMod.Ecosystem
import typingsJapgolly.snyk.distLibEcosystemsTypesMod.ScanResult
import typingsJapgolly.snyk.distLibEcosystemsTypesMod.TestResult
import typingsJapgolly.snyk.distLibTypesMod.Options
import typingsJapgolly.snyk.distLibTypesMod.PolicyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibEcosystemsResolveTestFactsMod {
  
  @JSImport("snyk/dist/lib/ecosystems/resolve-test-facts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveAndTestFacts(
    ecosystem: Ecosystem,
    scans: StringDictionary[js.Array[ScanResult]],
    options: Options & PolicyOptions
  ): js.Promise[js.Tuple2[js.Array[TestResult], js.Array[String]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAndTestFacts")(ecosystem.asInstanceOf[js.Any], scans.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[js.Array[TestResult], js.Array[String]]]]
  
  inline def resolveAndTestFactsRegistry(
    ecosystem: Ecosystem,
    scans: StringDictionary[js.Array[ScanResult]],
    options: Options & PolicyOptions
  ): js.Promise[js.Tuple2[js.Array[TestResult], js.Array[String]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAndTestFactsRegistry")(ecosystem.asInstanceOf[js.Any], scans.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[js.Array[TestResult], js.Array[String]]]]
  
  inline def resolveAndTestFactsUnmanagedDeps(scans: StringDictionary[js.Array[ScanResult]], options: Options & PolicyOptions): js.Promise[js.Tuple2[js.Array[TestResult], js.Array[String]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveAndTestFactsUnmanagedDeps")(scans.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Tuple2[js.Array[TestResult], js.Array[String]]]]
}
