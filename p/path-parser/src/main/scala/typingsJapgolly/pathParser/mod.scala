package typingsJapgolly.pathParser

import typingsJapgolly.pathParser.distPathMod.PathOptions
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("path-parser", JSImport.Default)
  @js.native
  open class default[T /* <: Record[String, Any] */] protected ()
    extends typingsJapgolly.pathParser.distPathMod.default[T] {
    def this(path: String) = this()
    def this(path: String, options: PathOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("path-parser", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def createPath[T /* <: Record[String, Any] */](path: String): typingsJapgolly.pathParser.distPathMod.Path[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPath")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.pathParser.distPathMod.Path[T]]
    inline def createPath[T /* <: Record[String, Any] */](path: String, options: PathOptions): typingsJapgolly.pathParser.distPathMod.Path[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pathParser.distPathMod.Path[T]]
  }
  
  @JSImport("path-parser", "Path")
  @js.native
  open class Path[T /* <: Record[String, Any] */] protected ()
    extends typingsJapgolly.pathParser.distPathMod.Path[T] {
    def this(path: String) = this()
    def this(path: String, options: PathOptions) = this()
  }
  /* static members */
  object Path {
    
    @JSImport("path-parser", "Path")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createPath[T /* <: Record[String, Any] */](path: String): typingsJapgolly.pathParser.distPathMod.Path[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPath")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.pathParser.distPathMod.Path[T]]
    inline def createPath[T /* <: Record[String, Any] */](path: String, options: PathOptions): typingsJapgolly.pathParser.distPathMod.Path[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.pathParser.distPathMod.Path[T]]
  }
}
