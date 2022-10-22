package typingsJapgolly.logkitty

import typingsJapgolly.logkitty.logkittyStrings.DEBUG
import typingsJapgolly.logkitty.logkittyStrings.DEFAULT
import typingsJapgolly.logkitty.logkittyStrings.ERROR
import typingsJapgolly.logkitty.logkittyStrings.INFO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildIosConstantsMod {
  
  object Priority {
    
    @JSImport("logkitty/build/ios/constants", "Priority")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("logkitty/build/ios/constants", "Priority.DEBUG")
    @js.native
    def DEBUG: Double = js.native
    inline def DEBUG_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
    
    @JSImport("logkitty/build/ios/constants", "Priority.DEFAULT")
    @js.native
    def DEFAULT: Double = js.native
    inline def DEFAULT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT")(x.asInstanceOf[js.Any])
    
    @JSImport("logkitty/build/ios/constants", "Priority.ERROR")
    @js.native
    def ERROR: Double = js.native
    inline def ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("logkitty/build/ios/constants", "Priority.INFO")
    @js.native
    def INFO: Double = js.native
    inline def INFO_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INFO")(x.asInstanceOf[js.Any])
    
    inline def fromLetter(letter: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fromLetter")(letter.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def fromName(name: DEBUG | INFO | ERROR | DEFAULT): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("fromName")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def toLetter(code: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toLetter")(code.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def toName(code: Double): DEBUG | INFO | ERROR | DEFAULT = ^.asInstanceOf[js.Dynamic].applyDynamic("toName")(code.asInstanceOf[js.Any]).asInstanceOf[DEBUG | INFO | ERROR | DEFAULT]
  }
  
  /* keyof logkitty.anon.DEFAULT */ /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.logkitty.logkittyStrings.DEBUG
    - typingsJapgolly.logkitty.logkittyStrings.DEFAULT
    - typingsJapgolly.logkitty.logkittyStrings.INFO
    - typingsJapgolly.logkitty.logkittyStrings.ERROR
  */
  trait PriorityNames extends StObject
}
