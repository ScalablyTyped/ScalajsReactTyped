package typingsJapgolly.materialUi.MaterialUI

import typingsJapgolly.materialUi.MaterialUI.Styles.MuiTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeWrapperProps extends StObject {
  
  var theme: MuiTheme
}
object ThemeWrapperProps {
  
  inline def apply(theme: MuiTheme): ThemeWrapperProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeWrapperProps]
  }
  
  extension [Self <: ThemeWrapperProps](x: Self) {
    
    inline def setTheme(value: MuiTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
  }
}
