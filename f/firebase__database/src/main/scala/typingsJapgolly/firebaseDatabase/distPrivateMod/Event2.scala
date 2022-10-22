package typingsJapgolly.firebaseDatabase.distPrivateMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Encapsulates the data needed to raise an event
  * @interface
  */
trait Event2 extends StObject {
  
  def getEventRunner(): js.Function0[Unit]
  
  def getEventType(): String
  
  def getPath(): Path
}
object Event2 {
  
  inline def apply(
    getEventRunner: CallbackTo[js.Function0[Unit]],
    getEventType: CallbackTo[String],
    getPath: CallbackTo[Path]
  ): Event2 = {
    val __obj = js.Dynamic.literal(getEventRunner = getEventRunner.toJsFn, getEventType = getEventType.toJsFn, getPath = getPath.toJsFn)
    __obj.asInstanceOf[Event2]
  }
  
  extension [Self <: Event2](x: Self) {
    
    inline def setGetEventRunner(value: CallbackTo[js.Function0[Unit]]): Self = StObject.set(x, "getEventRunner", value.toJsFn)
    
    inline def setGetEventType(value: CallbackTo[String]): Self = StObject.set(x, "getEventType", value.toJsFn)
    
    inline def setGetPath(value: CallbackTo[Path]): Self = StObject.set(x, "getPath", value.toJsFn)
  }
}
