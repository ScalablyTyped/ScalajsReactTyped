package typingsJapgolly.mongodb.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictindex
  extends StObject
     with /* index */ StringDictionary[Double] {
  
  var _id_ : Double
}
object Dictindex {
  
  inline def apply(_id_ : Double): Dictindex = {
    val __obj = js.Dynamic.literal(_id_ = _id_.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictindex]
  }
  
  extension [Self <: Dictindex](x: Self) {
    
    inline def set_id_(value: Double): Self = StObject.set(x, "_id_", value.asInstanceOf[js.Any])
  }
}
