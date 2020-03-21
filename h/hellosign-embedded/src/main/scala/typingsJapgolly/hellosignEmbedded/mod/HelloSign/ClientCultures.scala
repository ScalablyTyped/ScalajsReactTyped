package typingsJapgolly.hellosignEmbedded.mod.HelloSign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientCultures extends js.Object {
  /**
    * Danish (Denmark)
    *
    * @default da_DK
    */
  var DA_DK: String
  /**
    * German (Germany)
    *
    * @default de_DE
    */
  var DE_DE: String
  /**
    * English (United States)
    *
    * @default en_US
    */
  var EN_US: String
  /**
    * French (France)
    *
    * @default fr_FR
    */
  var FR_FR: String
  /**
    * Dutch (The Netherlands)
    * @default nl_NL
    */
  var NL_NL: String
  /**
    * Swedish (Sweden)
    *
    * @default sv_SE
    */
  var SV_SE: String
  /**
    * Chinese (China)
    *
    * @default zh_CN
    */
  var ZH_CN: String
  /**
    * The available client UI cultures
    */
  var supportedCultures: js.Array[String]
}

object ClientCultures {
  @scala.inline
  def apply(
    DA_DK: String,
    DE_DE: String,
    EN_US: String,
    FR_FR: String,
    NL_NL: String,
    SV_SE: String,
    ZH_CN: String,
    supportedCultures: js.Array[String]
  ): ClientCultures = {
    val __obj = js.Dynamic.literal(DA_DK = DA_DK.asInstanceOf[js.Any], DE_DE = DE_DE.asInstanceOf[js.Any], EN_US = EN_US.asInstanceOf[js.Any], FR_FR = FR_FR.asInstanceOf[js.Any], NL_NL = NL_NL.asInstanceOf[js.Any], SV_SE = SV_SE.asInstanceOf[js.Any], ZH_CN = ZH_CN.asInstanceOf[js.Any], supportedCultures = supportedCultures.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientCultures]
  }
}

