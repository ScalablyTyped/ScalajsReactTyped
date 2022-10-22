package typingsJapgolly.wegameApi.anon

import typingsJapgolly.wegameApi.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stat extends StObject {
  
  var stat: Stats
}
object Stat {
  
  inline def apply(stat: Stats): Stat = {
    val __obj = js.Dynamic.literal(stat = stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stat]
  }
  
  extension [Self <: Stat](x: Self) {
    
    inline def setStat(value: Stats): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
  }
}
