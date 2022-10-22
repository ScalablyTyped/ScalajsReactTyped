package typingsJapgolly.reachTabs.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reachPolymorphic.anon.As
import typingsJapgolly.reachPolymorphic.mod.Merge
import typingsJapgolly.reachTabs.mod.TabListProps
import typingsJapgolly.reachTabs.reachTabsStrings.div
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabList {
  
  /* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsJapgolly.reachPolymorphic.mod.Merge[
  / * import warning: importer.ImportType#apply Failed type conversion: IntrinsicElementString extends react.react.ElementType<any> ? react.react.ComponentPropsWithRef<IntrinsicElementString> : never * / js.Any, 
  typingsJapgolly.reachTabs.mod.TabListProps & typingsJapgolly.reachPolymorphic.anon.As[typingsJapgolly.reachTabs.reachTabsStrings.div]] because: IArray(Could't extract props from typingsJapgolly.std.Omit[
  / * import warning: importer.ImportType#apply Failed type conversion: IntrinsicElementString extends react.react.ElementType<any> ? react.react.ComponentPropsWithRef<IntrinsicElementString> : never * / js.Any, 
  / * keyof P2 * / java.lang.String] because couldn't resolve ClassTree.) */
  object Type {
    
    def apply(
      p: Merge[
          /* import warning: importer.ImportType#apply Failed type conversion: IntrinsicElementString extends react.react.ElementType<any> ? react.react.ComponentPropsWithRef<IntrinsicElementString> : never */ js.Any, 
          TabListProps & As[div]
        ]
    ): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @JSImport("@reach/tabs", "TabList.type")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Type.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  }
  
  @JSImport("@reach/tabs", "TabList")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: TabList.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: div): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
