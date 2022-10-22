package typingsJapgolly.next.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadStaticPaths
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var loadStaticPaths: js.Function1[
    /* hasDistDirPathnameServerlessConfigHttpAgentOptionsLocalesDefaultLocaleIsAppPathOriginalAppPath */ HttpAgentOptions, 
    js.Promise[EncodedPathsFallback]
  ]
}
object LoadStaticPaths {
  
  inline def apply(
    loadStaticPaths: /* hasDistDirPathnameServerlessConfigHttpAgentOptionsLocalesDefaultLocaleIsAppPathOriginalAppPath */ HttpAgentOptions => js.Promise[EncodedPathsFallback]
  ): LoadStaticPaths = {
    val __obj = js.Dynamic.literal(loadStaticPaths = js.Any.fromFunction1(loadStaticPaths))
    __obj.asInstanceOf[LoadStaticPaths]
  }
  
  extension [Self <: LoadStaticPaths](x: Self) {
    
    inline def setLoadStaticPaths(
      value: /* hasDistDirPathnameServerlessConfigHttpAgentOptionsLocalesDefaultLocaleIsAppPathOriginalAppPath */ HttpAgentOptions => js.Promise[EncodedPathsFallback]
    ): Self = StObject.set(x, "loadStaticPaths", js.Any.fromFunction1(value))
  }
}
