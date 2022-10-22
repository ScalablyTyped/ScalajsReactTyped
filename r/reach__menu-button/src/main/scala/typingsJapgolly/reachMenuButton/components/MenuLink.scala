package typingsJapgolly.reachMenuButton.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reachMenuButton.mod.MenuLinkProps
import typingsJapgolly.reachMenuButton.reachMenuButtonStrings.a
import typingsJapgolly.reachPolymorphic.anon.As
import typingsJapgolly.reachPolymorphic.mod.Merge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsJapgolly.reachPolymorphic.mod.Merge[
/ * import warning: importer.ImportType#apply Failed type conversion: IntrinsicElementString extends react.react.ElementType<any> ? react.react.ComponentPropsWithRef<IntrinsicElementString> : never * / js.Any, 
typingsJapgolly.reachMenuButton.mod.MenuLinkProps & typingsJapgolly.reachPolymorphic.anon.As[typingsJapgolly.reachMenuButton.reachMenuButtonStrings.a]] because: IArray(Could't extract props from typingsJapgolly.std.Omit[
/ * import warning: importer.ImportType#apply Failed type conversion: IntrinsicElementString extends react.react.ElementType<any> ? react.react.ComponentPropsWithRef<IntrinsicElementString> : never * / js.Any, 
/ * keyof P2 * / java.lang.String] because couldn't resolve ClassTree.) */
object MenuLink {
  
  def apply(
    p: Merge[
      /* import warning: importer.ImportType#apply Failed type conversion: IntrinsicElementString extends react.react.ElementType<any> ? react.react.ComponentPropsWithRef<IntrinsicElementString> : never */ js.Any, 
      MenuLinkProps & As[a]
    ]
  ): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: MenuLink.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
}
