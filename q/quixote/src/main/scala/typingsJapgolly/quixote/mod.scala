package typingsJapgolly.quixote

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("quixote", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with typingsJapgolly.quixote.mod.Quixote {
    
    /* CompleteClass */
    override def createFrame(
      options: QuixoteFrameOptions,
      callback: js.Function2[/* err */ js.Error, /* loadedFrame */ QFrame, Unit]
    ): QFrame = js.native
  }
  
  trait Quixote extends StObject {
    
    def createFrame(
      options: QuixoteFrameOptions,
      callback: js.Function2[/* err */ js.Error, /* loadedFrame */ QFrame, Unit]
    ): QFrame
  }
  object Quixote {
    
    inline def apply(
      createFrame: (QuixoteFrameOptions, js.Function2[/* err */ js.Error, /* loadedFrame */ QFrame, Unit]) => QFrame
    ): typingsJapgolly.quixote.mod.Quixote = {
      val __obj = js.Dynamic.literal(createFrame = js.Any.fromFunction2(createFrame))
      __obj.asInstanceOf[typingsJapgolly.quixote.mod.Quixote]
    }
    
    extension [Self <: typingsJapgolly.quixote.mod.Quixote](x: Self) {
      
      inline def setCreateFrame(
        value: (QuixoteFrameOptions, js.Function2[/* err */ js.Error, /* loadedFrame */ QFrame, Unit]) => QFrame
      ): Self = StObject.set(x, "createFrame", js.Any.fromFunction2(value))
    }
  }
}
