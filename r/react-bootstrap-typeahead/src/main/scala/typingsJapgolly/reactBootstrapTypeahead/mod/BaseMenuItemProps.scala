package typingsJapgolly.reactBootstrapTypeahead.mod

import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.li
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseMenuItemProps
  extends StObject
     with HTMLProps[li] {
  
  var active: js.UndefOr[Boolean] = js.undefined
}
object BaseMenuItemProps {
  
  inline def apply(): BaseMenuItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseMenuItemProps]
  }
  
  extension [Self <: BaseMenuItemProps](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
  }
}
