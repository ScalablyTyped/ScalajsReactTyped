package typingsJapgolly.dashjs.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaPlayerFactory extends StObject {
  
  def create(): MediaPlayerClass
}
object MediaPlayerFactory {
  
  inline def apply(create: CallbackTo[MediaPlayerClass]): MediaPlayerFactory = {
    val __obj = js.Dynamic.literal(create = create.toJsFn)
    __obj.asInstanceOf[MediaPlayerFactory]
  }
  
  extension [Self <: MediaPlayerFactory](x: Self) {
    
    inline def setCreate(value: CallbackTo[MediaPlayerClass]): Self = StObject.set(x, "create", value.toJsFn)
  }
}
