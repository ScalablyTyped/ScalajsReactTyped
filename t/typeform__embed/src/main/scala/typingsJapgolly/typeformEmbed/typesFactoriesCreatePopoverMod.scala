package typingsJapgolly.typeformEmbed

import typingsJapgolly.typeformEmbed.typesFactoriesCreatePopoverCreatePopoverMod.Popover
import typingsJapgolly.typeformEmbed.typesFactoriesCreatePopoverPopoverOptionsMod.PopoverOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesFactoriesCreatePopoverMod {
  
  @JSImport("@typeform/embed/types/factories/create-popover", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createPopover(formId: String): Popover = ^.asInstanceOf[js.Dynamic].applyDynamic("createPopover")(formId.asInstanceOf[js.Any]).asInstanceOf[Popover]
  inline def createPopover(formId: String, userOptions: PopoverOptions): Popover = (^.asInstanceOf[js.Dynamic].applyDynamic("createPopover")(formId.asInstanceOf[js.Any], userOptions.asInstanceOf[js.Any])).asInstanceOf[Popover]
}
