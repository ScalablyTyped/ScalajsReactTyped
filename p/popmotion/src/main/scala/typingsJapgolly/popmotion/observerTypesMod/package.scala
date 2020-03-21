package typingsJapgolly.popmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object observerTypesMod {
  type Complete = js.Function0[js.Any]
  type Error = js.Function1[/* err */ js.UndefOr[js.Any], js.Any]
  type Middleware = js.Function2[
    /* update */ typingsJapgolly.popmotion.observerTypesMod.Update, 
    /* complete */ js.UndefOr[typingsJapgolly.popmotion.observerTypesMod.Complete], 
    js.Function1[/* v */ js.Any, js.Any]
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.popmotion.observerTypesMod.Update
    - typingsJapgolly.popmotion.observerTypesMod.IObserver
    - typingsJapgolly.popmotion.observerTypesMod.PartialObserver
  */
  type ObserverCandidate = typingsJapgolly.popmotion.observerTypesMod._ObserverCandidate | typingsJapgolly.popmotion.observerTypesMod.Update
  type ObserverEvent = js.Function2[/* type */ js.UndefOr[java.lang.String], /* v */ js.UndefOr[js.Any], js.Any]
  type ObserverFactory = js.Function2[
    /* observerCandidate */ typingsJapgolly.popmotion.observerTypesMod.ObserverCandidate, 
    /* props */ typingsJapgolly.popmotion.observerTypesMod.ObserverProps, 
    typingsJapgolly.popmotion.observerTypesMod.IObserver
  ]
  type Update = js.Function
}
