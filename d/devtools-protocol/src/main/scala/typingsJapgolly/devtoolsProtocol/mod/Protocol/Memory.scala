package typingsJapgolly.devtoolsProtocol.mod.Protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Memory {
  
  trait GetAllTimeSamplingProfileResponse extends StObject {
    
    var profile: SamplingProfile
  }
  object GetAllTimeSamplingProfileResponse {
    
    inline def apply(profile: SamplingProfile): GetAllTimeSamplingProfileResponse = {
      val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAllTimeSamplingProfileResponse]
    }
    
    extension [Self <: GetAllTimeSamplingProfileResponse](x: Self) {
      
      inline def setProfile(value: SamplingProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetBrowserSamplingProfileResponse extends StObject {
    
    var profile: SamplingProfile
  }
  object GetBrowserSamplingProfileResponse {
    
    inline def apply(profile: SamplingProfile): GetBrowserSamplingProfileResponse = {
      val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBrowserSamplingProfileResponse]
    }
    
    extension [Self <: GetBrowserSamplingProfileResponse](x: Self) {
      
      inline def setProfile(value: SamplingProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetDOMCountersResponse extends StObject {
    
    var documents: integer
    
    var jsEventListeners: integer
    
    var nodes: integer
  }
  object GetDOMCountersResponse {
    
    inline def apply(documents: integer, jsEventListeners: integer, nodes: integer): GetDOMCountersResponse = {
      val __obj = js.Dynamic.literal(documents = documents.asInstanceOf[js.Any], jsEventListeners = jsEventListeners.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDOMCountersResponse]
    }
    
    extension [Self <: GetDOMCountersResponse](x: Self) {
      
      inline def setDocuments(value: integer): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
      
      inline def setJsEventListeners(value: integer): Self = StObject.set(x, "jsEventListeners", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: integer): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetSamplingProfileResponse extends StObject {
    
    var profile: SamplingProfile
  }
  object GetSamplingProfileResponse {
    
    inline def apply(profile: SamplingProfile): GetSamplingProfileResponse = {
      val __obj = js.Dynamic.literal(profile = profile.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSamplingProfileResponse]
    }
    
    extension [Self <: GetSamplingProfileResponse](x: Self) {
      
      inline def setProfile(value: SamplingProfile): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    }
  }
  
  trait Module extends StObject {
    
    /**
      * Base address where the module is loaded into memory. Encoded as a decimal
      * or hexadecimal (0x prefixed) string.
      */
    var baseAddress: String
    
    /**
      * Name of the module.
      */
    var name: String
    
    /**
      * Size of the module in bytes.
      */
    var size: Double
    
    /**
      * UUID of the module.
      */
    var uuid: String
  }
  object Module {
    
    inline def apply(baseAddress: String, name: String, size: Double, uuid: String): Module = {
      val __obj = js.Dynamic.literal(baseAddress = baseAddress.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Module]
    }
    
    extension [Self <: Module](x: Self) {
      
      inline def setBaseAddress(value: String): Self = StObject.set(x, "baseAddress", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.moderate
    - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.critical
  */
  trait PressureLevel extends StObject
  object PressureLevel {
    
    inline def critical: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.critical = "critical".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.critical]
    
    inline def moderate: typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.moderate = "moderate".asInstanceOf[typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.moderate]
  }
  
  trait SamplingProfile extends StObject {
    
    var modules: js.Array[Module]
    
    var samples: js.Array[SamplingProfileNode]
  }
  object SamplingProfile {
    
    inline def apply(modules: js.Array[Module], samples: js.Array[SamplingProfileNode]): SamplingProfile = {
      val __obj = js.Dynamic.literal(modules = modules.asInstanceOf[js.Any], samples = samples.asInstanceOf[js.Any])
      __obj.asInstanceOf[SamplingProfile]
    }
    
    extension [Self <: SamplingProfile](x: Self) {
      
      inline def setModules(value: js.Array[Module]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      inline def setModulesVarargs(value: Module*): Self = StObject.set(x, "modules", js.Array(value*))
      
      inline def setSamples(value: js.Array[SamplingProfileNode]): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
      
      inline def setSamplesVarargs(value: SamplingProfileNode*): Self = StObject.set(x, "samples", js.Array(value*))
    }
  }
  
  trait SamplingProfileNode extends StObject {
    
    /**
      * Size of the sampled allocation.
      */
    var size: Double
    
    /**
      * Execution stack at the point of allocation.
      */
    var stack: js.Array[String]
    
    /**
      * Total bytes attributed to this sample.
      */
    var total: Double
  }
  object SamplingProfileNode {
    
    inline def apply(size: Double, stack: js.Array[String], total: Double): SamplingProfileNode = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[SamplingProfileNode]
    }
    
    extension [Self <: SamplingProfileNode](x: Self) {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setStack(value: js.Array[String]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackVarargs(value: String*): Self = StObject.set(x, "stack", js.Array(value*))
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait SetPressureNotificationsSuppressedRequest extends StObject {
    
    /**
      * If true, memory pressure notifications will be suppressed.
      */
    var suppressed: Boolean
  }
  object SetPressureNotificationsSuppressedRequest {
    
    inline def apply(suppressed: Boolean): SetPressureNotificationsSuppressedRequest = {
      val __obj = js.Dynamic.literal(suppressed = suppressed.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetPressureNotificationsSuppressedRequest]
    }
    
    extension [Self <: SetPressureNotificationsSuppressedRequest](x: Self) {
      
      inline def setSuppressed(value: Boolean): Self = StObject.set(x, "suppressed", value.asInstanceOf[js.Any])
    }
  }
  
  trait SimulatePressureNotificationRequest extends StObject {
    
    /**
      * Memory pressure level of the notification.
      */
    var level: PressureLevel
  }
  object SimulatePressureNotificationRequest {
    
    inline def apply(level: PressureLevel): SimulatePressureNotificationRequest = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimulatePressureNotificationRequest]
    }
    
    extension [Self <: SimulatePressureNotificationRequest](x: Self) {
      
      inline def setLevel(value: PressureLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    }
  }
  
  trait StartSamplingRequest extends StObject {
    
    /**
      * Average number of bytes between samples.
      */
    var samplingInterval: js.UndefOr[integer] = js.undefined
    
    /**
      * Do not randomize intervals between samples.
      */
    var suppressRandomness: js.UndefOr[Boolean] = js.undefined
  }
  object StartSamplingRequest {
    
    inline def apply(): StartSamplingRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartSamplingRequest]
    }
    
    extension [Self <: StartSamplingRequest](x: Self) {
      
      inline def setSamplingInterval(value: integer): Self = StObject.set(x, "samplingInterval", value.asInstanceOf[js.Any])
      
      inline def setSamplingIntervalUndefined: Self = StObject.set(x, "samplingInterval", js.undefined)
      
      inline def setSuppressRandomness(value: Boolean): Self = StObject.set(x, "suppressRandomness", value.asInstanceOf[js.Any])
      
      inline def setSuppressRandomnessUndefined: Self = StObject.set(x, "suppressRandomness", js.undefined)
    }
  }
}
