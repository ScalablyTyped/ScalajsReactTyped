package typingsJapgolly.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchListOutgoingTypedLinksResponse extends StObject {
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsClouddirectoryMod.NextToken] = js.undefined
  
  /**
    * Returns a typed link specifier as output.
    */
  var TypedLinkSpecifiers: js.UndefOr[TypedLinkSpecifierList] = js.undefined
}
object BatchListOutgoingTypedLinksResponse {
  
  inline def apply(): BatchListOutgoingTypedLinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchListOutgoingTypedLinksResponse]
  }
  
  extension [Self <: BatchListOutgoingTypedLinksResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTypedLinkSpecifiers(value: TypedLinkSpecifierList): Self = StObject.set(x, "TypedLinkSpecifiers", value.asInstanceOf[js.Any])
    
    inline def setTypedLinkSpecifiersUndefined: Self = StObject.set(x, "TypedLinkSpecifiers", js.undefined)
    
    inline def setTypedLinkSpecifiersVarargs(value: TypedLinkSpecifier*): Self = StObject.set(x, "TypedLinkSpecifiers", js.Array(value*))
  }
}
