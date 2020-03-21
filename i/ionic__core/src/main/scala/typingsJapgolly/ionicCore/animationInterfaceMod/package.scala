package typingsJapgolly.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object animationInterfaceMod {
  type AnimationKeyFrames = js.Array[typingsJapgolly.ionicCore.animationInterfaceMod.AnimationKeyFrame]
  type AnimationLifecycle = js.Function2[
    /* currentStep */ typingsJapgolly.ionicCore.ionicCoreNumbers.`0` | typingsJapgolly.ionicCore.ionicCoreNumbers.`1`, 
    /* animation */ typingsJapgolly.ionicCore.animationInterfaceMod.Animation, 
    scala.Unit
  ]
  type AnimationStyles = typingsJapgolly.std.Record[java.lang.String, js.Any]
}
