package typingsJapgolly.activexOutlook.Outlook

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectNamesDialog extends StObject {
  
  var AllowMultipleSelection: Boolean
  
  val Application: typingsJapgolly.activexOutlook.Outlook.Application
  
  var BccLabel: String
  
  var Caption: String
  
  var CcLabel: String
  
  val Class: OlObjectClass
  
  def Display(): Boolean
  
  var ForceResolution: Boolean
  
  var InitialAddressList: AddressList
  
  var NumberOfRecipientSelectors: OlRecipientSelectors
  
  /* private */ @JSName("Outlook.SelectNamesDialog_typekey")
  var OutlookDotSelectNamesDialog_typekey: SelectNamesDialog
  
  val Parent: Any
  
  var Recipients: typingsJapgolly.activexOutlook.Outlook.Recipients
  
  val Session: NameSpace
  
  def SetDefaultDisplayMode(defaultMode: OlDefaultSelectNamesDisplayMode): Unit
  
  var ShowOnlyInitialAddressList: Boolean
  
  var ToLabel: String
}
object SelectNamesDialog {
  
  inline def apply(
    AllowMultipleSelection: Boolean,
    Application: Application,
    BccLabel: String,
    Caption: String,
    CcLabel: String,
    Class: OlObjectClass,
    Display: CallbackTo[Boolean],
    ForceResolution: Boolean,
    InitialAddressList: AddressList,
    NumberOfRecipientSelectors: OlRecipientSelectors,
    OutlookDotSelectNamesDialog_typekey: SelectNamesDialog,
    Parent: Any,
    Recipients: Recipients,
    Session: NameSpace,
    SetDefaultDisplayMode: OlDefaultSelectNamesDisplayMode => Callback,
    ShowOnlyInitialAddressList: Boolean,
    ToLabel: String
  ): SelectNamesDialog = {
    val __obj = js.Dynamic.literal(AllowMultipleSelection = AllowMultipleSelection.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], BccLabel = BccLabel.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], CcLabel = CcLabel.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Display = Display.toJsFn, ForceResolution = ForceResolution.asInstanceOf[js.Any], InitialAddressList = InitialAddressList.asInstanceOf[js.Any], NumberOfRecipientSelectors = NumberOfRecipientSelectors.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Recipients = Recipients.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], SetDefaultDisplayMode = js.Any.fromFunction1((t0: OlDefaultSelectNamesDisplayMode) => SetDefaultDisplayMode(t0).runNow()), ShowOnlyInitialAddressList = ShowOnlyInitialAddressList.asInstanceOf[js.Any], ToLabel = ToLabel.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.SelectNamesDialog_typekey")(OutlookDotSelectNamesDialog_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectNamesDialog]
  }
  
  extension [Self <: SelectNamesDialog](x: Self) {
    
    inline def setAllowMultipleSelection(value: Boolean): Self = StObject.set(x, "AllowMultipleSelection", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBccLabel(value: String): Self = StObject.set(x, "BccLabel", value.asInstanceOf[js.Any])
    
    inline def setCaption(value: String): Self = StObject.set(x, "Caption", value.asInstanceOf[js.Any])
    
    inline def setCcLabel(value: String): Self = StObject.set(x, "CcLabel", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setDisplay(value: CallbackTo[Boolean]): Self = StObject.set(x, "Display", value.toJsFn)
    
    inline def setForceResolution(value: Boolean): Self = StObject.set(x, "ForceResolution", value.asInstanceOf[js.Any])
    
    inline def setInitialAddressList(value: AddressList): Self = StObject.set(x, "InitialAddressList", value.asInstanceOf[js.Any])
    
    inline def setNumberOfRecipientSelectors(value: OlRecipientSelectors): Self = StObject.set(x, "NumberOfRecipientSelectors", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotSelectNamesDialog_typekey(value: SelectNamesDialog): Self = StObject.set(x, "Outlook.SelectNamesDialog_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setRecipients(value: Recipients): Self = StObject.set(x, "Recipients", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setSetDefaultDisplayMode(value: OlDefaultSelectNamesDisplayMode => Callback): Self = StObject.set(x, "SetDefaultDisplayMode", js.Any.fromFunction1((t0: OlDefaultSelectNamesDisplayMode) => value(t0).runNow()))
    
    inline def setShowOnlyInitialAddressList(value: Boolean): Self = StObject.set(x, "ShowOnlyInitialAddressList", value.asInstanceOf[js.Any])
    
    inline def setToLabel(value: String): Self = StObject.set(x, "ToLabel", value.asInstanceOf[js.Any])
  }
}
