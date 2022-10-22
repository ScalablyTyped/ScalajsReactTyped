package typingsJapgolly.convertString

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object convertString {
    
    @JSImport("convert-string", "convertString")
    @js.native
    val ^ : js.Any = js.native
    
    object UTF8 {
      
      @JSImport("convert-string", "convertString.UTF8")
      @js.native
      val ^ : js.Any = js.native
      
      inline def bytesToString(bytes: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesToString")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def stringToBytes(str: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToBytes")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    }
    
    inline def bytesToString(bytes: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytesToString")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def stringToBytes(str: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToBytes")(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  }
}
