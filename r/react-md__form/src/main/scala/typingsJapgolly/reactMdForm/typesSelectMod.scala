package typingsJapgolly.reactMdForm

import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLLIElement
import org.scalajs.dom.HTMLSelectElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdForm.typesSelectListboxMod.ListboxProps
import typingsJapgolly.reactMdForm.typesSelectNativeSelectMod.NativeSelectProps
import typingsJapgolly.reactMdForm.typesSelectOptionMod.OptionProps
import typingsJapgolly.reactMdForm.typesSelectSelectMod.SelectProps
import typingsJapgolly.reactMdForm.typesSelectUtilsMod.ListboxOption
import typingsJapgolly.reactMdList.typesListMod.ListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSelectMod {
  
  @JSImport("@react-md/form/types/select", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DEFAULT_GET_DISPLAY_LABEL(option: ListboxOption, labelKey: String, includeLeft: Boolean): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_GET_DISPLAY_LABEL")(option.asInstanceOf[js.Any], labelKey.asInstanceOf[js.Any], includeLeft.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  inline def DEFAULT_GET_OPTION_ID(baseId: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_GET_OPTION_ID")(baseId.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def DEFAULT_GET_OPTION_LABEL(option: ListboxOption, labelKey: String): Node = (^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_GET_OPTION_LABEL")(option.asInstanceOf[js.Any], labelKey.asInstanceOf[js.Any])).asInstanceOf[Node]
  
  @JSImport("@react-md/form/types/select", "Listbox")
  @js.native
  val Listbox: ForwardRefExoticComponent[ListboxProps & RefAttributes[ListElement]] = js.native
  
  @JSImport("@react-md/form/types/select", "NativeSelect")
  @js.native
  val NativeSelect: ForwardRefExoticComponent[NativeSelectProps & RefAttributes[HTMLSelectElement]] = js.native
  
  @JSImport("@react-md/form/types/select", "Option")
  @js.native
  val Option: ForwardRefExoticComponent[OptionProps & RefAttributes[HTMLLIElement]] = js.native
  
  @JSImport("@react-md/form/types/select", "Select")
  @js.native
  val Select: ForwardRefExoticComponent[SelectProps & RefAttributes[HTMLDivElement]] = js.native
  
  inline def isListboxOptionProps(option: ListboxOption): /* is @react-md/form.@react-md/form/types/select/utils.ListboxOptionProps */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isListboxOptionProps")(option.asInstanceOf[js.Any]).asInstanceOf[/* is @react-md/form.@react-md/form/types/select/utils.ListboxOptionProps */ Boolean]
}
