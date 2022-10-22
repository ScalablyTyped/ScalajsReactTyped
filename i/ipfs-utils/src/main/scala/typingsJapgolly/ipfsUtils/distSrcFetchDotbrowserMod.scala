package typingsJapgolly.ipfsUtils

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ipfsUtils.anon.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFetchDotbrowserMod extends Shortcut {
  
  @JSImport("ipfs-utils/dist/src/fetch.browser", JSImport.Namespace)
  @js.native
  val ^ : Default | typingsJapgolly.ipfsUtils.anon.Headers = js.native
  
  type Headers = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Headers */ Any
  
  type Request = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Request */ Any
  
  type Response = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Response */ Any
  
  type _To = Default | typingsJapgolly.ipfsUtils.anon.Headers
  
  /* This means you don't have to write `^`, but can instead just say `distSrcFetchDotbrowserMod.foo` */
  override def _to: Default | typingsJapgolly.ipfsUtils.anon.Headers = ^
}
