package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemedBreadcrumbs extends StObject {
  
  var themedBreadcrumbs: typingsJapgolly.react.mod.global.JSX.Element
}
object ThemedBreadcrumbs {
  
  inline def apply(themedBreadcrumbs: VdomElement): ThemedBreadcrumbs = {
    val __obj = js.Dynamic.literal(themedBreadcrumbs = themedBreadcrumbs.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemedBreadcrumbs]
  }
  
  extension [Self <: ThemedBreadcrumbs](x: Self) {
    
    inline def setThemedBreadcrumbs(value: VdomElement): Self = StObject.set(x, "themedBreadcrumbs", value.rawElement.asInstanceOf[js.Any])
  }
}
