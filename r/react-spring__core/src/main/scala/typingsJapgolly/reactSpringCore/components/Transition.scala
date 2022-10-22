package typingsJapgolly.reactSpringCore.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesCommonMod.Valid
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesTransitionMod.TransitionComponentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for Props & js.Object & (/ * import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]: T[P]} * / js.Any) because: IArray(Could't extract props from Props because couldn't resolve ClassTree.), Couldn't find props for scala.Any & typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesTransitionMod.UseTransitionProps[Item] & (typingsJapgolly.reactSpringCore.anon.ChildrenItems[Item, scala.Any]) because: IArray(Could't extract props from scala.Any because couldn't resolve ClassTree.) */
object Transition {
  
  def apply[Item /* <: Any */, Props /* <: TransitionComponentProps[Item, Any] */](
    p: (Props & (Valid[Props, TransitionComponentProps[Item, Props]])) | (TransitionComponentProps[Item, Any])
  ): Builder[Item, Props] = new Builder[Item, Props](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("@react-spring/core/dist/declarations/src", "Transition")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[Item /* <: Any */, Props /* <: TransitionComponentProps[Item, Any] */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object]
  
  implicit def make[Item /* <: Any */, Props /* <: TransitionComponentProps[Item, Any] */](companion: Transition.type): Builder[Item, Props] = new Builder[Item, Props](js.Array(this.component, js.Dictionary.empty))()
}
