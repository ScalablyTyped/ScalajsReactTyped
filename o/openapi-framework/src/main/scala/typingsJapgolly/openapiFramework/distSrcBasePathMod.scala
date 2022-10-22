package typingsJapgolly.openapiFramework

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.openapiFramework.anon.Enum
import typingsJapgolly.openapiTypes.mod.OpenAPIV3.ServerObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcBasePathMod {
  
  @JSImport("openapi-framework/dist/src/BasePath", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with BasePath {
    def this(server: ServerObject) = this()
    
    /* CompleteClass */
    override def hasVariables(): Boolean = js.native
    
    /* CompleteClass */
    override val path: String = js.native
    
    /* CompleteClass */
    override val variables: StringDictionary[Enum] = js.native
  }
  
  trait BasePath extends StObject {
    
    def hasVariables(): Boolean
    
    val path: String
    
    val variables: StringDictionary[Enum]
  }
  object BasePath {
    
    inline def apply(hasVariables: CallbackTo[Boolean], path: String, variables: StringDictionary[Enum]): BasePath = {
      val __obj = js.Dynamic.literal(hasVariables = hasVariables.toJsFn, path = path.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasePath]
    }
    
    extension [Self <: BasePath](x: Self) {
      
      inline def setHasVariables(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasVariables", value.toJsFn)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setVariables(value: StringDictionary[Enum]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    }
  }
}
