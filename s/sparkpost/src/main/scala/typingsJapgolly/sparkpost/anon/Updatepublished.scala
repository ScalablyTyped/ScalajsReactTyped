package typingsJapgolly.sparkpost.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Updatepublished extends StObject {
  
  var update_published: js.UndefOr[Boolean] = js.undefined
}
object Updatepublished {
  
  inline def apply(): Updatepublished = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Updatepublished]
  }
  
  extension [Self <: Updatepublished](x: Self) {
    
    inline def setUpdate_published(value: Boolean): Self = StObject.set(x, "update_published", value.asInstanceOf[js.Any])
    
    inline def setUpdate_publishedUndefined: Self = StObject.set(x, "update_published", js.undefined)
  }
}
