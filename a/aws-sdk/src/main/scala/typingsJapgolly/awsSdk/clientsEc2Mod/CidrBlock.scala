package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CidrBlock extends StObject {
  
  /**
    * The IPv4 CIDR block.
    */
  var CidrBlock: js.UndefOr[String] = js.undefined
}
object CidrBlock {
  
  inline def apply(): CidrBlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CidrBlock]
  }
  
  extension [Self <: CidrBlock](x: Self) {
    
    inline def setCidrBlock(value: String): Self = StObject.set(x, "CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setCidrBlockUndefined: Self = StObject.set(x, "CidrBlock", js.undefined)
  }
}
