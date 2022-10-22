package typingsJapgolly.activexFaxcomexlib.anon

import typingsJapgolly.activexFaxcomexlib.FAXCOMEXLib.FaxAccount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BstrJobId extends StObject {
  
  val bstrJobId: String
  
  val pFaxAccount: FaxAccount
}
object BstrJobId {
  
  inline def apply(bstrJobId: String, pFaxAccount: FaxAccount): BstrJobId = {
    val __obj = js.Dynamic.literal(bstrJobId = bstrJobId.asInstanceOf[js.Any], pFaxAccount = pFaxAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[BstrJobId]
  }
  
  extension [Self <: BstrJobId](x: Self) {
    
    inline def setBstrJobId(value: String): Self = StObject.set(x, "bstrJobId", value.asInstanceOf[js.Any])
    
    inline def setPFaxAccount(value: FaxAccount): Self = StObject.set(x, "pFaxAccount", value.asInstanceOf[js.Any])
  }
}
