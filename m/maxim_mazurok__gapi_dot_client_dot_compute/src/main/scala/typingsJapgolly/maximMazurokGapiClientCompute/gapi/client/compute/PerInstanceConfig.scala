package typingsJapgolly.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerInstanceConfig extends StObject {
  
  /**
    * Fingerprint of this per-instance config. This field can be used in optimistic locking. It is ignored when inserting a per-instance config. An up-to-date fingerprint must be provided
    * in order to update an existing per-instance config or the field needs to be unset.
    */
  var fingerprint: js.UndefOr[String] = js.undefined
  
  /**
    * The name of a per-instance config and its corresponding instance. Serves as a merge key during UpdatePerInstanceConfigs operations, that is, if a per-instance config with the same
    * name exists then it will be updated, otherwise a new one will be created for the VM instance with the same name. An attempt to create a per-instance config for a VM instance that
    * either doesn't exist or is not part of the group will result in an error.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** The intended preserved state for the given instance. Does not contain preserved state generated from a stateful policy. */
  var preservedState: js.UndefOr[PreservedState] = js.undefined
  
  /** The status of applying this per-instance config on the corresponding managed instance. */
  var status: js.UndefOr[String] = js.undefined
}
object PerInstanceConfig {
  
  inline def apply(): PerInstanceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerInstanceConfig]
  }
  
  extension [Self <: PerInstanceConfig](x: Self) {
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPreservedState(value: PreservedState): Self = StObject.set(x, "preservedState", value.asInstanceOf[js.Any])
    
    inline def setPreservedStateUndefined: Self = StObject.set(x, "preservedState", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
