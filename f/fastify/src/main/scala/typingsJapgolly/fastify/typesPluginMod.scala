package typingsJapgolly.fastify

import typingsJapgolly.fastify.typesInstanceMod.FastifyInstance
import typingsJapgolly.fastify.typesLoggerMod.FastifyBaseLogger
import typingsJapgolly.fastify.typesTypeProviderMod.FastifyTypeProvider
import typingsJapgolly.fastify.typesTypeProviderMod.FastifyTypeProviderDefault
import typingsJapgolly.fastify.typesUtilsMod.RawReplyDefaultExpression
import typingsJapgolly.fastify.typesUtilsMod.RawRequestDefaultExpression
import typingsJapgolly.fastify.typesUtilsMod.RawServerBase
import typingsJapgolly.fastify.typesUtilsMod.RawServerDefault
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPluginMod {
  
  type FastifyPlugin[Options /* <: FastifyPluginOptions */] = (FastifyPluginCallback[Options, RawServerDefault, FastifyTypeProviderDefault]) | (FastifyPluginAsync[Options, RawServerDefault, FastifyTypeProviderDefault])
  
  type FastifyPluginAsync[Options /* <: FastifyPluginOptions */, Server /* <: RawServerBase */, TypeProvider /* <: FastifyTypeProvider */] = js.Function2[
    /* instance */ FastifyInstance[
      Server, 
      RawRequestDefaultExpression[Server], 
      RawReplyDefaultExpression[Server], 
      FastifyBaseLogger, 
      TypeProvider
    ], 
    /* opts */ Options, 
    js.Promise[Unit]
  ]
  
  type FastifyPluginCallback[Options /* <: FastifyPluginOptions */, Server /* <: RawServerBase */, TypeProvider /* <: FastifyTypeProvider */] = js.Function3[
    /* instance */ FastifyInstance[
      Server, 
      RawRequestDefaultExpression[Server], 
      RawReplyDefaultExpression[Server], 
      FastifyBaseLogger, 
      TypeProvider
    ], 
    /* opts */ Options, 
    /* done */ js.Function1[/* err */ js.UndefOr[js.Error], Unit], 
    Unit
  ]
  
  type FastifyPluginOptions = Record[String, Any]
}
