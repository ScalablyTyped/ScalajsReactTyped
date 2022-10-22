package typingsJapgolly.activexAccess.Access

import typingsJapgolly.activexAccess.activexAccessBooleans.`true`
import typingsJapgolly.activexAccess.activexAccessInts.`0`
import typingsJapgolly.activexAccess.activexAccessInts.`11`
import typingsJapgolly.activexAccess.activexAccessInts.`1`
import typingsJapgolly.activexAccess.activexAccessInts.`20`
import typingsJapgolly.activexAccess.activexAccessInts.`2`
import typingsJapgolly.activexAccess.activexAccessInts.`3`
import typingsJapgolly.activexAccess.activexAccessInts.`4`
import typingsJapgolly.activexAccess.activexAccessInts.`5`
import typingsJapgolly.activexAccess.activexAccessInts.`6`
import typingsJapgolly.activexAccess.activexAccessInts.`70`
import typingsJapgolly.activexAccess.activexAccessInts.`7`
import typingsJapgolly.activexAccess.activexAccessInts.`8`
import typingsJapgolly.activexAccess.activexAccessInts.`9`
import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoCmd extends StObject {
  
  /* private */ @JSName("Access.DoCmd_typekey")
  var AccessDotDoCmd_typekey: DoCmd = js.native
  
  def AddMenu(MenuName: String, MenuMacroName: String): Unit = js.native
  def AddMenu(MenuName: String, MenuMacroName: String, StatusBarText: String): Unit = js.native
  
  def ApplyFilter(): Unit = js.native
  def ApplyFilter(FilterName: String): Unit = js.native
  def ApplyFilter(FilterName: String, WhereCondition: String): Unit = js.native
  def ApplyFilter(FilterName: String, WhereCondition: String, ControlName: Any): Unit = js.native
  def ApplyFilter(FilterName: String, WhereCondition: Unit, ControlName: Any): Unit = js.native
  def ApplyFilter(FilterName: Unit, WhereCondition: String): Unit = js.native
  def ApplyFilter(FilterName: Unit, WhereCondition: String, ControlName: Any): Unit = js.native
  def ApplyFilter(FilterName: Unit, WhereCondition: Unit, ControlName: Any): Unit = js.native
  
  def ApplyFilterOld0(): Unit = js.native
  def ApplyFilterOld0(FilterName: String): Unit = js.native
  def ApplyFilterOld0(FilterName: String, WhereCondition: String): Unit = js.native
  def ApplyFilterOld0(FilterName: Unit, WhereCondition: String): Unit = js.native
  
  def Beep(): Unit = js.native
  
  /** @param DataMode [DataMode=1] */
  def BrowseTo(ObjectType: AcBrowseToObjectType, ObjectName: String): Unit = js.native
  def BrowseTo(ObjectType: AcBrowseToObjectType, ObjectName: String, PathtoSubformControl: String): Unit = js.native
  def BrowseTo(
    ObjectType: AcBrowseToObjectType,
    ObjectName: String,
    PathtoSubformControl: String,
    WhereCondition: String
  ): Unit = js.native
  def BrowseTo(
    ObjectType: AcBrowseToObjectType,
    ObjectName: String,
    PathtoSubformControl: String,
    WhereCondition: String,
    Page: String
  ): Unit = js.native
  def BrowseTo(
    ObjectType: AcBrowseToObjectType,
    ObjectName: String,
    PathtoSubformControl: String,
    WhereCondition: String,
    Page: String,
    DataMode: AcFormOpenDataMode
  ): Unit = js.native
  def BrowseTo(
    ObjectType: AcBrowseToObjectType,
    ObjectName: String,
    PathtoSubformControl: String,
    WhereCondition: String,
    Page: Unit,
    DataMode: AcFormOpenDataMode
  ): Unit = js.native
  def BrowseTo(
    ObjectType: AcBrowseToObjectType,
    ObjectName: String,
    PathtoSubformControl: String,
    WhereCondition: Unit,
    Page: String
  ): Unit = js.native
  def BrowseTo(
    ObjectType: AcBrowseToObjectType,
    ObjectName: String,
    PathtoSubformControl: String,
    WhereCondition: Unit,
    Page: String,
    DataMode: AcFormOpenDataMode
  ): Unit = js.native
  def BrowseTo(
    ObjectType: AcBrowseToObjectType,
    ObjectName: String,
    PathtoSubformControl: String,
    WhereCondition: Unit,
    Page: Unit,
    DataMode: AcFormOpenDataMode
  ): Unit = js.native
  def BrowseTo(
    ObjectType: AcBrowseToObjectType,
    ObjectName: String,
    PathtoSubformControl: Unit,
    WhereCondition: String
  ): Unit = js.native
  def BrowseTo(
    ObjectType: AcBrowseToObjectType,
    ObjectName: String,
    PathtoSubformControl: Unit,
    WhereCondition: String,
    Page: String
  ): Unit = js.native
  def BrowseTo(
    ObjectType: AcBrowseToObjectType,
    ObjectName: String,
    PathtoSubformControl: Unit,
    WhereCondition: String,
    Page: String,
    DataMode: AcFormOpenDataMode
  ): Unit = js.native
  def BrowseTo(
    ObjectType: AcBrowseToObjectType,
    ObjectName: String,
    PathtoSubformControl: Unit,
    WhereCondition: String,
    Page: Unit,
    DataMode: AcFormOpenDataMode
  ): Unit = js.native
  def BrowseTo(
    ObjectType: AcBrowseToObjectType,
    ObjectName: String,
    PathtoSubformControl: Unit,
    WhereCondition: Unit,
    Page: String
  ): Unit = js.native
  def BrowseTo(
    ObjectType: AcBrowseToObjectType,
    ObjectName: String,
    PathtoSubformControl: Unit,
    WhereCondition: Unit,
    Page: String,
    DataMode: AcFormOpenDataMode
  ): Unit = js.native
  def BrowseTo(
    ObjectType: AcBrowseToObjectType,
    ObjectName: String,
    PathtoSubformControl: Unit,
    WhereCondition: Unit,
    Page: Unit,
    DataMode: AcFormOpenDataMode
  ): Unit = js.native
  
  def CancelEvent(): Unit = js.native
  
  def ClearMacroError(): Unit = js.native
  
  def Close(): Unit = js.native
  /**
    * @param ObjectType [ObjectType=-1]
    * @param Save [Save=0]
    */
  def Close(ObjectType: AcObjectType, ObjectName: String): Unit = js.native
  def Close(ObjectType: AcObjectType, ObjectName: String, Save: AcCloseSave): Unit = js.native
  
  def CloseDatabase(): Unit = js.native
  
  def CopyDatabaseFile(DatabaseFileName: String): Unit = js.native
  def CopyDatabaseFile(DatabaseFileName: String, OverwriteExistingFile: Boolean): Unit = js.native
  def CopyDatabaseFile(DatabaseFileName: String, OverwriteExistingFile: Boolean, DisconnectAllUsers: Boolean): Unit = js.native
  def CopyDatabaseFile(DatabaseFileName: String, OverwriteExistingFile: Unit, DisconnectAllUsers: Boolean): Unit = js.native
  
  /** @param SourceObjectType [SourceObjectType=-1] */
  def CopyObject(DestinationDatabase: String, NewName: String): Unit = js.native
  def CopyObject(DestinationDatabase: String, NewName: String, SourceObjectType: Unit, SourceObjectName: String): Unit = js.native
  def CopyObject(DestinationDatabase: String, NewName: String, SourceObjectType: AcObjectType): Unit = js.native
  def CopyObject(
    DestinationDatabase: String,
    NewName: String,
    SourceObjectType: AcObjectType,
    SourceObjectName: String
  ): Unit = js.native
  
  /** @param ObjectType [ObjectType=-1] */
  def DeleteObject(): Unit = js.native
  def DeleteObject(ObjectType: Unit, ObjectName: String): Unit = js.native
  def DeleteObject(ObjectType: AcObjectType): Unit = js.native
  def DeleteObject(ObjectType: AcObjectType, ObjectName: String): Unit = js.native
  
  def DoMenuItem(
    MenuBar: Double,
    MenuName: `0` | `1` | `5`,
    Command: `0` | `4` | `5` | `1` | `2` | `3` | `6` | `8` | `9`
  ): Unit = js.native
  def DoMenuItem(
    MenuBar: Double,
    MenuName: `0` | `1` | `5`,
    Command: `0` | `4` | `5` | `1` | `2` | `3` | `6` | `8` | `9`,
    Subcommand: `0` | `3`
  ): Unit = js.native
  def DoMenuItem(
    MenuBar: Double,
    MenuName: `0` | `1` | `5`,
    Command: `0` | `4` | `5` | `1` | `2` | `3` | `6` | `8` | `9`,
    Subcommand: `0` | `3`,
    Version: `70` | `20` | `11`
  ): Unit = js.native
  def DoMenuItem(
    MenuBar: Double,
    MenuName: `0` | `1` | `5`,
    Command: `0` | `4` | `5` | `1` | `2` | `3` | `6` | `8` | `9`,
    Subcommand: Double
  ): Unit = js.native
  def DoMenuItem(
    MenuBar: Double,
    MenuName: `0` | `1` | `5`,
    Command: `0` | `4` | `5` | `1` | `2` | `3` | `6` | `8` | `9`,
    Subcommand: Double,
    Version: `70` | `20` | `11`
  ): Unit = js.native
  def DoMenuItem(
    MenuBar: Double,
    MenuName: `0` | `1` | `5`,
    Command: `0` | `4` | `5` | `1` | `2` | `3` | `6` | `8` | `9`,
    Subcommand: Unit,
    Version: `70` | `20` | `11`
  ): Unit = js.native
  def DoMenuItem(MenuBar: Double, MenuName: `0` | `1` | `5`, Command: Double): Unit = js.native
  def DoMenuItem(MenuBar: Double, MenuName: `0` | `1` | `5`, Command: Double, Subcommand: `0` | `3`): Unit = js.native
  def DoMenuItem(
    MenuBar: Double,
    MenuName: `0` | `1` | `5`,
    Command: Double,
    Subcommand: `0` | `3`,
    Version: `70` | `20` | `11`
  ): Unit = js.native
  def DoMenuItem(MenuBar: Double, MenuName: `0` | `1` | `5`, Command: Double, Subcommand: Double): Unit = js.native
  def DoMenuItem(
    MenuBar: Double,
    MenuName: `0` | `1` | `5`,
    Command: Double,
    Subcommand: Double,
    Version: `70` | `20` | `11`
  ): Unit = js.native
  def DoMenuItem(
    MenuBar: Double,
    MenuName: `0` | `1` | `5`,
    Command: Double,
    Subcommand: Unit,
    Version: `70` | `20` | `11`
  ): Unit = js.native
  def DoMenuItem(MenuBar: Double, MenuName: Double, Command: `0` | `4` | `5` | `1` | `2` | `3` | `6` | `8` | `9`): Unit = js.native
  def DoMenuItem(
    MenuBar: Double,
    MenuName: Double,
    Command: `0` | `4` | `5` | `1` | `2` | `3` | `6` | `8` | `9`,
    Subcommand: `0` | `3`
  ): Unit = js.native
  def DoMenuItem(
    MenuBar: Double,
    MenuName: Double,
    Command: `0` | `4` | `5` | `1` | `2` | `3` | `6` | `8` | `9`,
    Subcommand: `0` | `3`,
    Version: `70` | `20` | `11`
  ): Unit = js.native
  def DoMenuItem(
    MenuBar: Double,
    MenuName: Double,
    Command: `0` | `4` | `5` | `1` | `2` | `3` | `6` | `8` | `9`,
    Subcommand: Double
  ): Unit = js.native
  def DoMenuItem(
    MenuBar: Double,
    MenuName: Double,
    Command: `0` | `4` | `5` | `1` | `2` | `3` | `6` | `8` | `9`,
    Subcommand: Double,
    Version: `70` | `20` | `11`
  ): Unit = js.native
  def DoMenuItem(
    MenuBar: Double,
    MenuName: Double,
    Command: `0` | `4` | `5` | `1` | `2` | `3` | `6` | `8` | `9`,
    Subcommand: Unit,
    Version: `70` | `20` | `11`
  ): Unit = js.native
  /** @deprecated Use the **RunCommand** method */
  def DoMenuItem(MenuBar: Double, MenuName: Double, Command: Double): Unit = js.native
  def DoMenuItem(MenuBar: Double, MenuName: Double, Command: Double, Subcommand: `0` | `3`): Unit = js.native
  def DoMenuItem(
    MenuBar: Double,
    MenuName: Double,
    Command: Double,
    Subcommand: `0` | `3`,
    Version: `70` | `20` | `11`
  ): Unit = js.native
  def DoMenuItem(MenuBar: Double, MenuName: Double, Command: Double, Subcommand: Double): Unit = js.native
  def DoMenuItem(
    MenuBar: Double,
    MenuName: Double,
    Command: Double,
    Subcommand: Double,
    Version: `70` | `20` | `11`
  ): Unit = js.native
  def DoMenuItem(MenuBar: Double, MenuName: Double, Command: Double, Subcommand: Unit, Version: `70` | `20` | `11`): Unit = js.native
  def DoMenuItem(
    MenuBar: `0`,
    MenuName: `0` | `1` | `5`,
    Command: `0` | `4` | `5` | `1` | `2` | `3` | `6` | `8` | `9`
  ): Unit = js.native
  def DoMenuItem(
    MenuBar: `0`,
    MenuName: `0` | `1` | `5`,
    Command: `0` | `4` | `5` | `1` | `2` | `3` | `6` | `8` | `9`,
    Subcommand: `0` | `3`
  ): Unit = js.native
  def DoMenuItem(
    MenuBar: `0`,
    MenuName: `0` | `1` | `5`,
    Command: `0` | `4` | `5` | `1` | `2` | `3` | `6` | `8` | `9`,
    Subcommand: `0` | `3`,
    Version: `70` | `20` | `11`
  ): Unit = js.native
  def DoMenuItem(
    MenuBar: `0`,
    MenuName: `0` | `1` | `5`,
    Command: `0` | `4` | `5` | `1` | `2` | `3` | `6` | `8` | `9`,
    Subcommand: Double
  ): Unit = js.native
  def DoMenuItem(
    MenuBar: `0`,
    MenuName: `0` | `1` | `5`,
    Command: `0` | `4` | `5` | `1` | `2` | `3` | `6` | `8` | `9`,
    Subcommand: Double,
    Version: `70` | `20` | `11`
  ): Unit = js.native
  def DoMenuItem(
    MenuBar: `0`,
    MenuName: `0` | `1` | `5`,
    Command: `0` | `4` | `5` | `1` | `2` | `3` | `6` | `8` | `9`,
    Subcommand: Unit,
    Version: `70` | `20` | `11`
  ): Unit = js.native
  def DoMenuItem(MenuBar: `0`, MenuName: `0` | `1` | `5`, Command: Double): Unit = js.native
  def DoMenuItem(MenuBar: `0`, MenuName: `0` | `1` | `5`, Command: Double, Subcommand: `0` | `3`): Unit = js.native
  def DoMenuItem(
    MenuBar: `0`,
    MenuName: `0` | `1` | `5`,
    Command: Double,
    Subcommand: `0` | `3`,
    Version: `70` | `20` | `11`
  ): Unit = js.native
  def DoMenuItem(MenuBar: `0`, MenuName: `0` | `1` | `5`, Command: Double, Subcommand: Double): Unit = js.native
  def DoMenuItem(
    MenuBar: `0`,
    MenuName: `0` | `1` | `5`,
    Command: Double,
    Subcommand: Double,
    Version: `70` | `20` | `11`
  ): Unit = js.native
  def DoMenuItem(
    MenuBar: `0`,
    MenuName: `0` | `1` | `5`,
    Command: Double,
    Subcommand: Unit,
    Version: `70` | `20` | `11`
  ): Unit = js.native
  def DoMenuItem(MenuBar: `0`, MenuName: Double, Command: `0` | `4` | `5` | `1` | `2` | `3` | `6` | `8` | `9`): Unit = js.native
  def DoMenuItem(
    MenuBar: `0`,
    MenuName: Double,
    Command: `0` | `4` | `5` | `1` | `2` | `3` | `6` | `8` | `9`,
    Subcommand: `0` | `3`
  ): Unit = js.native
  def DoMenuItem(
    MenuBar: `0`,
    MenuName: Double,
    Command: `0` | `4` | `5` | `1` | `2` | `3` | `6` | `8` | `9`,
    Subcommand: `0` | `3`,
    Version: `70` | `20` | `11`
  ): Unit = js.native
  def DoMenuItem(
    MenuBar: `0`,
    MenuName: Double,
    Command: `0` | `4` | `5` | `1` | `2` | `3` | `6` | `8` | `9`,
    Subcommand: Double
  ): Unit = js.native
  def DoMenuItem(
    MenuBar: `0`,
    MenuName: Double,
    Command: `0` | `4` | `5` | `1` | `2` | `3` | `6` | `8` | `9`,
    Subcommand: Double,
    Version: `70` | `20` | `11`
  ): Unit = js.native
  def DoMenuItem(
    MenuBar: `0`,
    MenuName: Double,
    Command: `0` | `4` | `5` | `1` | `2` | `3` | `6` | `8` | `9`,
    Subcommand: Unit,
    Version: `70` | `20` | `11`
  ): Unit = js.native
  def DoMenuItem(MenuBar: `0`, MenuName: Double, Command: Double, Subcommand: `0` | `3`): Unit = js.native
  def DoMenuItem(
    MenuBar: `0`,
    MenuName: Double,
    Command: Double,
    Subcommand: `0` | `3`,
    Version: `70` | `20` | `11`
  ): Unit = js.native
  def DoMenuItem(MenuBar: `0`, MenuName: Double, Command: Double, Subcommand: Double, Version: `70` | `20` | `11`): Unit = js.native
  def DoMenuItem(MenuBar: `0`, MenuName: Double, Command: Double, Subcommand: Unit, Version: `70` | `20` | `11`): Unit = js.native
  @JSName("DoMenuItem")
  def DoMenuItem_0(MenuBar: `0`, MenuName: Double, Command: Double): Unit = js.native
  @JSName("DoMenuItem")
  def DoMenuItem_0(MenuBar: `0`, MenuName: Double, Command: Double, Subcommand: Double): Unit = js.native
  
  def Echo(EchoOn: Boolean): Unit = js.native
  def Echo(EchoOn: Boolean, StatusBarText: String): Unit = js.native
  
  def FindNext(): Unit = js.native
  
  /**
    * @param Match [Match=1]
    * @param MatchCase [MatchCase=false]
    * @param Search [Search=2]
    * @param SearchAsFormatted [SearchAsFormatted=false]
    * @param OnlyCurrentField [OnlyCurrentField=-1]
    */
  def FindRecord(
    FindWhat: String | Double | VarDate,
    Match: js.UndefOr[AcFindMatch],
    MatchCase: js.UndefOr[Boolean],
    Search: js.UndefOr[AcSearchDirection],
    SearchAsFormatted: js.UndefOr[Boolean],
    OnlyCurrentField: js.UndefOr[AcFindField],
    FindFirst: js.UndefOr[Boolean]
  ): Unit = js.native
  
  def GoToControl(ControlName: String): Unit = js.native
  
  def GoToPage(PageNumber: Double): Unit = js.native
  def GoToPage(PageNumber: Double, Right: Double): Unit = js.native
  def GoToPage(PageNumber: Double, Right: Double, Down: Double): Unit = js.native
  def GoToPage(PageNumber: Double, Right: Unit, Down: Double): Unit = js.native
  
  /**
    * @param ObjectType [ObjectType=-1]
    * @param Record [Record=1]
    */
  def GoToRecord(): Unit = js.native
  def GoToRecord(ObjectType: Unit, ObjectName: String): Unit = js.native
  def GoToRecord(ObjectType: Unit, ObjectName: String, Record: `2` | `3` | `5`): Unit = js.native
  def GoToRecord(ObjectType: Unit, ObjectName: String, Record: Unit, Offset: `1` | `0` | `4`): Unit = js.native
  def GoToRecord(ObjectType: Unit, ObjectName: String, Record: AcRecord): Unit = js.native
  def GoToRecord(ObjectType: Unit, ObjectName: String, Record: AcRecord, Offset: `1` | `0` | `4`): Unit = js.native
  def GoToRecord(ObjectType: Unit, ObjectName: Unit, Record: `2` | `3` | `5`): Unit = js.native
  def GoToRecord(ObjectType: Unit, ObjectName: Unit, Record: Unit, Offset: `1` | `0` | `4`): Unit = js.native
  def GoToRecord(ObjectType: Unit, ObjectName: Unit, Record: AcRecord): Unit = js.native
  def GoToRecord(ObjectType: Unit, ObjectName: Unit, Record: AcRecord, Offset: `1` | `0` | `4`): Unit = js.native
  def GoToRecord(ObjectType: AcDataObjectType): Unit = js.native
  def GoToRecord(ObjectType: AcDataObjectType, ObjectName: String): Unit = js.native
  def GoToRecord(ObjectType: AcDataObjectType, ObjectName: String, Record: `2` | `3` | `5`): Unit = js.native
  def GoToRecord(ObjectType: AcDataObjectType, ObjectName: String, Record: Unit, Offset: `1` | `0` | `4`): Unit = js.native
  def GoToRecord(ObjectType: AcDataObjectType, ObjectName: String, Record: AcRecord): Unit = js.native
  def GoToRecord(ObjectType: AcDataObjectType, ObjectName: String, Record: AcRecord, Offset: `1` | `0` | `4`): Unit = js.native
  def GoToRecord(ObjectType: AcDataObjectType, ObjectName: Unit, Record: `2` | `3` | `5`): Unit = js.native
  def GoToRecord(ObjectType: AcDataObjectType, ObjectName: Unit, Record: Unit, Offset: `1` | `0` | `4`): Unit = js.native
  def GoToRecord(ObjectType: AcDataObjectType, ObjectName: Unit, Record: AcRecord): Unit = js.native
  def GoToRecord(ObjectType: AcDataObjectType, ObjectName: Unit, Record: AcRecord, Offset: `1` | `0` | `4`): Unit = js.native
  
  def Hourglass(HourglassOn: Boolean): Unit = js.native
  
  def LockNavigationPane(Lock: Boolean): Unit = js.native
  
  def Maximize(): Unit = js.native
  
  def Minimize(): Unit = js.native
  
  def MoveSize(): Unit = js.native
  def MoveSize(Right: Double): Unit = js.native
  def MoveSize(Right: Double, Down: Double): Unit = js.native
  def MoveSize(Right: Double, Down: Double, Width: Double): Unit = js.native
  def MoveSize(Right: Double, Down: Double, Width: Double, Height: Double): Unit = js.native
  def MoveSize(Right: Double, Down: Double, Width: Unit, Height: Double): Unit = js.native
  def MoveSize(Right: Double, Down: Unit, Width: Double): Unit = js.native
  def MoveSize(Right: Double, Down: Unit, Width: Double, Height: Double): Unit = js.native
  def MoveSize(Right: Double, Down: Unit, Width: Unit, Height: Double): Unit = js.native
  def MoveSize(Right: Unit, Down: Double): Unit = js.native
  def MoveSize(Right: Unit, Down: Double, Width: Double): Unit = js.native
  def MoveSize(Right: Unit, Down: Double, Width: Double, Height: Double): Unit = js.native
  def MoveSize(Right: Unit, Down: Double, Width: Unit, Height: Double): Unit = js.native
  def MoveSize(Right: Unit, Down: Unit, Width: Double): Unit = js.native
  def MoveSize(Right: Unit, Down: Unit, Width: Double, Height: Double): Unit = js.native
  def MoveSize(Right: Unit, Down: Unit, Width: Unit, Height: Double): Unit = js.native
  
  def NavigateTo(): Unit = js.native
  def NavigateTo(Category: Any): Unit = js.native
  def NavigateTo(Category: Any, Group: Any): Unit = js.native
  def NavigateTo(Category: Unit, Group: Any): Unit = js.native
  
  /** @param View [View=0] */
  def OpenDataAccessPage(DataAccessPageName: String): Unit = js.native
  def OpenDataAccessPage(DataAccessPageName: String, View: AcDataAccessPageView): Unit = js.native
  
  def OpenDiagram(DiagramName: String): Unit = js.native
  
  /**
    * @param View [View=0]
    * @param DataMode [DataMode=-1]
    * @param WindowMode [WindowMode=0]
    */
  def OpenForm(
    FormName: String,
    View: js.UndefOr[AcFormView],
    FilterName: js.UndefOr[String],
    WhereCondition: js.UndefOr[String],
    DataMode: js.UndefOr[AcFormOpenDataMode],
    WindowMode: js.UndefOr[AcWindowMode],
    OpenArgs: js.UndefOr[String]
  ): Unit = js.native
  
  /**
    * @param View [View=0]
    * @param DataMode [DataMode=1]
    */
  def OpenFunction(FunctionName: String): Unit = js.native
  def OpenFunction(FunctionName: String, View: Unit, DataMode: AcOpenDataMode): Unit = js.native
  def OpenFunction(FunctionName: String, View: AcView): Unit = js.native
  def OpenFunction(FunctionName: String, View: AcView, DataMode: AcOpenDataMode): Unit = js.native
  
  def OpenModule(): Unit = js.native
  def OpenModule(ModuleName: String): Unit = js.native
  def OpenModule(ModuleName: String, ProcedureName: String): Unit = js.native
  def OpenModule(ModuleName: Unit, ProcedureName: String): Unit = js.native
  
  /**
    * @param View [View=0]
    * @param DataMode [DataMode=1]
    */
  def OpenQuery(QueryName: String): Unit = js.native
  def OpenQuery(QueryName: String, View: Unit, DataMode: AcOpenDataMode): Unit = js.native
  def OpenQuery(QueryName: String, View: AcView): Unit = js.native
  def OpenQuery(QueryName: String, View: AcView, DataMode: AcOpenDataMode): Unit = js.native
  
  /**
    * @param View [View=0]
    * @param WindowMode [WindowMode=0]
    */
  def OpenReport(ReportName: String): Unit = js.native
  def OpenReport(ReportName: String, View: Unit, FilterName: String): Unit = js.native
  def OpenReport(ReportName: String, View: Unit, FilterName: String, WhereCondition: String): Unit = js.native
  def OpenReport(
    ReportName: String,
    View: Unit,
    FilterName: String,
    WhereCondition: String,
    WindowMode: Unit,
    OpenArgs: String
  ): Unit = js.native
  def OpenReport(
    ReportName: String,
    View: Unit,
    FilterName: String,
    WhereCondition: String,
    WindowMode: AcWindowMode
  ): Unit = js.native
  def OpenReport(
    ReportName: String,
    View: Unit,
    FilterName: String,
    WhereCondition: String,
    WindowMode: AcWindowMode,
    OpenArgs: String
  ): Unit = js.native
  def OpenReport(
    ReportName: String,
    View: Unit,
    FilterName: String,
    WhereCondition: Unit,
    WindowMode: Unit,
    OpenArgs: String
  ): Unit = js.native
  def OpenReport(ReportName: String, View: Unit, FilterName: String, WhereCondition: Unit, WindowMode: AcWindowMode): Unit = js.native
  def OpenReport(
    ReportName: String,
    View: Unit,
    FilterName: String,
    WhereCondition: Unit,
    WindowMode: AcWindowMode,
    OpenArgs: String
  ): Unit = js.native
  def OpenReport(ReportName: String, View: Unit, FilterName: Unit, WhereCondition: String): Unit = js.native
  def OpenReport(
    ReportName: String,
    View: Unit,
    FilterName: Unit,
    WhereCondition: String,
    WindowMode: Unit,
    OpenArgs: String
  ): Unit = js.native
  def OpenReport(ReportName: String, View: Unit, FilterName: Unit, WhereCondition: String, WindowMode: AcWindowMode): Unit = js.native
  def OpenReport(
    ReportName: String,
    View: Unit,
    FilterName: Unit,
    WhereCondition: String,
    WindowMode: AcWindowMode,
    OpenArgs: String
  ): Unit = js.native
  def OpenReport(
    ReportName: String,
    View: Unit,
    FilterName: Unit,
    WhereCondition: Unit,
    WindowMode: Unit,
    OpenArgs: String
  ): Unit = js.native
  def OpenReport(ReportName: String, View: Unit, FilterName: Unit, WhereCondition: Unit, WindowMode: AcWindowMode): Unit = js.native
  def OpenReport(
    ReportName: String,
    View: Unit,
    FilterName: Unit,
    WhereCondition: Unit,
    WindowMode: AcWindowMode,
    OpenArgs: String
  ): Unit = js.native
  def OpenReport(ReportName: String, View: AcView): Unit = js.native
  def OpenReport(ReportName: String, View: AcView, FilterName: String): Unit = js.native
  def OpenReport(ReportName: String, View: AcView, FilterName: String, WhereCondition: String): Unit = js.native
  def OpenReport(
    ReportName: String,
    View: AcView,
    FilterName: String,
    WhereCondition: String,
    WindowMode: Unit,
    OpenArgs: String
  ): Unit = js.native
  def OpenReport(
    ReportName: String,
    View: AcView,
    FilterName: String,
    WhereCondition: String,
    WindowMode: AcWindowMode
  ): Unit = js.native
  def OpenReport(
    ReportName: String,
    View: AcView,
    FilterName: String,
    WhereCondition: String,
    WindowMode: AcWindowMode,
    OpenArgs: String
  ): Unit = js.native
  def OpenReport(
    ReportName: String,
    View: AcView,
    FilterName: String,
    WhereCondition: Unit,
    WindowMode: Unit,
    OpenArgs: String
  ): Unit = js.native
  def OpenReport(
    ReportName: String,
    View: AcView,
    FilterName: String,
    WhereCondition: Unit,
    WindowMode: AcWindowMode
  ): Unit = js.native
  def OpenReport(
    ReportName: String,
    View: AcView,
    FilterName: String,
    WhereCondition: Unit,
    WindowMode: AcWindowMode,
    OpenArgs: String
  ): Unit = js.native
  def OpenReport(ReportName: String, View: AcView, FilterName: Unit, WhereCondition: String): Unit = js.native
  def OpenReport(
    ReportName: String,
    View: AcView,
    FilterName: Unit,
    WhereCondition: String,
    WindowMode: Unit,
    OpenArgs: String
  ): Unit = js.native
  def OpenReport(
    ReportName: String,
    View: AcView,
    FilterName: Unit,
    WhereCondition: String,
    WindowMode: AcWindowMode
  ): Unit = js.native
  def OpenReport(
    ReportName: String,
    View: AcView,
    FilterName: Unit,
    WhereCondition: String,
    WindowMode: AcWindowMode,
    OpenArgs: String
  ): Unit = js.native
  def OpenReport(
    ReportName: String,
    View: AcView,
    FilterName: Unit,
    WhereCondition: Unit,
    WindowMode: Unit,
    OpenArgs: String
  ): Unit = js.native
  def OpenReport(ReportName: String, View: AcView, FilterName: Unit, WhereCondition: Unit, WindowMode: AcWindowMode): Unit = js.native
  def OpenReport(
    ReportName: String,
    View: AcView,
    FilterName: Unit,
    WhereCondition: Unit,
    WindowMode: AcWindowMode,
    OpenArgs: String
  ): Unit = js.native
  
  /** @param View [View=0] */
  def OpenReportOld0(ReportName: Any): Unit = js.native
  def OpenReportOld0(ReportName: Any, View: Unit, FilterName: Any): Unit = js.native
  def OpenReportOld0(ReportName: Any, View: Unit, FilterName: Any, WhereCondition: Any): Unit = js.native
  def OpenReportOld0(ReportName: Any, View: Unit, FilterName: Unit, WhereCondition: Any): Unit = js.native
  def OpenReportOld0(ReportName: Any, View: AcView): Unit = js.native
  def OpenReportOld0(ReportName: Any, View: AcView, FilterName: Any): Unit = js.native
  def OpenReportOld0(ReportName: Any, View: AcView, FilterName: Any, WhereCondition: Any): Unit = js.native
  def OpenReportOld0(ReportName: Any, View: AcView, FilterName: Unit, WhereCondition: Any): Unit = js.native
  
  /**
    * @param View [View=0]
    * @param DataMode [DataMode=1]
    */
  def OpenStoredProcedure(ProcedureName: String): Unit = js.native
  def OpenStoredProcedure(ProcedureName: String, View: Unit, DataMode: AcOpenDataMode): Unit = js.native
  def OpenStoredProcedure(ProcedureName: String, View: AcView): Unit = js.native
  def OpenStoredProcedure(ProcedureName: String, View: AcView, DataMode: AcOpenDataMode): Unit = js.native
  
  /**
    * @param View [View=0]
    * @param DataMode [DataMode=1]
    */
  def OpenTable(TableName: String): Unit = js.native
  def OpenTable(TableName: String, View: Unit, DataMode: AcOpenDataMode): Unit = js.native
  def OpenTable(TableName: String, View: AcView): Unit = js.native
  def OpenTable(TableName: String, View: AcView, DataMode: AcOpenDataMode): Unit = js.native
  
  /**
    * @param View [View=0]
    * @param DataMode [DataMode=1]
    */
  def OpenView(ViewName: String): Unit = js.native
  def OpenView(ViewName: String, View: Unit, DataMode: AcOpenDataMode): Unit = js.native
  def OpenView(ViewName: String, View: AcView): Unit = js.native
  def OpenView(ViewName: String, View: AcView, DataMode: AcOpenDataMode): Unit = js.native
  
  /** @param OutputQuality [OutputQuality=0] */
  def OutputTo(
    ObjectType: AcOutputObjectType,
    ObjectName: js.UndefOr[String],
    OutputFormat: js.UndefOr[AcOutputFormat],
    OutputFile: js.UndefOr[String],
    AutoStart: js.UndefOr[Boolean],
    TemplateFile: js.UndefOr[String],
    Encoding: js.UndefOr[Any],
    OutputQuality: js.UndefOr[AcExportQuality]
  ): Unit = js.native
  /** @param OutputQuality [OutputQuality=0] */
  def OutputTo(
    ObjectType: `5`,
    ObjectName: String,
    OutputFormat: /* MS-DOS Text (*.txt) */ String,
    OutputFile: String,
    AutoStart: Boolean,
    TemplateFile: String,
    Encoding: Any
  ): Unit = js.native
  def OutputTo(
    ObjectType: `5`,
    ObjectName: String,
    OutputFormat: /* MS-DOS Text (*.txt) */ String,
    OutputFile: String,
    AutoStart: Boolean,
    TemplateFile: String,
    Encoding: Any,
    OutputQuality: AcExportQuality
  ): Unit = js.native
  
  def OutputToOld0(ObjectType: AcOutputObjectType): Unit = js.native
  def OutputToOld0(ObjectType: AcOutputObjectType, ObjectName: Any): Unit = js.native
  def OutputToOld0(ObjectType: AcOutputObjectType, ObjectName: Any, OutputFormat: Any): Unit = js.native
  def OutputToOld0(ObjectType: AcOutputObjectType, ObjectName: Any, OutputFormat: Any, OutputFile: Any): Unit = js.native
  def OutputToOld0(
    ObjectType: AcOutputObjectType,
    ObjectName: Any,
    OutputFormat: Any,
    OutputFile: Any,
    AutoStart: Any
  ): Unit = js.native
  def OutputToOld0(
    ObjectType: AcOutputObjectType,
    ObjectName: Any,
    OutputFormat: Any,
    OutputFile: Any,
    AutoStart: Any,
    TemplateFile: Any
  ): Unit = js.native
  def OutputToOld0(
    ObjectType: AcOutputObjectType,
    ObjectName: Any,
    OutputFormat: Any,
    OutputFile: Any,
    AutoStart: Unit,
    TemplateFile: Any
  ): Unit = js.native
  def OutputToOld0(
    ObjectType: AcOutputObjectType,
    ObjectName: Any,
    OutputFormat: Any,
    OutputFile: Unit,
    AutoStart: Any
  ): Unit = js.native
  def OutputToOld0(
    ObjectType: AcOutputObjectType,
    ObjectName: Any,
    OutputFormat: Any,
    OutputFile: Unit,
    AutoStart: Any,
    TemplateFile: Any
  ): Unit = js.native
  def OutputToOld0(
    ObjectType: AcOutputObjectType,
    ObjectName: Any,
    OutputFormat: Any,
    OutputFile: Unit,
    AutoStart: Unit,
    TemplateFile: Any
  ): Unit = js.native
  def OutputToOld0(ObjectType: AcOutputObjectType, ObjectName: Any, OutputFormat: Unit, OutputFile: Any): Unit = js.native
  def OutputToOld0(
    ObjectType: AcOutputObjectType,
    ObjectName: Any,
    OutputFormat: Unit,
    OutputFile: Any,
    AutoStart: Any
  ): Unit = js.native
  def OutputToOld0(
    ObjectType: AcOutputObjectType,
    ObjectName: Any,
    OutputFormat: Unit,
    OutputFile: Any,
    AutoStart: Any,
    TemplateFile: Any
  ): Unit = js.native
  def OutputToOld0(
    ObjectType: AcOutputObjectType,
    ObjectName: Any,
    OutputFormat: Unit,
    OutputFile: Any,
    AutoStart: Unit,
    TemplateFile: Any
  ): Unit = js.native
  def OutputToOld0(
    ObjectType: AcOutputObjectType,
    ObjectName: Any,
    OutputFormat: Unit,
    OutputFile: Unit,
    AutoStart: Any
  ): Unit = js.native
  def OutputToOld0(
    ObjectType: AcOutputObjectType,
    ObjectName: Any,
    OutputFormat: Unit,
    OutputFile: Unit,
    AutoStart: Any,
    TemplateFile: Any
  ): Unit = js.native
  def OutputToOld0(
    ObjectType: AcOutputObjectType,
    ObjectName: Any,
    OutputFormat: Unit,
    OutputFile: Unit,
    AutoStart: Unit,
    TemplateFile: Any
  ): Unit = js.native
  def OutputToOld0(ObjectType: AcOutputObjectType, ObjectName: Unit, OutputFormat: Any): Unit = js.native
  def OutputToOld0(ObjectType: AcOutputObjectType, ObjectName: Unit, OutputFormat: Any, OutputFile: Any): Unit = js.native
  def OutputToOld0(
    ObjectType: AcOutputObjectType,
    ObjectName: Unit,
    OutputFormat: Any,
    OutputFile: Any,
    AutoStart: Any
  ): Unit = js.native
  def OutputToOld0(
    ObjectType: AcOutputObjectType,
    ObjectName: Unit,
    OutputFormat: Any,
    OutputFile: Any,
    AutoStart: Any,
    TemplateFile: Any
  ): Unit = js.native
  def OutputToOld0(
    ObjectType: AcOutputObjectType,
    ObjectName: Unit,
    OutputFormat: Any,
    OutputFile: Any,
    AutoStart: Unit,
    TemplateFile: Any
  ): Unit = js.native
  def OutputToOld0(
    ObjectType: AcOutputObjectType,
    ObjectName: Unit,
    OutputFormat: Any,
    OutputFile: Unit,
    AutoStart: Any
  ): Unit = js.native
  def OutputToOld0(
    ObjectType: AcOutputObjectType,
    ObjectName: Unit,
    OutputFormat: Any,
    OutputFile: Unit,
    AutoStart: Any,
    TemplateFile: Any
  ): Unit = js.native
  def OutputToOld0(
    ObjectType: AcOutputObjectType,
    ObjectName: Unit,
    OutputFormat: Any,
    OutputFile: Unit,
    AutoStart: Unit,
    TemplateFile: Any
  ): Unit = js.native
  def OutputToOld0(ObjectType: AcOutputObjectType, ObjectName: Unit, OutputFormat: Unit, OutputFile: Any): Unit = js.native
  def OutputToOld0(
    ObjectType: AcOutputObjectType,
    ObjectName: Unit,
    OutputFormat: Unit,
    OutputFile: Any,
    AutoStart: Any
  ): Unit = js.native
  def OutputToOld0(
    ObjectType: AcOutputObjectType,
    ObjectName: Unit,
    OutputFormat: Unit,
    OutputFile: Any,
    AutoStart: Any,
    TemplateFile: Any
  ): Unit = js.native
  def OutputToOld0(
    ObjectType: AcOutputObjectType,
    ObjectName: Unit,
    OutputFormat: Unit,
    OutputFile: Any,
    AutoStart: Unit,
    TemplateFile: Any
  ): Unit = js.native
  def OutputToOld0(
    ObjectType: AcOutputObjectType,
    ObjectName: Unit,
    OutputFormat: Unit,
    OutputFile: Unit,
    AutoStart: Any
  ): Unit = js.native
  def OutputToOld0(
    ObjectType: AcOutputObjectType,
    ObjectName: Unit,
    OutputFormat: Unit,
    OutputFile: Unit,
    AutoStart: Any,
    TemplateFile: Any
  ): Unit = js.native
  def OutputToOld0(
    ObjectType: AcOutputObjectType,
    ObjectName: Unit,
    OutputFormat: Unit,
    OutputFile: Unit,
    AutoStart: Unit,
    TemplateFile: Any
  ): Unit = js.native
  
  def OutputToOld1(
    ObjectType: AcOutputObjectType,
    ObjectName: js.UndefOr[Any],
    OutputFormat: js.UndefOr[Any],
    OutputFile: js.UndefOr[Any],
    AutoStart: js.UndefOr[Any],
    TemplateFile: js.UndefOr[Any],
    Encoding: js.UndefOr[Any]
  ): Unit = js.native
  
  /**
    * @param PrintRange [PrintRange=0]
    * @param PrintQuality [PrintQuality=0]
    * @param Copies [Copies=1]
    * @param CollateCopies [CollateCopies=true]
    */
  def PrintOut(): Unit = js.native
  def PrintOut(PrintRange: Unit, PageFrom: Unit, PageTo: Unit, PrintQuality: Unit, Copies: Double): Unit = js.native
  def PrintOut(
    PrintRange: Unit,
    PageFrom: Unit,
    PageTo: Unit,
    PrintQuality: Unit,
    Copies: Double,
    CollateCopies: Boolean
  ): Unit = js.native
  def PrintOut(
    PrintRange: Unit,
    PageFrom: Unit,
    PageTo: Unit,
    PrintQuality: Unit,
    Copies: Unit,
    CollateCopies: Boolean
  ): Unit = js.native
  def PrintOut(PrintRange: Unit, PageFrom: Unit, PageTo: Unit, PrintQuality: AcPrintQuality): Unit = js.native
  def PrintOut(PrintRange: Unit, PageFrom: Unit, PageTo: Unit, PrintQuality: AcPrintQuality, Copies: Double): Unit = js.native
  def PrintOut(
    PrintRange: Unit,
    PageFrom: Unit,
    PageTo: Unit,
    PrintQuality: AcPrintQuality,
    Copies: Double,
    CollateCopies: Boolean
  ): Unit = js.native
  def PrintOut(
    PrintRange: Unit,
    PageFrom: Unit,
    PageTo: Unit,
    PrintQuality: AcPrintQuality,
    Copies: Unit,
    CollateCopies: Boolean
  ): Unit = js.native
  def PrintOut(PrintRange: AcPrintRange): Unit = js.native
  def PrintOut(PrintRange: AcPrintRange, PageFrom: Unit, PageTo: Unit, PrintQuality: Unit, Copies: Double): Unit = js.native
  def PrintOut(
    PrintRange: AcPrintRange,
    PageFrom: Unit,
    PageTo: Unit,
    PrintQuality: Unit,
    Copies: Double,
    CollateCopies: Boolean
  ): Unit = js.native
  def PrintOut(
    PrintRange: AcPrintRange,
    PageFrom: Unit,
    PageTo: Unit,
    PrintQuality: Unit,
    Copies: Unit,
    CollateCopies: Boolean
  ): Unit = js.native
  def PrintOut(PrintRange: AcPrintRange, PageFrom: Unit, PageTo: Unit, PrintQuality: AcPrintQuality): Unit = js.native
  def PrintOut(
    PrintRange: AcPrintRange,
    PageFrom: Unit,
    PageTo: Unit,
    PrintQuality: AcPrintQuality,
    Copies: Double
  ): Unit = js.native
  def PrintOut(
    PrintRange: AcPrintRange,
    PageFrom: Unit,
    PageTo: Unit,
    PrintQuality: AcPrintQuality,
    Copies: Double,
    CollateCopies: Boolean
  ): Unit = js.native
  def PrintOut(
    PrintRange: AcPrintRange,
    PageFrom: Unit,
    PageTo: Unit,
    PrintQuality: AcPrintQuality,
    Copies: Unit,
    CollateCopies: Boolean
  ): Unit = js.native
  /**
    * @param PrintRange [PrintRange=0]
    * @param PrintQuality [PrintQuality=0]
    * @param Copies [Copies=1]
    * @param CollateCopies [CollateCopies=true]
    */
  @JSName("PrintOut")
  def PrintOut_2(PrintRange: `2`): Unit = js.native
  @JSName("PrintOut")
  def PrintOut_2(PrintRange: `2`, PageFrom: Double): Unit = js.native
  @JSName("PrintOut")
  def PrintOut_2(PrintRange: `2`, PageFrom: Double, PageTo: Double): Unit = js.native
  @JSName("PrintOut")
  def PrintOut_2(PrintRange: `2`, PageFrom: Double, PageTo: Double, PrintQuality: Unit, Copies: Double): Unit = js.native
  @JSName("PrintOut")
  def PrintOut_2(
    PrintRange: `2`,
    PageFrom: Double,
    PageTo: Double,
    PrintQuality: Unit,
    Copies: Double,
    CollateCopies: Boolean
  ): Unit = js.native
  @JSName("PrintOut")
  def PrintOut_2(
    PrintRange: `2`,
    PageFrom: Double,
    PageTo: Double,
    PrintQuality: Unit,
    Copies: Unit,
    CollateCopies: Boolean
  ): Unit = js.native
  @JSName("PrintOut")
  def PrintOut_2(PrintRange: `2`, PageFrom: Double, PageTo: Double, PrintQuality: AcPrintQuality): Unit = js.native
  @JSName("PrintOut")
  def PrintOut_2(PrintRange: `2`, PageFrom: Double, PageTo: Double, PrintQuality: AcPrintQuality, Copies: Double): Unit = js.native
  @JSName("PrintOut")
  def PrintOut_2(
    PrintRange: `2`,
    PageFrom: Double,
    PageTo: Double,
    PrintQuality: AcPrintQuality,
    Copies: Double,
    CollateCopies: Boolean
  ): Unit = js.native
  @JSName("PrintOut")
  def PrintOut_2(
    PrintRange: `2`,
    PageFrom: Double,
    PageTo: Double,
    PrintQuality: AcPrintQuality,
    Copies: Unit,
    CollateCopies: Boolean
  ): Unit = js.native
  @JSName("PrintOut")
  def PrintOut_2(PrintRange: `2`, PageFrom: Double, PageTo: Unit, PrintQuality: Unit, Copies: Double): Unit = js.native
  @JSName("PrintOut")
  def PrintOut_2(
    PrintRange: `2`,
    PageFrom: Double,
    PageTo: Unit,
    PrintQuality: Unit,
    Copies: Double,
    CollateCopies: Boolean
  ): Unit = js.native
  @JSName("PrintOut")
  def PrintOut_2(
    PrintRange: `2`,
    PageFrom: Double,
    PageTo: Unit,
    PrintQuality: Unit,
    Copies: Unit,
    CollateCopies: Boolean
  ): Unit = js.native
  @JSName("PrintOut")
  def PrintOut_2(PrintRange: `2`, PageFrom: Double, PageTo: Unit, PrintQuality: AcPrintQuality): Unit = js.native
  @JSName("PrintOut")
  def PrintOut_2(PrintRange: `2`, PageFrom: Double, PageTo: Unit, PrintQuality: AcPrintQuality, Copies: Double): Unit = js.native
  @JSName("PrintOut")
  def PrintOut_2(
    PrintRange: `2`,
    PageFrom: Double,
    PageTo: Unit,
    PrintQuality: AcPrintQuality,
    Copies: Double,
    CollateCopies: Boolean
  ): Unit = js.native
  @JSName("PrintOut")
  def PrintOut_2(
    PrintRange: `2`,
    PageFrom: Double,
    PageTo: Unit,
    PrintQuality: AcPrintQuality,
    Copies: Unit,
    CollateCopies: Boolean
  ): Unit = js.native
  @JSName("PrintOut")
  def PrintOut_2(PrintRange: `2`, PageFrom: Unit, PageTo: Double): Unit = js.native
  @JSName("PrintOut")
  def PrintOut_2(PrintRange: `2`, PageFrom: Unit, PageTo: Double, PrintQuality: Unit, Copies: Double): Unit = js.native
  @JSName("PrintOut")
  def PrintOut_2(
    PrintRange: `2`,
    PageFrom: Unit,
    PageTo: Double,
    PrintQuality: Unit,
    Copies: Double,
    CollateCopies: Boolean
  ): Unit = js.native
  @JSName("PrintOut")
  def PrintOut_2(
    PrintRange: `2`,
    PageFrom: Unit,
    PageTo: Double,
    PrintQuality: Unit,
    Copies: Unit,
    CollateCopies: Boolean
  ): Unit = js.native
  @JSName("PrintOut")
  def PrintOut_2(PrintRange: `2`, PageFrom: Unit, PageTo: Double, PrintQuality: AcPrintQuality): Unit = js.native
  @JSName("PrintOut")
  def PrintOut_2(PrintRange: `2`, PageFrom: Unit, PageTo: Double, PrintQuality: AcPrintQuality, Copies: Double): Unit = js.native
  @JSName("PrintOut")
  def PrintOut_2(
    PrintRange: `2`,
    PageFrom: Unit,
    PageTo: Double,
    PrintQuality: AcPrintQuality,
    Copies: Double,
    CollateCopies: Boolean
  ): Unit = js.native
  @JSName("PrintOut")
  def PrintOut_2(
    PrintRange: `2`,
    PageFrom: Unit,
    PageTo: Double,
    PrintQuality: AcPrintQuality,
    Copies: Unit,
    CollateCopies: Boolean
  ): Unit = js.native
  @JSName("PrintOut")
  def PrintOut_2(PrintRange: `2`, PageFrom: Unit, PageTo: Unit, PrintQuality: Unit, Copies: Double): Unit = js.native
  @JSName("PrintOut")
  def PrintOut_2(
    PrintRange: `2`,
    PageFrom: Unit,
    PageTo: Unit,
    PrintQuality: Unit,
    Copies: Double,
    CollateCopies: Boolean
  ): Unit = js.native
  @JSName("PrintOut")
  def PrintOut_2(
    PrintRange: `2`,
    PageFrom: Unit,
    PageTo: Unit,
    PrintQuality: Unit,
    Copies: Unit,
    CollateCopies: Boolean
  ): Unit = js.native
  @JSName("PrintOut")
  def PrintOut_2(PrintRange: `2`, PageFrom: Unit, PageTo: Unit, PrintQuality: AcPrintQuality): Unit = js.native
  @JSName("PrintOut")
  def PrintOut_2(PrintRange: `2`, PageFrom: Unit, PageTo: Unit, PrintQuality: AcPrintQuality, Copies: Double): Unit = js.native
  @JSName("PrintOut")
  def PrintOut_2(
    PrintRange: `2`,
    PageFrom: Unit,
    PageTo: Unit,
    PrintQuality: AcPrintQuality,
    Copies: Double,
    CollateCopies: Boolean
  ): Unit = js.native
  @JSName("PrintOut")
  def PrintOut_2(
    PrintRange: `2`,
    PageFrom: Unit,
    PageTo: Unit,
    PrintQuality: AcPrintQuality,
    Copies: Unit,
    CollateCopies: Boolean
  ): Unit = js.native
  
  /** @param Options [Options=1] */
  def Quit(): Unit = js.native
  def Quit(Options: AcQuitOption): Unit = js.native
  
  def RefreshRecord(): Unit = js.native
  
  def Rename(NewName: String): Unit = js.native
  /** @param ObjectType [ObjectType=-1] */
  def Rename(NewName: String, ObjectType: AcObjectType, OldName: String): Unit = js.native
  
  def RepaintObject(): Unit = js.native
  /** @param ObjectType [ObjectType=-1] */
  def RepaintObject(ObjectType: AcObjectType, ObjectName: String): Unit = js.native
  
  def Requery(): Unit = js.native
  def Requery(ControlName: String): Unit = js.native
  
  def Restore(): Unit = js.native
  
  def RunCommand(Command: AcCommand): Unit = js.native
  
  def RunDataMacro(MacroName: String): Unit = js.native
  
  def RunMacro(MacroName: String): Unit = js.native
  def RunMacro(MacroName: String, RepeatCount: Double): Unit = js.native
  def RunMacro(MacroName: String, RepeatCount: Double, RepeatExpression: String): Unit = js.native
  def RunMacro(MacroName: String, RepeatCount: Unit, RepeatExpression: String): Unit = js.native
  
  def RunSQL(SQLStatement: String): Unit = js.native
  def RunSQL(SQLStatement: String, UseTransaction: Boolean): Unit = js.native
  
  def RunSavedImportExport(SavedImportExportName: String): Unit = js.native
  
  def Save(): Unit = js.native
  def Save(ObjectType: Unit, ObjectName: String): Unit = js.native
  /** @param ObjectType [ObjectType=-1] */
  def Save(ObjectType: AcObjectType, ObjectName: String): Unit = js.native
  
  /**
    * @param ObjectType [ObjectType=-1]
    * @param Record [Record=2]
    */
  def SearchForRecord(): Unit = js.native
  def SearchForRecord(ObjectType: Unit, ObjectName: String): Unit = js.native
  def SearchForRecord(ObjectType: Unit, ObjectName: String, Record: Unit, WhereCondition: String): Unit = js.native
  def SearchForRecord(ObjectType: Unit, ObjectName: String, Record: AcRecord): Unit = js.native
  def SearchForRecord(ObjectType: Unit, ObjectName: String, Record: AcRecord, WhereCondition: String): Unit = js.native
  def SearchForRecord(ObjectType: Unit, ObjectName: Unit, Record: Unit, WhereCondition: String): Unit = js.native
  def SearchForRecord(ObjectType: Unit, ObjectName: Unit, Record: AcRecord): Unit = js.native
  def SearchForRecord(ObjectType: Unit, ObjectName: Unit, Record: AcRecord, WhereCondition: String): Unit = js.native
  def SearchForRecord(ObjectType: AcDataObjectType): Unit = js.native
  def SearchForRecord(ObjectType: AcDataObjectType, ObjectName: String): Unit = js.native
  def SearchForRecord(ObjectType: AcDataObjectType, ObjectName: String, Record: Unit, WhereCondition: String): Unit = js.native
  def SearchForRecord(ObjectType: AcDataObjectType, ObjectName: String, Record: AcRecord): Unit = js.native
  def SearchForRecord(ObjectType: AcDataObjectType, ObjectName: String, Record: AcRecord, WhereCondition: String): Unit = js.native
  def SearchForRecord(ObjectType: AcDataObjectType, ObjectName: Unit, Record: Unit, WhereCondition: String): Unit = js.native
  def SearchForRecord(ObjectType: AcDataObjectType, ObjectName: Unit, Record: AcRecord): Unit = js.native
  def SearchForRecord(ObjectType: AcDataObjectType, ObjectName: Unit, Record: AcRecord, WhereCondition: String): Unit = js.native
  
  def SelectObject(ObjectType: AcObjectType, ObjectName: String): Unit = js.native
  @JSName("SelectObject")
  def SelectObject_true(ObjectType: AcObjectType, ObjectName: String, InDatabaseWindow: `true`): Unit = js.native
  @JSName("SelectObject")
  def SelectObject_true(ObjectType: AcObjectType, ObjectName: Unit, InDatabaseWindow: `true`): Unit = js.native
  
  /** @param ObjectType [ObjectType=-1] */
  def SendObject(
    ObjectType: js.UndefOr[AcSendObjectType],
    ObjectName: js.UndefOr[String],
    OutputFormat: js.UndefOr[AcOutputFormat],
    To: js.UndefOr[String],
    Cc: js.UndefOr[String],
    Bcc: js.UndefOr[String],
    Subject: js.UndefOr[String],
    MessageText: js.UndefOr[String],
    EditMessage: js.UndefOr[Boolean],
    TemplateFile: js.UndefOr[String]
  ): Unit = js.native
  
  def SetDisplayedCategories(Show: Boolean): Unit = js.native
  def SetDisplayedCategories(Show: Boolean, Category: String): Unit = js.native
  
  def SetFilter(): Unit = js.native
  def SetFilter(FilterName: String): Unit = js.native
  def SetFilter(FilterName: String, WhereCondition: String): Unit = js.native
  def SetFilter(FilterName: String, WhereCondition: String, ControlName: String): Unit = js.native
  def SetFilter(FilterName: String, WhereCondition: Unit, ControlName: String): Unit = js.native
  def SetFilter(FilterName: Unit, WhereCondition: String): Unit = js.native
  def SetFilter(FilterName: Unit, WhereCondition: String, ControlName: String): Unit = js.native
  def SetFilter(FilterName: Unit, WhereCondition: Unit, ControlName: String): Unit = js.native
  
  def SetMenuItem(MenuIndex: Double): Unit = js.native
  def SetMenuItem(MenuIndex: Double, CommandIndex: Double): Unit = js.native
  def SetMenuItem(MenuIndex: Double, CommandIndex: Double, SubcommandIndex: Double): Unit = js.native
  def SetMenuItem(MenuIndex: Double, CommandIndex: Double, SubcommandIndex: Double, Flag: AcSetMenuItemState): Unit = js.native
  def SetMenuItem(MenuIndex: Double, CommandIndex: Double, SubcommandIndex: Unit, Flag: AcSetMenuItemState): Unit = js.native
  def SetMenuItem(MenuIndex: Double, CommandIndex: Unit, SubcommandIndex: Double): Unit = js.native
  def SetMenuItem(MenuIndex: Double, CommandIndex: Unit, SubcommandIndex: Double, Flag: AcSetMenuItemState): Unit = js.native
  def SetMenuItem(MenuIndex: Double, CommandIndex: Unit, SubcommandIndex: Unit, Flag: AcSetMenuItemState): Unit = js.native
  
  def SetOrderBy(OrderBy: String): Unit = js.native
  def SetOrderBy(OrderBy: String, ControlName: String): Unit = js.native
  
  def SetParameter(Name: String, Expression: Any): Unit = js.native
  
  /** @param Property [Property=0] */
  def SetProperty(ControlName: String): Unit = js.native
  def SetProperty(ControlName: String, Property: Unit, Value: Any): Unit = js.native
  def SetProperty(ControlName: String, Property: AcProperty): Unit = js.native
  def SetProperty(ControlName: String, Property: AcProperty, Value: Any): Unit = js.native
  
  def SetWarnings(WarningsOn: Boolean): Unit = js.native
  
  def ShowAllRecords(): Unit = js.native
  
  /** @param Show [Show=0] */
  def ShowToolbar(ToolbarName: String): Unit = js.native
  def ShowToolbar(ToolbarName: String, Show: AcShowToolbar): Unit = js.native
  
  def SingleStep(): Unit = js.native
  
  /**
    * @param TransferType [TransferType=0]
    * @param ObjectType [ObjectType=0]
    * @param StructureOnly [StructureOnly=false\]
    * @param StoreLogin [StoreLogin=false]
    */
  def TransferDatabase(
    TransferType: js.UndefOr[AcDataTransferType],
    DatabaseType: js.UndefOr[DatabaseType],
    DatabaseName: js.UndefOr[String],
    ObjectType: js.UndefOr[AcObjectType],
    Source: js.UndefOr[String],
    Destination: js.UndefOr[String],
    StructureOnly: js.UndefOr[Boolean],
    StoreLogin: js.UndefOr[Boolean]
  ): Unit = js.native
  
  def TransferSQLDatabase(Server: String, Database: String): Unit = js.native
  def TransferSQLDatabase(Server: String, Database: String, UseTrustedConnection: Boolean): Unit = js.native
  def TransferSQLDatabase(Server: String, Database: String, UseTrustedConnection: Boolean, Login: String): Unit = js.native
  def TransferSQLDatabase(Server: String, Database: String, UseTrustedConnection: Boolean, Login: String, Password: String): Unit = js.native
  def TransferSQLDatabase(
    Server: String,
    Database: String,
    UseTrustedConnection: Boolean,
    Login: String,
    Password: String,
    TransferCopyData: Boolean
  ): Unit = js.native
  def TransferSQLDatabase(
    Server: String,
    Database: String,
    UseTrustedConnection: Boolean,
    Login: String,
    Password: Unit,
    TransferCopyData: Boolean
  ): Unit = js.native
  def TransferSQLDatabase(Server: String, Database: String, UseTrustedConnection: Boolean, Login: Unit, Password: String): Unit = js.native
  def TransferSQLDatabase(
    Server: String,
    Database: String,
    UseTrustedConnection: Boolean,
    Login: Unit,
    Password: String,
    TransferCopyData: Boolean
  ): Unit = js.native
  def TransferSQLDatabase(
    Server: String,
    Database: String,
    UseTrustedConnection: Boolean,
    Login: Unit,
    Password: Unit,
    TransferCopyData: Boolean
  ): Unit = js.native
  def TransferSQLDatabase(Server: String, Database: String, UseTrustedConnection: Unit, Login: String): Unit = js.native
  def TransferSQLDatabase(Server: String, Database: String, UseTrustedConnection: Unit, Login: String, Password: String): Unit = js.native
  def TransferSQLDatabase(
    Server: String,
    Database: String,
    UseTrustedConnection: Unit,
    Login: String,
    Password: String,
    TransferCopyData: Boolean
  ): Unit = js.native
  def TransferSQLDatabase(
    Server: String,
    Database: String,
    UseTrustedConnection: Unit,
    Login: String,
    Password: Unit,
    TransferCopyData: Boolean
  ): Unit = js.native
  def TransferSQLDatabase(Server: String, Database: String, UseTrustedConnection: Unit, Login: Unit, Password: String): Unit = js.native
  def TransferSQLDatabase(
    Server: String,
    Database: String,
    UseTrustedConnection: Unit,
    Login: Unit,
    Password: String,
    TransferCopyData: Boolean
  ): Unit = js.native
  def TransferSQLDatabase(
    Server: String,
    Database: String,
    UseTrustedConnection: Unit,
    Login: Unit,
    Password: Unit,
    TransferCopyData: Boolean
  ): Unit = js.native
  
  def TransferSharePointList(TransferType: AcSharePointListTransferType, SiteAddress: String, ListID: String): Unit = js.native
  def TransferSharePointList(TransferType: AcSharePointListTransferType, SiteAddress: String, ListID: String, ViewID: String): Unit = js.native
  def TransferSharePointList(
    TransferType: AcSharePointListTransferType,
    SiteAddress: String,
    ListID: String,
    ViewID: String,
    TableName: String
  ): Unit = js.native
  def TransferSharePointList(
    TransferType: AcSharePointListTransferType,
    SiteAddress: String,
    ListID: String,
    ViewID: String,
    TableName: String,
    GetLookupDisplayValues: Boolean
  ): Unit = js.native
  def TransferSharePointList(
    TransferType: AcSharePointListTransferType,
    SiteAddress: String,
    ListID: String,
    ViewID: String,
    TableName: Unit,
    GetLookupDisplayValues: Boolean
  ): Unit = js.native
  def TransferSharePointList(
    TransferType: AcSharePointListTransferType,
    SiteAddress: String,
    ListID: String,
    ViewID: Unit,
    TableName: String
  ): Unit = js.native
  def TransferSharePointList(
    TransferType: AcSharePointListTransferType,
    SiteAddress: String,
    ListID: String,
    ViewID: Unit,
    TableName: String,
    GetLookupDisplayValues: Boolean
  ): Unit = js.native
  def TransferSharePointList(
    TransferType: AcSharePointListTransferType,
    SiteAddress: String,
    ListID: String,
    ViewID: Unit,
    TableName: Unit,
    GetLookupDisplayValues: Boolean
  ): Unit = js.native
  
  /**
    * @param TransferType [TransferType=0]
    * @param SpreadsheetType [SpreadsheetType=10]
    * @param HasFieldNames [HasFieldNames=false]
    */
  def TransferSpreadsheet(): Unit = js.native
  def TransferSpreadsheet(TransferType: Unit, SpreadsheetType: Unit, TableName: String): Unit = js.native
  def TransferSpreadsheet(TransferType: Unit, SpreadsheetType: Unit, TableName: String, FileName: String): Unit = js.native
  def TransferSpreadsheet(
    TransferType: Unit,
    SpreadsheetType: Unit,
    TableName: String,
    FileName: String,
    HasFieldNames: Boolean
  ): Unit = js.native
  def TransferSpreadsheet(
    TransferType: Unit,
    SpreadsheetType: Unit,
    TableName: String,
    FileName: Unit,
    HasFieldNames: Boolean
  ): Unit = js.native
  def TransferSpreadsheet(TransferType: Unit, SpreadsheetType: Unit, TableName: Unit, FileName: String): Unit = js.native
  def TransferSpreadsheet(
    TransferType: Unit,
    SpreadsheetType: Unit,
    TableName: Unit,
    FileName: String,
    HasFieldNames: Boolean
  ): Unit = js.native
  def TransferSpreadsheet(TransferType: Unit, SpreadsheetType: Unit, TableName: Unit, FileName: Unit, HasFieldNames: Boolean): Unit = js.native
  def TransferSpreadsheet(TransferType: Unit, SpreadsheetType: AcSpreadSheetType): Unit = js.native
  def TransferSpreadsheet(TransferType: Unit, SpreadsheetType: AcSpreadSheetType, TableName: String): Unit = js.native
  def TransferSpreadsheet(TransferType: Unit, SpreadsheetType: AcSpreadSheetType, TableName: String, FileName: String): Unit = js.native
  def TransferSpreadsheet(
    TransferType: Unit,
    SpreadsheetType: AcSpreadSheetType,
    TableName: String,
    FileName: String,
    HasFieldNames: Boolean
  ): Unit = js.native
  def TransferSpreadsheet(
    TransferType: Unit,
    SpreadsheetType: AcSpreadSheetType,
    TableName: String,
    FileName: Unit,
    HasFieldNames: Boolean
  ): Unit = js.native
  def TransferSpreadsheet(TransferType: Unit, SpreadsheetType: AcSpreadSheetType, TableName: Unit, FileName: String): Unit = js.native
  def TransferSpreadsheet(
    TransferType: Unit,
    SpreadsheetType: AcSpreadSheetType,
    TableName: Unit,
    FileName: String,
    HasFieldNames: Boolean
  ): Unit = js.native
  def TransferSpreadsheet(
    TransferType: Unit,
    SpreadsheetType: AcSpreadSheetType,
    TableName: Unit,
    FileName: Unit,
    HasFieldNames: Boolean
  ): Unit = js.native
  def TransferSpreadsheet(TransferType: AcDataTransferType): Unit = js.native
  def TransferSpreadsheet(TransferType: AcDataTransferType, SpreadsheetType: Unit, TableName: String): Unit = js.native
  def TransferSpreadsheet(TransferType: AcDataTransferType, SpreadsheetType: Unit, TableName: String, FileName: String): Unit = js.native
  def TransferSpreadsheet(
    TransferType: AcDataTransferType,
    SpreadsheetType: Unit,
    TableName: String,
    FileName: String,
    HasFieldNames: Boolean
  ): Unit = js.native
  def TransferSpreadsheet(
    TransferType: AcDataTransferType,
    SpreadsheetType: Unit,
    TableName: String,
    FileName: Unit,
    HasFieldNames: Boolean
  ): Unit = js.native
  def TransferSpreadsheet(TransferType: AcDataTransferType, SpreadsheetType: Unit, TableName: Unit, FileName: String): Unit = js.native
  def TransferSpreadsheet(
    TransferType: AcDataTransferType,
    SpreadsheetType: Unit,
    TableName: Unit,
    FileName: String,
    HasFieldNames: Boolean
  ): Unit = js.native
  def TransferSpreadsheet(
    TransferType: AcDataTransferType,
    SpreadsheetType: Unit,
    TableName: Unit,
    FileName: Unit,
    HasFieldNames: Boolean
  ): Unit = js.native
  def TransferSpreadsheet(TransferType: AcDataTransferType, SpreadsheetType: AcSpreadSheetType): Unit = js.native
  def TransferSpreadsheet(TransferType: AcDataTransferType, SpreadsheetType: AcSpreadSheetType, TableName: String): Unit = js.native
  def TransferSpreadsheet(
    TransferType: AcDataTransferType,
    SpreadsheetType: AcSpreadSheetType,
    TableName: String,
    FileName: String
  ): Unit = js.native
  def TransferSpreadsheet(
    TransferType: AcDataTransferType,
    SpreadsheetType: AcSpreadSheetType,
    TableName: String,
    FileName: String,
    HasFieldNames: Boolean
  ): Unit = js.native
  def TransferSpreadsheet(
    TransferType: AcDataTransferType,
    SpreadsheetType: AcSpreadSheetType,
    TableName: String,
    FileName: Unit,
    HasFieldNames: Boolean
  ): Unit = js.native
  def TransferSpreadsheet(
    TransferType: AcDataTransferType,
    SpreadsheetType: AcSpreadSheetType,
    TableName: Unit,
    FileName: String
  ): Unit = js.native
  def TransferSpreadsheet(
    TransferType: AcDataTransferType,
    SpreadsheetType: AcSpreadSheetType,
    TableName: Unit,
    FileName: String,
    HasFieldNames: Boolean
  ): Unit = js.native
  def TransferSpreadsheet(
    TransferType: AcDataTransferType,
    SpreadsheetType: AcSpreadSheetType,
    TableName: Unit,
    FileName: Unit,
    HasFieldNames: Boolean
  ): Unit = js.native
  /**
    * @param TransferType [TransferType=0]
    * @param SpreadsheetType [SpreadsheetType=10]
    * @param HasFieldNames [HasFieldNames=false]
    */
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(TransferType: `0`): Unit = js.native
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(TransferType: `0`, SpreadsheetType: Unit, TableName: String): Unit = js.native
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(TransferType: `0`, SpreadsheetType: Unit, TableName: String, FileName: String): Unit = js.native
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(
    TransferType: `0`,
    SpreadsheetType: Unit,
    TableName: String,
    FileName: String,
    HasFieldNames: Boolean
  ): Unit = js.native
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(
    TransferType: `0`,
    SpreadsheetType: Unit,
    TableName: String,
    FileName: String,
    HasFieldNames: Boolean,
    Range: Any
  ): Unit = js.native
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(
    TransferType: `0`,
    SpreadsheetType: Unit,
    TableName: String,
    FileName: String,
    HasFieldNames: Unit,
    Range: Any
  ): Unit = js.native
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(
    TransferType: `0`,
    SpreadsheetType: Unit,
    TableName: String,
    FileName: Unit,
    HasFieldNames: Boolean
  ): Unit = js.native
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(
    TransferType: `0`,
    SpreadsheetType: Unit,
    TableName: String,
    FileName: Unit,
    HasFieldNames: Boolean,
    Range: Any
  ): Unit = js.native
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(
    TransferType: `0`,
    SpreadsheetType: Unit,
    TableName: String,
    FileName: Unit,
    HasFieldNames: Unit,
    Range: Any
  ): Unit = js.native
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(TransferType: `0`, SpreadsheetType: Unit, TableName: Unit, FileName: String): Unit = js.native
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(
    TransferType: `0`,
    SpreadsheetType: Unit,
    TableName: Unit,
    FileName: String,
    HasFieldNames: Boolean
  ): Unit = js.native
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(
    TransferType: `0`,
    SpreadsheetType: Unit,
    TableName: Unit,
    FileName: String,
    HasFieldNames: Boolean,
    Range: Any
  ): Unit = js.native
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(
    TransferType: `0`,
    SpreadsheetType: Unit,
    TableName: Unit,
    FileName: String,
    HasFieldNames: Unit,
    Range: Any
  ): Unit = js.native
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(TransferType: `0`, SpreadsheetType: Unit, TableName: Unit, FileName: Unit, HasFieldNames: Boolean): Unit = js.native
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(
    TransferType: `0`,
    SpreadsheetType: Unit,
    TableName: Unit,
    FileName: Unit,
    HasFieldNames: Boolean,
    Range: Any
  ): Unit = js.native
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(
    TransferType: `0`,
    SpreadsheetType: Unit,
    TableName: Unit,
    FileName: Unit,
    HasFieldNames: Unit,
    Range: Any
  ): Unit = js.native
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(TransferType: `0`, SpreadsheetType: AcSpreadSheetType): Unit = js.native
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(TransferType: `0`, SpreadsheetType: AcSpreadSheetType, TableName: String): Unit = js.native
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(TransferType: `0`, SpreadsheetType: AcSpreadSheetType, TableName: String, FileName: String): Unit = js.native
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(
    TransferType: `0`,
    SpreadsheetType: AcSpreadSheetType,
    TableName: String,
    FileName: String,
    HasFieldNames: Boolean
  ): Unit = js.native
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(
    TransferType: `0`,
    SpreadsheetType: AcSpreadSheetType,
    TableName: String,
    FileName: String,
    HasFieldNames: Boolean,
    Range: Any
  ): Unit = js.native
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(
    TransferType: `0`,
    SpreadsheetType: AcSpreadSheetType,
    TableName: String,
    FileName: String,
    HasFieldNames: Unit,
    Range: Any
  ): Unit = js.native
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(
    TransferType: `0`,
    SpreadsheetType: AcSpreadSheetType,
    TableName: String,
    FileName: Unit,
    HasFieldNames: Boolean
  ): Unit = js.native
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(
    TransferType: `0`,
    SpreadsheetType: AcSpreadSheetType,
    TableName: String,
    FileName: Unit,
    HasFieldNames: Boolean,
    Range: Any
  ): Unit = js.native
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(
    TransferType: `0`,
    SpreadsheetType: AcSpreadSheetType,
    TableName: String,
    FileName: Unit,
    HasFieldNames: Unit,
    Range: Any
  ): Unit = js.native
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(TransferType: `0`, SpreadsheetType: AcSpreadSheetType, TableName: Unit, FileName: String): Unit = js.native
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(
    TransferType: `0`,
    SpreadsheetType: AcSpreadSheetType,
    TableName: Unit,
    FileName: String,
    HasFieldNames: Boolean
  ): Unit = js.native
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(
    TransferType: `0`,
    SpreadsheetType: AcSpreadSheetType,
    TableName: Unit,
    FileName: String,
    HasFieldNames: Boolean,
    Range: Any
  ): Unit = js.native
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(
    TransferType: `0`,
    SpreadsheetType: AcSpreadSheetType,
    TableName: Unit,
    FileName: String,
    HasFieldNames: Unit,
    Range: Any
  ): Unit = js.native
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(
    TransferType: `0`,
    SpreadsheetType: AcSpreadSheetType,
    TableName: Unit,
    FileName: Unit,
    HasFieldNames: Boolean
  ): Unit = js.native
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(
    TransferType: `0`,
    SpreadsheetType: AcSpreadSheetType,
    TableName: Unit,
    FileName: Unit,
    HasFieldNames: Boolean,
    Range: Any
  ): Unit = js.native
  @JSName("TransferSpreadsheet")
  def TransferSpreadsheet_0(
    TransferType: `0`,
    SpreadsheetType: AcSpreadSheetType,
    TableName: Unit,
    FileName: Unit,
    HasFieldNames: Unit,
    Range: Any
  ): Unit = js.native
  
  /**
    * @param TransferType [TransferType=0]
    * @param Encoding For valid values see https://msdn.microsoft.com/en-us/library/windows/desktop/dd317756(v=vs.85).aspx
    */
  def TransferText(
    TransferType: js.UndefOr[`8` | `7`],
    SpecificationName: js.UndefOr[String],
    TableName: js.UndefOr[String],
    FileName: js.UndefOr[String],
    HasFieldNames: js.UndefOr[Boolean],
    HTMLTableName: js.UndefOr[String],
    CodePage: js.UndefOr[Double]
  ): Unit = js.native
  def TransferText(
    TransferType: js.UndefOr[AcTextTransferType],
    SpecificationName: js.UndefOr[String],
    TableName: js.UndefOr[String],
    FileName: js.UndefOr[String],
    HasFieldNames: js.UndefOr[Boolean],
    HTMLTableName: Unit,
    CodePage: js.UndefOr[Double]
  ): Unit = js.native
}
