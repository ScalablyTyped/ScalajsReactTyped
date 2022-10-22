package typingsJapgolly.angularCompilerCli

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.angularCompilerCli.ngccSrcDependenciesDependencyResolverMod.SortedEntryPointsInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcEntryPointFinderInterfaceMod {
  
  trait EntryPointFinder extends StObject {
    
    /**
      * Search for Angular package entry-points.
      */
    def findEntryPoints(): SortedEntryPointsInfo
  }
  object EntryPointFinder {
    
    inline def apply(findEntryPoints: CallbackTo[SortedEntryPointsInfo]): EntryPointFinder = {
      val __obj = js.Dynamic.literal(findEntryPoints = findEntryPoints.toJsFn)
      __obj.asInstanceOf[EntryPointFinder]
    }
    
    extension [Self <: EntryPointFinder](x: Self) {
      
      inline def setFindEntryPoints(value: CallbackTo[SortedEntryPointsInfo]): Self = StObject.set(x, "findEntryPoints", value.toJsFn)
    }
  }
}
