package typingsJapgolly.rdfLoaderCode

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.rdfLoadersRegistry.mod.Loader
import typingsJapgolly.rdfLoadersRegistry.mod.LoaderRegistry
import typingsJapgolly.rdfjsTypes.dataModelMod.NamedNode
import typingsJapgolly.std.Map
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object argumentsMod extends Shortcut {
  
  @JSImport("rdf-loader-code/arguments", JSImport.Namespace)
  @js.native
  val ^ : ArgumentsLoader = js.native
  
  type Arguments = js.Array[Any | (Record[String, Any])]
  
  @js.native
  trait ArgumentsLoader extends Loader[Arguments, Options] {
    
    def register(registry: LoaderRegistry): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var basePath: js.UndefOr[String] = js.undefined
    
    var context: js.UndefOr[Any] = js.undefined
    
    var property: js.UndefOr[NamedNode[String]] = js.undefined
    
    var variables: js.UndefOr[Map[String, Any]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setProperty(value: NamedNode[String]): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      inline def setVariables(value: Map[String, Any]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    }
  }
  
  type _To = ArgumentsLoader
  
  /* This means you don't have to write `^`, but can instead just say `argumentsMod.foo` */
  override def _to: ArgumentsLoader = ^
}
