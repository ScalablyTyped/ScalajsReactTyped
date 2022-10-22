package typingsJapgolly.rcCascader

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.rcCascader.anon.Disabled
import typingsJapgolly.rcCascader.esCascaderMod.DefaultOptionType
import typingsJapgolly.rcCascader.esCascaderMod.InternalFieldNames
import typingsJapgolly.rcCascader.esCascaderMod.SingleValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseDisplayValuesMod {
  
  @JSImport("rc-cascader/es/hooks/useDisplayValues", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    rawValues: js.Array[SingleValueType],
    options: js.Array[DefaultOptionType],
    fieldNames: InternalFieldNames,
    multiple: Boolean,
    displayRender: js.UndefOr[
      js.Function2[/* label */ js.Array[String], js.UndefOr[js.Array[DefaultOptionType]], Node]
    ]
  ): js.Array[Disabled] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(rawValues.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any], multiple.asInstanceOf[js.Any], displayRender.asInstanceOf[js.Any])).asInstanceOf[js.Array[Disabled]]
}
