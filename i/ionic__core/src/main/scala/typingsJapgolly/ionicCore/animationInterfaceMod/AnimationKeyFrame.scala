package typingsJapgolly.ionicCore.animationInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in string ]: any} */ trait AnimationKeyFrame extends js.Object {
  var offset: Double
}

object AnimationKeyFrame {
  @scala.inline
  def apply(offset: Double): AnimationKeyFrame = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnimationKeyFrame]
  }
}

