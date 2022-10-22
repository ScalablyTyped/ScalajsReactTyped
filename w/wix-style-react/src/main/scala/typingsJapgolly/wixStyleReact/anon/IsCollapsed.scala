package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsCollapsed extends StObject {
  
  def isCollapsed(): Boolean
  
  def isExpandable(): Boolean
}
object IsCollapsed {
  
  inline def apply(isCollapsed: CallbackTo[Boolean], isExpandable: CallbackTo[Boolean]): IsCollapsed = {
    val __obj = js.Dynamic.literal(isCollapsed = isCollapsed.toJsFn, isExpandable = isExpandable.toJsFn)
    __obj.asInstanceOf[IsCollapsed]
  }
  
  extension [Self <: IsCollapsed](x: Self) {
    
    inline def setIsCollapsed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isCollapsed", value.toJsFn)
    
    inline def setIsExpandable(value: CallbackTo[Boolean]): Self = StObject.set(x, "isExpandable", value.toJsFn)
  }
}
