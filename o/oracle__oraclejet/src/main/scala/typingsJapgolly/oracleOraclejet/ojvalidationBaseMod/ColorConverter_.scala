package typingsJapgolly.oracleOraclejet.ojvalidationBaseMod

import typingsJapgolly.oracleOraclejet.ojcolorMod.^
import typingsJapgolly.oracleOraclejet.ojvalidationBaseMod.ColorConverter.ConverterOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojvalidation-base", "ColorConverter")
@js.native
class ColorConverter_ () extends Converter[^] {
  def this(options: ConverterOptions) = this()
  /* CompleteClass */
  override def format(value: ^): String | Null = js.native
  @JSName("getHint")
  def getHint_MColorConverter_(): String = js.native
  /* CompleteClass */
  override def parse(value: String): ^  | Null = js.native
  @JSName("resolvedOptions")
  def resolvedOptions_MColorConverter_(): ConverterOptions = js.native
}

