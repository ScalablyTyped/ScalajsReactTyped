package typingsJapgolly.next

import typingsJapgolly.next.distCompiledWebpackWebpackMod.webpack.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBuildWebpackPluginsSubresourceIntegrityPluginMod {
  
  @JSImport("next/dist/build/webpack/plugins/subresource-integrity-plugin", "SubresourceIntegrityPlugin")
  @js.native
  open class SubresourceIntegrityPlugin protected () extends StObject {
    def this(algorithm: SubresourceIntegrityAlgorithm) = this()
    
    /* private */ val algorithm: Any = js.native
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.next.nextStrings.sha256
    - typingsJapgolly.next.nextStrings.sha384
    - typingsJapgolly.next.nextStrings.sha512
  */
  trait SubresourceIntegrityAlgorithm extends StObject
  object SubresourceIntegrityAlgorithm {
    
    inline def sha256: typingsJapgolly.next.nextStrings.sha256 = "sha256".asInstanceOf[typingsJapgolly.next.nextStrings.sha256]
    
    inline def sha384: typingsJapgolly.next.nextStrings.sha384 = "sha384".asInstanceOf[typingsJapgolly.next.nextStrings.sha384]
    
    inline def sha512: typingsJapgolly.next.nextStrings.sha512 = "sha512".asInstanceOf[typingsJapgolly.next.nextStrings.sha512]
  }
}
