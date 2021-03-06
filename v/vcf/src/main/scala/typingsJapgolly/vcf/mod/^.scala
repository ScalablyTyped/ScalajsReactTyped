package typingsJapgolly.vcf.mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.vcf.vcfStrings.CarriagereturnLinefeed
import typingsJapgolly.vcf.vcfStrings.Dotvcf
import typingsJapgolly.vcf.vcfStrings.`2Dot1`
import typingsJapgolly.vcf.vcfStrings.`3Dot0`
import typingsJapgolly.vcf.vcfStrings.`4Dot0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vcf", JSImport.Namespace)
@js.native
class ^ () extends vCard

@JSImport("vcf", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /** Is equal to `\r\n` */
  var EOL: CarriagereturnLinefeed = js.native
  /** is equal to `.vcf` */
  var extension: Dotvcf = js.native
  /** Is equal to `text/vcard` */
  var mimeType: String = js.native
  var versions: js.Tuple3[`2Dot1`, `3Dot0`, `4Dot0`] = js.native
  /* private */ def foldLine(input: String): String = js.native
  /* private */ def foldLine(input: String, maxLength: Double): String = js.native
  /* private */ def foldLine(input: String, maxLength: Double, hardWrap: Boolean): String = js.native
  def format(card: vCard): String = js.native
  def format(card: vCard, version: CardVersion): String = js.native
  /** Returns a vCard object from a jCard JSON object */
  def fromJSON(jcard: jCard): vCard = js.native
  def isSupported(version: CardVersion): Boolean = js.native
  def normalize(input: String): String = js.native
  /** Returns an *array* of vCard objects from a multiple-card string. */
  def parse(value: String): js.Array[vCard] = js.native
  def parse(value: Buffer): js.Array[vCard] = js.native
  /* private */ def parseLines(lines: js.Array[String]): js.Any = js.native
}

