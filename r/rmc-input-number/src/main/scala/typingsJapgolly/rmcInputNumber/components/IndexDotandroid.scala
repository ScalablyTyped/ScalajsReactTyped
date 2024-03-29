package typingsJapgolly.rmcInputNumber.components

import typingsJapgolly.rmcInputNumber.libIndexDotandroidMod.default
import typingsJapgolly.rmcInputNumber.libIndexDotiosMod.PropsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IndexDotandroid {
  
  @JSImport("rmc-input-number/lib/index.android", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: IndexDotandroid.type): SharedBuilder_PropsType_226546061[default] = new SharedBuilder_PropsType_226546061[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsType): SharedBuilder_PropsType_226546061[default] = new SharedBuilder_PropsType_226546061[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
