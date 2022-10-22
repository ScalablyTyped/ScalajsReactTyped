package typingsJapgolly.maximMazurokGapiClientAnalytics.gapi.client.analytics

import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.CaseSensitive
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.Field
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.FieldIndex
import typingsJapgolly.maximMazurokGapiClientAnalytics.anon.Href
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  /** Account ID to which this filter belongs. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** Details for the filter of the type ADVANCED. */
  var advancedDetails: js.UndefOr[CaseSensitive] = js.undefined
  
  /** Time this filter was created. */
  var created: js.UndefOr[String] = js.undefined
  
  /** Details for the filter of the type EXCLUDE. */
  var excludeDetails: js.UndefOr[FilterExpression] = js.undefined
  
  /** Filter ID. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Details for the filter of the type INCLUDE. */
  var includeDetails: js.UndefOr[FilterExpression] = js.undefined
  
  /** Resource type for Analytics filter. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Details for the filter of the type LOWER. */
  var lowercaseDetails: js.UndefOr[Field] = js.undefined
  
  /** Name of this filter. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Parent link for this filter. Points to the account to which this filter belongs. */
  var parentLink: js.UndefOr[Href] = js.undefined
  
  /** Details for the filter of the type SEARCH_AND_REPLACE. */
  var searchAndReplaceDetails: js.UndefOr[FieldIndex] = js.undefined
  
  /** Link for this filter. */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /** Type of this filter. Possible values are INCLUDE, EXCLUDE, LOWERCASE, UPPERCASE, SEARCH_AND_REPLACE and ADVANCED. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** Time this filter was last modified. */
  var updated: js.UndefOr[String] = js.undefined
  
  /** Details for the filter of the type UPPER. */
  var uppercaseDetails: js.UndefOr[Field] = js.undefined
}
object Filter {
  
  inline def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  
  extension [Self <: Filter](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAdvancedDetails(value: CaseSensitive): Self = StObject.set(x, "advancedDetails", value.asInstanceOf[js.Any])
    
    inline def setAdvancedDetailsUndefined: Self = StObject.set(x, "advancedDetails", js.undefined)
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setExcludeDetails(value: FilterExpression): Self = StObject.set(x, "excludeDetails", value.asInstanceOf[js.Any])
    
    inline def setExcludeDetailsUndefined: Self = StObject.set(x, "excludeDetails", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIncludeDetails(value: FilterExpression): Self = StObject.set(x, "includeDetails", value.asInstanceOf[js.Any])
    
    inline def setIncludeDetailsUndefined: Self = StObject.set(x, "includeDetails", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLowercaseDetails(value: Field): Self = StObject.set(x, "lowercaseDetails", value.asInstanceOf[js.Any])
    
    inline def setLowercaseDetailsUndefined: Self = StObject.set(x, "lowercaseDetails", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParentLink(value: Href): Self = StObject.set(x, "parentLink", value.asInstanceOf[js.Any])
    
    inline def setParentLinkUndefined: Self = StObject.set(x, "parentLink", js.undefined)
    
    inline def setSearchAndReplaceDetails(value: FieldIndex): Self = StObject.set(x, "searchAndReplaceDetails", value.asInstanceOf[js.Any])
    
    inline def setSearchAndReplaceDetailsUndefined: Self = StObject.set(x, "searchAndReplaceDetails", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    inline def setUppercaseDetails(value: Field): Self = StObject.set(x, "uppercaseDetails", value.asInstanceOf[js.Any])
    
    inline def setUppercaseDetailsUndefined: Self = StObject.set(x, "uppercaseDetails", js.undefined)
  }
}
