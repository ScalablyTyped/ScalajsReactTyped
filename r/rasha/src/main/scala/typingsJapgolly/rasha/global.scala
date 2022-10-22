package typingsJapgolly.rasha

import typingsJapgolly.rasha.mod.ExportOptions
import typingsJapgolly.rasha.mod.GenerateOptions
import typingsJapgolly.rasha.mod.ImportOptions
import typingsJapgolly.rasha.mod.Jwk
import typingsJapgolly.rasha.mod.RsaKeys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Rasha {
    
    @JSGlobal("Rasha")
    @js.native
    val ^ : js.Any = js.native
    
    // JWK-to-PEM
    inline def `export`(opts: ExportOptions): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("export")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
    
    inline def generate(opts: GenerateOptions): js.Promise[RsaKeys] = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[RsaKeys]]
    
    // PEM-to-JWK
    inline def `import`(opts: ImportOptions): js.Promise[Jwk] = ^.asInstanceOf[js.Dynamic].applyDynamic("import")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Jwk]]
    
    inline def thumbprint(jwk: Jwk): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("thumbprint")(jwk.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  }
}
