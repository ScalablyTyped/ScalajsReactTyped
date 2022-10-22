package typingsJapgolly.levelJs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.abstractLeveldown.mod.AbstractLevelDOWN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("level-js", JSImport.Namespace)
  @js.native
  val ^ : js.Object & LevelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("level-js", JSImport.Namespace)
  @js.native
  open class Class protected ()
    extends StObject
       with Level {
    def this(location: String) = this()
    def this(location: String, options: LevelOptions) = this()
  }
  
  @js.native
  trait Level
    extends StObject
       with AbstractLevelDOWN[Any, Any] {
    
    def destroy(location: String, cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    def destroy(location: String, prefix: String, cb: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    val location: String = js.native
    
    val prefix: String = js.native
    
    val version: String | Double = js.native
  }
  
  @js.native
  trait LevelConstructor
    extends StObject
       with Instantiable1[/* location */ String, Level]
       with Instantiable2[/* location */ String, /* options */ LevelOptions, Level] {
    
    def apply(location: String): Level = js.native
    def apply(location: String, options: LevelOptions): Level = js.native
  }
  
  trait LevelOptions extends StObject {
    
    val prefix: js.UndefOr[String] = js.undefined
    
    val version: js.UndefOr[String | Double] = js.undefined
  }
  object LevelOptions {
    
    inline def apply(): LevelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LevelOptions]
    }
    
    extension [Self <: LevelOptions](x: Self) {
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setVersion(value: String | Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  type _To = js.Object & LevelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & LevelConstructor = ^
}
