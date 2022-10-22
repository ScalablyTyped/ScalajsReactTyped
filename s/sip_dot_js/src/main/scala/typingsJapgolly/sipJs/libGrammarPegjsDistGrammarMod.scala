package typingsJapgolly.sipJs

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.sipJs.anon.Source
import typingsJapgolly.sipJs.sipJsStrings.`class`
import typingsJapgolly.sipJs.sipJsStrings.any
import typingsJapgolly.sipJs.sipJsStrings.end
import typingsJapgolly.sipJs.sipJsStrings.literal
import typingsJapgolly.sipJs.sipJsStrings.other
import typingsJapgolly.std.Array
import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGrammarPegjsDistGrammarMod {
  
  @JSImport("sip.js/lib/grammar/pegjs/dist/grammar", "SyntaxError")
  @js.native
  open class SyntaxError protected ()
    extends StObject
       with Error {
    def this(message: String, expected: js.Array[Expectation], found: String, location: IFileRange) = this()
    def this(message: String, expected: js.Array[Expectation], found: Null, location: IFileRange) = this()
    
    var expected: js.Array[Expectation] = js.native
    
    def format(sources: js.Array[Source]): String = js.native
    
    var found: String | Null = js.native
    
    var location: IFileRange = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  /* static members */
  object SyntaxError {
    
    @JSImport("sip.js/lib/grammar/pegjs/dist/grammar", "SyntaxError")
    @js.native
    val ^ : js.Any = js.native
    
    inline def buildMessage(expected: js.Array[Expectation]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildMessage")(expected.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def buildMessage(expected: js.Array[Expectation], found: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildMessage")(expected.asInstanceOf[js.Any], found.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  @JSImport("sip.js/lib/grammar/pegjs/dist/grammar", "parse")
  @js.native
  val parse: ParseFunction = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.sipJs.libGrammarPegjsDistGrammarMod.ILiteralExpectation
    - typingsJapgolly.sipJs.libGrammarPegjsDistGrammarMod.IClassExpectation
    - typingsJapgolly.sipJs.libGrammarPegjsDistGrammarMod.IAnyExpectation
    - typingsJapgolly.sipJs.libGrammarPegjsDistGrammarMod.IEndExpectation
    - typingsJapgolly.sipJs.libGrammarPegjsDistGrammarMod.IOtherExpectation
  */
  trait Expectation extends StObject
  object Expectation {
    
    inline def IAnyExpectation(): typingsJapgolly.sipJs.libGrammarPegjsDistGrammarMod.IAnyExpectation = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("any")
      __obj.asInstanceOf[typingsJapgolly.sipJs.libGrammarPegjsDistGrammarMod.IAnyExpectation]
    }
    
    inline def IClassExpectation(ignoreCase: Boolean, inverted: Boolean, parts: IClassParts): typingsJapgolly.sipJs.libGrammarPegjsDistGrammarMod.IClassExpectation = {
      val __obj = js.Dynamic.literal(ignoreCase = ignoreCase.asInstanceOf[js.Any], inverted = inverted.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("class")
      __obj.asInstanceOf[typingsJapgolly.sipJs.libGrammarPegjsDistGrammarMod.IClassExpectation]
    }
    
    inline def IEndExpectation(): typingsJapgolly.sipJs.libGrammarPegjsDistGrammarMod.IEndExpectation = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("end")
      __obj.asInstanceOf[typingsJapgolly.sipJs.libGrammarPegjsDistGrammarMod.IEndExpectation]
    }
    
    inline def ILiteralExpectation(ignoreCase: Boolean, text: String): typingsJapgolly.sipJs.libGrammarPegjsDistGrammarMod.ILiteralExpectation = {
      val __obj = js.Dynamic.literal(ignoreCase = ignoreCase.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("literal")
      __obj.asInstanceOf[typingsJapgolly.sipJs.libGrammarPegjsDistGrammarMod.ILiteralExpectation]
    }
    
    inline def IOtherExpectation(description: String): typingsJapgolly.sipJs.libGrammarPegjsDistGrammarMod.IOtherExpectation = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("other")
      __obj.asInstanceOf[typingsJapgolly.sipJs.libGrammarPegjsDistGrammarMod.IOtherExpectation]
    }
  }
  
  trait IAnyExpectation
    extends StObject
       with Expectation {
    
    var `type`: any
  }
  object IAnyExpectation {
    
    inline def apply(): IAnyExpectation = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("any")
      __obj.asInstanceOf[IAnyExpectation]
    }
    
    extension [Self <: IAnyExpectation](x: Self) {
      
      inline def setType(value: any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IClassExpectation
    extends StObject
       with Expectation {
    
    var ignoreCase: Boolean
    
    var inverted: Boolean
    
    var parts: IClassParts
    
    var `type`: `class`
  }
  object IClassExpectation {
    
    inline def apply(ignoreCase: Boolean, inverted: Boolean, parts: IClassParts): IClassExpectation = {
      val __obj = js.Dynamic.literal(ignoreCase = ignoreCase.asInstanceOf[js.Any], inverted = inverted.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("class")
      __obj.asInstanceOf[IClassExpectation]
    }
    
    extension [Self <: IClassExpectation](x: Self) {
      
      inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      inline def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      inline def setParts(value: IClassParts): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      inline def setType(value: `class`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IClassParts
    extends StObject
       with Array[String | IClassParts]
  
  trait IEndExpectation
    extends StObject
       with Expectation {
    
    var `type`: end
  }
  object IEndExpectation {
    
    inline def apply(): IEndExpectation = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("end")
      __obj.asInstanceOf[IEndExpectation]
    }
    
    extension [Self <: IEndExpectation](x: Self) {
      
      inline def setType(value: end): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IFilePosition extends StObject {
    
    var column: Double
    
    var line: Double
    
    var offset: Double
  }
  object IFilePosition {
    
    inline def apply(column: Double, line: Double, offset: Double): IFilePosition = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFilePosition]
    }
    
    extension [Self <: IFilePosition](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  trait IFileRange extends StObject {
    
    var end: IFilePosition
    
    var source: String
    
    var start: IFilePosition
  }
  object IFileRange {
    
    inline def apply(end: IFilePosition, source: String, start: IFilePosition): IFileRange = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFileRange]
    }
    
    extension [Self <: IFileRange](x: Self) {
      
      inline def setEnd(value: IFilePosition): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setStart(value: IFilePosition): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait ILiteralExpectation
    extends StObject
       with Expectation {
    
    var ignoreCase: Boolean
    
    var text: String
    
    var `type`: literal
  }
  object ILiteralExpectation {
    
    inline def apply(ignoreCase: Boolean, text: String): ILiteralExpectation = {
      val __obj = js.Dynamic.literal(ignoreCase = ignoreCase.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("literal")
      __obj.asInstanceOf[ILiteralExpectation]
    }
    
    extension [Self <: ILiteralExpectation](x: Self) {
      
      inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: literal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IOtherExpectation
    extends StObject
       with Expectation {
    
    var description: String
    
    var `type`: other
  }
  object IOtherExpectation {
    
    inline def apply(description: String): IOtherExpectation = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("other")
      __obj.asInstanceOf[IOtherExpectation]
    }
    
    extension [Self <: IOtherExpectation](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setType(value: other): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IParseOptions
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var filename: js.UndefOr[String] = js.undefined
    
    var startRule: js.UndefOr[String] = js.undefined
    
    var tracer: js.UndefOr[Any] = js.undefined
  }
  object IParseOptions {
    
    inline def apply(): IParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IParseOptions]
    }
    
    extension [Self <: IParseOptions](x: Self) {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setStartRule(value: String): Self = StObject.set(x, "startRule", value.asInstanceOf[js.Any])
      
      inline def setStartRuleUndefined: Self = StObject.set(x, "startRule", js.undefined)
      
      inline def setTracer(value: Any): Self = StObject.set(x, "tracer", value.asInstanceOf[js.Any])
      
      inline def setTracerUndefined: Self = StObject.set(x, "tracer", js.undefined)
    }
  }
  
  type ParseFunction = js.Function2[/* input */ String, /* options */ js.UndefOr[IParseOptions], Any]
}
