package typingsJapgolly.activexOutlook.Outlook

import typingsJapgolly.activexOutlook.activexOutlookInts.`0`
import typingsJapgolly.activexOutlook.activexOutlookInts.`11`
import typingsJapgolly.activexOutlook.activexOutlookInts.`12`
import typingsJapgolly.activexOutlook.activexOutlookInts.`1`
import typingsJapgolly.activexOutlook.activexOutlookInts.`2`
import typingsJapgolly.activexOutlook.activexOutlookInts.`3`
import typingsJapgolly.activexOutlook.activexOutlookInts.`4`
import typingsJapgolly.activexOutlook.activexOutlookInts.`5`
import typingsJapgolly.activexOutlook.activexOutlookInts.`6`
import typingsJapgolly.activexOutlook.activexOutlookInts.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Application extends StObject {
  
  def ActiveExplorer(): Explorer = js.native
  
  def ActiveInspector(): Inspector = js.native
  
  def ActiveWindow(): Any = js.native
  
  def AdvancedSearch(Scope: String): Search = js.native
  def AdvancedSearch(Scope: String, Filter: Any): Search = js.native
  def AdvancedSearch(Scope: String, Filter: Any, SearchSubFolders: Any): Search = js.native
  def AdvancedSearch(Scope: String, Filter: Any, SearchSubFolders: Any, Tag: Any): Search = js.native
  def AdvancedSearch(Scope: String, Filter: Any, SearchSubFolders: Unit, Tag: Any): Search = js.native
  def AdvancedSearch(Scope: String, Filter: Unit, SearchSubFolders: Any): Search = js.native
  def AdvancedSearch(Scope: String, Filter: Unit, SearchSubFolders: Any, Tag: Any): Search = js.native
  def AdvancedSearch(Scope: String, Filter: Unit, SearchSubFolders: Unit, Tag: Any): Search = js.native
  
  val AnswerWizard: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.AnswerWizard */ Any = js.native
  
  val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  val Assistance: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.IAssistance */ Any = js.native
  
  val Assistant: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.Assistant */ Any = js.native
  
  val COMAddIns: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.COMAddIns */ Any = js.native
  
  val Class: OlObjectClass = js.native
  
  def CopyFile(FilePath: String, DestFolderPath: String): Any = js.native
  
  def CreateItem(ItemType: `12` | `11`): MobileItem = js.native
  
  def CreateItemFromTemplate(TemplatePath: String): Any = js.native
  def CreateItemFromTemplate(TemplatePath: String, InFolder: Any): Any = js.native
  
  @JSName("CreateItem")
  def CreateItem_0(ItemType: `0`): MailItem = js.native
  @JSName("CreateItem")
  def CreateItem_1(ItemType: `1`): AppointmentItem = js.native
  @JSName("CreateItem")
  def CreateItem_2(ItemType: `2`): ContactItem = js.native
  @JSName("CreateItem")
  def CreateItem_3(ItemType: `3`): TaskItem = js.native
  @JSName("CreateItem")
  def CreateItem_4(ItemType: `4`): JournalItem = js.native
  @JSName("CreateItem")
  def CreateItem_5(ItemType: `5`): NoteItem = js.native
  @JSName("CreateItem")
  def CreateItem_6(ItemType: `6`): PostItem = js.native
  @JSName("CreateItem")
  def CreateItem_7(ItemType: `7`): DistListItem = js.native
  
  def CreateObject(ObjectName: String): Any = js.native
  
  val DefaultProfileName: String = js.native
  
  val Explorers: typingsJapgolly.activexOutlook.Outlook.Explorers = js.native
  
  var FeatureInstall: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.MsoFeatureInstall */ Any = js.native
  
  def GetNamespace(Type: String): NameSpace = js.native
  
  def GetNewNickNames(pvar: Any): Unit = js.native
  
  def GetObjectReference(Item: Any, ReferenceType: OlReferenceType): Any = js.native
  
  val Inspectors: typingsJapgolly.activexOutlook.Outlook.Inspectors = js.native
  
  def IsSearchSynchronous(LookInFolders: String): Boolean = js.native
  
  val IsTrusted: Boolean = js.native
  
  val LanguageSettings: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.LanguageSettings */ Any = js.native
  
  val Name: String = js.native
  
  /* private */ @JSName("Outlook.Application_typekey")
  var OutlookDotApplication_typekey: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  
  val Parent: Any = js.native
  
  val PickerDialog: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.PickerDialog */ Any = js.native
  
  val ProductCode: String = js.native
  
  def Quit(): Unit = js.native
  
  def RefreshFormRegionDefinition(RegionName: String): Unit = js.native
  
  val Reminders: typingsJapgolly.activexOutlook.Outlook.Reminders = js.native
  
  val Session: NameSpace = js.native
  
  val TimeZones: typingsJapgolly.activexOutlook.Outlook.TimeZones = js.native
  
  val Version: String = js.native
}
