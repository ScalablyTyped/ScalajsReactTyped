package typingsJapgolly.materialUi.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.materialUi.internalAutoLockScrollingMod.AutoLockScrollingProps
import typingsJapgolly.materialUi.internalAutoLockScrollingMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AutoLockScrolling {
  
  inline def apply(lock: Boolean): Default[default] = {
    val __props = js.Dynamic.literal(lock = lock.asInstanceOf[js.Any])
    new Default[default](js.Array(this.component, __props.asInstanceOf[AutoLockScrollingProps]))
  }
  
  @JSImport("material-ui/internal/AutoLockScrolling", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: AutoLockScrollingProps): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
