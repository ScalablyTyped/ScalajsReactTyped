package typingsJapgolly.officeUiFabricReact.mod

import typingsJapgolly.officeUiFabricReact.anon.Items
import typingsJapgolly.officeUiFabricReact.libComponentsPickersBasePickerDottypesMod.IBasePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react", "BasePicker")
@js.native
open class BasePicker[T, P /* <: IBasePickerProps[T] */] protected ()
  extends typingsJapgolly.officeUiFabricReact.libPickersMod.BasePicker[T, P] {
  def this(basePickerProps: P) = this()
}
/* static members */
object BasePicker {
  
  @JSImport("office-ui-fabric-react", "BasePicker")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDerivedStateFromProps(newProps: IBasePickerProps[Any]): Items | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(newProps.asInstanceOf[js.Any]).asInstanceOf[Items | Null]
}
