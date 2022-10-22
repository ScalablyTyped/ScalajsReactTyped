package typingsJapgolly.baseui.anon

import typingsJapgolly.baseui.baseuiStrings.compact
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.large_
import typingsJapgolly.baseui.baseuiStrings.mini
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Compact extends StObject {
  
  val default: default_
  
  val compact: typingsJapgolly.baseui.baseuiStrings.compact
  
  val large: large_
  
  val mini: typingsJapgolly.baseui.baseuiStrings.mini
}
object Compact {
  
  inline def apply(): Compact = {
    val __obj = js.Dynamic.literal(compact = "compact", default = "default", large = "large", mini = "mini")
    __obj.asInstanceOf[Compact]
  }
  
  extension [Self <: Compact](x: Self) {
    
    inline def setCompact(value: compact): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: default_): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setLarge(value: large_): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
    
    inline def setMini(value: mini): Self = StObject.set(x, "mini", value.asInstanceOf[js.Any])
  }
}
