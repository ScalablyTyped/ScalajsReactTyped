package typingsJapgolly.cucumberGherkin

import typingsJapgolly.cucumberMessages.mod.Envelope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMakeSourceEnvelopeMod {
  
  @JSImport("@cucumber/gherkin/dist/src/makeSourceEnvelope", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(data: String, uri: String): Envelope = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any], uri.asInstanceOf[js.Any])).asInstanceOf[Envelope]
}
