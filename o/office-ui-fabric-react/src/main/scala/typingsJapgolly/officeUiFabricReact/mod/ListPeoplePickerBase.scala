package typingsJapgolly.officeUiFabricReact.mod

import typingsJapgolly.officeUiFabricReact.anon.CreateGenericItem
import typingsJapgolly.officeUiFabricReact.libComponentsPickersPeoplePickerPeoplePickerMod.IPeoplePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "ListPeoplePickerBase")
@js.native
open class ListPeoplePickerBase protected ()
  extends typingsJapgolly.officeUiFabricReact.libPickersMod.ListPeoplePickerBase {
  def this(basePickerProps: IPeoplePickerProps) = this()
}
/* static members */
object ListPeoplePickerBase {
  
  @JSImport("office-ui-fabric-react", "ListPeoplePickerBase")
  @js.native
  val ^ : js.Any = js.native
  
  /** Default props for ListPeoplePicker. */
  @JSImport("office-ui-fabric-react", "ListPeoplePickerBase.defaultProps")
  @js.native
  def defaultProps: CreateGenericItem = js.native
  inline def defaultProps_=(x: CreateGenericItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
