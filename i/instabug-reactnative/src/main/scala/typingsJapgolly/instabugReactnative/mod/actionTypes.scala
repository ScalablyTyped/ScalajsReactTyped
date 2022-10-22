package typingsJapgolly.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait actionTypes extends StObject
@JSImport("instabug-reactnative", "actionTypes")
@js.native
object actionTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[actionTypes & Double] = js.native
  
  @js.native
  sealed trait addCommentToFeature
    extends StObject
       with actionTypes
  /* 3 */ val addCommentToFeature: typingsJapgolly.instabugReactnative.mod.actionTypes.addCommentToFeature & Double = js.native
  
  @js.native
  sealed trait allActions
    extends StObject
       with actionTypes
  /* 0 */ val allActions: typingsJapgolly.instabugReactnative.mod.actionTypes.allActions & Double = js.native
  
  @js.native
  sealed trait reportBug
    extends StObject
       with actionTypes
  /* 1 */ val reportBug: typingsJapgolly.instabugReactnative.mod.actionTypes.reportBug & Double = js.native
  
  @js.native
  sealed trait requestNewFeature
    extends StObject
       with actionTypes
  /* 2 */ val requestNewFeature: typingsJapgolly.instabugReactnative.mod.actionTypes.requestNewFeature & Double = js.native
}
