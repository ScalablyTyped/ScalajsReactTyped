package typingsJapgolly.atlaskitMotion

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEnteringTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.atlaskitMotion.atlaskitMotionStrings.top
    - typingsJapgolly.atlaskitMotion.atlaskitMotionStrings.right
    - typingsJapgolly.atlaskitMotion.atlaskitMotionStrings.bottom
    - typingsJapgolly.atlaskitMotion.atlaskitMotionStrings.left
  */
  trait Direction extends StObject
  object Direction {
    
    inline def bottom: typingsJapgolly.atlaskitMotion.atlaskitMotionStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.atlaskitMotion.atlaskitMotionStrings.bottom]
    
    inline def left: typingsJapgolly.atlaskitMotion.atlaskitMotionStrings.left = "left".asInstanceOf[typingsJapgolly.atlaskitMotion.atlaskitMotionStrings.left]
    
    inline def right: typingsJapgolly.atlaskitMotion.atlaskitMotionStrings.right = "right".asInstanceOf[typingsJapgolly.atlaskitMotion.atlaskitMotionStrings.right]
    
    inline def top: typingsJapgolly.atlaskitMotion.atlaskitMotionStrings.top = "top".asInstanceOf[typingsJapgolly.atlaskitMotion.atlaskitMotionStrings.top]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.atlaskitMotion.atlaskitMotionStrings.constant
    - typingsJapgolly.atlaskitMotion.atlaskitMotionStrings.proportional
  */
  trait Distance extends StObject
  object Distance {
    
    inline def constant: typingsJapgolly.atlaskitMotion.atlaskitMotionStrings.constant = "constant".asInstanceOf[typingsJapgolly.atlaskitMotion.atlaskitMotionStrings.constant]
    
    inline def proportional: typingsJapgolly.atlaskitMotion.atlaskitMotionStrings.proportional = "proportional".asInstanceOf[typingsJapgolly.atlaskitMotion.atlaskitMotionStrings.proportional]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.atlaskitMotion.atlaskitMotionStrings.none
    - typingsJapgolly.atlaskitMotion.atlaskitMotionStrings.in
    - typingsJapgolly.atlaskitMotion.atlaskitMotionStrings.out
    - typingsJapgolly.atlaskitMotion.atlaskitMotionStrings.inout
  */
  trait Fade extends StObject
  object Fade {
    
    inline def in: typingsJapgolly.atlaskitMotion.atlaskitMotionStrings.in = "in".asInstanceOf[typingsJapgolly.atlaskitMotion.atlaskitMotionStrings.in]
    
    inline def inout: typingsJapgolly.atlaskitMotion.atlaskitMotionStrings.inout = "inout".asInstanceOf[typingsJapgolly.atlaskitMotion.atlaskitMotionStrings.inout]
    
    inline def none: typingsJapgolly.atlaskitMotion.atlaskitMotionStrings.none = "none".asInstanceOf[typingsJapgolly.atlaskitMotion.atlaskitMotionStrings.none]
    
    inline def out: typingsJapgolly.atlaskitMotion.atlaskitMotionStrings.out = "out".asInstanceOf[typingsJapgolly.atlaskitMotion.atlaskitMotionStrings.out]
  }
  
  trait MotionProps[TProps /* <: js.Object */] extends StObject {
    
    /**
      * Children as `function`.
      * Will be passed `props` for you to hook up.
      * The `state` arg can be used to know if the motion is `entering` or `exiting`.
      */
    def children(opts: TProps, state: Transition): Node
    
    /**
      * Duration in `ms`.
      * How long the motion will take.
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * Will callback when the motion has finished in the particular direction.
      * If it finished entering direction will be `entering`.
      * And vice versa for `exiting`.
      */
    var onFinish: js.UndefOr[js.Function1[/* state */ Transition, Unit]] = js.undefined
  }
  object MotionProps {
    
    inline def apply[TProps /* <: js.Object */](children: (TProps, Transition) => Node): MotionProps[TProps] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction2(children))
      __obj.asInstanceOf[MotionProps[TProps]]
    }
    
    extension [Self <: MotionProps[?], TProps /* <: js.Object */](x: Self & MotionProps[TProps]) {
      
      inline def setChildren(value: (TProps, Transition) => Node): Self = StObject.set(x, "children", js.Any.fromFunction2(value))
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setOnFinish(value: /* state */ Transition => Callback): Self = StObject.set(x, "onFinish", js.Any.fromFunction1((t0: /* state */ Transition) => value(t0).runNow()))
      
      inline def setOnFinishUndefined: Self = StObject.set(x, "onFinish", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.atlaskitMotion.atlaskitMotionStrings.entering
    - typingsJapgolly.atlaskitMotion.atlaskitMotionStrings.exiting
  */
  trait Transition extends StObject
  object Transition {
    
    inline def entering: typingsJapgolly.atlaskitMotion.atlaskitMotionStrings.entering = "entering".asInstanceOf[typingsJapgolly.atlaskitMotion.atlaskitMotionStrings.entering]
    
    inline def exiting: typingsJapgolly.atlaskitMotion.atlaskitMotionStrings.exiting = "exiting".asInstanceOf[typingsJapgolly.atlaskitMotion.atlaskitMotionStrings.exiting]
  }
}
