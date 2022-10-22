package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.NamedValue
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is intended to provide result of creation of an embedded object by dialog. */
trait InsertedObjectInfo extends StObject {
  
  /** The new created embedded object. */
  var Object: XEmbeddedObject
  
  /**
    * Container related options selected by user.
    *
    * A dialog related to embedded object creation usually allows user to make some choices that can be container related. This information can be provided
    * by this member.
    */
  var Options: SafeArray[NamedValue]
}
object InsertedObjectInfo {
  
  inline def apply(Object: XEmbeddedObject, Options: SafeArray[NamedValue]): InsertedObjectInfo = {
    val __obj = js.Dynamic.literal(Object = Object.asInstanceOf[js.Any], Options = Options.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertedObjectInfo]
  }
  
  extension [Self <: InsertedObjectInfo](x: Self) {
    
    inline def setObject(value: XEmbeddedObject): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: SafeArray[NamedValue]): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
  }
}
