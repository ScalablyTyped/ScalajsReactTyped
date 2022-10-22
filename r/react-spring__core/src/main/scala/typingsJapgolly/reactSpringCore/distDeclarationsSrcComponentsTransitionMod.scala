package typingsJapgolly.reactSpringCore

import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesCommonMod.Valid
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesTransitionMod.TransitionComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcComponentsTransitionMod {
  
  @JSImport("@react-spring/core/dist/declarations/src/components/Transition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Transition[Item /* <: Any */, Props /* <: TransitionComponentProps[Item, Any] */](
    props: (Props & (Valid[Props, TransitionComponentProps[Item, Props]])) | (TransitionComponentProps[Item, Any])
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Transition")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
