package typingsJapgolly.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transitionMod {
  type IonicAnimationInterface = js.Function2[
    /* navEl */ org.scalajs.dom.raw.HTMLElement, 
    /* opts */ typingsJapgolly.ionicCore.transitionMod.TransitionOptions, 
    typingsJapgolly.ionicCore.animationInterfaceMod.Animation | js.Promise[typingsJapgolly.ionicCore.animationInterfaceMod.Animation]
  ]
}
