package typingsJapgolly.reactNativeSvg.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNativeSvg.libTypescriptReactNativeSVGDotwebMod.BaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from P because couldn't resolve ClassTree. */
object WebShape {
  
  def apply[P /* <: BaseProps */, C](p: P): Builder[P, C] = new Builder[P, C](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-native-svg/lib/typescript/ReactNativeSVG.web", "WebShape")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[P /* <: BaseProps */, C] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[
          typingsJapgolly.reactNativeSvg.libTypescriptReactNativeSVGDotwebMod.WebShape[P, C]
        ]
  
  implicit def make[P /* <: BaseProps */, C](companion: WebShape.type): Builder[P, C] = new Builder[P, C](js.Array(this.component, js.Dictionary.empty))()
}
