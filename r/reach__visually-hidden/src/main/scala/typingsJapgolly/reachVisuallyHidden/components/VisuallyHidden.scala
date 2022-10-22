package typingsJapgolly.reachVisuallyHidden.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reachPolymorphic.anon.As
import typingsJapgolly.reachPolymorphic.mod.Merge
import typingsJapgolly.reachVisuallyHidden.mod.VisuallyHiddenProps
import typingsJapgolly.reachVisuallyHidden.reachVisuallyHiddenStrings.span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsJapgolly.reachPolymorphic.mod.Merge[
/ * import warning: importer.ImportType#apply Failed type conversion: IntrinsicElementString extends react.react.ElementType<any> ? react.react.ComponentPropsWithRef<IntrinsicElementString> : never * / js.Any, 
typingsJapgolly.reachVisuallyHidden.mod.VisuallyHiddenProps & typingsJapgolly.reachPolymorphic.anon.As[typingsJapgolly.reachVisuallyHidden.reachVisuallyHiddenStrings.span]] because: IArray(Could't extract props from typingsJapgolly.std.Omit[
/ * import warning: importer.ImportType#apply Failed type conversion: IntrinsicElementString extends react.react.ElementType<any> ? react.react.ComponentPropsWithRef<IntrinsicElementString> : never * / js.Any, 
/ * keyof P2 * / java.lang.String] because couldn't resolve ClassTree.) */
object VisuallyHidden {
  
  def apply(
    p: Merge[
      /* import warning: importer.ImportType#apply Failed type conversion: IntrinsicElementString extends react.react.ElementType<any> ? react.react.ComponentPropsWithRef<IntrinsicElementString> : never */ js.Any, 
      VisuallyHiddenProps & As[span]
    ]
  ): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("@reach/visually-hidden", "VisuallyHidden")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: VisuallyHidden.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
}
