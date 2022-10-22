package typingsJapgolly.testcafeReporterDashboard

import typingsJapgolly.ioTs.mod.BrandC
import typingsJapgolly.ioTs.mod.ExactC
import typingsJapgolly.ioTs.mod.PartialC
import typingsJapgolly.ioTs.mod.ReadonlyC
import typingsJapgolly.ioTs.mod.StringC
import typingsJapgolly.ioTs.mod.TypeC
import typingsJapgolly.ioTs.mod.UndefinedC
import typingsJapgolly.ioTs.mod.UnionC
import typingsJapgolly.testcafeReporterDashboard.anon.Author
import typingsJapgolly.testcafeReporterDashboard.anon.BuildId
import typingsJapgolly.testcafeReporterDashboard.anon.CiInfo
import typingsJapgolly.testcafeReporterDashboard.anon.Duration
import typingsJapgolly.testcafeReporterDashboard.anon.FailedCount
import typingsJapgolly.testcafeReporterDashboard.anon.Fixture
import typingsJapgolly.testcafeReporterDashboard.anon.Id
import typingsJapgolly.testcafeReporterDashboard.anon.Name
import typingsJapgolly.testcafeReporterDashboard.anon.TestId
import typingsJapgolly.testcafeReporterDashboard.libTypesCommonMod.MaxLengthString
import typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.wait
import typingsJapgolly.testcafeReporterDashboard.testcafeReporterDashboardInts.`100`
import typingsJapgolly.testcafeReporterDashboard.testcafeReporterDashboardInts.`10`
import typingsJapgolly.testcafeReporterDashboard.testcafeReporterDashboardInts.`190`
import typingsJapgolly.testcafeReporterDashboard.testcafeReporterDashboardInts.`300`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("testcafe-reporter-dashboard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("testcafe-reporter-dashboard", "AggregateId")
  @js.native
  val AggregateId: BrandC[StringC, MaxLengthString[`190`]] = js.native
  
  @JSImport("testcafe-reporter-dashboard", "BuildIdSchema")
  @js.native
  val BuildIdSchema: UnionC[js.Tuple2[BrandC[StringC, MaxLengthString[`100`]], UndefinedC]] = js.native
  
  @JSImport("testcafe-reporter-dashboard", "CIInfoSchema")
  @js.native
  val CIInfoSchema: ReadonlyC[ExactC[PartialC[Author]]] = js.native
  
  @JSImport("testcafe-reporter-dashboard", "CommandType")
  @js.native
  object CommandType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType & String
      ] = js.native
    
    /* "assertion" */ val assertion: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.assertion & String = js.native
    
    /* "backup-storages" */ val backupStorages: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.backupStorages & String = js.native
    
    /* "clear-upload" */ val clearUpload: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.clearUpload & String = js.native
    
    /* "click" */ val click: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.click & String = js.native
    
    /* "debug" */ val debug: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.debug & String = js.native
    
    /* "double-click" */ val doubleClick: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.doubleClick & String = js.native
    
    /* "drag" */ val drag: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.drag & String = js.native
    
    /* "drag-to-element" */ val dragToElement: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.dragToElement & String = js.native
    
    /* "execute-async-expression" */ val executeAsyncExpression: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.executeAsyncExpression & String = js.native
    
    /* "execute-client-function" */ val executeClientFunction: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.executeClientFunction & String = js.native
    
    /* "execute-expression" */ val executeExpression: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.executeExpression & String = js.native
    
    /* "execute-selector" */ val executeSelector: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.executeSelector & String = js.native
    
    /* "get-browser-console-messages" */ val getBrowserConsoleMessages: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.getBrowserConsoleMessages & String = js.native
    
    /* "get-native-dialog-history" */ val getNativeDialogHistory: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.getNativeDialogHistory & String = js.native
    
    /* "hide-assertion-retries-status" */ val hideAssertionRetriesStatus: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.hideAssertionRetriesStatus & String = js.native
    
    /* "hover" */ val hover: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.hover & String = js.native
    
    /* "maximize-window" */ val maximizeWindow: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.maximizeWindow & String = js.native
    
    /* "navigate-to" */ val navigateTo: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.navigateTo & String = js.native
    
    /* "prepare-browser-manipulation" */ val prepareBrowserManipulation: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.prepareBrowserManipulation & String = js.native
    
    /* "press-key" */ val pressKey: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.pressKey & String = js.native
    
    /* "recorder" */ val recorder: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.recorder & String = js.native
    
    /* "resize-window" */ val resizeWindow: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.resizeWindow & String = js.native
    
    /* "resize-window-to-fit-device" */ val resizeWindowToFitDevice: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.resizeWindowToFitDevice & String = js.native
    
    /* "right-click" */ val rightClick: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.rightClick & String = js.native
    
    /* "select-editable-content" */ val selectEditableContent: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.selectEditableContent & String = js.native
    
    /* "select-text" */ val selectText: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.selectText & String = js.native
    
    /* "select-text-area-content" */ val selectTextAreaContent: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.selectTextAreaContent & String = js.native
    
    /* "set-breakpoint" */ val setBreakpoint: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.setBreakpoint & String = js.native
    
    /* "set-files-to-upload" */ val setFilesToUpload: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.setFilesToUpload & String = js.native
    
    /* "set-native-dialog-handler" */ val setNativeDialogHandler: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.setNativeDialogHandler & String = js.native
    
    /* "set-page-load-timeout" */ val setPageLoadTimeout: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.setPageLoadTimeout & String = js.native
    
    /* "set-test-speed" */ val setTestSpeed: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.setTestSpeed & String = js.native
    
    /* "show-assertion-retries-status" */ val showAssertionRetriesStatus: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.showAssertionRetriesStatus & String = js.native
    
    /* "switch-to-iframe" */ val switchToIframe: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.switchToIframe & String = js.native
    
    /* "switch-to-main-window" */ val switchToMainWindow: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.switchToMainWindow & String = js.native
    
    /* "take-element-screenshot" */ val takeElementScreenshot: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.takeElementScreenshot & String = js.native
    
    /* "take-screenshot" */ val takeScreenshot: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.takeScreenshot & String = js.native
    
    /* "take-screenshot-on-fail" */ val takeScreenshotOnFail: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.takeScreenshotOnFail & String = js.native
    
    /* "test-done" */ val testDone: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.testDone & String = js.native
    
    /* "type-text" */ val typeText: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.typeText & String = js.native
    
    /* "unlock-page" */ val unlockPage: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.unlockPage & String = js.native
    
    /* "useRole" */ val useRole: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.CommandType.useRole & String = js.native
    
    /* "wait" */ @JSName("wait")
    val wait_ : wait & String = js.native
  }
  
  inline def MaxLengthString[N /* <: Double */](len: N): BrandC[
    StringC, 
    typingsJapgolly.testcafeReporterDashboard.libTypesCommonMod.MaxLengthString[N]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("MaxLengthString")(len.asInstanceOf[js.Any]).asInstanceOf[BrandC[
    StringC, 
    typingsJapgolly.testcafeReporterDashboard.libTypesCommonMod.MaxLengthString[N]
  ]]
  
  @JSImport("testcafe-reporter-dashboard", "NameSchema")
  @js.native
  val NameSchema: BrandC[StringC, MaxLengthString[`300`]] = js.native
  
  @JSImport("testcafe-reporter-dashboard", "ReportWarningsSchema")
  @js.native
  val ReportWarningsSchema: ReadonlyC[ExactC[TypeC[TestId]]] = js.native
  
  @JSImport("testcafe-reporter-dashboard", "ReportedFixtureItemSchema")
  @js.native
  val ReportedFixtureItemSchema: ReadonlyC[ExactC[TypeC[Name]]] = js.native
  
  @JSImport("testcafe-reporter-dashboard", "ReportedTestItemSchema")
  @js.native
  val ReportedTestItemSchema: ReadonlyC[ExactC[TypeC[Id]]] = js.native
  
  @JSImport("testcafe-reporter-dashboard", "ReportedTestStructureItemSchema")
  @js.native
  val ReportedTestStructureItemSchema: ReadonlyC[ExactC[TypeC[Fixture]]] = js.native
  
  @JSImport("testcafe-reporter-dashboard", "ShortIdSchema")
  @js.native
  val ShortIdSchema: BrandC[StringC, MaxLengthString[`10`]] = js.native
  
  @JSImport("testcafe-reporter-dashboard", "TaskDoneArgsSchema")
  @js.native
  val TaskDoneArgsSchema: ReadonlyC[ExactC[TypeC[BuildId]]] = js.native
  
  @JSImport("testcafe-reporter-dashboard", "TaskResultSchema")
  @js.native
  val TaskResultSchema: ReadonlyC[ExactC[TypeC[FailedCount]]] = js.native
  
  @JSImport("testcafe-reporter-dashboard", "TaskStartArgsSchema")
  @js.native
  val TaskStartArgsSchema: ReadonlyC[ExactC[TypeC[CiInfo]]] = js.native
  
  @JSImport("testcafe-reporter-dashboard", "TestDoneArgsSchema")
  @js.native
  val TestDoneArgsSchema: ReadonlyC[ExactC[TypeC[Duration]]] = js.native
  
  @JSImport("testcafe-reporter-dashboard", "TestPhase")
  @js.native
  object TestPhase extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.TestPhase & String] = js.native
    
    /* "inBookmarkRestore" */ val inBookmarkRestore: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.TestPhase.inBookmarkRestore & String = js.native
    
    /* "inFixtureAfterEachHook" */ val inFixtureAfterEachHook: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.TestPhase.inFixtureAfterEachHook & String = js.native
    
    /* "inFixtureAfterHook" */ val inFixtureAfterHook: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.TestPhase.inFixtureAfterHook & String = js.native
    
    /* "inFixtureBeforeEachHook" */ val inFixtureBeforeEachHook: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.TestPhase.inFixtureBeforeEachHook & String = js.native
    
    /* "inFixtureBeforeHook" */ val inFixtureBeforeHook: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.TestPhase.inFixtureBeforeHook & String = js.native
    
    /* "inRoleInitializer" */ val inRoleInitializer: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.TestPhase.inRoleInitializer & String = js.native
    
    /* "inTest" */ val inTest: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.TestPhase.inTest & String = js.native
    
    /* "inTestAfterHook" */ val inTestAfterHook: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.TestPhase.inTestAfterHook & String = js.native
    
    /* "inTestBeforeHook" */ val inTestBeforeHook: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.TestPhase.inTestBeforeHook & String = js.native
    
    /* "initial" */ val initial: typingsJapgolly.testcafeReporterDashboard.libTypesTestcafeMod.TestPhase.initial & String = js.native
  }
  
  @JSImport("testcafe-reporter-dashboard", "TestStartArgsSchema")
  @js.native
  val TestStartArgsSchema: ReadonlyC[ExactC[TypeC[TestId]]] = js.native
}
