package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFBuiltInObjectType
import typingsJapgolly.mfiles.MFiles.MFSpecialObjectFlag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILookup extends StObject {
  
  def Clone(): ILookup
  
  def CloneFrom(Lookup: ILookup): Unit
  
  var Deleted: Boolean
  
  val DisplayID: String
  
  val DisplayIDAvailable: Boolean
  
  var DisplayValue: String
  
  def GetFormattedDisplayValue(Localized: Boolean, EmptyLookupDispValuesAsHidden: Boolean, AddDeletedSuffixIfDeleted: Boolean): String
  
  val Hidden: Boolean
  
  var Item: Double
  
  var ItemGUID: String
  
  val ObjectFlags: MFSpecialObjectFlag
  
  var ObjectType: MFBuiltInObjectType | Double
  
  var Version: Double
}
object ILookup {
  
  inline def apply(
    Clone: CallbackTo[ILookup],
    CloneFrom: ILookup => Callback,
    Deleted: Boolean,
    DisplayID: String,
    DisplayIDAvailable: Boolean,
    DisplayValue: String,
    GetFormattedDisplayValue: (Boolean, Boolean, Boolean) => String,
    Hidden: Boolean,
    Item: Double,
    ItemGUID: String,
    ObjectFlags: MFSpecialObjectFlag,
    ObjectType: MFBuiltInObjectType | Double,
    Version: Double
  ): ILookup = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, CloneFrom = js.Any.fromFunction1((t0: ILookup) => CloneFrom(t0).runNow()), Deleted = Deleted.asInstanceOf[js.Any], DisplayID = DisplayID.asInstanceOf[js.Any], DisplayIDAvailable = DisplayIDAvailable.asInstanceOf[js.Any], DisplayValue = DisplayValue.asInstanceOf[js.Any], GetFormattedDisplayValue = js.Any.fromFunction3(GetFormattedDisplayValue), Hidden = Hidden.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], ItemGUID = ItemGUID.asInstanceOf[js.Any], ObjectFlags = ObjectFlags.asInstanceOf[js.Any], ObjectType = ObjectType.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILookup]
  }
  
  extension [Self <: ILookup](x: Self) {
    
    inline def setClone(value: CallbackTo[ILookup]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setCloneFrom(value: ILookup => Callback): Self = StObject.set(x, "CloneFrom", js.Any.fromFunction1((t0: ILookup) => value(t0).runNow()))
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "Deleted", value.asInstanceOf[js.Any])
    
    inline def setDisplayID(value: String): Self = StObject.set(x, "DisplayID", value.asInstanceOf[js.Any])
    
    inline def setDisplayIDAvailable(value: Boolean): Self = StObject.set(x, "DisplayIDAvailable", value.asInstanceOf[js.Any])
    
    inline def setDisplayValue(value: String): Self = StObject.set(x, "DisplayValue", value.asInstanceOf[js.Any])
    
    inline def setGetFormattedDisplayValue(value: (Boolean, Boolean, Boolean) => String): Self = StObject.set(x, "GetFormattedDisplayValue", js.Any.fromFunction3(value))
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "Hidden", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setItemGUID(value: String): Self = StObject.set(x, "ItemGUID", value.asInstanceOf[js.Any])
    
    inline def setObjectFlags(value: MFSpecialObjectFlag): Self = StObject.set(x, "ObjectFlags", value.asInstanceOf[js.Any])
    
    inline def setObjectType(value: MFBuiltInObjectType | Double): Self = StObject.set(x, "ObjectType", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
