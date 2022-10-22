package typingsJapgolly.reactSpringAnimated

import typingsJapgolly.reactSpringAnimated.distDeclarationsSrcCreateHostMod.WithAnimated
import typingsJapgolly.reactSpringTypes.utilMod.Lookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Animated extends StObject {
    
    var animated: WithAnimated
  }
  object Animated {
    
    inline def apply(animated: WithAnimated): Animated = {
      val __obj = js.Dynamic.literal(animated = animated.asInstanceOf[js.Any])
      __obj.asInstanceOf[Animated]
    }
    
    extension [Self <: Animated](x: Self) {
      
      inline def setAnimated(value: WithAnimated): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@react-spring/animated.@react-spring/animated/dist/declarations/src/createHost.HostConfig> */
  trait PartialHostConfig extends StObject {
    
    var applyAnimatedValues: js.UndefOr[js.Function2[/* node */ Any, /* props */ Lookup[Any], Boolean | Unit]] = js.undefined
    
    var createAnimatedStyle: js.UndefOr[
        js.Function1[
          /* style */ Lookup[Any], 
          typingsJapgolly.reactSpringAnimated.distDeclarationsSrcAnimatedMod.Animated[Any]
        ]
      ] = js.undefined
    
    var getComponentProps: js.UndefOr[
        js.Function1[
          /* props */ Lookup[Any], 
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof props */ Any
        ]
      ] = js.undefined
  }
  object PartialHostConfig {
    
    inline def apply(): PartialHostConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialHostConfig]
    }
    
    extension [Self <: PartialHostConfig](x: Self) {
      
      inline def setApplyAnimatedValues(value: (/* node */ Any, /* props */ Lookup[Any]) => Boolean | Unit): Self = StObject.set(x, "applyAnimatedValues", js.Any.fromFunction2(value))
      
      inline def setApplyAnimatedValuesUndefined: Self = StObject.set(x, "applyAnimatedValues", js.undefined)
      
      inline def setCreateAnimatedStyle(
        value: /* style */ Lookup[Any] => typingsJapgolly.reactSpringAnimated.distDeclarationsSrcAnimatedMod.Animated[Any]
      ): Self = StObject.set(x, "createAnimatedStyle", js.Any.fromFunction1(value))
      
      inline def setCreateAnimatedStyleUndefined: Self = StObject.set(x, "createAnimatedStyle", js.undefined)
      
      inline def setGetComponentProps(
        value: /* props */ Lookup[Any] => /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof props */ Any
      ): Self = StObject.set(x, "getComponentProps", js.Any.fromFunction1(value))
      
      inline def setGetComponentPropsUndefined: Self = StObject.set(x, "getComponentProps", js.undefined)
    }
  }
}
