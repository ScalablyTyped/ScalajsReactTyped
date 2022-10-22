package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFBuiltInValueList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IValueListItem extends StObject {
  
  var AutomaticPermissionsForObjects: IAutomaticPermissions
  
  def Clone(): IValueListItem
  
  def CloneFrom(ValueListItem: IValueListItem): Unit
  
  val Deleted: Boolean
  
  val DisplayID: String
  
  val DisplayIDAvailable: Boolean
  
  def GetIconAsPNG(Width: Double, Height: Double): js.Array[Double]
  
  var HasOwner: Boolean
  
  var HasParent: Boolean
  
  var ID: Double
  
  var Icon: js.Array[Double]
  
  val ItemGUID: String
  
  var Name: String
  
  var OwnerID: Double
  
  var ParentID: Double
  
  var ValueListID: MFBuiltInValueList | Double
}
object IValueListItem {
  
  inline def apply(
    AutomaticPermissionsForObjects: IAutomaticPermissions,
    Clone: CallbackTo[IValueListItem],
    CloneFrom: IValueListItem => Callback,
    Deleted: Boolean,
    DisplayID: String,
    DisplayIDAvailable: Boolean,
    GetIconAsPNG: (Double, Double) => js.Array[Double],
    HasOwner: Boolean,
    HasParent: Boolean,
    ID: Double,
    Icon: js.Array[Double],
    ItemGUID: String,
    Name: String,
    OwnerID: Double,
    ParentID: Double,
    ValueListID: MFBuiltInValueList | Double
  ): IValueListItem = {
    val __obj = js.Dynamic.literal(AutomaticPermissionsForObjects = AutomaticPermissionsForObjects.asInstanceOf[js.Any], Clone = Clone.toJsFn, CloneFrom = js.Any.fromFunction1((t0: IValueListItem) => CloneFrom(t0).runNow()), Deleted = Deleted.asInstanceOf[js.Any], DisplayID = DisplayID.asInstanceOf[js.Any], DisplayIDAvailable = DisplayIDAvailable.asInstanceOf[js.Any], GetIconAsPNG = js.Any.fromFunction2(GetIconAsPNG), HasOwner = HasOwner.asInstanceOf[js.Any], HasParent = HasParent.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Icon = Icon.asInstanceOf[js.Any], ItemGUID = ItemGUID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OwnerID = OwnerID.asInstanceOf[js.Any], ParentID = ParentID.asInstanceOf[js.Any], ValueListID = ValueListID.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValueListItem]
  }
  
  extension [Self <: IValueListItem](x: Self) {
    
    inline def setAutomaticPermissionsForObjects(value: IAutomaticPermissions): Self = StObject.set(x, "AutomaticPermissionsForObjects", value.asInstanceOf[js.Any])
    
    inline def setClone(value: CallbackTo[IValueListItem]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCloneFrom(value: IValueListItem => Callback): Self = StObject.set(x, "CloneFrom", js.Any.fromFunction1((t0: IValueListItem) => value(t0).runNow()))
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "Deleted", value.asInstanceOf[js.Any])
    
    inline def setDisplayID(value: String): Self = StObject.set(x, "DisplayID", value.asInstanceOf[js.Any])
    
    inline def setDisplayIDAvailable(value: Boolean): Self = StObject.set(x, "DisplayIDAvailable", value.asInstanceOf[js.Any])
    
    inline def setGetIconAsPNG(value: (Double, Double) => js.Array[Double]): Self = StObject.set(x, "GetIconAsPNG", js.Any.fromFunction2(value))
    
    inline def setHasOwner(value: Boolean): Self = StObject.set(x, "HasOwner", value.asInstanceOf[js.Any])
    
    inline def setHasParent(value: Boolean): Self = StObject.set(x, "HasParent", value.asInstanceOf[js.Any])
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: js.Array[Double]): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
    
    inline def setIconVarargs(value: Double*): Self = StObject.set(x, "Icon", js.Array(value*))
    
    inline def setItemGUID(value: String): Self = StObject.set(x, "ItemGUID", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOwnerID(value: Double): Self = StObject.set(x, "OwnerID", value.asInstanceOf[js.Any])
    
    inline def setParentID(value: Double): Self = StObject.set(x, "ParentID", value.asInstanceOf[js.Any])
    
    inline def setValueListID(value: MFBuiltInValueList | Double): Self = StObject.set(x, "ValueListID", value.asInstanceOf[js.Any])
  }
}
