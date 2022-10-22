package typingsJapgolly.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumOfSpaces extends StObject {
  
  var numOfSpaces: Double
  
  var width: Double
}
object NumOfSpaces {
  
  inline def apply(numOfSpaces: Double, width: Double): NumOfSpaces = {
    val __obj = js.Dynamic.literal(numOfSpaces = numOfSpaces.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumOfSpaces]
  }
  
  extension [Self <: NumOfSpaces](x: Self) {
    
    inline def setNumOfSpaces(value: Double): Self = StObject.set(x, "numOfSpaces", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
