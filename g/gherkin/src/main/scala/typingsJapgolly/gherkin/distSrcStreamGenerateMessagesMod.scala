package typingsJapgolly.gherkin

import typingsJapgolly.cucumberMessages.mod.messages.Envelope
import typingsJapgolly.gherkin.distSrcIgherkinoptionsMod.IGherkinOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcStreamGenerateMessagesMod {
  
  @JSImport("gherkin/dist/src/stream/generateMessages", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(data: String, uri: String, options: IGherkinOptions): js.Array[Envelope] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any], uri.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Envelope]]
}
