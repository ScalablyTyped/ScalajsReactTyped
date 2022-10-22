package typingsJapgolly.wonderJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015RendererBufferEbufferdatatypeMod {
  
  @js.native
  sealed trait EBufferDataType extends StObject
  @JSImport("wonder.js/dist/es2015/renderer/buffer/EBufferDataType", "EBufferDataType")
  @js.native
  object EBufferDataType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EBufferDataType & Double] = js.native
    
    @js.native
    sealed trait INDICE
      extends StObject
         with EBufferDataType
    /* 1 */ val INDICE: typingsJapgolly.wonderJs.distEs2015RendererBufferEbufferdatatypeMod.EBufferDataType.INDICE & Double = js.native
    
    @js.native
    sealed trait VERTICE
      extends StObject
         with EBufferDataType
    /* 0 */ val VERTICE: typingsJapgolly.wonderJs.distEs2015RendererBufferEbufferdatatypeMod.EBufferDataType.VERTICE & Double = js.native
  }
}
