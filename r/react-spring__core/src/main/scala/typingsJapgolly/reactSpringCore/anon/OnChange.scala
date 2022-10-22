package typingsJapgolly.reactSpringCore.anon

import typingsJapgolly.reactSpringCore.distDeclarationsSrcControllerMod.Controller
import typingsJapgolly.reactSpringCore.distDeclarationsSrcSpringValueMod.SpringValue
import typingsJapgolly.reactSpringCore.distDeclarationsSrcTypesObjectsMod.AnimationResult
import typingsJapgolly.reactSpringTypes.utilMod.Lookup
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnChange[State /* <: Lookup[Any] */] extends StObject {
  
  var onChange: Map[
    js.Function3[
      /* result */ AnimationResult[SpringValue[State]], 
      /* ctrl */ Controller[State], 
      js.UndefOr[Any], 
      Unit
    ], 
    AnimationResult[Any]
  ]
  
  var onRest: Map[
    js.Function3[
      /* result */ AnimationResult[SpringValue[State]], 
      /* ctrl */ Controller[State], 
      js.UndefOr[Any], 
      Unit
    ], 
    AnimationResult[Any]
  ]
  
  var onStart: Map[
    js.Function3[
      /* result */ AnimationResult[SpringValue[State]], 
      /* ctrl */ Controller[State], 
      js.UndefOr[Any], 
      Unit
    ], 
    AnimationResult[Any]
  ]
}
object OnChange {
  
  inline def apply[State /* <: Lookup[Any] */](
    onChange: Map[
      js.Function3[
        /* result */ AnimationResult[SpringValue[State]], 
        /* ctrl */ Controller[State], 
        js.UndefOr[Any], 
        Unit
      ], 
      AnimationResult[Any]
    ],
    onRest: Map[
      js.Function3[
        /* result */ AnimationResult[SpringValue[State]], 
        /* ctrl */ Controller[State], 
        js.UndefOr[Any], 
        Unit
      ], 
      AnimationResult[Any]
    ],
    onStart: Map[
      js.Function3[
        /* result */ AnimationResult[SpringValue[State]], 
        /* ctrl */ Controller[State], 
        js.UndefOr[Any], 
        Unit
      ], 
      AnimationResult[Any]
    ]
  ): OnChange[State] = {
    val __obj = js.Dynamic.literal(onChange = onChange.asInstanceOf[js.Any], onRest = onRest.asInstanceOf[js.Any], onStart = onStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnChange[State]]
  }
  
  extension [Self <: OnChange[?], State /* <: Lookup[Any] */](x: Self & OnChange[State]) {
    
    inline def setOnChange(
      value: Map[
          js.Function3[
            /* result */ AnimationResult[SpringValue[State]], 
            /* ctrl */ Controller[State], 
            js.UndefOr[Any], 
            Unit
          ], 
          AnimationResult[Any]
        ]
    ): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
    
    inline def setOnRest(
      value: Map[
          js.Function3[
            /* result */ AnimationResult[SpringValue[State]], 
            /* ctrl */ Controller[State], 
            js.UndefOr[Any], 
            Unit
          ], 
          AnimationResult[Any]
        ]
    ): Self = StObject.set(x, "onRest", value.asInstanceOf[js.Any])
    
    inline def setOnStart(
      value: Map[
          js.Function3[
            /* result */ AnimationResult[SpringValue[State]], 
            /* ctrl */ Controller[State], 
            js.UndefOr[Any], 
            Unit
          ], 
          AnimationResult[Any]
        ]
    ): Self = StObject.set(x, "onStart", value.asInstanceOf[js.Any])
  }
}
