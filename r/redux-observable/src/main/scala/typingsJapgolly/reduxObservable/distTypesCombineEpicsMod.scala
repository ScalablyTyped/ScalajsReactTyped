package typingsJapgolly.reduxObservable

import typingsJapgolly.redux.mod.Action
import typingsJapgolly.reduxObservable.distTypesEpicMod.Epic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCombineEpicsMod {
  
  @JSImport("redux-observable/dist/types/combineEpics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def combineEpics[T /* <: Action[Any] */, O /* <: T */, S, D](epics: (Epic[T, O, S, D])*): Epic[T, O, S, D] = ^.asInstanceOf[js.Dynamic].applyDynamic("combineEpics")(epics.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Epic[T, O, S, D]]
}
