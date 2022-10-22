package typingsJapgolly.activexAccess.Access

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexDao.DAO.Database
import typingsJapgolly.activexDao.DAO.Workspace
import typingsJapgolly.activexVbide.VBIDE.VBProject
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WizHook extends StObject {
  
  /* private */ @JSName("Access.WizHook_typekey")
  var AccessDotWizHook_typekey: WizHook
  
  def AccessUserDataDir(): String
  
  def AccessWizFilePath(bstrWhich: String): String
  
  def AdpUIDPwd(pbstrUID: String, pbstrPwd: String): Boolean
  
  def AnalyzeQuery(Workspace: Workspace, Database: Database, Query: String, Results: String): Double
  
  def AnalyzeTable(Workspace: Workspace, Database: Database, Table: String, ReturnDebugInfo: Boolean, Results: String): Double
  
  def ArgsOfActid(Actid: Double): Double
  
  def BracketString(String: String, flags: Double): Boolean
  
  def CacheStatus(bstrStatus: String): Unit
  
  def CloseCurrentDatabase(): Boolean
  
  def CreateDataPageControl(
    DpName: String,
    CtlName: String,
    Typ: Double,
    Section: String,
    SectionType: Double,
    AppletCode: String,
    X: Double,
    Y: Double,
    dx: Double,
    dy: Double
  ): Unit
  
  def CurrentLangID(): Double
  
  val DbcVbProject: VBProject
  
  def EmbedFileOnDataPage(DpName: String, FileToInsert: String): String
  
  def EnglishPictToLocal(In: String, Out: String): Boolean
  
  def ExecuteTempImexSpec(bstrSpecXML: String): Unit
  
  def FCacheStatus(): Boolean
  
  def FCreateNameMap(objtyp: Double, bstrObjName: String): Boolean
  
  def FGetMSDE(fBlockKeys: Boolean): Boolean
  
  def FIsFEWch(wch: Double): Boolean
  
  def FIsPublishedXasTable(bstrObjectName: String): Boolean
  
  def FIsValidXasObjectName(bstrObjectName: String, iobjtyp: AcObjectType): Boolean
  
  def FIsXasDb(): Boolean
  
  def FileExists(File: String): Boolean
  
  def FirstDbcDataObject(Name: String, ObjType: AcObjectType, Attribs: Double): Boolean
  
  def FullPath(RelativePath: String, FullPath: String): Double
  
  def GetAccWizRCPath(): String
  
  def GetAdeRegistryPath(): String
  
  def GetColumns(bstrBase: String): String
  
  def GetCurrentView(bstrTableName: String): Double
  
  def GetDisabledExtensions(): String
  
  def GetFileName(
    hwndOwner: Double,
    AppName: String,
    DlgTitle: String,
    OpenTitle: String,
    File: String,
    InitialDir: String,
    Filter: String,
    FilterIndex: Double,
    View: Double,
    flags: Double,
    fOpen: Boolean
  ): Double
  
  def GetFileName2(
    hwndOwner: Double,
    AppName: String,
    DlgTitle: String,
    OpenTitle: String,
    File: String,
    InitialDir: String,
    Filter: String,
    FilterIndex: Double,
    View: Double,
    flags: Double,
    fOpen: Boolean,
    fFileSystem: Any
  ): Double
  
  def GetFileOdso(bstrExt: String, bstrFilename: String): Double
  
  def GetImexTblName(): String
  
  def GetInfoForColumns(bstrBase: String): String
  
  def GetLinkedListProperty(bstrTableName: String, bstrPropertyName: String, fServer: Boolean): String
  
  def GetObjPubOption(bstrObjectName: String, iobjtyp: AcObjectType, fTablesAsClient: Boolean): Double
  
  def GetScriptString(HScr: Double, ScriptColumn: Double, Value: String): Boolean
  
  def GetWizGlob(lWhich: Double): Any
  
  def GlobalProcExists(Name: String): Boolean
  
  def HideDates(): Boolean
  
  def IsMatchToDbcConnectString(bstrConnectionString: String): Boolean
  
  def IsMemberSafe(dispid: Double): Boolean
  
  def IsValidIdent(Identifier: String): Boolean
  
  val Key: Double
  
  def KeyboardLangID(): Double
  
  def KnownWizLeaks(fStart: Boolean): Unit
  
  def LoadImexSpecSolution(bstrFilename: String): Unit
  
  def LocalFont(): String
  
  def NameFromActid(Actid: Double): String
  
  def ObjTypOfRecordSource(RecordSource: String): Double
  
  def OfficeAddInDir(): String
  
  def OpenEmScript(pProperty: AccessProperty, OpenMode: Double, Extra: Double, Version: Double): Double
  
  def OpenPictureFile(File: String, Cancelled: Boolean): Boolean
  
  def OpenScript(Script: String, Label: String, OpenMode: Double, Extra: Double, Version: Double): Double
  
  def ReportLeaksToFile(fRptToFile: Boolean, bstrFileOut: String): Unit
  
  def SaveObject(bstrName: String, objtyp: Double): Unit
  
  def SaveScriptString(HScr: Double, ScriptColumn: Double, Value: String): Boolean
  
  def SetDefaultSpecName(bstrSpecName: String): Unit
  
  def SetDpBlockKeyInput(fBlockKeys: Boolean): Unit
  
  def SetVbaPassword(bstrDbName: String, bstrConnect: String, bstrPasswd: String): Boolean
  
  def SetWizGlob(lWhich: Double, vValue: Any): Unit
  
  def SortStringArray(Array: SafeArray[String]): Unit
  
  def SplitPath(Path: String, Drive: String, Dir: String, File: String, Ext: String): Unit
  
  def TableFieldHasUniqueIndex(Table: String, Columns: String): Boolean
  
  def TranslateExpression(In: String, Out: String, ParseFlags: Double, TranslateFlags: Double): Boolean
  
  def TwipsFromFont(
    FontName: String,
    Size: Double,
    Weight: Double,
    Italic: Boolean,
    Underline: Boolean,
    Cch: Double,
    Caption: String,
    MaxWidthCch: Double,
    dx: Double,
    dy: Double
  ): Boolean
  
  def WizCopyCmdbars(bstrADPName: String): Unit
  
  def WizHelp(HelpFile: String, wCmd: Double, ContextID: Double): Boolean
  
  def WizMsgBox(bstrText: String, bstrCaption: String, wStyle: Double, idHelpID: Double, bstrHelpFileName: String): Double
}
object WizHook {
  
  inline def apply(
    AccessDotWizHook_typekey: WizHook,
    AccessUserDataDir: CallbackTo[String],
    AccessWizFilePath: String => String,
    AdpUIDPwd: (String, String) => Boolean,
    AnalyzeQuery: (Workspace, Database, String, String) => Double,
    AnalyzeTable: (Workspace, Database, String, Boolean, String) => Double,
    ArgsOfActid: Double => Double,
    BracketString: (String, Double) => Boolean,
    CacheStatus: String => Callback,
    CloseCurrentDatabase: CallbackTo[Boolean],
    CreateDataPageControl: (String, String, Double, String, Double, String, Double, Double, Double, Double) => Callback,
    CurrentLangID: CallbackTo[Double],
    DbcVbProject: VBProject,
    EmbedFileOnDataPage: (String, String) => String,
    EnglishPictToLocal: (String, String) => Boolean,
    ExecuteTempImexSpec: String => Callback,
    FCacheStatus: CallbackTo[Boolean],
    FCreateNameMap: (Double, String) => Boolean,
    FGetMSDE: Boolean => Boolean,
    FIsFEWch: Double => Boolean,
    FIsPublishedXasTable: String => Boolean,
    FIsValidXasObjectName: (String, AcObjectType) => Boolean,
    FIsXasDb: CallbackTo[Boolean],
    FileExists: String => Boolean,
    FirstDbcDataObject: (String, AcObjectType, Double) => Boolean,
    FullPath: (String, String) => Double,
    GetAccWizRCPath: CallbackTo[String],
    GetAdeRegistryPath: CallbackTo[String],
    GetColumns: String => String,
    GetCurrentView: String => Double,
    GetDisabledExtensions: CallbackTo[String],
    GetFileName: (Double, String, String, String, String, String, String, Double, Double, Double, Boolean) => Double,
    GetFileName2: (Double, String, String, String, String, String, String, Double, Double, Double, Boolean, Any) => Double,
    GetFileOdso: (String, String) => Double,
    GetImexTblName: CallbackTo[String],
    GetInfoForColumns: String => String,
    GetLinkedListProperty: (String, String, Boolean) => String,
    GetObjPubOption: (String, AcObjectType, Boolean) => Double,
    GetScriptString: (Double, Double, String) => Boolean,
    GetWizGlob: Double => Any,
    GlobalProcExists: String => Boolean,
    HideDates: CallbackTo[Boolean],
    IsMatchToDbcConnectString: String => Boolean,
    IsMemberSafe: Double => Boolean,
    IsValidIdent: String => Boolean,
    Key: Double,
    KeyboardLangID: CallbackTo[Double],
    KnownWizLeaks: Boolean => Callback,
    LoadImexSpecSolution: String => Callback,
    LocalFont: CallbackTo[String],
    NameFromActid: Double => String,
    ObjTypOfRecordSource: String => Double,
    OfficeAddInDir: CallbackTo[String],
    OpenEmScript: (AccessProperty, Double, Double, Double) => Double,
    OpenPictureFile: (String, Boolean) => Boolean,
    OpenScript: (String, String, Double, Double, Double) => Double,
    ReportLeaksToFile: (Boolean, String) => Callback,
    SaveObject: (String, Double) => Callback,
    SaveScriptString: (Double, Double, String) => Boolean,
    SetDefaultSpecName: String => Callback,
    SetDpBlockKeyInput: Boolean => Callback,
    SetVbaPassword: (String, String, String) => Boolean,
    SetWizGlob: (Double, Any) => Callback,
    SortStringArray: SafeArray[String] => Callback,
    SplitPath: (String, String, String, String, String) => Callback,
    TableFieldHasUniqueIndex: (String, String) => Boolean,
    TranslateExpression: (String, String, Double, Double) => Boolean,
    TwipsFromFont: (String, Double, Double, Boolean, Boolean, Double, String, Double, Double, Double) => Boolean,
    WizCopyCmdbars: String => Callback,
    WizHelp: (String, Double, Double) => Boolean,
    WizMsgBox: (String, String, Double, Double, String) => Double
  ): WizHook = {
    val __obj = js.Dynamic.literal(AccessUserDataDir = AccessUserDataDir.toJsFn, AccessWizFilePath = js.Any.fromFunction1(AccessWizFilePath), AdpUIDPwd = js.Any.fromFunction2(AdpUIDPwd), AnalyzeQuery = js.Any.fromFunction4(AnalyzeQuery), AnalyzeTable = js.Any.fromFunction5(AnalyzeTable), ArgsOfActid = js.Any.fromFunction1(ArgsOfActid), BracketString = js.Any.fromFunction2(BracketString), CacheStatus = js.Any.fromFunction1((t0: String) => CacheStatus(t0).runNow()), CloseCurrentDatabase = CloseCurrentDatabase.toJsFn, CreateDataPageControl = js.Any.fromFunction10((t0: String, t1: String, t2: Double, t3: String, t4: Double, t5: String, t6: Double, t7: Double, t8: Double, t9: Double) => (CreateDataPageControl(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9)).runNow()), CurrentLangID = CurrentLangID.toJsFn, DbcVbProject = DbcVbProject.asInstanceOf[js.Any], EmbedFileOnDataPage = js.Any.fromFunction2(EmbedFileOnDataPage), EnglishPictToLocal = js.Any.fromFunction2(EnglishPictToLocal), ExecuteTempImexSpec = js.Any.fromFunction1((t0: String) => ExecuteTempImexSpec(t0).runNow()), FCacheStatus = FCacheStatus.toJsFn, FCreateNameMap = js.Any.fromFunction2(FCreateNameMap), FGetMSDE = js.Any.fromFunction1(FGetMSDE), FIsFEWch = js.Any.fromFunction1(FIsFEWch), FIsPublishedXasTable = js.Any.fromFunction1(FIsPublishedXasTable), FIsValidXasObjectName = js.Any.fromFunction2(FIsValidXasObjectName), FIsXasDb = FIsXasDb.toJsFn, FileExists = js.Any.fromFunction1(FileExists), FirstDbcDataObject = js.Any.fromFunction3(FirstDbcDataObject), FullPath = js.Any.fromFunction2(FullPath), GetAccWizRCPath = GetAccWizRCPath.toJsFn, GetAdeRegistryPath = GetAdeRegistryPath.toJsFn, GetColumns = js.Any.fromFunction1(GetColumns), GetCurrentView = js.Any.fromFunction1(GetCurrentView), GetDisabledExtensions = GetDisabledExtensions.toJsFn, GetFileName = js.Any.fromFunction11(GetFileName), GetFileName2 = js.Any.fromFunction12(GetFileName2), GetFileOdso = js.Any.fromFunction2(GetFileOdso), GetImexTblName = GetImexTblName.toJsFn, GetInfoForColumns = js.Any.fromFunction1(GetInfoForColumns), GetLinkedListProperty = js.Any.fromFunction3(GetLinkedListProperty), GetObjPubOption = js.Any.fromFunction3(GetObjPubOption), GetScriptString = js.Any.fromFunction3(GetScriptString), GetWizGlob = js.Any.fromFunction1(GetWizGlob), GlobalProcExists = js.Any.fromFunction1(GlobalProcExists), HideDates = HideDates.toJsFn, IsMatchToDbcConnectString = js.Any.fromFunction1(IsMatchToDbcConnectString), IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), IsValidIdent = js.Any.fromFunction1(IsValidIdent), Key = Key.asInstanceOf[js.Any], KeyboardLangID = KeyboardLangID.toJsFn, KnownWizLeaks = js.Any.fromFunction1((t0: Boolean) => KnownWizLeaks(t0).runNow()), LoadImexSpecSolution = js.Any.fromFunction1((t0: String) => LoadImexSpecSolution(t0).runNow()), LocalFont = LocalFont.toJsFn, NameFromActid = js.Any.fromFunction1(NameFromActid), ObjTypOfRecordSource = js.Any.fromFunction1(ObjTypOfRecordSource), OfficeAddInDir = OfficeAddInDir.toJsFn, OpenEmScript = js.Any.fromFunction4(OpenEmScript), OpenPictureFile = js.Any.fromFunction2(OpenPictureFile), OpenScript = js.Any.fromFunction5(OpenScript), ReportLeaksToFile = js.Any.fromFunction2((t0: Boolean, t1: String) => (ReportLeaksToFile(t0, t1)).runNow()), SaveObject = js.Any.fromFunction2((t0: String, t1: Double) => (SaveObject(t0, t1)).runNow()), SaveScriptString = js.Any.fromFunction3(SaveScriptString), SetDefaultSpecName = js.Any.fromFunction1((t0: String) => SetDefaultSpecName(t0).runNow()), SetDpBlockKeyInput = js.Any.fromFunction1((t0: Boolean) => SetDpBlockKeyInput(t0).runNow()), SetVbaPassword = js.Any.fromFunction3(SetVbaPassword), SetWizGlob = js.Any.fromFunction2((t0: Double, t1: Any) => (SetWizGlob(t0, t1)).runNow()), SortStringArray = js.Any.fromFunction1((t0: SafeArray[String]) => SortStringArray(t0).runNow()), SplitPath = js.Any.fromFunction5((t0: String, t1: String, t2: String, t3: String, t4: String) => (SplitPath(t0, t1, t2, t3, t4)).runNow()), TableFieldHasUniqueIndex = js.Any.fromFunction2(TableFieldHasUniqueIndex), TranslateExpression = js.Any.fromFunction4(TranslateExpression), TwipsFromFont = js.Any.fromFunction10(TwipsFromFont), WizCopyCmdbars = js.Any.fromFunction1((t0: String) => WizCopyCmdbars(t0).runNow()), WizHelp = js.Any.fromFunction3(WizHelp), WizMsgBox = js.Any.fromFunction5(WizMsgBox))
    __obj.updateDynamic("Access.WizHook_typekey")(AccessDotWizHook_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WizHook]
  }
  
  extension [Self <: WizHook](x: Self) {
    
    inline def setAccessDotWizHook_typekey(value: WizHook): Self = StObject.set(x, "Access.WizHook_typekey", value.asInstanceOf[js.Any])
    
    inline def setAccessUserDataDir(value: CallbackTo[String]): Self = StObject.set(x, "AccessUserDataDir", value.toJsFn)
    
    inline def setAccessWizFilePath(value: String => String): Self = StObject.set(x, "AccessWizFilePath", js.Any.fromFunction1(value))
    
    inline def setAdpUIDPwd(value: (String, String) => Boolean): Self = StObject.set(x, "AdpUIDPwd", js.Any.fromFunction2(value))
    
    inline def setAnalyzeQuery(value: (Workspace, Database, String, String) => Double): Self = StObject.set(x, "AnalyzeQuery", js.Any.fromFunction4(value))
    
    inline def setAnalyzeTable(value: (Workspace, Database, String, Boolean, String) => Double): Self = StObject.set(x, "AnalyzeTable", js.Any.fromFunction5(value))
    
    inline def setArgsOfActid(value: Double => Double): Self = StObject.set(x, "ArgsOfActid", js.Any.fromFunction1(value))
    
    inline def setBracketString(value: (String, Double) => Boolean): Self = StObject.set(x, "BracketString", js.Any.fromFunction2(value))
    
    inline def setCacheStatus(value: String => Callback): Self = StObject.set(x, "CacheStatus", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setCloseCurrentDatabase(value: CallbackTo[Boolean]): Self = StObject.set(x, "CloseCurrentDatabase", value.toJsFn)
    
    inline def setCreateDataPageControl(
      value: (String, String, Double, String, Double, String, Double, Double, Double, Double) => Callback
    ): Self = StObject.set(x, "CreateDataPageControl", js.Any.fromFunction10((t0: String, t1: String, t2: Double, t3: String, t4: Double, t5: String, t6: Double, t7: Double, t8: Double, t9: Double) => (value(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9)).runNow()))
    
    inline def setCurrentLangID(value: CallbackTo[Double]): Self = StObject.set(x, "CurrentLangID", value.toJsFn)
    
    inline def setDbcVbProject(value: VBProject): Self = StObject.set(x, "DbcVbProject", value.asInstanceOf[js.Any])
    
    inline def setEmbedFileOnDataPage(value: (String, String) => String): Self = StObject.set(x, "EmbedFileOnDataPage", js.Any.fromFunction2(value))
    
    inline def setEnglishPictToLocal(value: (String, String) => Boolean): Self = StObject.set(x, "EnglishPictToLocal", js.Any.fromFunction2(value))
    
    inline def setExecuteTempImexSpec(value: String => Callback): Self = StObject.set(x, "ExecuteTempImexSpec", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setFCacheStatus(value: CallbackTo[Boolean]): Self = StObject.set(x, "FCacheStatus", value.toJsFn)
    
    inline def setFCreateNameMap(value: (Double, String) => Boolean): Self = StObject.set(x, "FCreateNameMap", js.Any.fromFunction2(value))
    
    inline def setFGetMSDE(value: Boolean => Boolean): Self = StObject.set(x, "FGetMSDE", js.Any.fromFunction1(value))
    
    inline def setFIsFEWch(value: Double => Boolean): Self = StObject.set(x, "FIsFEWch", js.Any.fromFunction1(value))
    
    inline def setFIsPublishedXasTable(value: String => Boolean): Self = StObject.set(x, "FIsPublishedXasTable", js.Any.fromFunction1(value))
    
    inline def setFIsValidXasObjectName(value: (String, AcObjectType) => Boolean): Self = StObject.set(x, "FIsValidXasObjectName", js.Any.fromFunction2(value))
    
    inline def setFIsXasDb(value: CallbackTo[Boolean]): Self = StObject.set(x, "FIsXasDb", value.toJsFn)
    
    inline def setFileExists(value: String => Boolean): Self = StObject.set(x, "FileExists", js.Any.fromFunction1(value))
    
    inline def setFirstDbcDataObject(value: (String, AcObjectType, Double) => Boolean): Self = StObject.set(x, "FirstDbcDataObject", js.Any.fromFunction3(value))
    
    inline def setFullPath(value: (String, String) => Double): Self = StObject.set(x, "FullPath", js.Any.fromFunction2(value))
    
    inline def setGetAccWizRCPath(value: CallbackTo[String]): Self = StObject.set(x, "GetAccWizRCPath", value.toJsFn)
    
    inline def setGetAdeRegistryPath(value: CallbackTo[String]): Self = StObject.set(x, "GetAdeRegistryPath", value.toJsFn)
    
    inline def setGetColumns(value: String => String): Self = StObject.set(x, "GetColumns", js.Any.fromFunction1(value))
    
    inline def setGetCurrentView(value: String => Double): Self = StObject.set(x, "GetCurrentView", js.Any.fromFunction1(value))
    
    inline def setGetDisabledExtensions(value: CallbackTo[String]): Self = StObject.set(x, "GetDisabledExtensions", value.toJsFn)
    
    inline def setGetFileName(
      value: (Double, String, String, String, String, String, String, Double, Double, Double, Boolean) => Double
    ): Self = StObject.set(x, "GetFileName", js.Any.fromFunction11(value))
    
    inline def setGetFileName2(
      value: (Double, String, String, String, String, String, String, Double, Double, Double, Boolean, Any) => Double
    ): Self = StObject.set(x, "GetFileName2", js.Any.fromFunction12(value))
    
    inline def setGetFileOdso(value: (String, String) => Double): Self = StObject.set(x, "GetFileOdso", js.Any.fromFunction2(value))
    
    inline def setGetImexTblName(value: CallbackTo[String]): Self = StObject.set(x, "GetImexTblName", value.toJsFn)
    
    inline def setGetInfoForColumns(value: String => String): Self = StObject.set(x, "GetInfoForColumns", js.Any.fromFunction1(value))
    
    inline def setGetLinkedListProperty(value: (String, String, Boolean) => String): Self = StObject.set(x, "GetLinkedListProperty", js.Any.fromFunction3(value))
    
    inline def setGetObjPubOption(value: (String, AcObjectType, Boolean) => Double): Self = StObject.set(x, "GetObjPubOption", js.Any.fromFunction3(value))
    
    inline def setGetScriptString(value: (Double, Double, String) => Boolean): Self = StObject.set(x, "GetScriptString", js.Any.fromFunction3(value))
    
    inline def setGetWizGlob(value: Double => Any): Self = StObject.set(x, "GetWizGlob", js.Any.fromFunction1(value))
    
    inline def setGlobalProcExists(value: String => Boolean): Self = StObject.set(x, "GlobalProcExists", js.Any.fromFunction1(value))
    
    inline def setHideDates(value: CallbackTo[Boolean]): Self = StObject.set(x, "HideDates", value.toJsFn)
    
    inline def setIsMatchToDbcConnectString(value: String => Boolean): Self = StObject.set(x, "IsMatchToDbcConnectString", js.Any.fromFunction1(value))
    
    inline def setIsMemberSafe(value: Double => Boolean): Self = StObject.set(x, "IsMemberSafe", js.Any.fromFunction1(value))
    
    inline def setIsValidIdent(value: String => Boolean): Self = StObject.set(x, "IsValidIdent", js.Any.fromFunction1(value))
    
    inline def setKey(value: Double): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyboardLangID(value: CallbackTo[Double]): Self = StObject.set(x, "KeyboardLangID", value.toJsFn)
    
    inline def setKnownWizLeaks(value: Boolean => Callback): Self = StObject.set(x, "KnownWizLeaks", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setLoadImexSpecSolution(value: String => Callback): Self = StObject.set(x, "LoadImexSpecSolution", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setLocalFont(value: CallbackTo[String]): Self = StObject.set(x, "LocalFont", value.toJsFn)
    
    inline def setNameFromActid(value: Double => String): Self = StObject.set(x, "NameFromActid", js.Any.fromFunction1(value))
    
    inline def setObjTypOfRecordSource(value: String => Double): Self = StObject.set(x, "ObjTypOfRecordSource", js.Any.fromFunction1(value))
    
    inline def setOfficeAddInDir(value: CallbackTo[String]): Self = StObject.set(x, "OfficeAddInDir", value.toJsFn)
    
    inline def setOpenEmScript(value: (AccessProperty, Double, Double, Double) => Double): Self = StObject.set(x, "OpenEmScript", js.Any.fromFunction4(value))
    
    inline def setOpenPictureFile(value: (String, Boolean) => Boolean): Self = StObject.set(x, "OpenPictureFile", js.Any.fromFunction2(value))
    
    inline def setOpenScript(value: (String, String, Double, Double, Double) => Double): Self = StObject.set(x, "OpenScript", js.Any.fromFunction5(value))
    
    inline def setReportLeaksToFile(value: (Boolean, String) => Callback): Self = StObject.set(x, "ReportLeaksToFile", js.Any.fromFunction2((t0: Boolean, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSaveObject(value: (String, Double) => Callback): Self = StObject.set(x, "SaveObject", js.Any.fromFunction2((t0: String, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setSaveScriptString(value: (Double, Double, String) => Boolean): Self = StObject.set(x, "SaveScriptString", js.Any.fromFunction3(value))
    
    inline def setSetDefaultSpecName(value: String => Callback): Self = StObject.set(x, "SetDefaultSpecName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetDpBlockKeyInput(value: Boolean => Callback): Self = StObject.set(x, "SetDpBlockKeyInput", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setSetVbaPassword(value: (String, String, String) => Boolean): Self = StObject.set(x, "SetVbaPassword", js.Any.fromFunction3(value))
    
    inline def setSetWizGlob(value: (Double, Any) => Callback): Self = StObject.set(x, "SetWizGlob", js.Any.fromFunction2((t0: Double, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setSortStringArray(value: SafeArray[String] => Callback): Self = StObject.set(x, "SortStringArray", js.Any.fromFunction1((t0: SafeArray[String]) => value(t0).runNow()))
    
    inline def setSplitPath(value: (String, String, String, String, String) => Callback): Self = StObject.set(x, "SplitPath", js.Any.fromFunction5((t0: String, t1: String, t2: String, t3: String, t4: String) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setTableFieldHasUniqueIndex(value: (String, String) => Boolean): Self = StObject.set(x, "TableFieldHasUniqueIndex", js.Any.fromFunction2(value))
    
    inline def setTranslateExpression(value: (String, String, Double, Double) => Boolean): Self = StObject.set(x, "TranslateExpression", js.Any.fromFunction4(value))
    
    inline def setTwipsFromFont(
      value: (String, Double, Double, Boolean, Boolean, Double, String, Double, Double, Double) => Boolean
    ): Self = StObject.set(x, "TwipsFromFont", js.Any.fromFunction10(value))
    
    inline def setWizCopyCmdbars(value: String => Callback): Self = StObject.set(x, "WizCopyCmdbars", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setWizHelp(value: (String, Double, Double) => Boolean): Self = StObject.set(x, "WizHelp", js.Any.fromFunction3(value))
    
    inline def setWizMsgBox(value: (String, String, Double, Double, String) => Double): Self = StObject.set(x, "WizMsgBox", js.Any.fromFunction5(value))
  }
}
