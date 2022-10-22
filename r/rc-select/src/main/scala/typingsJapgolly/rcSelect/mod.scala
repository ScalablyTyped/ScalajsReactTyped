package typingsJapgolly.rcSelect

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.rcSelect.anon.Children
import typingsJapgolly.rcSelect.libBaseSelectMod.BaseSelectProps
import typingsJapgolly.rcSelect.libBaseSelectMod.BaseSelectRef
import typingsJapgolly.rcSelect.libHooksUseBasePropsMod.BaseSelectContextProps
import typingsJapgolly.rcSelect.libOptGroupMod.OptionGroupFC
import typingsJapgolly.rcSelect.libOptionMod.OptionFC
import typingsJapgolly.rcSelect.libSelectMod.DefaultOptionType
import typingsJapgolly.rcSelect.libSelectMod.SelectProps
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-select", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-select", JSImport.Default)
  @js.native
  val default: (js.Function1[/* props */ Children & (SelectProps[Any, DefaultOptionType]), Element]) & typingsJapgolly.rcSelect.anon.OptGroup = js.native
  
  @JSImport("rc-select", "BaseSelect")
  @js.native
  val BaseSelect: ForwardRefExoticComponent[BaseSelectProps & RefAttributes[BaseSelectRef]] = js.native
  
  /** This is a placeholder, not real render in dom */
  @JSImport("rc-select", "OptGroup")
  @js.native
  val OptGroup: OptionGroupFC = js.native
  
  /** This is a placeholder, not real render in dom */
  @JSImport("rc-select", "Option")
  @js.native
  val Option: OptionFC = js.native
  
  inline def useBaseProps(): BaseSelectContextProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useBaseProps")().asInstanceOf[BaseSelectContextProps]
}
