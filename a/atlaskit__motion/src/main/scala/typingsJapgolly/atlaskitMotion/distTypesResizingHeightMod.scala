package typingsJapgolly.atlaskitMotion

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.atlaskitMotion.anon.RefCallbackRef
import typingsJapgolly.atlaskitMotion.anon.ResizingHeightOptschildre
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResizingHeightMod {
  
  @JSImport("@atlaskit/motion/dist/types/resizing/height", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(opts: ResizingHeightOpts): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def ResizingHeight(hasChildrenProps: ResizingHeightOptschildre): Node = ^.asInstanceOf[js.Dynamic].applyDynamic("ResizingHeight")(hasChildrenProps.asInstanceOf[js.Any]).asInstanceOf[Node]
  
  inline def useResizingHeight(): RefCallbackRef = ^.asInstanceOf[js.Dynamic].applyDynamic("useResizingHeight")().asInstanceOf[RefCallbackRef]
  inline def useResizingHeight(hasCalcDurationCalcTimingFunction: ResizingHeightOpts): RefCallbackRef = ^.asInstanceOf[js.Dynamic].applyDynamic("useResizingHeight")(hasCalcDurationCalcTimingFunction.asInstanceOf[js.Any]).asInstanceOf[RefCallbackRef]
  
  trait ResizingHeightOpts extends StObject {
    
    /**
      * Duration as a `function`.
      * Will receive previous and next `height` and return the `duration`.
      *
      * By default this will match the [ADG specifications](https://atlassian.design) for how long motion should take.
      * Design specifications are still a work in progress.
      */
    var duration: js.UndefOr[js.Function2[/* prevHeight */ Double, /* nextHeight */ Double, Double]] = js.undefined
    
    /**
      * Timing function as a `function`.
      * This is handy for changing the curve depending on the user interaction.
      * Does the user interact [directly or indirectly](/packages/helpers/motion/docs/variables)?
      * You'll want to use an appropriate curve.
      * Will receive previous and next `height`,
      * `duration`,
      * and return the [timing function](https://developer.mozilla.org/en-US/docs/Web/CSS/timing-function).
      *
      * By default this will assume indirect motion using `easeInOut`.
      */
    var timingFunction: js.UndefOr[
        js.Function3[/* prevHeight */ Double, /* nextHeight */ Double, /* duration */ Double, String]
      ] = js.undefined
  }
  object ResizingHeightOpts {
    
    inline def apply(): ResizingHeightOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizingHeightOpts]
    }
    
    extension [Self <: ResizingHeightOpts](x: Self) {
      
      inline def setDuration(value: (/* prevHeight */ Double, /* nextHeight */ Double) => Double): Self = StObject.set(x, "duration", js.Any.fromFunction2(value))
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setTimingFunction(value: (/* prevHeight */ Double, /* nextHeight */ Double, /* duration */ Double) => String): Self = StObject.set(x, "timingFunction", js.Any.fromFunction3(value))
      
      inline def setTimingFunctionUndefined: Self = StObject.set(x, "timingFunction", js.undefined)
    }
  }
}
