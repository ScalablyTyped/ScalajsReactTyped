package typingsJapgolly.uiRouterExtras.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ui {
  /**
    * `StateFactory` factories convert `FutureState` into a full UI-Router `state`, or `state` tree
    */
  type IFutureStateFactory = typingsJapgolly.angular.mod.Injectable[
    js.Function1[
      /* repeated */ js.Any, 
      typingsJapgolly.angular.mod.IPromise[
        js.UndefOr[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IState */ js.Any
        ]
      ]
    ]
  ]
  type IResolveFunction = typingsJapgolly.angular.mod.Injectable[
    js.Function1[/* repeated */ js.Any, typingsJapgolly.angular.mod.IPromise[js.Any]]
  ]
}
