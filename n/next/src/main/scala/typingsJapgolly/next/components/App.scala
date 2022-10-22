package typingsJapgolly.next.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.next.appMod.default
import typingsJapgolly.next.distPagesAppMod.AppProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for P & typingsJapgolly.next.distPagesAppMod.AppProps[CP] because: IArray(Could't extract props from P because couldn't resolve ClassTree.) */
object App {
  
  def apply[P, CP, S](p: P & AppProps[CP]): Builder[P, CP, S] = new Builder[P, CP, S](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("next/app", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[P, CP, S] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default[P, CP, S]]
  
  implicit def make[P, CP, S](companion: App.type): Builder[P, CP, S] = new Builder[P, CP, S](js.Array(this.component, js.Dictionary.empty))()
}
