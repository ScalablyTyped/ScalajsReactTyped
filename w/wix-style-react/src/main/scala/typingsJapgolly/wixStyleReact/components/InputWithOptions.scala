package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesInputWithOptionsMod.InputWithOptionsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from T because couldn't resolve ClassTree. */
object InputWithOptions {
  
  def apply[ManualInputFn, OnSelectFn, T /* <: InputWithOptionsProps[ManualInputFn, OnSelectFn] */](p: T): Builder[ManualInputFn, OnSelectFn, T] = new Builder[ManualInputFn, OnSelectFn, T](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("wix-style-react", "InputWithOptions")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[ManualInputFn, OnSelectFn, T /* <: InputWithOptionsProps[ManualInputFn, OnSelectFn] */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.InputWithOptions[ManualInputFn, OnSelectFn, T]]
  
  implicit def make[ManualInputFn, OnSelectFn, T /* <: InputWithOptionsProps[ManualInputFn, OnSelectFn] */](companion: InputWithOptions.type): Builder[ManualInputFn, OnSelectFn, T] = new Builder[ManualInputFn, OnSelectFn, T](js.Array(this.component, js.Dictionary.empty))()
}
