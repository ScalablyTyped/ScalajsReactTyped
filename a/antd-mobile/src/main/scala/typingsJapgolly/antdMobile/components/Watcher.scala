package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.rcFieldForm.esInterfaceMod.FormInstance
import typingsJapgolly.rcFieldForm.esInterfaceMod.NamePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Watcher {
  
  inline def apply(form: FormInstance[Any], namePath: NamePath, onChange: Callback): Default[js.Object] = {
    val __props = js.Dynamic.literal(form = form.asInstanceOf[js.Any], namePath = namePath.asInstanceOf[js.Any], onChange = onChange.toJsFn)
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[typingsJapgolly.antdMobile.anon.Form]))
  }
  
  @JSImport("antd-mobile/es/components/form/form-subscribe", "Watcher")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: typingsJapgolly.antdMobile.anon.Form): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
