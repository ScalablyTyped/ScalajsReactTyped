package typingsJapgolly.reactSelect.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactSelect.distDeclarationsSrcAnimatedTransitionsMod.FadeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsJapgolly.reactSelect.distDeclarationsSrcAnimatedTransitionsMod.FadeProps[ComponentProps] because: IArray(Could't extract props from ComponentProps because couldn't resolve ClassTree.) */
object Fade {
  
  def apply[ComponentProps /* <: js.Object */](p: FadeProps[ComponentProps]): Builder[ComponentProps] = new Builder[ComponentProps](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-select/dist/declarations/src/animated/transitions", "Fade")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[ComponentProps /* <: js.Object */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object]
  
  implicit def make[ComponentProps /* <: js.Object */](companion: Fade.type): Builder[ComponentProps] = new Builder[ComponentProps](js.Array(this.component, js.Dictionary.empty))()
}
