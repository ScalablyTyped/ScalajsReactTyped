package typingsJapgolly.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersonDetection extends StObject {
  
  /**
    * Details about a person whose path was tracked in a video.
    */
  var Person: js.UndefOr[PersonDetail] = js.undefined
  
  /**
    * The time, in milliseconds from the start of the video, that the person's path was tracked.
    */
  var Timestamp: js.UndefOr[typingsJapgolly.awsSdk.clientsRekognitionMod.Timestamp] = js.undefined
}
object PersonDetection {
  
  inline def apply(): PersonDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersonDetection]
  }
  
  extension [Self <: PersonDetection](x: Self) {
    
    inline def setPerson(value: PersonDetail): Self = StObject.set(x, "Person", value.asInstanceOf[js.Any])
    
    inline def setPersonUndefined: Self = StObject.set(x, "Person", js.undefined)
    
    inline def setTimestamp(value: Timestamp): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
