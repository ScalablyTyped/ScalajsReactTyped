package typingsJapgolly.web3Bzz

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("web3-bzz", "Bzz")
  @js.native
  open class Bzz () extends StObject {
    def this(provider: Any) = this()
    
    val currentProvider: Any = js.native
    
    def download(bzzHash: String): js.Promise[Any] = js.native
    def download(bzzHash: String, localPath: String): js.Promise[Any] = js.native
    
    val givenProvider: Any = js.native
    
    var pick: Pick = js.native
    
    def setProvider(provider: Any): Boolean = js.native
    
    def upload(data: Any): js.Promise[String] = js.native
  }
  /* static members */
  object Bzz {
    
    @JSImport("web3-bzz", "Bzz.givenProvider")
    @js.native
    val givenProvider: Any = js.native
  }
  
  trait Pick extends StObject {
    
    def data(): js.Promise[Any]
    
    def directory(): js.Promise[Any]
    
    def file(): js.Promise[Any]
  }
  object Pick {
    
    inline def apply(
      data: CallbackTo[js.Promise[Any]],
      directory: CallbackTo[js.Promise[Any]],
      file: CallbackTo[js.Promise[Any]]
    ): Pick = {
      val __obj = js.Dynamic.literal(data = data.toJsFn, directory = directory.toJsFn, file = file.toJsFn)
      __obj.asInstanceOf[Pick]
    }
    
    extension [Self <: Pick](x: Self) {
      
      inline def setData(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "data", value.toJsFn)
      
      inline def setDirectory(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "directory", value.toJsFn)
      
      inline def setFile(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "file", value.toJsFn)
    }
  }
}
