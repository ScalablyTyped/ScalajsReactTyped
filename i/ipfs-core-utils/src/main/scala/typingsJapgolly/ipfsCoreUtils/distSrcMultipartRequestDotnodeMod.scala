package typingsJapgolly.ipfsCoreUtils

import org.scalajs.dom.AbortController
import typingsJapgolly.ipfsCoreUtils.anon.Headers
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMultipartRequestDotnodeMod {
  
  @JSImport("ipfs-core-utils/dist/src/multipart-request.node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def multipartRequest(source: ImportCandidateStream, abortController: AbortController): js.Promise[Headers] = (^.asInstanceOf[js.Dynamic].applyDynamic("multipartRequest")(source.asInstanceOf[js.Any], abortController.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Headers]]
  inline def multipartRequest(source: ImportCandidateStream, abortController: AbortController, headers: org.scalajs.dom.Headers): js.Promise[Headers] = (^.asInstanceOf[js.Dynamic].applyDynamic("multipartRequest")(source.asInstanceOf[js.Any], abortController.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Headers]]
  inline def multipartRequest(
    source: ImportCandidateStream,
    abortController: AbortController,
    headers: org.scalajs.dom.Headers,
    boundary: String
  ): js.Promise[Headers] = (^.asInstanceOf[js.Dynamic].applyDynamic("multipartRequest")(source.asInstanceOf[js.Any], abortController.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], boundary.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Headers]]
  inline def multipartRequest(source: ImportCandidateStream, abortController: AbortController, headers: Unit, boundary: String): js.Promise[Headers] = (^.asInstanceOf[js.Dynamic].applyDynamic("multipartRequest")(source.asInstanceOf[js.Any], abortController.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], boundary.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Headers]]
  inline def multipartRequest(source: ImportCandidateStream, abortController: AbortController, headers: Record[String, String]): js.Promise[Headers] = (^.asInstanceOf[js.Dynamic].applyDynamic("multipartRequest")(source.asInstanceOf[js.Any], abortController.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Headers]]
  inline def multipartRequest(
    source: ImportCandidateStream,
    abortController: AbortController,
    headers: Record[String, String],
    boundary: String
  ): js.Promise[Headers] = (^.asInstanceOf[js.Dynamic].applyDynamic("multipartRequest")(source.asInstanceOf[js.Any], abortController.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], boundary.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Headers]]
  
  type ImportCandidateStream = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_utils.ImportCandidateStream */ Any
}
