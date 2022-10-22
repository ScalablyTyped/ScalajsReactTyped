package typingsJapgolly.glob.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsDirectory extends StObject {
  
  def isDirectory(): Boolean
}
object IsDirectory {
  
  inline def apply(isDirectory: CallbackTo[Boolean]): IsDirectory = {
    val __obj = js.Dynamic.literal(isDirectory = isDirectory.toJsFn)
    __obj.asInstanceOf[IsDirectory]
  }
  
  extension [Self <: IsDirectory](x: Self) {
    
    inline def setIsDirectory(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDirectory", value.toJsFn)
  }
}
