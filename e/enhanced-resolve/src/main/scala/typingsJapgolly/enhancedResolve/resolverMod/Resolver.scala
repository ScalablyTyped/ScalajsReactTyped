package typingsJapgolly.enhancedResolve.resolverMod

import typingsJapgolly.enhancedResolve.commonTypesMod.AbstractInputFileSystem
import typingsJapgolly.enhancedResolve.commonTypesMod.LoggingCallbackWrapper
import typingsJapgolly.enhancedResolve.commonTypesMod.ResolveContext
import typingsJapgolly.enhancedResolve.commonTypesMod.ResolveParseResult
import typingsJapgolly.enhancedResolve.commonTypesMod.ResolverRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Tapable * / any */ @js.native
trait Resolver extends js.Object {
  var fileSystem: AbstractInputFileSystem = js.native
  def doResolve(`type`: String, request: ResolverRequest, message: String, callback: LoggingCallbackWrapper): js.Any = js.native
  def doResolve(`type`: String, request: ResolverRequest, message: Null, callback: LoggingCallbackWrapper): js.Any = js.native
  def isDirectory(path: String): Boolean = js.native
  def isModule(path: String): Boolean = js.native
  def join(path: String, request: String): String = js.native
  def normalize(path: String): String = js.native
  def parse(identifier: String): ResolveParseResult | Null = js.native
  def resolve(context: ResolveContext, path: String, request: String, callback: LoggingCallbackWrapper): js.Any = js.native
  def resolveSync(context: ResolveContext, path: String, request: String): String = js.native
}

