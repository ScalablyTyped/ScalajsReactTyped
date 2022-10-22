package typingsJapgolly.activexInfopath.anon

import typingsJapgolly.activexInfopath.InfoPath.SaveEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PEventSaveEventObject extends StObject {
  
  val pEvent: SaveEventObject
}
object PEventSaveEventObject {
  
  inline def apply(pEvent: SaveEventObject): PEventSaveEventObject = {
    val __obj = js.Dynamic.literal(pEvent = pEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PEventSaveEventObject]
  }
  
  extension [Self <: PEventSaveEventObject](x: Self) {
    
    inline def setPEvent(value: SaveEventObject): Self = StObject.set(x, "pEvent", value.asInstanceOf[js.Any])
  }
}
