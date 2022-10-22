package typingsJapgolly.wixUiCore.distEsSrcMod

import typingsJapgolly.wixUiCore.anon.PartialOption
import typingsJapgolly.wixUiCore.distEsSrcComponentsAutocompleteAutocompleteMod.AutocompleteProps
import typingsJapgolly.wixUiCore.distEsSrcComponentsDropdownOptionOptionFactoryMod.Option
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-ui-core/dist/es/src", "Autocomplete")
@js.native
open class Autocomplete protected ()
  extends typingsJapgolly.wixUiCore.distEsSrcComponentsAutocompleteMod.Autocomplete {
  def this(props: AutocompleteProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: AutocompleteProps, context: Any) = this()
}
/* static members */
object Autocomplete {
  
  @JSImport("wix-ui-core/dist/es/src", "Autocomplete")
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDivider(): Option = ^.asInstanceOf[js.Dynamic].applyDynamic("createDivider")().asInstanceOf[Option]
  inline def createDivider(value: Any): Option = ^.asInstanceOf[js.Dynamic].applyDynamic("createDivider")(value.asInstanceOf[js.Any]).asInstanceOf[Option]
  
  inline def createOption(): Option = ^.asInstanceOf[js.Dynamic].applyDynamic("createOption")().asInstanceOf[Option]
  inline def createOption(option: PartialOption): Option = ^.asInstanceOf[js.Dynamic].applyDynamic("createOption")(option.asInstanceOf[js.Any]).asInstanceOf[Option]
  
  @JSImport("wix-ui-core/dist/es/src", "Autocomplete.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
