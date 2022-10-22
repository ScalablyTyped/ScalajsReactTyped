package typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CommandType extends StObject
@JSImport("testcafe-reporter-dashboard/lib/types/testcafe", "CommandType")
@js.native
object CommandType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CommandType & String] = js.native
  
  @js.native
  sealed trait assertion
    extends StObject
       with CommandType
  /* "assertion" */ val assertion: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.assertion & String = js.native
  
  @js.native
  sealed trait backupStorages
    extends StObject
       with CommandType
  /* "backup-storages" */ val backupStorages: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.backupStorages & String = js.native
  
  @js.native
  sealed trait clearUpload
    extends StObject
       with CommandType
  /* "clear-upload" */ val clearUpload: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.clearUpload & String = js.native
  
  @js.native
  sealed trait click
    extends StObject
       with CommandType
  /* "click" */ val click: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.click & String = js.native
  
  @js.native
  sealed trait debug
    extends StObject
       with CommandType
  /* "debug" */ val debug: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.debug & String = js.native
  
  @js.native
  sealed trait doubleClick
    extends StObject
       with CommandType
  /* "double-click" */ val doubleClick: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.doubleClick & String = js.native
  
  @js.native
  sealed trait drag
    extends StObject
       with CommandType
  /* "drag" */ val drag: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.drag & String = js.native
  
  @js.native
  sealed trait dragToElement
    extends StObject
       with CommandType
  /* "drag-to-element" */ val dragToElement: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.dragToElement & String = js.native
  
  @js.native
  sealed trait executeAsyncExpression
    extends StObject
       with CommandType
  /* "execute-async-expression" */ val executeAsyncExpression: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.executeAsyncExpression & String = js.native
  
  @js.native
  sealed trait executeClientFunction
    extends StObject
       with CommandType
  /* "execute-client-function" */ val executeClientFunction: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.executeClientFunction & String = js.native
  
  @js.native
  sealed trait executeExpression
    extends StObject
       with CommandType
  /* "execute-expression" */ val executeExpression: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.executeExpression & String = js.native
  
  @js.native
  sealed trait executeSelector
    extends StObject
       with CommandType
  /* "execute-selector" */ val executeSelector: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.executeSelector & String = js.native
  
  @js.native
  sealed trait getBrowserConsoleMessages
    extends StObject
       with CommandType
  /* "get-browser-console-messages" */ val getBrowserConsoleMessages: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.getBrowserConsoleMessages & String = js.native
  
  @js.native
  sealed trait getNativeDialogHistory
    extends StObject
       with CommandType
  /* "get-native-dialog-history" */ val getNativeDialogHistory: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.getNativeDialogHistory & String = js.native
  
  @js.native
  sealed trait hideAssertionRetriesStatus
    extends StObject
       with CommandType
  /* "hide-assertion-retries-status" */ val hideAssertionRetriesStatus: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.hideAssertionRetriesStatus & String = js.native
  
  @js.native
  sealed trait hover
    extends StObject
       with CommandType
  /* "hover" */ val hover: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.hover & String = js.native
  
  @js.native
  sealed trait maximizeWindow
    extends StObject
       with CommandType
  /* "maximize-window" */ val maximizeWindow: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.maximizeWindow & String = js.native
  
  @js.native
  sealed trait navigateTo
    extends StObject
       with CommandType
  /* "navigate-to" */ val navigateTo: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.navigateTo & String = js.native
  
  @js.native
  sealed trait prepareBrowserManipulation
    extends StObject
       with CommandType
  /* "prepare-browser-manipulation" */ val prepareBrowserManipulation: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.prepareBrowserManipulation & String = js.native
  
  @js.native
  sealed trait pressKey
    extends StObject
       with CommandType
  /* "press-key" */ val pressKey: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.pressKey & String = js.native
  
  @js.native
  sealed trait recorder
    extends StObject
       with CommandType
  /* "recorder" */ val recorder: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.recorder & String = js.native
  
  @js.native
  sealed trait resizeWindow
    extends StObject
       with CommandType
  /* "resize-window" */ val resizeWindow: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.resizeWindow & String = js.native
  
  @js.native
  sealed trait resizeWindowToFitDevice
    extends StObject
       with CommandType
  /* "resize-window-to-fit-device" */ val resizeWindowToFitDevice: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.resizeWindowToFitDevice & String = js.native
  
  @js.native
  sealed trait rightClick
    extends StObject
       with CommandType
  /* "right-click" */ val rightClick: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.rightClick & String = js.native
  
  @js.native
  sealed trait selectEditableContent
    extends StObject
       with CommandType
  /* "select-editable-content" */ val selectEditableContent: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.selectEditableContent & String = js.native
  
  @js.native
  sealed trait selectText
    extends StObject
       with CommandType
  /* "select-text" */ val selectText: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.selectText & String = js.native
  
  @js.native
  sealed trait selectTextAreaContent
    extends StObject
       with CommandType
  /* "select-text-area-content" */ val selectTextAreaContent: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.selectTextAreaContent & String = js.native
  
  @js.native
  sealed trait setBreakpoint
    extends StObject
       with CommandType
  /* "set-breakpoint" */ val setBreakpoint: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.setBreakpoint & String = js.native
  
  @js.native
  sealed trait setFilesToUpload
    extends StObject
       with CommandType
  /* "set-files-to-upload" */ val setFilesToUpload: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.setFilesToUpload & String = js.native
  
  @js.native
  sealed trait setNativeDialogHandler
    extends StObject
       with CommandType
  /* "set-native-dialog-handler" */ val setNativeDialogHandler: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.setNativeDialogHandler & String = js.native
  
  @js.native
  sealed trait setPageLoadTimeout
    extends StObject
       with CommandType
  /* "set-page-load-timeout" */ val setPageLoadTimeout: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.setPageLoadTimeout & String = js.native
  
  @js.native
  sealed trait setTestSpeed
    extends StObject
       with CommandType
  /* "set-test-speed" */ val setTestSpeed: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.setTestSpeed & String = js.native
  
  @js.native
  sealed trait showAssertionRetriesStatus
    extends StObject
       with CommandType
  /* "show-assertion-retries-status" */ val showAssertionRetriesStatus: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.showAssertionRetriesStatus & String = js.native
  
  @js.native
  sealed trait switchToIframe
    extends StObject
       with CommandType
  /* "switch-to-iframe" */ val switchToIframe: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.switchToIframe & String = js.native
  
  @js.native
  sealed trait switchToMainWindow
    extends StObject
       with CommandType
  /* "switch-to-main-window" */ val switchToMainWindow: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.switchToMainWindow & String = js.native
  
  @js.native
  sealed trait takeElementScreenshot
    extends StObject
       with CommandType
  /* "take-element-screenshot" */ val takeElementScreenshot: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.takeElementScreenshot & String = js.native
  
  @js.native
  sealed trait takeScreenshot
    extends StObject
       with CommandType
  /* "take-screenshot" */ val takeScreenshot: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.takeScreenshot & String = js.native
  
  @js.native
  sealed trait takeScreenshotOnFail
    extends StObject
       with CommandType
  /* "take-screenshot-on-fail" */ val takeScreenshotOnFail: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.takeScreenshotOnFail & String = js.native
  
  @js.native
  sealed trait testDone
    extends StObject
       with CommandType
  /* "test-done" */ val testDone: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.testDone & String = js.native
  
  @js.native
  sealed trait typeText
    extends StObject
       with CommandType
  /* "type-text" */ val typeText: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.typeText & String = js.native
  
  @js.native
  sealed trait unlockPage
    extends StObject
       with CommandType
  /* "unlock-page" */ val unlockPage: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.unlockPage & String = js.native
  
  @js.native
  sealed trait useRole
    extends StObject
       with CommandType
  /* "useRole" */ val useRole: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.useRole & String = js.native
  
  @js.native
  sealed trait wait
    extends StObject
       with CommandType
  /* "wait" */ @JSName("wait")
  val wait_ : wait & String = js.native
}
