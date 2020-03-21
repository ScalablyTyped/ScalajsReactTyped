package typingsJapgolly.oracleOraclejet

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.`inline`
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.none
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.notewindow
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.placeholder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConverterHint extends js.Object {
  var converterHint: (js.Array[placeholder | notewindow | none]) | placeholder | notewindow | none
  var helpInstruction: (js.Array[notewindow | none]) | notewindow | none
  var messages: (js.Array[`inline` | notewindow | none]) | `inline` | notewindow | none
  var validatorHint: (js.Array[notewindow | none]) | notewindow | none
}

object AnonConverterHint {
  @scala.inline
  def apply(
    converterHint: (js.Array[placeholder | notewindow | none]) | placeholder | notewindow | none,
    helpInstruction: (js.Array[notewindow | none]) | notewindow | none,
    messages: (js.Array[`inline` | notewindow | none]) | `inline` | notewindow | none,
    validatorHint: (js.Array[notewindow | none]) | notewindow | none
  ): AnonConverterHint = {
    val __obj = js.Dynamic.literal(converterHint = converterHint.asInstanceOf[js.Any], helpInstruction = helpInstruction.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], validatorHint = validatorHint.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonConverterHint]
  }
}

