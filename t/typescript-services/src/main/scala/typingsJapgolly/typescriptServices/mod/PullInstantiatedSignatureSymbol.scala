package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.TypeArgumentMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "PullInstantiatedSignatureSymbol")
@js.native
open class PullInstantiatedSignatureSymbol protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.PullInstantiatedSignatureSymbol {
  def this(
    rootSignature: typingsJapgolly.typescriptServices.TypeScript.PullSignatureSymbol,
    _typeParameterArgumentMap: TypeArgumentMap
  ) = this()
  
  /* CompleteClass */
  override def getAllowedToReferenceTypeParameters(): js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeParameterSymbol] = js.native
  
  /* CompleteClass */
  override def getIsSpecialized(): Boolean = js.native
  
  /* CompleteClass */
  override def getTypeParameterArgumentMap(): TypeArgumentMap = js.native
}
