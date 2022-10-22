package typingsJapgolly.activexVbide.VBIDE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component extends StObject {
  
  val Application: typingsJapgolly.activexVbide.VBIDE.Application
  
  var IsDirty: Boolean
  
  var Name: String
  
  def Parent(index: Any): Component
  @JSName("Parent")
  val Parent_Original: Components
  
  /* private */ @JSName("VBIDE.Component_typekey")
  var VBIDEDotComponent_typekey: Component
}
object Component {
  
  inline def apply(
    Application: Application,
    IsDirty: Boolean,
    Name: String,
    Parent: Components,
    VBIDEDotComponent_typekey: Component
  ): Component = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], IsDirty = IsDirty.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("VBIDE.Component_typekey")(VBIDEDotComponent_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Component]
  }
  
  extension [Self <: Component](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setIsDirty(value: Boolean): Self = StObject.set(x, "IsDirty", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Components): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setVBIDEDotComponent_typekey(value: Component): Self = StObject.set(x, "VBIDE.Component_typekey", value.asInstanceOf[js.Any])
  }
}
