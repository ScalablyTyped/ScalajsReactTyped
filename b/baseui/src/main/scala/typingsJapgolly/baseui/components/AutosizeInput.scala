package typingsJapgolly.baseui.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.baseuiStrings.$size
import typingsJapgolly.baseui.baseuiStrings.defaultValue
import typingsJapgolly.baseui.baseuiStrings.input
import typingsJapgolly.baseui.baseuiStrings.inputRef
import typingsJapgolly.baseui.baseuiStrings.overrides
import typingsJapgolly.baseui.baseuiStrings.value
import typingsJapgolly.baseui.selectTypesMod.AutosizeInputOverrides
import typingsJapgolly.baseui.selectTypesMod.AutosizeInputProps
import typingsJapgolly.baseui.selectTypesMod.SharedStylePropsArg
import typingsJapgolly.baseui.selectTypesMod.Size
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.std.Omit
import typingsJapgolly.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AutosizeInput {
  
  inline def apply($size: Size, inputRef: Any => Any, overrides: AutosizeInputOverrides, value: String): Builder = {
    val __props = js.Dynamic.literal($size = $size.asInstanceOf[js.Any], inputRef = js.Any.fromFunction1(inputRef), overrides = overrides.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AutosizeInputProps & (Omit[
    ComponentProps[StyletronComponent[input, SharedStylePropsArg]], 
    /* keyof baseui.baseui/select/types.AutosizeInputProps */ value | defaultValue | inputRef | overrides | $size
  ])]))
  }
  
  @JSImport("baseui/select", "AutosizeInput")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.baseui.selectMod.AutosizeInput] {
    
    inline def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
  }
  
  def withProps(
    p: AutosizeInputProps & (Omit[
      ComponentProps[StyletronComponent[input, SharedStylePropsArg]], 
      /* keyof baseui.baseui/select/types.AutosizeInputProps */ value | defaultValue | inputRef | overrides | $size
    ])
  ): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
