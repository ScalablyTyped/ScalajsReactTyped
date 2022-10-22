package typingsJapgolly.typedoc

import typingsJapgolly.typescript.mod.LineAndCharacter
import typingsJapgolly.typescript.mod.SourceFileLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibUtilsMinimalSourceFileMod {
  
  @JSImport("typedoc/dist/lib/utils/minimalSourceFile", "MinimalSourceFile")
  @js.native
  open class MinimalSourceFile protected ()
    extends StObject
       with SourceFileLike {
    def this(text: String, fileName: String) = this()
    
    val fileName: String = js.native
    
    /* CompleteClass */
    override def getLineAndCharacterOfPosition(pos: Double): LineAndCharacter = js.native
    
    /* CompleteClass */
    override val text: String = js.native
  }
}
