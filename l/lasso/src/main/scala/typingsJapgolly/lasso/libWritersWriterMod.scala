package typingsJapgolly.lasso

import typingsJapgolly.lasso.libDependenciesMod.Bundle
import typingsJapgolly.lasso.libLassoContextMod.default
import typingsJapgolly.lasso.libLassoMod.LassoConfig
import typingsJapgolly.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWritersWriterMod {
  
  @js.native
  trait Writer extends EventEmitter {
    
    def apply(impl: Any): Writer = js.native
    
    def buildResourceCacheKey(cacheKey: String, lassoContext: default): String = js.native
    
    def checkBundleUpToDate(bundle: Bundle, lassoContext: default, callback: Any): Any = js.native
    
    def checkResourceUpToDate(path: String, lassoContext: default, callback: Any): Any = js.native
    
    var config: LassoConfig = js.native
    
    def getInPlaceUrlForBundle(bundle: Bundle, lassoContext: default): String = js.native
    
    def getInPlaceUrlForFile(path: String, lassoContext: default): String | Null = js.native
    
    def getLasso(): typingsJapgolly.lasso.libLassoMod.default = js.native
    
    var impl: Any = js.native
    
    var lasso: typingsJapgolly.lasso.libLassoMod.default = js.native
    
    def setLasso(lasso: typingsJapgolly.lasso.libLassoMod.default): Unit = js.native
    
    def writeBundle(bundle: Bundle, onBundleWrittenCallback: Any, lassoContext: default, callback: Any): Any = js.native
    
    def writeBundles(iteratorFunc: Any, onBundleWrittenCallback: Any, lassoContext: default, callback: Any): Unit = js.native
    
    def writeResource(path: String, lassoContext: default, callback: Any): Any = js.native
  }
}
