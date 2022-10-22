package typingsJapgolly.wixStyleReact

import typingsJapgolly.std.ReturnType
import typingsJapgolly.wixStyleReact.anon.ElementEventTrigger
import typingsJapgolly.wixStyleReact.anon.EventTrigger
import typingsJapgolly.wixStyleReact.anon.GetArrowElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPopoverPopoverDotdriverMod {
  
  @JSImport("wix-style-react/dist/types/Popover/Popover.driver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def popoverLegacyDriverFactory(hasElementEventTrigger: ElementEventTrigger): GetArrowElement = ^.asInstanceOf[js.Dynamic].applyDynamic("popoverLegacyDriverFactory")(hasElementEventTrigger.asInstanceOf[js.Any]).asInstanceOf[GetArrowElement]
  
  type PopoverDriver = ReturnType[js.Function1[/* hasElementEventTrigger */ EventTrigger, GetArrowElement]]
}
