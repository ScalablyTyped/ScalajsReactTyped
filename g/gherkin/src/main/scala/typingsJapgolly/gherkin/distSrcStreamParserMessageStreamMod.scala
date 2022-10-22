package typingsJapgolly.gherkin

import typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.IEnvelope
import typingsJapgolly.gherkin.distSrcIgherkinoptionsMod.IGherkinOptions
import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.node.streamMod.TransformCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcStreamParserMessageStreamMod {
  
  @JSImport("gherkin/dist/src/stream/ParserMessageStream", JSImport.Default)
  @js.native
  open class default protected () extends ParserMessageStream {
    def this(options: IGherkinOptions) = this()
  }
  
  @js.native
  trait ParserMessageStream extends Transform {
    
    def _transform(envelope: IEnvelope, encoding: String, callback: TransformCallback): Unit = js.native
    
    /* private */ val options: Any = js.native
  }
}
