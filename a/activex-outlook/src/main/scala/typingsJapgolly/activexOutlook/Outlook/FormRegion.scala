package typingsJapgolly.activexOutlook.Outlook

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormRegion extends StObject {
  
  val Application: typingsJapgolly.activexOutlook.Outlook.Application
  
  val Class: OlObjectClass
  
  var Detail: String
  
  val DisplayName: String
  
  var EnableAutoLayout: Boolean
  
  val Form: Any
  
  val FormRegionMode: OlFormRegionMode
  
  val Inspector: typingsJapgolly.activexOutlook.Outlook.Inspector
  
  val InternalName: String
  
  val IsExpanded: Boolean
  
  val Item: Any
  
  val Language: Double
  
  /* private */ @JSName("Outlook.FormRegion_typekey")
  var OutlookDotFormRegion_typekey: FormRegion
  
  val Parent: Any
  
  def Reflow(): Unit
  
  def Select(): Unit
  
  val Session: NameSpace
  
  def SetControlItemProperty(Control: Any, PropertyName: String): Unit
  
  var SuppressControlReplacement: Boolean
  
  var Visible: Boolean
}
object FormRegion {
  
  inline def apply(
    Application: Application,
    Class: OlObjectClass,
    Detail: String,
    DisplayName: String,
    EnableAutoLayout: Boolean,
    Form: Any,
    FormRegionMode: OlFormRegionMode,
    Inspector: Inspector,
    InternalName: String,
    IsExpanded: Boolean,
    Item: Any,
    Language: Double,
    OutlookDotFormRegion_typekey: FormRegion,
    Parent: Any,
    Reflow: Callback,
    Select: Callback,
    Session: NameSpace,
    SetControlItemProperty: (Any, String) => Callback,
    SuppressControlReplacement: Boolean,
    Visible: Boolean
  ): FormRegion = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Detail = Detail.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], EnableAutoLayout = EnableAutoLayout.asInstanceOf[js.Any], Form = Form.asInstanceOf[js.Any], FormRegionMode = FormRegionMode.asInstanceOf[js.Any], Inspector = Inspector.asInstanceOf[js.Any], InternalName = InternalName.asInstanceOf[js.Any], IsExpanded = IsExpanded.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Reflow = Reflow.toJsFn, Select = Select.toJsFn, Session = Session.asInstanceOf[js.Any], SetControlItemProperty = js.Any.fromFunction2((t0: Any, t1: String) => (SetControlItemProperty(t0, t1)).runNow()), SuppressControlReplacement = SuppressControlReplacement.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.FormRegion_typekey")(OutlookDotFormRegion_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormRegion]
  }
  
  extension [Self <: FormRegion](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setDetail(value: String): Self = StObject.set(x, "Detail", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setEnableAutoLayout(value: Boolean): Self = StObject.set(x, "EnableAutoLayout", value.asInstanceOf[js.Any])
    
    inline def setForm(value: Any): Self = StObject.set(x, "Form", value.asInstanceOf[js.Any])
    
    inline def setFormRegionMode(value: OlFormRegionMode): Self = StObject.set(x, "FormRegionMode", value.asInstanceOf[js.Any])
    
    inline def setInspector(value: Inspector): Self = StObject.set(x, "Inspector", value.asInstanceOf[js.Any])
    
    inline def setInternalName(value: String): Self = StObject.set(x, "InternalName", value.asInstanceOf[js.Any])
    
    inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "IsExpanded", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: Double): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotFormRegion_typekey(value: FormRegion): Self = StObject.set(x, "Outlook.FormRegion_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setReflow(value: Callback): Self = StObject.set(x, "Reflow", value.toJsFn)
    
    inline def setSelect(value: Callback): Self = StObject.set(x, "Select", value.toJsFn)
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setSetControlItemProperty(value: (Any, String) => Callback): Self = StObject.set(x, "SetControlItemProperty", js.Any.fromFunction2((t0: Any, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setSuppressControlReplacement(value: Boolean): Self = StObject.set(x, "SuppressControlReplacement", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "Visible", value.asInstanceOf[js.Any])
  }
}
