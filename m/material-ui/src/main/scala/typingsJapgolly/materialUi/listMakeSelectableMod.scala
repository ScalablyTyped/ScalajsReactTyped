package typingsJapgolly.materialUi

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.materialUi.MaterialUI.List.SelectableProps
import typingsJapgolly.materialUi.materialUiStrings.onChange
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMakeSelectableMod {
  
  @JSImport("material-ui/List/makeSelectable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P /* <: js.Object */](component: ComponentClassP[P & js.Object]): ComponentClassP[(Omit[P, onChange]) & SelectableProps & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[(Omit[P, onChange]) & SelectableProps & js.Object]]
  
  inline def makeSelectable[P /* <: js.Object */](component: ComponentClassP[P & js.Object]): ComponentClassP[(Omit[P, onChange]) & SelectableProps & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSelectable")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[(Omit[P, onChange]) & SelectableProps & js.Object]]
}
