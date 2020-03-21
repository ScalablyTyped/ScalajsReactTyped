package typingsJapgolly.oracleOraclejet

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.billion
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.million
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.quadrillion
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.thousand
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.trillion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConverterScaling extends js.Object {
  var converter: js.Object
  var scaling: none | thousand | million | billion | trillion | quadrillion | auto
}

object AnonConverterScaling {
  @scala.inline
  def apply(converter: js.Object, scaling: none | thousand | million | billion | trillion | quadrillion | auto): AnonConverterScaling = {
    val __obj = js.Dynamic.literal(converter = converter.asInstanceOf[js.Any], scaling = scaling.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonConverterScaling]
  }
}

