package typingsJapgolly.swiftclick

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwiftClickObject extends StObject {
  
  def addNodeNamesToTrack(nodeNamesArray: js.Array[String]): Unit
  
  def replaceNodeNamesToTrack(nodeNamesArray: js.Array[String]): Unit
  
  def useCssParser(useParser: Boolean): Unit
}
object SwiftClickObject {
  
  inline def apply(
    addNodeNamesToTrack: js.Array[String] => Callback,
    replaceNodeNamesToTrack: js.Array[String] => Callback,
    useCssParser: Boolean => Callback
  ): SwiftClickObject = {
    val __obj = js.Dynamic.literal(addNodeNamesToTrack = js.Any.fromFunction1((t0: js.Array[String]) => addNodeNamesToTrack(t0).runNow()), replaceNodeNamesToTrack = js.Any.fromFunction1((t0: js.Array[String]) => replaceNodeNamesToTrack(t0).runNow()), useCssParser = js.Any.fromFunction1((t0: Boolean) => useCssParser(t0).runNow()))
    __obj.asInstanceOf[SwiftClickObject]
  }
  
  extension [Self <: SwiftClickObject](x: Self) {
    
    inline def setAddNodeNamesToTrack(value: js.Array[String] => Callback): Self = StObject.set(x, "addNodeNamesToTrack", js.Any.fromFunction1((t0: js.Array[String]) => value(t0).runNow()))
    
    inline def setReplaceNodeNamesToTrack(value: js.Array[String] => Callback): Self = StObject.set(x, "replaceNodeNamesToTrack", js.Any.fromFunction1((t0: js.Array[String]) => value(t0).runNow()))
    
    inline def setUseCssParser(value: Boolean => Callback): Self = StObject.set(x, "useCssParser", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
