package typingsJapgolly.antd.components

import typingsJapgolly.antd.libInputSearchMod.SearchProps
import typingsJapgolly.rcInput.esInterfaceMod.InputRef
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Search {
  
  @JSImport("antd/lib/input/Search", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Search.type): SharedBuilder_SearchPropsRefAttributes_1645173871[InputRef] = new SharedBuilder_SearchPropsRefAttributes_1645173871[InputRef](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SearchProps & RefAttributes[InputRef]): SharedBuilder_SearchPropsRefAttributes_1645173871[InputRef] = new SharedBuilder_SearchPropsRefAttributes_1645173871[InputRef](js.Array(this.component, p.asInstanceOf[js.Any]))
}
