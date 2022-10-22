package typingsJapgolly.grommet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Xlarge
  extends StObject
     with /* x */ StringDictionary[js.UndefOr[String]] {
  
  var large: js.UndefOr[String] = js.undefined
  
  var medium: js.UndefOr[String] = js.undefined
  
  var small: js.UndefOr[String] = js.undefined
  
  var xlarge: js.UndefOr[String] = js.undefined
  
  var xsmall: js.UndefOr[String] = js.undefined
}
object Xlarge {
  
  inline def apply(): Xlarge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Xlarge]
  }
  
  extension [Self <: Xlarge](x: Self) {
    
    inline def setLarge(value: String): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
    
    inline def setMedium(value: String): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
    
    inline def setSmall(value: String): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    
    inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
    
    inline def setXlarge(value: String): Self = StObject.set(x, "xlarge", value.asInstanceOf[js.Any])
    
    inline def setXlargeUndefined: Self = StObject.set(x, "xlarge", js.undefined)
    
    inline def setXsmall(value: String): Self = StObject.set(x, "xsmall", value.asInstanceOf[js.Any])
    
    inline def setXsmallUndefined: Self = StObject.set(x, "xsmall", js.undefined)
  }
}
