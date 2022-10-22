package typingsJapgolly.parcelTypes.mod

import typingsJapgolly.parcelTypes.parcelTypesStrings.buildProgress
import typingsJapgolly.parcelTypes.parcelTypesStrings.packaging
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackagingProgressEvent
  extends StObject
     with BuildProgressEvent {
  
  val bundle: NamedBundle
  
  val phase: packaging
  
  val `type`: buildProgress
}
object PackagingProgressEvent {
  
  inline def apply(bundle: NamedBundle): PackagingProgressEvent = {
    val __obj = js.Dynamic.literal(bundle = bundle.asInstanceOf[js.Any], phase = "packaging")
    __obj.updateDynamic("type")("buildProgress")
    __obj.asInstanceOf[PackagingProgressEvent]
  }
  
  extension [Self <: PackagingProgressEvent](x: Self) {
    
    inline def setBundle(value: NamedBundle): Self = StObject.set(x, "bundle", value.asInstanceOf[js.Any])
    
    inline def setPhase(value: packaging): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setType(value: buildProgress): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
