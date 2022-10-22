package typingsJapgolly.yadda

import typingsJapgolly.yadda.libLocalisationLanguageMod.Library
import typingsJapgolly.yadda.libParsersFeatureFileParserMod.^
import typingsJapgolly.yadda.libParsersFeatureParserMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libParsersMod {
  
  @JSImport("yadda/lib/parsers", "FeatureFileParser")
  @js.native
  open class FeatureFileParser () extends ^ {
    def this(language: typingsJapgolly.yadda.libLocalisationLanguageMod.^[Library]) = this()
    def this(options: Options) = this()
  }
  
  @JSImport("yadda/lib/parsers", "FeatureParser")
  @js.native
  open class FeatureParser ()
    extends typingsJapgolly.yadda.libParsersFeatureParserMod.^ {
    def this(language: typingsJapgolly.yadda.libLocalisationLanguageMod.^[Library]) = this()
    def this(options: Options) = this()
  }
  
  @JSImport("yadda/lib/parsers", "StepParser")
  @js.native
  open class StepParser ()
    extends typingsJapgolly.yadda.libParsersStepParserMod.^
}
