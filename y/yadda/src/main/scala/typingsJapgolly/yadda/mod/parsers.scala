package typingsJapgolly.yadda.mod

import typingsJapgolly.yadda.featureParserMod.Options
import typingsJapgolly.yadda.languageMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda", "parsers")
@js.native
object parsers extends js.Object {
  @js.native
  class FeatureFileParser ()
    extends typingsJapgolly.yadda.libMod.parsers.FeatureFileParser {
    def this(language: ^[typingsJapgolly.yadda.languageMod.Library]) = this()
    def this(options: Options) = this()
  }
  
  @js.native
  class FeatureParser ()
    extends typingsJapgolly.yadda.libMod.parsers.FeatureParser {
    def this(language: ^[typingsJapgolly.yadda.languageMod.Library]) = this()
    def this(options: Options) = this()
  }
  
  @js.native
  class StepParser ()
    extends typingsJapgolly.yadda.libMod.parsers.StepParser
  
}

