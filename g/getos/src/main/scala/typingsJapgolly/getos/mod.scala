package typingsJapgolly.getos

import typingsJapgolly.getos.getosStrings.aix
import typingsJapgolly.getos.getosStrings.android
import typingsJapgolly.getos.getosStrings.cygwin
import typingsJapgolly.getos.getosStrings.darwin
import typingsJapgolly.getos.getosStrings.freebsd
import typingsJapgolly.getos.getosStrings.linux
import typingsJapgolly.getos.getosStrings.openbsd
import typingsJapgolly.getos.getosStrings.sunos
import typingsJapgolly.getos.getosStrings.win32
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(cb: js.Function2[/* error */ js.Error | Null, /* os */ Os, Unit]): String = ^.asInstanceOf[js.Dynamic].apply(cb.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("getos", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait LinuxOs
    extends StObject
       with Os {
    
    var codename: js.UndefOr[String] = js.undefined
    
    var dist: String
    
    var os: linux
    
    var release: String
  }
  object LinuxOs {
    
    inline def apply(dist: String, release: String): LinuxOs = {
      val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], os = "linux", release = release.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinuxOs]
    }
    
    extension [Self <: LinuxOs](x: Self) {
      
      inline def setCodename(value: String): Self = StObject.set(x, "codename", value.asInstanceOf[js.Any])
      
      inline def setCodenameUndefined: Self = StObject.set(x, "codename", js.undefined)
      
      inline def setDist(value: String): Self = StObject.set(x, "dist", value.asInstanceOf[js.Any])
      
      inline def setOs(value: linux): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      inline def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.getos.mod.OtherOs
    - typingsJapgolly.getos.mod.LinuxOs
  */
  trait Os extends StObject
  object Os {
    
    inline def LinuxOs(dist: String, release: String): typingsJapgolly.getos.mod.LinuxOs = {
      val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], os = "linux", release = release.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.getos.mod.LinuxOs]
    }
    
    inline def OtherOs(os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin): typingsJapgolly.getos.mod.OtherOs = {
      val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.getos.mod.OtherOs]
    }
  }
  
  trait OtherOs
    extends StObject
       with Os {
    
    var os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin
  }
  object OtherOs {
    
    inline def apply(os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin): OtherOs = {
      val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any])
      __obj.asInstanceOf[OtherOs]
    }
    
    extension [Self <: OtherOs](x: Self) {
      
      inline def setOs(value: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    }
  }
}
