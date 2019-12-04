package typingsJapgolly.atAngularAnimations

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atAngularAnimations.atAngularAnimationsMod.AnimationMetadata
import typingsJapgolly.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/animations/browser", JSImport.Namespace)
@js.native
object browserMod extends js.Object {
  /**
    * @publicApi
    */
  @js.native
  abstract class AnimationDriver ()
    extends typingsJapgolly.atAngularAnimations.browserBrowserMod.AnimationDriver
  
  @js.native
  class ɵAnimation protected ()
    extends typingsJapgolly.atAngularAnimations.browserBrowserMod.ɵAnimation {
    def this(
      _driver: typingsJapgolly.atAngularAnimations.browserBrowserMod.AnimationDriver,
      input: js.Array[AnimationMetadata]
    ) = this()
    def this(
      _driver: typingsJapgolly.atAngularAnimations.browserBrowserMod.AnimationDriver,
      input: AnimationMetadata
    ) = this()
  }
  
  /**
    * @publicApi
    */
  @js.native
  abstract class ɵAnimationDriver ()
    extends typingsJapgolly.atAngularAnimations.browserBrowserMod.ɵAnimationDriver
  
  @js.native
  class ɵAnimationEngine protected ()
    extends typingsJapgolly.atAngularAnimations.browserBrowserMod.ɵAnimationEngine {
    def this(
      bodyNode: js.Any,
      _driver: typingsJapgolly.atAngularAnimations.browserBrowserMod.AnimationDriver,
      normalizer: typingsJapgolly.atAngularAnimations.browserBrowserMod.ɵAnimationStyleNormalizer
    ) = this()
  }
  
  @js.native
  abstract class ɵAnimationStyleNormalizer ()
    extends typingsJapgolly.atAngularAnimations.browserBrowserMod.ɵAnimationStyleNormalizer
  
  @js.native
  class ɵCssKeyframesDriver ()
    extends typingsJapgolly.atAngularAnimations.browserBrowserMod.ɵCssKeyframesDriver
  
  @js.native
  class ɵCssKeyframesPlayer protected ()
    extends typingsJapgolly.atAngularAnimations.browserBrowserMod.ɵCssKeyframesPlayer {
    def this(
      element: js.Any,
      keyframes: js.Array[StringDictionary[String | Double]],
      animationName: String,
      _duration: Double,
      _delay: Double,
      easing: String,
      _finalStyles: StringDictionary[js.Any]
    ) = this()
    def this(
      element: js.Any,
      keyframes: js.Array[StringDictionary[String | Double]],
      animationName: String,
      _duration: Double,
      _delay: Double,
      easing: String,
      _finalStyles: StringDictionary[js.Any],
      _specialStyles: typingsJapgolly.atAngularAnimations.browserBrowserMod.ɵangular_packages_animations_browser_browser_a
    ) = this()
  }
  
  @js.native
  class ɵNoopAnimationDriver ()
    extends typingsJapgolly.atAngularAnimations.browserBrowserMod.ɵNoopAnimationDriver
  
  @js.native
  class ɵNoopAnimationStyleNormalizer ()
    extends typingsJapgolly.atAngularAnimations.browserBrowserMod.ɵNoopAnimationStyleNormalizer
  
  @js.native
  class ɵWebAnimationsDriver ()
    extends typingsJapgolly.atAngularAnimations.browserBrowserMod.ɵWebAnimationsDriver
  
  @js.native
  class ɵWebAnimationsPlayer protected ()
    extends typingsJapgolly.atAngularAnimations.browserBrowserMod.ɵWebAnimationsPlayer {
    def this(
      element: js.Any,
      keyframes: js.Array[StringDictionary[String | Double]],
      options: StringDictionary[String | Double]
    ) = this()
    def this(
      element: js.Any,
      keyframes: js.Array[StringDictionary[String | Double]],
      options: StringDictionary[String | Double],
      _specialStyles: typingsJapgolly.atAngularAnimations.browserBrowserMod.ɵangular_packages_animations_browser_browser_a
    ) = this()
  }
  
  @js.native
  class ɵWebAnimationsStyleNormalizer ()
    extends typingsJapgolly.atAngularAnimations.browserBrowserMod.ɵWebAnimationsStyleNormalizer
  
  @js.native
  class ɵangular_packages_animations_browser_browser_a protected ()
    extends typingsJapgolly.atAngularAnimations.browserBrowserMod.ɵangular_packages_animations_browser_browser_a {
    def this(_element: js.Any) = this()
    def this(_element: js.Any, _startStyles: StringDictionary[js.Any]) = this()
    def this(_element: js.Any, _startStyles: StringDictionary[js.Any], _endStyles: StringDictionary[js.Any]) = this()
    def this(_element: js.Any, _startStyles: Null, _endStyles: StringDictionary[js.Any]) = this()
  }
  
  def ɵallowPreviousPlayerStylesMerge(duration: Double, delay: Double): Boolean = js.native
  def ɵcontainsElement(elm1: js.Any, elm2: js.Any): Boolean = js.native
  def ɵinvokeQuery(element: js.Any, selector: String, multi: Boolean): js.Array[_] = js.native
  def ɵmatchesElement(element: js.Any, selector: String): Boolean = js.native
  def ɵsupportsWebAnimations(): Boolean = js.native
  def ɵvalidateStyleProperty(prop: String): Boolean = js.native
  /* static members */
  @js.native
  object AnimationDriver extends js.Object {
    var NOOP: typingsJapgolly.atAngularAnimations.browserBrowserMod.AnimationDriver = js.native
  }
  
  /* static members */
  @js.native
  object ɵAnimationDriver extends js.Object {
    var NOOP: typingsJapgolly.atAngularAnimations.browserBrowserMod.AnimationDriver = js.native
  }
  
  /* static members */
  @js.native
  object ɵangular_packages_animations_browser_browser_a extends js.Object {
    var initialStylesByElement: WeakMap[_, StringDictionary[_]] = js.native
  }
  
}

