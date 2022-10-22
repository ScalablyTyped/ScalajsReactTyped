package typingsJapgolly.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIncomingTypedLinksResponse extends StObject {
  
  /**
    * Returns one or more typed link specifiers as output.
    */
  var LinkSpecifiers: js.UndefOr[TypedLinkSpecifierList] = js.undefined
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsClouddirectoryMod.NextToken] = js.undefined
}
object ListIncomingTypedLinksResponse {
  
  inline def apply(): ListIncomingTypedLinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIncomingTypedLinksResponse]
  }
  
  extension [Self <: ListIncomingTypedLinksResponse](x: Self) {
    
    inline def setLinkSpecifiers(value: TypedLinkSpecifierList): Self = StObject.set(x, "LinkSpecifiers", value.asInstanceOf[js.Any])
    
    inline def setLinkSpecifiersUndefined: Self = StObject.set(x, "LinkSpecifiers", js.undefined)
    
    inline def setLinkSpecifiersVarargs(value: TypedLinkSpecifier*): Self = StObject.set(x, "LinkSpecifiers", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
