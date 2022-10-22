package typingsJapgolly.openjscad

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICenter extends StObject {
  
  def center(cAxes: js.Array[String]): CxG
}
object ICenter {
  
  inline def apply(center: js.Array[String] => CxG): ICenter = {
    val __obj = js.Dynamic.literal(center = js.Any.fromFunction1(center))
    __obj.asInstanceOf[ICenter]
  }
  
  extension [Self <: ICenter](x: Self) {
    
    inline def setCenter(value: js.Array[String] => CxG): Self = StObject.set(x, "center", js.Any.fromFunction1(value))
  }
}
