package typingsJapgolly.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.formLabelFormLabelMod.FormLabelTypeMap
import typingsJapgolly.materialUiCore.materialUiCoreStrings.label
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formLabelMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Checkboxes](https://mui.com/components/checkboxes/)
    * - [Radio Buttons](https://mui.com/components/radio-buttons/)
    * - [Switches](https://mui.com/components/switches/)
    *
    * API:
    *
    * - [FormLabel API](https://mui.com/api/form-label/)
    */
  @JSImport("@material-ui/core/FormLabel", JSImport.Default)
  @js.native
  val default: OverridableComponent[FormLabelTypeMap[js.Object, label]] = js.native
  
  type _To = OverridableComponent[FormLabelTypeMap[js.Object, label]]
  
  /* This means you don't have to write `default`, but can instead just say `formLabelMod.foo` */
  override def _to: OverridableComponent[FormLabelTypeMap[js.Object, label]] = default
}
