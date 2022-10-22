package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.TypeArgumentMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "PullInstantiatedTypeReferenceSymbol")
@js.native
open class PullInstantiatedTypeReferenceSymbol protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.PullInstantiatedTypeReferenceSymbol {
  def this(
    referencedTypeSymbol: typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol,
    _typeParameterArgumentMap: TypeArgumentMap,
    isInstanceReferenceType: Boolean
  ) = this()
  
  /* CompleteClass */
  override def getAllowedToReferenceTypeParameters(): js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeParameterSymbol] = js.native
  
  /* CompleteClass */
  override def getIsSpecialized(): Boolean = js.native
  
  /* CompleteClass */
  override def getTypeParameterArgumentMap(): TypeArgumentMap = js.native
}
object PullInstantiatedTypeReferenceSymbol {
  
  @JSImport("typescript-services", "PullInstantiatedTypeReferenceSymbol")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def create(
    resolver: typingsJapgolly.typescriptServices.TypeScript.PullTypeResolver,
    `type`: typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol,
    typeParameterArgumentMap: TypeArgumentMap
  ): typingsJapgolly.typescriptServices.TypeScript.PullInstantiatedTypeReferenceSymbol = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(resolver.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], typeParameterArgumentMap.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.PullInstantiatedTypeReferenceSymbol]
}
