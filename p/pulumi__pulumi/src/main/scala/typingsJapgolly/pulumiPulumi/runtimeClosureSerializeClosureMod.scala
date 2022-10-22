package typingsJapgolly.pulumiPulumi

import typingsJapgolly.pulumiPulumi.resourceMod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeClosureSerializeClosureMod {
  
  @JSImport("@pulumi/pulumi/runtime/closure/serializeClosure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def serializeFunction(func: js.Function): js.Promise[SerializedFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeFunction")(func.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SerializedFunction]]
  inline def serializeFunction(func: js.Function, args: SerializeFunctionArgs): js.Promise[SerializedFunction] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeFunction")(func.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SerializedFunction]]
  
  inline def serializeFunctionAsync(func: js.Function): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeFunctionAsync")(func.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def serializeFunctionAsync(func: js.Function, serialize: js.Function1[/* o */ Any, Boolean]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeFunctionAsync")(func.asInstanceOf[js.Any], serialize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  trait SerializeFunctionArgs extends StObject {
    
    /**
      * If true, allow secrets to be serialized into the function. This should only be set to true if the calling
      * code will handle this and propoerly wrap the resulting text in a Secret before passing it into any Resources
      * or serializing it to any other output format. If set, the `containsSecrets` property on the returned
      * SerializedFunction object will indicate whether secrets were serialized into the function text.
      */
    var allowSecrets: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The name to export from the module defined by the generated module text.  Defaults to 'handler'.
      */
    var exportName: js.UndefOr[String] = js.undefined
    
    /**
      * If this is a function which, when invoked, will produce the actual entrypoint function.
      * Useful for when serializing a function that has high startup cost that only wants to be
      * run once. The signature of this function should be:  () => (provider_handler_args...) => provider_result
      *
      * This will then be emitted as: `exports.[exportName] = serialized_func_name();`
      *
      * In other words, the function will be invoked (once) and the resulting inner function will
      * be what is exported.
      */
    var isFactoryFunction: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The resource to log any errors we encounter against.
      */
    var logResource: js.UndefOr[Resource] = js.undefined
    
    /**
      * A function to prevent serialization of certain objects captured during the serialization.  Primarily used to
      * prevent potential cycles.
      */
    var serialize: js.UndefOr[js.Function1[/* o */ Any, Boolean]] = js.undefined
  }
  object SerializeFunctionArgs {
    
    inline def apply(): SerializeFunctionArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SerializeFunctionArgs]
    }
    
    extension [Self <: SerializeFunctionArgs](x: Self) {
      
      inline def setAllowSecrets(value: Boolean): Self = StObject.set(x, "allowSecrets", value.asInstanceOf[js.Any])
      
      inline def setAllowSecretsUndefined: Self = StObject.set(x, "allowSecrets", js.undefined)
      
      inline def setExportName(value: String): Self = StObject.set(x, "exportName", value.asInstanceOf[js.Any])
      
      inline def setExportNameUndefined: Self = StObject.set(x, "exportName", js.undefined)
      
      inline def setIsFactoryFunction(value: Boolean): Self = StObject.set(x, "isFactoryFunction", value.asInstanceOf[js.Any])
      
      inline def setIsFactoryFunctionUndefined: Self = StObject.set(x, "isFactoryFunction", js.undefined)
      
      inline def setLogResource(value: Resource): Self = StObject.set(x, "logResource", value.asInstanceOf[js.Any])
      
      inline def setLogResourceUndefined: Self = StObject.set(x, "logResource", js.undefined)
      
      inline def setSerialize(value: /* o */ Any => Boolean): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
      
      inline def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
    }
  }
  
  trait SerializedFunction extends StObject {
    
    /**
      * True if the serialized function text includes serialization of secret
      */
    var containsSecrets: Boolean
    
    /**
      * The name of the exported module member.
      */
    var exportName: String
    
    /**
      * The text of a JavaScript module which exports a single name bound to an appropriate value.
      * In the case of a normal function, this value will just be serialized function.  In the case
      * of a factory function this value will be the result of invoking the factory function.
      */
    var text: String
  }
  object SerializedFunction {
    
    inline def apply(containsSecrets: Boolean, exportName: String, text: String): SerializedFunction = {
      val __obj = js.Dynamic.literal(containsSecrets = containsSecrets.asInstanceOf[js.Any], exportName = exportName.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializedFunction]
    }
    
    extension [Self <: SerializedFunction](x: Self) {
      
      inline def setContainsSecrets(value: Boolean): Self = StObject.set(x, "containsSecrets", value.asInstanceOf[js.Any])
      
      inline def setExportName(value: String): Self = StObject.set(x, "exportName", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
