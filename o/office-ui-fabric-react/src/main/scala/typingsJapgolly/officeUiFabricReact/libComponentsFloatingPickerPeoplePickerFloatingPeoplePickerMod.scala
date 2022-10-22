package typingsJapgolly.officeUiFabricReact

import typingsJapgolly.officeUiFabricReact.libComponentsFloatingPickerBaseFloatingPickerDottypesMod.IBaseFloatingPickerProps
import typingsJapgolly.officeUiFabricReact.libComponentsFloatingPickerBaseFloatingPickerMod.BaseFloatingPicker
import typingsJapgolly.officeUiFabricReact.libComponentsPersonaPersonaDottypesMod.IPersonaProps
import typingsJapgolly.officeUiFabricReact.libComponentsPickersSuggestionsSuggestionsDottypesMod.ISuggestionModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsFloatingPickerPeoplePickerFloatingPeoplePickerMod {
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker/PeoplePicker/FloatingPeoplePicker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker/PeoplePicker/FloatingPeoplePicker", "BaseFloatingPeoplePicker")
  @js.native
  open class BaseFloatingPeoplePicker protected () extends BaseFloatingPicker[IPersonaProps, IPeopleFloatingPickerProps] {
    def this(basePickerProps: IPeopleFloatingPickerProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/FloatingPicker/PeoplePicker/FloatingPeoplePicker", "FloatingPeoplePicker")
  @js.native
  open class FloatingPeoplePicker protected () extends BaseFloatingPeoplePicker {
    def this(basePickerProps: IPeopleFloatingPickerProps) = this()
  }
  /* static members */
  object FloatingPeoplePicker {
    
    @JSImport("office-ui-fabric-react/lib/components/FloatingPicker/PeoplePicker/FloatingPeoplePicker", "FloatingPeoplePicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/FloatingPicker/PeoplePicker/FloatingPeoplePicker", "FloatingPeoplePicker.defaultProps")
    @js.native
    def defaultProps: Any = js.native
    inline def defaultProps_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  inline def createItem(name: String, isValid: Boolean): ISuggestionModel[IPersonaProps] = (^.asInstanceOf[js.Dynamic].applyDynamic("createItem")(name.asInstanceOf[js.Any], isValid.asInstanceOf[js.Any])).asInstanceOf[ISuggestionModel[IPersonaProps]]
  
  type IPeopleFloatingPickerProps = IBaseFloatingPickerProps[IPersonaProps]
}
