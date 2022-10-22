package typingsJapgolly.playable

import typingsJapgolly.playable.distSrcModulesEventEmitterTypesMod.IEventEmitterAPI
import typingsJapgolly.playable.distSrcModulesFullScreenManagerTypesMod.IFullScreenAPI
import typingsJapgolly.playable.distSrcModulesPictureInPictureTypesMod.IPictureInPictureAPI
import typingsJapgolly.playable.distSrcModulesPlaybackEngineTypesMod.IPlaybackEngineAPI
import typingsJapgolly.playable.distSrcModulesRootContainerTypesMod.IRootContainerAPI
import typingsJapgolly.playable.distSrcModulesUiBottomBlockTypesMod.IBottomBlockAPI
import typingsJapgolly.playable.distSrcModulesUiControlsDownloadTypesMod.IDownloadButtonAPI
import typingsJapgolly.playable.distSrcModulesUiControlsLogoTypesMod.ILogoAPI
import typingsJapgolly.playable.distSrcModulesUiControlsProgressTypesMod.IProgressControlAPI
import typingsJapgolly.playable.distSrcModulesUiCoreThemeTypesMod.IThemeAPI
import typingsJapgolly.playable.distSrcModulesUiMainUiBlockTypesMod.IMainUIBlockAPI
import typingsJapgolly.playable.distSrcModulesUiOverlayTypesMod.IOverlayAPI
import typingsJapgolly.playable.distSrcModulesUiPreviewServiceTypesMod.IPreviewAPI
import typingsJapgolly.playable.distSrcModulesUiScreenTypesMod.IScreenAPI
import typingsJapgolly.playable.distSrcModulesUiTitleTypesMod.ITitleAPI
import typingsJapgolly.playable.distSrcModulesUiTopBlockTypesMod.ITopBlockAPI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCoreDefaultModulesMod {
  
  trait IPlayer
    extends StObject
       with IRootContainerAPI
       with IEventEmitterAPI
       with IPlaybackEngineAPI
       with IThemeAPI
       with IFullScreenAPI
       with IPictureInPictureAPI
       with IScreenAPI
       with IOverlayAPI
       with IMainUIBlockAPI
       with ITopBlockAPI
       with ITitleAPI
       with IBottomBlockAPI
       with IProgressControlAPI
       with ILogoAPI
       with IDownloadButtonAPI
       with IPreviewAPI
  object IPlayer {
    
    inline def apply(): IPlayer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPlayer]
    }
  }
}
