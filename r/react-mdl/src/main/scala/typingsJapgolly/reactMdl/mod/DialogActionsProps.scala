package typingsJapgolly.reactMdl.mod

import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogActionsProps
  extends StObject
     with HTMLProps[Any] {
  
  var fullWidth: js.UndefOr[Boolean] = js.undefined
}
object DialogActionsProps {
  
  inline def apply(): DialogActionsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogActionsProps]
  }
  
  extension [Self <: DialogActionsProps](x: Self) {
    
    inline def setFullWidth(value: Boolean): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
    
    inline def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
  }
}
