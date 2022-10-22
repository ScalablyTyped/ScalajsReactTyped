package typingsJapgolly.rcSelect

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.rcSelect.anon.LabelOptions
import typingsJapgolly.rcSelect.libSelectMod.FieldNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksUseOptionsMod {
  
  @JSImport("rc-select/lib/hooks/useOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[OptionType](
    options: js.Array[OptionType],
    children: Node,
    fieldNames: FieldNames,
    optionFilterProp: String,
    optionLabelProp: String
  ): LabelOptions[OptionType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any], children.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any], optionFilterProp.asInstanceOf[js.Any], optionLabelProp.asInstanceOf[js.Any])).asInstanceOf[LabelOptions[OptionType]]
}
