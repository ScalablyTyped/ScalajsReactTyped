package typingsJapgolly.scrivito.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Workspace extends StObject {
  
  def id(): String
  
  def title(): String
}
object Workspace {
  
  inline def apply(id: CallbackTo[String], title: CallbackTo[String]): Workspace = {
    val __obj = js.Dynamic.literal(id = id.toJsFn, title = title.toJsFn)
    __obj.asInstanceOf[Workspace]
  }
  
  extension [Self <: Workspace](x: Self) {
    
    inline def setId(value: CallbackTo[String]): Self = StObject.set(x, "id", value.toJsFn)
    
    inline def setTitle(value: CallbackTo[String]): Self = StObject.set(x, "title", value.toJsFn)
  }
}
