package typingsJapgolly.meteor.anon

import typingsJapgolly.meteor.Mongo.CurrentDateModifier
import typingsJapgolly.meteor.meteorStrings.date
import typingsJapgolly.meteor.meteorStrings.timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type
  extends StObject
     with CurrentDateModifier
     with typingsJapgolly.meteor.mongoMod.Mongo.CurrentDateModifier {
  
  @JSName("$type")
  var $type: timestamp | date
}
object Type {
  
  inline def apply($type: timestamp | date): Type = {
    val __obj = js.Dynamic.literal($type = $type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def set$type(value: timestamp | date): Self = StObject.set(x, "$type", value.asInstanceOf[js.Any])
  }
}
