package typingsJapgolly.antdMobile.components

import typingsJapgolly.antdMobile.esComponentsSkeletonSkeletonMod.SkeletonTitleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SkeletonTitle {
  
  @JSImport("antd-mobile/es/components/skeleton/skeleton", "SkeletonTitle")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: SkeletonTitle.type): SharedBuilder_SkeletonTitleProps_1963586210 = new SharedBuilder_SkeletonTitleProps_1963586210(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SkeletonTitleProps): SharedBuilder_SkeletonTitleProps_1963586210 = new SharedBuilder_SkeletonTitleProps_1963586210(js.Array(this.component, p.asInstanceOf[js.Any]))
}
