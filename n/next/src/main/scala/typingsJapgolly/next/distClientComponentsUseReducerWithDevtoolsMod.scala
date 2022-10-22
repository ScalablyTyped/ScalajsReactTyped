package typingsJapgolly.next

import typingsJapgolly.next.anon.ReadonlyAppRouterState
import typingsJapgolly.next.distClientComponentsReducerMod.AppRouterState
import typingsJapgolly.next.distClientComponentsReducerMod.NavigateAction
import typingsJapgolly.next.distClientComponentsReducerMod.PrefetchAction
import typingsJapgolly.next.distClientComponentsReducerMod.ReloadAction
import typingsJapgolly.next.distClientComponentsReducerMod.RestoreAction
import typingsJapgolly.next.distClientComponentsReducerMod.ServerPatchAction
import typingsJapgolly.react.mod.Dispatch
import typingsJapgolly.react.mod.ReducerAction
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClientComponentsUseReducerWithDevtoolsMod {
  
  @JSImport("next/dist/client/components/use-reducer-with-devtools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useReducerWithReduxDevtools(
    fn: js.Function2[
      /* state */ ReadonlyAppRouterState, 
      /* action */ ReloadAction | NavigateAction | RestoreAction | ServerPatchAction | PrefetchAction, 
      AppRouterState
    ],
    initialState: ReturnType[
      js.Function2[
        /* state */ ReadonlyAppRouterState, 
        /* action */ ReloadAction | NavigateAction | RestoreAction | ServerPatchAction | PrefetchAction, 
        AppRouterState
      ]
    ]
  ): js.Tuple3[
    ReturnType[
      js.Function2[
        /* state */ ReadonlyAppRouterState, 
        /* action */ ReloadAction | NavigateAction | RestoreAction | ServerPatchAction | PrefetchAction, 
        AppRouterState
      ]
    ], 
    Dispatch[
      ReducerAction[
        js.Function2[
          /* state */ ReadonlyAppRouterState, 
          /* action */ ReloadAction | NavigateAction | RestoreAction | ServerPatchAction | PrefetchAction, 
          AppRouterState
        ]
      ]
    ], 
    js.Function0[Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useReducerWithReduxDevtools")(fn.asInstanceOf[js.Any], initialState.asInstanceOf[js.Any])).asInstanceOf[js.Tuple3[
    ReturnType[
      js.Function2[
        /* state */ ReadonlyAppRouterState, 
        /* action */ ReloadAction | NavigateAction | RestoreAction | ServerPatchAction | PrefetchAction, 
        AppRouterState
      ]
    ], 
    Dispatch[
      ReducerAction[
        js.Function2[
          /* state */ ReadonlyAppRouterState, 
          /* action */ ReloadAction | NavigateAction | RestoreAction | ServerPatchAction | PrefetchAction, 
          AppRouterState
        ]
      ]
    ], 
    js.Function0[Unit]
  ]]
  
  object global {
    
    trait Window extends StObject {
      
      var __REDUX_DEVTOOLS_EXTENSION__ : Any
    }
    object Window {
      
      inline def apply(__REDUX_DEVTOOLS_EXTENSION__ : Any): typingsJapgolly.next.distClientComponentsUseReducerWithDevtoolsMod.global.Window = {
        val __obj = js.Dynamic.literal(__REDUX_DEVTOOLS_EXTENSION__ = __REDUX_DEVTOOLS_EXTENSION__.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.next.distClientComponentsUseReducerWithDevtoolsMod.global.Window]
      }
      
      extension [Self <: typingsJapgolly.next.distClientComponentsUseReducerWithDevtoolsMod.global.Window](x: Self) {
        
        inline def set__REDUX_DEVTOOLS_EXTENSION__(value: Any): Self = StObject.set(x, "__REDUX_DEVTOOLS_EXTENSION__", value.asInstanceOf[js.Any])
      }
    }
  }
}
