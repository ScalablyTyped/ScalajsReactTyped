package typingsJapgolly.vsoNodeApi

import typingsJapgolly.vsoNodeApi.anon.EnumValuesBroken
import typingsJapgolly.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesPolicyInterfacesMod {
  
  @js.native
  sealed trait PolicyEvaluationStatus extends StObject
  @JSImport("vso-node-api/interfaces/PolicyInterfaces", "PolicyEvaluationStatus")
  @js.native
  object PolicyEvaluationStatus extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PolicyEvaluationStatus & Double] = js.native
    
    /**
      * The policy has been fulfilled for this pull request.
      */
    @js.native
    sealed trait Approved
      extends StObject
         with PolicyEvaluationStatus
    /* 2 */ val Approved: typingsJapgolly.vsoNodeApi.interfacesPolicyInterfacesMod.PolicyEvaluationStatus.Approved & Double = js.native
    
    /**
      * The policy has encountered an unexpected error.
      */
    @js.native
    sealed trait Broken
      extends StObject
         with PolicyEvaluationStatus
    /* 5 */ val Broken: typingsJapgolly.vsoNodeApi.interfacesPolicyInterfacesMod.PolicyEvaluationStatus.Broken & Double = js.native
    
    /**
      * The policy does not apply to this pull request.
      */
    @js.native
    sealed trait NotApplicable
      extends StObject
         with PolicyEvaluationStatus
    /* 4 */ val NotApplicable: typingsJapgolly.vsoNodeApi.interfacesPolicyInterfacesMod.PolicyEvaluationStatus.NotApplicable & Double = js.native
    
    /**
      * The policy is either queued to run, or is waiting for some event before progressing.
      */
    @js.native
    sealed trait Queued
      extends StObject
         with PolicyEvaluationStatus
    /* 0 */ val Queued: typingsJapgolly.vsoNodeApi.interfacesPolicyInterfacesMod.PolicyEvaluationStatus.Queued & Double = js.native
    
    /**
      * The policy has rejected this pull request.
      */
    @js.native
    sealed trait Rejected
      extends StObject
         with PolicyEvaluationStatus
    /* 3 */ val Rejected: typingsJapgolly.vsoNodeApi.interfacesPolicyInterfacesMod.PolicyEvaluationStatus.Rejected & Double = js.native
    
    /**
      * The policy is currently running.
      */
    @js.native
    sealed trait Running
      extends StObject
         with PolicyEvaluationStatus
    /* 1 */ val Running: typingsJapgolly.vsoNodeApi.interfacesPolicyInterfacesMod.PolicyEvaluationStatus.Running & Double = js.native
  }
  
  object TypeInfo {
    
    @JSImport("vso-node-api/interfaces/PolicyInterfaces", "TypeInfo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vso-node-api/interfaces/PolicyInterfaces", "TypeInfo.PolicyConfiguration")
    @js.native
    def PolicyConfiguration: Any = js.native
    inline def PolicyConfiguration_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PolicyConfiguration")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/PolicyInterfaces", "TypeInfo.PolicyEvaluationRecord")
    @js.native
    def PolicyEvaluationRecord: Any = js.native
    inline def PolicyEvaluationRecord_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PolicyEvaluationRecord")(x.asInstanceOf[js.Any])
    
    @JSImport("vso-node-api/interfaces/PolicyInterfaces", "TypeInfo.PolicyEvaluationStatus")
    @js.native
    def PolicyEvaluationStatus: EnumValuesBroken = js.native
    inline def PolicyEvaluationStatus_=(x: EnumValuesBroken): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PolicyEvaluationStatus")(x.asInstanceOf[js.Any])
  }
  
  trait PolicyConfiguration
    extends StObject
       with VersionedPolicyConfigurationRef {
    
    /**
      * The links to other objects related to this object.
      */
    var _links: Any
    
    /**
      * A reference to the identity that created the policy.
      */
    var createdBy: IdentityRef
    
    /**
      * The date and time when the policy was created.
      */
    var createdDate: js.Date
    
    /**
      * Indicates whether the policy is blocking.
      */
    var isBlocking: Boolean
    
    /**
      * Indicates whether the policy has been (soft) deleted.
      */
    var isDeleted: Boolean
    
    /**
      * Indicates whether the policy is enabled.
      */
    var isEnabled: Boolean
    
    /**
      * The policy configuration settings.
      */
    var settings: Any
  }
  object PolicyConfiguration {
    
    inline def apply(
      _links: Any,
      createdBy: IdentityRef,
      createdDate: js.Date,
      id: Double,
      isBlocking: Boolean,
      isDeleted: Boolean,
      isEnabled: Boolean,
      revision: Double,
      settings: Any,
      `type`: PolicyTypeRef,
      url: String
    ): PolicyConfiguration = {
      val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isBlocking = isBlocking.asInstanceOf[js.Any], isDeleted = isDeleted.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyConfiguration]
    }
    
    extension [Self <: PolicyConfiguration](x: Self) {
      
      inline def setCreatedBy(value: IdentityRef): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
      
      inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
      
      inline def setIsBlocking(value: Boolean): Self = StObject.set(x, "isBlocking", value.asInstanceOf[js.Any])
      
      inline def setIsDeleted(value: Boolean): Self = StObject.set(x, "isDeleted", value.asInstanceOf[js.Any])
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      inline def setSettings(value: Any): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def set_links(value: Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
    }
  }
  
  trait PolicyConfigurationRef extends StObject {
    
    /**
      * The policy configuration ID.
      */
    var id: Double
    
    /**
      * The policy configuration type.
      */
    var `type`: PolicyTypeRef
    
    /**
      * The URL where the policy configuration can be retrieved.
      */
    var url: String
  }
  object PolicyConfigurationRef {
    
    inline def apply(id: Double, `type`: PolicyTypeRef, url: String): PolicyConfigurationRef = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyConfigurationRef]
    }
    
    extension [Self <: PolicyConfigurationRef](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setType(value: PolicyTypeRef): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait PolicyEvaluationRecord extends StObject {
    
    /**
      * Links to other related objects
      */
    var _links: Any
    
    /**
      * A string which uniquely identifies the target of a policy evaluation.
      */
    var artifactId: String
    
    /**
      * Time when this policy finished evaluating on this pull request.
      */
    var completedDate: js.Date
    
    /**
      * Contains all configuration data for the policy which is being evaluated.
      */
    var configuration: PolicyConfiguration
    
    /**
      * Internal context data of this policy evaluation.
      */
    var context: Any
    
    /**
      * Guid which uniquely identifies this evaluation record (one policy running on one pull request).
      */
    var evaluationId: String
    
    /**
      * Time when this policy was first evaluated on this pull request.
      */
    var startedDate: js.Date
    
    /**
      * Status of the policy (Running, Approved, Failed, etc.)
      */
    var status: PolicyEvaluationStatus
  }
  object PolicyEvaluationRecord {
    
    inline def apply(
      _links: Any,
      artifactId: String,
      completedDate: js.Date,
      configuration: PolicyConfiguration,
      context: Any,
      evaluationId: String,
      startedDate: js.Date,
      status: PolicyEvaluationStatus
    ): PolicyEvaluationRecord = {
      val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], artifactId = artifactId.asInstanceOf[js.Any], completedDate = completedDate.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], evaluationId = evaluationId.asInstanceOf[js.Any], startedDate = startedDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyEvaluationRecord]
    }
    
    extension [Self <: PolicyEvaluationRecord](x: Self) {
      
      inline def setArtifactId(value: String): Self = StObject.set(x, "artifactId", value.asInstanceOf[js.Any])
      
      inline def setCompletedDate(value: js.Date): Self = StObject.set(x, "completedDate", value.asInstanceOf[js.Any])
      
      inline def setConfiguration(value: PolicyConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setEvaluationId(value: String): Self = StObject.set(x, "evaluationId", value.asInstanceOf[js.Any])
      
      inline def setStartedDate(value: js.Date): Self = StObject.set(x, "startedDate", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: PolicyEvaluationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def set_links(value: Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
    }
  }
  
  trait PolicyType
    extends StObject
       with PolicyTypeRef {
    
    /**
      * The links to other objects related to this object.
      */
    var _links: Any
    
    /**
      * Detailed description of the policy type.
      */
    var description: String
  }
  object PolicyType {
    
    inline def apply(_links: Any, description: String, displayName: String, id: String, url: String): PolicyType = {
      val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyType]
    }
    
    extension [Self <: PolicyType](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def set_links(value: Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
    }
  }
  
  trait PolicyTypeRef extends StObject {
    
    /**
      * Display name of the policy type.
      */
    var displayName: String
    
    /**
      * The policy type ID.
      */
    var id: String
    
    /**
      * The URL where the policy type can be retrieved.
      */
    var url: String
  }
  object PolicyTypeRef {
    
    inline def apply(displayName: String, id: String, url: String): PolicyTypeRef = {
      val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolicyTypeRef]
    }
    
    extension [Self <: PolicyTypeRef](x: Self) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait VersionedPolicyConfigurationRef
    extends StObject
       with PolicyConfigurationRef {
    
    /**
      * The policy configuration revision ID.
      */
    var revision: Double
  }
  object VersionedPolicyConfigurationRef {
    
    inline def apply(id: Double, revision: Double, `type`: PolicyTypeRef, url: String): VersionedPolicyConfigurationRef = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[VersionedPolicyConfigurationRef]
    }
    
    extension [Self <: VersionedPolicyConfigurationRef](x: Self) {
      
      inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    }
  }
}
