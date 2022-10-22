package typingsJapgolly.antd.components

import typingsJapgolly.antd.libFormContextMod.FormProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormProvider {
  
  @JSImport("antd/lib/form/context", "FormProvider")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: FormProvider.type): SharedBuilder_FormProviderProps1136047338 = new SharedBuilder_FormProviderProps1136047338(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FormProviderProps): SharedBuilder_FormProviderProps1136047338 = new SharedBuilder_FormProviderProps1136047338(js.Array(this.component, p.asInstanceOf[js.Any]))
}
