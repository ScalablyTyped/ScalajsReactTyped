package typingsJapgolly.nginstackEngine

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomCharacterDataMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/dom/CharacterData", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with CharacterData {
    
    /* CompleteClass */
    override def appendData(data: String): Unit = js.native
    
    /* CompleteClass */
    var data: String = js.native
    
    /* CompleteClass */
    override def deleteData(offset: Double, count: Double): Unit = js.native
    
    /* CompleteClass */
    override def insertData(offset: Double, data: String): Unit = js.native
    
    /* CompleteClass */
    override val length: Double = js.native
    
    /* CompleteClass */
    override def replaceData(offset: Double, count: Double, data: String): Unit = js.native
    
    /* CompleteClass */
    override def substringData(offset: Double, count: Double): String = js.native
  }
  @JSImport("@nginstack/engine/lib/dom/CharacterData", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CharacterData extends StObject {
    
    def appendData(data: String): Unit
    
    var data: String
    
    def deleteData(offset: Double, count: Double): Unit
    
    def insertData(offset: Double, data: String): Unit
    
    val length: Double
    
    def replaceData(offset: Double, count: Double, data: String): Unit
    
    def substringData(offset: Double, count: Double): String
  }
  object CharacterData {
    
    inline def apply(
      appendData: String => Callback,
      data: String,
      deleteData: (Double, Double) => Callback,
      insertData: (Double, String) => Callback,
      length: Double,
      replaceData: (Double, Double, String) => Callback,
      substringData: (Double, Double) => String
    ): CharacterData = {
      val __obj = js.Dynamic.literal(appendData = js.Any.fromFunction1((t0: String) => appendData(t0).runNow()), data = data.asInstanceOf[js.Any], deleteData = js.Any.fromFunction2((t0: Double, t1: Double) => (deleteData(t0, t1)).runNow()), insertData = js.Any.fromFunction2((t0: Double, t1: String) => (insertData(t0, t1)).runNow()), length = length.asInstanceOf[js.Any], replaceData = js.Any.fromFunction3((t0: Double, t1: Double, t2: String) => (replaceData(t0, t1, t2)).runNow()), substringData = js.Any.fromFunction2(substringData))
      __obj.asInstanceOf[CharacterData]
    }
    
    extension [Self <: CharacterData](x: Self) {
      
      inline def setAppendData(value: String => Callback): Self = StObject.set(x, "appendData", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDeleteData(value: (Double, Double) => Callback): Self = StObject.set(x, "deleteData", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setInsertData(value: (Double, String) => Callback): Self = StObject.set(x, "insertData", js.Any.fromFunction2((t0: Double, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setReplaceData(value: (Double, Double, String) => Callback): Self = StObject.set(x, "replaceData", js.Any.fromFunction3((t0: Double, t1: Double, t2: String) => (value(t0, t1, t2)).runNow()))
      
      inline def setSubstringData(value: (Double, Double) => String): Self = StObject.set(x, "substringData", js.Any.fromFunction2(value))
    }
  }
}
