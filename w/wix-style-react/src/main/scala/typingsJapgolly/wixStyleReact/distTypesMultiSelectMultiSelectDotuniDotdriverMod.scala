package typingsJapgolly.wixStyleReact

import typingsJapgolly.wixStyleReact.anon.CustomSuffixExists
import typingsJapgolly.wixStyleReact.anon.IsDisabled
import typingsJapgolly.wixStyleReact.anon.PickInputWithOptionsUniDr
import typingsJapgolly.wixStyleReact.distTypesDropdownLayoutDropdownLayoutDotuniDotdriverMod.DropdownLayoutUniDriver
import typingsJapgolly.wixStyleReact.distTypesInputInputDotuniDotdriverMod.InputUniDriver
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMultiSelectMultiSelectDotuniDotdriverMod {
  
  /* Inlined parent wix-style-react.wix-style-react/dist/types/common.OmitPolyfill<wix-style-react.wix-style-react/dist/types/InputWithOptions/InputWithOptions.uni.driver.InputWithOptionsUniDriver, 'driver'> */
  @js.native
  trait MultiSelectUniDriver extends StObject {
    
    var click: js.Function0[js.Promise[Unit]] = js.native
    
    var driver: IsDisabled & CustomSuffixExists & PickInputWithOptionsUniDr & BaseUniDriver = js.native
    
    var dropdownLayoutDriver: DropdownLayoutUniDriver = js.native
    
    var element: js.Function0[js.Promise[Any]] = js.native
    
    def exists(): js.Promise[Unit] = js.native
    @JSName("exists")
    var exists_FMultiSelectUniDriver: js.Function0[js.Promise[Boolean]] = js.native
    
    var inputDriver: InputUniDriver = js.native
  }
}
