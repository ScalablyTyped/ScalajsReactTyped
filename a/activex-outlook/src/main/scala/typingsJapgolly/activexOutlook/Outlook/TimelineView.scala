package typingsJapgolly.activexOutlook.Outlook

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineView extends StObject {
  
  val Application: typingsJapgolly.activexOutlook.Outlook.Application
  
  def Apply(): Unit
  
  val Class: OlObjectClass
  
  def Copy(Name: String, SaveOption: OlViewSaveOption): View
  
  var DefaultExpandCollapseSetting: OlDefaultExpandCollapseSetting
  
  def Delete(): Unit
  
  var EndField: String
  
  var Filter: String
  
  def GoToDate(Date: VarDate): Unit
  
  val GroupByFields: OrderFields
  
  val ItemFont: ViewFont
  
  var Language: String
  
  var LockUserChanges: Boolean
  
  val LowerScaleFont: ViewFont
  
  var MaxLabelWidth: Double
  
  var Name: String
  
  /* private */ @JSName("Outlook.TimelineView_typekey")
  var OutlookDotTimelineView_typekey: TimelineView
  
  val Parent: Any
  
  def Reset(): Unit
  
  def Save(): Unit
  
  val SaveOption: OlViewSaveOption
  
  val Session: NameSpace
  
  var ShowLabelWhenViewingByMonth: Boolean
  
  var ShowWeekNumbers: Boolean
  
  val Standard: Boolean
  
  var StartField: String
  
  var TimelineViewMode: OlTimelineViewMode
  
  val UpperScaleFont: ViewFont
  
  val ViewType: OlViewType
  
  var XML: String
}
object TimelineView {
  
  inline def apply(
    Application: Application,
    Apply: Callback,
    Class: OlObjectClass,
    Copy: (String, OlViewSaveOption) => View,
    DefaultExpandCollapseSetting: OlDefaultExpandCollapseSetting,
    Delete: Callback,
    EndField: String,
    Filter: String,
    GoToDate: VarDate => Callback,
    GroupByFields: OrderFields,
    ItemFont: ViewFont,
    Language: String,
    LockUserChanges: Boolean,
    LowerScaleFont: ViewFont,
    MaxLabelWidth: Double,
    Name: String,
    OutlookDotTimelineView_typekey: TimelineView,
    Parent: Any,
    Reset: Callback,
    Save: Callback,
    SaveOption: OlViewSaveOption,
    Session: NameSpace,
    ShowLabelWhenViewingByMonth: Boolean,
    ShowWeekNumbers: Boolean,
    Standard: Boolean,
    StartField: String,
    TimelineViewMode: OlTimelineViewMode,
    UpperScaleFont: ViewFont,
    ViewType: OlViewType,
    XML: String
  ): TimelineView = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Apply = Apply.toJsFn, Class = Class.asInstanceOf[js.Any], Copy = js.Any.fromFunction2(Copy), DefaultExpandCollapseSetting = DefaultExpandCollapseSetting.asInstanceOf[js.Any], Delete = Delete.toJsFn, EndField = EndField.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], GoToDate = js.Any.fromFunction1((t0: VarDate) => GoToDate(t0).runNow()), GroupByFields = GroupByFields.asInstanceOf[js.Any], ItemFont = ItemFont.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], LockUserChanges = LockUserChanges.asInstanceOf[js.Any], LowerScaleFont = LowerScaleFont.asInstanceOf[js.Any], MaxLabelWidth = MaxLabelWidth.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Reset = Reset.toJsFn, Save = Save.toJsFn, SaveOption = SaveOption.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], ShowLabelWhenViewingByMonth = ShowLabelWhenViewingByMonth.asInstanceOf[js.Any], ShowWeekNumbers = ShowWeekNumbers.asInstanceOf[js.Any], Standard = Standard.asInstanceOf[js.Any], StartField = StartField.asInstanceOf[js.Any], TimelineViewMode = TimelineViewMode.asInstanceOf[js.Any], UpperScaleFont = UpperScaleFont.asInstanceOf[js.Any], ViewType = ViewType.asInstanceOf[js.Any], XML = XML.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.TimelineView_typekey")(OutlookDotTimelineView_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineView]
  }
  
  extension [Self <: TimelineView](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setApply(value: Callback): Self = StObject.set(x, "Apply", value.toJsFn)
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setCopy(value: (String, OlViewSaveOption) => View): Self = StObject.set(x, "Copy", js.Any.fromFunction2(value))
    
    inline def setDefaultExpandCollapseSetting(value: OlDefaultExpandCollapseSetting): Self = StObject.set(x, "DefaultExpandCollapseSetting", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "Delete", value.toJsFn)
    
    inline def setEndField(value: String): Self = StObject.set(x, "EndField", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: String): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setGoToDate(value: VarDate => Callback): Self = StObject.set(x, "GoToDate", js.Any.fromFunction1((t0: VarDate) => value(t0).runNow()))
    
    inline def setGroupByFields(value: OrderFields): Self = StObject.set(x, "GroupByFields", value.asInstanceOf[js.Any])
    
    inline def setItemFont(value: ViewFont): Self = StObject.set(x, "ItemFont", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    inline def setLockUserChanges(value: Boolean): Self = StObject.set(x, "LockUserChanges", value.asInstanceOf[js.Any])
    
    inline def setLowerScaleFont(value: ViewFont): Self = StObject.set(x, "LowerScaleFont", value.asInstanceOf[js.Any])
    
    inline def setMaxLabelWidth(value: Double): Self = StObject.set(x, "MaxLabelWidth", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotTimelineView_typekey(value: TimelineView): Self = StObject.set(x, "Outlook.TimelineView_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setReset(value: Callback): Self = StObject.set(x, "Reset", value.toJsFn)
    
    inline def setSave(value: Callback): Self = StObject.set(x, "Save", value.toJsFn)
    
    inline def setSaveOption(value: OlViewSaveOption): Self = StObject.set(x, "SaveOption", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setShowLabelWhenViewingByMonth(value: Boolean): Self = StObject.set(x, "ShowLabelWhenViewingByMonth", value.asInstanceOf[js.Any])
    
    inline def setShowWeekNumbers(value: Boolean): Self = StObject.set(x, "ShowWeekNumbers", value.asInstanceOf[js.Any])
    
    inline def setStandard(value: Boolean): Self = StObject.set(x, "Standard", value.asInstanceOf[js.Any])
    
    inline def setStartField(value: String): Self = StObject.set(x, "StartField", value.asInstanceOf[js.Any])
    
    inline def setTimelineViewMode(value: OlTimelineViewMode): Self = StObject.set(x, "TimelineViewMode", value.asInstanceOf[js.Any])
    
    inline def setUpperScaleFont(value: ViewFont): Self = StObject.set(x, "UpperScaleFont", value.asInstanceOf[js.Any])
    
    inline def setViewType(value: OlViewType): Self = StObject.set(x, "ViewType", value.asInstanceOf[js.Any])
    
    inline def setXML(value: String): Self = StObject.set(x, "XML", value.asInstanceOf[js.Any])
  }
}
