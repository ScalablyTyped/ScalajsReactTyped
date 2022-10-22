package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.primary
import typingsJapgolly.baseui.baseuiStrings.secondary
import typingsJapgolly.baseui.baseuiStrings.tertiary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Primary extends StObject {
  
  val primary: typingsJapgolly.baseui.baseuiStrings.primary
  
  val secondary: typingsJapgolly.baseui.baseuiStrings.secondary
  
  val tertiary: typingsJapgolly.baseui.baseuiStrings.tertiary
}
object Primary {
  
  inline def apply(): Primary = {
    val __obj = js.Dynamic.literal(primary = "primary", secondary = "secondary", tertiary = "tertiary")
    __obj.asInstanceOf[Primary]
  }
  
  extension [Self <: Primary](x: Self) {
    
    inline def setPrimary(value: primary): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setSecondary(value: secondary): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    inline def setTertiary(value: tertiary): Self = StObject.set(x, "tertiary", value.asInstanceOf[js.Any])
  }
}
