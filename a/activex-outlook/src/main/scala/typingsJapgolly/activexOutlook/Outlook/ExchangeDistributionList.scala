package typingsJapgolly.activexOutlook.Outlook

import typingsJapgolly.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.ExchangeDistributionList")
@js.native
class ExchangeDistributionList protected () extends js.Object {
  var Address: String = js.native
  val AddressEntryUserType: OlAddressEntryUserType = js.native
  val Alias: String = js.native
  val Application: typingsJapgolly.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  var Comments: String = js.native
  val DisplayType: OlDisplayType = js.native
  val ID: String = js.native
  var MAPIOBJECT: js.Any = js.native
  val Manager: AddressEntry = js.native
  val Members: AddressEntries = js.native
  var Name: String = js.native
  @JSName("Outlook.ExchangeDistributionList_typekey")
  var OutlookDotExchangeDistributionList_typekey: ExchangeDistributionList = js.native
  val Parent: js.Any = js.native
  val PrimarySmtpAddress: String = js.native
  val PropertyAccessor: typingsJapgolly.activexOutlook.Outlook.PropertyAccessor = js.native
  val Session: NameSpace = js.native
  var Type: String = js.native
  def Delete(): Unit = js.native
  def Details(): Unit = js.native
  def Details(HWnd: js.Any): Unit = js.native
  def GetContact(): ContactItem = js.native
  def GetExchangeDistributionList(): ExchangeDistributionList = js.native
  def GetExchangeDistributionListMembers(): AddressEntries = js.native
  def GetExchangeUser(): ExchangeUser = js.native
  def GetFreeBusy(Start: VarDate, MinPerChar: Double): String = js.native
  def GetFreeBusy(Start: VarDate, MinPerChar: Double, CompleteFormat: js.Any): String = js.native
  def GetMemberOfList(): AddressEntries = js.native
  def GetOwners(): AddressEntries = js.native
  def Update(): Unit = js.native
  def Update(MakePermanent: js.Any): Unit = js.native
  def Update(MakePermanent: js.Any, Refresh: js.Any): Unit = js.native
  def UpdateFreeBusy(): Unit = js.native
}

