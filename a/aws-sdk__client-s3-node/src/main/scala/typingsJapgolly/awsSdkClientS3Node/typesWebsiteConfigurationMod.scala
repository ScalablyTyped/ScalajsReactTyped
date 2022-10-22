package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.typesErrorDocumentMod.ErrorDocument
import typingsJapgolly.awsSdkClientS3Node.typesErrorDocumentMod.UnmarshalledErrorDocument
import typingsJapgolly.awsSdkClientS3Node.typesIndexDocumentMod.IndexDocument
import typingsJapgolly.awsSdkClientS3Node.typesIndexDocumentMod.UnmarshalledIndexDocument
import typingsJapgolly.awsSdkClientS3Node.typesRedirectAllRequestsToMod.RedirectAllRequestsTo
import typingsJapgolly.awsSdkClientS3Node.typesRedirectAllRequestsToMod.UnmarshalledRedirectAllRequestsTo
import typingsJapgolly.awsSdkClientS3Node.typesRoutingRuleMod.RoutingRule
import typingsJapgolly.awsSdkClientS3Node.typesRoutingRuleMod.UnmarshalledRoutingRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWebsiteConfigurationMod {
  
  trait UnmarshalledWebsiteConfiguration
    extends StObject
       with WebsiteConfiguration {
    
    /**
      * _ErrorDocument shape
      */
    @JSName("ErrorDocument")
    var ErrorDocument_UnmarshalledWebsiteConfiguration: js.UndefOr[UnmarshalledErrorDocument] = js.undefined
    
    /**
      * _IndexDocument shape
      */
    @JSName("IndexDocument")
    var IndexDocument_UnmarshalledWebsiteConfiguration: js.UndefOr[UnmarshalledIndexDocument] = js.undefined
    
    /**
      * _RedirectAllRequestsTo shape
      */
    @JSName("RedirectAllRequestsTo")
    var RedirectAllRequestsTo_UnmarshalledWebsiteConfiguration: js.UndefOr[UnmarshalledRedirectAllRequestsTo] = js.undefined
    
    /**
      * _RoutingRules shape
      */
    @JSName("RoutingRules")
    var RoutingRules_UnmarshalledWebsiteConfiguration: js.UndefOr[js.Array[UnmarshalledRoutingRule]] = js.undefined
  }
  object UnmarshalledWebsiteConfiguration {
    
    inline def apply(): UnmarshalledWebsiteConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledWebsiteConfiguration]
    }
    
    extension [Self <: UnmarshalledWebsiteConfiguration](x: Self) {
      
      inline def setErrorDocument(value: UnmarshalledErrorDocument): Self = StObject.set(x, "ErrorDocument", value.asInstanceOf[js.Any])
      
      inline def setErrorDocumentUndefined: Self = StObject.set(x, "ErrorDocument", js.undefined)
      
      inline def setIndexDocument(value: UnmarshalledIndexDocument): Self = StObject.set(x, "IndexDocument", value.asInstanceOf[js.Any])
      
      inline def setIndexDocumentUndefined: Self = StObject.set(x, "IndexDocument", js.undefined)
      
      inline def setRedirectAllRequestsTo(value: UnmarshalledRedirectAllRequestsTo): Self = StObject.set(x, "RedirectAllRequestsTo", value.asInstanceOf[js.Any])
      
      inline def setRedirectAllRequestsToUndefined: Self = StObject.set(x, "RedirectAllRequestsTo", js.undefined)
      
      inline def setRoutingRules(value: js.Array[UnmarshalledRoutingRule]): Self = StObject.set(x, "RoutingRules", value.asInstanceOf[js.Any])
      
      inline def setRoutingRulesUndefined: Self = StObject.set(x, "RoutingRules", js.undefined)
      
      inline def setRoutingRulesVarargs(value: UnmarshalledRoutingRule*): Self = StObject.set(x, "RoutingRules", js.Array(value*))
    }
  }
  
  trait WebsiteConfiguration extends StObject {
    
    /**
      * _ErrorDocument shape
      */
    var ErrorDocument: js.UndefOr[typingsJapgolly.awsSdkClientS3Node.typesErrorDocumentMod.ErrorDocument] = js.undefined
    
    /**
      * _IndexDocument shape
      */
    var IndexDocument: js.UndefOr[typingsJapgolly.awsSdkClientS3Node.typesIndexDocumentMod.IndexDocument] = js.undefined
    
    /**
      * _RedirectAllRequestsTo shape
      */
    var RedirectAllRequestsTo: js.UndefOr[
        typingsJapgolly.awsSdkClientS3Node.typesRedirectAllRequestsToMod.RedirectAllRequestsTo
      ] = js.undefined
    
    /**
      * _RoutingRules shape
      */
    var RoutingRules: js.UndefOr[js.Array[RoutingRule] | js.Iterable[RoutingRule]] = js.undefined
  }
  object WebsiteConfiguration {
    
    inline def apply(): WebsiteConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebsiteConfiguration]
    }
    
    extension [Self <: WebsiteConfiguration](x: Self) {
      
      inline def setErrorDocument(value: ErrorDocument): Self = StObject.set(x, "ErrorDocument", value.asInstanceOf[js.Any])
      
      inline def setErrorDocumentUndefined: Self = StObject.set(x, "ErrorDocument", js.undefined)
      
      inline def setIndexDocument(value: IndexDocument): Self = StObject.set(x, "IndexDocument", value.asInstanceOf[js.Any])
      
      inline def setIndexDocumentUndefined: Self = StObject.set(x, "IndexDocument", js.undefined)
      
      inline def setRedirectAllRequestsTo(value: RedirectAllRequestsTo): Self = StObject.set(x, "RedirectAllRequestsTo", value.asInstanceOf[js.Any])
      
      inline def setRedirectAllRequestsToUndefined: Self = StObject.set(x, "RedirectAllRequestsTo", js.undefined)
      
      inline def setRoutingRules(value: js.Array[RoutingRule] | js.Iterable[RoutingRule]): Self = StObject.set(x, "RoutingRules", value.asInstanceOf[js.Any])
      
      inline def setRoutingRulesUndefined: Self = StObject.set(x, "RoutingRules", js.undefined)
      
      inline def setRoutingRulesVarargs(value: RoutingRule*): Self = StObject.set(x, "RoutingRules", js.Array(value*))
    }
  }
}
