package typingsJapgolly.gherkin

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.IEnvelope
import typingsJapgolly.gherkin.distSrcDialectMod.Dialect
import typingsJapgolly.gherkin.distSrcIgherkinoptionsMod.IGherkinOptions
import typingsJapgolly.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcExternalGherkinExeMod {
  
  @JSImport("gherkin/dist/src/external/GherkinExe", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with GherkinExe {
    def this(
      gherkinExe: String,
      paths: js.Array[String],
      envelopes: js.Array[IEnvelope],
      options: IGherkinOptions
    ) = this()
    
    /* CompleteClass */
    override def dialects(): StringDictionary[Dialect] = js.native
    
    /* private */ /* CompleteClass */
    override val envelopes: Any = js.native
    
    /* private */ /* CompleteClass */
    override val gherkinExe: Any = js.native
    
    /* CompleteClass */
    override def messageStream(): Readable = js.native
    
    /* private */ /* CompleteClass */
    override val options: Any = js.native
    
    /* private */ /* CompleteClass */
    override val paths: Any = js.native
  }
  
  trait GherkinExe extends StObject {
    
    def dialects(): StringDictionary[Dialect]
    
    /* private */ val envelopes: Any
    
    /* private */ val gherkinExe: Any
    
    def messageStream(): Readable
    
    /* private */ val options: Any
    
    /* private */ val paths: Any
  }
  object GherkinExe {
    
    inline def apply(
      dialects: CallbackTo[StringDictionary[Dialect]],
      envelopes: Any,
      gherkinExe: Any,
      messageStream: CallbackTo[Readable],
      options: Any,
      paths: Any
    ): GherkinExe = {
      val __obj = js.Dynamic.literal(dialects = dialects.toJsFn, envelopes = envelopes.asInstanceOf[js.Any], gherkinExe = gherkinExe.asInstanceOf[js.Any], messageStream = messageStream.toJsFn, options = options.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
      __obj.asInstanceOf[GherkinExe]
    }
    
    extension [Self <: GherkinExe](x: Self) {
      
      inline def setDialects(value: CallbackTo[StringDictionary[Dialect]]): Self = StObject.set(x, "dialects", value.toJsFn)
      
      inline def setEnvelopes(value: Any): Self = StObject.set(x, "envelopes", value.asInstanceOf[js.Any])
      
      inline def setGherkinExe(value: Any): Self = StObject.set(x, "gherkinExe", value.asInstanceOf[js.Any])
      
      inline def setMessageStream(value: CallbackTo[Readable]): Self = StObject.set(x, "messageStream", value.toJsFn)
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPaths(value: Any): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    }
  }
}
