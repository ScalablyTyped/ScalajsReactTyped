package typingsJapgolly.materialUi.global.MaterialUI

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.materialUi.MaterialUI.List.ListItemProps
import typingsJapgolly.materialUi.MaterialUI.List.ListProps
import typingsJapgolly.materialUi.MaterialUI.List.SelectableProps
import typingsJapgolly.materialUi.materialUiStrings.onChange
import typingsJapgolly.react.mod.Component
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object List {
  
  @JSGlobal("__MaterialUI.List")
  @js.native
  val ^ : js.Any = js.native
  @JSGlobal("__MaterialUI.List.List")
  @js.native
  open class List ()
    extends Component[ListProps, js.Object, Any]
  
  @JSGlobal("__MaterialUI.List.ListItem")
  @js.native
  open class ListItem ()
    extends Component[ListItemProps, js.Object, Any]
  
  inline def makeSelectable[P /* <: js.Object */](component: ComponentClassP[P & js.Object]): ComponentClassP[(Omit[P, onChange]) & SelectableProps & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSelectable")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[(Omit[P, onChange]) & SelectableProps & js.Object]]
}
