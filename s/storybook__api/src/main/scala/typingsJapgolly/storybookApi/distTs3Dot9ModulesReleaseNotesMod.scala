package typingsJapgolly.storybookApi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.storybookApi.mod.ModuleFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ModulesReleaseNotesMod {
  
  @JSImport("@storybook/api/dist/ts3.9/modules/release-notes", "init")
  @js.native
  val init: ModuleFn = js.native
  
  trait ReleaseNotes extends StObject {
    
    var currentVersion: js.UndefOr[String] = js.undefined
    
    var showOnFirstLaunch: js.UndefOr[Boolean] = js.undefined
    
    var success: js.UndefOr[Boolean] = js.undefined
  }
  object ReleaseNotes {
    
    inline def apply(): ReleaseNotes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReleaseNotes]
    }
    
    extension [Self <: ReleaseNotes](x: Self) {
      
      inline def setCurrentVersion(value: String): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
      
      inline def setCurrentVersionUndefined: Self = StObject.set(x, "currentVersion", js.undefined)
      
      inline def setShowOnFirstLaunch(value: Boolean): Self = StObject.set(x, "showOnFirstLaunch", value.asInstanceOf[js.Any])
      
      inline def setShowOnFirstLaunchUndefined: Self = StObject.set(x, "showOnFirstLaunch", js.undefined)
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    }
  }
  
  trait SubAPI extends StObject {
    
    def releaseNotesVersion(): String
    
    def setDidViewReleaseNotes(): Unit
    
    def showReleaseNotesOnLaunch(): Boolean
  }
  object SubAPI {
    
    inline def apply(
      releaseNotesVersion: CallbackTo[String],
      setDidViewReleaseNotes: Callback,
      showReleaseNotesOnLaunch: CallbackTo[Boolean]
    ): SubAPI = {
      val __obj = js.Dynamic.literal(releaseNotesVersion = releaseNotesVersion.toJsFn, setDidViewReleaseNotes = setDidViewReleaseNotes.toJsFn, showReleaseNotesOnLaunch = showReleaseNotesOnLaunch.toJsFn)
      __obj.asInstanceOf[SubAPI]
    }
    
    extension [Self <: SubAPI](x: Self) {
      
      inline def setReleaseNotesVersion(value: CallbackTo[String]): Self = StObject.set(x, "releaseNotesVersion", value.toJsFn)
      
      inline def setSetDidViewReleaseNotes(value: Callback): Self = StObject.set(x, "setDidViewReleaseNotes", value.toJsFn)
      
      inline def setShowReleaseNotesOnLaunch(value: CallbackTo[Boolean]): Self = StObject.set(x, "showReleaseNotesOnLaunch", value.toJsFn)
    }
  }
  
  trait SubState extends StObject {
    
    var releaseNotesViewed: js.Array[String]
  }
  object SubState {
    
    inline def apply(releaseNotesViewed: js.Array[String]): SubState = {
      val __obj = js.Dynamic.literal(releaseNotesViewed = releaseNotesViewed.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubState]
    }
    
    extension [Self <: SubState](x: Self) {
      
      inline def setReleaseNotesViewed(value: js.Array[String]): Self = StObject.set(x, "releaseNotesViewed", value.asInstanceOf[js.Any])
      
      inline def setReleaseNotesViewedVarargs(value: String*): Self = StObject.set(x, "releaseNotesViewed", js.Array(value*))
    }
  }
}
