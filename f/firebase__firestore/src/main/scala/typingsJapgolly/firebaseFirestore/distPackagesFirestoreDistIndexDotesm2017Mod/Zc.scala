package typingsJapgolly.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `Query` refers to a query which you can read or listen to. You can also
  * construct refined `Query` objects by adding filters and ordering.
  */ trait Zc extends StObject {
  
  var _query: Any
  
  var converter: Any
  
  var firestore: Any
  
  /** The type of this Firestore reference. */
  var `type`: String
  
  def withConverter(t: Any): Zc
}
object Zc {
  
  inline def apply(_query: Any, converter: Any, firestore: Any, `type`: String, withConverter: Any => Zc): Zc = {
    val __obj = js.Dynamic.literal(_query = _query.asInstanceOf[js.Any], converter = converter.asInstanceOf[js.Any], firestore = firestore.asInstanceOf[js.Any], withConverter = js.Any.fromFunction1(withConverter))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Zc]
  }
  
  extension [Self <: Zc](x: Self) {
    
    inline def setConverter(value: Any): Self = StObject.set(x, "converter", value.asInstanceOf[js.Any])
    
    inline def setFirestore(value: Any): Self = StObject.set(x, "firestore", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWithConverter(value: Any => Zc): Self = StObject.set(x, "withConverter", js.Any.fromFunction1(value))
    
    inline def set_query(value: Any): Self = StObject.set(x, "_query", value.asInstanceOf[js.Any])
  }
}
