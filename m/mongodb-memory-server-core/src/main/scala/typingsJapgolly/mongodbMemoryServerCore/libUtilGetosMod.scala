package typingsJapgolly.mongodbMemoryServerCore

import typingsJapgolly.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.aix
import typingsJapgolly.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.android
import typingsJapgolly.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.cygwin
import typingsJapgolly.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.darwin
import typingsJapgolly.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.freebsd
import typingsJapgolly.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.linux
import typingsJapgolly.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.openbsd
import typingsJapgolly.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.sunos
import typingsJapgolly.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.win32
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilGetosMod {
  
  @JSImport("mongodb-memory-server-core/lib/util/getos", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getOS(): js.Promise[AnyOS] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOS")().asInstanceOf[js.Promise[AnyOS]]
  
  inline def isLinuxOS(os: AnyOS): /* is mongodb-memory-server-core.mongodb-memory-server-core/lib/util/getos.LinuxOS */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLinuxOS")(os.asInstanceOf[js.Any]).asInstanceOf[/* is mongodb-memory-server-core.mongodb-memory-server-core/lib/util/getos.LinuxOS */ Boolean]
  
  inline def parseLSB(input: String): LinuxOS = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLSB")(input.asInstanceOf[js.Any]).asInstanceOf[LinuxOS]
  
  inline def parseOS(input: String): LinuxOS = ^.asInstanceOf[js.Dynamic].applyDynamic("parseOS")(input.asInstanceOf[js.Any]).asInstanceOf[LinuxOS]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.mongodbMemoryServerCore.libUtilGetosMod.OtherOS
    - typingsJapgolly.mongodbMemoryServerCore.libUtilGetosMod.LinuxOS
  */
  trait AnyOS extends StObject
  object AnyOS {
    
    inline def LinuxOS(dist: String, release: String): typingsJapgolly.mongodbMemoryServerCore.libUtilGetosMod.LinuxOS = {
      val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], os = "linux", release = release.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.mongodbMemoryServerCore.libUtilGetosMod.LinuxOS]
    }
    
    inline def OtherOS(os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin | String): typingsJapgolly.mongodbMemoryServerCore.libUtilGetosMod.OtherOS = {
      val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.mongodbMemoryServerCore.libUtilGetosMod.OtherOS]
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.mongodbMemoryServerCore.libUtilGetosMod.AnyOS because Already inherited */ trait LinuxOS
    extends StObject
       with OtherOS {
    
    var codename: js.UndefOr[String] = js.undefined
    
    var dist: String
    
    var id_like: js.UndefOr[js.Array[String]] = js.undefined
    
    @JSName("os")
    var os_LinuxOS: linux
    
    var release: String
  }
  object LinuxOS {
    
    inline def apply(dist: String, release: String): LinuxOS = {
      val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], os = "linux", release = release.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinuxOS]
    }
    
    extension [Self <: LinuxOS](x: Self) {
      
      inline def setCodename(value: String): Self = StObject.set(x, "codename", value.asInstanceOf[js.Any])
      
      inline def setCodenameUndefined: Self = StObject.set(x, "codename", js.undefined)
      
      inline def setDist(value: String): Self = StObject.set(x, "dist", value.asInstanceOf[js.Any])
      
      inline def setId_like(value: js.Array[String]): Self = StObject.set(x, "id_like", value.asInstanceOf[js.Any])
      
      inline def setId_likeUndefined: Self = StObject.set(x, "id_like", js.undefined)
      
      inline def setId_likeVarargs(value: String*): Self = StObject.set(x, "id_like", js.Array(value*))
      
      inline def setOs(value: linux): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      inline def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    }
  }
  
  trait OtherOS
    extends StObject
       with AnyOS {
    
    var os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin | String
  }
  object OtherOS {
    
    inline def apply(os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin | String): OtherOS = {
      val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any])
      __obj.asInstanceOf[OtherOS]
    }
    
    extension [Self <: OtherOS](x: Self) {
      
      inline def setOs(value: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin | String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    }
  }
}
