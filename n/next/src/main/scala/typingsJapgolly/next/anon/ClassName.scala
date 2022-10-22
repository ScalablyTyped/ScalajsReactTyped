package typingsJapgolly.next.anon

import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassName extends StObject {
  
  var className: String
  
  var styles: typingsJapgolly.react.mod.global.JSX.Element
}
object ClassName {
  
  inline def apply(className: String, styles: VdomElement): ClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], styles = styles.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassName]
  }
  
  extension [Self <: ClassName](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setStyles(value: VdomElement): Self = StObject.set(x, "styles", value.rawElement.asInstanceOf[js.Any])
  }
}
