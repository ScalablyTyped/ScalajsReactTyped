package typingsJapgolly.reactSpringCore

import typingsJapgolly.react.mod.ReactFragment
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactSpringCore.anon.To
import typingsJapgolly.reactSpringCore.anon.ToState
import typingsJapgolly.reactSpringCore.distDeclarationsSrcComponentsSpringMod.SpringComponentProps
import typingsJapgolly.reactSpringCore.distDeclarationsSrcComponentsTrailMod.TrailComponentProps
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesCommonMod.Valid
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesTransitionMod.TransitionComponentProps
import typingsJapgolly.reactSpringCore.reactSpringCoreStrings.from
import typingsJapgolly.reactSpringCore.reactSpringCoreStrings.to
import typingsJapgolly.reactSpringTypes.utilMod.NoInfer
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcComponentsMod {
  
  @JSImport("@react-spring/core/dist/declarations/src/components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Spring[State /* <: js.Object */](props: To[State] & (Omit[SpringComponentProps[NoInfer[State]], from | to])): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Spring")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  inline def Spring_to[State /* <: js.Object */](props: ToState[State] & (Omit[SpringComponentProps[NoInfer[State]], to])): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("Spring")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  inline def Trail[Item, Props /* <: TrailComponentProps[Item, Any] */](hasItemsChildrenProps: Props & (Valid[Props, TrailComponentProps[Item, Props]])): js.Array[
    js.UndefOr[
      String | Double | Boolean | japgolly.scalajs.react.facade.React.Element | ReactFragment | Null
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("Trail")(hasItemsChildrenProps.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    js.UndefOr[
      String | Double | Boolean | japgolly.scalajs.react.facade.React.Element | ReactFragment | Null
    ]
  ]]
  
  inline def Transition[Item /* <: Any */, Props /* <: TransitionComponentProps[Item, Any] */](
    props: (Props & (Valid[Props, TransitionComponentProps[Item, Props]])) | (TransitionComponentProps[Item, Any])
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Transition")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
