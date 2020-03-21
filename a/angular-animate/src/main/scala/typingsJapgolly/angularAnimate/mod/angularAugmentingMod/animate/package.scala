package typingsJapgolly.angularAnimate.mod.angularAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object animate {
  /**
    * AnimateCssService
    * see http://docs.angularjs.org/api/ngAnimate/service/$animateCss
    */
  type IAnimateCssService = js.Function2[
    /* element */ typingsJapgolly.angular.JQuery, 
    /* animateCssOptions */ typingsJapgolly.angularAnimate.mod.angularAugmentingMod.animate.IAnimationOptions, 
    typingsJapgolly.angularAnimate.mod.angularAugmentingMod.animate.IAnimateCssRunner
  ]
  type IAnimateFactory = js.Function1[
    /* repeated */ js.Any, 
    typingsJapgolly.angularAnimate.mod.angularAugmentingMod.animate.IAnimateCallbackObject
  ]
  type IAnimationPromise = typingsJapgolly.angular.mod.IPromise[scala.Unit]
}
