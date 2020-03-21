package typingsJapgolly.yadda

import typingsJapgolly.yadda.featureFileParserMod.^
import typingsJapgolly.yadda.featureParserMod.Options
import typingsJapgolly.yadda.languageMod.Library
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda/lib/parsers", JSImport.Namespace)
@js.native
object parsersMod extends js.Object {
  @js.native
  class FeatureFileParser () extends ^ {
    def this(language: typingsJapgolly.yadda.languageMod.^[Library]) = this()
    def this(options: Options) = this()
  }
  
  @js.native
  class FeatureParser ()
    extends typingsJapgolly.yadda.featureParserMod.^ {
    def this(language: typingsJapgolly.yadda.languageMod.^[Library]) = this()
    def this(options: Options) = this()
  }
  
  @js.native
  class StepParser ()
    extends typingsJapgolly.yadda.stepParserMod.^
  
}

