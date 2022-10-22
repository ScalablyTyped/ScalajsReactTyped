package typingsJapgolly.senchaTouch.Ext.data

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.senchaTouch.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAssociation
  extends StObject
     with IBase {
  
  /** [Config Option] (String) */
  var associatedModel: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var associatedName: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var associationKey: js.UndefOr[String] = js.undefined
  
  /** [Method] Returns the value of associatedModel
    * @returns String
    */
  var getAssociatedModel: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of associatedName
    * @returns String
    */
  var getAssociatedName: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of associationKey
    * @returns String
    */
  var getAssociationKey: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of name
    * @returns Object
    */
  var getName: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of ownerModel
    * @returns Ext.data.Model/String
    */
  var getOwnerModel: js.UndefOr[js.Function0[Any]] = js.undefined
  
  /** [Method] Returns the value of ownerName
    * @returns String
    */
  var getOwnerName: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of primaryKey
    * @returns String
    */
  var getPrimaryKey: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Method] Returns the value of reader
    * @returns Ext.data.reader.Reader
    */
  var getReader: js.UndefOr[js.Function0[typingsJapgolly.senchaTouch.Ext.data.reader.IReader]] = js.undefined
  
  /** [Method] Returns the value of type
    * @returns String
    */
  var getType: js.UndefOr[js.Function0[String]] = js.undefined
  
  /** [Config Option] (Ext.data.Model/String) */
  var ownerModel: js.UndefOr[Any] = js.undefined
  
  /** [Config Option] (String) */
  var primaryKey: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Ext.data.reader.Reader) */
  var reader: js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.reader.IReader] = js.undefined
  
  /** [Method] Sets the value of associatedModel
    * @param associatedModel String The new value.
    */
  var setAssociatedModel: js.UndefOr[js.Function1[/* associatedModel */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of associatedName
    * @param associatedName String The new value.
    */
  var setAssociatedName: js.UndefOr[js.Function1[/* associatedName */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of associationKey
    * @param associationKey String The new value.
    */
  var setAssociationKey: js.UndefOr[js.Function1[/* associationKey */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of name
    * @param name Object The new value.
    */
  var setName: js.UndefOr[js.Function1[/* name */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of ownerModel
    * @param ownerModel Ext.data.Model/String The new value.
    */
  var setOwnerModel: js.UndefOr[js.Function1[/* ownerModel */ js.UndefOr[Any], Unit]] = js.undefined
  
  /** [Method] Sets the value of ownerName
    * @param ownerName String The new value.
    */
  var setOwnerName: js.UndefOr[js.Function1[/* ownerName */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of primaryKey
    * @param primaryKey String The new value.
    */
  var setPrimaryKey: js.UndefOr[js.Function1[/* primaryKey */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Method] Sets the value of reader
    * @param reader Ext.data.reader.Reader The new value.
    */
  var setReader: js.UndefOr[
    js.Function1[/* reader */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.reader.IReader], Unit]
  ] = js.undefined
  
  /** [Method] Sets the value of type
    * @param type String The new value.
    */
  var setType: js.UndefOr[js.Function1[/* type */ js.UndefOr[String], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var `type`: js.UndefOr[String] = js.undefined
}
object IAssociation {
  
  inline def apply(): IAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAssociation]
  }
  
  extension [Self <: IAssociation](x: Self) {
    
    inline def setAssociatedModel(value: String): Self = StObject.set(x, "associatedModel", value.asInstanceOf[js.Any])
    
    inline def setAssociatedModelUndefined: Self = StObject.set(x, "associatedModel", js.undefined)
    
    inline def setAssociatedName(value: String): Self = StObject.set(x, "associatedName", value.asInstanceOf[js.Any])
    
    inline def setAssociatedNameUndefined: Self = StObject.set(x, "associatedName", js.undefined)
    
    inline def setAssociationKey(value: String): Self = StObject.set(x, "associationKey", value.asInstanceOf[js.Any])
    
    inline def setAssociationKeyUndefined: Self = StObject.set(x, "associationKey", js.undefined)
    
    inline def setGetAssociatedModel(value: CallbackTo[String]): Self = StObject.set(x, "getAssociatedModel", value.toJsFn)
    
    inline def setGetAssociatedModelUndefined: Self = StObject.set(x, "getAssociatedModel", js.undefined)
    
    inline def setGetAssociatedName(value: CallbackTo[String]): Self = StObject.set(x, "getAssociatedName", value.toJsFn)
    
    inline def setGetAssociatedNameUndefined: Self = StObject.set(x, "getAssociatedName", js.undefined)
    
    inline def setGetAssociationKey(value: CallbackTo[String]): Self = StObject.set(x, "getAssociationKey", value.toJsFn)
    
    inline def setGetAssociationKeyUndefined: Self = StObject.set(x, "getAssociationKey", js.undefined)
    
    inline def setGetName(value: CallbackTo[Any]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetNameUndefined: Self = StObject.set(x, "getName", js.undefined)
    
    inline def setGetOwnerModel(value: CallbackTo[Any]): Self = StObject.set(x, "getOwnerModel", value.toJsFn)
    
    inline def setGetOwnerModelUndefined: Self = StObject.set(x, "getOwnerModel", js.undefined)
    
    inline def setGetOwnerName(value: CallbackTo[String]): Self = StObject.set(x, "getOwnerName", value.toJsFn)
    
    inline def setGetOwnerNameUndefined: Self = StObject.set(x, "getOwnerName", js.undefined)
    
    inline def setGetPrimaryKey(value: CallbackTo[String]): Self = StObject.set(x, "getPrimaryKey", value.toJsFn)
    
    inline def setGetPrimaryKeyUndefined: Self = StObject.set(x, "getPrimaryKey", js.undefined)
    
    inline def setGetReader(value: CallbackTo[typingsJapgolly.senchaTouch.Ext.data.reader.IReader]): Self = StObject.set(x, "getReader", value.toJsFn)
    
    inline def setGetReaderUndefined: Self = StObject.set(x, "getReader", js.undefined)
    
    inline def setGetType(value: CallbackTo[String]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setGetTypeUndefined: Self = StObject.set(x, "getType", js.undefined)
    
    inline def setOwnerModel(value: Any): Self = StObject.set(x, "ownerModel", value.asInstanceOf[js.Any])
    
    inline def setOwnerModelUndefined: Self = StObject.set(x, "ownerModel", js.undefined)
    
    inline def setPrimaryKey(value: String): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
    
    inline def setReader(value: typingsJapgolly.senchaTouch.Ext.data.reader.IReader): Self = StObject.set(x, "reader", value.asInstanceOf[js.Any])
    
    inline def setReaderUndefined: Self = StObject.set(x, "reader", js.undefined)
    
    inline def setSetAssociatedModel(value: /* associatedModel */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setAssociatedModel", js.Any.fromFunction1((t0: /* associatedModel */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetAssociatedModelUndefined: Self = StObject.set(x, "setAssociatedModel", js.undefined)
    
    inline def setSetAssociatedName(value: /* associatedName */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setAssociatedName", js.Any.fromFunction1((t0: /* associatedName */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetAssociatedNameUndefined: Self = StObject.set(x, "setAssociatedName", js.undefined)
    
    inline def setSetAssociationKey(value: /* associationKey */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setAssociationKey", js.Any.fromFunction1((t0: /* associationKey */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetAssociationKeyUndefined: Self = StObject.set(x, "setAssociationKey", js.undefined)
    
    inline def setSetName(value: /* name */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setName", js.Any.fromFunction1((t0: /* name */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetNameUndefined: Self = StObject.set(x, "setName", js.undefined)
    
    inline def setSetOwnerModel(value: /* ownerModel */ js.UndefOr[Any] => Callback): Self = StObject.set(x, "setOwnerModel", js.Any.fromFunction1((t0: /* ownerModel */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setSetOwnerModelUndefined: Self = StObject.set(x, "setOwnerModel", js.undefined)
    
    inline def setSetOwnerName(value: /* ownerName */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setOwnerName", js.Any.fromFunction1((t0: /* ownerName */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetOwnerNameUndefined: Self = StObject.set(x, "setOwnerName", js.undefined)
    
    inline def setSetPrimaryKey(value: /* primaryKey */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setPrimaryKey", js.Any.fromFunction1((t0: /* primaryKey */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetPrimaryKeyUndefined: Self = StObject.set(x, "setPrimaryKey", js.undefined)
    
    inline def setSetReader(value: /* reader */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.reader.IReader] => Callback): Self = StObject.set(x, "setReader", js.Any.fromFunction1((t0: /* reader */ js.UndefOr[typingsJapgolly.senchaTouch.Ext.data.reader.IReader]) => value(t0).runNow()))
    
    inline def setSetReaderUndefined: Self = StObject.set(x, "setReader", js.undefined)
    
    inline def setSetType(value: /* type */ js.UndefOr[String] => Callback): Self = StObject.set(x, "setType", js.Any.fromFunction1((t0: /* type */ js.UndefOr[String]) => value(t0).runNow()))
    
    inline def setSetTypeUndefined: Self = StObject.set(x, "setType", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
