package typingsJapgolly.atom

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.atom.anon.Code
import typingsJapgolly.atom.mod.Disposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcPackageMod {
  
  trait Package extends StObject {
    
    /** If a previous rebuild failed, get the contents of stderr. */
    def getBuildFailureOutput(): String | Null
    
    // Native Module Compatibility
    /**
      *  Are all native modules depended on by this package correctly compiled
      *  against the current version of Atom?
      */
    def isCompatible(): Boolean
    
    /** The name of the Package. */
    val name: String
    
    // Event Subscription
    /** Invoke the given callback when all packages have been activated. */
    def onDidDeactivate(callback: js.Function0[Unit]): Disposable
    
    /** The path to the Package on disk. */
    val path: String
    
    /**
      *  Rebuild native modules in this package's dependencies for the current
      *  version of Atom.
      */
    def rebuild(): js.Promise[Code]
  }
  object Package {
    
    inline def apply(
      getBuildFailureOutput: CallbackTo[String | Null],
      isCompatible: CallbackTo[Boolean],
      name: String,
      onDidDeactivate: js.Function0[Unit] => Disposable,
      path: String,
      rebuild: CallbackTo[js.Promise[Code]]
    ): Package = {
      val __obj = js.Dynamic.literal(getBuildFailureOutput = getBuildFailureOutput.toJsFn, isCompatible = isCompatible.toJsFn, name = name.asInstanceOf[js.Any], onDidDeactivate = js.Any.fromFunction1(onDidDeactivate), path = path.asInstanceOf[js.Any], rebuild = rebuild.toJsFn)
      __obj.asInstanceOf[Package]
    }
    
    extension [Self <: Package](x: Self) {
      
      inline def setGetBuildFailureOutput(value: CallbackTo[String | Null]): Self = StObject.set(x, "getBuildFailureOutput", value.toJsFn)
      
      inline def setIsCompatible(value: CallbackTo[Boolean]): Self = StObject.set(x, "isCompatible", value.toJsFn)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnDidDeactivate(value: js.Function0[Unit] => Disposable): Self = StObject.set(x, "onDidDeactivate", js.Any.fromFunction1(value))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRebuild(value: CallbackTo[js.Promise[Code]]): Self = StObject.set(x, "rebuild", value.toJsFn)
    }
  }
}
