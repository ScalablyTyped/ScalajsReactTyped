package typingsJapgolly.activexPowerpoint.PowerPoint

import typingsJapgolly.activexOffice.Office.CommandBar
import typingsJapgolly.activexOffice.Office.CommandBars
import typingsJapgolly.activexOffice.Office.CustomXMLPart
import typingsJapgolly.activexOffice.Office.CustomXMLParts
import typingsJapgolly.activexOffice.Office.DocumentInspector
import typingsJapgolly.activexOffice.Office.DocumentInspectors
import typingsJapgolly.activexOffice.Office.DocumentLibraryVersion
import typingsJapgolly.activexOffice.Office.DocumentLibraryVersions
import typingsJapgolly.activexOffice.Office.MetaProperties
import typingsJapgolly.activexOffice.Office.MetaProperty
import typingsJapgolly.activexOffice.Office.MsoEncoding
import typingsJapgolly.activexOffice.Office.MsoExtraInfoMethod
import typingsJapgolly.activexOffice.Office.MsoFarEastLineBreakLanguageID
import typingsJapgolly.activexOffice.Office.MsoLanguageID
import typingsJapgolly.activexOffice.Office.MsoTriState
import typingsJapgolly.activexOffice.Office.Permission
import typingsJapgolly.activexOffice.Office.PolicyItem
import typingsJapgolly.activexOffice.Office.ServerPolicy
import typingsJapgolly.activexOffice.Office.Signature
import typingsJapgolly.activexOffice.Office.SignatureSet
import typingsJapgolly.activexOffice.Office.UserPermission
import typingsJapgolly.activexOffice.Office.WorkflowTasks
import typingsJapgolly.activexOffice.Office.WorkflowTemplates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Presentation extends StObject {
  
  def AcceptAll(): Unit = js.native
  
  /** @param string [FileName=''] */
  def AddBaseline(): Unit = js.native
  def AddBaseline(FileName: String): Unit = js.native
  
  def AddTitleMaster(): Master = js.native
  
  def AddToFavorites(): Unit = js.native
  
  val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  
  def ApplyTemplate(FileName: String): Unit = js.native
  
  def ApplyTheme(themeName: String): Unit = js.native
  
  val Broadcast: typingsJapgolly.activexPowerpoint.PowerPoint.Broadcast = js.native
  
  val BuiltInDocumentProperties: Any = js.native
  
  def CanCheckIn(): Boolean = js.native
  
  /** @param boolean [SaveChanges=true] */
  def CheckIn(): Unit = js.native
  def CheckIn(SaveChanges: Boolean): Unit = js.native
  def CheckIn(SaveChanges: Boolean, Comments: Any): Unit = js.native
  def CheckIn(SaveChanges: Boolean, Comments: Any, MakePublic: Any): Unit = js.native
  def CheckIn(SaveChanges: Boolean, Comments: Unit, MakePublic: Any): Unit = js.native
  def CheckIn(SaveChanges: Unit, Comments: Any): Unit = js.native
  def CheckIn(SaveChanges: Unit, Comments: Any, MakePublic: Any): Unit = js.native
  def CheckIn(SaveChanges: Unit, Comments: Unit, MakePublic: Any): Unit = js.native
  
  /** @param boolean [SaveChanges=true] */
  def CheckInWithVersion(): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean, Comments: Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean, Comments: Any, MakePublic: Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean, Comments: Any, MakePublic: Any, VersionType: Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean, Comments: Any, MakePublic: Unit, VersionType: Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean, Comments: Unit, MakePublic: Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean, Comments: Unit, MakePublic: Any, VersionType: Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Boolean, Comments: Unit, MakePublic: Unit, VersionType: Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Unit, Comments: Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Unit, Comments: Any, MakePublic: Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Unit, Comments: Any, MakePublic: Any, VersionType: Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Unit, Comments: Any, MakePublic: Unit, VersionType: Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Unit, Comments: Unit, MakePublic: Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Unit, Comments: Unit, MakePublic: Any, VersionType: Any): Unit = js.native
  def CheckInWithVersion(SaveChanges: Unit, Comments: Unit, MakePublic: Unit, VersionType: Any): Unit = js.native
  
  def Close(): Unit = js.native
  
  val Coauthoring: typingsJapgolly.activexPowerpoint.PowerPoint.Coauthoring = js.native
  
  val ColorSchemes: typingsJapgolly.activexPowerpoint.PowerPoint.ColorSchemes = js.native
  
  def CommandBars(Index: String): CommandBar = js.native
  def CommandBars(Index: Double): CommandBar = js.native
  @JSName("CommandBars")
  val CommandBars_Original: CommandBars = js.native
  
  val Container: Any = js.native
  
  def ContentTypeProperties(Index: String): MetaProperty = js.native
  def ContentTypeProperties(Index: Double): MetaProperty = js.native
  @JSName("ContentTypeProperties")
  val ContentTypeProperties_Original: MetaProperties = js.native
  
  def Convert(): Unit = js.native
  
  def Convert2(FileName: String): Unit = js.native
  
  /**
    * @param boolean [UseTimingsAndNarrations=true]
    * @param number [DefaultSlideDuration=5]
    * @param number [VertResolution=720]
    * @param number [FramesPerSecond=30]
    * @param number [Quality=85]
    */
  def CreateVideo(FileName: String): Unit = js.native
  def CreateVideo(FileName: String, UseTimingsAndNarrations: Boolean): Unit = js.native
  def CreateVideo(FileName: String, UseTimingsAndNarrations: Boolean, DefaultSlideDuration: Double): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Boolean,
    DefaultSlideDuration: Double,
    VertResolution: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Boolean,
    DefaultSlideDuration: Double,
    VertResolution: Double,
    FramesPerSecond: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Boolean,
    DefaultSlideDuration: Double,
    VertResolution: Double,
    FramesPerSecond: Double,
    Quality: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Boolean,
    DefaultSlideDuration: Double,
    VertResolution: Double,
    FramesPerSecond: Unit,
    Quality: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Boolean,
    DefaultSlideDuration: Double,
    VertResolution: Unit,
    FramesPerSecond: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Boolean,
    DefaultSlideDuration: Double,
    VertResolution: Unit,
    FramesPerSecond: Double,
    Quality: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Boolean,
    DefaultSlideDuration: Double,
    VertResolution: Unit,
    FramesPerSecond: Unit,
    Quality: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Boolean,
    DefaultSlideDuration: Unit,
    VertResolution: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Boolean,
    DefaultSlideDuration: Unit,
    VertResolution: Double,
    FramesPerSecond: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Boolean,
    DefaultSlideDuration: Unit,
    VertResolution: Double,
    FramesPerSecond: Double,
    Quality: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Boolean,
    DefaultSlideDuration: Unit,
    VertResolution: Double,
    FramesPerSecond: Unit,
    Quality: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Boolean,
    DefaultSlideDuration: Unit,
    VertResolution: Unit,
    FramesPerSecond: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Boolean,
    DefaultSlideDuration: Unit,
    VertResolution: Unit,
    FramesPerSecond: Double,
    Quality: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Boolean,
    DefaultSlideDuration: Unit,
    VertResolution: Unit,
    FramesPerSecond: Unit,
    Quality: Double
  ): Unit = js.native
  def CreateVideo(FileName: String, UseTimingsAndNarrations: Unit, DefaultSlideDuration: Double): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Unit,
    DefaultSlideDuration: Double,
    VertResolution: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Unit,
    DefaultSlideDuration: Double,
    VertResolution: Double,
    FramesPerSecond: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Unit,
    DefaultSlideDuration: Double,
    VertResolution: Double,
    FramesPerSecond: Double,
    Quality: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Unit,
    DefaultSlideDuration: Double,
    VertResolution: Double,
    FramesPerSecond: Unit,
    Quality: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Unit,
    DefaultSlideDuration: Double,
    VertResolution: Unit,
    FramesPerSecond: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Unit,
    DefaultSlideDuration: Double,
    VertResolution: Unit,
    FramesPerSecond: Double,
    Quality: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Unit,
    DefaultSlideDuration: Double,
    VertResolution: Unit,
    FramesPerSecond: Unit,
    Quality: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Unit,
    DefaultSlideDuration: Unit,
    VertResolution: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Unit,
    DefaultSlideDuration: Unit,
    VertResolution: Double,
    FramesPerSecond: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Unit,
    DefaultSlideDuration: Unit,
    VertResolution: Double,
    FramesPerSecond: Double,
    Quality: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Unit,
    DefaultSlideDuration: Unit,
    VertResolution: Double,
    FramesPerSecond: Unit,
    Quality: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Unit,
    DefaultSlideDuration: Unit,
    VertResolution: Unit,
    FramesPerSecond: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Unit,
    DefaultSlideDuration: Unit,
    VertResolution: Unit,
    FramesPerSecond: Double,
    Quality: Double
  ): Unit = js.native
  def CreateVideo(
    FileName: String,
    UseTimingsAndNarrations: Unit,
    DefaultSlideDuration: Unit,
    VertResolution: Unit,
    FramesPerSecond: Unit,
    Quality: Double
  ): Unit = js.native
  
  val CreateVideoStatus: PpMediaTaskStatus = js.native
  
  val CustomDocumentProperties: Any = js.native
  
  def CustomXMLParts(Index: String): CustomXMLPart = js.native
  def CustomXMLParts(Index: Double): CustomXMLPart = js.native
  @JSName("CustomXMLParts")
  val CustomXMLParts_Original: CustomXMLParts = js.native
  
  val CustomerData: typingsJapgolly.activexPowerpoint.PowerPoint.CustomerData = js.native
  
  var DefaultLanguageID: MsoLanguageID = js.native
  
  val DefaultShape: Shape = js.native
  
  def DeleteSection(Index: Double): Unit = js.native
  
  val Designs: typingsJapgolly.activexPowerpoint.PowerPoint.Designs = js.native
  
  def DisableSections(): Unit = js.native
  
  var DisplayComments: MsoTriState = js.native
  
  def DocumentInspectors(Index: Double): DocumentInspector = js.native
  @JSName("DocumentInspectors")
  val DocumentInspectors_Original: DocumentInspectors = js.native
  
  def DocumentLibraryVersions(lIndex: Double): DocumentLibraryVersion = js.native
  @JSName("DocumentLibraryVersions")
  val DocumentLibraryVersions_Original: DocumentLibraryVersions = js.native
  
  var EncryptionProvider: String = js.native
  
  def EndReview(): Unit = js.native
  
  def EnsureAllMediaUpgraded(): Unit = js.native
  
  var EnvelopeVisible: MsoTriState = js.native
  
  /**
    * @param number [ScaleWidth=0]
    * @param number [ScaleHeight=0]
    */
  def Export(Path: String, FilterName: String): Unit = js.native
  def Export(Path: String, FilterName: String, ScaleWidth: Double): Unit = js.native
  def Export(Path: String, FilterName: String, ScaleWidth: Double, ScaleHeight: Double): Unit = js.native
  def Export(Path: String, FilterName: String, ScaleWidth: Unit, ScaleHeight: Double): Unit = js.native
  
  /**
    * @param PowerPoint.PpFixedFormatIntent [Intent=1]
    * @param Office.MsoTriState [FrameSlides=0]
    * @param PowerPoint.PpPrintHandoutOrder [HandoutOrder=1]
    * @param PowerPoint.PpPrintOutputType [OutputType=1]
    * @param Office.MsoTriState [PrintHiddenSlides=0]
    * @param PowerPoint.PrintRange [PrintRange=0]
    * @param PowerPoint.PpPrintRangeType [RangeType=1]
    * @param string [SlideShowName='']
    * @param boolean [IncludeDocProperties=false]
    * @param boolean [KeepIRMSettings=true]
    * @param boolean [DocStructureTags=true]
    * @param boolean [BitmapMissingFonts=true]
    * @param boolean [UseISO19005_1=false]
    */
  def ExportAsFixedFormat(
    Path: String,
    FixedFormatType: PpFixedFormatType,
    Intent: js.UndefOr[PpFixedFormatIntent],
    FrameSlides: js.UndefOr[MsoTriState],
    HandoutOrder: js.UndefOr[PpPrintHandoutOrder],
    OutputType: js.UndefOr[PpPrintOutputType],
    PrintHiddenSlides: js.UndefOr[MsoTriState],
    PrintRange: js.UndefOr[PrintRange],
    RangeType: js.UndefOr[PpPrintRangeType],
    SlideShowName: js.UndefOr[String],
    IncludeDocProperties: js.UndefOr[Boolean],
    KeepIRMSettings: js.UndefOr[Boolean],
    DocStructureTags: js.UndefOr[Boolean],
    BitmapMissingFonts: js.UndefOr[Boolean],
    UseISO19005_1: js.UndefOr[Boolean],
    ExternalExporter: js.UndefOr[Any]
  ): Unit = js.native
  
  val ExtraColors: typingsJapgolly.activexPowerpoint.PowerPoint.ExtraColors = js.native
  
  var FarEastLineBreakLanguage: MsoFarEastLineBreakLanguageID = js.native
  
  var FarEastLineBreakLevel: PpFarEastLineBreakLevel = js.native
  
  var Final: Boolean = js.native
  
  /**
    * @param string [SubAddress='']
    * @param boolean [NewWindow=false]
    * @param boolean [AddHistory=true]
    * @param string [ExtraInfo='']
    * @param Office.MsoExtraInfoMethod [Method=0]
    * @param string [HeaderInfo='']
    */
  def FollowHyperlink(
    Address: String,
    SubAddress: js.UndefOr[String],
    NewWindow: js.UndefOr[Boolean],
    AddHistory: js.UndefOr[Boolean],
    ExtraInfo: js.UndefOr[String],
    Method: js.UndefOr[MsoExtraInfoMethod],
    HeaderInfo: js.UndefOr[String]
  ): Unit = js.native
  
  val Fonts: typingsJapgolly.activexPowerpoint.PowerPoint.Fonts = js.native
  
  val FullName: String = js.native
  
  def GetWorkflowTasks(): WorkflowTasks = js.native
  
  def GetWorkflowTemplates(): WorkflowTemplates = js.native
  
  var GridDistance: Double = js.native
  
  val HTMLProject: typingsJapgolly.activexOffice.Office.HTMLProject = js.native
  
  val HandoutMaster: Master = js.native
  
  val HasHandoutMaster: Boolean = js.native
  
  val HasNotesMaster: Boolean = js.native
  
  val HasRevisionInfo: PpRevisionInfo = js.native
  
  val HasSections: Boolean = js.native
  
  val HasTitleMaster: MsoTriState = js.native
  
  val HasVBProject: Boolean = js.native
  
  val InMergeMode: Boolean = js.native
  
  var LayoutDirection: PpDirection = js.native
  
  def LockServerFile(): Unit = js.native
  
  def MakeIntoTemplate(IsDesignTemplate: MsoTriState): Unit = js.native
  
  def Merge(Path: String): Unit = js.native
  
  def MergeWithBaseline(withPresentation: String, baselinePresentation: String): Unit = js.native
  
  val Name: String = js.native
  
  def NewSectionAfter(Index: Double, AfterSlide: Boolean, sectionTitle: String, newSectionIndex: Double): Unit = js.native
  
  def NewWindow(): DocumentWindow = js.native
  
  var NoLineBreakAfter: String = js.native
  
  var NoLineBreakBefore: String = js.native
  
  val NotesMaster: Master = js.native
  
  val PageSetup: typingsJapgolly.activexPowerpoint.PowerPoint.PageSetup = js.native
  
  val Parent: Any = js.native
  
  var Password: String = js.native
  
  val PasswordEncryptionAlgorithm: String = js.native
  
  val PasswordEncryptionFileProperties: Boolean = js.native
  
  val PasswordEncryptionKeyLength: Double = js.native
  
  val PasswordEncryptionProvider: String = js.native
  
  val Path: String = js.native
  
  def Permission(Index: Any): UserPermission = js.native
  @JSName("Permission")
  val Permission_Original: Permission = js.native
  
  /* private */ @JSName("PowerPoint.Presentation_typekey")
  var PowerPointDotPresentation_typekey: Presentation = js.native
  
  val PrintOptions: typingsJapgolly.activexPowerpoint.PowerPoint.PrintOptions = js.native
  
  /**
    * @param number [From=-1]
    * @param number [To=-1]
    * @param string [PrintToFile='']
    * @param number [Copies=0]
    * @param Office.MsoTriState [Collate=-99]
    */
  def PrintOut(): Unit = js.native
  def PrintOut(From: Double): Unit = js.native
  def PrintOut(From: Double, To: Double): Unit = js.native
  def PrintOut(From: Double, To: Double, PrintToFile: String): Unit = js.native
  def PrintOut(From: Double, To: Double, PrintToFile: String, Copies: Double): Unit = js.native
  def PrintOut(From: Double, To: Double, PrintToFile: String, Copies: Double, Collate: MsoTriState): Unit = js.native
  def PrintOut(From: Double, To: Double, PrintToFile: String, Copies: Unit, Collate: MsoTriState): Unit = js.native
  def PrintOut(From: Double, To: Double, PrintToFile: Unit, Copies: Double): Unit = js.native
  def PrintOut(From: Double, To: Double, PrintToFile: Unit, Copies: Double, Collate: MsoTriState): Unit = js.native
  def PrintOut(From: Double, To: Double, PrintToFile: Unit, Copies: Unit, Collate: MsoTriState): Unit = js.native
  def PrintOut(From: Double, To: Unit, PrintToFile: String): Unit = js.native
  def PrintOut(From: Double, To: Unit, PrintToFile: String, Copies: Double): Unit = js.native
  def PrintOut(From: Double, To: Unit, PrintToFile: String, Copies: Double, Collate: MsoTriState): Unit = js.native
  def PrintOut(From: Double, To: Unit, PrintToFile: String, Copies: Unit, Collate: MsoTriState): Unit = js.native
  def PrintOut(From: Double, To: Unit, PrintToFile: Unit, Copies: Double): Unit = js.native
  def PrintOut(From: Double, To: Unit, PrintToFile: Unit, Copies: Double, Collate: MsoTriState): Unit = js.native
  def PrintOut(From: Double, To: Unit, PrintToFile: Unit, Copies: Unit, Collate: MsoTriState): Unit = js.native
  def PrintOut(From: Unit, To: Double): Unit = js.native
  def PrintOut(From: Unit, To: Double, PrintToFile: String): Unit = js.native
  def PrintOut(From: Unit, To: Double, PrintToFile: String, Copies: Double): Unit = js.native
  def PrintOut(From: Unit, To: Double, PrintToFile: String, Copies: Double, Collate: MsoTriState): Unit = js.native
  def PrintOut(From: Unit, To: Double, PrintToFile: String, Copies: Unit, Collate: MsoTriState): Unit = js.native
  def PrintOut(From: Unit, To: Double, PrintToFile: Unit, Copies: Double): Unit = js.native
  def PrintOut(From: Unit, To: Double, PrintToFile: Unit, Copies: Double, Collate: MsoTriState): Unit = js.native
  def PrintOut(From: Unit, To: Double, PrintToFile: Unit, Copies: Unit, Collate: MsoTriState): Unit = js.native
  def PrintOut(From: Unit, To: Unit, PrintToFile: String): Unit = js.native
  def PrintOut(From: Unit, To: Unit, PrintToFile: String, Copies: Double): Unit = js.native
  def PrintOut(From: Unit, To: Unit, PrintToFile: String, Copies: Double, Collate: MsoTriState): Unit = js.native
  def PrintOut(From: Unit, To: Unit, PrintToFile: String, Copies: Unit, Collate: MsoTriState): Unit = js.native
  def PrintOut(From: Unit, To: Unit, PrintToFile: Unit, Copies: Double): Unit = js.native
  def PrintOut(From: Unit, To: Unit, PrintToFile: Unit, Copies: Double, Collate: MsoTriState): Unit = js.native
  def PrintOut(From: Unit, To: Unit, PrintToFile: Unit, Copies: Unit, Collate: MsoTriState): Unit = js.native
  
  val PublishObjects: typingsJapgolly.activexPowerpoint.PowerPoint.PublishObjects = js.native
  
  /**
    * @param boolean [Overwrite=false]
    * @param boolean [UseSlideOrder=false]
    */
  def PublishSlides(SlideLibraryUrl: String): Unit = js.native
  def PublishSlides(SlideLibraryUrl: String, Overwrite: Boolean): Unit = js.native
  def PublishSlides(SlideLibraryUrl: String, Overwrite: Boolean, UseSlideOrder: Boolean): Unit = js.native
  def PublishSlides(SlideLibraryUrl: String, Overwrite: Unit, UseSlideOrder: Boolean): Unit = js.native
  
  val ReadOnly: MsoTriState = js.native
  
  def RejectAll(): Unit = js.native
  
  def ReloadAs(cp: MsoEncoding): Unit = js.native
  
  def RemoveBaseline(): Unit = js.native
  
  def RemoveDocumentInformation(Type: PpRemoveDocInfoType): Unit = js.native
  
  var RemovePersonalInformation: MsoTriState = js.native
  
  /** @param boolean [ShowMessage=true] */
  def ReplyWithChanges(): Unit = js.native
  def ReplyWithChanges(ShowMessage: Boolean): Unit = js.native
  
  val Research: typingsJapgolly.activexPowerpoint.PowerPoint.Research = js.native
  
  def Save(): Unit = js.native
  
  /**
    * @param PowerPoint.PpSaveAsFileType [FileFormat=11]
    * @param Office.MsoTriState [EmbedTrueTypeFonts=-2]
    */
  def SaveAs(FileName: String): Unit = js.native
  def SaveAs(FileName: String, FileFormat: Unit, EmbedTrueTypeFonts: MsoTriState): Unit = js.native
  def SaveAs(FileName: String, FileFormat: PpSaveAsFileType): Unit = js.native
  def SaveAs(FileName: String, FileFormat: PpSaveAsFileType, EmbedTrueTypeFonts: MsoTriState): Unit = js.native
  
  /**
    * @param PowerPoint.PpSaveAsFileType [FileFormat=11]
    * @param Office.MsoTriState [EmbedTrueTypeFonts=-2]
    */
  def SaveCopyAs(FileName: String): Unit = js.native
  def SaveCopyAs(FileName: String, FileFormat: Unit, EmbedTrueTypeFonts: MsoTriState): Unit = js.native
  def SaveCopyAs(FileName: String, FileFormat: PpSaveAsFileType): Unit = js.native
  def SaveCopyAs(FileName: String, FileFormat: PpSaveAsFileType, EmbedTrueTypeFonts: MsoTriState): Unit = js.native
  
  var Saved: MsoTriState = js.native
  
  val SectionCount: Double = js.native
  
  val SectionProperties: typingsJapgolly.activexPowerpoint.PowerPoint.SectionProperties = js.native
  
  /**
    * @param string [Recipients='']
    * @param string [Subject='']
    * @param boolean [ShowMessage=false]
    */
  def SendFaxOverInternet(): Unit = js.native
  def SendFaxOverInternet(Recipients: String): Unit = js.native
  def SendFaxOverInternet(Recipients: String, Subject: String): Unit = js.native
  def SendFaxOverInternet(Recipients: String, Subject: String, ShowMessage: Boolean): Unit = js.native
  def SendFaxOverInternet(Recipients: String, Subject: Unit, ShowMessage: Boolean): Unit = js.native
  def SendFaxOverInternet(Recipients: Unit, Subject: String): Unit = js.native
  def SendFaxOverInternet(Recipients: Unit, Subject: String, ShowMessage: Boolean): Unit = js.native
  def SendFaxOverInternet(Recipients: Unit, Subject: Unit, ShowMessage: Boolean): Unit = js.native
  
  /**
    * @param string [Recipients='']
    * @param string [Subject='']
    * @param boolean [ShowMessage=true]
    */
  def SendForReview(): Unit = js.native
  def SendForReview(Recipients: String): Unit = js.native
  def SendForReview(Recipients: String, Subject: String): Unit = js.native
  def SendForReview(Recipients: String, Subject: String, ShowMessage: Boolean): Unit = js.native
  def SendForReview(Recipients: String, Subject: String, ShowMessage: Boolean, IncludeAttachment: Any): Unit = js.native
  def SendForReview(Recipients: String, Subject: String, ShowMessage: Unit, IncludeAttachment: Any): Unit = js.native
  def SendForReview(Recipients: String, Subject: Unit, ShowMessage: Boolean): Unit = js.native
  def SendForReview(Recipients: String, Subject: Unit, ShowMessage: Boolean, IncludeAttachment: Any): Unit = js.native
  def SendForReview(Recipients: String, Subject: Unit, ShowMessage: Unit, IncludeAttachment: Any): Unit = js.native
  def SendForReview(Recipients: Unit, Subject: String): Unit = js.native
  def SendForReview(Recipients: Unit, Subject: String, ShowMessage: Boolean): Unit = js.native
  def SendForReview(Recipients: Unit, Subject: String, ShowMessage: Boolean, IncludeAttachment: Any): Unit = js.native
  def SendForReview(Recipients: Unit, Subject: String, ShowMessage: Unit, IncludeAttachment: Any): Unit = js.native
  def SendForReview(Recipients: Unit, Subject: Unit, ShowMessage: Boolean): Unit = js.native
  def SendForReview(Recipients: Unit, Subject: Unit, ShowMessage: Boolean, IncludeAttachment: Any): Unit = js.native
  def SendForReview(Recipients: Unit, Subject: Unit, ShowMessage: Unit, IncludeAttachment: Any): Unit = js.native
  
  def ServerPolicy(Index: String): PolicyItem = js.native
  def ServerPolicy(Index: Double): PolicyItem = js.native
  @JSName("ServerPolicy")
  val ServerPolicy_Original: ServerPolicy = js.native
  
  def SetPasswordEncryptionOptions(
    PasswordEncryptionProvider: String,
    PasswordEncryptionAlgorithm: String,
    PasswordEncryptionKeyLength: Double,
    PasswordEncryptionFileProperties: Boolean
  ): Unit = js.native
  
  def SetUndoText(Text: String): Unit = js.native
  
  val SharedWorkspace: typingsJapgolly.activexOffice.Office.SharedWorkspace = js.native
  
  def Signatures(iSig: Double): Signature = js.native
  @JSName("Signatures")
  val Signatures_Original: SignatureSet = js.native
  
  val SlideMaster: Master = js.native
  
  val SlideShowSettings: typingsJapgolly.activexPowerpoint.PowerPoint.SlideShowSettings = js.native
  
  val SlideShowWindow: typingsJapgolly.activexPowerpoint.PowerPoint.SlideShowWindow = js.native
  
  val Slides: typingsJapgolly.activexPowerpoint.PowerPoint.Slides = js.native
  
  var SnapToGrid: MsoTriState = js.native
  
  val Sync: typingsJapgolly.activexOffice.Office.Sync = js.native
  
  val Tags: typingsJapgolly.activexPowerpoint.PowerPoint.Tags = js.native
  
  val TemplateName: String = js.native
  
  val TitleMaster: Master = js.native
  
  def UpdateLinks(): Unit = js.native
  
  val VBASigned: MsoTriState = js.native
  
  val VBProject: typingsJapgolly.activexVbide.VBIDE.VBProject = js.native
  
  val WebOptions: typingsJapgolly.activexPowerpoint.PowerPoint.WebOptions = js.native
  
  def WebPagePreview(): Unit = js.native
  
  val Windows: DocumentWindows = js.native
  
  var WritePassword: String = js.native
  
  def sblt(s: String): Unit = js.native
  
  def sectionTitle(Index: Double): String = js.native
}
