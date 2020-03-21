package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.InstantiableSymbol
import typingsJapgolly.typescriptServices.TypeScript.TypeArgumentMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PullInstantiationHelpers")
@js.native
object PullInstantiationHelpers extends js.Object {
  @js.native
  class MutableTypeArgumentMap protected ()
    extends typingsJapgolly.typescriptServices.TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap {
    def this(typeParameterArgumentMap: TypeArgumentMap) = this()
  }
  
  def cleanUpTypeArgumentMap(
    symbol: InstantiableSymbol,
    mutableTypeArgumentMap: typingsJapgolly.typescriptServices.TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap
  ): Unit = js.native
  def createTypeParameterArgumentMap(
    typeParameters: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeParameterSymbol],
    typeArguments: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol]
  ): TypeArgumentMap = js.native
  def getAllowedToReferenceTypeParametersFromDecl(decl: typingsJapgolly.typescriptServices.TypeScript.PullDecl): js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeParameterSymbol] = js.native
  def instantiateTypeArgument(
    resolver: typingsJapgolly.typescriptServices.TypeScript.PullTypeResolver,
    symbol: InstantiableSymbol,
    mutableTypeParameterMap: typingsJapgolly.typescriptServices.TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap
  ): Unit = js.native
  def twoTypesAreInstantiationsOfSameNamedGenericType(
    type1: typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol,
    type2: typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol
  ): Boolean = js.native
  def updateMutableTypeParameterArgumentMap(
    typeParameters: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeParameterSymbol],
    typeArguments: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol],
    mutableMap: typingsJapgolly.typescriptServices.TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap
  ): Unit = js.native
  def updateTypeParameterArgumentMap(
    typeParameters: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeParameterSymbol],
    typeArguments: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol],
    typeParameterArgumentMap: TypeArgumentMap
  ): TypeArgumentMap = js.native
}

