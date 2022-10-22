package typingsJapgolly.commonsValidatorJs

import typingsJapgolly.commonsValidatorJs.anon.AllowLocal
import typingsJapgolly.commonsValidatorJs.anon.AllowTld
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("commons-validator-js", "DomainValidator")
  @js.native
  /**
    * @param allowLocal   Should local addresses be considered valid? default = false
    */
  open class DomainValidator () extends StObject {
    def this(hasAllowLocal: AllowLocal) = this()
    
    def extractTld(domain: String): String | Null = js.native
    
    def isValid(domain: String): Boolean = js.native
    
    def isValidCountryCodeTld(ccTld: String): Boolean = js.native
    
    def isValidGenericTld(gTld: String): Boolean = js.native
    
    def isValidInfrastructureTld(iTld: String): Boolean = js.native
    
    def isValidTld(tld: String): Boolean = js.native
  }
  
  @JSImport("commons-validator-js", "EmailValidator")
  @js.native
  /**
    * @param allowLocal   Should local addresses be considered valid? default = false
    * @param allowTld     Should TLDs be allowed? default = false
    */
  open class EmailValidator () extends StObject {
    def this(hasAllowLocalAllowTld: AllowTld) = this()
    
    def isValid(email: String): Boolean = js.native
  }
}
