package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.anon.Blur
import typingsJapgolly.wixStyleReact.distTypesDropdownLayoutDropdownLayoutDotdriverMod.DropdownLayoutDriver
import typingsJapgolly.wixStyleReact.distTypesInputInputDotdriverMod.InputDriver
import typingsJapgolly.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInputWithOptionsInputWithOptionsDotdriverMod {
  
  trait InputWithOptionsDriver
    extends StObject
       with BaseDriver {
    
    var driver: Blur
    
    var dropdownLayoutDriver: DropdownLayoutDriver
    
    var inputDriver: InputDriver
  }
  object InputWithOptionsDriver {
    
    inline def apply(
      driver: Blur,
      dropdownLayoutDriver: DropdownLayoutDriver,
      exists: CallbackTo[Boolean],
      inputDriver: InputDriver
    ): InputWithOptionsDriver = {
      val __obj = js.Dynamic.literal(driver = driver.asInstanceOf[js.Any], dropdownLayoutDriver = dropdownLayoutDriver.asInstanceOf[js.Any], exists = exists.toJsFn, inputDriver = inputDriver.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputWithOptionsDriver]
    }
    
    extension [Self <: InputWithOptionsDriver](x: Self) {
      
      inline def setDriver(value: Blur): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
      
      inline def setDropdownLayoutDriver(value: DropdownLayoutDriver): Self = StObject.set(x, "dropdownLayoutDriver", value.asInstanceOf[js.Any])
      
      inline def setInputDriver(value: InputDriver): Self = StObject.set(x, "inputDriver", value.asInstanceOf[js.Any])
    }
  }
}
