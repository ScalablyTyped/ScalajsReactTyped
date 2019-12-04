package typingsJapgolly.atAngularAnimations

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atAngularAnimations.atAngularAnimationsMod.AnimationPlayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/animations/browser/testing", JSImport.Namespace)
@js.native
object browserTestingMod extends js.Object {
  @js.native
  class MockAnimationDriver ()
    extends typingsJapgolly.atAngularAnimations.browserTestingTestingMod.MockAnimationDriver
  
  @js.native
  class MockAnimationPlayer protected ()
    extends typingsJapgolly.atAngularAnimations.browserTestingTestingMod.MockAnimationPlayer {
    def this(
      element: js.Any,
      keyframes: js.Array[StringDictionary[String | Double]],
      duration: Double,
      delay: Double,
      easing: String,
      previousPlayers: js.Array[_]
    ) = this()
  }
  
  /* static members */
  @js.native
  object MockAnimationDriver extends js.Object {
    var log: js.Array[AnimationPlayer] = js.native
  }
  
}

