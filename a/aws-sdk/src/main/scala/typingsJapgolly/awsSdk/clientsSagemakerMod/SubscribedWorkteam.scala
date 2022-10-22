package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscribedWorkteam extends StObject {
  
  /**
    * Marketplace product listing ID.
    */
  var ListingId: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the vendor from the Amazon Marketplace.
    */
  var MarketplaceDescription: js.UndefOr[String200] = js.undefined
  
  /**
    * The title of the service provided by the vendor in the Amazon Marketplace.
    */
  var MarketplaceTitle: js.UndefOr[String200] = js.undefined
  
  /**
    * The name of the vendor in the Amazon Marketplace.
    */
  var SellerName: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the vendor that you have subscribed.
    */
  var WorkteamArn: typingsJapgolly.awsSdk.clientsSagemakerMod.WorkteamArn
}
object SubscribedWorkteam {
  
  inline def apply(WorkteamArn: WorkteamArn): SubscribedWorkteam = {
    val __obj = js.Dynamic.literal(WorkteamArn = WorkteamArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribedWorkteam]
  }
  
  extension [Self <: SubscribedWorkteam](x: Self) {
    
    inline def setListingId(value: String): Self = StObject.set(x, "ListingId", value.asInstanceOf[js.Any])
    
    inline def setListingIdUndefined: Self = StObject.set(x, "ListingId", js.undefined)
    
    inline def setMarketplaceDescription(value: String200): Self = StObject.set(x, "MarketplaceDescription", value.asInstanceOf[js.Any])
    
    inline def setMarketplaceDescriptionUndefined: Self = StObject.set(x, "MarketplaceDescription", js.undefined)
    
    inline def setMarketplaceTitle(value: String200): Self = StObject.set(x, "MarketplaceTitle", value.asInstanceOf[js.Any])
    
    inline def setMarketplaceTitleUndefined: Self = StObject.set(x, "MarketplaceTitle", js.undefined)
    
    inline def setSellerName(value: String): Self = StObject.set(x, "SellerName", value.asInstanceOf[js.Any])
    
    inline def setSellerNameUndefined: Self = StObject.set(x, "SellerName", js.undefined)
    
    inline def setWorkteamArn(value: WorkteamArn): Self = StObject.set(x, "WorkteamArn", value.asInstanceOf[js.Any])
  }
}
