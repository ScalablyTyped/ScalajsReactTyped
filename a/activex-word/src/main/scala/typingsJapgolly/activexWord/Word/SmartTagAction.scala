package typingsJapgolly.activexWord.Word

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartTagAction extends StObject {
  
  val ActiveXControl: Any
  
  val Application: typingsJapgolly.activexWord.Word.Application
  
  var CheckboxState: Boolean
  
  val Creator: Double
  
  def Execute(): Unit
  
  var ExpandDocumentFragment: Boolean
  
  var ExpandHelp: Boolean
  
  var ListSelection: Double
  
  val Name: String
  
  val Parent: Any
  
  val PresentInPane: Boolean
  
  var RadioGroupSelection: Double
  
  var TextboxText: String
  
  val Type: WdSmartTagControlType
  
  /* private */ @JSName("Word.SmartTagAction_typekey")
  var WordDotSmartTagAction_typekey: SmartTagAction
}
object SmartTagAction {
  
  inline def apply(
    ActiveXControl: Any,
    Application: Application,
    CheckboxState: Boolean,
    Creator: Double,
    Execute: Callback,
    ExpandDocumentFragment: Boolean,
    ExpandHelp: Boolean,
    ListSelection: Double,
    Name: String,
    Parent: Any,
    PresentInPane: Boolean,
    RadioGroupSelection: Double,
    TextboxText: String,
    Type: WdSmartTagControlType,
    WordDotSmartTagAction_typekey: SmartTagAction
  ): SmartTagAction = {
    val __obj = js.Dynamic.literal(ActiveXControl = ActiveXControl.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], CheckboxState = CheckboxState.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Execute = Execute.toJsFn, ExpandDocumentFragment = ExpandDocumentFragment.asInstanceOf[js.Any], ExpandHelp = ExpandHelp.asInstanceOf[js.Any], ListSelection = ListSelection.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PresentInPane = PresentInPane.asInstanceOf[js.Any], RadioGroupSelection = RadioGroupSelection.asInstanceOf[js.Any], TextboxText = TextboxText.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.SmartTagAction_typekey")(WordDotSmartTagAction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTagAction]
  }
  
  extension [Self <: SmartTagAction](x: Self) {
    
    inline def setActiveXControl(value: Any): Self = StObject.set(x, "ActiveXControl", value.asInstanceOf[js.Any])
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCheckboxState(value: Boolean): Self = StObject.set(x, "CheckboxState", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setExecute(value: Callback): Self = StObject.set(x, "Execute", value.toJsFn)
    
    inline def setExpandDocumentFragment(value: Boolean): Self = StObject.set(x, "ExpandDocumentFragment", value.asInstanceOf[js.Any])
    
    inline def setExpandHelp(value: Boolean): Self = StObject.set(x, "ExpandHelp", value.asInstanceOf[js.Any])
    
    inline def setListSelection(value: Double): Self = StObject.set(x, "ListSelection", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setPresentInPane(value: Boolean): Self = StObject.set(x, "PresentInPane", value.asInstanceOf[js.Any])
    
    inline def setRadioGroupSelection(value: Double): Self = StObject.set(x, "RadioGroupSelection", value.asInstanceOf[js.Any])
    
    inline def setTextboxText(value: String): Self = StObject.set(x, "TextboxText", value.asInstanceOf[js.Any])
    
    inline def setType(value: WdSmartTagControlType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setWordDotSmartTagAction_typekey(value: SmartTagAction): Self = StObject.set(x, "Word.SmartTagAction_typekey", value.asInstanceOf[js.Any])
  }
}
