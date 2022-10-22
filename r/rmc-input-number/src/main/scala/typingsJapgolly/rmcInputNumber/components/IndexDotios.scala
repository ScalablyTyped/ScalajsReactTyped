package typingsJapgolly.rmcInputNumber.components

import typingsJapgolly.rmcInputNumber.libIndexDotiosMod.PropsType
import typingsJapgolly.rmcInputNumber.libIndexDotiosMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IndexDotios {
  
  @JSImport("rmc-input-number/lib/index.ios", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: IndexDotios.type): SharedBuilder_PropsType_226546061[default] = new SharedBuilder_PropsType_226546061[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsType): SharedBuilder_PropsType_226546061[default] = new SharedBuilder_PropsType_226546061[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
