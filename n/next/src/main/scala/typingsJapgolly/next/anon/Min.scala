package typingsJapgolly.next.anon

import typingsJapgolly.next.nextInts.`62`
import typingsJapgolly.next.nextStrings.cqLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Min extends StObject {
  
  val max: typingsJapgolly.next.nextInts.`0`
  
  val min: `62`
  
  val option: cqLevel
}
object Min {
  
  inline def apply(): Min = {
    val __obj = js.Dynamic.literal(max = 0, min = 62, option = "cqLevel")
    __obj.asInstanceOf[Min]
  }
  
  extension [Self <: Min](x: Self) {
    
    inline def setMax(value: typingsJapgolly.next.nextInts.`0`): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: `62`): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setOption(value: cqLevel): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
  }
}
