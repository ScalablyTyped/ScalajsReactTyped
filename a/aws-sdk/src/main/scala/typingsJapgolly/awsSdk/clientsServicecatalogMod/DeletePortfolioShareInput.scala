package typingsJapgolly.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePortfolioShareInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typingsJapgolly.awsSdk.clientsServicecatalogMod.AcceptLanguage] = js.undefined
  
  /**
    * The Amazon Web Services account ID.
    */
  var AccountId: js.UndefOr[typingsJapgolly.awsSdk.clientsServicecatalogMod.AccountId] = js.undefined
  
  /**
    * The organization node to whom you are going to stop sharing.
    */
  var OrganizationNode: js.UndefOr[typingsJapgolly.awsSdk.clientsServicecatalogMod.OrganizationNode] = js.undefined
  
  /**
    * The portfolio identifier.
    */
  var PortfolioId: Id
}
object DeletePortfolioShareInput {
  
  inline def apply(PortfolioId: Id): DeletePortfolioShareInput = {
    val __obj = js.Dynamic.literal(PortfolioId = PortfolioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePortfolioShareInput]
  }
  
  extension [Self <: DeletePortfolioShareInput](x: Self) {
    
    inline def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    inline def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setOrganizationNode(value: OrganizationNode): Self = StObject.set(x, "OrganizationNode", value.asInstanceOf[js.Any])
    
    inline def setOrganizationNodeUndefined: Self = StObject.set(x, "OrganizationNode", js.undefined)
    
    inline def setPortfolioId(value: Id): Self = StObject.set(x, "PortfolioId", value.asInstanceOf[js.Any])
  }
}
