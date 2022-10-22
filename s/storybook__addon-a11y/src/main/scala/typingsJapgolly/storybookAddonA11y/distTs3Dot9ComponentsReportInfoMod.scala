package typingsJapgolly.storybookAddonA11y

import typingsJapgolly.axeCore.mod.Result
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ComponentsReportInfoMod {
  
  @JSImport("@storybook/addon-a11y/dist/ts3.9/components/Report/Info", "Info")
  @js.native
  val Info: FunctionComponent[InfoProps] = js.native
  
  trait InfoProps extends StObject {
    
    var item: Result
  }
  object InfoProps {
    
    inline def apply(item: Result): InfoProps = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[InfoProps]
    }
    
    extension [Self <: InfoProps](x: Self) {
      
      inline def setItem(value: Result): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
}
