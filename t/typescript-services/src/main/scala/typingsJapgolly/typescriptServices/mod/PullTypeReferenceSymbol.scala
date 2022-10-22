package typingsJapgolly.typescriptServices.mod

import typingsJapgolly.typescriptServices.TypeScript.TypeArgumentMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "PullTypeReferenceSymbol")
@js.native
open class PullTypeReferenceSymbol protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.PullTypeReferenceSymbol {
  def this(referencedTypeSymbol: typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol) = this()
  
  /* CompleteClass */
  override def getAllowedToReferenceTypeParameters(): js.Array[typingsJapgolly.typescriptServices.TypeScript.PullTypeParameterSymbol] = js.native
  
  /* CompleteClass */
  override def getIsSpecialized(): Boolean = js.native
  
  /* CompleteClass */
  override def getTypeParameterArgumentMap(): TypeArgumentMap = js.native
}
object PullTypeReferenceSymbol {
  
  @JSImport("typescript-services", "PullTypeReferenceSymbol")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def createTypeReference(`type`: typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol): typingsJapgolly.typescriptServices.TypeScript.PullTypeReferenceSymbol = ^.asInstanceOf[js.Dynamic].applyDynamic("createTypeReference")(`type`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.typescriptServices.TypeScript.PullTypeReferenceSymbol]
}
