package typingsJapgolly.phantom.anon

import typingsJapgolly.phantom.mod.IPhantomCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contents extends StObject {
  
  var contents: IPhantomCallback
  
  var height: String
}
object Contents {
  
  inline def apply(contents: IPhantomCallback, height: String): Contents = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contents]
  }
  
  extension [Self <: Contents](x: Self) {
    
    inline def setContents(value: IPhantomCallback): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
  }
}
