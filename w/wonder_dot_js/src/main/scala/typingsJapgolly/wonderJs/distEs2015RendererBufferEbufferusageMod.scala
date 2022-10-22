package typingsJapgolly.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015RendererBufferEbufferusageMod {
  
  @js.native
  sealed trait EBufferUsage extends StObject
  @JSImport("wonder.js/dist/es2015/renderer/buffer/EBufferUsage", "EBufferUsage")
  @js.native
  object EBufferUsage extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EBufferUsage & Double] = js.native
    
    @js.native
    sealed trait DYNAMIC_DRAW
      extends StObject
         with EBufferUsage
    /* 2 */ val DYNAMIC_DRAW: typingsJapgolly.wonderJs.distEs2015RendererBufferEbufferusageMod.EBufferUsage.DYNAMIC_DRAW & Double = js.native
    
    @js.native
    sealed trait STATIC_DRAW
      extends StObject
         with EBufferUsage
    /* 1 */ val STATIC_DRAW: typingsJapgolly.wonderJs.distEs2015RendererBufferEbufferusageMod.EBufferUsage.STATIC_DRAW & Double = js.native
    
    @js.native
    sealed trait STREAM_DRAW
      extends StObject
         with EBufferUsage
    /* 0 */ val STREAM_DRAW: typingsJapgolly.wonderJs.distEs2015RendererBufferEbufferusageMod.EBufferUsage.STREAM_DRAW & Double = js.native
  }
}
