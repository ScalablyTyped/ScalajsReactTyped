package typingsJapgolly.reactSpringCore

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.react.mod.ReactFragment
import typingsJapgolly.reactSpringCore.anon.Items
import typingsJapgolly.reactSpringCore.distDeclarationsSrcHooksUseSpringMod.UseSpringProps
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesCommonMod.Valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcComponentsTrailMod {
  
  @JSImport("@react-spring/core/dist/declarations/src/components/Trail", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Trail[Item, Props /* <: TrailComponentProps[Item, Any] */](hasItemsChildrenProps: Props & (Valid[Props, TrailComponentProps[Item, Props]])): js.Array[js.UndefOr[String | Double | Boolean | Element | ReactFragment | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Trail")(hasItemsChildrenProps.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.UndefOr[String | Double | Boolean | Element | ReactFragment | Null]]]
  
  type TrailComponentProps[Item, Props /* <: js.Object */] = Any & UseSpringProps[Props] & (Items[Item, Props])
}
