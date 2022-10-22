package typingsJapgolly.activexInfopath.anon

import typingsJapgolly.activexInfopath.InfoPath.DocContextChangeEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PEventDocContextChangeEventObject extends StObject {
  
  val pEvent: DocContextChangeEventObject
}
object PEventDocContextChangeEventObject {
  
  inline def apply(pEvent: DocContextChangeEventObject): PEventDocContextChangeEventObject = {
    val __obj = js.Dynamic.literal(pEvent = pEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PEventDocContextChangeEventObject]
  }
  
  extension [Self <: PEventDocContextChangeEventObject](x: Self) {
    
    inline def setPEvent(value: DocContextChangeEventObject): Self = StObject.set(x, "pEvent", value.asInstanceOf[js.Any])
  }
}
