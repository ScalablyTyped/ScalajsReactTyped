package typingsJapgolly.yadda.libMod

import typingsJapgolly.yadda.featureParserMod.Options
import typingsJapgolly.yadda.languageMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda/lib", "parsers")
@js.native
object parsers extends js.Object {
  @js.native
  class FeatureFileParser ()
    extends typingsJapgolly.yadda.parsersMod.FeatureFileParser {
    def this(language: ^[typingsJapgolly.yadda.languageMod.Library]) = this()
    def this(options: Options) = this()
  }
  
  @js.native
  class FeatureParser ()
    extends typingsJapgolly.yadda.parsersMod.FeatureParser {
    def this(language: ^[typingsJapgolly.yadda.languageMod.Library]) = this()
    def this(options: Options) = this()
  }
  
  @js.native
  class StepParser ()
    extends typingsJapgolly.yadda.parsersMod.StepParser
  
}

