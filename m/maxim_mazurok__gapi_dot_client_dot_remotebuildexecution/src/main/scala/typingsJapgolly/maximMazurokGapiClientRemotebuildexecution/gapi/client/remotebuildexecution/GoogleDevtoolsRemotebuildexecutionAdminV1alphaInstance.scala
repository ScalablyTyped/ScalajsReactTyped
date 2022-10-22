package typingsJapgolly.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance extends StObject {
  
  /** The policy to define whether or not RBE features can be used or how they can be used. */
  var featurePolicy: js.UndefOr[GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicy] = js.undefined
  
  /** The location is a GCP region. Currently only `us-central1` is supported. */
  var location: js.UndefOr[String] = js.undefined
  
  /** Output only. Whether stack driver logging is enabled for the instance. */
  var loggingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Output only. Instance resource name formatted as: `projects/[PROJECT_ID]/instances/[INSTANCE_ID]`. Name should not be populated when creating an instance since it is provided in the
    * `instance_id` field.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. State of the instance. */
  var state: js.UndefOr[String] = js.undefined
}
object GoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance {
  
  inline def apply(): GoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance]
  }
  
  extension [Self <: GoogleDevtoolsRemotebuildexecutionAdminV1alphaInstance](x: Self) {
    
    inline def setFeaturePolicy(value: GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicy): Self = StObject.set(x, "featurePolicy", value.asInstanceOf[js.Any])
    
    inline def setFeaturePolicyUndefined: Self = StObject.set(x, "featurePolicy", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setLoggingEnabled(value: Boolean): Self = StObject.set(x, "loggingEnabled", value.asInstanceOf[js.Any])
    
    inline def setLoggingEnabledUndefined: Self = StObject.set(x, "loggingEnabled", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
