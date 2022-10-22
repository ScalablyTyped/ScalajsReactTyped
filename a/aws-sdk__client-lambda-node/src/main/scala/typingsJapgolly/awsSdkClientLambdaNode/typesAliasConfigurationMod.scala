package typingsJapgolly.awsSdkClientLambdaNode

import typingsJapgolly.awsSdkClientLambdaNode.typesAliasRoutingConfigurationMod.AliasRoutingConfiguration
import typingsJapgolly.awsSdkClientLambdaNode.typesAliasRoutingConfigurationMod.UnmarshalledAliasRoutingConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAliasConfigurationMod {
  
  trait AliasConfiguration extends StObject {
    
    /**
      * <p>Lambda function ARN that is qualified using the alias name as the suffix. For example, if you create an alias called <code>BETA</code> that points to a helloworld function version, the ARN is <code>arn:aws:lambda:aws-regions:acct-id:function:helloworld:BETA</code>.</p>
      */
    var AliasArn: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Alias description.</p>
      */
    var Description: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Function version to which the alias points.</p>
      */
    var FunctionVersion: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Alias name.</p>
      */
    var Name: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Represents the latest updated revision of the function or alias.</p>
      */
    var RevisionId: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Specifies an additional function versions the alias points to, allowing you to dictate what percentage of traffic will invoke each version.</p>
      */
    var RoutingConfig: js.UndefOr[AliasRoutingConfiguration] = js.undefined
  }
  object AliasConfiguration {
    
    inline def apply(): AliasConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AliasConfiguration]
    }
    
    extension [Self <: AliasConfiguration](x: Self) {
      
      inline def setAliasArn(value: String): Self = StObject.set(x, "AliasArn", value.asInstanceOf[js.Any])
      
      inline def setAliasArnUndefined: Self = StObject.set(x, "AliasArn", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
      
      inline def setFunctionVersion(value: String): Self = StObject.set(x, "FunctionVersion", value.asInstanceOf[js.Any])
      
      inline def setFunctionVersionUndefined: Self = StObject.set(x, "FunctionVersion", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
      
      inline def setRevisionId(value: String): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
      
      inline def setRevisionIdUndefined: Self = StObject.set(x, "RevisionId", js.undefined)
      
      inline def setRoutingConfig(value: AliasRoutingConfiguration): Self = StObject.set(x, "RoutingConfig", value.asInstanceOf[js.Any])
      
      inline def setRoutingConfigUndefined: Self = StObject.set(x, "RoutingConfig", js.undefined)
    }
  }
  
  trait UnmarshalledAliasConfiguration
    extends StObject
       with AliasConfiguration {
    
    /**
      * <p>Specifies an additional function versions the alias points to, allowing you to dictate what percentage of traffic will invoke each version.</p>
      */
    @JSName("RoutingConfig")
    var RoutingConfig_UnmarshalledAliasConfiguration: js.UndefOr[UnmarshalledAliasRoutingConfiguration] = js.undefined
  }
  object UnmarshalledAliasConfiguration {
    
    inline def apply(): UnmarshalledAliasConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledAliasConfiguration]
    }
    
    extension [Self <: UnmarshalledAliasConfiguration](x: Self) {
      
      inline def setRoutingConfig(value: UnmarshalledAliasRoutingConfiguration): Self = StObject.set(x, "RoutingConfig", value.asInstanceOf[js.Any])
      
      inline def setRoutingConfigUndefined: Self = StObject.set(x, "RoutingConfig", js.undefined)
    }
  }
}
