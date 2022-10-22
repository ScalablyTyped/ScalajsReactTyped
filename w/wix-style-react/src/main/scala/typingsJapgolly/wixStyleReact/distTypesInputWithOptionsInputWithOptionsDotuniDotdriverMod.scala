package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixStyleReact.anon.InputWrapper
import typingsJapgolly.wixStyleReact.distTypesDropdownLayoutDropdownLayoutDotuniDotdriverMod.DropdownLayoutUniDriver
import typingsJapgolly.wixStyleReact.distTypesInputInputDotuniDotdriverMod.InputUniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInputWithOptionsInputWithOptionsDotuniDotdriverMod {
  
  trait InputWithOptionsUniDriver
    extends StObject
       with BaseUniDriver {
    
    var driver: InputWrapper
    
    var dropdownLayoutDriver: DropdownLayoutUniDriver
    
    var inputDriver: InputUniDriver
  }
  object InputWithOptionsUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      driver: InputWrapper,
      dropdownLayoutDriver: DropdownLayoutUniDriver,
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      inputDriver: InputUniDriver
    ): InputWithOptionsUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, driver = driver.asInstanceOf[js.Any], dropdownLayoutDriver = dropdownLayoutDriver.asInstanceOf[js.Any], element = element.toJsFn, exists = exists.toJsFn, inputDriver = inputDriver.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputWithOptionsUniDriver]
    }
    
    extension [Self <: InputWithOptionsUniDriver](x: Self) {
      
      inline def setDriver(value: InputWrapper): Self = StObject.set(x, "driver", value.asInstanceOf[js.Any])
      
      inline def setDropdownLayoutDriver(value: DropdownLayoutUniDriver): Self = StObject.set(x, "dropdownLayoutDriver", value.asInstanceOf[js.Any])
      
      inline def setInputDriver(value: InputUniDriver): Self = StObject.set(x, "inputDriver", value.asInstanceOf[js.Any])
    }
  }
}
