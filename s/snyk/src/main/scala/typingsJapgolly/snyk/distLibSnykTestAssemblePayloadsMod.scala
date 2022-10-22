package typingsJapgolly.snyk

import typingsJapgolly.snyk.distLibEcosystemsTypesMod.Ecosystem
import typingsJapgolly.snyk.distLibSnykTestTypesMod.Payload
import typingsJapgolly.snyk.distLibTypesMod.Options
import typingsJapgolly.snyk.distLibTypesMod.PolicyOptions
import typingsJapgolly.snyk.distLibTypesMod.TestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibSnykTestAssemblePayloadsMod {
  
  @JSImport("snyk/dist/lib/snyk-test/assemble-payloads", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assembleEcosystemPayloads(ecosystem: Ecosystem, options: Options & TestOptions & PolicyOptions): js.Promise[js.Array[Payload]] = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleEcosystemPayloads")(ecosystem.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Payload]]]
}
