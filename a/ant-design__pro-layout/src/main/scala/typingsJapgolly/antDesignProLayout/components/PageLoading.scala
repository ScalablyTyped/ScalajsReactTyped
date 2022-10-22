package typingsJapgolly.antDesignProLayout.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.antd.libSpinMod.SpinProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Couldn't find props for typingsJapgolly.antd.libSpinMod.SpinProps & scala.Any because: IArray(Could't extract props from scala.Any because couldn't resolve ClassTree.) */
object PageLoading {
  
  def apply(p: SpinProps & Any): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("@ant-design/pro-layout", "PageLoading")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: PageLoading.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
}
