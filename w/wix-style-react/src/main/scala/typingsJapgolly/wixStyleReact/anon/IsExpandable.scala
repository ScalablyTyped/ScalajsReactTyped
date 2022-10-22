package typingsJapgolly.wixStyleReact.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsExpandable extends StObject {
  
  def isCollapsed(): js.Promise[Boolean]
  
  def isExpandable(): js.Promise[Boolean]
}
object IsExpandable {
  
  inline def apply(isCollapsed: CallbackTo[js.Promise[Boolean]], isExpandable: CallbackTo[js.Promise[Boolean]]): IsExpandable = {
    val __obj = js.Dynamic.literal(isCollapsed = isCollapsed.toJsFn, isExpandable = isExpandable.toJsFn)
    __obj.asInstanceOf[IsExpandable]
  }
  
  extension [Self <: IsExpandable](x: Self) {
    
    inline def setIsCollapsed(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isCollapsed", value.toJsFn)
    
    inline def setIsExpandable(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "isExpandable", value.toJsFn)
  }
}
