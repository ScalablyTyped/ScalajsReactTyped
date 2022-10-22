package typingsJapgolly.snyk.anon

import typingsJapgolly.snyk.distLibPluginsRubygemsInspectorsMod.Spec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofgemfile extends StObject {
  
  def canHandle(file: String): Boolean
  
  def gatherSpecs(root: String, target: String, options: typingsJapgolly.snyk.distLibPluginsTypesMod.Options): js.Promise[Spec]
}
object Typeofgemfile {
  
  inline def apply(
    canHandle: String => Boolean,
    gatherSpecs: (String, String, typingsJapgolly.snyk.distLibPluginsTypesMod.Options) => js.Promise[Spec]
  ): Typeofgemfile = {
    val __obj = js.Dynamic.literal(canHandle = js.Any.fromFunction1(canHandle), gatherSpecs = js.Any.fromFunction3(gatherSpecs))
    __obj.asInstanceOf[Typeofgemfile]
  }
  
  extension [Self <: Typeofgemfile](x: Self) {
    
    inline def setCanHandle(value: String => Boolean): Self = StObject.set(x, "canHandle", js.Any.fromFunction1(value))
    
    inline def setGatherSpecs(value: (String, String, typingsJapgolly.snyk.distLibPluginsTypesMod.Options) => js.Promise[Spec]): Self = StObject.set(x, "gatherSpecs", js.Any.fromFunction3(value))
  }
}
