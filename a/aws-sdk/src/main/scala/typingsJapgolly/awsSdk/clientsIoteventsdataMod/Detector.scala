package typingsJapgolly.awsSdk.clientsIoteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Detector extends StObject {
  
  /**
    * The time the detector (instance) was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the detector model that created this detector (instance).
    */
  var detectorModelName: js.UndefOr[DetectorModelName] = js.undefined
  
  /**
    * The version of the detector model that created this detector (instance).
    */
  var detectorModelVersion: js.UndefOr[DetectorModelVersion] = js.undefined
  
  /**
    * The value of the key (identifying the device or system) that caused the creation of this detector (instance).
    */
  var keyValue: js.UndefOr[KeyValue] = js.undefined
  
  /**
    * The time the detector (instance) was last updated.
    */
  var lastUpdateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The current state of the detector (instance).
    */
  var state: js.UndefOr[DetectorState] = js.undefined
}
object Detector {
  
  inline def apply(): Detector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Detector]
  }
  
  extension [Self <: Detector](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDetectorModelName(value: DetectorModelName): Self = StObject.set(x, "detectorModelName", value.asInstanceOf[js.Any])
    
    inline def setDetectorModelNameUndefined: Self = StObject.set(x, "detectorModelName", js.undefined)
    
    inline def setDetectorModelVersion(value: DetectorModelVersion): Self = StObject.set(x, "detectorModelVersion", value.asInstanceOf[js.Any])
    
    inline def setDetectorModelVersionUndefined: Self = StObject.set(x, "detectorModelVersion", js.undefined)
    
    inline def setKeyValue(value: KeyValue): Self = StObject.set(x, "keyValue", value.asInstanceOf[js.Any])
    
    inline def setKeyValueUndefined: Self = StObject.set(x, "keyValue", js.undefined)
    
    inline def setLastUpdateTime(value: js.Date): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    inline def setState(value: DetectorState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
