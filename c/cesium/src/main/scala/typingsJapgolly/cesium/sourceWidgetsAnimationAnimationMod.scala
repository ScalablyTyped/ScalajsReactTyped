package typingsJapgolly.cesium

import org.scalajs.dom.Element
import typingsJapgolly.cesium.mod.Animation
import typingsJapgolly.cesium.mod.AnimationViewModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceWidgetsAnimationAnimationMod {
  
  @JSImport("cesium/Source/Widgets/Animation/Animation", JSImport.Default)
  @js.native
  open class default protected () extends Animation {
    def this(container: String, viewModel: AnimationViewModel) = this()
    def this(container: Element, viewModel: AnimationViewModel) = this()
  }
}
