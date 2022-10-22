package typingsJapgolly.activexOutlook.Outlook

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BusinessCardView extends StObject {
  
  val Application: typingsJapgolly.activexOutlook.Outlook.Application
  
  def Apply(): Unit
  
  var CardSize: Double
  
  val Class: OlObjectClass
  
  def Copy(Name: String, SaveOption: OlViewSaveOption): View
  
  def Delete(): Unit
  
  var Filter: String
  
  def GoToDate(Date: VarDate): Unit
  
  val HeadingsFont: ViewFont
  
  var Language: String
  
  var LockUserChanges: Boolean
  
  var Name: String
  
  /* private */ @JSName("Outlook.BusinessCardView_typekey")
  var OutlookDotBusinessCardView_typekey: BusinessCardView
  
  val Parent: Any
  
  def Reset(): Unit
  
  def Save(): Unit
  
  val SaveOption: OlViewSaveOption
  
  val Session: NameSpace
  
  val SortFields: OrderFields
  
  val Standard: Boolean
  
  val ViewType: OlViewType
  
  var XML: String
}
object BusinessCardView {
  
  inline def apply(
    Application: Application,
    Apply: Callback,
    CardSize: Double,
    Class: OlObjectClass,
    Copy: (String, OlViewSaveOption) => View,
    Delete: Callback,
    Filter: String,
    GoToDate: VarDate => Callback,
    HeadingsFont: ViewFont,
    Language: String,
    LockUserChanges: Boolean,
    Name: String,
    OutlookDotBusinessCardView_typekey: BusinessCardView,
    Parent: Any,
    Reset: Callback,
    Save: Callback,
    SaveOption: OlViewSaveOption,
    Session: NameSpace,
    SortFields: OrderFields,
    Standard: Boolean,
    ViewType: OlViewType,
    XML: String
  ): BusinessCardView = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Apply = Apply.toJsFn, CardSize = CardSize.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Copy = js.Any.fromFunction2(Copy), Delete = Delete.toJsFn, Filter = Filter.asInstanceOf[js.Any], GoToDate = js.Any.fromFunction1((t0: VarDate) => GoToDate(t0).runNow()), HeadingsFont = HeadingsFont.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], LockUserChanges = LockUserChanges.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Reset = Reset.toJsFn, Save = Save.toJsFn, SaveOption = SaveOption.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], SortFields = SortFields.asInstanceOf[js.Any], Standard = Standard.asInstanceOf[js.Any], ViewType = ViewType.asInstanceOf[js.Any], XML = XML.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.BusinessCardView_typekey")(OutlookDotBusinessCardView_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusinessCardView]
  }
  
  extension [Self <: BusinessCardView](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setApply(value: Callback): Self = StObject.set(x, "Apply", value.toJsFn)
    
    inline def setCardSize(value: Double): Self = StObject.set(x, "CardSize", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setCopy(value: (String, OlViewSaveOption) => View): Self = StObject.set(x, "Copy", js.Any.fromFunction2(value))
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setFilter(value: String): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setGoToDate(value: VarDate => Callback): Self = StObject.set(x, "GoToDate", js.Any.fromFunction1((t0: VarDate) => value(t0).runNow()))
    
    inline def setHeadingsFont(value: ViewFont): Self = StObject.set(x, "HeadingsFont", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    inline def setLockUserChanges(value: Boolean): Self = StObject.set(x, "LockUserChanges", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotBusinessCardView_typekey(value: BusinessCardView): Self = StObject.set(x, "Outlook.BusinessCardView_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setReset(value: Callback): Self = StObject.set(x, "Reset", value.toJsFn)
    
    inline def setSave(value: Callback): Self = StObject.set(x, "Save", value.toJsFn)
    
    inline def setSaveOption(value: OlViewSaveOption): Self = StObject.set(x, "SaveOption", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setSortFields(value: OrderFields): Self = StObject.set(x, "SortFields", value.asInstanceOf[js.Any])
    
    inline def setStandard(value: Boolean): Self = StObject.set(x, "Standard", value.asInstanceOf[js.Any])
    
    inline def setViewType(value: OlViewType): Self = StObject.set(x, "ViewType", value.asInstanceOf[js.Any])
    
    inline def setXML(value: String): Self = StObject.set(x, "XML", value.asInstanceOf[js.Any])
  }
}
