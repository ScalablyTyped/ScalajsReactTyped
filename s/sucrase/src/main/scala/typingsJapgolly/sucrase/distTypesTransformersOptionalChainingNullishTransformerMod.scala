package typingsJapgolly.sucrase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTransformersOptionalChainingNullishTransformerMod {
  
  @JSImport("sucrase/dist/types/transformers/OptionalChainingNullishTransformer", JSImport.Default)
  @js.native
  open class default protected () extends OptionalChainingNullishTransformer {
    def this(
      tokens: typingsJapgolly.sucrase.distTypesTokenProcessorMod.default,
      nameManager: typingsJapgolly.sucrase.distTypesNameManagerMod.default
    ) = this()
  }
  
  @js.native
  trait OptionalChainingNullishTransformer
    extends typingsJapgolly.sucrase.distTypesTransformersTransformerMod.default {
    
    /**
      * Determine if the current token is the last of its chain, so that we know whether it's eligible
      * to have a delete op inserted.
      *
      * We can do this by walking forward until we determine one way or another. Each
      * isOptionalChainStart token must be paired with exactly one isOptionalChainEnd token after it in
      * a nesting way, so we can track depth and walk to the end of the chain (the point where the
      * depth goes negative) and see if any other subscript token is after us in the chain.
      */
    def isLastSubscriptInChain(): Boolean = js.native
    
    /**
      * Determine if we are the open-paren in an expression like super.a()?.b.
      *
      * We can do this by walking backward to find the previous subscript. If that subscript was
      * preceded by a super, then we must be the subscript after it, so if this is a call expression,
      * we'll need to attach the right context.
      */
    def justSkippedSuper(): Boolean = js.native
    
    val nameManager: typingsJapgolly.sucrase.distTypesNameManagerMod.default = js.native
    
    val tokens: typingsJapgolly.sucrase.distTypesTokenProcessorMod.default = js.native
  }
}
