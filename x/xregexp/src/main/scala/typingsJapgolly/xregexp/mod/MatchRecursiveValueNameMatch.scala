package typingsJapgolly.xregexp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A match to a defined value name during a recursive match.
  */
trait MatchRecursiveValueNameMatch extends StObject {
  
  /**
    * The end index of the string portion.
    */
  var end: Double
  
  /**
    * The value name as specified in the `XRegExp.MatchRecursiveOptions`
    */
  var name: String
  
  /**
    * The start index of the string portion.
    */
  var start: Double
  
  /**
    * The portion of the string that corresponds to the value name,
    */
  var value: String
}
object MatchRecursiveValueNameMatch {
  
  inline def apply(end: Double, name: String, start: Double, value: String): MatchRecursiveValueNameMatch = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchRecursiveValueNameMatch]
  }
  
  extension [Self <: MatchRecursiveValueNameMatch](x: Self) {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
