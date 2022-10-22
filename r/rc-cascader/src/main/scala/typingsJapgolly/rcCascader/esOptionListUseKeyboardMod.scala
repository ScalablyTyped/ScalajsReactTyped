package typingsJapgolly.rcCascader

import typingsJapgolly.rcCascader.esCascaderMod.DefaultOptionType
import typingsJapgolly.rcCascader.esCascaderMod.InternalFieldNames
import typingsJapgolly.rcCascader.esCascaderMod.SingleValueType
import typingsJapgolly.rcSelect.libOptionListMod.RefOptionListProps
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esOptionListUseKeyboardMod {
  
  @JSImport("rc-cascader/es/OptionList/useKeyboard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    ref: Ref[RefOptionListProps],
    options: js.Array[DefaultOptionType],
    fieldNames: InternalFieldNames,
    activeValueCells: js.Array[Key],
    setActiveValueCells: js.Function1[/* activeValueCells */ js.Array[Key], Unit],
    onKeyBoardSelect: js.Function2[/* valueCells */ SingleValueType, /* option */ DefaultOptionType, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fieldNames.asInstanceOf[js.Any], activeValueCells.asInstanceOf[js.Any], setActiveValueCells.asInstanceOf[js.Any], onKeyBoardSelect.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
