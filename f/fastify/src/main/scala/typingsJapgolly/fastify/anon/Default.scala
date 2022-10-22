package typingsJapgolly.fastify.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.fastify.typesInstanceMod.FastifyInstance
import typingsJapgolly.fastify.typesLoggerMod.FastifyBaseLogger
import typingsJapgolly.fastify.typesPluginMod.FastifyPluginCallback
import typingsJapgolly.fastify.typesPluginMod.FastifyPluginOptions
import typingsJapgolly.fastify.typesTypeProviderMod.FastifyTypeProvider
import typingsJapgolly.fastify.typesUtilsMod.RawReplyDefaultExpression
import typingsJapgolly.fastify.typesUtilsMod.RawRequestDefaultExpression
import typingsJapgolly.fastify.typesUtilsMod.RawServerBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Default[Options /* <: FastifyPluginOptions */, Server /* <: RawServerBase */, TypeProvider /* <: FastifyTypeProvider */] extends StObject {
  
  def default(
    instance: FastifyInstance[
      Server, 
      RawRequestDefaultExpression[Server], 
      RawReplyDefaultExpression[Server], 
      FastifyBaseLogger, 
      TypeProvider
    ],
    opts: Options,
    done: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  ): Unit
  @JSName("default")
  var default_Original: FastifyPluginCallback[Options, Server, TypeProvider]
}
object Default {
  
  inline def apply[Options /* <: FastifyPluginOptions */, Server /* <: RawServerBase */, TypeProvider /* <: FastifyTypeProvider */](
    default: (/* instance */ FastifyInstance[
      Server, 
      RawRequestDefaultExpression[Server], 
      RawReplyDefaultExpression[Server], 
      FastifyBaseLogger, 
      TypeProvider
    ], Options, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Callback
  ): Default[Options, Server, TypeProvider] = {
    val __obj = js.Dynamic.literal(default = js.Any.fromFunction3((t0: /* instance */ FastifyInstance[
      Server, 
      RawRequestDefaultExpression[Server], 
      RawReplyDefaultExpression[Server], 
      FastifyBaseLogger, 
      TypeProvider
    ], t1: Options, t2: /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => (default(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[Default[Options, Server, TypeProvider]]
  }
  
  extension [Self <: Default[?, ?, ?], Options /* <: FastifyPluginOptions */, Server /* <: RawServerBase */, TypeProvider /* <: FastifyTypeProvider */](x: Self & (Default[Options, Server, TypeProvider])) {
    
    inline def setDefault(
      value: (/* instance */ FastifyInstance[
          Server, 
          RawRequestDefaultExpression[Server], 
          RawReplyDefaultExpression[Server], 
          FastifyBaseLogger, 
          TypeProvider
        ], Options, /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => Callback
    ): Self = StObject.set(x, "default", js.Any.fromFunction3((t0: /* instance */ FastifyInstance[
          Server, 
          RawRequestDefaultExpression[Server], 
          RawReplyDefaultExpression[Server], 
          FastifyBaseLogger, 
          TypeProvider
        ], t1: Options, t2: /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit]) => (value(t0, t1, t2)).runNow()))
  }
}
