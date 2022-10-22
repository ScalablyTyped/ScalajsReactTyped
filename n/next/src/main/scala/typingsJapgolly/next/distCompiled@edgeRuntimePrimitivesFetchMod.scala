package typingsJapgolly.next

import org.scalajs.dom.RequestInit
import org.scalajs.dom.URL
import typingsJapgolly.next.nextStrings.`set-cookie`
import typingsJapgolly.std.RequestInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `distCompiled@edgeRuntimePrimitivesFetchMod` {
  
  @JSImport("next/dist/compiled/@edge-runtime/primitives/fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Headers * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Headers * / any */ @JSImport("next/dist/compiled/@edge-runtime/primitives/fetch", "Headers")
  @js.native
  open class Headers () extends StObject {
    
    @JSName("getAll")
    def getAll_setcookie(key: `set-cookie`): js.Array[String] = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Request * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Request * / any */ @JSImport("next/dist/compiled/@edge-runtime/primitives/fetch", "Request")
  @js.native
  open class Request () extends StObject {
    
    val headers: Headers = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Response * / any
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Response * / any */ @JSImport("next/dist/compiled/@edge-runtime/primitives/fetch", "Response")
  @js.native
  open class Response () extends StObject {
    
    val headers: Headers = js.native
  }
  
  /* was `typeof fetch` */
  inline def fetch(input: URL): js.Promise[org.scalajs.dom.Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[org.scalajs.dom.Response]]
  /* was `typeof fetch` */
  inline def fetch(input: URL, init: RequestInit): js.Promise[org.scalajs.dom.Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[org.scalajs.dom.Response]]
  /* was `typeof fetch` */
  inline def fetch(input: RequestInfo): js.Promise[org.scalajs.dom.Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[org.scalajs.dom.Response]]
  /* was `typeof fetch` */
  inline def fetch(input: RequestInfo, init: RequestInit): js.Promise[org.scalajs.dom.Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[org.scalajs.dom.Response]]
}
