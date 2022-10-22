package typingsJapgolly.fastify.anon

import typingsJapgolly.fastify.typesInstanceMod.FastifyInstance
import typingsJapgolly.fastify.typesLoggerMod.FastifyBaseLogger
import typingsJapgolly.fastify.typesPluginMod.FastifyPluginAsync
import typingsJapgolly.fastify.typesPluginMod.FastifyPluginOptions
import typingsJapgolly.fastify.typesTypeProviderMod.FastifyTypeProvider
import typingsJapgolly.fastify.typesUtilsMod.RawReplyDefaultExpression
import typingsJapgolly.fastify.typesUtilsMod.RawRequestDefaultExpression
import typingsJapgolly.fastify.typesUtilsMod.RawServerBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultFastifyPluginAsync[Options /* <: FastifyPluginOptions */, Server /* <: RawServerBase */, TypeProvider /* <: FastifyTypeProvider */] extends StObject {
  
  def default(
    instance: FastifyInstance[
      Server, 
      RawRequestDefaultExpression[Server], 
      RawReplyDefaultExpression[Server], 
      FastifyBaseLogger, 
      TypeProvider
    ],
    opts: Options
  ): js.Promise[Unit]
  @JSName("default")
  var default_Original: FastifyPluginAsync[Options, Server, TypeProvider]
}
object DefaultFastifyPluginAsync {
  
  inline def apply[Options /* <: FastifyPluginOptions */, Server /* <: RawServerBase */, TypeProvider /* <: FastifyTypeProvider */](
    default: (/* instance */ FastifyInstance[
      Server, 
      RawRequestDefaultExpression[Server], 
      RawReplyDefaultExpression[Server], 
      FastifyBaseLogger, 
      TypeProvider
    ], Options) => js.Promise[Unit]
  ): DefaultFastifyPluginAsync[Options, Server, TypeProvider] = {
    val __obj = js.Dynamic.literal(default = js.Any.fromFunction2(default))
    __obj.asInstanceOf[DefaultFastifyPluginAsync[Options, Server, TypeProvider]]
  }
  
  extension [Self <: DefaultFastifyPluginAsync[?, ?, ?], Options /* <: FastifyPluginOptions */, Server /* <: RawServerBase */, TypeProvider /* <: FastifyTypeProvider */](x: Self & (DefaultFastifyPluginAsync[Options, Server, TypeProvider])) {
    
    inline def setDefault(
      value: (/* instance */ FastifyInstance[
          Server, 
          RawRequestDefaultExpression[Server], 
          RawReplyDefaultExpression[Server], 
          FastifyBaseLogger, 
          TypeProvider
        ], Options) => js.Promise[Unit]
    ): Self = StObject.set(x, "default", js.Any.fromFunction2(value))
  }
}
