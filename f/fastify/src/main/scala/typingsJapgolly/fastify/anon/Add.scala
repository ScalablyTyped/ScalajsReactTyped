package typingsJapgolly.fastify.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.fastify.typesInstanceMod.FastifyInstance
import typingsJapgolly.fastify.typesLoggerMod.FastifyBaseLogger
import typingsJapgolly.fastify.typesTypeProviderMod.FastifyTypeProviderDefault
import typingsJapgolly.fastify.typesUtilsMod.RawReplyDefaultExpression
import typingsJapgolly.fastify.typesUtilsMod.RawRequestDefaultExpression
import typingsJapgolly.fastify.typesUtilsMod.RawServerDefault
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Add extends StObject {
  
  def add(schema: Any): FastifyInstance[
    RawServerDefault, 
    RawRequestDefaultExpression[RawServerDefault], 
    RawReplyDefaultExpression[RawServerDefault], 
    FastifyBaseLogger, 
    FastifyTypeProviderDefault
  ]
  
  def getSchema(schemaId: String): Any
  
  def getSchemas(): Record[String, Any]
}
object Add {
  
  inline def apply(
    add: Any => FastifyInstance[
      RawServerDefault, 
      RawRequestDefaultExpression[RawServerDefault], 
      RawReplyDefaultExpression[RawServerDefault], 
      FastifyBaseLogger, 
      FastifyTypeProviderDefault
    ],
    getSchema: String => Any,
    getSchemas: CallbackTo[Record[String, Any]]
  ): Add = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), getSchema = js.Any.fromFunction1(getSchema), getSchemas = getSchemas.toJsFn)
    __obj.asInstanceOf[Add]
  }
  
  extension [Self <: Add](x: Self) {
    
    inline def setAdd(
      value: Any => FastifyInstance[
          RawServerDefault, 
          RawRequestDefaultExpression[RawServerDefault], 
          RawReplyDefaultExpression[RawServerDefault], 
          FastifyBaseLogger, 
          FastifyTypeProviderDefault
        ]
    ): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setGetSchema(value: String => Any): Self = StObject.set(x, "getSchema", js.Any.fromFunction1(value))
    
    inline def setGetSchemas(value: CallbackTo[Record[String, Any]]): Self = StObject.set(x, "getSchemas", value.toJsFn)
  }
}
