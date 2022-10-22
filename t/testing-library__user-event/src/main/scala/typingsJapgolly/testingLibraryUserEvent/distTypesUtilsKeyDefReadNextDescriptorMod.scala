package typingsJapgolly.testingLibraryUserEvent

import typingsJapgolly.testingLibraryUserEvent.anon.ConsumedLength
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsKeyDefReadNextDescriptorMod {
  
  @JSImport("@testing-library/user-event/dist/types/utils/keyDef/readNextDescriptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readNextDescriptor(text: String, context: Context): ConsumedLength = (^.asInstanceOf[js.Dynamic].applyDynamic("readNextDescriptor")(text.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[ConsumedLength]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.pointer
    - typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.keyboard
  */
  trait Context extends StObject
  object Context {
    
    inline def keyboard: typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.keyboard = "keyboard".asInstanceOf[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.keyboard]
    
    inline def pointer: typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.pointer = "pointer".asInstanceOf[typingsJapgolly.testingLibraryUserEvent.testingLibraryUserEventStrings.pointer]
  }
}
