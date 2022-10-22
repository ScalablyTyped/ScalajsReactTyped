package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.baseui.anon.Option
import typingsJapgolly.baseui.selectDropdownMod.default
import typingsJapgolly.baseui.selectTypesMod.DropdownProps
import typingsJapgolly.baseui.selectTypesMod.Size
import typingsJapgolly.baseui.selectTypesMod.Type
import typingsJapgolly.baseui.selectTypesMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dropdown {
  
  inline def apply(
    error: Boolean,
    getOptionLabel: Option => Node,
    isLoading: Boolean,
    labelKey: String,
    maxDropdownHeight: String,
    multi: Boolean,
    onItemSelect: /* a */ typingsJapgolly.baseui.anon.Item => Any,
    options: Value,
    required: Boolean,
    searchable: Boolean,
    size: Size,
    `type`: Type,
    value: Value,
    valueKey: String
  ): SharedBuilder_DropdownProps_1703030112[default] = {
    val __props = js.Dynamic.literal(error = error.asInstanceOf[js.Any], getOptionLabel = js.Any.fromFunction1(getOptionLabel), isLoading = isLoading.asInstanceOf[js.Any], labelKey = labelKey.asInstanceOf[js.Any], maxDropdownHeight = maxDropdownHeight.asInstanceOf[js.Any], multi = multi.asInstanceOf[js.Any], onItemSelect = js.Any.fromFunction1(onItemSelect), options = options.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], searchable = searchable.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueKey = valueKey.asInstanceOf[js.Any])
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new SharedBuilder_DropdownProps_1703030112[default](js.Array(this.component, __props.asInstanceOf[DropdownProps]))
  }
  
  @JSImport("baseui/select/dropdown", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: DropdownProps): SharedBuilder_DropdownProps_1703030112[default] = new SharedBuilder_DropdownProps_1703030112[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
