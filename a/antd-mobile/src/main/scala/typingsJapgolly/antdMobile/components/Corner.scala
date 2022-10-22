package typingsJapgolly.antdMobile.components

import typingsJapgolly.antdMobile.esUtilsNativePropsMod.NativeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Corner {
  
  @JSImport("antd-mobile/es/components/side-bar/corner", "Corner")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Corner.type): SharedBuilder_NativeProps_2075513324 = new SharedBuilder_NativeProps_2075513324(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NativeProps[scala.Nothing]): SharedBuilder_NativeProps_2075513324 = new SharedBuilder_NativeProps_2075513324(js.Array(this.component, p.asInstanceOf[js.Any]))
}
