package typingsJapgolly.activexOutlook.Outlook

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardView extends StObject {
  
  var AllowInCellEditing: Boolean
  
  val Application: typingsJapgolly.activexOutlook.Outlook.Application
  
  def Apply(): Unit
  
  val AutoFormatRules: typingsJapgolly.activexOutlook.Outlook.AutoFormatRules
  
  val BodyFont: ViewFont
  
  val Class: OlObjectClass
  
  def Copy(Name: String, SaveOption: OlViewSaveOption): View
  
  def Delete(): Unit
  
  var Filter: String
  
  def GoToDate(Date: VarDate): Unit
  
  val HeadingsFont: ViewFont
  
  var Language: String
  
  var LockUserChanges: Boolean
  
  var MultiLineFieldHeight: Double
  
  var Name: String
  
  /* private */ @JSName("Outlook.CardView_typekey")
  var OutlookDotCardView_typekey: CardView
  
  val Parent: Any
  
  def Reset(): Unit
  
  def Save(): Unit
  
  val SaveOption: OlViewSaveOption
  
  val Session: NameSpace
  
  var ShowEmptyFields: Boolean
  
  val SortFields: OrderFields
  
  val Standard: Boolean
  
  val ViewFields: typingsJapgolly.activexOutlook.Outlook.ViewFields
  
  val ViewType: OlViewType
  
  var Width: Double
  
  var XML: String
}
object CardView {
  
  inline def apply(
    AllowInCellEditing: Boolean,
    Application: Application,
    Apply: Callback,
    AutoFormatRules: AutoFormatRules,
    BodyFont: ViewFont,
    Class: OlObjectClass,
    Copy: (String, OlViewSaveOption) => View,
    Delete: Callback,
    Filter: String,
    GoToDate: VarDate => Callback,
    HeadingsFont: ViewFont,
    Language: String,
    LockUserChanges: Boolean,
    MultiLineFieldHeight: Double,
    Name: String,
    OutlookDotCardView_typekey: CardView,
    Parent: Any,
    Reset: Callback,
    Save: Callback,
    SaveOption: OlViewSaveOption,
    Session: NameSpace,
    ShowEmptyFields: Boolean,
    SortFields: OrderFields,
    Standard: Boolean,
    ViewFields: ViewFields,
    ViewType: OlViewType,
    Width: Double,
    XML: String
  ): CardView = {
    val __obj = js.Dynamic.literal(AllowInCellEditing = AllowInCellEditing.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Apply = Apply.toJsFn, AutoFormatRules = AutoFormatRules.asInstanceOf[js.Any], BodyFont = BodyFont.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Copy = js.Any.fromFunction2(Copy), Delete = Delete.toJsFn, Filter = Filter.asInstanceOf[js.Any], GoToDate = js.Any.fromFunction1((t0: VarDate) => GoToDate(t0).runNow()), HeadingsFont = HeadingsFont.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], LockUserChanges = LockUserChanges.asInstanceOf[js.Any], MultiLineFieldHeight = MultiLineFieldHeight.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Reset = Reset.toJsFn, Save = Save.toJsFn, SaveOption = SaveOption.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], ShowEmptyFields = ShowEmptyFields.asInstanceOf[js.Any], SortFields = SortFields.asInstanceOf[js.Any], Standard = Standard.asInstanceOf[js.Any], ViewFields = ViewFields.asInstanceOf[js.Any], ViewType = ViewType.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], XML = XML.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.CardView_typekey")(OutlookDotCardView_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardView]
  }
  
  extension [Self <: CardView](x: Self) {
    
    inline def setAllowInCellEditing(value: Boolean): Self = StObject.set(x, "AllowInCellEditing", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setApply(value: Callback): Self = StObject.set(x, "Apply", value.toJsFn)
    
    inline def setAutoFormatRules(value: AutoFormatRules): Self = StObject.set(x, "AutoFormatRules", value.asInstanceOf[js.Any])
    
    inline def setBodyFont(value: ViewFont): Self = StObject.set(x, "BodyFont", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setCopy(value: (String, OlViewSaveOption) => View): Self = StObject.set(x, "Copy", js.Any.fromFunction2(value))
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setFilter(value: String): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setGoToDate(value: VarDate => Callback): Self = StObject.set(x, "GoToDate", js.Any.fromFunction1((t0: VarDate) => value(t0).runNow()))
    
    inline def setHeadingsFont(value: ViewFont): Self = StObject.set(x, "HeadingsFont", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    inline def setLockUserChanges(value: Boolean): Self = StObject.set(x, "LockUserChanges", value.asInstanceOf[js.Any])
    
    inline def setMultiLineFieldHeight(value: Double): Self = StObject.set(x, "MultiLineFieldHeight", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotCardView_typekey(value: CardView): Self = StObject.set(x, "Outlook.CardView_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setReset(value: Callback): Self = StObject.set(x, "Reset", value.toJsFn)
    
    inline def setSave(value: Callback): Self = StObject.set(x, "Save", value.toJsFn)
    
    inline def setSaveOption(value: OlViewSaveOption): Self = StObject.set(x, "SaveOption", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setShowEmptyFields(value: Boolean): Self = StObject.set(x, "ShowEmptyFields", value.asInstanceOf[js.Any])
    
    inline def setSortFields(value: OrderFields): Self = StObject.set(x, "SortFields", value.asInstanceOf[js.Any])
    
    inline def setStandard(value: Boolean): Self = StObject.set(x, "Standard", value.asInstanceOf[js.Any])
    
    inline def setViewFields(value: ViewFields): Self = StObject.set(x, "ViewFields", value.asInstanceOf[js.Any])
    
    inline def setViewType(value: OlViewType): Self = StObject.set(x, "ViewType", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    inline def setXML(value: String): Self = StObject.set(x, "XML", value.asInstanceOf[js.Any])
  }
}
