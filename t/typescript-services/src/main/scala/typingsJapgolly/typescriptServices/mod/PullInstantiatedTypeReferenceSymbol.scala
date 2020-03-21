package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.TypeArgumentMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PullInstantiatedTypeReferenceSymbol")
@js.native
class PullInstantiatedTypeReferenceSymbol protected ()
  extends typingsJapgolly.typescriptServices.TypeScript.PullInstantiatedTypeReferenceSymbol {
  def this(
    referencedTypeSymbol: typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol,
    _typeParameterArgumentMap: TypeArgumentMap,
    isInstanceReferenceType: Boolean
  ) = this()
}

/* static members */
@JSImport("typescript-services", "PullInstantiatedTypeReferenceSymbol")
@js.native
object PullInstantiatedTypeReferenceSymbol extends js.Object {
  def create(
    resolver: typingsJapgolly.typescriptServices.TypeScript.PullTypeResolver,
    `type`: typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol,
    typeParameterArgumentMap: TypeArgumentMap
  ): typingsJapgolly.typescriptServices.TypeScript.PullInstantiatedTypeReferenceSymbol = js.native
}

