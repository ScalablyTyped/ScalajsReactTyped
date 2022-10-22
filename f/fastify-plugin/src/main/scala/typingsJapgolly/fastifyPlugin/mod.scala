package typingsJapgolly.fastifyPlugin

import typingsJapgolly.fastify.typesPluginMod.FastifyPluginCallback
import typingsJapgolly.fastify.typesPluginMod.FastifyPluginOptions
import typingsJapgolly.fastify.typesTypeProviderMod.FastifyTypeProvider
import typingsJapgolly.fastify.typesTypeProviderMod.FastifyTypeProviderDefault
import typingsJapgolly.fastify.typesUtilsMod.RawServerBase
import typingsJapgolly.fastify.typesUtilsMod.RawServerDefault
import typingsJapgolly.fastifyPlugin.anon.Fastify
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fastify-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Options /* <: FastifyPluginOptions */, RawServer /* <: RawServerBase */, TypeProvider /* <: FastifyTypeProvider */](fn: FastifyPluginCallback[Options, RawServerDefault, FastifyTypeProviderDefault]): FastifyPluginCallback[Options, RawServerDefault, FastifyTypeProviderDefault] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any]).asInstanceOf[FastifyPluginCallback[Options, RawServerDefault, FastifyTypeProviderDefault]]
  inline def default[Options /* <: FastifyPluginOptions */, RawServer /* <: RawServerBase */, TypeProvider /* <: FastifyTypeProvider */](fn: FastifyPluginCallback[Options, RawServerDefault, FastifyTypeProviderDefault], options: String): FastifyPluginCallback[Options, RawServerDefault, FastifyTypeProviderDefault] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FastifyPluginCallback[Options, RawServerDefault, FastifyTypeProviderDefault]]
  
  trait PluginMetadata extends StObject {
    
    /** Decorator dependencies for this plugin */
    var decorators: js.UndefOr[Fastify] = js.undefined
    
    /** The plugin dependencies */
    var dependencies: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Bare-minimum version of Fastify for your plugin, just add the semver range that you need. */
    var fastify: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object PluginMetadata {
    
    inline def apply(): PluginMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginMetadata]
    }
    
    extension [Self <: PluginMetadata](x: Self) {
      
      inline def setDecorators(value: Fastify): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
      
      inline def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
      
      inline def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value*))
      
      inline def setFastify(value: String): Self = StObject.set(x, "fastify", value.asInstanceOf[js.Any])
      
      inline def setFastifyUndefined: Self = StObject.set(x, "fastify", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  type PluginOptions = PluginMetadata
}
