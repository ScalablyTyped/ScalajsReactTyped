package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTransitionTransitionDotuniDotdriverMod {
  
  trait TransitionUniDriver
    extends StObject
       with BaseUniDriver {
    
    def hasAnimationStarted(): js.Promise[Boolean]
  }
  object TransitionUniDriver {
    
    inline def apply(
      click: CallbackTo[js.Promise[Unit]],
      element: CallbackTo[js.Promise[Any]],
      exists: CallbackTo[js.Promise[Boolean]],
      hasAnimationStarted: CallbackTo[js.Promise[Boolean]]
    ): TransitionUniDriver = {
      val __obj = js.Dynamic.literal(click = click.toJsFn, element = element.toJsFn, exists = exists.toJsFn, hasAnimationStarted = hasAnimationStarted.toJsFn)
      __obj.asInstanceOf[TransitionUniDriver]
    }
    
    extension [Self <: TransitionUniDriver](x: Self) {
      
      inline def setHasAnimationStarted(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "hasAnimationStarted", value.toJsFn)
    }
  }
}
