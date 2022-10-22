package typingsJapgolly.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CampaignBudget extends StObject {
  
  /**
    * Required. The total amount the linked insertion order segments can budget. The amount is in micros. Must be greater than 0. For example, 500000000 represents 500 standard units of
    * the currency.
    */
  var budgetAmountMicros: js.UndefOr[String] = js.undefined
  
  /**
    * The unique ID of the campaign budget. Assigned by the system. Do not set for new budgets. Must be included when updating or adding budgets to campaign_budgets. Otherwise, a new ID
    * will be generated and assigned.
    */
  var budgetId: js.UndefOr[String] = js.undefined
  
  /** Required. Immutable. Specifies whether the budget is measured in currency or impressions. */
  var budgetUnit: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The date range for the campaign budget. Linked budget segments may have a different date range. They are resolved relative to the parent advertiser's time zone. Both
    * `start_date` and `end_date` must be before the year 2037.
    */
  var dateRange: js.UndefOr[DateRange] = js.undefined
  
  /** Required. The display name of the budget. Must be UTF-8 encoded with a maximum size of 240 bytes. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Immutable. The ID identifying this budget to the external source. If this field is set and the invoice detail level of the corresponding billing profile is set to "Budget level PO",
    * all impressions served against this budget will include this ID on the invoice. Must be unique under the campaign.
    */
  var externalBudgetId: js.UndefOr[String] = js.undefined
  
  /** Required. The external source of the budget. */
  var externalBudgetSource: js.UndefOr[String] = js.undefined
  
  /**
    * Immutable. The ID used to group budgets to be included the same invoice. If this field is set and the invoice level of the corresponding billing profile is set to "Budget invoice
    * grouping ID", all external_budget_id sharing the same invoice_grouping_id will be grouped in the same invoice.
    */
  var invoiceGroupingId: js.UndefOr[String] = js.undefined
  
  /** Additional metadata for use by the Mediaocean Prisma tool. Required for Mediaocean budgets. Only applicable to prisma_enabled advertisers. */
  var prismaConfig: js.UndefOr[PrismaConfig] = js.undefined
}
object CampaignBudget {
  
  inline def apply(): CampaignBudget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignBudget]
  }
  
  extension [Self <: CampaignBudget](x: Self) {
    
    inline def setBudgetAmountMicros(value: String): Self = StObject.set(x, "budgetAmountMicros", value.asInstanceOf[js.Any])
    
    inline def setBudgetAmountMicrosUndefined: Self = StObject.set(x, "budgetAmountMicros", js.undefined)
    
    inline def setBudgetId(value: String): Self = StObject.set(x, "budgetId", value.asInstanceOf[js.Any])
    
    inline def setBudgetIdUndefined: Self = StObject.set(x, "budgetId", js.undefined)
    
    inline def setBudgetUnit(value: String): Self = StObject.set(x, "budgetUnit", value.asInstanceOf[js.Any])
    
    inline def setBudgetUnitUndefined: Self = StObject.set(x, "budgetUnit", js.undefined)
    
    inline def setDateRange(value: DateRange): Self = StObject.set(x, "dateRange", value.asInstanceOf[js.Any])
    
    inline def setDateRangeUndefined: Self = StObject.set(x, "dateRange", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setExternalBudgetId(value: String): Self = StObject.set(x, "externalBudgetId", value.asInstanceOf[js.Any])
    
    inline def setExternalBudgetIdUndefined: Self = StObject.set(x, "externalBudgetId", js.undefined)
    
    inline def setExternalBudgetSource(value: String): Self = StObject.set(x, "externalBudgetSource", value.asInstanceOf[js.Any])
    
    inline def setExternalBudgetSourceUndefined: Self = StObject.set(x, "externalBudgetSource", js.undefined)
    
    inline def setInvoiceGroupingId(value: String): Self = StObject.set(x, "invoiceGroupingId", value.asInstanceOf[js.Any])
    
    inline def setInvoiceGroupingIdUndefined: Self = StObject.set(x, "invoiceGroupingId", js.undefined)
    
    inline def setPrismaConfig(value: PrismaConfig): Self = StObject.set(x, "prismaConfig", value.asInstanceOf[js.Any])
    
    inline def setPrismaConfigUndefined: Self = StObject.set(x, "prismaConfig", js.undefined)
  }
}
