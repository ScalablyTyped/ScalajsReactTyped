package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.materialUiCore.listItemTextListItemTextMod.ListItemTextProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemTextMod {
  
  @JSImport("@material-ui/core/ListItemText", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[PrimaryTypographyComponent /* <: ElementType */, SecondaryTypographyComponent /* <: ElementType */](props: ListItemTextProps[PrimaryTypographyComponent, SecondaryTypographyComponent]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
