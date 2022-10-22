package typingsJapgolly.glaze.anon

import typingsJapgolly.glaze.glazeInts.`9999`
import typingsJapgolly.glaze.glazeStrings.Dot125rem
import typingsJapgolly.glaze.glazeStrings.Dot25rem
import typingsJapgolly.glaze.glazeStrings.Dot5rem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Full extends StObject {
  
  val full: `9999`
  
  val lg: Dot5rem
  
  val md: Dot25rem
  
  val sm: Dot125rem
}
object Full {
  
  inline def apply(): Full = {
    val __obj = js.Dynamic.literal(full = 9999, lg = ".5rem", md = ".25rem", sm = ".125rem")
    __obj.asInstanceOf[Full]
  }
  
  extension [Self <: Full](x: Self) {
    
    inline def setFull(value: `9999`): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    inline def setLg(value: Dot5rem): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
    
    inline def setMd(value: Dot25rem): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
    
    inline def setSm(value: Dot125rem): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
  }
}
