package typingsJapgolly.yadda

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFileSearchMod {
  
  @JSImport("yadda/lib/FileSearch", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with FileSearch {
    def this(directories: String) = this()
    def this(directories: String, patterns: js.RegExp) = this()
    
    /* CompleteClass */
    override def each(fn: js.Function1[/* file */ String, Unit]): Unit = js.native
    
    /* CompleteClass */
    override def list(): js.Array[String] = js.native
  }
  
  trait FileSearch extends StObject {
    
    def each(fn: js.Function1[/* file */ String, Unit]): Unit
    
    def list(): js.Array[String]
  }
  object FileSearch {
    
    inline def apply(each: js.Function1[/* file */ String, Unit] => Callback, list: CallbackTo[js.Array[String]]): FileSearch = {
      val __obj = js.Dynamic.literal(each = js.Any.fromFunction1((t0: js.Function1[/* file */ String, Unit]) => each(t0).runNow()), list = list.toJsFn)
      __obj.asInstanceOf[FileSearch]
    }
    
    extension [Self <: FileSearch](x: Self) {
      
      inline def setEach(value: js.Function1[/* file */ String, Unit] => Callback): Self = StObject.set(x, "each", js.Any.fromFunction1((t0: js.Function1[/* file */ String, Unit]) => value(t0).runNow()))
      
      inline def setList(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "list", value.toJsFn)
    }
  }
}
