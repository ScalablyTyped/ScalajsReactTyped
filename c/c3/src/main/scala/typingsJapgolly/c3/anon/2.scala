package typingsJapgolly.c3.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.c3.mod.FormatFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var format: StringDictionary[Boolean | FormatFunction]
}
object `2` {
  
  inline def apply(format: StringDictionary[Boolean | FormatFunction]): `2` = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setFormat(value: StringDictionary[Boolean | FormatFunction]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
  }
}
