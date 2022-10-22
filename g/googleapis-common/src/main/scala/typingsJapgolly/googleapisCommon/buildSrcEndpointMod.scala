package typingsJapgolly.googleapisCommon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.googleapisCommon.buildSrcApiMod.APIRequestContext
import typingsJapgolly.googleapisCommon.buildSrcApiMod.GlobalOptions
import typingsJapgolly.googleapisCommon.buildSrcSchemaMod.Schema
import typingsJapgolly.googleapisCommon.buildSrcSchemaMod.SchemaResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcEndpointMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - org.scalablytyped.runtime.StObject because Already inherited
  - org.scalablytyped.runtime.StringDictionary because Already inherited */ @JSImport("googleapis-common/build/src/endpoint", "Endpoint")
  @js.native
  open class Endpoint protected ()
    extends StObject
       with Target
       with APIRequestContext {
    def this(options: js.Object) = this()
    
    /* CompleteClass */
    var _options: GlobalOptions = js.native
    
    /**
      * Given a schema, add methods to a target.
      *
      * @param {object} target The target to which to apply the methods.
      * @param {object} rootSchema The top-level schema, so we don't lose track of it
      * during recursion.
      * @param {object} schema The current schema from which to extract methods.
      * @param {object} context The context to add to each method.
      */
    /* private */ var applyMethodsFromSchema: Any = js.native
    
    /**
      * Given a schema, add methods and resources to a target.
      *
      * @param {object} target The target to which to apply the schema.
      * @param {object} rootSchema The top-level schema, so we don't lose track of it
      * during recursion.
      * @param {object} schema The current schema from which to extract methods and
      * resources.
      * @param {object} context The context to add to each method.
      */
    def applySchema(target: Target, rootSchema: Schema, schema: SchemaResource, context: APIRequestContext): Unit = js.native
    
    /* private */ var getPathParams: Any = js.native
    
    /**
      * Given a method schema, add a method to a target.
      *
      * @param target The target to which to add the method.
      * @param schema The top-level schema that contains the rootUrl, etc.
      * @param method The method schema from which to generate the method.
      * @param context The context to add to the method.
      */
    /* private */ var makeMethod: Any = js.native
  }
  
  type Target = StringDictionary[js.Object]
}
