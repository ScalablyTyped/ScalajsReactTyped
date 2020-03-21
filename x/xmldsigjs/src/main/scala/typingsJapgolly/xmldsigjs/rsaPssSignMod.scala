package typingsJapgolly.xmldsigjs

import typingsJapgolly.xmldsigjs.algorithmMod.SignatureAlgorithm
import typingsJapgolly.xmldsigjs.xmldsigjsStrings.`RSA-PSS`
import typingsJapgolly.xmldsigjs.xmldsigjsStrings.`httpColonSlashSlashwwwDotw3DotorgSlash2007Slash05Slashxmldsig-moreNumbersignrsa-pss`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/algorithms/rsa_pss_sign", JSImport.Namespace)
@js.native
object rsaPssSignMod extends js.Object {
  @js.native
  class RsaPssBase () extends SignatureAlgorithm {
    def this(saltLength: Double) = this()
  }
  
  @js.native
  class RsaPssSha1 () extends RsaPssBase {
    def this(saltLength: Double) = this()
  }
  
  @js.native
  class RsaPssSha256 () extends RsaPssBase {
    def this(saltLength: Double) = this()
  }
  
  @js.native
  class RsaPssSha384 () extends RsaPssBase {
    def this(saltLength: Double) = this()
  }
  
  @js.native
  class RsaPssSha512 () extends RsaPssBase {
    def this(saltLength: Double) = this()
  }
  
  val RSA_PSS: `RSA-PSS` = js.native
  val RSA_PSS_WITH_PARAMS_NAMESPACE: `httpColonSlashSlashwwwDotw3DotorgSlash2007Slash05Slashxmldsig-moreNumbersignrsa-pss` = js.native
}

