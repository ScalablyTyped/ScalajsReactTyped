package typingsJapgolly.yadda

import typingsJapgolly.yadda.libLocalisationLanguageMod.Library
import typingsJapgolly.yadda.libParsersFeatureParserMod.SpecificationExport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libParsersFeatureFileParserMod {
  
  @JSImport("yadda/lib/parsers/FeatureFileParser", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with FeatureFileParser {
    def this(language: typingsJapgolly.yadda.libLocalisationLanguageMod.^[Library]) = this()
    def this(options: typingsJapgolly.yadda.libParsersFeatureParserMod.Options) = this()
  }
  
  @js.native
  trait FeatureFileParser extends StObject {
    
    def parse(file: String): SpecificationExport = js.native
    def parse(file: String, next: js.Function1[/* specification */ SpecificationExport, Unit]): Unit = js.native
  }
  
  type Options = typingsJapgolly.yadda.libParsersFeatureParserMod.Options
}
