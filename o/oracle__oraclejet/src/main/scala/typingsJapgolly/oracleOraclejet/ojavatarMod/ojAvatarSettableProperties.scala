package typingsJapgolly.oracleOraclejet.ojavatarMod

import typingsJapgolly.oracleOraclejet.mod.JetSettableProperties
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.lg
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.md
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.sm
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.xl
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.xs
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.xxl
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.xxs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojAvatarSettableProperties extends JetSettableProperties {
  var initials: String
  var size: xxs | xs | sm | md | lg | xl | xxl
  var src: String
}

object ojAvatarSettableProperties {
  @scala.inline
  def apply(initials: String, size: xxs | xs | sm | md | lg | xl | xxl, src: String): ojAvatarSettableProperties = {
    val __obj = js.Dynamic.literal(initials = initials.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ojAvatarSettableProperties]
  }
}

