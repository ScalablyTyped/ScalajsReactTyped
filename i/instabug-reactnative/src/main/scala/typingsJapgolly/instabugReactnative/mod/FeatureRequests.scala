package typingsJapgolly.instabugReactnative.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("instabug-reactnative", "FeatureRequests")
@js.native
object FeatureRequests extends js.Object {
  @js.native
  sealed trait actionTypes extends js.Object
  
  def setEmailFieldRequired(
    isEmailFieldRequired: Boolean,
    actionTypes: js.Array[typingsJapgolly.instabugReactnative.mod.FeatureRequests.actionTypes]
  ): Unit = js.native
  def setEnabled(isEnabled: Boolean): Unit = js.native
  def show(): Unit = js.native
  @js.native
  object actionTypes extends js.Object {
    @js.native
    sealed trait addCommentToFeature
      extends typingsJapgolly.instabugReactnative.mod.FeatureRequests.actionTypes
    
    @js.native
    sealed trait allActions
      extends typingsJapgolly.instabugReactnative.mod.FeatureRequests.actionTypes
    
    @js.native
    sealed trait reportBug
      extends typingsJapgolly.instabugReactnative.mod.FeatureRequests.actionTypes
    
    @js.native
    sealed trait requestNewFeature
      extends typingsJapgolly.instabugReactnative.mod.FeatureRequests.actionTypes
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.instabugReactnative.mod.FeatureRequests.actionTypes with Double] = js.native
    /* 3 */ @js.native
    object addCommentToFeature extends TopLevel[addCommentToFeature with Double]
    
    /* 0 */ @js.native
    object allActions extends TopLevel[allActions with Double]
    
    /* 1 */ @js.native
    object reportBug extends TopLevel[reportBug with Double]
    
    /* 2 */ @js.native
    object requestNewFeature extends TopLevel[requestNewFeature with Double]
    
  }
  
}

