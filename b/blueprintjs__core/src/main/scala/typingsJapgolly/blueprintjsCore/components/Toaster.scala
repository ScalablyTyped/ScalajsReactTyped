package typingsJapgolly.blueprintjsCore.components

import typingsJapgolly.blueprintjsCore.libEsmComponentsToastToasterMod.IToasterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Toaster {
  
  @JSImport("@blueprintjs/core", "Toaster")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Toaster.type): SharedBuilder_IToasterProps1582994925[typingsJapgolly.blueprintjsCore.mod.Toaster] = new SharedBuilder_IToasterProps1582994925[typingsJapgolly.blueprintjsCore.mod.Toaster](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IToasterProps): SharedBuilder_IToasterProps1582994925[typingsJapgolly.blueprintjsCore.mod.Toaster] = new SharedBuilder_IToasterProps1582994925[typingsJapgolly.blueprintjsCore.mod.Toaster](js.Array(this.component, p.asInstanceOf[js.Any]))
}
