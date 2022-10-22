package typingsJapgolly.aframe.anon

import typingsJapgolly.aframe.mod.Coordinate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsCoordinate extends StObject {
  
  def isCoordinate(value: String): Boolean
  
  def parse(value: String): Coordinate
  
  def stringify(coord: Coordinate): String
}
object IsCoordinate {
  
  inline def apply(isCoordinate: String => Boolean, parse: String => Coordinate, stringify: Coordinate => String): IsCoordinate = {
    val __obj = js.Dynamic.literal(isCoordinate = js.Any.fromFunction1(isCoordinate), parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
    __obj.asInstanceOf[IsCoordinate]
  }
  
  extension [Self <: IsCoordinate](x: Self) {
    
    inline def setIsCoordinate(value: String => Boolean): Self = StObject.set(x, "isCoordinate", js.Any.fromFunction1(value))
    
    inline def setParse(value: String => Coordinate): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    
    inline def setStringify(value: Coordinate => String): Self = StObject.set(x, "stringify", js.Any.fromFunction1(value))
  }
}
