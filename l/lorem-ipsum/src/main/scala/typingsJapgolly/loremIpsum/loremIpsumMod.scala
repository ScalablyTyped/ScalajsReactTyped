package typingsJapgolly.loremIpsum

import typingsJapgolly.loremIpsum.generatorMod.IGeneratorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lorem-ipsum/types/src/lib/LoremIpsum", JSImport.Namespace)
@js.native
object loremIpsumMod extends js.Object {
  @js.native
  trait LoremIpsum extends js.Object {
    var format: String = js.native
    var generator: typingsJapgolly.loremIpsum.generatorMod.default = js.native
    var suffix: js.UndefOr[String] = js.native
    def formatString(str: String): String = js.native
    def formatStrings(strings: js.Array[String]): js.Array[String] = js.native
    def generateParagraphs(num: Double): String = js.native
    def generateSentences(): String = js.native
    def generateSentences(num: Double): String = js.native
    def generateWords(): String = js.native
    def generateWords(num: Double): String = js.native
    def getLineEnding(): String = js.native
  }
  
  @js.native
  class default () extends LoremIpsum {
    def this(options: IGeneratorOptions) = this()
    def this(options: IGeneratorOptions, format: String) = this()
    def this(options: IGeneratorOptions, format: String, suffix: String) = this()
  }
  
}

