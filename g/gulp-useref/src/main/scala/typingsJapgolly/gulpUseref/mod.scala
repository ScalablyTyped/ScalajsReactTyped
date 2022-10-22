package typingsJapgolly.gulpUseref

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-useref", JSImport.Namespace)
  @js.native
  val ^ : Useref = js.native
  
  trait Options extends StObject {
    
    var additionalStreams: js.UndefOr[js.Array[ReadWriteStream]] = js.undefined
    
    var base: js.UndefOr[String] = js.undefined
    
    var noAssets: js.UndefOr[Boolean] = js.undefined
    
    var noconcat: js.UndefOr[Boolean] = js.undefined
    
    var searchPath: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var transformPath: js.UndefOr[js.Function1[/* filePath */ String, Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAdditionalStreams(value: js.Array[ReadWriteStream]): Self = StObject.set(x, "additionalStreams", value.asInstanceOf[js.Any])
      
      inline def setAdditionalStreamsUndefined: Self = StObject.set(x, "additionalStreams", js.undefined)
      
      inline def setAdditionalStreamsVarargs(value: ReadWriteStream*): Self = StObject.set(x, "additionalStreams", js.Array(value*))
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setNoAssets(value: Boolean): Self = StObject.set(x, "noAssets", value.asInstanceOf[js.Any])
      
      inline def setNoAssetsUndefined: Self = StObject.set(x, "noAssets", js.undefined)
      
      inline def setNoconcat(value: Boolean): Self = StObject.set(x, "noconcat", value.asInstanceOf[js.Any])
      
      inline def setNoconcatUndefined: Self = StObject.set(x, "noconcat", js.undefined)
      
      inline def setSearchPath(value: String | js.Array[String]): Self = StObject.set(x, "searchPath", value.asInstanceOf[js.Any])
      
      inline def setSearchPathUndefined: Self = StObject.set(x, "searchPath", js.undefined)
      
      inline def setSearchPathVarargs(value: String*): Self = StObject.set(x, "searchPath", js.Array(value*))
      
      inline def setTransformPath(value: /* filePath */ String => Callback): Self = StObject.set(x, "transformPath", js.Any.fromFunction1((t0: /* filePath */ String) => value(t0).runNow()))
      
      inline def setTransformPathUndefined: Self = StObject.set(x, "transformPath", js.undefined)
    }
  }
  
  type Useref = js.Function2[/* options */ js.UndefOr[Options], /* repeated */ ReadWriteStream, ReadWriteStream]
  
  type _To = Useref
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Useref = ^
}
