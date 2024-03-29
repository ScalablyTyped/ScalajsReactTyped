package typingsJapgolly.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectorProfileCredentials extends StObject {
  
  /**
    *  The connector-specific credentials required when using Amplitude. 
    */
  var Amplitude: js.UndefOr[AmplitudeConnectorProfileCredentials] = js.undefined
  
  var CustomConnector: js.UndefOr[CustomConnectorProfileCredentials] = js.undefined
  
  /**
    *  The connector-specific credentials required when using Datadog. 
    */
  var Datadog: js.UndefOr[DatadogConnectorProfileCredentials] = js.undefined
  
  /**
    *  The connector-specific credentials required when using Dynatrace. 
    */
  var Dynatrace: js.UndefOr[DynatraceConnectorProfileCredentials] = js.undefined
  
  /**
    *  The connector-specific credentials required when using Google Analytics. 
    */
  var GoogleAnalytics: js.UndefOr[GoogleAnalyticsConnectorProfileCredentials] = js.undefined
  
  /**
    *  The connector-specific credentials required when using Amazon Honeycode. 
    */
  var Honeycode: js.UndefOr[HoneycodeConnectorProfileCredentials] = js.undefined
  
  /**
    *  The connector-specific credentials required when using Infor Nexus. 
    */
  var InforNexus: js.UndefOr[InforNexusConnectorProfileCredentials] = js.undefined
  
  /**
    *  The connector-specific credentials required when using Marketo. 
    */
  var Marketo: js.UndefOr[MarketoConnectorProfileCredentials] = js.undefined
  
  /**
    *  The connector-specific credentials required when using Amazon Redshift. 
    */
  var Redshift: js.UndefOr[RedshiftConnectorProfileCredentials] = js.undefined
  
  var SAPOData: js.UndefOr[SAPODataConnectorProfileCredentials] = js.undefined
  
  /**
    *  The connector-specific credentials required when using Salesforce. 
    */
  var Salesforce: js.UndefOr[SalesforceConnectorProfileCredentials] = js.undefined
  
  /**
    *  The connector-specific credentials required when using ServiceNow. 
    */
  var ServiceNow: js.UndefOr[ServiceNowConnectorProfileCredentials] = js.undefined
  
  /**
    *  The connector-specific credentials required when using Singular. 
    */
  var Singular: js.UndefOr[SingularConnectorProfileCredentials] = js.undefined
  
  /**
    *  The connector-specific credentials required when using Slack. 
    */
  var Slack: js.UndefOr[SlackConnectorProfileCredentials] = js.undefined
  
  /**
    *  The connector-specific credentials required when using Snowflake. 
    */
  var Snowflake: js.UndefOr[SnowflakeConnectorProfileCredentials] = js.undefined
  
  /**
    *  The connector-specific credentials required when using Trend Micro. 
    */
  var Trendmicro: js.UndefOr[TrendmicroConnectorProfileCredentials] = js.undefined
  
  /**
    *  The connector-specific credentials required when using Veeva. 
    */
  var Veeva: js.UndefOr[VeevaConnectorProfileCredentials] = js.undefined
  
  /**
    *  The connector-specific credentials required when using Zendesk. 
    */
  var Zendesk: js.UndefOr[ZendeskConnectorProfileCredentials] = js.undefined
}
object ConnectorProfileCredentials {
  
  inline def apply(): ConnectorProfileCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorProfileCredentials]
  }
  
  extension [Self <: ConnectorProfileCredentials](x: Self) {
    
    inline def setAmplitude(value: AmplitudeConnectorProfileCredentials): Self = StObject.set(x, "Amplitude", value.asInstanceOf[js.Any])
    
    inline def setAmplitudeUndefined: Self = StObject.set(x, "Amplitude", js.undefined)
    
    inline def setCustomConnector(value: CustomConnectorProfileCredentials): Self = StObject.set(x, "CustomConnector", value.asInstanceOf[js.Any])
    
    inline def setCustomConnectorUndefined: Self = StObject.set(x, "CustomConnector", js.undefined)
    
    inline def setDatadog(value: DatadogConnectorProfileCredentials): Self = StObject.set(x, "Datadog", value.asInstanceOf[js.Any])
    
    inline def setDatadogUndefined: Self = StObject.set(x, "Datadog", js.undefined)
    
    inline def setDynatrace(value: DynatraceConnectorProfileCredentials): Self = StObject.set(x, "Dynatrace", value.asInstanceOf[js.Any])
    
    inline def setDynatraceUndefined: Self = StObject.set(x, "Dynatrace", js.undefined)
    
    inline def setGoogleAnalytics(value: GoogleAnalyticsConnectorProfileCredentials): Self = StObject.set(x, "GoogleAnalytics", value.asInstanceOf[js.Any])
    
    inline def setGoogleAnalyticsUndefined: Self = StObject.set(x, "GoogleAnalytics", js.undefined)
    
    inline def setHoneycode(value: HoneycodeConnectorProfileCredentials): Self = StObject.set(x, "Honeycode", value.asInstanceOf[js.Any])
    
    inline def setHoneycodeUndefined: Self = StObject.set(x, "Honeycode", js.undefined)
    
    inline def setInforNexus(value: InforNexusConnectorProfileCredentials): Self = StObject.set(x, "InforNexus", value.asInstanceOf[js.Any])
    
    inline def setInforNexusUndefined: Self = StObject.set(x, "InforNexus", js.undefined)
    
    inline def setMarketo(value: MarketoConnectorProfileCredentials): Self = StObject.set(x, "Marketo", value.asInstanceOf[js.Any])
    
    inline def setMarketoUndefined: Self = StObject.set(x, "Marketo", js.undefined)
    
    inline def setRedshift(value: RedshiftConnectorProfileCredentials): Self = StObject.set(x, "Redshift", value.asInstanceOf[js.Any])
    
    inline def setRedshiftUndefined: Self = StObject.set(x, "Redshift", js.undefined)
    
    inline def setSAPOData(value: SAPODataConnectorProfileCredentials): Self = StObject.set(x, "SAPOData", value.asInstanceOf[js.Any])
    
    inline def setSAPODataUndefined: Self = StObject.set(x, "SAPOData", js.undefined)
    
    inline def setSalesforce(value: SalesforceConnectorProfileCredentials): Self = StObject.set(x, "Salesforce", value.asInstanceOf[js.Any])
    
    inline def setSalesforceUndefined: Self = StObject.set(x, "Salesforce", js.undefined)
    
    inline def setServiceNow(value: ServiceNowConnectorProfileCredentials): Self = StObject.set(x, "ServiceNow", value.asInstanceOf[js.Any])
    
    inline def setServiceNowUndefined: Self = StObject.set(x, "ServiceNow", js.undefined)
    
    inline def setSingular(value: SingularConnectorProfileCredentials): Self = StObject.set(x, "Singular", value.asInstanceOf[js.Any])
    
    inline def setSingularUndefined: Self = StObject.set(x, "Singular", js.undefined)
    
    inline def setSlack(value: SlackConnectorProfileCredentials): Self = StObject.set(x, "Slack", value.asInstanceOf[js.Any])
    
    inline def setSlackUndefined: Self = StObject.set(x, "Slack", js.undefined)
    
    inline def setSnowflake(value: SnowflakeConnectorProfileCredentials): Self = StObject.set(x, "Snowflake", value.asInstanceOf[js.Any])
    
    inline def setSnowflakeUndefined: Self = StObject.set(x, "Snowflake", js.undefined)
    
    inline def setTrendmicro(value: TrendmicroConnectorProfileCredentials): Self = StObject.set(x, "Trendmicro", value.asInstanceOf[js.Any])
    
    inline def setTrendmicroUndefined: Self = StObject.set(x, "Trendmicro", js.undefined)
    
    inline def setVeeva(value: VeevaConnectorProfileCredentials): Self = StObject.set(x, "Veeva", value.asInstanceOf[js.Any])
    
    inline def setVeevaUndefined: Self = StObject.set(x, "Veeva", js.undefined)
    
    inline def setZendesk(value: ZendeskConnectorProfileCredentials): Self = StObject.set(x, "Zendesk", value.asInstanceOf[js.Any])
    
    inline def setZendeskUndefined: Self = StObject.set(x, "Zendesk", js.undefined)
  }
}
