package typingsJapgolly.fridaGum.Java

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DexFile extends StObject {
  
  /**
    * Determines available class names.
    */
  def getClassNames(): js.Array[String]
  
  /**
    * Loads the contained classes into the VM.
    */
  def load(): Unit
}
object DexFile {
  
  inline def apply(getClassNames: CallbackTo[js.Array[String]], load: Callback): DexFile = {
    val __obj = js.Dynamic.literal(getClassNames = getClassNames.toJsFn, load = load.toJsFn)
    __obj.asInstanceOf[DexFile]
  }
  
  extension [Self <: DexFile](x: Self) {
    
    inline def setGetClassNames(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getClassNames", value.toJsFn)
    
    inline def setLoad(value: Callback): Self = StObject.set(x, "load", value.toJsFn)
  }
}
