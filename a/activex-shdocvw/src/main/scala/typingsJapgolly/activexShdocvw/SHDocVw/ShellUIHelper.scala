package typingsJapgolly.activexShdocvw.SHDocVw

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShellUIHelper extends StObject {
  
  def AddChannel(URL: String): Unit = js.native
  
  def AddDesktopComponent(URL: String, Type: String): Unit = js.native
  def AddDesktopComponent(URL: String, Type: String, Left: Any): Unit = js.native
  def AddDesktopComponent(URL: String, Type: String, Left: Any, Top: Any): Unit = js.native
  def AddDesktopComponent(URL: String, Type: String, Left: Any, Top: Any, Width: Any): Unit = js.native
  def AddDesktopComponent(URL: String, Type: String, Left: Any, Top: Any, Width: Any, Height: Any): Unit = js.native
  def AddDesktopComponent(URL: String, Type: String, Left: Any, Top: Any, Width: Unit, Height: Any): Unit = js.native
  def AddDesktopComponent(URL: String, Type: String, Left: Any, Top: Unit, Width: Any): Unit = js.native
  def AddDesktopComponent(URL: String, Type: String, Left: Any, Top: Unit, Width: Any, Height: Any): Unit = js.native
  def AddDesktopComponent(URL: String, Type: String, Left: Any, Top: Unit, Width: Unit, Height: Any): Unit = js.native
  def AddDesktopComponent(URL: String, Type: String, Left: Unit, Top: Any): Unit = js.native
  def AddDesktopComponent(URL: String, Type: String, Left: Unit, Top: Any, Width: Any): Unit = js.native
  def AddDesktopComponent(URL: String, Type: String, Left: Unit, Top: Any, Width: Any, Height: Any): Unit = js.native
  def AddDesktopComponent(URL: String, Type: String, Left: Unit, Top: Any, Width: Unit, Height: Any): Unit = js.native
  def AddDesktopComponent(URL: String, Type: String, Left: Unit, Top: Unit, Width: Any): Unit = js.native
  def AddDesktopComponent(URL: String, Type: String, Left: Unit, Top: Unit, Width: Any, Height: Any): Unit = js.native
  def AddDesktopComponent(URL: String, Type: String, Left: Unit, Top: Unit, Width: Unit, Height: Any): Unit = js.native
  
  def AddFavorite(URL: String): Unit = js.native
  def AddFavorite(URL: String, Title: Any): Unit = js.native
  
  def AddSearchProvider(URL: String): Unit = js.native
  
  def AddService(URL: String): Unit = js.native
  
  def AddToFavoritesBar(URL: String, Title: String): Unit = js.native
  def AddToFavoritesBar(URL: String, Title: String, Type: Any): Unit = js.native
  
  def AutoCompleteAttach(): Unit = js.native
  def AutoCompleteAttach(Reserved: Any): Unit = js.native
  
  def AutoCompleteSaveForm(): Unit = js.native
  def AutoCompleteSaveForm(Form: Any): Unit = js.native
  
  def AutoScan(strSearch: String, strFailureUrl: String): Unit = js.native
  def AutoScan(strSearch: String, strFailureUrl: String, pvarTargetFrame: Any): Unit = js.native
  
  def BrandImageUri(): String = js.native
  
  def BuildNewTabPage(): Unit = js.native
  
  def ContentDiscoveryReset(): Unit = js.native
  
  def CustomizeClearType(fSet: Boolean): Unit = js.native
  
  def CustomizeSettings(fSQM: Boolean, fPhishing: Boolean, bstrLocale: String): Unit = js.native
  
  def DefaultSearchProvider(): String = js.native
  
  def DiagnoseConnection(): Unit = js.native
  
  def EnableSuggestedSites(fEnable: Boolean): Unit = js.native
  
  def GetCVListData(): String = js.native
  
  def GetCVListLocalData(): String = js.native
  
  def GetEMIEListData(): String = js.native
  
  def GetEMIEListLocalData(): String = js.native
  
  def GetExperimentalFlag(bstrFlagString: String): Boolean = js.native
  
  def GetExperimentalValue(bstrValueString: String): Double = js.native
  
  def GetNeedIEAutoLaunchFlag(bstrUrl: String): Boolean = js.native
  
  def HasNeedIEAutoLaunchFlag(bstrUrl: String): Boolean = js.native
  
  def ImportExportFavorites(fImport: Boolean, strImpExpPath: String): Unit = js.native
  
  def InPrivateFilteringEnabled(): Boolean = js.native
  
  def IsSearchMigrated(): Boolean = js.native
  
  def IsSearchProviderInstalled(URL: String): Double = js.native
  
  def IsServiceInstalled(URL: String, Verb: String): Double = js.native
  
  def IsSubscribed(URL: String): Boolean = js.native
  
  def IsSuggestedSitesEnabled(): Boolean = js.native
  
  def LaunchIE(bstrUrl: String, automated: Boolean): Unit = js.native
  
  def LaunchInHVSI(bstrUrl: String): Unit = js.native
  
  def NavigateAndFind(URL: String, strQuery: String, varTargetFrame: Any): Unit = js.native
  
  def NavigateToSuggestedSites(bstrRelativeUrl: String): Unit = js.native
  
  def OpenFavoritesPane(): Unit = js.native
  
  def OpenFavoritesSettings(): Unit = js.native
  
  def PhishingEnabled(): Boolean = js.native
  
  def RefreshOfflineDesktop(): Unit = js.native
  
  def ResetAllExperimentalFlagsAndValues(): Unit = js.native
  
  def ResetFirstBootMode(): Unit = js.native
  
  def ResetSafeMode(): Unit = js.native
  
  def RunOnceHasShown(): Boolean = js.native
  
  def RunOnceRequiredSettingsComplete(fComplete: Boolean): Unit = js.native
  
  def RunOnceShown(): Unit = js.native
  
  /* private */ @JSName("SHDocVw.ShellUIHelper_typekey")
  var SHDocVwDotShellUIHelper_typekey: ShellUIHelper = js.native
  
  def SearchGuideUrl(): String = js.native
  
  def SetActivitiesVisible(fVisible: Boolean): Unit = js.native
  
  def SetExperimentalFlag(bstrFlagString: String, vfFlag: Boolean): Unit = js.native
  
  def SetExperimentalValue(bstrValueString: String, dwValue: Double): Unit = js.native
  
  def SetNeedIEAutoLaunchFlag(bstrUrl: String, flag: Boolean): Unit = js.native
  
  def SetRecentlyClosedVisible(fVisible: Boolean): Unit = js.native
  
  def ShowBrowserUI(bstrName: String, pvarIn: Any): Any = js.native
  
  def ShowInPrivateHelp(): Unit = js.native
  
  def ShowTabsHelp(): Unit = js.native
  
  def SkipRunOnce(): Unit = js.native
  
  def SkipTabsWelcome(): Unit = js.native
  
  def SqmEnabled(): Boolean = js.native
  
  def msActiveXFilteringEnabled(): Boolean = js.native
  
  def msAddSiteMode(): Unit = js.native
  
  def msAddTrackingProtectionList(URL: String, bstrFilterName: String): Unit = js.native
  
  def msChangeDefaultBrowser(fChange: Boolean): Unit = js.native
  
  def msClearTile(): Unit = js.native
  
  def msDiagnoseConnectionUILess(): Unit = js.native
  
  def msEnableTileNotificationQueue(fChange: Boolean): Unit = js.native
  
  def msEnableTileNotificationQueueForSquare150x150(fChange: Boolean): Unit = js.native
  
  def msEnableTileNotificationQueueForSquare310x310(fChange: Boolean): Unit = js.native
  
  def msEnableTileNotificationQueueForWide310x150(fChange: Boolean): Unit = js.native
  
  def msIsSiteMode(): Boolean = js.native
  
  def msIsSiteModeFirstRun(fPreserveState: Boolean): Any = js.native
  
  def msLaunchInternetOptions(): Unit = js.native
  
  def msLaunchNetworkClientHelp(): Unit = js.native
  
  def msPinnedSiteState(): Any = js.native
  
  def msProvisionNetworks(bstrProvisioningXml: String): Any = js.native
  
  def msRemoveScheduledTileNotification(bstrNotificationId: String): Unit = js.native
  
  def msReportSafeUrl(): Unit = js.native
  
  def msScheduledTileNotification(bstrNotificationXml: String, bstrNotificationId: String, bstrNotificationTag: String): Unit = js.native
  def msScheduledTileNotification(
    bstrNotificationXml: String,
    bstrNotificationId: String,
    bstrNotificationTag: String,
    startTime: Any
  ): Unit = js.native
  def msScheduledTileNotification(
    bstrNotificationXml: String,
    bstrNotificationId: String,
    bstrNotificationTag: String,
    startTime: Any,
    expirationTime: Any
  ): Unit = js.native
  def msScheduledTileNotification(
    bstrNotificationXml: String,
    bstrNotificationId: String,
    bstrNotificationTag: String,
    startTime: Unit,
    expirationTime: Any
  ): Unit = js.native
  
  def msSiteModeActivate(): Unit = js.native
  
  def msSiteModeAddButtonStyle(uiButtonID: Any, bstrIconURL: String, bstrTooltip: String): Any = js.native
  
  def msSiteModeAddJumpListItem(bstrName: String, bstrActionUri: String, bstrIconUri: String): Unit = js.native
  def msSiteModeAddJumpListItem(bstrName: String, bstrActionUri: String, bstrIconUri: String, pvarWindowType: Any): Unit = js.native
  
  def msSiteModeAddThumbBarButton(bstrIconURL: String, bstrTooltip: String): Any = js.native
  
  def msSiteModeClearBadge(): Unit = js.native
  
  def msSiteModeClearIconOverlay(): Unit = js.native
  
  def msSiteModeClearJumpList(): Unit = js.native
  
  def msSiteModeCreateJumpList(bstrHeader: String): Unit = js.native
  
  def msSiteModeRefreshBadge(): Unit = js.native
  
  def msSiteModeSetIconOverlay(IconUrl: String): Unit = js.native
  def msSiteModeSetIconOverlay(IconUrl: String, pvarDescription: Any): Unit = js.native
  
  def msSiteModeShowButtonStyle(uiButtonID: Any, uiStyleID: Any): Unit = js.native
  
  def msSiteModeShowJumpList(): Unit = js.native
  
  def msSiteModeShowThumbBar(): Unit = js.native
  
  def msSiteModeUpdateThumbBarButton(ButtonID: Any, fEnabled: Boolean, fVisible: Boolean): Unit = js.native
  
  def msStartPeriodicBadgeUpdate(pollingUri: String): Unit = js.native
  def msStartPeriodicBadgeUpdate(pollingUri: String, startTime: Any): Unit = js.native
  def msStartPeriodicBadgeUpdate(pollingUri: String, startTime: Any, uiUpdateRecurrence: Any): Unit = js.native
  def msStartPeriodicBadgeUpdate(pollingUri: String, startTime: Unit, uiUpdateRecurrence: Any): Unit = js.native
  
  def msStartPeriodicTileUpdate(pollingUris: Any): Unit = js.native
  def msStartPeriodicTileUpdate(pollingUris: Any, startTime: Any): Unit = js.native
  def msStartPeriodicTileUpdate(pollingUris: Any, startTime: Any, uiUpdateRecurrence: Any): Unit = js.native
  def msStartPeriodicTileUpdate(pollingUris: Any, startTime: Unit, uiUpdateRecurrence: Any): Unit = js.native
  
  def msStartPeriodicTileUpdateBatch(pollingUris: Any): Unit = js.native
  def msStartPeriodicTileUpdateBatch(pollingUris: Any, startTime: Any): Unit = js.native
  def msStartPeriodicTileUpdateBatch(pollingUris: Any, startTime: Any, uiUpdateRecurrence: Any): Unit = js.native
  def msStartPeriodicTileUpdateBatch(pollingUris: Any, startTime: Unit, uiUpdateRecurrence: Any): Unit = js.native
  
  def msStopPeriodicBadgeUpdate(): Unit = js.native
  
  def msStopPeriodicTileUpdate(): Unit = js.native
  
  def msTrackingProtectionEnabled(): Boolean = js.native
}
