package typingsJapgolly.etag

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(entity: String): String = ^.asInstanceOf[js.Dynamic].apply(entity.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(entity: String, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(entity.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(entity: StatsLike): String = ^.asInstanceOf[js.Dynamic].apply(entity.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(entity: StatsLike, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(entity.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(entity: Buffer): String = ^.asInstanceOf[js.Dynamic].apply(entity.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(entity: Buffer, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(entity.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("etag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var weak: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setWeak(value: Boolean): Self = StObject.set(x, "weak", value.asInstanceOf[js.Any])
      
      inline def setWeakUndefined: Self = StObject.set(x, "weak", js.undefined)
    }
  }
  
  trait StatsLike extends StObject {
    
    var ctime: js.Date
    
    var ino: Double
    
    var mtime: js.Date
    
    var size: Double
  }
  object StatsLike {
    
    inline def apply(ctime: js.Date, ino: Double, mtime: js.Date, size: Double): StatsLike = {
      val __obj = js.Dynamic.literal(ctime = ctime.asInstanceOf[js.Any], ino = ino.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatsLike]
    }
    
    extension [Self <: StatsLike](x: Self) {
      
      inline def setCtime(value: js.Date): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
      
      inline def setIno(value: Double): Self = StObject.set(x, "ino", value.asInstanceOf[js.Any])
      
      inline def setMtime(value: js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
