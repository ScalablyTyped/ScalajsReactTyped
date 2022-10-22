package typingsJapgolly.ipfsCli

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ipfsCoreTypes.mod.IPFS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Api extends StObject {
    
    var api: js.UndefOr[String] = js.undefined
    
    var migrate: Boolean
    
    var pass: js.UndefOr[String] = js.undefined
    
    var silent: Any
  }
  object Api {
    
    inline def apply(migrate: Boolean, silent: Any): Api = {
      val __obj = js.Dynamic.literal(migrate = migrate.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Api]
    }
    
    extension [Self <: Api](x: Self) {
      
      inline def setApi(value: String): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
      
      inline def setMigrate(value: Boolean): Self = StObject.set(x, "migrate", value.asInstanceOf[js.Any])
      
      inline def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      inline def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
      
      inline def setSilent(value: Any): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    }
  }
  
  trait Cleanup extends StObject {
    
    def cleanup(): js.Promise[Unit]
    
    var ipfs: IPFS[Any]
    
    var isDaemon: Boolean
  }
  object Cleanup {
    
    inline def apply(cleanup: CallbackTo[js.Promise[Unit]], ipfs: IPFS[Any], isDaemon: Boolean): Cleanup = {
      val __obj = js.Dynamic.literal(cleanup = cleanup.toJsFn, ipfs = ipfs.asInstanceOf[js.Any], isDaemon = isDaemon.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cleanup]
    }
    
    extension [Self <: Cleanup](x: Self) {
      
      inline def setCleanup(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "cleanup", value.toJsFn)
      
      inline def setIpfs(value: IPFS[Any]): Self = StObject.set(x, "ipfs", value.asInstanceOf[js.Any])
      
      inline def setIsDaemon(value: Boolean): Self = StObject.set(x, "isDaemon", value.asInstanceOf[js.Any])
    }
  }
  
  trait Migrate extends StObject {
    
    var api: js.UndefOr[String] = js.undefined
    
    var migrate: js.UndefOr[Boolean] = js.undefined
    
    var pass: js.UndefOr[String] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
  }
  object Migrate {
    
    inline def apply(): Migrate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Migrate]
    }
    
    extension [Self <: Migrate](x: Self) {
      
      inline def setApi(value: String): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setApiUndefined: Self = StObject.set(x, "api", js.undefined)
      
      inline def setMigrate(value: Boolean): Self = StObject.set(x, "migrate", value.asInstanceOf[js.Any])
      
      inline def setMigrateUndefined: Self = StObject.set(x, "migrate", js.undefined)
      
      inline def setPass(value: String): Self = StObject.set(x, "pass", value.asInstanceOf[js.Any])
      
      inline def setPassUndefined: Self = StObject.set(x, "pass", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
  
  trait Nsecs extends StObject {
    
    var nsecs: js.UndefOr[Double] = js.undefined
    
    var secs: Double
  }
  object Nsecs {
    
    inline def apply(secs: Double): Nsecs = {
      val __obj = js.Dynamic.literal(secs = secs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Nsecs]
    }
    
    extension [Self <: Nsecs](x: Self) {
      
      inline def setNsecs(value: Double): Self = StObject.set(x, "nsecs", value.asInstanceOf[js.Any])
      
      inline def setNsecsUndefined: Self = StObject.set(x, "nsecs", js.undefined)
      
      inline def setSecs(value: Double): Self = StObject.set(x, "secs", value.asInstanceOf[js.Any])
    }
  }
}
