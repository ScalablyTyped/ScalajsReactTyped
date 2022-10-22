package typingsJapgolly.antd.components

import typingsJapgolly.antd.libSelectMod.SelectProps
import typingsJapgolly.rcSelect.libSelectMod.DefaultOptionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MiddleSelect {
  
  @JSImport("antd/lib/pagination/Select", "MiddleSelect")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: MiddleSelect.type): SharedBuilder_SelectProps144951122 = new SharedBuilder_SelectProps144951122(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SelectProps[Any, DefaultOptionType]): SharedBuilder_SelectProps144951122 = new SharedBuilder_SelectProps144951122(js.Array(this.component, p.asInstanceOf[js.Any]))
}
