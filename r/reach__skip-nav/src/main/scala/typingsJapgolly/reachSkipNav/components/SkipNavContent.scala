package typingsJapgolly.reachSkipNav.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reachPolymorphic.anon.As
import typingsJapgolly.reachPolymorphic.mod.Merge
import typingsJapgolly.reachSkipNav.mod.SkipNavContentProps
import typingsJapgolly.reachSkipNav.reachSkipNavStrings.div
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsJapgolly.reachPolymorphic.mod.Merge[
/ * import warning: importer.ImportType#apply Failed type conversion: IntrinsicElementString extends react.react.ElementType<any> ? react.react.ComponentPropsWithRef<IntrinsicElementString> : never * / js.Any, 
typingsJapgolly.reachSkipNav.mod.SkipNavContentProps & typingsJapgolly.reachPolymorphic.anon.As[typingsJapgolly.reachSkipNav.reachSkipNavStrings.div]] because: IArray(Could't extract props from typingsJapgolly.std.Omit[
/ * import warning: importer.ImportType#apply Failed type conversion: IntrinsicElementString extends react.react.ElementType<any> ? react.react.ComponentPropsWithRef<IntrinsicElementString> : never * / js.Any, 
/ * keyof P2 * / java.lang.String] because couldn't resolve ClassTree.) */
object SkipNavContent {
  
  def apply(
    p: Merge[
      /* import warning: importer.ImportType#apply Failed type conversion: IntrinsicElementString extends react.react.ElementType<any> ? react.react.ComponentPropsWithRef<IntrinsicElementString> : never */ js.Any, 
      SkipNavContentProps & As[div]
    ]
  ): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("@reach/skip-nav", "SkipNavContent")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: SkipNavContent.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
}
