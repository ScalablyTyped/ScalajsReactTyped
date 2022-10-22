package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.InstantiableSymbol
import typingsJapgolly.typescriptServices.TypeScript.TypeArgumentMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PullInstantiationHelpers {
  
  @JSImport("typescript-services", "PullInstantiationHelpers")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typescript-services", "PullInstantiationHelpers.MutableTypeArgumentMap")
  @js.native
  open class MutableTypeArgumentMap protected ()
    extends StObject
       with typingsJapgolly.typescriptServices.TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap {
    def this(typeParameterArgumentMap: TypeArgumentMap) = this()
    
    /* CompleteClass */
    var createdDuplicateTypeArgumentMap: Boolean = js.native
    
    /* CompleteClass */
    override def ensureTypeArgumentCopy(): Unit = js.native
    
    /* CompleteClass */
    var typeParameterArgumentMap: TypeArgumentMap = js.native
  }
  
  inline def cleanUpTypeArgumentMap(
    symbol: InstantiableSymbol,
    mutableTypeArgumentMap: typingsJapgolly.typescriptServices.TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("cleanUpTypeArgumentMap")(symbol.asInstanceOf[js.Any], mutableTypeArgumentMap.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def createTypeParameterArgumentMap(
    typeParameters: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeParameterSymbol],
    typeArguments: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol]
  ): TypeArgumentMap = (^.asInstanceOf[js.Dynamic].applyDynamic("createTypeParameterArgumentMap")(typeParameters.asInstanceOf[js.Any], typeArguments.asInstanceOf[js.Any])).asInstanceOf[TypeArgumentMap]
  
  inline def getAllowedToReferenceTypeParametersFromDecl(decl: typingsJapgolly.typescriptServices.TypeScript.PullDecl): js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeParameterSymbol] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllowedToReferenceTypeParametersFromDecl")(decl.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeParameterSymbol]]
  
  inline def instantiateTypeArgument(
    resolver: typingsJapgolly.typescriptServices.TypeScript.PullTypeResolver,
    symbol: InstantiableSymbol,
    mutableTypeParameterMap: typingsJapgolly.typescriptServices.TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiateTypeArgument")(resolver.asInstanceOf[js.Any], symbol.asInstanceOf[js.Any], mutableTypeParameterMap.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def twoTypesAreInstantiationsOfSameNamedGenericType(
    type1: typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol,
    type2: typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("twoTypesAreInstantiationsOfSameNamedGenericType")(type1.asInstanceOf[js.Any], type2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def updateMutableTypeParameterArgumentMap(
    typeParameters: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeParameterSymbol],
    typeArguments: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol],
    mutableMap: typingsJapgolly.typescriptServices.TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateMutableTypeParameterArgumentMap")(typeParameters.asInstanceOf[js.Any], typeArguments.asInstanceOf[js.Any], mutableMap.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateTypeParameterArgumentMap(
    typeParameters: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeParameterSymbol],
    typeArguments: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol],
    typeParameterArgumentMap: TypeArgumentMap
  ): TypeArgumentMap = (^.asInstanceOf[js.Dynamic].applyDynamic("updateTypeParameterArgumentMap")(typeParameters.asInstanceOf[js.Any], typeArguments.asInstanceOf[js.Any], typeParameterArgumentMap.asInstanceOf[js.Any])).asInstanceOf[TypeArgumentMap]
}
