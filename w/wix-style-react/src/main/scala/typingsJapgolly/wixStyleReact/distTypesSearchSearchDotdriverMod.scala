package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.anon.Blur
import typingsJapgolly.wixStyleReact.anon.IsCollapsed
import typingsJapgolly.wixStyleReact.distTypesDropdownLayoutDropdownLayoutDotdriverMod.DropdownLayoutDriver
import typingsJapgolly.wixStyleReact.distTypesInputInputDotdriverMod.InputDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSearchSearchDotdriverMod {
  
  /* Inlined parent wix-style-react.wix-style-react/dist/types/common.OmitPolyfill<wix-style-react.wix-style-react/dist/types/InputWithOptions/InputWithOptions.driver.InputWithOptionsDriver, 'driver'> */
  trait SearchDriver extends StObject {
    
    var driver: Blur & IsCollapsed
    
    var dropdownLayoutDriver: DropdownLayoutDriver
    
    var exists: js.Function0[Boolean]
    
    var inputDriver: InputDriver
  }
  object SearchDriver {
    
    inline def apply(
      driver: Blur & IsCollapsed,
      dropdownLayoutDriver: DropdownLayoutDriver,
      exists: CallbackTo[Boolean],
      inputDriver: InputDriver
    ): SearchDriver = {
      val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any], dropdownLayoutDriver = dropdownLayoutDriver.asInstanceOf[js.Any], exists = exists.toJsFn, inputDriver = inputDriver.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchDriver]
    }
    
    extension [Self <: SearchDriver](x: Self) {
      
      inline def setDriver(value: Blur & IsCollapsed): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
      
      inline def setDropdownLayoutDriver(value: DropdownLayoutDriver): Self = StObject.set(x, "dropdownLayoutDriver", value.asInstanceOf[js.Any])
      
      inline def setExists(value: CallbackTo[Boolean]): Self = StObject.set(x, "exists", value.toJsFn)
      
      inline def setInputDriver(value: InputDriver): Self = StObject.set(x, "inputDriver", value.asInstanceOf[js.Any])
    }
  }
}
