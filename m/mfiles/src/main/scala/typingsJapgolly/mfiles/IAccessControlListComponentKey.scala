package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFBuiltInPropertyDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAccessControlListComponentKey extends StObject {
  
  def Clone(): IAccessControlListComponentKey
  
  var ItemID: Double
  
  var PropertyDefID: MFBuiltInPropertyDef | Double
}
object IAccessControlListComponentKey {
  
  inline def apply(
    Clone: CallbackTo[IAccessControlListComponentKey],
    ItemID: Double,
    PropertyDefID: MFBuiltInPropertyDef | Double
  ): IAccessControlListComponentKey = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, ItemID = ItemID.asInstanceOf[js.Any], PropertyDefID = PropertyDefID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccessControlListComponentKey]
  }
  
  extension [Self <: IAccessControlListComponentKey](x: Self) {
    
    inline def setClone(value: CallbackTo[IAccessControlListComponentKey]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setItemID(value: Double): Self = StObject.set(x, "ItemID", value.asInstanceOf[js.Any])
    
    inline def setPropertyDefID(value: MFBuiltInPropertyDef | Double): Self = StObject.set(x, "PropertyDefID", value.asInstanceOf[js.Any])
  }
}
